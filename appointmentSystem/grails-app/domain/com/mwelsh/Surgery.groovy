package com.mwelsh

class Surgery {


	String name
	String address
	String postcode
	String telephone
	int numberOfPatients
	String description
	String openingTime

	String toString(){
	return name
	}

	static hasMany = [receptionists:Receptionist, appointments:Appointment, nurses:Nurse, patients:Patient, doctors:Doctor]
	static belongsTo = [Patient]	

    static constraints = {

	name nullable:false, blank:false
	address nullable:false, blank:false
	postcode nullable:false, blank:false
	telephone nullable:false, blank:false
	numberOfPatients nullable:false, blank:false, max:50
	description nullable:false, blank:false, widget:'textarea', maxSize:5000
	openingTime nullable:false, blank:false


    }
}
