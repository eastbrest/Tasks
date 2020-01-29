package jc01_2020.sheviarda.lesson03;

/*
 *
 * Найти все совершенные числа до 10000. Совершенное число - это такое число, которое равно сумме всех своих делителей,
 * кроме себя самого.
 * Например, число 6 является совершенным, т.к. кроме себя самого делится на числа 1, 2 и 3, которые в сумме дают 6.
 *
 * Формат вывода (ошибки недопустимы):
 * каждое число в новой строке
 *
 */

public class Task5 {
	public static void main(String[] args) {
		short ostatok, proverka = 0;
		for (short i = 2; i <= 10000; i++) {
			for (short j = 1; j < i; j++) {
				ostatok = (short)(i%j);
				if (ostatok==0) proverka = (short)(proverka + j);
				}
			if (proverka==i) System.out.println(i);
			proverka = 0;
			}
	}
}
