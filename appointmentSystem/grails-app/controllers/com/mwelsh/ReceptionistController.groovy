package com.mwelsh

class ReceptionistController {

    static scaffold = Receptionist

	def login(){


	}

	def validate(){

	def user = Receptionist.findByRecepUsername(params.recepUsername)

	if(user && user.recepPassword == params.recepPassword){

	session.user = user
	render view:'home'
	}

	else{

	flash.message = "invalid username and password."
	render view:'login'
	

	}
	}

	def logout = {

	session.user = null
	redirect(url:'/')
	}


	def advSearch(){
	render view:'advSearch'
	}

	def advResults(){

	def patientProps = Patient.metaClass.properties*.name
	
	def patients = Patient.withCriteria {
	"${params.queryType}"{
	params.each{field, value ->
	if(patientProps.grep(field)&& value){
	ilike(field, value)
				}
			}
		}
	}
	return [patients: patients]
	render view:'advResults'
	}



}
