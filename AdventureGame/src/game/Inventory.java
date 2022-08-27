package game;

public class Inventory {
    private boolean water, food, wood;
    private String weaponName, armorName;
    private int damage, armor;

    public boolean isWater(){
        return water;
    }
    public void setWater(boolean water){
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public Inventory(){
        this.water = false;
        this.food = false;
        this.wood = false;
        this.weaponName = null;
        this.armorName = null;
        this.damage = 0;
        this.armor = 0;
    }
}
