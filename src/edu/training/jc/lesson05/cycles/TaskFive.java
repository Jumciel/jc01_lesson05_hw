package edu.training.jc.lesson05.cycles;

public class TaskFive {

	public static void main(String[] args) {
		int count = 0;
		int var = 1;

		while (var <= 99) {
			count = count + var;
			var = var + 2;
		}
		System.out.println("Сумма нечетных чисел от 1 до 99 = " + count);
	}
}
