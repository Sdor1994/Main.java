import units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static ArrayList<BasicHero> aliance = new ArrayList<>();
    public static ArrayList<BasicHero> empire = new ArrayList<>();
    public static ArrayList<BasicHero> unitedTeam = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            int j = new Random().nextInt(4);
            int k = new Random().nextInt(4);
            switch (j) {
                case 0:
                    aliance.add(new Mag(NamesHeros.getName(), 1, i));
                    break;
                case 1:
                    aliance.add(new Robber(NamesHeros.getName(), 1, i));
                    break;
                case 2:
                    aliance.add(new Sniper(NamesHeros.getName(), 1, i));
                    break;
                default:
                    aliance.add(new Rustic(NamesHeros.getName(), 1, i));

            }
            switch (k) {
                case 0:
                    empire.add(new Monk(NamesHeros.getName(), 10, i));
                    break;
                case 1:
                    empire.add(new Pikeman(NamesHeros.getName(), 10, i));
                    break;
                case 2:
                    empire.add(new Crossbowman(NamesHeros.getName(), 10, i));
                    break;
                default:
                    empire.add(new Rustic(NamesHeros.getName(), 10, i));

            }


        }
        Scanner scan = new Scanner(System.in);

        unitedTeam.addAll(aliance);
        unitedTeam.addAll(empire);
        unitedTeam.sort((o1, o2) -> o2.getInitiativa() - o1.getInitiativa());

        View.view();
        while (true) {
            scan.nextLine()

            ;
            for (BasicHero item : unitedTeam) {
                if (empire.contains(item)) {
                    item.step(aliance, empire);
                } else {
                    item.step(empire, aliance);
                }
            }
            View.view();
        }



    }
}