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

}
