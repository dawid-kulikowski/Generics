package application;

public class BoundedGenerics <T extends Number,V extends Number> {

    T ob;
    V ob1;

    public BoundedGenerics(T ob, V ob1) {
        this.ob = ob;
        this.ob1 = ob1;
    }

    double multiplication() {
        return ob.intValue() * ob1.intValue();
    }

    static boolean absEqual(BoundedGenerics<?, ?> ob, BoundedGenerics<?, ?> ob1) {
        if (Math.abs(ob.ob.doubleValue()) == Math.abs(ob1.ob1.doubleValue()))
            return true;
        return false;
    }
}
