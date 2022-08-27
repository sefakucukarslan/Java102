package locations;

import creatures.Bear;
import creatures.Creatures;
import game.Player;

public class River extends BattleField{
    public River(Player player) {
        super(player,"River",new Bear(),"water",2);
    }
}
