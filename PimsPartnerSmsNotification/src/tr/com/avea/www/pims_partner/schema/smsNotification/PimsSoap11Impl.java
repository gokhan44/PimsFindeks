/**
 * PimsSoap11Impl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package tr.com.avea.www.pims_partner.schema.smsNotification;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tr.com.avea.www.vasup.DbAdapter;
import tr.com.avea.www.vasup.MessageQueue;
import tr.com.avea.www.vasup.SmsMessage;


public class PimsSoap11Impl implements
		tr.com.avea.www.pims_partner.schema.smsNotification.Pims {

	private static final Logger logger = Logger.getLogger(PimsSoap11Impl.class);

	static ApplicationContext context;
	public tr.com.avea.www.pims_partner.schema.smsNotification.NotifySmsDeliveryReportResponse notifySmsDeliveryReport(
			tr.com.avea.www.pims_partner.schema.smsNotification.NotifySmsDeliveryReportRequest notifySmsDeliveryReportRequest)
			throws java.rmi.RemoteException {

		NotifySmsDeliveryReportRequest request = notifySmsDeliveryReportRequest;
		if (request != null) {
			
			logger.info("SmsDeliveryReport|Msisdn="+ request.getDeliveryInformation().getAddress().getMsisdn()+
					    "|MessageKey="+ request.getMessageKey()+
					    "|SmsDeliveryStatus="+ request.getDeliveryInformation().getSmsDeliveryStatus());
		}	else {
			logger.info("request is null");
		}
		NotifySmsDeliveryReportResponse response = new NotifySmsDeliveryReportResponse();
		response.setResultCode(SmsNotificationServiceResultCode.OK);

		logger.debug("NotifySmsDeliveryReportResponse :"+ response.getResultCode());
		return response;
	}

	public tr.com.avea.www.pims_partner.schema.smsNotification.NotifySmsReceptionResponse notifySmsReception(
			tr.com.avea.www.pims_partner.schema.smsNotification.NotifySmsReceptionRequest notifySmsReceptionRequest)
			throws java.rmi.RemoteException {
		ApplicationContext context =getContext();
	    DbAdapter dbAdapter = context.getBean(DbAdapter.class);
		NotifySmsReceptionRequest request = notifySmsReceptionRequest;
		if (request != null) {

			logger.info("SmsReception|SesionId="+request.getSessionId().replaceAll(",", "")+
					   "|SmsServiceActiveNumber="+ request.getSmsServiceActivationNumber()+
					   "|Msisdn=" + request.getSenderAddress().getMsisdn()+
					   "|Message="+ request.getMessage());

		} else {
			logger.info("SmsReception request is null");
		}
		NotifySmsReceptionResponse response = new NotifySmsReceptionResponse();
		SmsMessage sms =new SmsMessage();
		sms.setSource(request.getSenderAddress().getMsisdn().replaceFirst("90", ""));
		sms.setMessage(request.getMessage());
		sms.setMessageKey(request.getMessageKey());
		sms.setDestination(request.getSmsServiceActivationNumber());
		sms.setMessageId(request.getSessionId().replaceAll(",", ""));
		
		try {
			
			MessageQueue.putMessageQueue(sms);
			response.setResultCode(SmsNotificationServiceResultCode.OK);
	
		} catch (Exception e) {
			e.printStackTrace();
		}

		logger.debug("NotifySmsReceptionResponse :" + response.getResultCode());
		return response;
	
	}
	public static ApplicationContext getContext() {

		if (context == null) {
			context = new ClassPathXmlApplicationContext("application_context.xml");
		}

		return context;
	}

}
