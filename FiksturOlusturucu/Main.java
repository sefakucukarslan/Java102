package FiksturOlusturucu;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of teams: ");
        int N = input.nextInt();

        List<String> teams = new ArrayList<>();

        for (int i=0; i<N; i++) {
            System.out.println("Enter team name: ");
            String team = input.next();
            teams.add(team);
        }

        if (N%2 != 0) {
            teams.add("PASS");
            N +=1;
        }

        List<String> tempTeams = new ArrayList<>();

        while (0 < teams.size()) {
            int index = (int)(Math.random()*teams.size());
            tempTeams.add(teams.get(index));
            teams.remove(teams.get(index));
        }

        teams = tempTeams;

        int totalRound = N - 1;
        int numMatchPerRound = N / 2;

        LinkedHashMap<String, ArrayList<ArrayList<String>>> rounds = new LinkedHashMap<>();

        for (int i=0; i<totalRound; i++) {
            String round = String.valueOf(i + 1);
            rounds.put(round, new ArrayList<ArrayList<String>>());
        }

        for (int i=0; i<totalRound; i++) {
            ArrayList<String> home = new ArrayList<>();
            ArrayList<String> away = new ArrayList<>();

            for (int j=0; j<numMatchPerRound; j++) {
                home.add(teams.get(j));
                away.add(teams.get((N - 1) - j));            // (N-1) - j : index of away team
            }

            String round = String.valueOf(i + 1);
            rounds.get(round).add(home);
            rounds.get(round).add(away);

            List<String> newTeams = new ArrayList<>();

            newTeams.add(teams.get(0));
            newTeams.add(teams.get((N - 1)));

            for (int k=1; k<teams.size() - 1; k++) {
                newTeams.add(teams.get(k));
            }

            teams = newTeams;
        }

        System.out.println();

        for (int i=0; i<2*totalRound; i++) {
            System.out.println((i + 1) + ". Round");
            for (int j = 0; j < numMatchPerRound; j++) {
                if (i < totalRound) {
                    System.out.println(rounds.get(String.valueOf(i + 1)).get(0).get(j) + " vs " + rounds.get(String.valueOf(i + 1)).get(1).get(j));
                } else {
                    System.out.println(rounds.get(String.valueOf(i + 1 - totalRound)).get(1).get(j) + " vs " + rounds.get(String.valueOf(i + 1 - totalRound)).get(0).get(j));
                }
            }
            System.out.println();
        }
    }
}
