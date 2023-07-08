public abstract class Infantry extends BasicHero {
    public Infantry(int id, int healthLevel, String name, String type, int attackBasic, int initiativa) {
        super(id, healthLevel, name, type, attackBasic, initiativa);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return ("Name: " + name + ", Type:" + type + ", ID: " + id + ",Health:" + healthLevel + ", Initiative: " + initiativa);
    }
}
