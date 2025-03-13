package edu.training.jc.lesson05.branching;

public class TaskFive {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;

		if (a > b) {
			System.out.println("Число b наименьшее и равно: " + b);
		} else if (a < b) {
			System.out.println("Число а наименьшее и равно: " + a);
		} else {
			System.out.println("Числа а и b равны между собой: " + a);
		}

	}

}
