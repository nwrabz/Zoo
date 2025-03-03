class Monkey extends Animal {
    public Monkey(String name, int age) { super(name, age); }

    @Override
    public void makeSound() { System.out.println(getName() + " chatters and screams! 🐵"); }

    @Override
    public void move() { System.out.println(getName() + " swings from tree to tree."); }

    @Override
    public void displayInfo() {
        System.out.println("🐵 Monkey: " + getName() + ", Age: " + getAge());
    }
}