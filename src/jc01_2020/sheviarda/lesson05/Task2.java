package jc01_2020.sheviarda.lesson05;

/*
 *
 * Вводится строка. Удалить из нее все пробелы. После этого определить, является ли она палиндромом (перевертышем),
 * т.е. одинаково пишется как с начала, так и с конца. Регистр букв не учитывать
 *
 *
 * Формат вывода:
 * "Да"
 * "Нет"
 *
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String str2;
		StringBuilder str1 = new StringBuilder(str);
        StringBuilder str0 = new StringBuilder();
		int i = 0;
		while (i < str1.length()) {
		    if (str1.charAt(i)==' ') str1.deleteCharAt(i);
		    else i++;
        }
		for (int j = 0; j < str1.length(); j++) {
		    str0.append(str1.charAt(str1.length() - j - 1));
        }
        str2 = String.valueOf(str1);
		if (str2.equalsIgnoreCase(String.valueOf(str0))) System.out.println("Да");
		else System.out.println("Нет");
    }
}
