package com.mwelsh

class Appointment {

	Date appDate
	String appTime
	String appDuration
	String roomNumber

	static hasMany = [surgery:Surgery, doctor:Doctor]
	static belongsTo = [Surgery, Patient]

    static constraints = {

	appDate nullable:false, blank:false
	appTime nullable:false, blank:false
	appDuration nullable:false, blank:false
	roomNumber nullable:false, blank:false
    }
}
