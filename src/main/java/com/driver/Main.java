package com.driver;

public class Main {
    public static void main(String[] args) {
        Product P=new Product();
        P.product(3,5);
        P.product(2,5,10);
        P.product(2.0,5.0);
    }
    public static class Product{
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public double product(double x,double y){
            return x*y;
        }
    }
}