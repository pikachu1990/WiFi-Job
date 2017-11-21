package MatalaMivneNet;
/**
 * Input : Gets 3 arrays of Latitude, Longitude and IDs
 * Return : KML File Array of Strings.
 */

public class KMLCreator {
	private String Begin = "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <kml xmlns=\"http://www.opengis.net/kml/2.2\"      xmlns:gx=\"http://www.google.com/kml/ext/2.2\"> <Document><name><![CDATA[Blabla100]]></name><Snippet maxLines='1'>Earth Point Excel To KML</Snippet><open>1</open><Style><IconStyle><Icon></Icon></IconStyle><BalloonStyle><text><![CDATA[$[description]]]></text></BalloonStyle></Style><description><![CDATA[<style type='text/css'>*{font-family:Verdana,Arial,Helvetica,Sans-Serif;}</style><table style=\"width: 300px;\"><tr><td style=\"vertical-align: top;\">Source</td><td style=\"width: 100%;\">Blabla100.txt</td></tr><tr><td>DateTime</td><td>2017-10-26 09:50:44 UTC <br/></td></tr></table><br/>&copy;2017 Earth Point<br/><a target='_blank' href='http://www.earthpoint.us'>www.earthpoint.us</a><br/><br/>For illustration only.&nbsp; User to verify all information. ]]></description><StyleMap id=\"Sheet1Map1\"><Pair><key>normal</key><styleUrl>#NormalSheet1Map1</styleUrl></Pair><Pair><key>highlight</key><styleUrl>#HighlightSheet1Map1</styleUrl></Pair></StyleMap><Style id=\"NormalSheet1Map1\"><IconStyle><scale>1</scale><Icon><href>http://maps.google.com/mapfiles/kml/pal4/icon39.png</href></Icon></IconStyle><LabelStyle><color>FFFFFFFF</color><scale>1</scale></LabelStyle><LineStyle><color>FFFF00FF</color><width>2</width></LineStyle><PolyStyle><fill>0</fill><outline>1</outline><color>00FF00FF</color></PolyStyle><BalloonStyle><text><![CDATA[$[description]]]></text></BalloonStyle></Style><Style id=\"HighlightSheet1Map1\"><IconStyle><scale>1.1</scale><Icon><href>http://maps.google.com/mapfiles/kml/pal4/icon39.png</href></Icon></IconStyle><LabelStyle><color>FFFFFFFF</color><scale>1.1</scale></LabelStyle><LineStyle><color>FFFF00FF</color><width>3</width></LineStyle><PolyStyle><fill>0</fill><outline>1</outline><color>70FF00FF</color></PolyStyle><BalloonStyle><text><![CDATA[$[description]]]></text></BalloonStyle></Style><Folder><name><![CDATA[WiFi-Locations]]></name><visibility>1</visibility><open>0</open>";
	private String ModuleLon = "<Placemark><name><![CDATA[";
	private String ModuleLon2 = "]]></name><Style><LabelStyle><color>00000000</color></LabelStyle></Style><Snippet maxLines='0'></Snippet><styleUrl>#Sheet1Map1</styleUrl><ExtendedData></ExtendedData><LookAt><longitude>";
	private String ModuleLat = "</longitude><latitude>";
	private String ModuleCor = "</latitude><range>1000</range><altitudeMode>relativeToGround</altitudeMode><tilt>0</tilt><heading>0</heading></LookAt><Point><altitudeMode>clampToGround</altitudeMode><extrude>0</extrude><coordinates>";
	private String Modulefin ="</Folder></Document></kml>"; 
	private String Moduleend ="</coordinates></Point></Placemark>";
	private String Source []= new String [1];
	public KMLCreator(Lat a, Lon b,ID c) {
		this.Source = KMLCreate(a,b,c);
	}
	public String[] KMLCreate(Lat a,Lon b,ID c) {
        Source[0]=Begin;
        for (int i=0; i<a.getLattitude().length; i++){
            Source[0]=Source[0]+ModuleLon+c.getNames()[i]+ModuleLon2+b.getLon()[i]+ModuleLat+a.getLattitude()[i]+ModuleCor+b.getLon()[i]+","+a.getLattitude()[i]+",0"+Moduleend;
            }
        Source[0] = Source[0] + Modulefin;
	return Source;
	}
	public String[] getSource() {
		return Source;
	}
	public void setSource(String source[]) {
		Source = source;
	}
	@Override
	public String toString() {
		return "KMLCreator [Source=" + Source + "]";
	}
	
	}

