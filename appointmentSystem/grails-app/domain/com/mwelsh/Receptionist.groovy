package com.mwelsh

class Receptionist {

	String recepName
	String recepEmail
	String recepUsername
	String recepPassword
	String recepPhone

	Surgery surgery

	String toString(){
	return recepName
	}

	static belongsTo = [Surgery]

    static constraints = {

	recepName blank:false, nullable:false
	recepEmail blank:false, nullable:false, email:true
	recepUsername blank:false, nullable:false
	recepPassword blank:false, nullable:false
	recepPhone blank:false, nullable:false

    }
}
