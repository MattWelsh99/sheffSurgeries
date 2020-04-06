package com.mwelsh

class Doctor {

	String doctorName
	String qualifications
	String position
	String doctorEmail
	String password
	String doctorOffice
	String doctorPhone
	String bio

	static hasMany = [prescription:Prescription, appointment:Appointment, nurse:Nurse, patient:Patient, surgery:Surgery]
	static belongsTo = [Nurse, Patient]

    static constraints = {

	doctorName nullable:false, blank:false
	qualifications nullable:false, blank:false
	position nullable:false, blank:false
	doctorEmail nullable:false, blank:false, email:true
	password nullable:false, blank:false, unique:true
	doctorOffice nullable:false, blank:false
	doctorPhone nullable:false, blank:false
	bio nullable:false, blank:false, widget:'textarea'
    }
}
