public class kadanesalgomaxsubarray {
    
    
    public static void main(String[] args) {
        int []arr={-1,-2,-6,-1,-3};
    int max=Integer.MIN_VALUE;
    int sum=0;
    

    int positivecount=0;
    for(int i=0;i<arr.length;i++){

        if(arr[i]>0){
            positivecount++;
        }                   
        positivecount--;
    }
    if(positivecount<0){         //handeling negative values
        for(int i=0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }

    }
    else{
         for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(sum<0)
            sum=0;                 //kadane algo

        max=Math.max(max, sum);
        
    }
    }

   

    System.out.println("max="+max);
    }
    
}






////it can handle both positive and negative values....
/// 
// public class Kadane {

//     public static void main(String[] args) {

//         int[] arr = {-1, -2, -6, -1, -3};

//         int sum = arr[0];
//         int max = arr[0];

//         for (int i = 1; i < arr.length; i++) {

//             sum = Math.max(arr[i], sum + arr[i]);

//             max = Math.max(max, sum);
//         }

//         System.out.println("max = " + max);
//     }
// }