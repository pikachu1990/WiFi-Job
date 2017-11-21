package Matalot;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.xml.transform.Source;

import Matala0.Main;

public class Matala0 {
	
		public static String[] Read(String fileName,String Source[]) {//Method that Reads a File and Stores it within an String Array.
	    	
	                // The name of the file to open.
	                //filename 2 = Reader
	                 //filename 1 = Writer

	                // This will reference one line at a time
	                String line = null;

	                try {
	                    // FileReader reads text files in the default encoding.
	                    FileReader fileReader = 
	                        new FileReader(fileName);

	                    // Always wrap FileReader in BufferedReader.
	                    BufferedReader bufferedReader = 
	                        new BufferedReader(fileReader);
	                    
	                    int i=0;
	                    
	                    while((line = bufferedReader.readLine()) != null) {
	                    	Source = Arrays.copyOf(Source,Source.length+1);
	                    	Source[i]=line;
	                    	i++;
	                    }   


	                    // Always close files.
	                    bufferedReader.close();         


	                }
	                catch(IOException ex) {
	                    System.out.println(
	                        "Error writing to file '"
	                        + fileName + "'");
	                    // Or we could just do this:
	                    // ex.printStackTrace();
	                }
	                return Source;
	                
	        }// Makes an array of all the latency numbers
		
		public static String[] Comma(String Source[]) {//Method that chances the ; to a , in order to make it CSV file.
			for (int i=0;i<Source.length;i++){
				for (int y=0;y<Source[i].length();y++) {
					if (Source[i].charAt(y)==';') {
						Source[i]=Source[i].substring(0, y)+","+Source[i].substring(y+1);
					}
				}
				
			}
			return Source;
		}
		
		public static String[] Lat(String Source[],String Lat[]) {//Method that Stores the Latitude Data in an array
			int counter=0;
			int start=0;
			int end=0;
			for (int i=0;i<Source.length;i++){
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
				Lat = Arrays.copyOf(Lat, Lat.length+1);
				Lat[i]=Source[i].substring(start, end);
				counter=0;
				start=0;
				end=0;
			}
			return Lat;		
		}
		public static String[] Lon(String Source[],String Lon[]) {//Method that Stores the Longitude Data in an array
			int counter=0;
			int start=0;
			int end=0;
			for (int i=0;i<Source.length;i++){
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
				Lon = Arrays.copyOf(Lon, Lon.length+1);
				Lon[i]=Source[i].substring(start, end);
				counter=0;
				start=0;
				end=0;
			}
			return Lon;		
		}
		public static String[] Names(String Source[],String Names[]) {//Method that Stores the Names Data in an array
			int counter=0;
			int start=0;
			int end=0;
			for (int i=0;i<Source.length;i++){
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
				Names = Arrays.copyOf(Names, Names.length+1);
				Names[i]=Source[i].substring(start, end);
				counter=0;
				start=0;
				end=0;
			}
			return Names;		
		}
		public static String[] Signals(String Source[],String Signals[]) {//Method that Stores the Signals Data in an array
			int counter=0;
			int start=0;
			int end=0;
			for (int i=0;i<Source.length;i++){
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
				Signals = Arrays.copyOf(Signals, Signals.length+1);
				Signals[i]=Source[i].substring(start, end);
				counter=0;
				start=0;
				end=0;
			}
			return Signals;		
		}
		public static String[] Times(String Source[],String Times[]) {//Method that Stores the Time Data in an array
			int counter=0;
			int start=0;
			int end=0;
			for (int i=0;i<Source.length;i++){
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
				Times = Arrays.copyOf(Times, Times.length+1);
				Times[i]=Source[i].substring(start, end);
				counter=0;
				start=0;
				end=0;
			}
			return Times;		
		}
		public static int[] StrongestSignalsLocation(String Signals[],int StrongestSignalsLocation[]) {//Method that Calculates top 10 Indexs of Signal incase there is more then 10
			int [] Number = new int [0];
			for (int i=1;i<Signals.length;i++) {
				Number = Arrays.copyOf(Number, Number.length+1);
				Number[i-1]=0;
				for (int y=1;y<Signals[i].length();y++) {
					Number[i-1]=Number[i-1]+(int)(Signals[i].charAt(y))-48;
					Number[i-1]=Number[i-1]*10;
				}
				Number[i-1]=Number[i-1]/10;
			}
			int Min=1000000;
			for (int j=0;j<10;j++) {
			for (int i=0;i<Number.length;i++) {
				if (Number[i]<Min) {
					Min=Number[i];
					StrongestSignalsLocation = Arrays.copyOf(StrongestSignalsLocation, StrongestSignalsLocation.length+1);
					StrongestSignalsLocation[j]=i+1;
				}
			}
			Min=1000000;
			Number[StrongestSignalsLocation[j]-1]=1000000;
			}
			return StrongestSignalsLocation;
		}
		
