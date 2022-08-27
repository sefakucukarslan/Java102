package game;

import characters.Archer;
import characters.GameChar;
import characters.Knight;
import characters.Samurai;

import java.util.Scanner;
public class Player {
    private int damage;
    private int health;
    private int orgHealth;
    private int money;
    private String playerName;
    private String charName;

    Scanner scanner = new Scanner(System.in);
    protected Inventory inventory;

    public Player(String playerName){
        this.playerName = playerName;
        this.inventory = new Inventory();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getOrgHealth() {
        return orgHealth;
    }

    public void setOrgHealth(int orgHealth) {
        this.orgHealth = orgHealth;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public void selectChar(){
        System.out.println("1- Samurai \t Damage : 5 \t Health :21 \t Money :15");
        System.out.println("2- Archer  \t Damage : 7 \t Health :18 \t Money :20");
        System.out.println("3- Knight  \t Damage : 8 \t Health :24 \t Money :5");
        System.out.print("Make your choice(1-2-3) : ");
        int selectedChar = scanner.nextInt();
        switch (selectedChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Archer());
                break;
        }
        System.out.println(this.getCharName() + " is selected...");
    }

    public void initPlayer(GameChar gameChar){
        this.setCharName(gameChar.getName());
        this.setDamage(gameChar.getDamage());
        this.setOrgHealth(gameChar.getHealth());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
    }

    public void printInventory(){
        System.out.println();
        System.out.println("Food : " + this.getInventory().isFood());
        System.out.println("Wood : " + this.getInventory().isWood());
        System.out.println("Water : " + this.getInventory().isWater());
        System.out.println();
    }

    public void printInfo(){
        System.out.println(
                "Weapon : " + this.getInventory().getWeaponName()+
                        "\n Armor : " + this.getInventory().getArmorName()+
                        "\n Strength : " + this.getInventory().getArmor()+
                        "\n Damage : " + this.getDamage()+
                        "\n Healthy : " + this.getHealth()+
                        "\n Money : " + this.getMoney()
        );
    }
    public int getTotalDamage(){
        return this.getDamage() + this.getInventory().getDamage();
    }
}
