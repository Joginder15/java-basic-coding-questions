import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        String username = "admin";
        String password = "password";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String usernameInput = scanner.next();
        System.out.println("Enter password: ");
        String passwordInput = scanner.next();

        if (usernameInput.equals(username) && passwordInput.equals(password)){
            System.out.println("Login successfully.");
        } else {
            System.out.println("Login failed.");
        }
    }
}
