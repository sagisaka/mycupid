package mycupid.Extractor;

public class Judgment {
	
	public boolean judgmentCsvExtract(int target_count,double simirality,int max_count,int low_count,double low_simirality){
		if(target_count>=max_count && simirality>=low_simirality){
			return true;
		}else if(simirality>=low_simirality && target_count >= (low_count-max_count)/(1.0-low_simirality)*(simirality-low_simirality)+max_count){
			return true;
		}
		return false;
	}
}
