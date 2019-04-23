package inventory.views;

import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

public class InventoryMainView extends javax.swing.JFrame implements View {
	
	private Set<InventoryCarRenderable> renderItems;
	private InventoryPresenter presenter;
	private MainView mainView;
	private Set<InventoryCarModel> inventoryItems;
	String findVin;
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
		View new_view = new MainView(inventoryItems, presenter);
		this.presenter.switchView(new_view);
	}

	private void detailedViewButtonActionPerformed(ActionEvent e) {
        for (InventoryCarRenderable s: renderItems) {
            if(s.getVIN().equals(findVin)) {
                View new_view = new DetailView(presenter, s);
                this.presenter.switchView(new_view);
            }

        }
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
        scrollPane1 = new JScrollPane();
        list1 = new JList();
        button1 = new JButton();
        button2 = new JButton();

        list1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JList list = (JList) e.getSource();
                if (e.getClickCount() == 1) {
                    int index = list.locationToIndex(e.getPoint());
                    if (index >= 0) {
                        findVin = list.getModel().getElementAt(index).toString();
                    }
                }
            }
        });
        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //---- label1 ----
        label1.setText("Inventory Main View");
        contentPane.add(label1, BorderLayout.NORTH);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(list1);
        }
        contentPane.add(scrollPane1, BorderLayout.WEST);

        //---- button1 ----
        button1.setText("Detailed View");
        contentPane.add(button1, BorderLayout.CENTER);

        //---- button2 ----
        button2.setText("Back");
        contentPane.add(button2, BorderLayout.EAST);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Hammad Hanif
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JList list1;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
