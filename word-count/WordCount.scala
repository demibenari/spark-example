// Input file
val inputFile = sc.textFile("/tmp/show-spark/input.txt")


// Word count example
val counts = inputFile.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey(_ + _)


counts.toDebugString


counts.cache()


counts.count()


counts.saveAsTextFile("/tmp/show-spark/output");


counts.repartition(5)


counts.saveAsTextFile("/tmp/show-spark/output-2")


var repartitioned = counts.repartition(5)


repartitioned.saveAsTextFile("/tmp/show-spark/output-3")


counts.unpersist()
