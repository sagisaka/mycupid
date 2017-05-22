
extractor = bmsys.extractor("uc");
//sample = fs.open("postgresql-42.0.0.jre6.jar");
//sample = fs.open("src/main/resources/abbot-0.13.0.jar");
//testcase = fs.open("src/main/resources/abbot-1.4.0.jar");
sample = fs.open(argv[1]);
testcase = fs.open(argv[2]);
csv = argv[3];
p=extractor.extract(sample);
q=extractor.extract(testcase);
//source = fs.open("target/test-classes/resources/postgresql-42.0.0.jre6.jar");
//birthmarks = p.merge(q);
//birthmarks = extractor.extract(source);

pair2 = bmsys.pairMaker("RoundRobin")
comparator = bmsys.comparator("JaccardIndex")
comparisons = comparator.compare(p, q, pair2);


//0.7以上の値を示す
//comparisons.forEach(function(i){
//if(i.similarity()>0.7){
//fs.print("" + i.similarity())
//}
//});
//var one=0;
//var two=0;
//var three=0;
//var four = 0;
//var total=0;
//p.forEach(function(i){
//i.forEach(function(s){
//fs.print("" + s);
//});
////fs.print("" + i);
//});
comparisons.forEach(function(i){
	// if(i.similarity()==1.0) one++;
	// else if(i.similarity()<1.0 && i.similarity()>=0.75)  two++;
	// else if(i.similarity()<0.75 && i.similarity()>=0.5)  three++;
	// else if(i.similarity()<0.5)  four++;
	// total++;
	//比較しているクラスのバースマークを出力したい。
//	fs.writer(csv, "aa");
	fs.writer(csv, "" + i.left().className() + ",");
	fs.writer(csv, "" + i.left().elementCount() + ",");
	i.left().forEach(function(element){
		fs.writer(csv, "" + element + " ");
	});
	//fs.print("" + "\n");

	fs.writer(csv, "" + ",");
	fs.writer(csv, "" + i.right().className() + ",");
	fs.writer(csv, "" + i.right().elementCount() + ",");
	i.right().forEach(function(element){
		fs.writer(csv, "" + element);
	});
	//fs.print("" + "\n");

	fs.writer(csv, "" + ",");
	fs.writer(csv, "" +  i.similarity() + "\n");
	//}
});
//fs.print("" + argv[2]);
//fs.print("" + p + ",1.0," + one + "," + total + "," + one/total);
//fs.print("" + argv[1] + ",0.75," + two + "," + total + "," + two/total);
//fs.print("" + argv[1] + ",0.5," + three + "," + total + "," + three/total);
//fs.print("" + argv[1] + ",0," + four + "," + total + "," + four/total);

//fs.print(p);

//fs.print("extraction: " + birthmarks.time() + " ns")
//fs.print("comparison: " + comparisons.time() + " ns")
