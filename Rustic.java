public class Rustic extends BasicHero{

    public Rustic(String name, int x, int y) {

        super(6, 100, name, "Rustic", 0,2, x, y);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {

        return ("Name: "+ name + ", Type:"+ type + ", ID: "+ id+ ",Health:"+ healthLevel+", Initiative:"+initiativa);
    }
}
