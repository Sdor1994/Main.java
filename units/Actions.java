package units;

import java.util.ArrayList;

public interface Actions {
   void step(ArrayList<BasicHero> enemins, ArrayList<BasicHero> aliance);
   String getInfo();
}
