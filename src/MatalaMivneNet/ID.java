package MatalaMivneNet;

import java.util.Arrays;
/**
 * Input : IDs gets WiFi a which is the fixed list ready for usage.
 * Return : Returns an Array of String containing all the IDs needed.
 */
public class ID {
	private String Names[] = new String [0];
	
	public ID(WiFi a) {
		this.Names=Names(a.getSource()).clone();
	}
	
	public String[] Names(String Source[]) {//Method that Stores the Names Data in an array
		int counter=0;
		int start=0;
		int end=0;
		for (int i=1;i<Source.length;i++){
			for (int y=0;y<Source[i].length();y++) {
				if (Source[i].charAt(y)==',') {
					counter++;
				}
				if (counter==2) {
					start=y+2;
				}
				if (counter==3) {
					end=y+1;
				}
			}
			this.Names = Arrays.copyOf(this.Names, this.Names.length+1);
			this.Names[i-1]=Source[i].substring(start, end);
			counter=0;
			start=0;
			end=0;
		}
		return this.Names;		
	}

	public String[] getNames() {
		return Names;
	}

	public void setNames(String[] names) {
		Names = names;
	}

	@Override
	public String toString() {
		return "ID [Names=" + Arrays.toString(Names) + "]";
	}
	
}
