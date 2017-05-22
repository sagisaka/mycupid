package mycupid.delivery;

import java.io.IOException;

import javax.script.ScriptException;

import mycupid.Extractor.Extractor;
import mycupid.csv.CsvController;

@SuppressWarnings("restriction")
public class Deliverd {
	public void deliverd() throws IOException, ScriptException{
		Extractor ext = new Extractor();
		CsvController con = new CsvController();
		ext.extract("src/main/resources/test.csv");
		con.outputCsv(1.00);
	}
}
