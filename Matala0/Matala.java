package Matalot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Matala {
	
	static String Begin = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <kml xmlns=\"http://www.opengis.net/kml/2.2\"      xmlns:gx=\"http://www.google.com/kml/ext/2.2\"> <Document><name><![CDATA[Blabla100]]></name><Snippet maxLines='1'>Earth Point Excel To KML</Snippet><open>1</open><Style><IconStyle><Icon></Icon></IconStyle><BalloonStyle><text><![CDATA[$[description]]]></text></BalloonStyle></Style><description><![CDATA[<style type='text/css'>*{font-family:Verdana,Arial,Helvetica,Sans-Serif;}</style><table style=\"width: 300px;\"><tr><td style=\"vertical-align: top;\">Source</td><td style=\"width: 100%;\">Blabla100.txt</td></tr><tr><td>DateTime</td><td>2017-10-26 09:50:44 UTC <br/></td></tr></table><br/>&copy;2017 Earth Point<br/><a target='_blank' href='http://www.earthpoint.us'>www.earthpoint.us</a><br/><br/>For illustration only.&nbsp; User to verify all information. ]]></description><StyleMap id=\"Sheet1Map1\"><Pair><key>normal</key><styleUrl>#NormalSheet1Map1</styleUrl></Pair><Pair><key>highlight</key><styleUrl>#HighlightSheet1Map1</styleUrl></Pair></StyleMap><Style id=\"NormalSheet1Map1\"><IconStyle><scale>1</scale><Icon><href>http://www.earthpoint.us/Dots/GoogleEarth/paddle/ltblu-diamond.png</href></Icon></IconStyle><LabelStyle><color>FFFFFFFF</color><scale>1</scale></LabelStyle><LineStyle><color>FFFF00FF</color><width>2</width></LineStyle><PolyStyle><fill>0</fill><outline>1</outline><color>00FF00FF</color></PolyStyle><BalloonStyle><text><![CDATA[$[description]]]></text></BalloonStyle></Style><Style id=\"HighlightSheet1Map1\"><IconStyle><scale>1.1</scale><Icon><href>http://www.earthpoint.us/Dots/GoogleEarth/paddle/ltblu-diamond.png</href></Icon></IconStyle><LabelStyle><color>FFFFFFFF</color><scale>1.1</scale></LabelStyle><LineStyle><color>FFFF00FF</color><width>3</width></LineStyle><PolyStyle><fill>0</fill><outline>1</outline><color>70FF00FF</color></PolyStyle><BalloonStyle><text><![CDATA[$[description]]]></text></BalloonStyle></Style><Folder><name><![CDATA[Sheet1]]></name><visibility>1</visibility><open>0</open>";
	static String ModuleLon = "<Placemark><name><![CDATA[<b/>]]></name><Style><LabelStyle><color>00000000</color></LabelStyle></Style><Snippet maxLines='0'></Snippet><styleUrl>#Sheet1Map1</styleUrl><ExtendedData></ExtendedData><LookAt><longitude>";
	static String ModuleLat = "</longitude><latitude>";
	static String ModuleCor = "</latitude><range>1000</range><altitudeMode>relativeToGround</altitudeMode><tilt>0</tilt><heading>0</heading></LookAt><Point><altitudeMode>clampToGround</altitudeMode><extrude>0</extrude><coordinates>";
	static String Modulefin ="</Folder></Document></kml>"; 
	static String Moduleend ="</coordinates></Point></Placemark>";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int check=0;
		String FileR="C:/Users/Moshe/Desktop/Matala0/UniGmon.txt";
		String FileW="C:/Users/Moshe/Desktop/Matala0/OutputAlmostHome.csv";
		int Done=0;
		String Input = "";
		String Path = "";
		Scanner input = new Scanner(System.in);
		do {
			if(check==1) {
				System.out.println("Wrong input, Try again.");
			}
		System.out.println("Insert Searching Parameter - T = Time , N = Name , L = Location");
	    Path = input.nextLine();
	    check=1;
		}while(!Path.equals("N") && !Path.equals("T") && !Path.equals("L"));
		check=0;
		do {
			if(check==1) {
				System.out.println("Wrong input, Try again.");
			}
		check=1;
	    System.out.println("Insert Details ");
	    Input = input.nextLine();
		}while(Input.contains(";")||Input.contains(",")||Input.length()==0);
		String Names [] = new String [0];
		String Times [] = new String [0];
		String Source [] = new String [0];
		String Signals [] = new String [0];
		String Lat [] = new String [0];
		String Lon [] = new String [0];
		int FinalLocations [] = new int [0];
		int StrongestSignalsLocation [] = new int [0];
		Source = Matala0.Read(FileR, Source);
		Source = Matala0.Comma(Source);
		Lat = Matala0.Lat(Source,Lat);
		Times = Matala0.Times(Source, Times);
		Lon = Matala0.Lon(Source, Lon);
		Names = Matala0.Names(Source, Names);
		Signals = Matala0.Signals(Source, Signals);
		if (Source.length>11) {
		StrongestSignalsLocation = Matala0.StrongestSignalsLocation(Signals, StrongestSignalsLocation);
		}
		Matala0.Write(FileW,Source,StrongestSignalsLocation,Lat,Lon,Done,FinalLocations);
		FileW="C:/Users/Moshe/Desktop/Matala0/OutputDoneHomeTop10.kml";
		Done=1;
		Matala0.Write(FileW,Source,StrongestSignalsLocation,Lat,Lon,Done,FinalLocations);		
		FinalLocations = Matala0.GeneralLocationFilter(Path, Lat, Lon, Times, Names, StrongestSignalsLocation, Input,FinalLocations,Source);
		FileW="C:/Users/Moshe/Desktop/Matala0/OutputDoneFINALHomeChosen.kml";
		Done=2;
		Matala0.Write(FileW,Source,StrongestSignalsLocation,Lat,Lon,Done,FinalLocations);
		input.close();
	}

}
