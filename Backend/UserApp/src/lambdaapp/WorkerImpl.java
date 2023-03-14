package lambdaapp;

public class WorkerImpl {

	public static void executeApp(WorkerInterface worker) {
		
		worker.doSomeWork();
		
	}

	public static void main(String[] args) {
		
		/*
		executeApp(new WorkerInterface() {

			@Override
			public void doSomeWork() {
				
				System.out.println("Doing work with the inner class.");
			}
		});
		*/
		
		executeApp(() -> System.out.println("Doing work with lambda."));
	}

}
