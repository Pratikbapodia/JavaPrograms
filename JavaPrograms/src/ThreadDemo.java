//This program uses Thread.join() method to wait for the execution of other thread.
//Here we are creating a child thread and invoking join method by creating a variable of main thread which is of static
//and Thread type and using it in child thread.
//Both join() and sleep() method can throw an InterruptedException which is a checked exception. 
//Therefore we need to handle that exception either by try catch or throws keyword.
//As a good practice every risky code should have seperate try catch block.


class MyThread extends Thread
{
	static Thread mt;
	public void run(){
		for(int i =0;i<10;i++){
			try {
			mt.join();
			}catch (InterruptedException e) {}
			System.out.println("Child Thread");
			try {
//				Thread.currentThread();
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
	}
}
}
public class ThreadDemo  {

	public static void main(String[] args) {
		MyThread.mt = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();
		for(int i =0;i<10;i++) {
			System.out.println("Main Thread");
			try {
//				Thread.currentThread();
				Thread.sleep(1000);
			}catch(InterruptedException e) {}

	}

}
}

