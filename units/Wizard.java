package units;

import java.util.ArrayList;

public abstract class Wizard extends BasicHero {

    public Wizard(int id, int healthLevel, String name, String  type, int attackBasic, int initiativa, int heal, int x, int y) {
        super(id, healthLevel, name, type, attackBasic, initiativa, x, y);
        this.heal = heal;
    }
    public int heal;

    public void step(ArrayList<BasicHero> enemies,ArrayList<BasicHero> ours) {
        if (this.healthLevel > 0 ) {
            BasicHero tmp = findNearEnemy(enemies);
            for (BasicHero item : ours){
                if (item.healthLevel<99 & item.healthLevel >0 ){
                    item.healthLevel += this.heal;
                    return;
                } else tmp.getDamage(this.attackBasic);
                }
            }
        }

    @Override
    public String getInfo(){
        return (name + ", "+ type + " ♡ :"+ healthLevel+" heal: "+heal );
    }
}
