package com.mwelsh

class Prescription {

	String pharmacy
	long prescripNumber
	String medicine
	String totalCost
	Date dateIssued
	Boolean patientPaying

    static constraints = {

	pharmacy nullable:false, blank:false
	prescripNumber nullable:false, blank:false
	medicine nullable:false, blank:false
	totalCost nullable:false, blank:false, scale:2
	dateIssued nullable:false, blank:false
	patientPaying nullable:false, blank:false
	
	
    }
}
