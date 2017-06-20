package mycupid.Extractor;

public class Judgment {
	
	public boolean judgmentCsvExtract(int target_count,double simirality,int average,int deviation){
//		if(target_count>=max_count && simirality>=low_simirality){
//			return true;
//		}else if(simirality>=low_simirality && target_count >= (low_count-max_count)/(1.0-low_simirality)*(simirality-low_simirality)+max_count){
//			return true;
//		}
		deviation = deviation*100;
		//System.out.println(deviation*((simirality-1.0)*(simirality-1.0))+average);
		if(target_count > deviation*((simirality-1.0)*(simirality-1.0))+average){
			return true;
		}
		return false;
	}
	public boolean judgmentSecondCsvExtract(int target_count,double simirality,int min,int quarter,int half,int three_quarter,int max,int average,int deviation ){
//		int setup = average-deviation/2;
//		min = min+setup;
//		quarter = quarter + setup;
//		half = half + setup;
//		three_quarter = three_quarter + setup;
//		max = max + setup;
//		System.out.println((min-quarter)/(1.0-0.9)*(simirality-0.9)+quarter);
//		System.out.println((quarter-half)/(1.0-0.8)*(simirality-0.8)+half);
//		System.out.println((half-three_quarter)/(1.0-0.7)*(simirality-0.7)+three_quarter);
//		System.out.println((three_quarter-max)/(1.0-0.6)*(simirality-0.6)+max);

		if(simirality>=0.9 && target_count >= (min-quarter)/(1.0-0.9)*(simirality-0.9)+quarter){
			return true;
		}else if(simirality<0.9 && simirality>=0.8 && target_count >= (quarter-half)/(1.0-0.8)*(simirality-0.8)+half){
			return true;
		}else if(simirality<0.8 && simirality>=0.7 && target_count >= (half-three_quarter)/(1.0-0.7)*(simirality-0.7)+three_quarter){
			return true;
		}else if(simirality<0.7 && simirality>=0.6 && target_count >= (three_quarter-max)/(1.0-0.6)*(simirality-0.6)+max){
			return true;
		}
		return false;
	}
	public boolean judgmentThirdCsvExtract(int target_count,double simirality,int min,int quarter,int half,int three_quarter,int max,int average,int deviation ){
		int setup = average-deviation/2;
		min = min+setup;
		quarter = quarter + setup;
		half = half + setup;
//		three_quarter = three_quarter + setup;
//		max = max + setup;
//		System.out.println((min-quarter)/(1.0-0.9)*(simirality-0.9)+quarter);
//		System.out.println((quarter-half)/(1.0-0.8)*(simirality-0.8)+half);
//		System.out.println((half-three_quarter)/(1.0-0.7)*(simirality-0.7)+three_quarter);
//		System.out.println((three_quarter-max)/(1.0-0.6)*(simirality-0.6)+max);

		if(simirality>=0.9 && target_count >= (min-quarter)/(1.0-0.9)*(simirality-0.9)+quarter){
			return true;
		}else if(simirality<0.9 && simirality>=0.8 && target_count >= (quarter-half)/(1.0-0.8)*(simirality-0.8)+half){
			return true;
		}else if(simirality<0.8 && simirality>=0.7 && target_count >= (half-three_quarter)/(1.0-0.7)*(simirality-0.7)+three_quarter){
			return true;
		}else if(simirality<0.7 && simirality>=0.6 && target_count >= (three_quarter-max)/(1.0-0.6)*(simirality-0.6)+max){
			return true;
		}
		return false;
	}
}
