package MatalaMivneNet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringtoIntTest {

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
		StringtoInt Test = new StringtoInt(c.getSignals());
		StringtoInt Test2 = new StringtoInt(c2.getSignals());
		StringtoInt Test3 = new StringtoInt(c3.getSignals());
		int Check[] = {-38,-41,-41};
		int Check2[] = {-38,-41,-41,-38,-41,-41};
		int Check3[] = {-38,-41,-41,-38,-41,-41,-38,-41,-41,-38,-41,-41};
		assertArrayEquals(Test.getNum(),Check);
		assertArrayEquals(Test2.getNum(),Check2);
		assertArrayEquals(Test3.getNum(),Check3);
	}

}
