package com.test;

public class Main {

    private String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

    public static void main(String[] args) {

        String[] test = {"Any testing text", "Second testing text, change value", ""};

        Main main = new Main();

        for (int i = 0; i < test.length; ++i) {
            System.out.println(main.checkPangrams(test[i]));
        }
    }

    private String checkPangrams(String pangram) {
        String result = "";

        //1) Poner en minusculas
        pangram = pangram.toLowerCase();

        //2) Recorrer alfabeto
        for (int i = 0; i < alphabet.length; ++i) {

            if (!pangram.contains(alphabet[i])) {
                result = result + alphabet[i];
            }
        }
        return result;
    }

}
