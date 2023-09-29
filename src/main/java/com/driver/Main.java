package com.driver;

public class Main {
   public static class A {
      String meth(){
         return "Invoking method from class A";
      }
   }
   public static class B extends A {
      @Override
      String meth(){
         return "Method is overridden in Extendend class B";
      }
   }
   public static void main(String[] args){
      B objB = new B();
      objB.meth();
      B obj2 = new B();
      obj2.meth();
   }
}