package startingThreads;

class Runner extends Thread {

	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class App {
	public static void main(String[] args) {
		Runner runner1 = new Runner();
		// Calling .run() will call it in the main thread
		// Calling .start() will call .run() in its own special thread
		runner1.start();
		
		Runner runner2 = new Runner();
		runner2.start();
	}
}
