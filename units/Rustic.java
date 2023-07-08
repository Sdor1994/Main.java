package units;

import java.util.ArrayList;

public class Rustic extends BasicHero{

    public Rustic(String name, int x, int y) {

        super(6, 100, name, "units.Rustic", 0,2, x, y);
    }


    @Override
    public String getInfo() {

        return ("Name: "+ name + ", Type:"+ type + ", ID: "+ id+ ",Health:"+ healthLevel+", Initiative:"
                +initiativa+" units.Position: "+ place.positionX +","+ place.positionY);
    }

    @Override
    public void step(ArrayList<BasicHero> enemies) {
        int[] tmp = findNearEnemy(enemies);
        System.out.println("Ln= "+tmp[0] + " Oposition name: "+ enemies.get(tmp[1]).name);
    }

}
