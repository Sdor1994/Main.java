package units;

import java.util.ArrayList;

public class Rustic extends BasicHero{

    public Rustic(String name, int x, int y) {

        super(6, 100, name, "Rustic", 0,2, x, y);
    }


    @Override
    public String getInfo() {

        return (name +" " +type + "  ♡ :"+ healthLevel);
    }

    public boolean busy = false;
    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> aliance) {
        if (this.healthLevel > 0) this.busy = false;
    }

}
