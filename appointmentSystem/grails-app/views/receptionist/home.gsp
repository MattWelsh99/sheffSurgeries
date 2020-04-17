<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Receptionist Page</title>
</head>
<body>

<div id="content" role="main">

<div class="row">

<div class="first">

	<h3> Create a Patient </h3>
	<p> </p>

	<button type ="button" class="btn btn-link">
	<g:link controller="patient" action="create">Add Patient</g:link>
	</button>
</div>

<div class="second">

	<h3> Create a Doctor </h3>
	<p> </p>

	<button type ="button" class="btn btn-link">
	<g:link controller="doctor" action="create">Add Doctor</g:link>
	</button>
</div>

<div class="third">

	<h3> Create a Nurse </h3>
	<p> </p>

	<button type ="button" class="btn btn-link">
	<g:link controller="nurse" action="create">Add Nurse</g:link>
	</button>
</div>

<div class="fourth">

	<h3> Create a Receptionist </h3>
	<p> </p>

	<button type ="button" class="btn btn-link">
	<g:link controller="receptionist" action="create">Add Receptionist</g:link>
	</button>
</div>
</div>

<div class="row">

<div class="first">

	<h3> Assign Nurse to Doctor </h3>
	<p> </p>

	<button type ="button" class="btn btn-link">
	<g:link controller="nurse" action="index">Assign Nurse to a Doctor</g:link>
	</button>
</div>

<div class="second">

	<h3> Assign Patient to Doctor </h3>
	<p> </p>

	<button type ="button" class="btn btn-link">
	<g:link controller="patient" action="index">Assign Patient to a Doctor</g:link>
	</button>
</div>

</div>

<div class ="row">
<div class="first">

	<h3> Search for a Patient </h3>
	<p> </p>

	<button type ="button" class="btn btn-link">
	<g:link controller="receptionist" action="advSearch">Search for a Patient</g:link>
	</button>
</div>

</div>
</body>
</html>
