package MethodDetails;

class Calculator{
    int add(int a , int b){
        return a+b;

    }
}
public class MethodDemo {
    public static void main(String[]args){
        Calculator cal= new Calculator();
        int result = cal.add(10,20);
        System.out.println("Return"+result);

    }
}
