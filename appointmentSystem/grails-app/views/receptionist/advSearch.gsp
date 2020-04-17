<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Receptionist - Search </title>
</head>
<body>

<div class="row">
	<h1>Patient Search</h1>
	<br>
	<formset>
		<legend>Advance Search for Patients</legend>
	<table>
		<g:form action="advResults">
	<br>
	<tr>
	<td>FullName</td>
	<td><g:textField name="patientName"/></td>
	</tr>

	<tr>
	<td>PatientID</td>
	<td><g:textField name="patientID"/></td>
	</tr>

	<tr>
	<td>Residence</td>
	<td><g:textField name="patientResidence"/></td>
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
	
