package edu.training.jc.lesson05.branching;

public class TaskSix {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;

		if (a > b) {
			System.out.println("Число а является наибольшим и равно: " + a);
		} else if (b > a) {
			System.out.println("Число b является наибольшим и равно: " + b);
		} else {
			System.out.println("Числа а и b равны между собой: " + b);
		}

	}

}
