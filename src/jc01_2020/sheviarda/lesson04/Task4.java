package jc01_2020.sheviarda.lesson04;

/*
 *
 * В одномерном массиве найти сумму элементов, находящихся между минимальным и максимальным элементами (их порядок не важен).
 * Сами минимальный и максимальный элементы в сумму не включать.
 *
 * Пример: {10, 30, 20, 15, 8, 21, 14}. max = 30, min 8. В сумму должны пойти значения 20 и 15. Ответ: 35
 *
 * Формат вывода:
 * одно число
 */

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[7];
		int min, max, min_index, max_index, summary, tmp;
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		min = array[0];
		max = array[0];
		min_index = 0;
		max_index = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
				min_index = i;
			}
			if (array[i] > max) {
				max = array[i];
				max_index = i;
			}
		}
		if (min_index > max_index) {
			tmp = max_index;
			max_index = min_index;
			min_index = tmp;
		}
		summary = 0;
		for (int i = min_index + 1; i < max_index; i++)
			summary += array[i];
		System.out.println(summary);
	}
}
