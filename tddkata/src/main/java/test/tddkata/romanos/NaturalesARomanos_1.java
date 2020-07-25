package test.tddkata.romanos;

import java.util.Arrays;
import java.util.List;

public class NaturalesARomanos_1 {

    List<String> simbolos = Arrays.asList("I", "V", "X", "L", "C", "D", "M");

    public String convertirARomanos(int natural) {

        String numeroRomano = "";
        String numeroNatural = String.valueOf(natural);

        for (int i = numeroNatural.length() - 1, inc = 0; i >= 0; i--, inc += 2) {
            numeroRomano = convertirTodosARomanos(Character.getNumericValue(numeroNatural.charAt(i)), inc) + numeroRomano;
        }

        return numeroRomano;
    }

    public String convertirTodosARomanos(int natural, int indice) {

        switch (natural) {
            case 4: return simbolos.get(indice) + simbolos.get(indice + 1);
            case 9: return simbolos.get(indice) + simbolos.get(indice + 2);
        }

        if (natural <= 3)
            return agregarIncremento(natural, 1, "", simbolos.get(indice));

        if (natural <= 8)
            return agregarIncremento(natural, 6, simbolos.get(indice + 1), simbolos.get(indice));

        return "";
    }

    private String agregarIncremento(int natural, int inicio, String base, String incremento) {
        String romano = base;
        for (int i = inicio; i <= natural ; i++) {
            romano += incremento;
        }
        return romano;
    }


}
