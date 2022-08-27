package locations;

import creatures.Snake;
import game.Player;

public class Mine extends BattleField{
    public Mine(Player player) {
        super(player, "Maden",new Snake(),"Ganimet",5);
    }
}
