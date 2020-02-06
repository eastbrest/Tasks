package jc01_2020.sheviarda.lesson05;

/*
 *
 * Определить, является ли введенное слово идентификатором, т.е. начинается ли оно с английской буквы в любом регистре
 * или знака подчеркивания и не содержит других символов, кроме букв английского алфавита (в любом регистре), цифр и
 * знака подчеркивания.
 *
 * Формат вывода:
 * "Да"
 * "Нет"
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String result = "Нет";
		if (((str.charAt(0)>='a')&&(str.charAt(0)<='z'))||((str.charAt(0)>='A')&&(str.charAt(0)<='Z'))||
                (str.charAt(0)=='_')) {
		    for (int i = 1; i < str.length(); i++) {
		        if (((str.charAt(i)>='a')&&(str.charAt(i)<='z'))||((str.charAt(i)>='A')&&(str.charAt(i)<='Z'))||
                        (str.charAt(i)=='_')||((str.charAt(i)>='0')&&(str.charAt(i)<='9'))) result = "Да";
                        else {
                            result = "Нет";
                            break;
                        }
            }
        }
		System.out.println(result);


    }
}
