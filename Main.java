import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main (String[] args){
        ArrayList<BasicHero> team1 = new ArrayList<>();
        ArrayList<BasicHero> team2 = new ArrayList<>();


        for (int i = 0; i<10; i++){
            int j = new Random().nextInt(4);
            switch (j){
                case 0: team1.add(new Mag(NamesHeros.getName(),0,new Random().nextInt(50 )));
                        team2.add(new Monk(NamesHeros.getName(),9,new Random().nextInt(50 )));
                break;
                case 1: team1.add(new Robber(NamesHeros.getName(),0,new Random().nextInt(50 )));
                        team2.add(new Pikeman(NamesHeros.getName(),0,new Random().nextInt(50 )));
                break;
                case 2: team1.add(new Sniper(NamesHeros.getName(),0,new Random().nextInt(50 )));
                        team2.add(new Crossbowman(NamesHeros.getName(),0,new Random().nextInt(50 )));
                break;
                default: team1.add(new Rustic(NamesHeros.getName(),0,new Random().nextInt(50 )));
                        team2.add(new Rustic(NamesHeros.getName(),0,new Random().nextInt(50 )));
            }


        }
        System.out.println("Команда 1:");
        team1.forEach(i-> System.out.println(i.getInfo()));
        System.out.println();
        System.out.println("Команда 2:");
        team2.forEach(i-> System.out.println(i.getInfo()));
    }
}