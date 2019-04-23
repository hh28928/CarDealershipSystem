package inventory.views;

import java.awt.*;
import javax.swing.*;

public class InventoryDetailView implements View {

	InventoryPresenter presenter;
	String passedVIN;
	Set<InventoryCarModel> inventoryCarModelSet;
	public InventoryDetailView(InventoryPresenter presenter, String passedVIN, Set<InventoryCarModel> inventoryCarModelSet) {
		this.inventoryCarModelSet = inventoryCarModelSet;
		this.presenter = presenter;
		this.passedVIN = passedVIN;
		initComponents();
	}
	public String render() {
		return "DETAIL VIEW";
	}

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hammad Hanif
        panel1 = new JPanel();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        panel2 = new JPanel();
        label2 = new JLabel();
        vint = new JLabel();
        label4 = new JLabel();
        maket = new JLabel();
        label6 = new JLabel();
        modelt = new JLabel();
        label8 = new JLabel();
        colort = new JLabel();
        label10 = new JLabel();
        pricet = new JLabel();
        button_back = new JButton();

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel1.setLayout(new BorderLayout());

            //---- label1 ----
            label1.setText("Inventory Detailed View");
            panel1.add(label1, BorderLayout.NORTH);

            //======== scrollPane1 ========
            {

                //======== panel2 ========
                {
                    panel2.setLayout(new GridBagLayout());
                    ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0, 0};
                    ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
                    ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                    ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

                    //---- label2 ----
                    label2.setText("VIN");
                    panel2.add(label2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                    //---- vint ----
                    vint.setText("text");
                    panel2.add(vint, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                    //---- label4 ----
                    label4.setText("Make");
                    panel2.add(label4, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                    //---- maket ----
                    maket.setText("text");
                    panel2.add(maket, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                    //---- label6 ----
                    label6.setText("Model");
                    panel2.add(label6, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                    //---- modelt ----
                    modelt.setText("text");
                    panel2.add(modelt, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                    //---- label8 ----
                    label8.setText("Color");
                    panel2.add(label8, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                    //---- colort ----
                    colort.setText("text");
                    panel2.add(colort, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                    //---- label10 ----
                    label10.setText("Price");
                    panel2.add(label10, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                    //---- pricet ----
                    pricet.setText("text");
                    panel2.add(pricet, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                    //---- button_back ----
                    button_back.setText("Back");
                    panel2.add(button_back, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));
                }
                scrollPane1.setViewportView(panel2);
            }
            panel1.add(scrollPane1, BorderLayout.CENTER);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Hammad Hanif
    private JPanel panel1;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JPanel panel2;
    private JLabel label2;
    private JLabel vint;
    private JLabel label4;
    private JLabel maket;
    private JLabel label6;
    private JLabel modelt;
    private JLabel label8;
    private JLabel colort;
    private JLabel label10;
    private JLabel pricet;
    private JButton button_back;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}