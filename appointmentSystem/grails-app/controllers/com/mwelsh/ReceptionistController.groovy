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
}
