public class Rustic extends BasicHero{

    public Rustic(String name) {
        super(6, 100, name, "Rustic", 0,2);
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {

        return ("Name: "+ name + ", Type:"+ type + ", ID: "+ id+ ",Health:"+ healthLevel+", Initiative:"+initiativa);
    }
}
