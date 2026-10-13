import java.util.Comparator;
public class employeecompare  implements Comparator<employee> {

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
