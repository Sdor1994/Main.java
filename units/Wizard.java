package units;

import java.util.ArrayList;

public abstract class Wizard extends BasicHero {

    public Wizard(int id, int healthLevel, String name, String  type, int attackBasic, int initiativa, int heal, int x, int y) {
        super(id, healthLevel, name, type, attackBasic, initiativa, x, y);
        this.heal = heal;
    }
    public int heal;

    @Override
    public void step(ArrayList<BasicHero> enemies) {
        int[] tmp = findNearEnemy(enemies);
        System.out.println("Ln= "+tmp[0] + " Oposition name: "+ enemies.get(tmp[1]).name);
    }

    @Override
    public String getInfo(){
        return ("Name: "+ name + ", Type:"+ type + ", ID: "+ id+ ",Health:"+ healthLevel+", Initiative:"+initiativa
                + " heal: "+heal +" units.Position: "+ place.positionX +","+ place.positionY);
    }
}
