import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class AttendanceApp {
	int regdNo;
	String name;
	int attendance;
	int total_classes = 50;

	public AttendanceApp(int r, String n, int a) {
		this.attendance = a;
		this.name = n;
		this.regdNo = r;
	}

	public float percentage() {
		return (this.attendance / (float)this.total_classes) * 100;
	}
}

public class Q2 {

	public static void main(String[] args) {
		HashMap<Integer, Float> table = new HashMap<>();
		
		AttendanceApp s4 = new AttendanceApp(4, "sourav1", 25);
		AttendanceApp s1 = new AttendanceApp(1, "sourav1", 45);
		AttendanceApp s2 = new AttendanceApp(2, "sourav2", 46);
		AttendanceApp s3 = new AttendanceApp(3, "sourav3", 15);

		table.put(s1.regdNo, s1.percentage());
		table.put(s2.regdNo, s2.percentage());
		table.put(s3.regdNo, s3.percentage());
		table.put(s4.regdNo, s4.percentage());

		Iterator <Map.Entry<Integer, Float>> it = table.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, Float> map = it.next();
			if(map.getValue()<75.0) {
				it.remove();
			}
		}
		
		System.out.println(table);

	}

}
