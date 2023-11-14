package com.driver;

public class Main {

    public static void main(String[] args) {

        Product p = new Product();

        int ans1 = p.product(10,20);

        int ans2 = p.product(10,20,30);

        double ans3 = p.product(10.0,20.0);

        System.out.println(ans1+" "+ans2+" "+ans3);


    }
    public static class Product { //I am making a mistake here and not setting it public

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
