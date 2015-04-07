

package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class MyCalculator implements Calculator {

    public MyCalculator(double a, String o, double b) {
        System.out.println("Укажите операцию: -, +, *, /, help, exit");
        o = Reader.readLine();
        if (o.equals("exit")) {
            System.exit(0);
        }
        if (o.equals("help")) {
            System.out.println("Calculator can add, subtract, multiply and divide any two numbers. You can not divide by zero.");
            return;
        }

        if (o.equals("+")) {
            System.out.println("Введите первое число");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            a = reader.readLine();
            System.out.println("Введите второе число");
            b = reader.readLine();
            System.out.println(a + " + " + b + " = " + add(a, b));
            return;
        }
        if (o.equals("-")) {
            System.out.println("Введите первое число");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            a = reader.readLine();
            System.out.println("Введите второе число");
            b = reader.readLine();
            System.out.println(a + " + " + b + " = " + sub(a, b));
            return;
        }
        if (o.equals("*")) {
            System.out.println("Введите первое число");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            a = reader.readLine();
            System.out.println("Введите второе число");
            b = reader.readLine();
            System.out.println(a + " + " + b + " = " + mul(a, b));
            return;
        }
        if (o.equals("/")) {
            System.out.println("Введите первое число");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            a = reader.readLine();
            System.out.println("Введите второе число");
            b = reader.readLine();
            System.out.println(a + " + " + b + " = " + div(a, b));


            {
                System.out.println("Unknown operation");
            }
        }
    }

        public double add(double a, double b){
            return a + b;
        }

        public double sub(double a, double b){
            return a - b;
        }

        public double mul(double a, double b){
            return a * b;
        }

        public double div ( double a, double b){
            return a/b;
        }
    }