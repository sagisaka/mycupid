package mycupid.csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class CsvController {
	public void outputCsv(Double d) throws IOException{
		CsvSetup set = new CsvSetup();
		File file = new File("src/main/resources/test.csv");

		BufferedReader br = set.inputFile(file);
		String line;
		while((line = br.readLine()) != null){
			String array[] = line.split(",");
			set.setting(array);
			set.getting(d);
		}
		br.close();
	}
}
