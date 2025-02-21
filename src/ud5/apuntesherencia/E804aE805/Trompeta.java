package ud5.apuntesherencia.E804aE805;

import java.util.Arrays;

public class Trompeta extends Instrumento {

    @Override
    public void interpretar() {
        System.out.println("Sonido de Trompeta: " + Arrays.toString(melodia));
    }
    
}
