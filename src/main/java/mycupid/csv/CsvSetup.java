package mycupid.csv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import mycupid.Extractor.Judgment;

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
	public void search(String file_output,int average,int deviation) throws IOException{
		Judgment judg = new Judgment();
		if(judg.judgmentCsvExtract(ent.getTarget_count(),ent.getSimilarity(),average,deviation)){
			FileWriter fw = new FileWriter(file_output, true); 
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			String put;
			put =  ent.getTarget_name() + "," + ent.getTarget_count()
			+ "," + ent.getTarget_elements() + "," + ent.getGroup_name()
			+ "," + ent.getGroup_count() + "," + ent.getGroup_elements()
			+ "," + ent.getSimilarity() + "\n";
			pw.print(put);
			pw.close();
		}
	}
	public void secondSearch(String file_output,List<Integer> answer) throws IOException{
		Judgment judg = new Judgment();
		if(judg.judgmentSecondCsvExtract(ent.getTarget_count(),ent.getSimilarity(),answer.get(6),answer.get(5),answer.get(4),answer.get(3),answer.get(2),answer.get(0),answer.get(1))){
			FileWriter fw = new FileWriter(file_output, true); 
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			String put;
			put =  ent.getTarget_name() + "," + ent.getTarget_count()
			+ "," + ent.getTarget_elements() + "," + ent.getGroup_name()
			+ "," + ent.getGroup_count() + "," + ent.getGroup_elements()
			+ "," + ent.getSimilarity() + "\n";
			pw.print(put);
			pw.close();
		}
	}
	public void thirdSearch(String file_output,List<Integer> answer) throws IOException{
		Judgment judg = new Judgment();
		if(judg.judgmentThirdCsvExtract(ent.getTarget_count(),ent.getSimilarity(),answer.get(6),answer.get(5),answer.get(4),answer.get(3),answer.get(2),answer.get(0),answer.get(1))){
			FileWriter fw = new FileWriter(file_output, true); 
			PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
			String put;
			put =  ent.getTarget_name() + "," + ent.getTarget_count()
			+ "," + ent.getTarget_elements() + "," + ent.getGroup_name()
			+ "," + ent.getGroup_count() + "," + ent.getGroup_elements()
			+ "," + ent.getSimilarity() + "\n";
			pw.print(put);
			pw.close();
		}
	}
}
