package MatalaMivneNet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeTest {

	@Test
	void test() {
		Reader a = new Reader("C:/Users/Moshe/Desktop/Test.txt");
		Reader a2 = new Reader("C:/Users/Moshe/Desktop/Test2.txt");
		Reader a3 = new Reader("C:/Users/Moshe/Desktop/Test3.txt");
		WiFi b = new WiFi(a.getSource());
		WiFi b2 = new WiFi(a2.getSource());
		WiFi b3 = new WiFi(a3.getSource());
		Time Test = new Time(b);
		Time Test2 = new Time(b2);
		Time Test3 = new Time(b3);
		String Check[] = {"14:40:17","14:40:11","14:40:17"};
		String Check2[] = {"14:40:17","14:40:11","14:40:17","14:40:17","14:40:11","14:40:17"};
		String Check3[] = {"14:40:17","14:40:11","14:40:17","14:40:17","14:40:11","14:40:17","14:40:17","14:40:11","14:40:17","14:40:17","14:40:11","14:40:17"};
		Test.toString();
		assertArrayEquals(Test.getTimes(),Check);
		assertArrayEquals(Test2.getTimes(),Check2);
		assertArrayEquals(Test3.getTimes(),Check3);
	}

}
