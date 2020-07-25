package test.tddkata.romanos;

import java.util.Arrays;
import java.util.List;

public class NaturalesARomanos {

    List<String> simbolos = Arrays.asList("I", "V", "X", "L", "C", "D", "M");

    public String convertirARomanos(int i) {
        String numRomano = "";
        String numNatural = String.valueOf(i);
        for (int indice = (numNatural.length() -1), inc = 0; indice >= 0; indice--, inc += 2) {
            numRomano = convertirTodosaRomanos(Character.getNumericValue(numNatural.charAt(indice)), inc) + numRomano;
        }
        return numRomano;
    }

    private String convertirTodosaRomanos(int i, int indice) {
        switch (i) {
            case 4: return simbolos.get(indice) + simbolos.get(indice + 1);
            case 9: return simbolos.get(indice) + simbolos.get(indice + 2);
        }
        if (i <= 3)
            return agregarIncr(i, 1, "", simbolos.get(indice));

        if (i <= 8)
            return agregarIncr(i, 6, simbolos.get(indice + 1), simbolos.get(indice));

        return "";
    }

    private String agregarIncr(int i, int ini, String base, String inc) {
        String numRomano = base;
        for (int j = ini; j <= i; j++) {
            numRomano += inc;
        }
        return numRomano;
    }
}
