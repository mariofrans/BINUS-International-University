<?php
session_start();

if(isset($_SESSION["id"])){
	header("location:index.php");
}
?>

<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
</head>
<body>
	<form action="doLogin.php" method="post">
	<table border="1">
		<tr>
			<td>Email</td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="password"></td>
		</tr>
		<tr>
			<TD><input type="submit" name=""></TD>
			<TD><input type="reset" name=""></TD>
		</tr>
		<tr>
			<td colspan="2" style="color: red">
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