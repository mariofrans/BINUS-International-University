<html>
	<head></head>
	<body>
		<form action="doCreate.php" method="post">
		<table border="1">
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" readonly /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name"  /></td>
			</tr>
			<tr>
				<td>Stock</td>
				<td><input type="text" name="stock"  /></td>
			</tr>
			<tr>
				<td>Price</td>
				<td><input type="text" name="price"  /></td>
			</tr>
			<tr>
				<td><input type="reset"   /></td>
				<td><input type="submit"  /></td>
			</tr>
			<tr>
				<td colspan="2" style="color:red">
					<?=$_GET["err"]?>

				</td>
			</tr>
		</table>
		</form>
	</body>
</html>