package creatures;

import java.util.Random;

public class Creatures {
    private String name;
    private int damage;
    private int health;
    private int loot;

    private int maxCount;

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public Creatures(String name, int damage, int health, int loot, int maxCount) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.loot = loot;
        this.maxCount = maxCount;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
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
        if (health < 0){
            health = 0;
        }
        this.health = health;
    }

    public int getLoot() {
        return loot;
    }

    public void setLoot(int loot) {
        this.loot = loot;
    }

    public int count(){
        Random random = new Random();
        return random.nextInt(this.maxCount) + 1 ;
    }
}
