package MatalaMivneNet;

import java.util.Arrays;
/**
 * Input : Gets an Array of Integers and the amount of Max numbers  locations you want.
 * Return : an Array of Integers containing the Index (Location) of the max numbers Orginized from highest to lowest.
 */
public class CheckMax {
	private int MaxNum[]= new int [0];
	
	public CheckMax(int Numbers[],int Num) {
		this.MaxNum=MaxNumbers(Numbers.clone(),Num).clone();
	}
	public int[] MaxNumbers(int Number[],int amount) {//Method that Calculates top 10 Indexs of Signal incase there is more then 10
		int Max=-100000;
		if (amount>Number.length) {amount=Number.length;}
		for (int j=0;j<amount;j++) {
		for (int i=0;i<Number.length;i++) {
			if (Number[i]>Max) {
				Max=Number[i];
				this.MaxNum = Arrays.copyOf(this.MaxNum, this.MaxNum.length+1);
				this.MaxNum[j]=i;
			}
		}
		Max=-100000;
		Number[this.MaxNum[j]]=-1000000;
		}
		this.MaxNum=Arrays.copyOf(this.MaxNum, amount);
		return this.MaxNum;}
	
	public int[] getMaxNum() {
		return this.MaxNum;
	}
	public void setMaxNum(int[] maxNum) {
		this.MaxNum = maxNum;
	}
	
	@Override
	public String toString() {
		return "CheckMax [MaxNum=" + Arrays.toString(this.MaxNum) + "]";
	}
	
	
}
