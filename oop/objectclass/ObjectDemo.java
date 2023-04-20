package com.learnjava.oop.objectclass;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {  // Hashcode gives is a random number to identify if an object is the same one or not.
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Already covered
    @Override
    public String toString() {
        return super.toString();
    }

    // Already covered
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34);
        ObjectDemo obj2 = obj1;
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }

}
