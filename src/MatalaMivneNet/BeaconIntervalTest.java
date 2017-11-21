package MatalaMivneNet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BeaconIntervalTest {

	@Test
	void test() {
		Reader a = new Reader("C:/Users/Moshe/Desktop/Test.txt");
		Reader a2 = new Reader("C:/Users/Moshe/Desktop/Test2.txt");
		Reader a3 = new Reader("C:/Users/Moshe/Desktop/Test3.txt");
		WiFi b = new WiFi(a.getSource());
		WiFi b2 = new WiFi(a2.getSource());
		WiFi b3 = new WiFi(a3.getSource());
		BeaconInterval Test = new BeaconInterval(b);
		BeaconInterval Test2 = new BeaconInterval(b2);
		BeaconInterval Test3 = new BeaconInterval(b3);
		String Check[] = {"-38","-41","-41"};
		String Check2[] = {"-38","-41","-41","-38","-41","-41"};
		String Check3[] = {"-38","-41","-41","-38","-41","-41","-38","-41","-41","-38","-41","-41"};
		Test.toString();
		assertArrayEquals(Test.getSignals(),Check);
		assertArrayEquals(Test2.getSignals(),Check2);
		assertArrayEquals(Test3.getSignals(),Check3);
	}
	
	
}