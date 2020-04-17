<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Doctor - Search </title>
</head>
<body>

<div class="row">
	<h1>Doctor Search</h1>
	<br>
	<formset>
		<legend>Advance Search for Prescriptions</legend>
	<table>
		<g:form action="advResults">
	<br>
	<tr>
	<td>Medicine</td>
	<td><g:textField name="medicine"/></td>
	</tr>

	<tr>
	<td>Days Of Supply</td>
	<td><g:textField name="daysOfSupply"/></td>
	</tr>

	<tr>
	<td>Total Cost</td>
	<td><g:textField name="totalCost"/></td>
	</tr>

	<tr>
	<td>QueryType</td>
	<td><g:radioGroup name="queryType" labels="['And','Or']" values="['and','or']" value ="and">${it.radio} ${it.label} </g:radioGroup>
	</td>
	</tr>

	<tr>
	<td/>
	<td>

	<g:submitButton name="advSearch" value="Search"/></td>
	</tr>
	</g:form>
	</table>
	<formset>
		</div>
	</body>
	</html>
	
