public abstract class Shooters extends BasicHero{
    public Shooters(int id, int healthLevel, String name, String type, int attackBasic, int initiativa, int distantAttack,int x,int y) {
        super(id, healthLevel, name, type, attackBasic, initiativa, x, y );
        this.distantAttack = distantAttack ;
    }
    int distantAttack;
    @Override
    public void step() {

    }
    @Override
    public String getInfo(){
        return ("Name: "+ name + ", Type:"+ type+ ", ID: "+ id+ ",Health:"+ healthLevel+", Initiative:"+initiativa
                + " distantAttack: "+distantAttack);
    }
}
