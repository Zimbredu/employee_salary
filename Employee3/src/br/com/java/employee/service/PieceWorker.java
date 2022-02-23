package br.com.java.employee.service;

import br.com.java.employee.model.Employee;

public class PieceWorker extends Employee {
	private double wagePerPiece;
	private int quantityOfItemsProduced;

	// Contrutor para classe PieceWorker.
	public PieceWorker(String firstName, String lastName, double wage, int numberOfItems) {
		super(firstName, lastName);
		setWage(wage);
		setQuantity(numberOfItems);

	}

	// Verifica a remuneração do funcionáro(ganho por peça fabricada);
	private void setWage(double wage) {
		wagePerPiece = (wage > 0 ? wage : 0);

	}

	// Verifica a quantidade de itens produzidos
	private void setQuantity(int numberOfItems) {
		quantityOfItemsProduced = (numberOfItems > 0 ? numberOfItems : 0);

	}

	@Override
	public double earnings() {

		return quantityOfItemsProduced * wagePerPiece;
	}

	@Override
	public String toString() {

		return "Piece worker: " + super.toString();
	}

}
