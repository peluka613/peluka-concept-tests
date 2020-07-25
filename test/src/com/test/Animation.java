package com.test;

import java.util.ArrayList;
import java.util.List;

public class Animation {

    public static void main(String[] args) {

        Object[][] test = {{2, "...R...."}, {3, "RR..LRL"}, {2, "LRLR.LRLR"}, {10, "RLRLRLRLRL"}, {1, "..."}, {1, "LRRL.LR.LRR.R.LRRL."}};

        Animation animation = new Animation();

        for (int i = 0; i < test.length; ++i) {
            String[] result = animation.animate((int) test[i][0], (String) test[i][1]);

            //Imprimir resultado
            System.out.println(test[i][0] + ", " + (String) test[i][1]);
            for (int j = 0; j < result.length; ++j) {

                System.out.println(result[j]);

            }

            System.out.println("-----------------------------------");
        }
    }

    public String[] animate(int speed, String init) {
        String[] result = null;
        List temp = new ArrayList();
        init = init.toUpperCase();
        temp.add(init.replace("R", "X").replace("L", "X"));
        String aux = init;

        // Buscar L y R hasta que queden solo puntos
        while (aux.contains("L") || aux.contains("R")) {

            // Convertir la cadena en un arreglo de caracteres
            char[] chars = aux.toCharArray();

            // Recorrer el arreglo de caracteres de izquierda a derecha buscando L
            for (int i = 0; i < aux.length(); ++i) {
                if (chars[i] == 'L') {
                    // Reemplazar L por .
                    chars[i] = '.';

                    // Mover L a la izquierda o eliminar
                    if (i >= speed) {
                        int j = i - speed;
                        chars[j] = chars[j] == '.' ? 'L' : 'P';
                    }
                }

                if (chars[i] == 'P') {
                    // Reemplazar P por R
                    chars[i] = 'R';

                    // Mover P a la izquierda o eliminar
                    if (i >= speed) {
                        int j = i - speed;
                        chars[j] = chars[j] == '.' ? 'L' : 'P';
                    }
                }
            }


            // Recorrer el arreglo de caracteres de derecha a izquierda buscando R
            for (int i = aux.length() - 1; i >= 0; --i) {
                if (chars[i] == 'R') {

                    // Reemplazar R por .
                    chars[i] = '.';

                    // Mover R a la derecha o eliminar
                    if (i + speed < aux.length()) {
                        int j = i + speed;
                        chars[j] = chars[j] == '.' ? 'R' : 'P';
                    }
                }

                if (chars[i] == 'P') {
                    // Reemplazar P por L
                    chars[i] = 'L';

                    // Mover P a la izquierda o eliminar
                    int j = i + speed;
                    if (j < aux.length()) {
                        chars[j] = chars[j] == '.' ? 'R' : 'P';
                    }
                }
            }

            aux = String.valueOf(chars);
            //System.out.println(aux);
            temp.add(aux.replace("L", "X").replace("R", "X").replace("P", "X"));
        }


        Object[] result2 = temp.toArray(new String[temp.size()]);
        result = (String[]) result2;
        return result;
    }

}
