package units;

import java.util.ArrayList;

public abstract class BasicHero implements Actions {
    int id;
    int healthLevel;
    String name ;
    protected String type;
    int attackBasic;
    protected int initiativa;

    protected Position place;

    public int getInitiativa() {
        return initiativa;
    }

    public BasicHero(int id, int healthLevel, String name, String  type, int attackBasic, int initiativa, int x, int y) {
        this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.type = type;
        this.attackBasic = attackBasic;
        this.initiativa = initiativa;
        place = new Position(x,y);
    }
    public Position getPlace(){
        return place;
    }

    public int getHealthLevel(){
        return healthLevel;
    }

    public void getDamage (float damage){
        this.healthLevel -= damage;
        if (healthLevel <0) healthLevel =0;
        return ;
    }
    protected BasicHero findNearEnemy (ArrayList<BasicHero> enemins){
        double min = 1000;
        int count = 0;
        for (int i =0 ; i< enemins.size(); i++){
            if (place.calcDistance(enemins.get(i).place)<min & enemins.get(i).healthLevel > 0) {
                min= place.calcDistance(enemins.get(i).place);
                count=i;
            }
        }
        return enemins.get(count);
    }

    @Override
    public String toString() {
        return super.getClass().getSimpleName();
    }

    public void step(){

    };
}
