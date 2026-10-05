public class quicksort {

    public static void qs(int arr[],int si,int ei){

       if(si>=ei){
        return;
       }
       int pv=partition(arr, si, ei);
       qs(arr, si, pv-1);
       qs(arr, pv+1, ei);
    }
    public static int partition(int arr[],int si,int ei){

        int pvt=ei;
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<arr[pvt]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[pvt];
        arr[pvt]=temp;
        return i;
    }
    public static void main(String[] args) {
         int[] arr = {6, 3, 8, 5, 2, 7};

        qs(arr, 0, arr.length - 1);
        for(int a:arr){
            System.out.print(a+" ");
        }
        
    }
}
