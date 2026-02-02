void main() {
    String name = "Ragnar";
    int healthPoints = 85;
    int maxHealth = 100;
    int level = 5;
    int experiencePoints = 2300;
    double gold = 156.50;
    boolean isAlive = true;
    char klasse = 'W';

    String[] inventory = {"Sword", "Shield", "Potion"};

    System.out.println("=== CHARACTER SHEET ===");
    System.out.println("Name: " + name);
    System.out.println("Class: " + klasse);
    System.out.println("Level: " + level);
    System.out.println("Health: " + healthPoints + "/" + maxHealth);
    System.out.println("XP: " + experiencePoints);
    System.out.println("Gold: " + gold);
    System.out.println("Alive: " + isAlive);

    System.out.println("\nInventory (" + inventory.length + " items):");
    for (String item : inventory) {
        System.out.println("- " + item);
    }
}