package game;

import locations.*;

import java.util.Scanner;

public class Game {
    public void start(){
        System.out.println("Welcome to Adventure game.Game !");
        //System.out.println("Please enter character name : ");
        Scanner scanner = new Scanner(System.in);

        Player player = new Player("plyr1");
        System.out.println(player.getPlayerName() + " welcome to game !");
        System.out.println("Choose your character...");
        player.selectChar();

        Location location = null;

        while (true){

        }
    }
}
