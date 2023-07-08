import units.*;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main (String[] args){
        ArrayList<BasicHero> aliance = new ArrayList<>();
        ArrayList<BasicHero> empire = new ArrayList<>();


        for (int i = 0; i<10; i++){
            int j = new Random().nextInt(4);
            switch (j){
                case 0: aliance.add(new Mag(NamesHeros.getName(),0,new Random().nextInt(50 )));
                    empire.add(new Monk(NamesHeros.getName(),9,new Random().nextInt(50 )));
                break;
                case 1: aliance.add(new Robber(NamesHeros.getName(),0,new Random().nextInt(50 )));
                    empire.add(new Pikeman(NamesHeros.getName(),9,new Random().nextInt(50 )));
                break;
                case 2: aliance.add(new Sniper(NamesHeros.getName(),0,new Random().nextInt(50 )));
                    empire.add(new Crossbowman(NamesHeros.getName(),9,new Random().nextInt(50 )));
                break;
                default: aliance.add(new Rustic(NamesHeros.getName(),0,new Random().nextInt(50 )));
                    empire.add(new Rustic(NamesHeros.getName(),9,new Random().nextInt(50 )));
            }


        }
        System.out.println("Команда 1:");
        aliance.forEach(i-> System.out.println(i.getInfo()));
        System.out.println();
        System.out.println("Команда 2:");
        empire.forEach(i-> System.out.println(i.getInfo()));

        System.out.println();
        System.out.println();

        System.out.println("Враги альянса: ");
        aliance.forEach(n-> n.step(empire));
        System.out.println();
        System.out.println("Враги империи: ");
        empire.forEach(n->n.step(aliance));
    }
}