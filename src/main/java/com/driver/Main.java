package com.driver;

public class Main {

    public static void main(String[] args) {

        Product p = new Product();

        Person2 p2 = new Person2();

        int ans = p.product(10,20);
        int ans1 = p.product(10,20,304);

        double ans3 = p.product(1.0,2.0);

        System.out.println(ans+" "+ans1+" "+ans3);
    }

    static class Product {

        public int product(int x, int y) {
            return x*y;
        }

        public int product(int x, int y, int z) {
            return x*y*z;
        }

        public double product(double x, double y) {
            return x*y;
        }

    }

}

class Person2{

    int age;
}
