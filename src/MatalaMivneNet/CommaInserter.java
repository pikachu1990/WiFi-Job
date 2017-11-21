package MatalaMivneNet;

import java.util.Arrays;
/**
 * Input : Gets a string array.
 * Return : String array where all the ";" swapped to ",";
 */
public class CommaInserter {
	
	private String Source[] = new String [0];
	public CommaInserter(String Source2[]) {
		this.Source=Comma(Source2).clone();
	}
	
	public String[] Comma(String Source[]) {//Method that chances the ; to a , in order to make it CSV file.
		for (int i=0;i<Source.length;i++){
			for (int y=0;y<Source[i].length();y++) {
				if (Source[i].charAt(y)==';') {
					Source[i]=Source[i].substring(0, y)+","+Source[i].substring(y+1);
				}
			}
		}
		return Source;
	}

	public String[] getSource() {
		return Source;
	}

	public void setSource(String[] source) {
		Source = source;
	}

	@Override
	public String toString() {
		return "CommaInserter [Source=" + Arrays.toString(Source) + "]";
	}
	
	
}
