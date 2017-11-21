package MatalaMivneNet;

import java.util.Arrays;
/**
 * Input : Gets an Array of Strings indexes desired to be copied and Length Aimed for.
 * Return : an Array of Strings using the correct format prior print.
 */
public class MakeanArray {
	private String ArrayCreated[] = new String [1];
	
	public MakeanArray (int Index[],String Source[],int Length) {
		this.ArrayCreated=Create(Index,Source,Length);
	}
	public String[] Create(int Index[],String Source[],int Length) {
		ArrayCreated[0]=Source[0];
		for (int i=1;i<Length+1;i++) {
			this.ArrayCreated=Arrays.copyOf(this.ArrayCreated, this.ArrayCreated.length+1);
			this.ArrayCreated[i]=Source[Index[i-1]+1];
		}
		return this.ArrayCreated;
	}
	public String[] getArrayCreated() {
		return ArrayCreated;
	}
	public void setArrayCreated(String[] arrayCreated) {
		ArrayCreated = arrayCreated;
	}
	@Override
	public String toString() {
		return "MakeanArray [ArrayCreated=" + Arrays.toString(ArrayCreated) + "]";
	}
	
}
