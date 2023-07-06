public abstract class Shooters extends BasicHero{
    public Shooters(int id, int healthLevel, String name, String type, int attackBasic, int initiativa, int distantAttack) {
        super(id, healthLevel, name, type, attackBasic, initiativa);
        this.distantAttack = distantAttack ;
    }
    int distantAttack;
}
