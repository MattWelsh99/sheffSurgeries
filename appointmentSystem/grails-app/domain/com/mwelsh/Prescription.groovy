package com.mwelsh

class Prescription {

	String pharmacyName
	int prescripNumber
	String medicine
	String totalCost
	int daysOfSupply
	Date dateIssued
	Boolean patientPaying

	Doctor doctor
	Patient patient

	String toString(){
	return medicine
	}

	static belongsTo = [Doctor]

    static constraints = {

	pharmacyName nullable:false, blank:false
	prescripNumber nullable:false, blank:false
	medicine nullable:false, blank:false
	totalCost nullable:false, blank:false, scale:2
	daysOfSupply nullable:false, blank:false
	dateIssued nullable:false, blank:false
	patientPaying nullable:false, blank:false
	
	
    }
}
