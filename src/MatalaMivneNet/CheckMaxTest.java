package MatalaMivneNet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CheckMaxTest {

	@Test
	void test() {
		Reader a = new Reader("C:/Users/Moshe/Desktop/Test.txt");
		Reader a2 = new Reader("C:/Users/Moshe/Desktop/Test2.txt");
		Reader a3 = new Reader("C:/Users/Moshe/Desktop/Test3.txt");
		WiFi b = new WiFi(a.getSource());
		WiFi b2 = new WiFi(a2.getSource());
		WiFi b3 = new WiFi(a3.getSource());
		BeaconInterval c = new BeaconInterval(b);
		BeaconInterval c2 = new BeaconInterval(b2);
		BeaconInterval c3 = new BeaconInterval(b3);
		StringtoInt d = new StringtoInt(c.getSignals());
		StringtoInt d2 = new StringtoInt(c2.getSignals());
		StringtoInt d3 = new StringtoInt(c3.getSignals());
		CheckMax Test = new CheckMax(d.getNum(),3);
		CheckMax Test2 = new CheckMax(d2.getNum(),4);
		CheckMax Test3 = new CheckMax(d3.getNum(),5);
		int Check[] = {0,1,2};
		int Check2[] = {0,3,1,2};
		int Check3[] = {0,3,6,9,1};
		assertArrayEquals(Test.getMaxNum(),Check);
		assertArrayEquals(Test2.getMaxNum(),Check2);
		assertArrayEquals(Test3.getMaxNum(),Check3);
	}

}
