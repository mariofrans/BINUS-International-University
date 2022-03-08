<?php
	session_start();
	include "mysql/connect.php";

	$email = $_POST["email"];
	$password = $_POST["password"];

	$query = "select * from users where email = '$email' and password = md5('$password')";

	$result = $db->query($query);

	if($row = $result->fetch_row()){//data found
		$_SESSION["id"]= $row[0];
		$_SESSION["email"]= $row[1];
		
		header("location:index.php");
	}else{ // data not found
		$err = "Email and Password is not found";
		header("location:login.php?err=".$err);
	}

?>