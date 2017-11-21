package MatalaMivneNet;

import java.util.Scanner;

public class MainMat {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputFilter syso= new InputFilter();
		Reader a = new Reader("C:/Users/Moshe/Desktop/OutputAlmostUni.txt");
		WiFi b = new WiFi(a.getSource());
		Lat c = new Lat(b);
		Lon d = new Lon(b);
		ID e = new ID(b);
		Time g = new Time(b);
		BeaconInterval f = new BeaconInterval(b);
		StringtoInt h = new StringtoInt(f.getSignals());
		CheckMax o = new CheckMax(h.getNum(),10);
		MakeanArray y = new MakeanArray(o.getMaxNum(),b.getSource(),o.getMaxNum().length);
		Writer Top10 = new Writer("C:/Users/Moshe/Desktop/Top10.txt",y.getArrayCreated());
		KMLCreator s = new KMLCreator(c,d,e,g);
		Writer KMLtop10 = new Writer("C:/Users/Moshe/Desktop/KMLTop10.kml",s.getSource());
		Input KMLFinal = new Input(syso,y);
		MakeanArray KMLF = new MakeanArray(KMLFinal.getIndex(),y.getArrayCreated(),KMLFinal.getIndex().length);
		WiFi FinalListb = new WiFi(KMLF.getArrayCreated());
		Lat FLc = new Lat(FinalListb);
		Lon FLd = new Lon(FinalListb);
		ID FLe = new ID(FinalListb);
		Time FLf = new Time(FinalListb);
		KMLCreator FLs = new KMLCreator(FLc,FLd,FLe,FLf);
		Writer KMLFinalList = new Writer("C:/Users/Moshe/Desktop/KMLFinalList.kml",FLs.getSource());
		/*System.out.println("Source");(Testing the program)
		for ( int i=0;i<b.getSource().length;i++) {
			System.out.println(b.getSource()[i]);
		}
		System.out.println("Lat");
		for ( int i=0;i<c.getLattitude().length;i++) {
			System.out.println(c.getLattitude()[i]);
		}
		System.out.println("Lon");
		for ( int i=0;i<d.getLon().length;i++) {
			System.out.println(d.getLon()[i]);
		}
		
		System.out.println("Names");
		for ( int i=0;i<e.getNames().length;i++) {
			System.out.println(e.getNames()[i]);
		}
		System.out.println("Signals");
		for ( int i=0;i<f.getSignals().length;i++) {
			System.out.println(f.getSignals()[i]);
		}
		
		System.out.println("Times");
		for ( int i=0;i<g.getTimes().length;i++) {
			System.out.println(g.getTimes()[i]);
		}
		
		System.out.println("Lat-Int");
		for ( int i=0;i<h.getNum().length;i++) {
			System.out.println(h.getNum()[i]);
		}
		System.out.println("MaxNum");
		System.out.println(o.toString());
		for (int i=0;i<y.getArrayCreated().length;i++) {
			System.out.println(y.getArrayCreated()[i]);
		}
		System.out.println("FinalList");
		for (int i=0;i<KMLF.getArrayCreated().length;i++) {
			System.out.println(KMLF.getArrayCreated()[i]);
		}*/
		}
	}


