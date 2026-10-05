public class maxsubarraysum {
    public static void main(String[] args) {
        int []arr={1,-2,6,-1,3};
    int max=0;
    int min=arr[0];

    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++){

                // System.out.print(arr[k]+" ");
                sum+=arr[k];
            }
            System.out.println("sum ="+sum);

            if(sum>max)
                max=sum;
            else if(sum<min)
                min=sum;
        }
        System.out.println(" ");
    }
    System.out.println("max="+max);
    System.out.println("min = "+min);
    }
    
}
