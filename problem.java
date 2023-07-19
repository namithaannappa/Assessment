package string;

import java.util.Scanner;

public class stringproblem {
	   public static void main(String[] args) {
	        String input = "ssHen)";
	        char[] chars = input.toCharArray();

	        for (int i = 0; i < chars.length; i++) {
	            char current = chars[i];
	            int ascii = (int) current;

	            if (ascii % 2 == 0) {
	                if (i + 1 < chars.length) {
	                    int increment = ascii % 7;
	                    chars[i + 1] += increment;

	                    if (chars[i + 1] > 126) {
	                        chars[i + 1] = 'S';
	                    }
	                } else {
	                    chars[i] = 'S';
	                }
	            } else {
	                if (i - 1 >= 0) {
	                    int decrement = ascii % 5;
	                    chars[i - 1] -= decrement;

	                    if (chars[i - 1] < 32) {
	                        chars[i - 1] = 'S';
	                    }
	                }
	            }
	        }

	        String output = new String(chars);
	        System.out.println(output);
	    }
	}