package inventory.views;

import java.awt.event.ActionEvent;
import java.util.Set;
import java.lang.StringBuilder;
import inventory.models.InventoryCarModel;
import inventory.views.InventoryCarRenderable;
import inventory.views.View;
import inventory.presenters.InventoryPresenter;

import javax.swing.*;
import java.awt.*;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.util.ArrayList;

public class MainView extends javax.swing.JFrame implements View {

	private Set<InventoryCarModel> renderItems;
	private InventoryPresenter presenter;

	public MainView(Set<InventoryCarModel> items, InventoryPresenter presenter) {
		this.renderItems = items;
		this.presenter = presenter;
		initComponents();
	}


	public String render() {

		this.setVisible(true);
		StringBuilder response = new StringBuilder(renderItems.size() + " CARS IN CURRENT INVENTORY:\nRESULT #\t VIN\n");

		int counter = 1;
		for (InventoryCarModel car : renderItems) {
			response.append(counter++ + "\t\t" + car.toString() + "\n");
		}
		return response.toString();
	}


	@SuppressWarnings("unchecked")
	private void initComponents() {

		newItemButton = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		inventoryList = new javax.swing.JList<>();
		backButton = new javax.swing.JButton();
		inventoryLabel = new javax.swing.JLabel();

		this.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

		newItemButton.setText("New Item");
		newItemButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				newItemButtonActionPerformed(evt);
			}
		});

		ArrayList<String> strings = new ArrayList<String>();
		for (InventoryCarModel temp : renderItems) {
			System.out.println(temp.toString());
			strings.add(temp.getVIN());
		}
		inventoryList.setModel(new javax.swing.AbstractListModel<String>() {


			public int getSize() { return strings.size(); }
			public String getElementAt(int i) { return strings.get(i); }
		});
		inventoryList.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					System.out.println(e.getFirstIndex() + " " + e.getLastIndex());
				}
			}
		});
		jScrollPane1.setViewportView(inventoryList);

		backButton.setText("<< Back");
		backButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				backButtonActionPerformed(evt);
			}
		});



		inventoryLabel.setText("Inventory");

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
												.addComponent(newItemButton))
										.addComponent(inventoryLabel))
								.addContainerGap(30, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(backButton)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
								.addComponent(inventoryLabel)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(newItemButton))
								.addContainerGap())
		);

		pack();
	}// </editor-fold>                        

	private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
	}

	private void newItemButtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO open the new item window here
		View new_view = new AddInventoryView(presenter);
		this.presenter.switchView(new_view);
	}

	private javax.swing.JButton backButton;
	private javax.swing.JLabel inventoryLabel;
	private javax.swing.JList<String> inventoryList;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JButton newItemButton;



	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Hammad Hanif
	private JLabel label1;
	private JButton addNew;
	private JButton button_back;
	private JButton detailedView;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
