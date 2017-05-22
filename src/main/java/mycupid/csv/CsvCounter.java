package mycupid.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CsvCounter {
	public void counter(Double d) throws IOException{
		CsvSetup set = new CsvSetup();
		while(d<=1.0){
			File file = new File("src/main/resources/test.csv");

			BufferedReader br = set.inputFile(file);
			String line;
			while((line = br.readLine()) != null){
				String array[] = line.split(",");
				set.setting(array);
				set.getting(d);
			}
			br.close();


			File file2 = new File("src/main/resources/output.csv");

			if (file2.length() <= 0){
				file2.delete();
				break;
			}
			BufferedReader br2 = set.inputFile(file2);

			line = null;
			int n=0;
			while ((line = br2.readLine()) != null) {
				n++;
			}
			br2.close();
			file2.delete();
			FileWriter fw = new FileWriter("src/main/resources/sample.csv", true);  //※１
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			pw.print(d);
			pw.print(",");
			pw.println(n);
			pw.close();
			d = d+0.01;
		}
	}
}
