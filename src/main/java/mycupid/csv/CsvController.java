package mycupid.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class CsvController {
	public void outputCsv(List<Integer> answer,String file_name,String file_output,String file_output2,String file_output3) throws IOException{
		CsvSetup set = new CsvSetup();
		File file = new File(file_name);

		BufferedReader br = set.inputFile(file);
		String line;
		while((line = br.readLine()) != null){
			String array[] = line.split(",");
			set.setting(array);
			set.search(file_output,answer.get(0),answer.get(1));
			set.secondSearch(file_output2,answer);
			set.thirdSearch(file_output3,answer);
		}
		br.close();
	}
}
