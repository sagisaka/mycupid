package mycupid;

import java.io.IOException;

import javax.script.ScriptException;

import mycupid.Extractor.Extractor;



@SuppressWarnings("restriction")
public class Extracotr_test {
	public static void main(String[] args) throws IOException, ScriptException{
		Extractor ext = new Extractor();
		ext.extract("src/main/resources/test.csv");
	}
}
