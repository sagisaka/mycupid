package mycupid.delivery;

import java.io.IOException;

import javax.script.ScriptException;

import mycupid.Extractor.Extractor;
import mycupid.csv.CsvController;
import mycupid.csv.CsvCounter;

@SuppressWarnings("restriction")
public class Deliverd {
	public void deliverd() throws IOException, ScriptException{
		Extractor ext = new Extractor();
		CsvController con = new CsvController();
		CsvCounter con2 = new CsvCounter();
		ext.extract("src/main/resources/test.csv");
		con2.counter(0.01);
	}
}
