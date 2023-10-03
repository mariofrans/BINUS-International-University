
//  ShapesExercise.cpp
//  ProjectSem2
//
//  Created by Christensen Mario Frans on 05/03/20.
//  Copyright © 2020 Christensen Mario Frans. All rights reserved.
//

//Top Left
//#include <iostream>
//using namespace std;
//
//int main()
//{
//    int rows;
//
//    cout << "Enter number of rows: ";
//    cin >> rows;
//
//    for(int i = rows; i >= 1; --i)
//    {
//        for(int j = 1; j <= i; ++j)
//        {
//            cout << "* ";
//        }
//        cout << endl;
//    }
//    return 0;
//}

//Bottom Left
//#include <iostream>
//using namespace std;
//
//int main()
//{
//    int rows;
//    
//    cout << "Enter number of rows:";
//    cin >> rows;
//    
//    for (int i = 1; i <= rows; i++)
//    {
//        for(int j = 1; j<= i; j++ )
//        {
//            cout << "* ";
//        }
//        cout << "\n";
//    }
//    return 0;
//}

//Bottom Right
//#include <iostream>
//using namespace std;

//int main()
//{
//    int rows;
    
//    cout << "Enter number of rows:";
//    cin >> rows;
    
//    for(int i = rows; i >= 1; i--)
//    {
//        for(int j = 1; j < i; j++)
//        {
//            cout << " ";
//        }
//        for (int k= rows; k >= i; k--)
//        {
//            cout << "*";
//        }
//       cout << "\n";
//   }
//    return 0;
//}

//Top Right
//#include <iostream>
//using namespace std;

//int main()
//{
//    int rows;
    
//    cout << "Enter number of rows:";
//    cin >> rows;
    
//    for(int i = rows; i >= 1; i--)
//    {
//        for(int j = rows; j > i; j--)
//        {
//            cout << " ";
//        }
//        for (int k= 1; k <= i; k++)
//        {
//            cout << "*";
//        }
//       cout << "\n";
//   }
//    return 0;
//}

//Top Equilateral
//#include <iostream>
//using namespace std;

//int main()
//{
//    int rows;
    
//    cout << "Enter number of rows:";
//    cin >> rows;
    
//    for(int i = rows; i >= 1; i--)
//    {
//        for(int j = 1; j < i; j++)
//        {
//            cout << " ";
//        }
//       for (int k= rows; k >= i; k--)
//        {
//            cout << "* ";
//        }
//       cout << "\n";
//   }
//    return 0;
//}

//Bottom Equilateral
//#include <iostream>
//using namespace std;

//int main()
//{
//    int rows;
    
//    cout << "Enter number of rows:";
//    cin >> rows;
    
//    for(int i = rows; i >= 1; i--)
//    {
//        for(int j = rows; j > i; j--)
//        {
//            cout << " ";
//        }
//        for (int k= 1; k <= i; k++)
//        {
//            cout << "* ";
//        }
//       cout << "\n";
//   }
//    return 0;
//}

//Pascal Triangle
//#include <iostream>
//using namespace std;

//int main()
//{
//    int rows, coef = 1;

//    cout << "Enter number of rows: ";
//    cin >> rows;

//    for(int i = 0; i < rows; i++)
//    {
//        for(int space = 1; space <= rows-i; space++)
//            cout <<"  ";
//
//        for(int j = 0; j <= i; j++)
//        {
//            if (j == 0 || i == 0)
//                coef = 1;
//            else
//                coef = coef*(i-j+1)/j;
//
//            cout << coef << "   ";
//        }
//        cout << endl;
//    }
//   return 0;
//}


//Bottom Right
//#include <iostream>
//using namespace std;

//int main()
//{
//    int rows;
    
//    cout << "Enter number of rows:";
//    cin >> rows;
    
//    for(int i = rows; i >= 1; i--)
//    {
//        for(int j = 1; j < i; j++)
//        {
//            cout << " ";
//        }
//        for (int k= rows; k >= i; k--)
//        {
//            cout << "*";
//        }
//       cout << "\n";
//   }
//    return 0;//}

