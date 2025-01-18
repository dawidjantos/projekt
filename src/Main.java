import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(List.of());
        User user1 = new User("user1", "user1@poczta.pl", "Password123!");
        users.add(user1);
        User user2 = new User("user2", "user2", "Password123!");
        users.add(user2);
        User user3 = new User("user3", "user3@poczta.pl", "Password123!");
        users.add(user3);
        User user4 = new User("user4", "user4@poczta.pl", "Password");
        users.add(user4);

        WalidatorHandler walidator = new EmailWalidatorHandler();
        walidator.setSuccessor(new PasswordWalidatorHandler());

        for (User user : users) {
            try {
                walidator.handleRequest(user);
                System.out.println("Rejestracja uzytkownika: " + user.getUsername() + " przebiegla pomyslnie");
            } catch (WalidatorException e) {
                System.out.println("Rejestracja uzytkownika: " + user.getUsername() + " zakończona niepowodzeniem: " + e.getMessage());
            }
        }

    }

}