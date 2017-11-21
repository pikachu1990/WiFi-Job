package MatalaMivneNet;

import java.util.Arrays;
/**
 * Input : Gets a filtered Input using "InputFilter" and an Array of Strings.
 * Return : the Indexes of the array containing the searched information.
 */
public class Input {
	private String input="";
	private int Index[]=new int[0];
	public Input(InputFilter a,MakeanArray b) {
		this.input=a.getInput();
		this.Index=check(a,b);
	}
	
	public int[] check(InputFilter a,MakeanArray b) {
		int y=0;
		for (int i=0;i<b.getArrayCreated().length;i++) {
			if (b.getArrayCreated()[i].contains(this.input)) {
				this.Index = Arrays.copyOf(this.Index, this.Index.length+1);
				this.Index[y]=i-1;
				y++;
			}
		}
		if (this.Index.length==0) {
			System.out.println("Result not found, Thank you, Better luck next time.");
			System.exit(1);
		}
		return this.Index;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int[] getIndex() {
		return Index;
	}

	public void setIndex(int[] index) {
		Index = index;
	}

	@Override
	public String toString() {
		return "Input [input=" + input + ", Index=" + Arrays.toString(Index) + "]";
	}
	
	
}
