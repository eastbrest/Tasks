package jc01_2020.sheviarda.lesson02;

/*
 *
 * Определить, является ли год, который ввел пользователем, високосным или невисокосным.
 *
 * Високосные года делятся нацело на 4.
 * Однако из этого правила есть исключение: столетия, которые не делятся нацело на 400, високосными не являются.
 *
 * Формат вывода (ошибки недопустимы):
 * "Високосный"
 * "Обычный"
 *
 */

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int ostatok = year%4;
		int ostatok100 = year%100;
		String result = "Обычный";
		if (((ostatok==0)&&(ostatok100!=0))||((ostatok100==0)&&((year%400)==0))) result="Високосный";
		System.out.println(result);
	}
}
