<?php
	include "mysql/connect.php";

	$name = $_POST["name"];
	$stock = $_POST["stock"];
	$price = $_POST["price"];
	$id = $_POST["id"];

	$query = "update product set name = '$name', stock = $stock, price= $price where id = $id";

	if($db->query($query) == false){
		$err = "data cannot updated";
	}

	$db->close();
	header("location:index.php?err=".$err);

?>