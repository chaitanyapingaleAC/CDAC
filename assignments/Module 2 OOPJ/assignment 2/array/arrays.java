
public class arrays {
	
	public void sortarray(int []arr,int size) {
		
        System.out.println("array is : ");
        for(int i=0;i<size;i++) {
        	System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
      
        for(int i=0;i<size;i++) {
        	for(int k=0;k<size-1;k++) {
        		if(arr[k]>arr[k+1]) {
        			int temp=arr[k];
        			arr[k]=arr[k+1];
        			arr[k+1]=temp;
        		}
        		}
        	}
        
        System.out.println("sorted array");
        for(int i=0;i<size;i++) {
        	
        	System.out.print(arr[i]+" ");
        }
       System.out.println(" ");
        }
	
	public int arraysum(int []arr,int size) {
		
		int sum=0;
		for(int i=0;i<size;i++) {
			sum +=arr[i];
		}
		
		return sum;
	}
	
	public double arrayaverage(int sum,int size) {
		double avg=sum/size;
		return avg;
	}
	
	public void iterate(int []arr) {
		int []arr2=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		System.out.println("iterated new array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr2[i]);
		}
	}
	
	public void largest(int []arr) {
		int max=0;
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.println("maximun element "+max);
		System.out.println("minimun element : "+min);
		
		
	}
	
	
       
	
	public void reversearray(int []arr) {
		
		int start=0;
		int last=arr.length-1;
		for(int aa=0;aa<arr.length/2;aa++) {
			int temp=arr[start];
			arr[start]=arr[last];
			arr[last]=temp;
			start++;
			last--;
			
		}
		
		System.out.println("reverse array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	
	
	public void arrayduplicate(int []arr) {
		System.out.println(" ");
		System.out.println("duplicate element : ");
		for(int i=0;i<arr.length;i++) {
			for(int k=i+1;k<arr.length;k++) {
				if(arr[i]==arr[k]) {
					System.out.print(arr[i]+" ");
				}
				}
			}
		}

	
	public void duplicate(int []arr,int []arr2) {
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr[i]==arr2[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
         
         arrays objarr=new arrays();
       
         
         
         System.out.println("enter the size if array:");
         input obj=new input();
         
         int size=obj.getint();
         int []arr=new int[size];
         System.out.println("enter the element of array");
         for(int i=0;i<size;i++) {
         	arr[i]=obj.getint();
         	
         }
         System.out.println(" ");
         objarr.sortarray(arr,size);
         
        int sum= objarr.arraysum(arr,size);
        System.out.println("Sum of array  is : "+sum);
        
        double avg=objarr.arrayaverage(sum, size);
        System.out.println("Average of array is : "+avg);
        
        objarr.largest(arr);
        System.out.println(" ");
        objarr.reversearray(arr);
        
        objarr.arrayduplicate(arr);
        
System.out.println(" enter second array element");
		
		int []arr2=new int[arr.length];
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=obj.getint();
		}
        objarr.duplicate(arr, arr2);
        
        
         
	}

}
