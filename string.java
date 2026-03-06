import java.util.*;
public class str {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        String name =sc.nextLine();
        System.out.println("your name is;"+name);
        //adding two strings
        String fname="Niketan";
        String lname="Kunwar";
        String fullname=fname+" "+lname;
        System.out.println("Full name is "+fullname);

        //length
        System.out.println(fullname.length());
        //char at
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
        //compare
        String name1="Niketan";
        String name2="Niketan";
        if(name1.compareTo(name2)==0){
            System.out.println("Names are equal");
        }
        else{
                System.out.println("Names are not equal");
            }
            //substring 
            String sen="Ramayan is a holy book";
            String sub=sen.substring(7,sen.length());
            System.out.println(sub);
            }
        }

    
output:
PS C:\Users\HP\java> javac str.java
PS C:\Users\HP\java> java str.java 
Niketan
your name is;Niketan
Full name is Niketan Kunwar
14
N
i
k
e
t
a
n

K
u
n
w
a
r
Names are equal
 is a holy book.

import java.util.*;
public class twodarray {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int number[][]=new int[rows][col];
        //rows
        for(int i=0;i<rows;i++){
            //columbs
            for(int j=0;j<col;j++){
                number[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(number[i][j] == x){
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                }
                }
    }
    
}
}
output:
3 4
12 23 34 41
21 23 24 22
31 32 33 34
33
Element found at position: (2, 2)
