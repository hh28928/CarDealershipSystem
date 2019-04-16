package mailing.subscribers;

import mailing.messages.Message;

public abstract class Subscriber {

	public abstract void subscribe(String topic);
	public abstract void unsubscribe(String topic);
	public abstract void receive(Message message);
}