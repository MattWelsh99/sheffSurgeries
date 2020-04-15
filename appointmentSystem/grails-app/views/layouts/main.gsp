<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>

	
</head>

<body style="background-color:powderblue;">

	<div class ="row">
		<asset:image src="banner.jpg"/>
		<h3>Receptionist Login:</h3><g:loginToggle/>
		<h3>Doctor Login:</h3><g:doctorloginToggle/>
	</div>


<g:layoutBody/>

<footer class ="page-footer">
	<div class> Sheffield Surgeries 2020 </div>
</footer>

<div id="spinner" class="spinner" style="display:none;">
    <g:message code="spinner.alt" default="Loading&hellip;"/>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
