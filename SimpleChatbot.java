import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our chatbot!");
        System.out.println("Type 'i want to login' to begin.");

        String userInput = scanner.nextLine().toLowerCase();

        if (userInput.contains("i want to login")) {
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Store email and password in the database (you'll need to implement this part)
            // For simplicity, let's assume we store them in memory:
            // Map<String, String> userDatabase = new HashMap<>();
            // userDatabase.put(email, password);

            System.out.println("Your account has been registered.");
        } else {
            System.out.println("I'm sorry, I didn't understand that.");
        }

        scanner.close();
    }
}