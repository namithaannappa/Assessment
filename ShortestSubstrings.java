
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShortestSubstrings {
    public static void printShortestSubstrings(String s, int x) {
        List<String> substrings = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + x - 1; j < s.length(); j++) {
                String substring = s.substring(i, j + 1);
                if (substring.charAt(0) == substring.charAt(substring.length() - 1)) {
                    substrings.add(substring);
                }
            }
        }

        if (substrings.isEmpty()) {
            System.out.println("not-found");
        } else {
            int shortestLength = Integer.MAX_VALUE;
            for (String substring : substrings) {
                shortestLength = Math.min(shortestLength, substring.length());
            }

            for (String substring : substrings) {
                if (substring.length() == shortestLength) {
                    System.out.println(substring);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        System.out.print("Enter the minimum length (x): ");
        int x = scanner.nextInt();

        System.out.println("Shortest substrings:");
        printShortestSubstrings(s, x);

        scanner.close();
    }
}
