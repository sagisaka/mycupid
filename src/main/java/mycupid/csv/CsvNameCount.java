package mycupid.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class CsvNameCount {
	public void nameCount(String file_output,int num) throws IOException{
		CsvSetup set = new CsvSetup();
		HashMap<String, String> map = new HashMap<String, String>();
		File file = new File(file_output);

		BufferedReader br = set.inputFile(file);
		String line;
		//Integer count = 1;
		while((line = br.readLine()) != null){
			String array[] = line.split(",");
			if(map.get(array[0])==null){
				//count=1;
				map.put(array[0],array[1]);
			}
		}
		this.printMap(map,num);
		br.close();
	}
	
	public void simiralityAndElements(String file_output) throws IOException{
		CsvSetup set = new CsvSetup();
		File file = new File(file_output);
		FileWriter fw = new FileWriter("src/main/resources/simirality.csv", true); 
		PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
		
		BufferedReader br = set.inputFile(file);
		String line;
		//pw.print("this_jar,jars,simirality\n");
		while((line = br.readLine()) != null){
			String array[] = line.split(",");
			pw.print(Integer.parseInt(array[1]));
			pw.print(","); 
			pw.print(Integer.parseInt(array[4]));
			pw.print(","); 
			pw.print(Float.parseFloat(array[6]));
			pw.print("\n");
		}
		pw.close();
	}
	
	void printMap(HashMap<String, String> map, int num) throws IOException{
		FileWriter fw = new FileWriter("src/main/resources/name_"+ num +".csv", true); 
		PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
		String str;
        for(Map.Entry<String, String> entry: map.entrySet()){
        	str = entry.getKey() +","+ entry.getValue() + "\n";
			pw.print(str);
        }
        pw.close();
    }
}
