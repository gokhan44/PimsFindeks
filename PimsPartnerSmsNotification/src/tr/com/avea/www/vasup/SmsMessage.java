package tr.com.avea.www.vasup;

import java.io.Serializable;
import java.util.Date;


public class SmsMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	private String message;
	private String destination;
	private String source;
	private Date messageDate;
	private String messageId;
	public String messageKey;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Date getMessageDate() {
		return messageDate;
	}

	public void setMessageDate(Date messageDate) {
		this.messageDate = messageDate;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getMessageKey() {
		return messageKey;
	}

	public void setMessageKey(String messageKey) {
		this.messageKey = messageKey;
	}

	@Override
	public String toString() {
		return "SmsMessage [message=" + message + ", destination="
				+ destination + ", source=" + source + ", messageDate="
				+ messageDate + ", messageId=" + messageId + ", messageKey="
				+ messageKey + "]";
	}



}
