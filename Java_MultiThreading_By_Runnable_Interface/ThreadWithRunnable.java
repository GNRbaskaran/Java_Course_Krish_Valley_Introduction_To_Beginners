package Java_MultiThreading_By_Runnable_Interface;
class MyThread implements Runnable{ //this class implements runnable interface

	@SuppressWarnings("deprecation")
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) { //it will execute as newly created thread
			System.out.println("Thread Number: " + Thread.currentThread().getId() + ": Line: " + i);
		}
	}
	
}
public class ThreadWithRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Thread thread1 = new Thread(new MyThread()); //create thread object with MyThreadClass Object
    Thread thread2 = new Thread(new MyThread());
    
    //starting the threads
    thread1.start();
    thread2.start();
    
    for(int i=0;i<10;i++) { //it will execute as main thread
    	System.out.println("Main Thread: Line: " + i);
    }
	}

}
