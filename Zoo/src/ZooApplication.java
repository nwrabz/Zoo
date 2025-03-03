import java.util.Scanner;

// Main Application
public class ZooApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zoo zoo = new Zoo();

        while (true) {
            System.out.println("\n========= 🏞 ZOO MANAGEMENT SYSTEM 🏞 =========");
            System.out.println("1. Add Animal");
            System.out.println("2. View All Animals");
            System.out.println("3. Interact with an Animal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter animal type (Lion, Elephant, Monkey): ");
                    String type = scanner.nextLine().toLowerCase();

                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();

                    switch (type) {
                        case "lion":
                            zoo.addAnimal(new Lion(name, age));
                            break;
                        case "elephant":
                            zoo.addAnimal(new Elephant(name, age));
                            break;
                        case "monkey":
                            zoo.addAnimal(new Monkey(name, age));
                            break;
                        default:
                            System.out.println("Invalid animal type! Please enter Lion, Elephant, or Monkey.");
                    }
                    break;

                case 2:
                    zoo.listAnimals();
                    break;

                case 3:
                    zoo.listAnimals();
                    if (!zoo.animals.isEmpty()) {
                        System.out.print("Select an animal by number: ");
                        int index = scanner.nextInt();
                        zoo.interactWithAnimal(index - 1);
                    }
                    break;

                case 4:
                    System.out.println("Exiting Zoo Management System. Goodbye! 🏞");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}