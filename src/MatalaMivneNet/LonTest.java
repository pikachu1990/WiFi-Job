package MatalaMivneNet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LonTest {

	@Test
	void test() {
		Reader a = new Reader("C:/Users/Moshe/Desktop/Test.txt");
		Reader a2 = new Reader("C:/Users/Moshe/Desktop/Test2.txt");
		Reader a3 = new Reader("C:/Users/Moshe/Desktop/Test3.txt");
		WiFi b = new WiFi(a.getSource());
		WiFi b2 = new WiFi(a2.getSource());
		WiFi b3 = new WiFi(a3.getSource());
		Lon Test = new Lon(b);
		Lon Test2 = new Lon(b2);
		Lon Test3 = new Lon(b3);
		String Check[] = {"35.20704","35.20704","35.20704"};
		String Check2[] = {"35.20704","35.20704","35.20704","35.20704","35.20704","35.20704"};
		String Check3[] = {"35.20704","35.20704","35.20704","35.20704","35.20704","35.20704","35.20704","35.20704","35.20704","35.20704","35.20704","35.20704"};
		Test.toString();
		assertArrayEquals(Test.getLon(),Check);
		assertArrayEquals(Test2.getLon(),Check2);
		assertArrayEquals(Test3.getLon(),Check3);
	}

}
