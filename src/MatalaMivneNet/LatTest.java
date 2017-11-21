package MatalaMivneNet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LatTest {

	@Test
	void test() {
		Reader a = new Reader("C:/Users/Moshe/Desktop/Test.txt");
		Reader a2 = new Reader("C:/Users/Moshe/Desktop/Test2.txt");
		Reader a3 = new Reader("C:/Users/Moshe/Desktop/Test3.txt");
		WiFi b = new WiFi(a.getSource());
		WiFi b2 = new WiFi(a2.getSource());
		WiFi b3 = new WiFi(a3.getSource());
		Lat Test = new Lat(b);
		Lat Test2 = new Lat(b2);
		Lat Test3 = new Lat(b3);
		String Check[] = {"32.10519","32.10519","32.10519"};
		String Check2[] = {"32.10519","32.10519","32.10519","32.10519","32.10519","32.10519"};
		String Check3[] = {"32.10519","32.10519","32.10519","32.10519","32.10519","32.10519","32.10519","32.10519","32.10519","32.10519","32.10519","32.10519"};
		Test.toString();
		assertArrayEquals(Test.getLattitude(),Check);
		assertArrayEquals(Test2.getLattitude(),Check2);
		assertArrayEquals(Test3.getLattitude(),Check3);
	}

}
