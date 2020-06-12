package com.company;

public class UseMethod {

    public static void display(){

        System.out.println("Display is good");

    }

    public void laptopdisplay(){


        System.out.println("Laptop display is top class");
    }

    public void doSummation(){
        int number1=2;
        int number2=3;
        int sum=number1+number2;
        System.out.println("The sum of two integer is: "+sum);

    }
    public void doSubstraction(int num1,int num2){
        int subs= num1-num2;
        System.out.println("Value of subtraction : "+subs);

    }


    public int doMultiplication(){

        int num1=90;
        int num2=89;

        int multi=num1*num2;
        System.out.println("Multiplication of two number: "+multi);



        return multi;
    }

    public int doMultiplication(int num1,int num2, int num3,int num4){
        int multi=(num1*num2)+(num3*num4);
        System.out.println("The value is :"+multi);
        return multi;

    }



    public static void main(String[] args) {
        UseMethod.display();
        UseMethod disp=new UseMethod();
        disp.laptopdisplay();
        disp.doSummation();
        disp.doSubstraction(23,56);
        disp.doMultiplication();
        disp.doMultiplication(21,23,32,31);

    }

}
