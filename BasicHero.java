public abstract class BasicHero implements Actions {
    int id;
    int healthLevel;
    String name ;
    String type;
    int attackBasic;
    int initiativa;

    protected Position place;

    public BasicHero(int id, int healthLevel, String name, String  type, int attackBasic, int initiativa, int x, int y) {
        this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.type = type;
        this.attackBasic = attackBasic;
        this.initiativa = initiativa;
        place = new Position(x,y);
    }

}
