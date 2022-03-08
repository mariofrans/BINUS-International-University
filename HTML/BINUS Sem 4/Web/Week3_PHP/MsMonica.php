<?php

//phpinfo();

// 1. I/O
// 2. Selection syntax (if else, switch case)
// 3. Repetiotion Syntax ( for, for each, while)
// 4. connect to db
// 5. insert, update, delete, select data

$number1 = 10;
$number2 = 15;
$number3 = 11.5;
$str = "Web Development Class";
echo "Value of Number :".$number1."<br/>";


$arr1 = array(10,20,30,40);
$arr2 = array (1,2,"Hello", 8.0);
print_r($arr1);
echo "<br/>";
print_r($arr2);
echo "<br/>";

$arr3 = array("A" => 10, "B" => 5, 0 => 10);
print_r($arr3);
echo "<br/>";
echo $arr3["A"];

if($number1 > 5){
	echo "Number 1 is greater than 5";
}else{
	echo "Number 1 is not greater than 5";
}

// if (){

// }else if(){

// }else{

// }

switch ($number2) {
	case 5:
		echo "Number 2 is 5";
		break;
	
	default:
		echo "Default Section";
		break;
}


foreach ($arr1 as $key => $value) {
	echo "Key:".$key."<br/>";
	echo "Value:".$value."<br/>";
}

for ($i=0; $i < 10 ; $i++) { 
	echo $i."<br/>";
}

$i=0;
while($i < 10){
	echo $i."<br/>";
	$i++;
}




?>







































