package com.mwelsh

class Doctor {

	String fullName
	String qualifications
	String position
	String doctorEmail
	String password
	String doctorOffice
	String doctorPhone
	String bio

	Surgery surgery

	String toString(){
	return fullName
	}

	static hasMany = [prescriptions:Prescription, appointments:Appointment, nurses:Nurse, patients:Patient]
	static belongsTo = [Surgery]

    static constraints = {

	fullName nullable:false, blank:false
	qualifications nullable:false, blank:false
	position nullable:false, blank:false
	doctorEmail nullable:false, blank:false, email:true, unique:true
	password nullable:false, blank:false
	doctorOffice nullable:false, blank:false
	doctorPhone nullable:false, blank:false
	bio nullable:false, blank:false, widget:'textarea', maxSize:5000
    }
}
