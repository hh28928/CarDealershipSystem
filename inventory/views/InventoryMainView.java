package inventory.views;

import java.awt.event.ActionEvent;
import java.util.Set;
import java.lang.StringBuilder;
import com.intellij.uiDesigner.core.*;
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

public class InventoryMainView extends javax.swing.JFrame implements View {
	
	private Set<InventoryCarRenderable> renderItems;
	private InventoryPresenter presenter;
	private MainView mainView;
	private Set<InventoryCarModel> inventoryItems;
	public InventoryMainView(Set<InventoryCarRenderable> items, InventoryPresenter presenter, MainView mainView) {
		this.renderItems = items;
		this.presenter = presenter;
		this.mainView = mainView;
		initComponents();
	}

    public InventoryMainView(InventoryPresenter mainview, Set<InventoryCarModel> inventoryItems) {
	    presenter = mainview;
	    this.inventoryItems = inventoryItems;
	    initComponents();
    }


    public String render() {
		
		this.setVisible(true);
		StringBuilder response = new StringBuilder(renderItems.size() + " CARS IN CURRENT INVENTORY:\nRESULT #\t VIN\n");
		
		int counter = 1;
		for (InventoryCarRenderable car : renderItems) {
			response.append(counter++ + "\t\t" + car.toString() + "\n");	
		}
		return response.toString();
	}

	private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
		this.setVisible(false);
	}                                          

	private void newItemButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
		// TODO open the new item window here
		View new_view = new AddInventoryView(presenter);
		this.presenter.switchView(new_view);
	}

	private void detailedViewButtonActionPerformed(ActionEvent e) {
		String enterd_vin = vin.getText();
		for (InventoryCarRenderable current : this.renderItems) {
			if (enterd_vin.equals(current.getVIN())) {
				View view = new DetailView(presenter, current);
			}
		}
		JOptionPane.showMessageDialog(null, "This VIN number is not in inventory");
	}

	private javax.swing.JButton backButton;
	private javax.swing.JLabel inventoryLabel;
	private javax.swing.JList<String> inventoryList;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JButton newItemButton;


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hammad Hanif
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        scrollPane1 = new JScrollPane();
        vin = new JTextArea();
        addNewButton = new JButton();
        detailedViewButton = new JButton();
        backButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(7, 1, new Insets(0, 0, 0, 0), -1, -1));

        //---- label1 ----
        label1.setText("Inventory");
        label1.setPreferredSize(new Dimension(100, 45));
        label1.setHorizontalTextPosition(SwingConstants.CENTER);
        label1.setFont(new Font("Segoe UI", Font.PLAIN, 40));
        contentPane.add(label1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label2 ----
        label2.setText("Check Out Latest Inventory");
        label2.setFont(new Font("Segoe UI", Font.PLAIN, 40));
        contentPane.add(label2, new GridConstraints(1, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label3 ----
        label3.setText("Enter VIN number to checkout Details:");
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 40));
        contentPane.add(label3, new GridConstraints(2, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(vin);
        }
        contentPane.add(scrollPane1, new GridConstraints(3, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- addNewButton ----
        addNewButton.setText("Add a New car");
        contentPane.add(addNewButton, new GridConstraints(4, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- detailedViewButton ----
        detailedViewButton.setText("Detailed View");
        contentPane.add(detailedViewButton, new GridConstraints(5, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- backButton ----
        backButton.setText("Back");
        contentPane.add(backButton, new GridConstraints(6, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Hammad Hanif
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JScrollPane scrollPane1;
    private JTextArea vin;
    private JButton addNewButton;
    private JButton detailedViewButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
