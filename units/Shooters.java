package units;

import java.util.ArrayList;

public abstract class Shooters extends BasicHero{
    public Shooters(int id, int healthLevel, String name, String type, int attackBasic, int initiativa,int shoots, int distantAttack,int x,int y) {
        super(id, healthLevel, name, type, attackBasic, initiativa, x, y );
        this.distantAttack = distantAttack ;
        this.shoots= shoots;
    }
    int distantAttack;
    protected int shoots;


    public void step(ArrayList<BasicHero> enemies,ArrayList<BasicHero> ours ) {

        if (this.healthLevel <=0 || this.shoots == 0) return;

        BasicHero tmp = findNearEnemy(enemies);
        tmp.healthLevel = tmp.healthLevel -  this.attackBasic;

        for (BasicHero item: ours){
            if (item.type.contains("Rustic")) return;
        }
        this.shoots --;
    }

    @Override
    public String getInfo(){
        return ("Name: "+ name + ", Type:"+ type+ ", ID: "+ id+ ",Health:"+ healthLevel+", Initiative:"+initiativa
                + " distantAttack: "+distantAttack +" Shoots: "+shoots+" units.Position: "+ place.positionX +","+ place.positionY);
    }
}
