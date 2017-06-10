package mycupid;

import mycupid.Extractor.Judgment;

public class TestJudgment {
	public static void main(String args[]){
	Judgment judg = new Judgment();
	boolean j;
	j = judg.judgmentCsvExtract(30,0.88, 50, 10, 0.6);
	System.out.println(j);
	}
}
