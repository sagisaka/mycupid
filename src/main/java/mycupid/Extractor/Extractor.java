package mycupid.Extractor;


import java.io.File;
import java.io.IOException;

import javax.script.ScriptException;

import com.github.pochi.runner.scripts.ScriptRunner;
import com.github.pochi.runner.scripts.ScriptRunnerBuilder;


@SuppressWarnings("restriction")
public class Extractor {
	public void extract(String file,String file_name) throws IOException, ScriptException {
		File outputFile = new File(file_name);
		File dir = new File("src/main/resources/testcase");
		ScriptRunner runner = new ScriptRunnerBuilder().build();
		File[] files = dir.listFiles();
		if(!outputFile.exists()){
			for (int i = 0; i < files.length; i++) {
		        File file2 = files[i];
		        System.out.println(file2.getCanonicalPath());
		        if(file2.getPath().endsWith(".jar")){
		        	runner.runsScript(new String[] { "src/main/resources/extract_and_compare.js",file ,file2.getCanonicalPath() ,file_name});
		        }
			}
		}
	}
}
