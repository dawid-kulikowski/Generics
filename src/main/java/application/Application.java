package application;

public class Application {
    public static void main(String[] args) {
        System.out.println("Generic tests");

        Generics<String, Integer> ob1 = new Generics<>("text", 25);
        Generics<Boolean, String> ob2 = new Generics<>(false, "text");
        Generics<Integer, Boolean> ob3 = new Generics<>(200, true);

        BoundedGenerics<Double, Integer> ob4 = new BoundedGenerics<>(5.5,2);
        BoundedGenerics<Integer,Double> ob5 = new BoundedGenerics<>(2,5.5);

        ob1.showType();
        ob2.showType();
        ob3.showType();

        System.out.println(ob4.multiplication());
        System.out.println(BoundedGenerics.absEqual(ob4,ob5));

    }
}
