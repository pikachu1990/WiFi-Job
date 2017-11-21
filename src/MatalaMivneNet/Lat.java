package MatalaMivneNet;

import java.util.Arrays;
/**
 * Input : BeaconInterval gets Latitude a which is the fixed list ready for usage.
 * Return : Returns an Array of String containing all the Latitude needed.
 */
public class Lat {

	private String Lattitude[] = new String [0];
	
	public Lat(WiFi a) {
		this.Lattitude=lattitude(a.getSource()).clone();
	}
	
	public String[] lattitude(String Source[]) {//Method that Stores the Latitude Data in an array
		int counter=0;
		int start=0;
		int end=0;
		for (int i=1;i<Source.length;i++){
			for (int y=0;y<Source[i].length();y++) {
				if (Source[i].charAt(y)==',') {
					counter++;
				}
				if (counter==0) {
					start=y+2;
				}
				if (counter==1) {
					end=y+1;
				}
			}
			this.Lattitude = Arrays.copyOf(this.Lattitude, this.Lattitude.length+1);
			this.Lattitude[i-1]=Source[i].substring(start, end);
			counter=0;
			start=0;
			end=0;
		}
		return this.Lattitude;		
	}

	public String[] getLattitude() {
		return this.Lattitude;
	}

	public void setLattitude(String[] lattitude) {
		this.Lattitude = lattitude;
	}

	@Override
	public String toString() {
		return "Lat [Lattitude=" + Arrays.toString(this.Lattitude) + "]";
	}
}
