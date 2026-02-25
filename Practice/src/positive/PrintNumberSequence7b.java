package positive;
import java.util.Scanner;

public class PrintNumberSequence7b {
	private int n;
	private int current=1;
	private final Object lock = new Object();
	
	public PrintNumberSequence7b(int n) {
		this.n=n;
		Runnable task = ()->{
			while(true) {
				synchronized(lock) {
					if(current>n) {
						lock.notifyAll();
						break;
					}
					System.out.print(current+" ");
					current++;
					lock.notifyAll();
					try {
						lock.wait();
					}
					catch(InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}
			}	
		};
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		Thread t3 = new Thread(task);
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		new PrintNumberSequence7b(n);
		sc.close();
	}
}
