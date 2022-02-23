//Classe base abstrata Employee.

package br.com.java.employee.model;

public abstract class Employee {

	private String firstName;
	private String lastName;

	// Construtor.
	public Employee(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Obtem nome.
	public String getFirstName() {
		return firstName;
	}

	// Obtem sobrenome.
	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	// Métodos abstract que deve ser implementado para
	// cada classe derivada de Employee a partir da
	// qual os objetos são instanciados.
	 public abstract double earnings(); 

}
