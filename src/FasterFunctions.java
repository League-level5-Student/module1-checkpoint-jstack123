
public class FasterFunctions {
	public static void main(String[] args) {
//		float totalTime = 0;
//		long startTime = System.currentTimeMillis();
		//Your Code Here
		
		Thread sort = new Thread(()-> {
			long startTime = System.currentTimeMillis();
			float endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
			System.out.println("Starting slowSortLargeArray()...");
			SlowFunctions.slowSortLargeArray();
			System.out.println("slowSortLargeArray() Complete.");
//			totalTime += endTime;
			endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
			System.out.println("slowSortLargeArray() Time: " + endTime + "\n\n");
		});
		
		Thread ackermann = new Thread(()-> {
			long startTime = System.currentTimeMillis();
			float endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
			System.out.println("Starting ackermann(3, 14)...");
			System.out.println("ackermann(3, 14): " + SlowFunctions.ackermann(3, 14));
			System.out.println("ackermann(3, 14) Complete.");
			endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
//			totalTime += endTime;
			System.out.println("ackerman(3, 14) Time: " + endTime + "\n\n");
			float totalTime = endTime;
			System.out.println("Total Time: " + totalTime + "\n\n");
		});
		
		Thread sqrt = new Thread(() -> {
			long startTime = System.currentTimeMillis();
			float endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
			System.out.println("Starting millionsOfSqrts()...");
			SlowFunctions.millionsOfSqrts();
			System.out.println("millionsOfSqrts() Complete.");
			endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
//			totalTime += endTime;
			System.out.println("millionsOfSqrts()) Time: " + endTime + "\n\n");
			
		});
		
		sort.start();
		ackermann.start();
		sqrt.start();
		
//		
//		float endTime = (float)((double)System.currentTimeMillis() - (double)startTime) / 1000.0f;
//		totalTime += endTime;
//		System.out.println("Total Time: " + totalTime);
	}
}
