package jc01_2020.sheviarda.lesson03;

/*
 *
 * Нарисовать диагонали квадрата с заданной длиной стороны
 *
 * Теста нет, смотрим вывод в консоль
 *
 */

import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		for (int i = 1; i <= length; i++) {
			for (int j = 1; j <= length; j++) {
				if ((i == j)||(i==(length-j+1))) System.out.print('O');
				else System.out.print(' ');
			}
			System.out.println();
		}
	}
}
