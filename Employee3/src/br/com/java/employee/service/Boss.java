package br.com.java.employee.service;

import br.com.java.employee.model.Employee;

public class Boss extends Employee {
	private double weeklySalary;

	// Contrutor para a classe Boss.
	public Boss(String firstName, String lastName, double salary) {
		super(firstName, lastName);// Chama o construtor da superClasse.
		setWeeklySalary(salary);
	}

	// Método que verifica o salário semana.
	private void setWeeklySalary(double salary) {
		weeklySalary = (salary > 0 ? salary : 0);

	}

	// Retorna o sálario do Boss.
	@Override
	public double earnings() {

		return weeklySalary;
	}

	@Override
	public String toString() {

		return "Boss: " + super.toString();
	}

}
