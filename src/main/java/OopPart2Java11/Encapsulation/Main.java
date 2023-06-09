package OopPart2Java11.Encapsulation;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();

        // Doing this manually means we cannot guarantee all the fields are set, which we can do with constructors
        // It also means that any validation we have added inside the class can be avoided
        player.name = "Beth";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        // Because everything in the Player class is public, we are opening up the application for it to be used badly
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player2 = new EnhancedPlayer("Beth", 50, "Sword");
        System.out.println("Initial health is " + player2.getHealth());

    }
}
