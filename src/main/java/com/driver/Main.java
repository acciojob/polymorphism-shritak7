package com.driver;

public class Main {
    public static void main(String[] args){
        Product c2=new Product();
        System.out.println(c2.product(10,20));
        System.out.println(c2.product(20,30,40));
        System.out.println(c2.product(2.5,3.5));
    }

    public static class Product{

        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {

            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }

    }

}