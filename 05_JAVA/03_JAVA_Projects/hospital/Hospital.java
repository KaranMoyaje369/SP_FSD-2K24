package com.hospital;

public class Hospital {
	
	public static void main(String[] args) {
		System.out.println("WELCOME.........!");
		General obj = new General();
		obj.List();
		General doc = new Doctor();
		doc.check();
		doc.details();
	}

}


// Output :


// WELCOME.........!
// The List Of Doctors We Have Is : 
// 1= NEUROLGIST
// 2= OPTHOMOLOGIST
// 3= DENTIST
// 4= DERMATOLOGIST
// 5= CARDIOLOGIST
// 6= GENERAL SERGON
// 7= ENT
// ENTER PATIENT NAME : 
// Karan Moyaje
// ENTER YOUR SEX : 
// Male
// ENTER PATIENT AGE : 
// 22
// THANK YOU FOR ENTERING YOUR DETAILS
// HERE IS A LIST OF DOCTORS WITH THEIR DESIGNATION : 
// Neurologist : Devasena
// Othomologist : Kattapa
// Dentist : Bahubali
// Dermotologist : Balladeva
// Cardiologist : Keerthi
// General Surgon : Suresh
// ENT : Rajmohan
// SELECT THE TYPE OF DOCTOR YOU WANT TO CONSULT(AS PROVIDED IN THE ABOVE IST )
// DERMATOLOGIST
// YOUR APPOINTMENT WITH Balladeva IS ABOUT TO READY... PLEASE WAIT
// THANK YOU FOR WAITING YOUR APPOINTMENT IS READY



