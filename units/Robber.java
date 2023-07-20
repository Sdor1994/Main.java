package units;

import java.util.ArrayList;

public class Robber extends Infantry {
    public Robber(String name, int x, int y) {
        super(2, 100, name, "Robber", 5, 8, x, y);
    }

    @Override
    public void step(ArrayList<BasicHero> enemins, ArrayList<BasicHero> aliance) {

    }
}
