/*
 * Created by JFormDesigner on Mon Apr 22 07:53:43 PDT 2019
 */

package inventory.views;

import java.awt.event.ActionEvent;
import java.util.Set;
import java.awt.*;
import javax.swing.*;
import inventory.models.InventoryCarModel;
import inventory.presenters.InventoryPresenter;

/**
 * @author Hammad Hanif
 */
public class AddInventoryView extends JFrame implements View {

    private Set<InventoryCarRenderable> renderItems;
    private InventoryPresenter presenter;
    private String vin;
    private String make;
    private String model;
    private String color;
    private int price;

    public AddInventoryView(InventoryPresenter presenter) {
        this.vin = null;
        this.make = null;
        this.model = null;
        this.color = null;
        this.price = 0;
        this.presenter = presenter;
        initComponents();
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hammad Hanif
        label5 = new JLabel();
        panel1 = new JPanel();
        label6 = new JLabel();
        scrollPane3 = new JScrollPane();
        textArea_VIN = new JTextArea();
        label7 = new JLabel();
        scrollPane4 = new JScrollPane();
        textArea_make = new JTextArea();
        label8 = new JLabel();
        scrollPane5 = new JScrollPane();
        textArea_model = new JTextArea();
        label9 = new JLabel();
        scrollPane6 = new JScrollPane();
        textArea_color = new JTextArea();
        label10 = new JLabel();
        scrollPane7 = new JScrollPane();
        textArea_price = new JTextArea();
        button_addNew = new JButton();
        button_back = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //---- label5 ----
        label5.setText("Add New Car to the Inventory");
        contentPane.add(label5, BorderLayout.NORTH);

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                            "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                            javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                            java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel1.setLayout(new GridBagLayout());
            ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0, 0};
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- label6 ----
            label6.setText("VIN");
            panel1.add(label6, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

            //======== scrollPane3 ========
            {
                scrollPane3.setViewportView(textArea_VIN);
            }
            panel1.add(scrollPane3, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

            //---- label7 ----
            label7.setText("Make");
            panel1.add(label7, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

            //======== scrollPane4 ========
            {
                scrollPane4.setViewportView(textArea_make);
            }
            panel1.add(scrollPane4, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

            //---- label8 ----
            label8.setText("Model");
            panel1.add(label8, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

            //======== scrollPane5 ========
            {
                scrollPane5.setViewportView(textArea_model);
            }
            panel1.add(scrollPane5, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

            //---- label9 ----
            label9.setText("Color");
            panel1.add(label9, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

            //======== scrollPane6 ========
            {
                scrollPane6.setViewportView(textArea_color);
            }
            panel1.add(scrollPane6, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

            //---- label10 ----
            label10.setText("Price");
            panel1.add(label10, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

            //======== scrollPane7 ========
            {
                scrollPane7.setViewportView(textArea_price);
            }
            panel1.add(scrollPane7, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

            //---- button_addNew ----
            button_addNew.setText("Add");
            panel1.add(button_addNew, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

            //---- button_back ----
            button_back.setText("Back");
            panel1.add(button_back, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Hammad Hanif
    private JLabel label5;
    private JPanel panel1;
    private JLabel label6;
    private JScrollPane scrollPane3;
    private JTextArea textArea_VIN;
    private JLabel label7;
    private JScrollPane scrollPane4;
    private JTextArea textArea_make;
    private JLabel label8;
    private JScrollPane scrollPane5;
    private JTextArea textArea_model;
    private JLabel label9;
    private JScrollPane scrollPane6;
    private JTextArea textArea_color;
    private JLabel label10;
    private JScrollPane scrollPane7;
    private JTextArea textArea_price;
    private JButton button_addNew;
    private JButton button_back;
    // JFormDesigner - End of variables declaration  //GEN-END:variables



    private void button_backActionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    private void button_addNewActionPerformed(ActionEvent e) {
        try {
            vin = textArea_VIN.getText();
            make = textArea_make.getText();
            model = textArea_model.getText();
            color = textArea_color.getText();
            price = Integer.parseInt(textArea_price.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "It seems that something went wrong.");
            System.out.println("Error in adding a new vehicle to the inventory");
        }
        this.presenter.addInventoryItem(this.vin, this.make, this.model, this.color, this.price);
        JOptionPane.showMessageDialog(null,"A new car is successfully added in the inventory system");
        render();
    }

    @Override
    public String render() {
        this.setVisible(true);
        StringBuilder response = new StringBuilder("Financed Car\n");
        response.append("Car Vin: " + this.vin +  "\nCar Make " + this.make + "\nCar Model "+ this.model + "\nCar Color " + this.color + "\nCar Price "+this.price + "\n");
        return response.toString();
    }

}
