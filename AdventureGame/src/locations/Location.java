package locations;

import game.Player;

import java.util.Scanner;

public abstract class Location {
    public Player player;
    private String name;
    Scanner scan = new Scanner(System.in);
    public abstract boolean onLocation();

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }
}
