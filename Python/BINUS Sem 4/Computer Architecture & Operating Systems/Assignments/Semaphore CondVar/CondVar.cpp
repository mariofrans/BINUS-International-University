#include <iostream>
#include <thread>
#include <mutex>
#include <condition_variable>
using namespace std;

std::condition_variable cv;
std::mutex m;
long battery = 0;

void charge(int count)
{
    std::lock_guard<mutex> lg(m);
    battery+=count;
    cout << "Battery level is: " << battery << endl;
    cv.notify_one();
}

void use(int count)
{
    std::unique_lock<mutex> ul(m);
    cv.wait(ul, [] { return (battery!=0) ? true : false; });
    if(battery>count)
    {
        battery-=count;
    }
    else
    {
        cout << "Battery level not enough!" << endl;
    }
    cout << "Battery level is: " << battery << endl;
}

int main()
{
    std::thread t1(use, -1);
    std::thread t2(charge, 1);
    t1.join();
    t2.join();
    return 0;
}