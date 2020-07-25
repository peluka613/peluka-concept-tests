package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;



public class FunctionTRExample {
    public static void main(String args[]) {
        System.out.println();
        System.out.println();
        System.out.println();


        Function<Employee, String> funcEmpToString = Employee::getName;

        List<Employee> employeeList =
                Arrays.asList(new Employee("Tom Jones", 45),
                        new Employee("Harry Major", 25),
                        new Employee("Ethan Hardy", 65),
                        new Employee("Nancy Smith", 15),
                        new Employee("Deborah Sprightly", 29));

/*
        List<Employee> empList = employeeList.stream().map(Function.identity()).collect(Collectors.toList());
        empList.forEach(System.out::println);
*/


/*
        String empNameListInitials = employeeList.stream()
                .map(funcEmpToString.andThen(s -> s.substring(0, 1)))
                .collect(Collectors.joining(", ", "[", "]"));
        System.out.println(empNameListInitials);
*/




/*
        StringJoiner sj = new StringJoiner(", ");
        List<String> empNameList = employeeList.stream().map(funcEmpToString).collect(Collectors.toList());
        empNameList.forEach(sj::add);
        System.out.println(sj.toString());
*/



/*
        List<Employee> empList = employeeList.stream().map(Function.identity()).collect(Collectors.toList());
        empList.forEach(System.out::println);
*/

/*
        Additable<Integer> anddIntegers = (i1, i2) -> i1 + i2;
        Additable<String> anddStrings = (s1, s2) -> s1.concat(s2);

        add(anddIntegers, 5, 7);
        add(anddStrings, "Hola ", "POD");

        System.out.println();
        System.out.println();
        System.out.println();
*/

/*
        StringJoiner sjr =
            new StringJoiner(":", "[", "]");
        sjr.add("George").add("Sally").add("Fred");
        System.out.println(sjr.toString());
*/

/*
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        String commaSeparatedNumbers = numbers.stream()
                .map(i -> i.toString())
                .collect(Collectors.joining(", "));
        System.out.println(commaSeparatedNumbers);
*/


        Function<Double, Double> square = number -> number * number;
        Function<Double, Double> half = number -> number / 2;

        List<Double> numbers = Arrays.asList(10D, 4D, 12D);

        System.out.println(mapIt(numbers, square));
        System.out.println(mapIt(numbers, half));
        System.out.println(mapIt(numbers, Function.identity()));


    }

    static List<Double> mapIt(List<Double> numbers, Function<Double, Double> fx) {
        List<Double> result = new ArrayList<>();
        numbers.forEach(num -> result.add(fx.apply(num)));
        return result;
    }

    static void add(Additable additable, Object o1, Object o2) {
        System.out.println(additable.add(o1, o2));
    }



}


@FunctionalInterface
interface Additable<T> {
    T add(T t1, T t2);
}

/*
@FunctionalInterface
interface Function<T, R> {
    R apply(T t);
    default <V> Function<V, R> compose(Function<? super V, ? extends T> before) {
        Objects.requireNonNull(before);
        return (V v) -> apply(before.apply(v));
    }
    default <V> Function<T, V> andThen(Function<? super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(apply(t));
    }
    static <T> Function<T, T> identity() {
        return t -> t;
    }
}
*/

class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


