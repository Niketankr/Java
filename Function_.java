import java.util.*;

public class fact {

    public static int calculateFactorial(int n) {

        if (n < 0) {
            return -1;
        }

        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = calculateFactorial(n);

        if (result == -1)
            System.out.println("Invalid Number");
        else
            System.out.println(result);

        sc.close();
    }
}


PS C:\Users\HP\java> javac fact.java                                                                                       
PS C:\Users\HP\java> java fact.java                                                                                        
6                                                                                                                          
720


//even check

import java.util.*;

public class even {

    public static int checkEven(int n) {

        if (n % 2 != 0) {
            return -1;
        }

        return n;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = checkEven(n);

        if (result == -1)
            System.out.println("Not an Even Number");
        else
            System.out.println("Is Even Number: " + result);

        sc.close();
    }
}

output:
5
Not an Even Number
PS C:\Users\HP\java> 56
56
PS C:\Users\HP\java> java even.java                                                                                        
56                                                                                                                         
Is Even Number: 56

//PrintTable
import java.util.*;

public class table {

    public static void printTable(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printTable(n);

        sc.close();
    }
}


output:
8
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 4 = 32
8 x 5 = 40
8 x 6 = 48
8 x 7 = 56
8 x 8 = 64
8 x 9 = 72
8 x 10 = 80
PS C:\Users\HP\java> java table.java
19
19 x 1 = 19
19 x 2 = 38
19 x 3 = 57
19 x 4 = 76
19 x 5 = 95
19 x 6 = 114
19 x 7 = 133
19 x 8 = 152
19 x 9 = 171
19 x 10 = 190


//Recursive 

import java.util.*;

public class recur {

    public static void printTable(int n, int i) {
        if (i > 10) {
            return;
        }

        System.out.println(n + " x " + i + " = " + (n * i));

        printTable(n, i + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printTable(n, 1);

        sc.close();
    }
}

output:
15
15 x 1 = 15
15 x 2 = 30
15 x 3 = 45
15 x 4 = 60
15 x 5 = 75
15 x 6 = 90
15 x 7 = 105
15 x 8 = 120
15 x 9 = 135
15 x 10 = 150
