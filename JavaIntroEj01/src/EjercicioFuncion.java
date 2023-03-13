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
                case "A":
                    newPhrase = newPhrase.concat("@");
                    break;
                case "e":
                case "E":
                    newPhrase = newPhrase.concat("#");
                    break;
                case "i":
                case "I":
                    newPhrase = newPhrase.concat("$");
                    break;
                case "o":
                case "O":
                    newPhrase = newPhrase.concat("%");
                    break;
                case "u":
                case "U":
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
        replacements.put("A", "@");
        replacements.put("E", "#");
        replacements.put("I", "$");
        replacements.put("O", "%");
        replacements.put("U", "*");

        for (int i = 0; i < phrase.length(); i++) {
            String letra = String.valueOf(phrase.charAt(i));
            String foundedReplacement = replacements.getOrDefault(letra, letra);
            newPhrase = newPhrase.concat(foundedReplacement);
        }

        return newPhrase;
    }
}
