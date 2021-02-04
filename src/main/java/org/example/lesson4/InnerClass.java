package org.example.lesson4;

public class InnerClass {
    String color;
    int horsePower;
    Engine engine;

    public InnerClass(String color, int horsePower) {
        this.color = color;
        this.horsePower = horsePower;
        engine = this.new Engine(horsePower);
    }

    @Override
    public String toString() {
        return "InnerClass{" +
                "color='" + color + '\'' +
                ", horsePower=" + horsePower +
                ", engine=" + engine +
                '}';
    }

    class Engine {
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}

class Test2 {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass("black", 255);
        System.out.println(innerClass);
    }
}
