public abstract class Wizard extends BasicHero {

    public Wizard(int id, int healthLevel, String name, String  type, int attackBasic, int initiativa, int heal) {
        super(id, healthLevel, name, type, attackBasic, initiativa);
        this.heal = heal;
    }
    public int heal;
}
