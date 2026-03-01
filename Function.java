//product
import java.util.*;

public class mul {

    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = calculateProduct(a, b);
        System.out.println("The product of two numbers is " + product);

        sc.close();  // Good practice to close scanner
    }
}

output:
PS C:\Users\HP\java> javac mul.java
PS C:\Users\HP\java> java mul.java 
5
6
The product of two numbers is 30

//check prime

  import java.util.*;

public class Prime {

    public static boolean checkPrime(int a) {
        if (a <= 1) {
            return false;
        }

        int limit = (int)Math.sqrt(a);

        for (int i = 2; i <= limit; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (checkPrime(a)) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }

        sc.close();
    }
}

output:
PS C:\Users\HP\java> javac prime.java                                                                                                                                 
PS C:\Users\HP\java> java prime.java                                                                                                                                  
63
The number is not prime

  //factorial

  import java.util.*;

public class fact {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printFactorial(n);

        sc.close();
    }

    public static void printFactorial(int n) {

        if (n < 0) {
            System.out.println("Invalid Number");
            return;   
        }

        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
}

output:
PS C:\Users\HP\java> javac fact.java
PS C:\Users\HP\java> java fact.java
5
120

  


  
