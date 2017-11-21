package MatalaMivneNet;

import java.util.Arrays;

public class Time {
	
	private String Times[] = new String [0];
	/**
	 * Input : Time gets WiFi a which is the fixed list ready for usage.
	 * Return : Returns an Array of String containing all the Time needed.
	 */
	public Time(WiFi a) {
		Times = Times(a.getSource()).clone();
	}

	public String[] Times(String Source[]) {//Method that Stores the Time Data in an array
		int counter=0;
		int start=0;
		int end=0;
		for (int i=1;i<Source.length;i++){
			for (int y=0;y<Source[i].length();y++) {
				if (Source[i].charAt(y)==',') {
					counter++;
				}
				if (counter==9) {
					start=y+2;
				}
				if (counter==10) {
					end=y+1;
				}
			}
			this.Times = Arrays.copyOf(this.Times, this.Times.length+1);
			this.Times[i-1]=Source[i].substring(start, end);
			counter=0;
			start=0;
			end=0;
		}
		return this.Times;		
	}

	public String[] getTimes() {
		return Times;
	}

	public void setTimes(String[] times) {
		Times = times;
	}

	@Override
	public String toString() {
		return "Time [Times=" + Arrays.toString(Times) + "]";
	}
}
