import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.HashMap;
import java.util.Scanner;

public class EjercicioFuncion {
    public static void main(String[] args) {
        Scanner leyendo = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = leyendo.nextLine();
        String result = palabraModificada(frase);
        System.out.println(result);
        String refactoredResult = refactored(frase);
        System.out.println(refactoredResult);
    }

    public static String palabraModificada(String frase) {
        String newPhrase = "";
        for (int i = 0; i < frase.length(); i++) {
            String letra = String.valueOf(frase.charAt(i));

            switch (letra) {
                case "a":
                    newPhrase = newPhrase.concat("@");
                    break;
                case "e":
                    newPhrase = newPhrase.concat("#");
                    break;
                case "i":
                    newPhrase = newPhrase.concat("$");
                    break;
                case "o":
                    newPhrase = newPhrase.concat("%");
                    break;
                case "u":
                    newPhrase = newPhrase.concat("*");
                    break;
                default:
                    newPhrase = newPhrase.concat(letra);

            }


        }

        return newPhrase;
    }

    public static String refactored(String phrase) {
        String newPhrase = "";
        HashMap<String, String> replacements = new HashMap<>();
        replacements.put("a", "@");
        replacements.put("e", "#");
        replacements.put("i", "$");
        replacements.put("o", "%");
        replacements.put("u", "*");

        for (int i = 0; i < phrase.length(); i++) {
            String letra = String.valueOf(phrase.charAt(i));
            String foundedReplacement = replacements.getOrDefault(letra, letra);
            newPhrase = newPhrase.concat(foundedReplacement);
        }

        return newPhrase;
    }
}
