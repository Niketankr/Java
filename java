import java.util.*;

public class Main {

    static void swap(int[] a){
        int t=a[0];
        a[0]=a[1];
        a[1]=t;
    }

    static int factorial(int n){
        if(n<=1) return 1;
        return n*factorial(n-1);
    }

    static void reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse());
    }

    public static void main(String[] args){

        int[] arr={5,10};
        swap(arr);
        System.out.println(arr[0]+" "+arr[1]);

        int[][] mat={{1,2},{3,4}};
        System.out.println(mat[1][1]);

        System.out.println(factorial(5));

        reverse("hello");

        int[] dynamic=new int[5]; // like malloc
        dynamic[0]=100;
        System.out.println(dynamic[0]);
    }
}
output:
10 5
4
120
olleh
100
