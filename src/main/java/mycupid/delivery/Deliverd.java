package mycupid.delivery;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.script.ScriptException;

import mycupid.Extractor.Extractor;
import mycupid.csv.CsvController;
import mycupid.csv.CsvCounter;
import mycupid.csv.CsvNameCount;
import mycupid.research.CsvExtract;
//import mycupid.csv.CsvNameCount;

@SuppressWarnings("restriction")
public class Deliverd {
	public void deliverd(String[] args) throws IOException, ScriptException{
		Extractor ext = new Extractor();
		CsvController con = new CsvController();
		CsvExtract ce = new CsvExtract();
		CsvNameCount cnv  = new CsvNameCount();
		List<Integer> answer = new ArrayList<Integer>();
		String file_name =  args[0] +"_result.csv";
		String file_name2 =  args[0] +"_result_only.csv";

		String file_output = args[0] +"_output.csv";
		String file_output2 = args[0] +"_output2.csv";
		String file_output3 = args[0] +"_output3.csv";

		ext.extract(args[0],file_name);
		ext.extractOnlyOne(args[0],file_name2);
		answer = ce.answer(file_name2);

		con.outputCsv(answer,file_name,file_output,file_output2,file_output3);
		//cnv.nameCount(file_output,0);
		cnv.simiralityAndElements(file_name);
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
