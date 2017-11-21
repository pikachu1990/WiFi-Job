package MatalaMivneNet;

import java.util.Scanner;
/**
 * Input : Gets an Input.
 * Return : The input after he passed an extended test to see its a correct input.
 */
public class InputFilter {
	private String input;
	private String filter;
	private int counter=0;
	private boolean check=false;
	private int num=0,num2=0,num3=0;
	public InputFilter() {
		this.input=Filter();
		this.filter="";
	}

	public String Filter() {
		Scanner put = new Scanner(System.in);
		do {
		if (counter!=0) {
			System.out.println("Wrong Input , You've Failed "+counter+" Times, Git Good");
		}
		System.out.println("Insert Search Parameter (T-Time, L-Location, N-Name)");
		this.filter=put.nextLine();
		counter++;
		}while (!filter.equals("T") && !filter.equals("L") && !filter.equals("N"));
		counter=0;
		do {
		if (counter!=0) {
			System.out.println("Wrong Input , You've Failed "+counter+" Times, Git Good");
		}
		if (this.filter.equals("T")) {
		System.out.println("Insert Time (XX:XX:XX)");
		this.input=put.nextLine();
		if (this.input.length()==8 && this.input.charAt(2)==':' && this.input.charAt(5)==':') {
			this.num=this.num+(((int)this.input.charAt(0)-48)*10)+((int)this.input.charAt(1)-48);
			this.num2=this.num2+(((int)this.input.charAt(3)-48)*10)+((int)this.input.charAt(4)-48);
			this.num3=this.num3+(((int)this.input.charAt(6)-48)*10)+((int)this.input.charAt(7)-48);
			if(this.num<25 && this.num>=0 && this.num2<61 && this.num2>=0 && this.num3<61 && this.num3>=0)
			check=true;
			this.num=0;
			this.num2=0;
			this.num3=0;
		}
		}
		if (this.filter.equals("N")) {
		System.out.println("Insert Name (Numbers and Letters)");
		this.input=put.nextLine();
		if (this.input.length()>0 && !this.input.contains(";") && !this.input.contains(",")) {
			check=true;
			}
		}
		if (this.filter.equals("L")) {
		System.out.println("Insert Location (XX.XXXXX,XX.XXXXX)");
		this.input=put.nextLine();
		if (this.input.length()==17) {
		if (this.input.charAt(2)=='.' && this.input.charAt(8)==',' && this.input.charAt(11)=='.') {
			for (int i=0;i<input.length();i++) {
				if (i!=2 && i!=8 && i!=11) {
					if((int)this.input.charAt(i)-48>=0 && (int)this.input.charAt(i)-48<=9) {
						check=true;
					}
				}
			}
		}
		}}
		counter++;
		}while (check==false);
		put.close();
		return this.input;
	}

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	@Override
	public String toString() {
		return "InputFilter [input=" + input + ", filter=" + filter + "]";
	}
	
	
}
