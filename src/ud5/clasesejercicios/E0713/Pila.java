package ud5.clasesejercicios.E0713;
import ud5.clasesejercicios.E0711a2.Lista;
public class Pila {
    private Lista lista;

    public Pila() {
        lista = new Lista();
    }

    public void apilar(Integer e){
        lista.insertarFinal(e);
    }

    public Integer desapilar(){
        return lista.eliminarEn(lista.length() - 1);
    }

    public static void main(String[] args) {
        Pila p = new Pila();

        p.apilar(1);
        p.apilar(2);
        p.apilar(3);

        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        
    }

}
