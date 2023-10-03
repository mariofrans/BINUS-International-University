<?php
	include "mysql/connect.php";

	$id = $_GET["id"];
	echo $id;

	

	if ($db->query("delete from product where id=".$id) == false){
		$err = "Data cannot deleted";
	}

	header("location:index.php?err=".$err);

	$db->close();

?>