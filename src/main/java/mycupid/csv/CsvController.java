package mycupid.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class CsvController {
	public void outputCsv(int max_count,int low_count,Double simirality,String file_name,String file_output) throws IOException{
		CsvSetup set = new CsvSetup();
		File file = new File(file_name);

		BufferedReader br = set.inputFile(file);
		String line;
		while((line = br.readLine()) != null){
			String array[] = line.split(",");
			set.setting(array);
			set.search(file_output,max_count,low_count,simirality);
			set.perfectSerach(file_output,max_count,low_count,simirality);
		}
		br.close();
	}
}
