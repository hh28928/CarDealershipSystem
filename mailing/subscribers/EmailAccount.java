package mailing.subscribers;

import mailing.messages.Message;
import mailing.subscribers.Subscriber;
import mailing.brokers.MessageBroker;

public class EmailAccount extends Subscriber {
	
	private String accountName;
	private String providerName;
	private MessageBroker broker;
	
	
	public EmailAccount(String accountName, String providerName, MessageBroker broker) {
		this.accountName = accountName;
		this.providerName = providerName;
		this.broker = broker;
	}
	
	
	//tell the event broker that this account wants to start receiving all messages on this topic
	public void subscribe(String topic) {
		this.broker.addSubscriber(topic, this);
	}
	
	
	//tell the event broker that this account no longer wants to stop receiving any messages on this topic
	public void unsubscribe(String topic) {
		System.out.println("I want to be removed...");
		this.broker.removeSubscriber(topic, this);
	}
	
	
	//called when this email account receives a message
	public void receive(Message message) {
		System.out.println("\t> " + this.toString() + " received message from topic [" + message.getTopic() + "] that says: \"" + message.getContent() +"\"");
	}
	
	
	@Override
	public int hashCode() {
		int prime = 31;
		return prime + accountName.hashCode() + providerName.hashCode();   
	}
	
	
	//value equality based on the full email address for this account
	@Override
	public boolean equals(Object o) { 

		if (o == this) { 
			return true; 
		} 

		if (!(o instanceof EmailAccount)) { 
			return false; 
		} 

		EmailAccount e = (EmailAccount) o;

		return this.toString().equals(e.toString());
	}
	
	
	public String toString() {
		return this.accountName + "@" + this.providerName;
	}
	
}