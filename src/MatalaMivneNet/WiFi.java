package MatalaMivneNet;

import java.util.Arrays;
/**
 * Input : Array of Strings
 * Return : Array of Strings in the right format.
 */
public class WiFi{
	
	private String Source[] = new String [0];
	
	public WiFi(String Source[]){
		CommaInserter b = new CommaInserter(Source);
		this.Source=b.getSource().clone();
	}

	public String[] getSource() {
		return Source;
	}

	public void setSource(String[] source) {
		Source = source;
	}

	@Override
	public String toString() {
		return "WiFi [Source=" + Arrays.toString(Source) + "]";
	}
	
}
