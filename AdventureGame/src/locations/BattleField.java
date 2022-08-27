package locations;

import creatures.Creatures;
import game.Player;

public class BattleField extends Location{
    private Creatures creatures;
    private String loot;
    private int maxCreature;

    public BattleField(Player player, String name, Creatures creatures, String loot, int maxCreature) {
        super(player, name);
        this.creatures = creatures;
        this.loot = loot;
        this.maxCreature = maxCreature;
    }


    @Override
    public boolean onLocation() {
        int creatureCount = creatures.count();
        System.out.println("you are at "+this.getName()+" now");
        System.out.println("be careful. there are "+creatureCount+" "+creatures.getName()+ " here.");
        System.out.println("Press <F> for fight or press <E> for escape");
        String selectedOp = scan.nextLine().toUpperCase();

        if (selectedOp.equals("F")){
            System.out.println("the fight has begun...");
            if (combat(creatureCount)){
                System.out.println("All creatures have been defeated...");
                return  true;
            }
        }
        if (this.getPlayer().getHealth()<=0){
            System.out.println("you lost...");
            return false;
        }
        return true;
    }
    public boolean combat(int maxCreature){
        for (int i = 0; i < maxCreature; i++) {
            int creaturesHealth = creatures.getHealth();
            playerStats();
            creatureStats();
            while (player.getHealth() > 0 && creatures.getHealth() > 0) {
                System.out.print("Press <F> for fight or press <E> for escape");
                String selectedCase = scan.nextLine().toUpperCase();
                if (selectedCase.equals("F")) {
                    System.out.println("You Hit !");
                    creatures.setHealth(creatures.getHealth() - player.getTotalDamage());
                    afterHit();
                    if (creatures.getHealth() > 0) {
                        System.out.println();
                        System.out.println("Creature hit you !");
                        player.setHealth(player.getHealth() - (creatures.getDamage() - player.getInventory().getArmor()));
                        afterHit();
                    }
                } else {
                    return false;
                }
            }

            if (creatures.getHealth() < player.getHealth()) {
                System.out.println("Creatures eliminated !");
                player.setMoney(player.getMoney() + creatures.getLoot());
                System.out.println("Current money : " + player.getMoney());
                creatures.setHealth(creaturesHealth);
            } else {
                return false;
            }
            System.out.println("================================");
        }
        return true;
    }

    private void afterHit(){

    }

    private void creatureStats() {
        System.out.println("Creature Stats :");
        System.out.println("Creature : "+creatures.getName());
        System.out.println("Health   : "+ creatures.getHealth());
        System.out.println("Damage   : "+ creatures.getDamage());
        System.out.println("Loot     : "+creatures.getLoot());
    }

    private void playerStats() {
        System.out.println("Player Stats  :");
        System.out.println("Health :" + player.getHealth());
        System.out.println("Damage :" + player.getTotalDamage());
        System.out.println("Money  :" + player.getMoney());
        if (player.getInventory().getDamage() > 0) {
            System.out.println("Weapon :" + player.getInventory().getWeaponName());
        }
        if (player.getInventory().getArmor() > 0) {
            System.out.println("Armor  :" + player.getInventory().getArmorName());
        }
    }




    public Creatures getCreatures() {
        return creatures;
    }

    public void setCreatures(Creatures creatures) {
        this.creatures = creatures;
    }

    public String getLoot() {
        return loot;
    }

    public void setLoot(String loot) {
        this.loot = loot;
    }

    public int getMaxCreature() {
        return maxCreature;
    }

    public void setMaxCreature(int maxCreature) {
        this.maxCreature = maxCreature;
    }

}
