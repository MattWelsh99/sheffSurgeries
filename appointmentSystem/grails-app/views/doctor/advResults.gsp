<!doctype html>
<html>
<head>
	<meta name="layout" content="main"/>
	<title>Doctor - Advance Search</title>

	<asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>

<div class ="row">
	<h1>Doctor</h1>
	<br>
	<h3>Search Results</h3>
	<br>

<p Searched for Prescriptions matching <em>${term}</em>.
	found <strong>${prescriptions.size()}</strong> prescriptions.
</p>

<ul>
<g:each var="prescription" in="${prescriptions}">

<li><g:link controller="prescription" action="show"
id="${prescription.id}">${prescription.medicine}</g:link></li>

</g:each>
</ul>

<g:link action='advSearch'>Search Again</g:link>
	</div>
</body>
</html>
