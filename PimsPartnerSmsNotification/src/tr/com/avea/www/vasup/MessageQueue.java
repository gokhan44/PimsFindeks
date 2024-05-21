package tr.com.avea.www.vasup;


import java.util.concurrent.LinkedBlockingQueue;



public class MessageQueue {

	private static LinkedBlockingQueue<SmsMessage> q = new LinkedBlockingQueue<SmsMessage>();

	public static void putMessageQueue(SmsMessage message) throws Exception {

		q.put(message);

	}

	public static SmsMessage getMessage() {
		return q.poll();
	}
	
	public static Integer getSize() {
		return q.size();
	}

}

