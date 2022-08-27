package locations;

import game.Game;
import game.Player;

public class SafeHouse extends NormalLoc{
    @Override
    public boolean onLocation() {
        System.out.println("you're on safe house\n" +
                "health fully loaded");
        this.getPlayer().setHealth(this.getPlayer().getOrgHealth());
        return true;
    }

    public SafeHouse(Player player) {
        super(player, "safe house");
    }
}
