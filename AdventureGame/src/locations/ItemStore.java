package locations;

import game.Player;
import items.Armor;
import items.Weapon;

public class ItemStore extends NormalLoc{
    public ItemStore(Player player) {
        super(player, "item store");
    }

    @Override
    public boolean onLocation() {
        System.out.println("you're on item store");
        boolean itemStoreMenu = true;
        while (itemStoreMenu) {
            System.out.println("1-Weapons / 2-Armors / 3-Exit");
            System.out.print("make your choice : ");
            int selectedCase = scan.nextInt();
            while (selectedCase < 1 || selectedCase > 3) {
                System.out.print("invalid choice. try again : ");
                selectedCase = scan.nextInt();
            }
            int selectedItemID;
            if (selectedCase == 1) {
                selectedItemID = weaponMenu();
                buyWeapon(selectedItemID);
            }
            if (selectedCase == 2) {
                selectedItemID = armorMenu();
                buyArmor(selectedItemID);
            }
            if (selectedCase == 3) {
                itemStoreMenu=false;
            }
        }
        return true;
    }

    private int armorMenu() {
        System.out.println("---------ARMORS----------");
        for (Armor armor : Armor.armors()
        ) {
            System.out.println(armor.getId() + "\t" + armor.getName() + "\tPrize: " + armor.getPrice()
                    + "\tStrength: " + armor.getStrength());
        }
        System.out.print("Choose an armor (4: return item store) : ");
        int selectArmorID = scan.nextInt();
        while (selectArmorID < 1 || selectArmorID > 4) {
            System.out.print("invalid choice. try again : ");
            selectArmorID = scan.nextInt();
        }
        return selectArmorID;
    }

    private int weaponMenu() {
        System.out.println("---------WEAPONS----------");
        for (Weapon weapon : Weapon.weapons()
        ) {
            System.out.println(weapon.getId() + "\t" + weapon.getName() + "\tPrize: " + weapon.getPrice()
                    + "\tDamage: " + weapon.getDamage());
        }
        System.out.print("Choose a weapon (4: return item store) : ");
        int selectWeaponID = scan.nextInt();
        while (selectWeaponID < 1 || selectWeaponID > 4) {
            System.out.print("invalid choice. try again : ");
            selectWeaponID = scan.nextInt();
        }
        return selectWeaponID;
    }

    public void buyArmor(int itemID){
        int strength=0, price=0;
        String armorName=null;
        switch (itemID){
            case 1: strength=1; armorName="Lİght Armor"; price=15; break;
            case 2: strength=3; armorName="Medium Armor"; price=25; break;
            case 3: strength=5; armorName="Heavy Armor"; price=40; break;
            case 4:
                System.out.println("returning item store"); break;
            default:
                System.out.println("invalid choice"); break;
        }
        if (price>0){
            if (player.getMoney()>price){
                player.getInventory().setArmor(strength);
                player.getInventory().setArmorName(armorName);
                player.setMoney(player.getMoney()-price);
                System.out.println(armorName+" added inventory.");
                System.out.println(player.getMoney()+" money left.");
            }else System.out.println("You have not enough money.");
        }
    }
    private void buyWeapon(int itemID) {
        int damage = 0, price = 0;
        String weaponName = null;
        switch (itemID) {
            case 1:
                damage = 2;
                weaponName = "Pistol";
                price = 25;
                break;
            case 2:
                damage = 3;
                weaponName = "Sword";
                price = 35;
                break;
            case 3:
                damage = 7;
                weaponName = "Rifle";
                price = 45;
                break;
            case 4:
                System.out.println("returning item store"); break;
            default:
                System.out.println("invalid choice"); break;
        }

        if (price > 0) {
            if (player.getMoney() > price) {
                player.getInventory().setDamage(damage);
                player.getInventory().setWeaponName(weaponName);
                player.setMoney(player.getMoney() - price);
                System.out.println(weaponName+" added inventory.");
                System.out.println(player.getMoney()+" money left.");
            }else System.out.println("You have not enough money.");
        }
    }
}
