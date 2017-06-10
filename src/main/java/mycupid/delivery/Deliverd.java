package mycupid.delivery;

import java.io.IOException;

import javax.script.ScriptException;

import mycupid.Extractor.Extractor;
import mycupid.csv.CsvController;
import mycupid.csv.CsvCounter;
//import mycupid.csv.CsvNameCount;

@SuppressWarnings("restriction")
public class Deliverd {
	public void deliverd(String[] args) throws IOException, ScriptException{
		Extractor ext = new Extractor();
		CsvController con = new CsvController();
		//CsvNameCount cnv  = new CsvNameCount();
		String file_name =  args[0] +"_result.csv";
		String file_output = args[0] +"_output.csv";
		ext.extract(args[0],file_name);
		con.outputCsv(Integer.parseInt(args[1]),Integer.parseInt(args[2]),Double.parseDouble(args[3]),file_name,file_output);
		//cnv.nameCount(file_output,0);
		//cnv.simiralityAndElements(file_output);
	}
	public void deliverdCounter(String[] args) throws IOException, ScriptException{
		Extractor ext = new Extractor();
		CsvCounter con = new CsvCounter();
		String file_name = args[0] +"_result.csv";
		String file_output = args[0] +"_output.csv";
		ext.extract(args[0],file_name);
		con.counter(Double.parseDouble(args[1]),file_output);
	}
}