		public static int[] GeneralLocationFilter(String Path,String Lat[],String Lon[],String Time[],String Name[],int LocationIndex[],String input,int FinalLocations [],String Source[]) {
			if (Source.length>11) {//Filters by your name,location or Time entered.
			int y=0;
			if (Path.equals("L")) {
				for (int i=0;i<LocationIndex.length;i++) {
					if ((Lat[LocationIndex[i]]+','+Lon[LocationIndex[i]]).equals(input) ) {
						FinalLocations = Arrays.copyOf(FinalLocations, FinalLocations.length+1);
						FinalLocations[y]=LocationIndex[i];
						y++;
					}
				}
			}
			if (Path.equals("N")) {
				for (int i=0;i<LocationIndex.length;i++) {
					if (Name[LocationIndex[i]].equals(input) ) {
						FinalLocations = Arrays.copyOf(FinalLocations, FinalLocations.length+1);
						FinalLocations[y]=LocationIndex[i];
						y++;
					}
				}
				
			}
			if (Path.equals("T")) {
				for (int i=0;i<LocationIndex.length;i++) {
					if (Time[LocationIndex[i]].equals(input) ) {
						FinalLocations = Arrays.copyOf(FinalLocations, FinalLocations.length+1);
						FinalLocations[y]=LocationIndex[i];
						y++;
					}
				}
				
			}}
			if (Source.length<=11) {
				int y=0;
				if (Path.equals("L")) {
					for (int i=0;i<Source.length;i++) {
						if ((Lat[i]+","+Lon[i]).equals(input)) {
							FinalLocations = Arrays.copyOf(FinalLocations, FinalLocations.length+1);
							FinalLocations[y]=i;
							y++;
						}
					}
					
				}
				if (Path.equals("N")) {
					for (int i=0;i<Source.length;i++) {
						if (Name[i].equals(input)) {
							FinalLocations = Arrays.copyOf(FinalLocations, FinalLocations.length+1);
							FinalLocations[y]=i;
							y++;
						}
					}
					
				}
				if (Path.equals("T")) {
					for (int i=0;i<Source.length;i++) {
						if (Time[i].equals(input)) {
							FinalLocations = Arrays.copyOf(FinalLocations, FinalLocations.length+1);
							FinalLocations[y]=i;
							y++;
						}
					}
					
				}
				
				
			}
			return FinalLocations;
		}
			
			public static void Write(String fileName,String Source[],int Locations[],String Lat[],String Lon[],int Done,int FinalLocations[]) {// Method that Write into the file the Finished Data	                            
		                try {
		                    // Assume default encoding.
		                    FileWriter fileWriter =
		                        new FileWriter(fileName);

		                    // Always wrap FileWriter in BufferedWriter.
		                    BufferedWriter bufferedWriter =
		                        new BufferedWriter(fileWriter);

		                    // Note that write() does not automatically
		                    // append a newline character.
		                    if (Done==0) {
		                    bufferedWriter.write(Source[0]);
		                    bufferedWriter.newLine();
		                    if (Source.length<=11) {
		                    	 for (int i=1;i<Source.length;i++) {
				                    	bufferedWriter.write(Source[i]);
				                    	bufferedWriter.newLine();
		                    }}
		                    if (Source.length>11) {
		                    for (int i=0;i<10;i++) {
		                    	bufferedWriter.write(Source[Locations[i]]);
		                    	bufferedWriter.newLine();
		                    }}}
		                    if (Done==1) {
		                    bufferedWriter.write(Matala.Begin);
		                    for (int i=1; i<Source.length && i<=11; i++){
		                        bufferedWriter.write(Matala.ModuleLon);
		                        bufferedWriter.write(Lon[i]);
		                        bufferedWriter.write(Matala.ModuleLat);
		                        bufferedWriter.write(Lat[i]);
		                        bufferedWriter.write(Matala.ModuleCor);
		                        bufferedWriter.write(Lon[i]);
		                        bufferedWriter.write(",");
		                        bufferedWriter.write(Lat[i]);
		                        bufferedWriter.write(",0");
		                        bufferedWriter.write(Matala.Moduleend);
		                        }
		                    bufferedWriter.write(Matala.Modulefin);
		                    }
		                    
		                    if (Done==2) {
		                    bufferedWriter.write(Matala.Begin);
		                    for (int i=0; i<FinalLocations.length && i<=11; i++){
		                        bufferedWriter.write(Matala.ModuleLon);
		                        bufferedWriter.write(Lon[FinalLocations[i]]);
		                        bufferedWriter.write(Matala.ModuleLat);
		                        bufferedWriter.write(Lat[FinalLocations[i]]);
		                        bufferedWriter.write(Matala.ModuleCor);
		                        bufferedWriter.write(Lon[FinalLocations[i]]);
		                        bufferedWriter.write(",");
		                        bufferedWriter.write(Lat[FinalLocations[i]]);
		                        bufferedWriter.write(",0");
		                        bufferedWriter.write(Matala.Moduleend);
		                        }
		                    bufferedWriter.write(Matala.Modulefin);
		                    }

		                    
		        		                    		                 		                        		                		                    
		                 // Always close files.
		                    bufferedWriter.close();
		                }
		                catch(IOException ex) {
		                    System.out.println(
		                        "Error writing to file '"
		                        + fileName + "'");
		                    // Or we could just do this:
		                    // ex.printStackTrace();
		                }
		 
		                
		        }// Makes an array of all the latency numbers
}


