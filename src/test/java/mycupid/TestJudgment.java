package mycupid;

import mycupid.Extractor.Judgment;

public class TestJudgment {
	public static void main(String args[]){
	Judgment judg = new Judgment();
	boolean j;
	//j = judg.judgmentCsvExtract(30,0.9, 10, 10);
	j = judg.judgmentSecondCsvExtract(74,0.6,5,5,8,14,74,11,10);
	System.out.println(j);
	}
}
