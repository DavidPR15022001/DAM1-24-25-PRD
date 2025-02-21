package ud5.apuntesherencia.E804aE805;

import java.util.Arrays;

public class Guitarra extends Instrumento {

    @Override
    public void interpretar() {
        System.out.println("Sonido de Guitarra: " + Arrays.toString(melodia));
    }
    
}
