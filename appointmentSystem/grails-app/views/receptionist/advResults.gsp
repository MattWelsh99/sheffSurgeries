<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Receptionist - Advance Search</title>

	<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

<div class ="row">
	<h1>Receptionist</h1>
	<br>
	<h3>Search Results</h3>
	<br>

<p Searched for Patients matching <em>${term}</em>.
	found <strong>${patients.size()}</strong> patients.
</p>

<ul>
<g:each var="patient" in="${patients}">

<li><g:link controller="patient" action="show"
id="${patient.id}">${patient.patientName}</g:link></li>

</g:each>
</ul>

<g:link action='advSearch'>Search Again</g:link>
	</div>
</body>
</html>
