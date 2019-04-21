package finance.views;

import java.util.*;
import finance.viewwmodels.FinanceViewModel;
import java.lang.StringBuilder;
import inventory.views.View;


import javax.swing.*;
import java.awt.*;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class FinanceMainView extends javax.swing.JFrame implements View 
{
    private Set<FinanceCarModel> financed_cars;
    private FinanceViewModel viewModel;
    
    public FinanceMainView(FinanceViewModel viewModel,Set<FinanceCarModel> financed_cars)
    {
        this.financed_cars = financed_cars;
        this.viewModel = viewModel;
        initcomponents(); 
    }
    
    public String render() {
		
		this.setVisible(true);
		StringBuilder response = new StringBuilder(financed_cars.size() + " CARS IN CURRENT INVENTORY:\nRESULT #\t VIN\n");
		
		int counter = 1;
		for (FinanceCarModel car : financed_cars) {
			response.append(counter++ + "\t\t" + car.toString() + "\n");	
		}
		return response.toString();
	}
    
    @SuppressWarnings("unchecked")                      
	private void initComponents()
    {
        newFinanceButton = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		financeList = new javax.swing.JList<>();
		backButton = new javax.swing.JButton();
		financeLabel = new javax.swing.JLabel();
        
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        
        newFinanceButton.setText("New Financed Car");
        newFinanceButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				newFinanceButtonActionPerformed(evt);
			}
		});
        
        ArrayList<String> strings = new ArrayList<String>();
        for (FinanceCarModel temp : financed_cars) {
			System.out.println(temp.toString());
			strings.add(temp.getVIN());
		}
        financeList.setModel(new javax.swing.AbstractListModel<String>() {
			
			
			public int getSize() { return strings.size(); }
			public String getElementAt(int i) { return strings.get(i); }
		});
        financeList.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) { 
				if (!e.getValueIsAdjusting()) {
					System.out.println(e.getFirstIndex() + " " + e.getLastIndex());
				}
			}
		});
        jScrollPane1.setViewportView(financeList);
        backButton.setText("<< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backButtonActionPerformed(evt);
			}
		});
        
        financeLabel.setText("Finance");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(backButton)
					.addGroup(layout.createSequentialGroup()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(newFinanceButton))
					.addComponent(financeLabel))
				.addContainerGap(30, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(backButton)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
				.addComponent(financeLabel)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(newFinanceButton))
				.addContainerGap())
		);
        pack();
	}// </editor-fold> 

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
		this.setVisible(false);
	}
    private void newFinanceButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
		View view = new AddFinanceView();
        this.viewModel.switchView(view);
		System.out.println("Need to add a new item");
	}
    private javax.swing.JButton backButton;
	private javax.swing.JLabel inventoryLabel;
	private javax.swing.JList<String> inventoryList;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JButton newItemButton;  
    
}