package jc01_2020.sheviarda.lesson03;

/*
 *
 * Сформировать из введенного числа обратное по порядку входящих в него цифр и вывести на экран.
 * Например, если введено число 3486, то надо вывести число 6843.
 *
 * Формат вывода (ошибки недопустимы):
 * одно число с учетом знака
 *
 */

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long input = scanner.nextLong();
		long result = 0, ostatok_chisla = input;
		int ostatok;
		if ((input>9)||(input<-9)) {
			while (ostatok_chisla!=0) {
				ostatok = (int)(ostatok_chisla % 10);
				result = result*10 + ostatok;
				ostatok_chisla = ostatok_chisla/10;
			}
		}
		else result = input;
		System.out.println(result);
	}
}
