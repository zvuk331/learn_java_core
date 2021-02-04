package org.example.lesson4;

public class AnonymousClass {
    public static void main(String[] args) {
        AnyF anyF = new AnyF() {
            @Override
            public int anyOperation(int a, int b) {
                return a+b;
            }
        };
        System.out.println(anyF.anyOperation(4,3));
    }

}
interface AnyF {
    int anyOperation(int a, int b);
}
