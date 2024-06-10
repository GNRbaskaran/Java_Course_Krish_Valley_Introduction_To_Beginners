package Java_Thread_Synchronization;
class Transfer{ //class for transferring messages
	public void sendMessage(String message) {
		System.out.println(message + " is Sending...");
	try {
		Thread.sleep(1000); //delay for one second
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(message + " is sent. ");
}
}
class MessageTransfer extends Thread{ //class to send messages using thread
	private String message;
	Transfer msgTransfer;
	public MessageTransfer(String msg,Transfer trans) {
		message = msg;
		msgTransfer = trans;
	}
	//@override
	public void run() {
		synchronized (msgTransfer) { 
			msgTransfer.sendMessage(message); //Send message using the thread
		}
	}
	
}
public class SyncThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Transfer trans = new Transfer(); //new object for message transferring task
    MessageTransfer msg1 = new MessageTransfer("Hello", trans);
    MessageTransfer msg2 = new MessageTransfer("World", trans);
    MessageTransfer msg3 = new MessageTransfer("Java", trans);
    
    //start threads for message transferring
    msg1.start();
    msg2.start();
    msg3.start();
	}

}
