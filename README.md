# WiFi-Job
Program that Takes a txt file containing WiFi info and returns KML File containings locations of Top 10.

To the eyes of the professor : Due to Illness over the last 2 weeks I did not get to Critisize other chores, 
Therefor that report is missing.

With that being said, I have concluded both the excersizer and the Studest Critisizem and improved my work.
You can see a significant improvement from Matala0, to the new Updated SRC which is far more Object Oriented.

This program takes a file (Text file) Using Gmon information, The file includes full information of the closest
WiFi locations including (BSSID,LAT,LON,SSID,Crypt,Beacon Interval,Connection Mode,Channel,RXL,Date,Time),
After taking those files the program reads the file and filters the top10 strong signals then prints a CSV(Excel) file of those.
After which it takes the input from the user (Time , Location or Name) and filters farther for a final result.
The final result is taken and the Lon and Lat indexes are used in order to create a KML file.
The KML file will show on google earth the chosen locations on the Globe.

Objects used : Beacon Interval - Takes the Text file and Stores the Beacons in an Array of Strings.
BSSID :To be created.
Channel :To be created.
CheckMax:Takes Array of Ints and orginizes it from highest to lowest by indexes, using an Integer in order to decide
the amount of indexes aimed for.
CommaInserter : Simple object used to change any ; to a , used mainly for the CSV file creator.
ConnectionMode :To be created.
Date : To be Created.
ID : Takes the Text file and Stores the IDs (Names) of the WiFi spots in an Array of Strings.
Input : Takes the Input and Apply filtering in order to get to the Final choice/s for the KML final Result.
InputFilter : applied wide area of filtering in order to ensure a perfect input to remove any issues farther along.
KMLCreator : Used to take Lat, Lon,IDs and Time in order to create an attractive KML file that can be used in Google earth.
Lat : Takes the Text file and Stores the Latitudes in an Array of Strings.
Lon : Takes the Text file and Stores the Longitudes in an Array of Strings.
MainMat : Main mostly used object oriented in order to make it all work as one unit.
MakeanArray : Used to make an Array in the right format for the job.
Reader : Reads from File.
RXL : To be Created.
SSID : To be Created.
StringtoInt : Used to make an array of INT numbers that are saved in a String Array to an Array of INTs.
Time : Takes the Text file and Stores the Times in an Array of Strings.
WiFi : Takes the Text file and change it to the right formation for farther use by the other objects.
Writer : Writes to file.
