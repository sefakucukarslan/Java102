package items;

public class Armor {
    private int id;
    private String name;
    private int strength;
    private int price;

    public Armor(int id, String name, int strength, int price) {
        this.id = id;
        this.name = name;
        this.strength = strength;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static Armor[] armors() {
        Armor[] armorList = new Armor[3];
        armorList[0] = new Armor(1, "Light Armor", 1, 15);
        armorList[1] = new Armor(2, "Medium Armor", 3, 25);
        armorList[2] = new Armor(3, "Heavy Armor", 5, 40);

        return armorList;
    }

    public static Armor getArmorObjByID(int id){
        for(Armor armor : Armor.armors()){
            if(armor.getId() == id){
                return armor;
            }
        }

        return null;
    }
}
