import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PasswordValidator validator = new PasswordValidator();
        PasswordScore score = new PasswordScore(validator);

        String password;

        while (true) {
            System.out.println("Enter new Password ");
            password = sc.nextLine();

            if (validator.isValid(password)) {
                System.out.println("Password is valid");
                break;
            }
        }
        int finalScore = score.score(password);
        System.out.println("Final Score: " + finalScore);
    }
}