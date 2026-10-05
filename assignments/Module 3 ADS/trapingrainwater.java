public class trapingrainwater {


     
    public static void trappedrainwater(int []arr){
        //1.arrays for maximum left and right boundary of each block...
        int []leftboundary=new int[arr.length];
        int []rightboundary=new int[arr.length];

        //2.the start left and right boundaty remain constant...
        leftboundary[0]=arr[0];
         rightboundary[arr.length-1]=arr[arr.length-1];

         //3. calcuate left and right boundary...
         for(int i=1;i<arr.length;i++){
            leftboundary[i]=Math.max(leftboundary[i-1],arr[i]);

         }

         for(int i=arr.length-2;i>=0;i--){
            rightboundary[i]=Math.max(rightboundary[i+1], arr[i]);

         }
         

         //4. calculate trapepd water...
         int trappedwater=0;
         for(int i=0;i<arr.length;i++){
            int waterlevel=Math.min(leftboundary[i], rightboundary[i]);
            trappedwater +=waterlevel-arr[i];

         }


         System.out.println(trappedwater);






    }
    
    public static void main(String []args){
        int arr[]={4,2,0,6,3,2,5};
        trappedrainwater(arr);
    }
}
