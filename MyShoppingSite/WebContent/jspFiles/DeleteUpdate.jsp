<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
	table, th, td 
	{
		border: 3px solid black;
		border-collapse: collapse;
		padding: 10px;
		text-align: center;
	}
	#check{text-align="center";}
	}
</style>
<title>Update And Delete</title>
<script>
	function addRow()
	{
    	var tbl = document.getElementById("productTable");
    	var lastRow = tbl.rows.length;
    	var iteration = lastRow;
    	var row = tbl.insertRow(lastRow);
    	
    	//Product id
    	var cellPID = row.insertCell(0);
        var el = document.createElement('input');
        el.type = 'text';
        el.name = 'pid' + iteration;
        el.id = 'pid' + iteration;
        el.className = 'textbox';
        el.runat = 'server';
        cellPID.appendChild(el);
        
        //Product Description
        var cellPD = row.insertCell(1);
        var el = document.createElement('input');
        el.type = 'text';
        el.name = 'pd' + iteration;
        el.id = 'pd' + iteration;
        el.className = 'textbox';
        el.runat = 'server';
        cellPD.appendChild(el);
        
        //Price
        var cellPrice = row.insertCell(2);
        var el = document.createElement('input');
        el.type = 'text';
        el.name = 'pr' + iteration;
        el.id = 'pr' + iteration;
        el.className = 'textbox';
        el.runat = 'server';
        cellPrice.appendChild(el);
        
        var cellCheck = row.insertCell(3);
        var el = document.createElement('input');
        el.type = 'checkbox';
        el.name = 'ck' + iteration;
        el.id = 'ck' + iteration;
        el.className = 'textbox';
        el.runat = 'server';
        cellCheck.appendChild(el);
        request.setAttribute("pTable",tb1);
	}
</script>
</head>
<body>
<form action="/MyShoppingSite/DeleteUpdateServlet" method="post">
<h1 align="center">Add/Update/Delete Product</h1><br><br>
<table id="productTable" align="center">
	<tr>
		<th>Product Id</th>
		<th>Product Name</th>
		<th>Price</th>
		<th>Delete/Update</th>
	</tr>
	<tr>
		<td><input type="text" name ="pid1" id ="pid" value=""></td>
		<td><input type="text" name="pd1" id="pd1" value=""></td>
		<td><input type="text" name="pr1" id="pr1" value=""></td>
		<td><input type="checkbox" name="ck1" id="ck1" value=""></td>
	</tr>
</table>
<p align="center"><br><br>
            <input type="button" value="Add Line" onclick="addRow()" /><br><br>
            <input type="submit" value="UPDATE">
</p>
</form>
</body>
</html>