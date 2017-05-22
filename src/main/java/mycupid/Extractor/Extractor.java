package mycupid.Extractor;


import java.io.File;
import java.io.IOException;

import javax.script.ScriptException;

import com.github.pochi.runner.scripts.ScriptRunner;
import com.github.pochi.runner.scripts.ScriptRunnerBuilder;


@SuppressWarnings("restriction")
public class Extractor {
	public void extract(String file_name) throws IOException, ScriptException {
		File file = new File(file_name);
		File dir = new File("src/main/resources/testcase");
		System.out.println("x");
		ScriptRunner runner = new ScriptRunnerBuilder().build();
		File[] files = dir.listFiles();
		if(!file.exists()){
			for (int i = 0; i < files.length; i++) {
		        File file2 = files[i];
		        System.out.println(file2);
		        if(file2.getPath().endsWith(".jar")){
		        	runner.runsScript(new String[] { "src/main/resources/extract_and_compare.js","src/main/resources/abbot-1.4.0.jar" ,"src/main/resources/abbot-1.4.0.jar" ,file_name});
		        }
			}
		}
	}
}
