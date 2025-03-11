package contornos.ud3;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * (9.0 / 5.0) + 32;
    }
}

/* En el calculo se realizo la correción de usar decimales y cambiar de 5 / 9 a 9.0 / 5.0 pues la formula de conversion es (9 / 5) + 32 y debemos usar
decimales porque se definió celsius como double en caso de cambiar celsius a int se podrian usar sin decimales pero habria que cambiar a 9 / 5 en vez de 5 / 9 de todas formas */