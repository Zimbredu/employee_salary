package br.com.java.employee.service;

import br.com.java.employee.model.Employee;

public class HourlyWorker extends Employee {
	

	private double wage;
	private double hours;
	
	//Contrutor para a classe HourlyWorker.
	public HourlyWorker(String firstName, String lastName, double wagePerHour, double hoursWorked) {
		super(firstName, lastName);
		setWage(wagePerHour);
		setHours(hoursWorked);		
		
	}
	
	//Verifica a remuneração.
	private void setWage(double wagePerHour) {
		wage = (wagePerHour > 0 ? wagePerHour : 0);
		
	}
	
	//Verifica as horas trabalhadas.
	private void setHours(double hoursWorked) {
		hours = (hoursWorked > 0 && hoursWorked <= 220 ? hoursWorked : 0);
		
	}

	@Override
	public double earnings() {
		
		return wage * hours;
	}
   @Override
public String toString() {
	
	return "Hourly worker: " +super.toString();
}
}
