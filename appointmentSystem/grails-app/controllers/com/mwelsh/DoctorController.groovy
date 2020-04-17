package com.mwelsh

class DoctorController {

    static scaffold = Doctor

	def login(){


	}

	def validate(){

	def user = Doctor.findByDoctorEmail(params.doctorEmail)

	if(user && user.password == params.password){

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

	def prescriptionProps = Prescription.metaClass.properties*.name
	
	def prescriptions = Prescription.withCriteria {
	"${params.queryType}"{
	params.each{field, value ->
	if(prescriptionProps.grep(field)&& value){
	ilike(field, value)
				}
			}
		}
	}
	return [prescriptions: prescriptions]
	render view:'advResults'
	}


}
