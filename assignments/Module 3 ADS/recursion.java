public class recursion{

    public static void printnno(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        printnno(n-1);
        
    }
    public static void printnoincre(int n){
        if(n==1){
           System.out.print(n+" ");
           return;
        }
        printnoincre(n-1);
        System.out.print(n+" ");
    }
    public static int factorial(int n){
        if(n==1){
            return n;
        }
        int t =factorial(n-1);
        return n*t;
    }
    public static int sumno(int n){
        if(n==1){
            return n;
        }
        int sum=n+sumno(n-1);
        return sum;
    }

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fib1=fibonacci(n-1);
        int fib2=fibonacci(n-2);
        
        return fib1+fib2;


    }
    public static boolean issorted(int arr[],int i){
        if(i==arr.length-1){
            return true;

        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr,i+1);

    }


    
    public static void main(String[] args) {
        printnno(10);
        System.out.println();
        printnoincre(10);
        System.out.println();
        System.out.println(factorial(5));
        System.out.println();
        System.out.println(sumno(5));
        System.out.println();
        System.out.println( fibonacci(25));

        int arr[]={2,5,6,89,8};
        System.out.println(issorted(arr, 0));



    }
}