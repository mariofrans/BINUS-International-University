<?php
ini_set('display_errors', 1);
error_reporting(~0);
	

	$name = $_POST["name"];
	$stock = $_POST["stock"];
	$price = $_POST["price"];

	if ($name == ""){
		$err = "Please Fill In The name";
	}

	if ($stock == ""){
		$err = "Please Fill In The stock";
	}

	if ($price == ""){
		$err = "Please Fill In The price";
	}
	//more validation


	if ($err == ""){
		include "mysql/connect.php";

		$sql = "insert into product(name,stock,price) values('".$name."',$stock,$price)";

		if($db->query($sql)==false){
			$err = "Data cannot created";
		}
		header("location:index.php?err=".$err);

		$db->close();

	}else{
	
		header("location:productForm.php?err=".$err);

	}

	
?>