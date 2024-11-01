import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Localizando {

    public static final ResourceBundle RECURSOS = ResourceBundle.getBundle("vocabulario", Locale.UK);

    public static String construyeSujeto(String nombre, String adjetivo) {
        return MessageFormat.format(RECURSOS.getString("sujeto"),
                nombre, adjetivo);
    }

}
