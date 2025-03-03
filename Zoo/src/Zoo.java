import java.util.ArrayList;

// Zoo Management System
class Zoo {
    ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " has been added to the zoo!");
    }

    public void listAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the zoo yet.");
            return;
        }

        System.out.println("\n🐾 Animals in the Zoo:");
        for (int i = 0; i < animals.size(); i++) {
            System.out.print((i + 1) + ". ");
            animals.get(i).displayInfo();
        }
    }

    public void interactWithAnimal(int index) {
        if (index < 0 || index >= animals.size()) {
            System.out.println("Invalid choice. Please select a valid animal.");
            return;
        }

        Animal animal = animals.get(index);
        System.out.println("\nInteracting with " + animal.getName() + "...");
        animal.makeSound();
        animal.move();
    }
}
