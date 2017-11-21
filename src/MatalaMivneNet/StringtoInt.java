package MatalaMivneNet;

import java.util.Arrays;
/**
 * Input : Gets an array of Strings.
 * Return : an Array of ints.
 */
public class StringtoInt {
	private int Num[]= new int [0];
	
	public StringtoInt(String Numbers[]) {
		this.Num=(StringInt(Numbers)).clone();
	}
	
	public int[] StringInt(String Numbers[]) {
		for (int i=0;i<Numbers.length;i++) {
			this.Num = Arrays.copyOf(this.Num, this.Num.length+1);
			this.Num[i]=0;
			for (int y=1;y<Numbers[i].length();y++) {
				this.Num[i]=this.Num[i]+(int)(Numbers[i].charAt(y))-48;
				this.Num[i]=this.Num[i]*10;
			}
			this.Num[i]=this.Num[i]/10;
			if (Numbers[i].charAt(0)=='-') {
			this.Num[i]=this.Num[i]*-1;
		}}
		return this.Num;
	}

	public int[] getNum() {
		return this.Num;
	}

	public void setNum(int[] num) {
		this.Num = num;
	}

	@Override
	public String toString() {
		return "StringtoInt [Num=" + Arrays.toString(Num) + "]";
	}
	
}
