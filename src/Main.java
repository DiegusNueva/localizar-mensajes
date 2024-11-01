import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {

        System.out.println(Localizando.construyeSujeto(
                Localizando.RECURSOS.getString("manzana"),
                Localizando.RECURSOS.getString("roja")
        ));

        System.out.println(Localizando.construyeSujeto(
                Localizando.RECURSOS.getString("manzana"),
                Localizando.RECURSOS.getString("verde")
        ));

        System.out.println(Localizando.construyeSujeto(
                Localizando.RECURSOS.getString("pelota"),
                Localizando.RECURSOS.getString("roja")
        ));

        System.out.println(Localizando.construyeSujeto(
                Localizando.RECURSOS.getString("pelota"),
                Localizando.RECURSOS.getString("verde")
        ));
        System.out.println();

        System.out.println(MessageFormat.format(
                Localizando.RECURSOS.getString("frase"),
                Localizando.construyeSujeto(Localizando.RECURSOS.getString("pelota"),
                        Localizando.RECURSOS.getString("roja")
        )));

    }
}