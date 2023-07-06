public abstract class BasicHero {
    int id;
    int healthLevel;
    String name ;
    String type;
    int attackBasic;
    int initiativa;

    public BasicHero(int id, int healthLevel, String name, String  type, int attackBasic, int initiativa) {
        this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.type = "type";
        this.attackBasic = attackBasic;
        this.initiativa = initiativa;
    }
}
