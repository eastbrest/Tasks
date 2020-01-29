package jc01_2020.sheviarda.lesson03;

/*
 *
 * Вывести на экран таблицу умножения (от 1 до 9)
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

public class Task8 {
	public static void main(String[] args) {
		for (byte i = 1; i <= 9; i++) {
			for (byte j = 1; j <= 9; j++) {
				if ((i*j)<10) System.out.print(" " + (i*j) + " ");
				else System.out.print((i*j) + " ");
			}
			System.out.println();
		}
	}
}
