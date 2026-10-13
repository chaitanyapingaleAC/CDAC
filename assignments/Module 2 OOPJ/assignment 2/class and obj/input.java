
public class input {



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public  String getstring() {
		try {
			byte arrinput[]=new byte[100];
			
			int length = System.in.read(arrinput);
			byte arrfinal[]=new byte[length-2];
			System.arraycopy(arrinput, 0, arrfinal, 0, length-2);
			String objstring= new String(arrfinal);
			
			return objstring;
			

		}catch (Exception e) {
			e.printStackTrace();
			
		}
	return null;
	}
	
	public int getint() {
		String objstring=getstring();
		int num1=Integer.parseInt(objstring);
		return num1;
	}
	
	public  float getfloat() {
		
//		String objstring=s();
//	    float num1=Float.parseFloat(objstring);
//	    return num1;
		return Float.parseFloat(getstring());
	    
	}

}

