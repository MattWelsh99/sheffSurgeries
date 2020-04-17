package com.mwelsh

class Appointment {

	Date appDate
	String appTime
	int appDuration
	String roomNumber

	Patient patient
	Doctor doctor

	String toString(){
	return appDate
	}
	
	static hasMany = [surgerys:Surgery]
	static belongsTo = [Surgery]

    static constraints = {

	appDate nullable:false, blank:false
	appTime nullable:false, blank:false
	appDuration nullable:false, blank:false
	roomNumber nullable:false, blank:false
	patient nullable:true, blank:true
    }
}
