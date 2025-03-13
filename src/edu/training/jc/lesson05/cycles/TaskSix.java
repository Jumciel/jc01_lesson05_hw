package edu.training.jc.lesson05.cycles;

import java.util.Scanner;

public class TaskSix {

	public static void main(String[] args) {
		int x = 0;
		int count = 0;
		int var = 1;
		boolean check = false;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите целое положительное число\n>");
		
		while (!check) {
			
			if (sc.hasNextInt()) {
				x = sc.nextInt();
				if (x > 0) {
					check = true;
				} else {
					System.out.println("Число должно быть больше 0");
				}
			} else {
				System.out.println("Введите целое положительное число\n>");
				sc.nextLine();
			}
		}

		while (var <= x) {
			count = count + var;
			var++;
		}
		System.out.println("Сумма = " + count);
	}

}
