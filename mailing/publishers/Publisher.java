package mailing.publishers;

import mailing.brokers.MessageBroker;
import mailing.messages.Message;

public interface Publisher {
	void publish(MessageBroker broker, Message message);
}