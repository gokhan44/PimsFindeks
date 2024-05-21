package tr.com.avea.www.vasup;


import org.apache.log4j.Logger;



public class DbInsertTask extends Thread {
	private static final Logger logger = Logger.getLogger("rootLogger");
    
    DbAdapter db;
     
      
	public DbAdapter getDb() {
		return db;
	}

	public void setDb(DbAdapter db) {
		this.db = db;
	}

	public void init() {
		start();
	}

	public void run() {
		while (true) {
			try {
				
				SmsMessage messages = MessageQueue.getMessage();

				if(messages!=null && messages.getMessage()!=null){
				logger.info("MessageQueu||Msisdn="+messages.getSource()+"|Message="+messages.getMessage());
				db.insertReceiver(messages.getDestination(), messages.getMessage(),
						messages.getSource(), messages.getMessageKey());
				}else{
				logger.debug("MessageQueu is null");
				sleep(300);
				}

			}catch (Exception e) {
             logger.info(e);
			}
		}
	}
}
