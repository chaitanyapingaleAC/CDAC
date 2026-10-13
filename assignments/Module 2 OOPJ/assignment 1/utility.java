
public class utility {
	private int day;                              
	private int month;
	private int year;
	
	
	

	
	public void setDay(int dd,int mm,int yy) {
		year=yy;
		if(mm>12 || mm<0) {
			
            month=00;
            System.out.println("enter valid month");
           
		}
		else {
			month=mm;
			
		}
		
		if(mm==1 || mm==3 || mm==5 ||mm==7 || mm==8 || mm==10 || mm==12) {
			if(dd<1 || dd>31) {
				day=00;
				System.out.println("enter valid day");
				
			}
			else {
				day=dd;
			}
		}
		
		if(mm==4 || mm==6 || mm==9 || mm==11 ) {
			if(dd<1 || dd>30) {
				day=00;
				System.out.println("enter valid day");
				
			}else {
				day=dd;
			}
		}
		
		if(mm==2) {
			if(yy%4==0 && yy%100!=0 || yy%400==0){
				if(dd<1 || dd>29) {
					
					day=00;
					System.out.println("enter valid day");
				}
				else {
					day=dd;
					
				}
				
			}
			else {
				if(dd<1 || dd>28) {
					day=00;
					System.out.println("enter valid day");
				}else {
					day=dd;
				}
			}
			
			
		}
		
	}
	
	
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	
	
	
	
	
	
	public void addday(int dd) {
		
		
		int max=0;
		
		
		if(month==1 || month==3 || month==5 ||month==7 || month==8 || month==10 || month==12) {
			max=31;
		}
		if(month==4 || month==6 || month==9 || month==11) {
			max=30;
		}
		if(month==2) {
			if(year%4==0 && year%100!=0 || year%400==0) {
				max=29;
			}else {
				max=28;
			}
		}
		
		int days=day+dd;
		
		if(days>max) {
			
			do {
				month++;
				days=days-max;
				day=days;
			}while(max<days);
			
		}else {
			day=days;
		}
		
		if(month>12) {
			do {
				year++;
				month=month-12;
			}while(month>12);
		}
		
		
	}
	
	
	public void addmonth(int mm) {
		
		int m=month+mm;
		if(m<12) {
			month=m;
			
		}
		else {
			do {
				year++;
				m=m-12;
				month=m;
				
			}while(m>12);
		}
		
		if(month==2) {
			if(year%4==0 && year%100!=0 ||year%400==0) {
				if(day>29) {
					month++;
					day=day-29;
				}
				
			}
			else {
				if(day>28) {
					month++;
					day=day-28;
				}
			}
		}
		
		if(month==4 || month==6 || month==9 || month==11) {
			if(day>30) {
				month++;
				day=day-30;
			}
		}
		
	}
	
	
	public void addyear(int yy) {
		
		year=year+yy;
		if(month==2) {
			if(year%4==0 && year%100!=0 || year%400==0) {
				
			}
			else {
				month++;
				day=day-28;
				
			}
		}
		
	}
	public void display() {
		System.out.println("current date is : ");
		System.out.println(day+"/"+ month+"/"+year);
		
	}
}
