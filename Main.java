import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main (String[] args){
        BasicHero harry = new Mag("harry");
        BasicHero alduin = new Monk("alduin");
        BasicHero robbin = new Robber("robbin");
        BasicHero ahiles = new Pikeman("ahiles");
        BasicHero sam = new Sniper("sam");
        BasicHero aleks = new Crossbowman("aleks");
        BasicHero jon = new Rustic("jon");


        ArrayList<BasicHero> allHeros = new ArrayList<>();
        allHeros.add(harry);
        allHeros.add(alduin);
        allHeros.add(robbin);
        allHeros.add(ahiles);
        allHeros.add(sam);
        allHeros.add(aleks);
        allHeros.add(jon);

        ArrayList<BasicHero> team1 = new ArrayList<>();
        ArrayList<BasicHero> team2 = new ArrayList<>();


        for (int i = 0; i<10; i++){
            int j = new Random().nextInt(7);
            switch (j){
                case 0: team1.add(new Mag(NamesHeros.getName()));
                break;
                case 1: team1.add(new Monk(NamesHeros.getName()));
                break;
                case 2: team1.add(new Robber(NamesHeros.getName()));
                break;
                case 3: team1.add(new Pikeman(NamesHeros.getName()));
                break;
                case 4: team1.add(new Sniper(NamesHeros.getName()));
                break;
                case 5: team1.add(new Crossbowman(NamesHeros.getName()));
                break;
                default: team1.add(new Rustic(NamesHeros.getName()));
            }
            int k = new Random().nextInt(7);
            switch (k){
                case 0: team2.add(new Mag(NamesHeros.getName()));
                    break;
                case 1: team2.add(new Monk(NamesHeros.getName()));
                    break;
                case 2: team2.add(new Robber(NamesHeros.getName()));
                    break;
                case 3: team2.add(new Pikeman(NamesHeros.getName()));
                    break;
                case 4: team2.add(new Sniper(NamesHeros.getName()));
                    break;
                case 5: team2.add(new Crossbowman(NamesHeros.getName()));
                    break;
                default: team2.add(new Rustic(NamesHeros.getName()));
            }

        }
        System.out.println("Команда 1:");
        team1.forEach(i-> System.out.println(i.getInfo()));
        System.out.println();
        System.out.println("Команда 2:");
        team2.forEach(i-> System.out.println(i.getInfo()));
    }
}