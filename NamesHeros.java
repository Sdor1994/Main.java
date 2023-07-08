import java.util.Random;

public enum NamesHeros {
    Albert, Alejandro, Alex, Alexander, Alfred, Bernard, Blake, Brandon, David, Dennis,
    Devin, Diego, Dominic, Gavin, Geoffrey, George, Gerld, Harry, Hayden, Henry, Herbert, Horace;

    public static String getName(){
        String s = String.valueOf(NamesHeros.values()[new Random().nextInt(NamesHeros.values().length)]);
        return s;
    }

}