package edu.training.jc.lesson05.branching;

import java.util.Scanner;

public class TaskNine {

	public static void main(String[] args) {
		int ab, bc, ac;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите три стороны треугольника\n>");

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Вы ввели не целое число\n>");
		}

		ab = sc.nextInt();

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Вы ввели не целое число\n>");
		}

		bc = sc.nextInt();

		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Вы ввели не целое число\n>");
		}
		ac = sc.nextInt();
		
		System.out.println("ab = " + ab + "\nbc = " + bc + "\nac = " + ac);
		
		if (ab == bc & ab == ac & bc == ac) {
			System.out.println("Треугольник является равносторонним");
		}else {
			System.out.println("Треугольник не является равносторонним");
		}
	}

}
