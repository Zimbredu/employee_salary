package br.com.java.employee.application;

import java.text.DecimalFormat;
import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.java.employee.model.Employee;
import br.com.java.employee.service.Boss;
import br.com.java.employee.service.CommissionWorker;
import br.com.java.employee.service.HourlyWorker;
import br.com.java.employee.service.PieceWorker;


public class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employee employee;// referência para a superClasse.
		String output = "";
		String answer = "";
		Double answerD = 0.0;
		Integer answerI;
  
		Boss boss = new Boss(answer = input.nextLine()
				, answer = input.nextLine()
				, answerD = input.nextDouble());

		CommissionWorker commissionWorker = new CommissionWorker(answer = input.next()
				, answer = input.next()
				, answerD = input.nextDouble()
				, answerD = input.nextDouble()
				, answerI = input.nextInt());

		PieceWorker pieceWorker = new PieceWorker(answer = input.next()
				, answer = input.next()
				, answerD = input.nextDouble()
				, input.nextInt());
		
		HourlyWorker hourlyWorker = new HourlyWorker(input.next()
				, input.next()
				, input.nextDouble()
				, input.nextInt());
	
		DecimalFormat precision2 = new DecimalFormat("0.00");
		
		//Referência Employee para Boss.
		employee = boss;
		
		output += 
		     boss.toString() + " earned $ "	+
		     precision2.format(boss.earnings() ) + "\n";
		
		//Referência Employee para um CommissionWorker..
		employee = commissionWorker;
			
		output += 
		     commissionWorker.toString() + " earned $ "	+
		     precision2.format(commissionWorker.earnings() ) + "\n";
		
		//Referência Employee para um PieceWorker..
		employee = pieceWorker;
					
		output += 
		     pieceWorker.toString() + " earned $ "	+
		     precision2.format(pieceWorker.earnings() ) + "\n";
		
		//Referência Employee para um HourlyWorker..
		employee = hourlyWorker;
							
		output += 
		     hourlyWorker.toString() + " earned $ "	+
		     precision2.format(hourlyWorker.earnings() ) + "\n";
								
		
		JOptionPane.showMessageDialog(null, output, "Demonstrating Polymorphism", JOptionPane.INFORMATION_MESSAGE);
		 System.exit(0);
						
				
				

	}

}
