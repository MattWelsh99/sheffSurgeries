<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
	<asset:stylesheet src="home.css"/>
    <title>Doctor Page</title>
</head>
<body>

<div id="content" role="main">

<div class="row">

<div class="first">

	<h3> Create a Prescription </h3>
	<p> </p>

	<button type ="button" class="btn btn-link">
	<g:link controller="prescription" action="create">Add Prescription</g:link>
	</button>
</div>

<div class="second">

	<h3> Display Prescriptions </h3>
	<p> </p>

	<button type ="button" class="btn btn-link">
	<g:link controller="prescription" action="index">Display Prescriptions</g:link>
	</button>
</div>

<div class="third">

	<h3> Display a Patient </h3>
	<p> </p>

	<button type ="button" class="btn btn-link">
	<g:link controller="patient" action="index">Display Patients</g:link>
	</button>
</div>

<div class="fourth">

	<h3> Display a appointment </h3>
	<p> </p>

	<button type ="button" class="btn btn-link">
	<g:link controller="appointment" action="index">Display Appointments</g:link>
	</button>
</div>

</div>


<div class ="row">
<div class="first">

	<h3> Search for a Prescription </h3>
	<p> </p>

	<button type ="button" class="btn btn-link">
	<g:link controller="doctor" action="advSearch">Search for a Prescription</g:link>
	</button>
</div>

</div>
</body>
</html>
