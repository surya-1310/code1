import java.util.Scanner;

public class PangramBothCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String str = sc.nextLine();

        boolean[] letters = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters[ch - 'A'] = true;
            }
        }

        boolean pangram = true;

        for (int i = 0; i < 26; i++) {
            if (!letters[i]) {
                pangram = false;
                break;
            }
        }

        if (pangram)
            System.out.println("Pangram");
        else
            System.out.println("Not Pangram");

        sc.close();
    }
}