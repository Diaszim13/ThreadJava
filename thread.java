package.dias.matheus.Threads;


class MyRunnable implements Runable {
	public void run()
	{
		System.out.println("Thread em exec: " + Thread.currentThread();getName());
	}

}

public class main() {
	public static void main(String[] args)
	{
		Thread thread1 = new Thread(new MyRunnable(), "Thread-1");
		Thread thread2 = new Thread(new MyRunnable(), "Thread-2");
		
		thread1.start();
		thread2.start();
	}

}
