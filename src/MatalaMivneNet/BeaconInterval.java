package MatalaMivneNet;

import java.util.Arrays;
/**
 * Input : BeaconInterval gets WiFi a which is the fixed list ready for usage.
 * Return : an Array of String containing all the Beacons needed.
 */
public class BeaconInterval {
	private String Signals[]= new String [0];
	
	public BeaconInterval(WiFi a) {
		this.Signals=Signals(a.getSource()).clone();
	}

	public String[] Signals(String Source[]) {//Method that Stores the Signals Data in an array
		int counter=0;
		int start=0;
		int end=0;
		for (int i=1;i<Source.length;i++){
			for (int y=0;y<Source[i].length();y++) {
				if (Source[i].charAt(y)==',') {
					counter++;
				}
				if (counter==4) {
					start=y+2;
				}
				if (counter==5) {
					end=y+1;
				}
			}
			this.Signals = Arrays.copyOf(this.Signals, this.Signals.length+1);
			this.Signals[i-1]=Source[i].substring(start, end);
			counter=0;
			start=0;
			end=0;
		}
		return this.Signals;		
	}

	public String[] getSignals() {
		return Signals;
	}

	public void setSignals(String[] signals) {
		Signals = signals;
	}

	@Override
	public String toString() {
		return "BeaconInterval [Signals=" + Arrays.toString(Signals) + "]";
	}
	
}
