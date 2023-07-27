public class Main {
    public static void main(String[] args) {

        System.out.println("******************************************************");
        Point first = new Point(6, 5);
        Point second = new Point(6, 5);
        first.Test();
        System.out.println("[1] distance(0,0)= " + first.distance());
        System.out.println("[2] distance(second)= " + first.distance(second));
        System.out.printf("[3] distance(2,2)= %.2f\n", first.distance(2, 2));
        Point point = new Point(0, 0);
        System.out.println("[4] distance()= " + point.distance());

        System.out.println("******************************************************");
        Weapon weapon = Weapon.WEAPON;
        String weaponName = weapon.getValue();
        Player playerOne = new Player("Player One", 70, weapon);
        playerOne.Test();
        System.out.println("[1] weaponName: " + weaponName);
        System.out.println("[2] PlayerOne initial healthRemaining: " + playerOne.healthRemaining());
        playerOne.loseHealth(10);
        System.out.println("[3] PlayerOne healthRemaining is decreasing (-10 damage): " + playerOne.healthRemaining());
        playerOne.loseHealth(50);
        System.out.println("[4] PlayerOne healthRemaining is decreasing (-50 damage): " + playerOne.healthRemaining());
        playerOne.loseHealth(20);
        System.out.println("[5] PlayerOne healthRemaining is 0, not -10 (-20 damage): " + playerOne.healthRemaining());
        playerOne.restoreHealth(50);
        System.out.println("[6] PlayerOne take a %50 potion, healthRemaining is: " + playerOne.healthRemaining());
        playerOne.restoreHealth(20);
        System.out.println("[7] PlayerOne take a %20 potion, healthRemaining is: " + playerOne.healthRemaining());
        playerOne.restoreHealth(80);
        System.out.println("[8] PlayerOne take a %20 potion, healthRemaining is 100, not 150: " + playerOne.healthRemaining());
    }
}