
public class forloop {
	
		
		
		public void numprint() {
			for(int temp=1;temp<=1000;temp++) {
				System.out.print(temp+" ");
			}
		}
		
		public void even() {
			for(int temp=1;temp<=500;temp++) {
				if(temp%2==0) {
					System.out.print(temp+" ");
				}
			}
		}
		
		public void sevennum() {
			for(int temp=1;temp<=200;temp++) {
				if(temp%7==0) {
					System.out.print(temp+" ");
				}
			}
		}
		
		public void loop1() {
			for(int temp=0;temp<5;temp++) {
				for(int temp2=0;temp2<temp;temp2++) {
					
					System.out.print("*");
				}
				System.out.println(" ");
			}
		}
		
		public void loop2() {
			
			for(int temp=0;temp<5;temp++) {
				for(int temp1=5;temp1>temp;temp1--) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		
		public void loop3() {
			int num=1;
			for(int i=0;i<4;i++) {
				for(int k=0;k<=i;k++) {
					System.out.print(num);
					num++;
				}
				System.out.println(" ");
			}
		}
		
		public void loop4() {
			
			for(int i=1;i<=6;i++) {
				for(int k=1;k<=i;k++) {
					System.out.print(k);
				}
				System.out.println(" ");
			}
		}
		
		public void loop5() {
			
			for(int i=1;i<=6;i++) {
				for(int k=i;k<=6;k++) {
					System.out.print(k);
				}
				System.out.println("");
			}
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			forloop obj=new forloop();
			System.out.println("*************************");
			
			obj.numprint();
			System.out.println("*************************");
			obj.even();
			System.out.println("*************************");
			obj.sevennum();
			System.out.println("*************************");
			obj.loop1();
			System.out.println("*************************");
			obj.loop2();
			System.out.println("*************************");
			obj.loop3();
			System.out.println("*************************");
			obj.loop4();
			System.out.println("*************************");
			obj.loop5();
			
			

		}

	}


