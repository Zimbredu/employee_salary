package br.com.java.employee.service;

import br.com.java.employee.model.Employee;

public class CommissionWorker extends Employee {
	private double salary;
	private double commission;
	private int quantityOfItemsSold;

	public CommissionWorker(String firstName, String lastName, double salary, double commission, int quantity) {
		super(firstName, lastName);
		setSalary(salary);
		setCommission(commission);
		setQuantity(quantity);
	}

	// Verifica o salário básico semanal do funcionario(a) comissionado.
	private void setSalary(double weeklySalary) {
		salary = (weeklySalary > 0 ? weeklySalary : 0);

	}

	// Verifica a comissão do funcionário(a) comissionado.
	private void setCommission(double itemCommission) {
		commission = (itemCommission > 0 ? itemCommission : 0);

	}

	// Verifica a quantidade vendida pelo funcionáio(a) comissionado.
	private void setQuantity(int totalSold) {
		quantityOfItemsSold = (totalSold > 0 ? totalSold : 0);

	}

	@Override
	public double earnings() {

		return salary + (commission * quantityOfItemsSold);
	}

	@Override
	public String toString() {

		return "Commission worker: " + super.toString();
	}

}
