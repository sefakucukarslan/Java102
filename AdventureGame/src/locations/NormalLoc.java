package locations;

import game.Player;

public class NormalLoc extends Location {
    public NormalLoc(Player player,String name) {
        super(player,name);
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}
