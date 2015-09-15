package com.rchab.core.inheritance;

/*
b points to an object of class Bat, which does not extend from Bird.
Now, it is possible for b to point to an object of any subclass of Bat.
However, it is not possible for that sub class to extend Bird (because a class can at most extend from only one class).
Therefore, it is not possible for b to point to an object of a class that extends Bird.
The compiler figures out this fact at compile time itself and so the code fails to compile.
*/

public class InstanceOfClever
{
    interface Flyer{ }
    class Bird implements Flyer { }
    static class Eagle extends Bird { }
    static class Bat {
    }

    public static void main(String[] args) {
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();

        if(f instanceof Flyer) System.out.println("f is a Flyer");
        if(e instanceof Bird) System.out.println("e is a Bird");
//        if(b instanceof Bird) System.out.println("f is a Bird");
    }
}
