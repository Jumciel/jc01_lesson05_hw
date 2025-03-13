package edu.training.jc.lesson05.branching;

public class TaskTen {

	public static void main(String[] args) {
		double firstArea = 13;
		double secondArea = 12;

		if (firstArea < secondArea) {
			System.out.println("Площадь первого круга меньше второго\n" + firstArea + " < " + secondArea);
		} else if (secondArea < firstArea) {
			System.out.println("Площадь второго круга меньше первого\n" + firstArea + " > " + secondArea);
		} else {
			System.out.println("Площади кругов равны\n" + firstArea + " = " + secondArea);
		}

	}

}
