package units;

import java.util.ArrayList;

public abstract class Infantry extends BasicHero {
    public Infantry(int id, int healthLevel, String name, String type, int attackBasic, int initiativa, int x, int y ) {
        super(id, healthLevel, name, type, attackBasic, initiativa,x ,y );
    }

    @Override
    public void step(ArrayList<BasicHero> enemies) {
        int[] tmp = findNearEnemy(enemies);
        System.out.println("Ln= "+tmp[0] + " Oposition name: "+ enemies.get(tmp[1]).name);
    }

    @Override
    public String getInfo() {
        return ("Name: " + name + ", Type:" + type + ", ID: " + id + ",Health:" + healthLevel + ", Initiative: " + initiativa
                +" units.Position: "+ place.positionX +","+ place.positionY);
    }
}
