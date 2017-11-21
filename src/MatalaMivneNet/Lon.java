package MatalaMivneNet;

import java.util.Arrays;
/**
 * Input : Longitude gets WiFi a which is the fixed list ready for usage.
 * Return : Returns an Array of String containing all the Longitude needed.
 */
public class Lon {
	private String Lon[]= new String[0];
	public Lon(WiFi a) {
		this.Lon=Longtitude(a.getSource()).clone();
	}

	public String[] Longtitude(String Source[]) {//Method that Stores the Longitude Data in an array
		int counter=0;
		int start=0;
		int end=0;
		for (int i=1;i<Source.length;i++){
			for (int y=0;y<Source[i].length();y++) {
				if (Source[i].charAt(y)==',') {
					counter++;
				}
				if (counter==1) {
					start=y+2;
				}
				if (counter==2) {
					end=y+1;
				}
			}
			this.Lon = Arrays.copyOf(this.Lon, this.Lon.length+1);
			this.Lon[i-1]=Source[i].substring(start, end);
			counter=0;
			start=0;
			end=0;
		}
		return this.Lon;		
	}
	
	public String[] getLon() {
		return Lon;
	}

	public void setLon(String[] lon) {
		Lon = lon;
	}

	@Override
	public String toString() {
		return "Lon [Lon=" + Arrays.toString(Lon) + "]";
	}

}
