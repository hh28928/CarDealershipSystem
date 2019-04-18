package mailing.brokers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import mailing.subscribers.Subscriber;
import mailing.subscribers.EmailAccount;
import mailing.messages.Message;

public class MessageBroker {
	
	//the data structure that associates subscribers to topics
	private Map<String, Set<Subscriber>> topics;
	
	
	public MessageBroker() {
		this.topics = new HashMap<String, Set<Subscriber>>();
	} 	
	
	
	//adds the specified subscriber to hte specified topic
	public void addSubscriber(String topic, Subscriber account) {
		
		//if the topic doesn't exist, create it and add the new subscriber
		if (!topics.containsKey(topic)) {
			System.out.println("Topic '" + topic + "' doesn't already exist, creating it.");
			Set<Subscriber> subscribers = new HashSet<Subscriber>();
			subscribers.add(account);
			this.topics.put(topic, subscribers);
		}
		//the topic already exists, add the new subscriber
		else {
			this.topics.get(topic).add(account);
		}

	}
	
	
	//removes the specified subscriber from the specified topic
	public void removeSubscriber(String topic, Subscriber account) {
		if (topics.containsKey(topic)) {
			
			if (topics.get(topic).contains(account)) {
				topics.get(topic).remove(account);
				System.out.println("Removed subscriber '" + account + "' from topic '" + topic + "'");
			}
			
		}
	}
	
	
	//broadcasts a message to every subscriber who is subscribed to that message's topic
	public void sendMessage(Message message) {
		if (topics.containsKey(message.getTopic())) {
			for (Subscriber e : topics.get(message.getTopic())) {
				e.receive(message);
			}
		}
	}
	
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (String topic : topics.keySet()) {
			result.append(topic + ": [");
			
			for (Subscriber s : topics.get(topic)) {
				result.append(s.toString() + ", ");
			}
			result.append("]\n");
		}
		return result.toString();
	}
	
}