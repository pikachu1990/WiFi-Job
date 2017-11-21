package MatalaMivneNet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
/**
 * Input : FileName .
 * Return : Array of Strings containing the file index.
 */
public class Reader {
	private String Filename;
	private String Source [] = new String [0];
	
	public Reader(String Filename) {
		this.Filename=Filename+"";
		Source=Read(Filename,Source);
	}

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
	}

	public String getFilename() {
		return Filename;
	}

	public void setFilename(String filename) {
		Filename = filename;
	}

	public String[] getSource() {
		return Source;
	}

	public void setSource(String[] source) {
		Source = source;
	}

	@Override
	public String toString() {
		return "Reader [Filename=" + Filename + ", Source=" + Arrays.toString(Source) + "]";
	}
	
	
}
