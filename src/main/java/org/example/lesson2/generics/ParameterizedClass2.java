package org.example.lesson2.generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("name",1);
        System.out.println(pair);

        Pair<Integer, Double> pair2= new Pair<>(5, Math.PI);
        Double res = pair2.value1 * pair2.value2;
        System.out.printf("Res is %.2f", res);
    }
}

class Pair<V1,V2> {
    V1 value1;
    V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
