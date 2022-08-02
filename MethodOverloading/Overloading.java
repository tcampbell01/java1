//in Java, two or more methods may have the same name if they differ in parameters (different number of parameters, different types of parameters, or both). These methods are called overloaded methods and this feature is called method overloading.

package MethodOverloading;

//The Java I/O package, a.k.a. java.io, provides a set of input streams and a set of output streams used to read and write data to files or other input and output sources.

import java.io.*;

public class Overloading {
    int sum(int num1, int num2) {
        return (num1 * num2);
    }
}

class MethodCall {
    public static void main(String args[]) throws NumberFormatException, IOException {
        int x, y;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, enter two Integers: ");
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());

        Overloading o1 = new Overloading();
        System.out.println("Result of your numbers are : " + o1.sum(x, y));
    }
}
