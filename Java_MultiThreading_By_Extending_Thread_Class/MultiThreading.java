package Java_MultiThreading_By_Extending_Thread_Class;
class Threading extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) { //It will execute a newly created thread
			System.out.println("Thread Class Number: Line: " + i);
			try {
				Thread.sleep(1000); //Halt Executing Thread For 100 milliseconds
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Threading tc1 = new Threading();
    tc1.start(); //The new Thread Will Be Started
    
    for(int i=0;i<10;i++) { //It Will Execute As Main Thread
    	System.out.println("Main Thread: Line: " + i);
    }
	}

}
