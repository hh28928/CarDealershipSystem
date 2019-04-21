package application;

import inventory.presenters.*;
import mailing.brokers.MessageBroker;

import mailing.messages.Message;
import mailing.subscribers.EmailAccount;
import mailing.publishers.Publisher;

import service.views.ServiceMainView;
import service.viewmodels.ServiceViewModel;

import javax.swing.*;
import java.awt.*;
import java.util.regex.*;


class Application extends javax.swing.JFrame implements Publisher {
	
	private MessageBroker broker;
	private ServiceViewModel svm;
	
	public void run() {
		//init the message broker system
		broker = new MessageBroker();
		//init Service system
		svm = new ServiceViewModel(broker);
		//init the widgets for the application window
		initComponents();
		
		//set the window as visible
		this.setVisible(true);	
		
	}
	
	public static void main(String[] args) {
		
		Application app = new Application();
		app.run();
	}
	
	@Override
	public void publish(MessageBroker broker, Message message) {
		this.broker.sendMessage(message);
	}
	
	//initialize UI components
	@SuppressWarnings("unchecked")                        
	private void initComponents() {

		systemLabel = new javax.swing.JLabel();
		inventoryButton = new javax.swing.JButton();
		financeButton = new javax.swing.JButton();
		serviceButton = new javax.swing.JButton();
		subscriberTopicField = new javax.swing.JTextField();
		subscriberField = new javax.swing.JTextField();
		subscribeButton = new javax.swing.JButton();
		topicLabel = new javax.swing.JLabel();
		emailLabel = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		subscriptionSectionLabel = new javax.swing.JLabel();
		publishSectionLabel = new javax.swing.JLabel();
		publishTopicLabel = new javax.swing.JLabel();
		jSeparator2 = new javax.swing.JSeparator();
		publishTopicField = new javax.swing.JTextField();
		publishMessageField = new javax.swing.JTextField();
		publishMessageLabel = new javax.swing.JLabel();
		sendButton = new javax.swing.JButton();
		unsubscribeButton = new javax.swing.JButton();


		systemLabel.setText("Select a system to enter");

		inventoryButton.setText("Inventory");
		inventoryButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				inventoryButtonActionPerformed(evt);
			}
		});

		financeButton.setText("Finance Center");
		financeButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				financeButtonActionPerformed(evt);
			}
		});

		serviceButton.setText("Service Scheduler");
		serviceButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				serviceButtonActionPerformed(evt);
			}
		});

		subscribeButton.setText("Subscribe");
		subscribeButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				subscribeButtonActionPerformed(evt);
			}
		});
		

		topicLabel.setText("Topic:");

		emailLabel.setText("Email:");

		subscriptionSectionLabel.setText("Subscribe/Unsubscribe");

		publishSectionLabel.setText("Publish Message");

		publishTopicLabel.setText("Topic:");

		publishMessageLabel.setText("Message:");

		sendButton.setText("SEND");
		sendButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sendButtonActionPerformed(evt);
			}
		});

		unsubscribeButton.setText("Unsubscribe");
		unsubscribeButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				unsubscribeButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
			.addGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(subscriptionSectionLabel))
					.addGroup(layout.createSequentialGroup()
						.addGap(17, 17, 17)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
							.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
									.addComponent(topicLabel)
									.addComponent(emailLabel))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
									.addComponent(subscriberField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
									.addComponent(subscriberTopicField))
								.addGap(38, 38, 38)
								.addComponent(subscribeButton)
								.addGap(9, 9, 9))
							.addComponent(unsubscribeButton)
							.addGroup(layout.createSequentialGroup()
								.addComponent(sendButton)
								.addGap(33, 33, 33))))
					.addGroup(layout.createSequentialGroup()
						.addGap(128, 128, 128)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
							.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
									.addGap(24, 24, 24)
									.addComponent(inventoryButton))
								.addGroup(layout.createSequentialGroup()
									.addGap(8, 8, 8)
									.addComponent(financeButton))
								.addComponent(serviceButton))
							.addComponent(systemLabel))))
				.addContainerGap(87, Short.MAX_VALUE))
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
									.addGap(17, 17, 17)
									.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(publishTopicLabel)
										.addComponent(publishMessageLabel))
									.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
									.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(publishMessageField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
										.addComponent(publishTopicField)))
								.addComponent(publishSectionLabel))
							.addContainerGap(214, Short.MAX_VALUE))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
							.addComponent(jSeparator2)
							.addContainerGap()))))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addGap(21, 21, 21)
				.addComponent(systemLabel)
				.addGap(18, 18, 18)
				.addComponent(inventoryButton)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(financeButton)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(serviceButton)
				.addGap(47, 47, 47)
				.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(subscriptionSectionLabel)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(subscriberTopicField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(topicLabel)
					.addComponent(subscribeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(9, 9, 9)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
					.addComponent(subscriberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(emailLabel)
					.addComponent(unsubscribeButton))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
				.addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(63, 63, 63))
			.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
					.addContainerGap(348, Short.MAX_VALUE)
					.addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(publishSectionLabel)
					.addGap(18, 18, 18)
					.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(publishTopicField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(publishTopicLabel))
					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
					.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(publishMessageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(publishMessageLabel))
					.addGap(65, 65, 65)))
		);

		pack();
	}   
	
	private boolean validateSubscriptionFields() {
		//validate topic
		if (this.subscriberTopicField.getText().trim().isEmpty()) {
			System.out.println("No topic provided, cannot subscribe.");
			return false;
		}  
		//validate email address
		if (!Pattern.compile("^(.+)@(.+)$").matcher(this.subscriberField.getText()).matches()) {
			System.out.println("Invalid email address provided, cannot subscribe.");
			return false;
		} 
		
		return true;
	}                  

	private void subscribeButtonActionPerformed(java.awt.event.ActionEvent evt) {    
		//validation
		if (!validateSubscriptionFields()) return;

		//collect the fields
		String emailAccount = this.subscriberField.getText().split("@")[0];
		String emailServer = this.subscriberField.getText().split("@")[1];
		String topic = this.subscriberTopicField.getText();
		
		//subscribe
		EmailAccount email1 = new EmailAccount(emailAccount, emailServer, broker);
		email1.subscribe(topic);
		
		//clear input fields
		this.subscriberField.setText("");
		this.subscriberTopicField.setText("");
	}   
	
	private void unsubscribeButtonActionPerformed(java.awt.event.ActionEvent evt) { 
		//validation
		if (!validateSubscriptionFields()) return;
		
		//collect the fields
		String emailAccount = this.subscriberField.getText().split("@")[0];
		String emailServer = this.subscriberField.getText().split("@")[1];
		String topic = this.subscriberTopicField.getText();
		
		//unsubscribe
		EmailAccount email1 = new EmailAccount(emailAccount, emailServer, broker);
		email1.unsubscribe(topic);
		
		//clear input fields
		this.subscriberField.setText("");
		this.subscriberTopicField.setText("");
	}                                            

	private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {   
		//validate fields
		if (this.publishTopicField.getText().trim().isEmpty()) {
			System.out.println("No topic provided, cannot publish message.");
			return;
		}  
		if (this.publishMessageField.getText().trim().isEmpty()) {
			System.out.println("No message provided, cannot publish message.");
			return;
		}  
		
		
		//broadcast the message
		this.publish(this.broker, new Message(this.publishTopicField.getText(), this.publishMessageField.getText()));
		
		//clear input fields to this section when the message is sent
		this.publishTopicField.setText("");
		this.publishMessageField.setText("");
	
	}     
	
	private void inventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {  
		//open the inventory                                            
		InventoryPresenter inventory = new InventoryPresenter(broker);
	}                                        

	private void financeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
		System.out.println("GOING TO FINANCE SECTION");	
	}     
	
	private void serviceButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
		ServiceMainView service = new ServiceMainView(svm);
		System.out.println("GOING TO SERVICE SECTION");
	}                                           

	
	// UI variables                    
	private javax.swing.JLabel emailLabel;
	private javax.swing.JButton financeButton;
	private javax.swing.JButton inventoryButton;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JTextField publishMessageField;
	private javax.swing.JLabel publishMessageLabel;
	private javax.swing.JLabel publishSectionLabel;
	private javax.swing.JTextField publishTopicField;
	private javax.swing.JLabel publishTopicLabel;
	private javax.swing.JButton sendButton;
	private javax.swing.JButton serviceButton;
	private javax.swing.JButton subscribeButton;
	private javax.swing.JTextField subscriberField;
	private javax.swing.JTextField subscriberTopicField;
	private javax.swing.JLabel subscriptionSectionLabel;
	private javax.swing.JLabel systemLabel;
	private javax.swing.JLabel topicLabel;
	private javax.swing.JButton unsubscribeButton;                
}