<?php
	$db = new mysqli("localhost:33065","dev","seven","myclass");
		if ($db -> connect_errno) {
		  echo "Failed to connect to MySQL: " . $mysqli -> connect_error;
		  exit();
		}
?>
