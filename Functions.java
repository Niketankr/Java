//Name 
import java.util.*;

public class nam {

    public static void printMyName(String name) {
        System.out.println(name);
        return name;
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        printMyName(input);
    }
}
output:
PS C:\Users\HP\java> javac nam.java
PS C:\Users\HP\java> java nam.java
Niketan
Niketan

//sum of two numbers
  import java.util.*;
public class summ {

    public static int CalculateSum(int a ,int b) {
        int sum=a+b;
        System.out.println(sum);
        return sum;
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = CalculateSum(a, b);
        System.out.println("The sum of two numbers is "+sum);
    }
}
output:
PS C:\Users\HP\java> javac summ.java
PS C:\Users\HP\java> java summ.java
5 4 
9
The sum of two numbers is 9
PS C:\Users\HP\java> java summ.java
56 89
145
The sum of two numbers is 145
  
