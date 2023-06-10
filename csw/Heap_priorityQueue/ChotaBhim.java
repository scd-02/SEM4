import java.util.Collections;
import java.util.PriorityQueue;

public class ChotaBhim {
	
	public static int chotaBhim(int cups[], int time) {
		int maxValue = 0;
		
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i = 0;i<cups.length;i++) {
			q.add(cups[i]);
		}
		
		System.out.println(q);
		
		for(int t=0;t<time;t++) {
			int value = q.poll();
			maxValue += value;
			value = (int)Math.ceil(value/2.0);
			q.add(value);
		}

		return maxValue;
	}

	public static void main(String[] args) {
		
		int cups []= {2,1,7,4,2};
		System.out.println(chotaBhim(cups, 60));
		
	}

}
