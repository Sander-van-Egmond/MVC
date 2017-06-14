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
<div id="everything"><%
	List content = (List)request.getAttribute("bakjes");
%>
<div class="kahala alleBakjes"><%out.print(content.get(13)); %></div>
<div class="alleBakjes">
	<div class="spelerBakjes">
		<button class="bakje"><%out.print(content.get(0)); %></button>
		<button class="bakje"><%out.print(content.get(1)); %></button>
		<button class="bakje"><%out.print(content.get(2)); %></button>
		<button class="bakje"><%out.print(content.get(3)); %></button>
		<button class="bakje"><%out.print(content.get(4)); %></button>
		<button class="bakje"><%out.print(content.get(5)); %></button>

	</div>
	<div class="spelerBakjes">

		<button class="bakje"><%out.print(content.get(7)); %></button>
		<button class="bakje"><%out.print(content.get(8)); %></button>
		<button class="bakje"><%out.print(content.get(9)); %></button>
		<button class="bakje"><%out.print(content.get(10)); %></button>
		<button class="bakje"><%out.print(content.get(11)); %></button>
		<button class="bakje"><%out.print(content.get(12)); %></button>

	</div>
</div>
<button class = "kahala alleBakjes"><%out.print(content.get(6)); %></button>

</div>
</body>
</html>