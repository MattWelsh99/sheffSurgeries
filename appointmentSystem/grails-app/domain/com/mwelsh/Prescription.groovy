package com.mwelsh

class Prescription {

	String pharmacyName
	long prescripNumber
	String medicine
	String totalCost
	Date dateIssued
	Boolean patientPaying

	static hasMany = [doctor:Doctor, patient:Patient, surgery:Surgery]

    static constraints = {

	pharmacyName nullable:false, blank:false
	prescripNumber nullable:false, blank:false
	medicine nullable:false, blank:false
	totalCost nullable:false, blank:false, scale:2
	dateIssued nullable:false, blank:false
	patientPaying nullable:false, blank:false
	
	
    }
}
