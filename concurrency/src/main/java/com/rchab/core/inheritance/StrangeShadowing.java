package com.rchab.core.inheritance;

/*
* You cannot access c.i because i is private in B.
* But you can access ( (A)c).i because i is public in A.
* Remember that member variables are shadowed and not overridden.
* So, B's i shadows A's i and since B's i is private, you can't access A's i unless you cast the reference to A.
* You cannot access c.j because j is private in A.
*/
public class StrangeShadowing {
    class A{
        public int i = 10;
        private int j = 20;

    }

    class B extends A{
        private int i = 30; //1
        public int k = 40;

    }

    static class C extends B{
    }

        public static void main(String args[]){
            C c = new C();
//            System.out.println(c.i); //2
//            System.out.println(c.j); //3
            System.out.println(c.k);
        }
}
