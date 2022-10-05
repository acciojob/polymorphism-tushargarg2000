package com.driver;

public class Main {

    public static void main(String[] args){

        Product p = new Product();
        int ans = p.product(1,2);
        int ans1 = p.product(1,2,3);
        double ans3 = p.product(1.2,1.4);
        System.out.println(ans+" "+ans1+" "+ans3);
    }

    static class Product{

        public int product(int x, int y) {

            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }

    }

}

