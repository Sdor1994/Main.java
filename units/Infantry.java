package units;

import java.util.ArrayList;

public abstract class Infantry extends BasicHero {
    public Infantry(int id, int healthLevel, String name, String type, int attackBasic, int initiativa, int x, int y) {
        super(id, healthLevel, name, type, attackBasic, initiativa, x, y);
    }


    public void step(ArrayList<BasicHero> enemies) {

    }

    @Override
    public String getInfo() {
        return (name + ", " + type + " ♡ :" + healthLevel);
    }

    Position tmpc = new Position(place.positionX, place.positionY);

    @Override
    public void step(ArrayList<BasicHero> enemins, ArrayList<BasicHero> ours) {
        if (this.healthLevel <= 0) return;
        BasicHero nearestEnemy = findNearEnemy(enemins);
        if (this.place.calcDistance(nearestEnemy.place) < 2) {
            nearestEnemy.getDamage(this.attackBasic);
            return;
        }
        if (Math.abs(this.place.positionX - nearestEnemy.place.positionX) > Math.abs(this.place.positionY - nearestEnemy.place.positionY)) {
            if (this.place.positionX > nearestEnemy.place.positionX) {
                tmpc.positionX -= 1;

            } else {
                tmpc.positionX += 1;
            }
        } else {
            if (this.place.positionY > nearestEnemy.place.positionY) {
                tmpc.positionY -= 1;
            } else {
                tmpc.positionY += 1;
            }
        }
        boolean flag = false;
        for (BasicHero item : ours) {
            if (item.place.positionX == tmpc.positionX & item.place.positionY == tmpc.positionY) flag = true;
        }
        if (flag) return;
        this.place.positionX = tmpc.positionX;
        this.place.positionY = tmpc.positionY;


    }
}
