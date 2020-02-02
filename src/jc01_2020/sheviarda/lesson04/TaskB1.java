package jc01_2020.sheviarda.lesson04;

/*
 *
 * Сжать массив, удалив из него все элементы, величина которых находится в интервале [а, b] (квадратные скобки означают,
 * что крайние значения так же включаются в интервал).
 * Освободившиеся в конце массива элементы заполнить нулями.
 *
 * Пример: {4, 10, 18, 5, 11, 22, 13}. Интервал [10, 18].
 * Ответ:
 * 4
 * 5
 * 22
 * 0
 * 0
 * 0
 * 0
 *
 * Формат вывода:
 * значение каждой ячейки массива с новой строки
 *
 */

import java.util.Scanner;

public class TaskB1 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[7];
		int j = 0, p = 1;
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		do {
			if ((array[j] >= a) && (array[j] <= b)) {
				System.arraycopy(array, j + 1, array, j, array.length - 1 - j);
				array[array.length - 1] = 0;
				p++;
			}
			else {
				j++;
				p++;
			}
		} while ((j < array.length) || (p < array.length));
		for (int value : array) {
			System.out.println(value);
		}
    }

}
