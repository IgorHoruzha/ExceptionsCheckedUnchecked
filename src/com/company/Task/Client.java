package com.company.Task;

import com.company.OurExceptions.OurCheckedException;
import com.company.OurExceptions.OurUncheckedException;

public class Client {

    public static int Fib(int n) throws OurCheckedException {
        if (n < 0) {
            throw new OurCheckedException();
        }
        if (n <= 1) {
            return n;
        } else {
            return Fib(n - 1) + Fib(n - 2);
        }
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new OurUncheckedException();
        }
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }


    public static void ExecuteMethods() {
        try {
            int fibonacci = Fib(-14444);
        } catch (OurCheckedException e) {
            e.printStackTrace();
        }

        try {
            int factorial = factorial(-14444);
        } catch (OurUncheckedException e) {
            e.printStackTrace();
        }

    }
}
