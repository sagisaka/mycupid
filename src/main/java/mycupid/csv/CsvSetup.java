package mycupid.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CsvSetup {
	CsvEntity ent = new CsvEntity();
	public BufferedReader inputFile(File file) throws FileNotFoundException{
		BufferedReader br = new BufferedReader(new FileReader(file));
		return br;
	}
	public void setting(String[] array){
		ent.setTarget_name(array[0]);
		ent.setTarget_count(Integer.parseInt(array[1]));
		ent.setTarget_elements(array[2]);
		ent.setGroup_name(array[3]);
		ent.setGroup_count(Integer.parseInt(array[4]));
		ent.setGroup_elements(array[5]);
		ent.setSimilarity(Float.parseFloat(array[6]));
	}
	public void getting(double d) throws IOException{
		FileWriter fw = new FileWriter("src/main/resources/output.csv", true); 
		PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
		if(ent.getSimilarity() >= d){
			pw.print(ent.getTarget_name());
			pw.print(",");
			pw.print(ent.getTarget_count());
			pw.print(",");
			pw.print(ent.getTarget_elements());
			pw.print(",");
			pw.print(ent.getGroup_name());
			pw.print(",");
			pw.print(ent.getGroup_count());
			pw.print(",");
			pw.print(ent.getGroup_elements());
			pw.print(",");
			pw.print(ent.getSimilarity());
			pw.print("\n");
		}
		pw.close();
	}
}
