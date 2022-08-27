package locations;

import creatures.Creatures;
import creatures.Zombie;
import game.Player;

public class Cave extends BattleField{
    public Cave(Player player, String name, Creatures creatures, String loot, int maxCreature) {
        super(player, "Magara", new Zombie(), "food", 3);
    }
}
