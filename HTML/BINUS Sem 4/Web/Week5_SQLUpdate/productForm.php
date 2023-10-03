
<?php
session_start();

if(isset($_SESSION["id"])== false){
	header("location:login.php");
}
?>

<html>
	<head></head>
	<body>
		<?php
			$id = "";
			$name = "";
			$stock = "";
			$price = "";
			if (isset($_GET["id"])){
				include "mysql/connect.php";

				$result = $db->query("select * from product where id=".$_GET["id"]);

				if ($row = $result->fetch_row()){ // data found
					$id = $row[0];
					$name = $row[1];
					$stock = $row[2];
					$price = $row[3];
				}else{ // data not found
					header("location:index.php");	
				}
				$action = "doUpdate.php";
			}else{
				$action = "doCreate.php";
			}
			
		?>
		<form action="<?=$action?>" method="post">
		<table border="1">
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" readonly value="<?=$id?>" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" value="<?=$name?>" /></td>
			</tr>
			<tr>
				<td>Stock</td>
				<td><input type="text" name="stock" value="<?=$stock?>" /></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="price" value="<?=$price?>" /></td>
			</tr>
			<tr>
				<td><input type="reset"   /></td>
				<td><input type="submit"  /></td>
			</tr>
			<tr>
				<td colspan="2" style="color:red">
					<?php
					if (isset($_GET["err"])){
						echo $_GET["err"];
					}

					?>

				</td>
			</tr>
		</table>
		</form>
	</body>
</html>