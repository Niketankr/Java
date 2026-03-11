public class BinarySearch {

    static int search(int arr[],int l,int r,int x){

        if(r>=l){

            int mid=(l+r)/2;

            if(arr[mid]==x)
                return mid;

            if(arr[mid]>x)
                return search(arr,l,mid-1,x);

            return search(arr,mid+1,r,x);
        }

        return -1;
    }

    public static void main(String[] args){

        int arr[]={1,2,3,4,5};

        System.out.println(search(arr,0,4,4));
    }
}

output:
3


public class PrintN {

    static void print(int n){

        if(n==0)
            return;

        print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args){
        print(5);
    }
}

output:
1
2
3
4
5


public class PrintReverse {

    static void print(int n){

        if(n==0)
            return;

        System.out.println(n);
        print(n-1);
    }

    public static void main(String[] args){
        print(15);
    }
}
output:
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1


public class SumDigits {

    static int sum(int n){

        if(n==0)
            return 0;

        return n%10 + sum(n/10);
    }

    public static void main(String[] args){
        System.out.println(sum(123456));
    }
}
output:
21
