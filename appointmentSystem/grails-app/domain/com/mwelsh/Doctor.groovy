package com.mwelsh

class Doctor {

	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	long doctorPhone
	String bio

	static hasMany = [prescription:Prescription, appointment:Appointment, nurse:Nurse, patient:Patient]
	static belongsTo = [Nurse, Patient]

    static constraints = {

	fullName nullable:false, blank:false
	qualification nullable:false, blank:false
	position nullable:false, blank:false
	doctorEmail nullable:false, blank:false, email:true
	password nullable:false, blank:false, unique:true
	doctorOffice nullable:false, blank:false
	doctorPhone nullable:false, blank:false
	bio nullable:false, blank:false, widget:'textarea'
    }
}
