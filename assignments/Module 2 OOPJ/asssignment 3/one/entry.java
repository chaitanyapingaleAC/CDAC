
public class entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		base b=new base();
		b.print();
		child c=new child();
		c.print();
		
		base obj= new child();
		child oo=(child)obj;
		oo.print();
		
	}

}
