package com.test;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class NashornTest {
    public static void main(String args[]) throws ScriptException {

        ScriptEngine nashorn = new ScriptEngineManager().getEngineByName("nashorn");

        String name = "Java8 Nashorn";

        nashorn.eval("print('" + name + "')");
        Integer result = (Integer) nashorn.eval("10 + 2");
        System.out.println(result);

        nashorn.eval("a = " + 2);
        nashorn.eval("print(a)");

    }
}
