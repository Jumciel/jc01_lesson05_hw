package edu.training.jc.lesson05.branching;

public class TaskEight {

	public static void main(String[] args) {
		double a = 5;
		double b = 5;
		double squareA;
		double squareB;

		squareA = Math.pow(a, 2);
		squareB = Math.pow(b, 2);

		if (squareA < squareB) {
			System.out.println("Квадрат числа а меньше квадрата числа b и равен: " + squareA);
		} else if (squareB < squareA) {
			System.out.println("Квадрат числа b меньше квадрата числа a и равен: " + squareB);
		} else {
			System.out.println("Квадраты чисел а и b равны между собой: " + squareB);
		}
	}

}
