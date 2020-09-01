import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		Date d1 = new Date (8, 10, 2020);
		Date d2 = new Date (8, 20, 2020);
		Date d3 = new Date (4, 16, 2005);
		Date d4 = new Date (3, 24, 2010);

		TreeMap <Date, String> syllabus = new TreeMap();
		syllabus.put(d1, "java");
		syllabus.put(d2, "Python");
		syllabus.put(d3, "C++");
		syllabus.put(d4, "Javascript");
		
		for(Map.Entry<Date, String> topic: syllabus.entrySet()) {
			if(topic.getKey().month == 9 && topic.getKey().year == 2002) {
				System.out.println(topic.getValue());
			}else {
				System.out.println(topic.getValue() + " does not fall in September, 2002");
			}
			
		}

	}

}
