package units;

import java.util.ArrayList;

public class Pikeman extends Infantry{
    public Pikeman(String name, int x, int y) {
        super(3, 100, name, "Pikeman", 6, 7, x, y);
    }

    @Override
    public void step(ArrayList<BasicHero> enemins, ArrayList<BasicHero> aliance) {

    }
}
