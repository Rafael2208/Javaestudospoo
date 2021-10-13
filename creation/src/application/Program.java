package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		Employee employee = new Employee ();
		
		System.out.print("NOME:");
		employee.name = sc.nextLine();
		
		System.out.print("SALARIO BRUTO:");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("TAXA:");
		employee.tax = sc.nextDouble();
		
		
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		sc.close();
		
		
		

	}

}
