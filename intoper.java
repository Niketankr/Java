import java.util.*;
public class checkint {
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter an integer:");
        n=sc.nextInt();
        if(n<0){
            System.out.println("The number is negative integer.");
        }
        else if(n==0){
            System.out.println("The number is zero.");
        }
        else{
            System.out.println("The number is positive integer.");
        }
    }
    
}


output:
PS C:\Users\HP\java> java checkint.java
Enter an integer:
-5
The number is negative integer.

import java.util.*;
public class oddsum {
public static void main(String[] args) {
    int n,s=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of terms:");
    n=sc.nextInt();
    for(int i=0;i<=n;i++){
    if(i%2 != 0){
        s=s+i;
    }
}
    System.out.println("The sum of n terms of odd integers are:" +s);
    sc.close();
} 

output:
PS C:\Users\HP\java> java oddsum.java
Enter the number of terms:
21
The sum of n terms of odd integers are:121

