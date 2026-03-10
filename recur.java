public class MatrixChain {

    static int matrixChain(int p[], int n) {

        int dp[][] = new int[n][n];

        for (int L = 2; L < n; L++) {

            for (int i = 1; i < n - L + 1; i++) {

                int j = i + L - 1;
                dp[i][j] = Integer.MAX_VALUE;

                for (int k = i; k <= j - 1; k++) {

                    int q = dp[i][k] + dp[k + 1][j] +
                            p[i - 1] * p[k] * p[j];

                    if (q < dp[i][j])
                        dp[i][j] = q;
                }
            }
        }

        return dp[1][n - 1];
    }

    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4};

        System.out.println(matrixChain(arr, arr.length));
    }
}


output:
18

public class Palindrome {

    static boolean isPalindrome(String str,int start,int end){

        if(start>=end)
            return true;

        if(str.charAt(start)!=str.charAt(end))
            return false;

        return isPalindrome(str,start+1,end-1);
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("madam",0,4));
    }
}

output:
true

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

