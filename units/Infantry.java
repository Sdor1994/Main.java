package units;

import java.util.ArrayList;

public abstract class Infantry extends BasicHero {
    public Infantry(int id, int healthLevel, String name, String type, int attackBasic, int initiativa, int x, int y ) {
        super(id, healthLevel, name, type, attackBasic, initiativa,x ,y );
    }


    public void step(ArrayList<BasicHero> enemies) {

    }

    @Override
    public String getInfo() {
        return ( name + ", " + type + " ♡ :" + healthLevel);
    }
}
