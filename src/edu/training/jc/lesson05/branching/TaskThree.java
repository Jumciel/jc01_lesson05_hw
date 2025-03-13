package edu.training.jc.lesson05.branching;

import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
		int x;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите целое число\n> ");
		while (!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Вы ввели не целое число ");
			System.out.println("> ");
		}
		x = sc.nextInt();
		if (x < 3) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
