package org.example.lesson4;



public class StaticNestedClass {
    public String color;
    public int doorCount;
    Engine engine;

    public StaticNestedClass(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "StaticNestedClass{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    static class Engine {
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
class Test {
    public static void main(String[] args) {
        StaticNestedClass.Engine engine = new StaticNestedClass.Engine(256);
        System.out.println(engine);
        StaticNestedClass cl = new StaticNestedClass("red", 4,engine);
        System.out.println(cl);
    }
}
