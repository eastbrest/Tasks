package jc01_2020.sheviarda.lesson03;

/*
 *
 * Угадать случайное число
 * В программе генерируется случайное целое число от 0 до 100. Пользователь должен его отгадать не более чем за 10 попыток.
 * После каждой неудачной попытки должно сообщаться больше или меньше введенное пользователем число, чем то, что загадано.
 * Если за 10 попыток число не отгадано, то вывести загаданное число.
 *
 * Теста на это задание нет, поиграйтесь сами против компьютера
 *
 */

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int secret = (int) (Math.random() * 100 + 1);
		boolean result = false;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Попытка №" + i);
			int popytka = scanner.nextInt();
			if (popytka == secret) {
				System.out.println("Число угадано! Ура! ");
				result = true;
				break;
			}
			if (popytka > secret) System.out.println("Загаданное число меньше! ");
			if (popytka < secret) System.out.println("Загаданное число больше! ");
		}
		if (!result) System.out.println("Правильный ответ = " + secret);
	}
}
