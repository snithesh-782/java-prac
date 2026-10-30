import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("madam: ");
        String s= sc.nextLine();

        String rev = "";

        for (int i = s1.length() - 1; i >= 0; i--) {
            rev = rev + s1.charAt(i);
        }

        if (rev.equals(s2)) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}