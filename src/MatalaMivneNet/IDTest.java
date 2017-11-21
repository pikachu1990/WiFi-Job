package MatalaMivneNet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IDTest {

	@Test
	void test() {
		Reader a = new Reader("C:/Users/Moshe/Desktop/Test.txt");
		Reader a2 = new Reader("C:/Users/Moshe/Desktop/Test2.txt");
		Reader a3 = new Reader("C:/Users/Moshe/Desktop/Test3.txt");
		WiFi b = new WiFi(a.getSource());
		WiFi b2 = new WiFi(a2.getSource());
		WiFi b3 = new WiFi(a3.getSource());
		ID Test = new ID(b);
		ID Test2 = new ID(b2);
		ID Test3 = new ID(b3);
		String Check[] = {"Ariel_University","Ariel_University","Ariel_University"};
		String Check2[] = {"Ariel_University","Ariel_University","Ariel_University","Ariel_University","Ariel_University","Ariel_University"};
		String Check3[] = {"Ariel_University","Ariel_University","Ariel_University","Ariel_University","Ariel_University","Ariel_University","Ariel_University","Ariel_University","Ariel_University","Ariel_University","Ariel_University","Ariel_University"};
		Test.toString();
		assertArrayEquals(Test.getNames(),Check);
		assertArrayEquals(Test2.getNames(),Check2);
		assertArrayEquals(Test3.getNames(),Check3);
		
	}

}
