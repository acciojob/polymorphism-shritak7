package com.driver;

public class Main {
    public void main(String[] args){
        Product c2=new Product();
        c2.product(10,20);
        c2.product(20,30,40);
        c2.product(2.5,3.5);
    }

    public class Product{
        int x;
        int y;
        int z;
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