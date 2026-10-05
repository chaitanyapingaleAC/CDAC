import java.util.*;
class demo{
    public static void main(String []args){

        int []arr={10,20,5,6,8,5};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println("");
        }
        



    }
}