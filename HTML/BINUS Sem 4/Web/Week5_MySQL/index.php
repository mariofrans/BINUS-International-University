<?php
ini_set('display_errors', 1);
error_reporting(~0);
?>

<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
	<?php
		include "mysql/connect.php"
	?>
	<a href="productForm.php"> Create New Data >> </a>
	<table border="1">
		<tr>
			<td>ID</td>
			<td>Name</td>
			<td>Stock</td>
			<td>Price</td>
			<td colspan="2">Action</td>
		</tr>
		<?php
			$result = $db->query("select * from product");
			while($row = $result -> fetch_row()){
				//print_r($row);
		?>
		<tr>
			<td><?php echo $row[0] ?></td>
			<td><?=$row[1]?></td>
			<td><?=$row[2]?></td>
			<td><?=$row[3]?></td>
			<td><a href="productForm.php?id=<?=$row[0]?>">Update</a></td>
			<td><a href="doDelete.php?id=<?=$row[0]?>">Delete</a></td>
		</tr>
		<?php
			}

			$db->close();
		?>
	</table>
</body>
</html>