<%@ page language="java" import="java.util.*" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Let's play MANCALA!!!</title>
<link href="webUI.css" rel="stylesheet" type="text/css">
</head>
<body>
<form method="post" action="SelectBakje.do">
<div id="everything"><%
	List content = (List)request.getAttribute("bakjes");
%>
<div class="alleBakjes"><h2 class="kahala"><%out.print(content.get(13)); %></h2></div>
<div class="alleBakjes">
	<div class="spelerBakjes">
		<button class="bakje" name="bakje" type="submit" value="5p2"><%out.print(content.get(12)); %></button>
		<button class="bakje" name="bakje" type="submit" value="4p2"><%out.print(content.get(11)); %></button>
		<button class="bakje" name="bakje" type="submit" value="3p2"><%out.print(content.get(10)); %></button>
		<button class="bakje" name="bakje" type="submit" value="2p2"><%out.print(content.get(9)); %></button>
		<button class="bakje" name="bakje" type="submit" value="1p2"><%out.print(content.get(8)); %></button>
		<button class="bakje" name="bakje" type="submit" value="0p2"><%out.print(content.get(7)); %></button>

	</div>
	<div id="division"></div>
	<div class="spelerBakjes">

		<button class="bakje" name="bakje" type="submit" value="0p1"><%out.print(content.get(0)); %></button>
		<button class="bakje" name="bakje" type="submit" value="1p1"><%out.print(content.get(1)); %></button>
		<button class="bakje" name="bakje" type="submit" value="2p1"><%out.print(content.get(2)); %></button>
		<button class="bakje" name="bakje" type="submit" value="3p1"><%out.print(content.get(3)); %></button>
		<button class="bakje" name="bakje" type="submit" value="4p1"><%out.print(content.get(4)); %></button>
		<button class="bakje" name="bakje" type="submit" value="5p1"><%out.print(content.get(5)); %></button>

	</div>
</div>
<div class = "alleBakjes"><h2 class="kahala"><%out.print(content.get(6)); %></h2></div>

</div>
</form>
</body>
</html>