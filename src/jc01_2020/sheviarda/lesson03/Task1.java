package jc01_2020.sheviarda.lesson03;

/*
 *
 * С клавиатуры вводится натуральное число. Найти его наибольшую цифру
 *
 * Формат вывода (ошибки недопустимы):
 * одно число
 *
 */

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextLong();
		int max = 1, ostatok;
		long ostatok_chisla = input;
		if (input<0) ostatok_chisla = -1*ostatok_chisla;
		if ((input > 9)||(input < -9)) {
			while (ostatok_chisla > 9) {
				ostatok = (int) (ostatok_chisla % 10);
				ostatok_chisla = ostatok_chisla / 10;
				if (ostatok > max) max = ostatok;
			}
			if (ostatok_chisla > max) max = (int)ostatok_chisla;
		}
		else max = (int)ostatok_chisla;
		System.out.println(max);


	}
}
