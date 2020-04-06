package appointmentsystem

class BootStrap {

    def init = { servletContext ->

def DrHill = new com.mwelsh.Doctor(
doctorName:'James Hill', qualifications:'PHD', position:'Senior Doctor', doctorEmail:'DrHill@sheffsurgeries.co.uk', password:'password', doctorOffice:'D-9444', doctorPhone:'01623456789', bio:'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.').save()

def DrMacdonald = new com.mwelsh.Doctor(
doctorName:'Sarah Macdonald', qualifications:'MBChB', position:'GP, Surgeon', doctorEmail:'DrMacdonald@sheffsurgeries.co.uk', password:'secret222', doctorOffice:'D-9888', doctorPhone:'01111777', bio:'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.').save()

def CityHealthCentre = new com.mwelsh.Surgery(
name:'City Health Centre', address:'21 Marble Street, Sheffield', postcode:'S11 5TY', telephone:'0114555555', numberOfPatients:'50', description:'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.', openingTime:'09:00-17:00hrs').save()

def HallamHealth = new com.mwelsh.Surgery(
name:'Hallam Health', address:'5 Arundel Street, Sheffield', postcode:'S1 4FD', telephone:'011422222', numberOfPatients:'35', description:'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.', openingTime:'08:00-18:00hrs').save()

def Appointment1 = new com.mwelsh.Appointment(
appDate:new Date('11/04/2019'), appTime:'3:00pm', appDuration:'30 Minutes', roomNumber:'A-1111').save()

def Appointment2 = new com.mwelsh.Appointment(
appDate:new Date('26/05/2020'), appTime:'5:00pm', appDuration:'45 Minutes', roomNumber:'A-1234').save()

def TomRivers = new com.mwelsh.Patient(
patientName:'Tom Rivers', patientAddress:'2 One Way Street, Eckington', patientResidence:'Sheffield', patientDob:new Date('20/09/1988'), patientID:'E25555', dateRegistered:new Date('26/02/2018'), patientPhone:'01142224444', theAppointment:Appointment1).save()

def JakeWright = new com.mwelsh.Patient(
patientName:'Jake Wright', patientAddress:'21 Ocean Drive, Warsop', patientResidence:'Doncaster', patientDob:new Date('12/04/1998'), patientID:'F17553', dateRegistered:new Date('12/08/2019'), patientPhone:'02242229999', theAppointment:Appointment2).save()

def RobKingstone = new com.mwelsh.Receptionist(
recepName:'Rob Kingston', recepEmail:'r.kingson@email.com', recepUsername:'rking', recepPassword:'secret2019', recepPhone:'01142224445').save()

def DebbieClarke = new com.mwelsh.Receptionist(
recepName:'Debbie Clarke', recepEmail:'d.clarke@email.com', recepUsername:'dclarke', recepPassword:'hidden2019', recepPhone:'01142224447').save()

def SusanPeters = new com.mwelsh.Nurse(
nurseName:'Susan Peters', qualifications:'Registered General Nurse', nurseEmail:'s.peters@myemail.com', nurseOffice:'B-455', nursePhone:'01142224433').save()

def BeckyWelsh = new com.mwelsh.Nurse(
nurseName:'BeckyWelsh', qualifications:'Registered Senior Nurse', nurseEmail:'b.welsh@myemail.com', nurseOffice:'B-423', nursePhone:'01153337711').save()

def CityCentrePharmacy = new com.mwelsh.Prescription(
pharmacyName:'City Centre Pharmacy', prescripNumber:'56788', medicine:'Paracetomol', totalCost:'£5.90', dateIssued:new Date('25/05/2019'), patientPaying:true).save()

def HallamPharmacy = new com.mwelsh.Prescription(
pharmacyName:'Hallam Pharmacy', prescripNumber:'12345', medicine:'Ibuprofen', totalCost:'£3.20', dateIssued:new Date('17/02/2019'), patientPaying:false).save()
	




    }
    def destroy = {
    }
}
