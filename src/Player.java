public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        if (healthPercentage > 100) {
            this.healthPercentage = 100;
        } else if (healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }
        this.weapon = weapon;
    }

    public void Test() {
        System.out.println("[0] Succesfully connecting to Player Class...");
    }

    public int healthRemaining() {
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        int result = this.healthPercentage - damage;
        if (result > 0) {
            this.healthPercentage = result;
        } else {
            this.healthPercentage = 0;
            System.out.println(this.name + " player has been knocked out of game");}
    }

    public void restoreHealth(int healthPotion) {
        int result = this.healthPercentage + healthPotion;
        if (result <= 100) {
            this.healthPercentage = result;
        } else {
            this.healthPercentage = 100;
            System.out.println("Health percentage of the player can't exceed 100.");
        }
    }
}
