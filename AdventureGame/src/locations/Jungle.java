package locations;

import creatures.Vampire;
import game.Player;

public class Jungle extends BattleField{
    public Jungle(Player player) {
        super(player, "Orman", new Vampire(), "firewood", 3);
    }
}
