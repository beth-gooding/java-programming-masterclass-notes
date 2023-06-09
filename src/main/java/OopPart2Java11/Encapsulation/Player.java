package OopPart2Java11.Encapsulation;

public class Player {
    // If we make an internal change of a field name, because it is public this ends up affecting other classes
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public int healthRemaining () {
        return this.health;
    }
}
