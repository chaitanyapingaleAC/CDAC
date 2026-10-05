public class prefixsumsubarray {
    public static void main(String[] args) {
        int []arr={1,-2,6,-1,3};
        int []prefix=new int[arr.length];

        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];   // calculate prefix array
        }
        int sum=0;
        int max=0;
        int min=prefix[0];


        for(int start=0;start<arr.length;start++){
            for(int end=start;end<arr.length;end++){

                sum=  start==0 ? prefix[end] : prefix[end]-prefix[start-1];
             if(sum>max)
                max=sum;
            else if(min>sum)
                min=sum;
            }

           

        }
        System.out.println("max "+max);
        System.out.println("min "+min);




    }
}
