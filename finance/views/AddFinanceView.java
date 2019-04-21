package finance.views;

import finance.viewwmodels.FinanceViewModel;
import java.lang.StringBuilder;
import inventory.views.View;
import java.util.*;
import inventory.models.CarModel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
import org.jdesktop.swingx.*;
/*
 * Created by JFormDesigner on Sun Apr 21 12:35:19 EDT 2019
 */



/**
 * @author Justin Lee Plassmeyer
 */
public class AddFinanceView extends JFrame {
    private String vin;
    private String make;
    private String model;
    private String color;
    private int price;
    private int amountPaid;
    private FinanceViewModel financedViewModel;
    public AddFinanceView(FinanceViewModel view) {
        this.vin = null;
        this.make = null;
        this.model = null;
        this.color = null;
        this.price = 0;
        this.amountPaid = 0;
        this.financedViewModel = view;
        initComponents();
    }
    public String render() {

        this.setVisible(true);
        StringBuilder response = new StringBuilder(financed_cars.size() + "Financed Car\n");
        response.append("Car Vin: " + this.vin +  "\nCar Make " +this.make+"\nCar Model "+this.model+"\nCar Color "+this.color+"\nCar Price "+this.price+"\nDown Payment "+this.amountPaid+ "\n");
        return response.toString();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        try{
            this.vin = CarVin.getText();
            this.make = CarMake.getText();
            this.model = Car_Model.getText();
            this.color = CarColor.getText();
            this.price = Integer.parseInt(CarPrice.getText());
            this.amountPaid = Integer.parseInt(DownPayment.getText());
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "It seems that something went wrong.\nMake sure that All fields have values.\nAlso make sure that -Price- and -Down Payment- are number values.");
            System.out.println("Error in adding financed vehical.");
        }
        CarModel car = new CarModel(this.vin,this.make,this.model,this.color);
        this.financedViewModel.addFinancedCar(car,this.price,this.amountPaid);
        JOptionPane.showMessageDialog(null,"Car was successfully added to the system");



    }

    private void backButtonActionPerformed(ActionEvent e) {
        View new_view = new FinancedMainView(this.view, this.view.getFinanced_cars());
        this.financedViewModel.switchView(new_view);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Justin Lee Plassmeyer
        panel1 = new JPanel();
        textArea1 = new JTextArea();
        button1 = new JButton();
        backButton = new JButton();
        panel3 = new JPanel();
        label1 = new JLabel();
        CarVin = new JTextField();
        label2 = new JLabel();
        CarMake = new JTextField();
        label3 = new JLabel();
        label4 = new JLabel();
        CarColor = new JTextField();
        Car_Model = new JTextField();
        label5 = new JLabel();
        CarPrice = new JTextField();
        label6 = new JLabel();
        DownPayment = new JTextField();

        //======== panel1 ========
        {

            // JFormDesigner evaluation mark
            panel1.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            panel1.setLayout(new BorderLayout());

            //---- textArea1 ----
            textArea1.setText("             Add A Car to Be Financed");
            textArea1.setFont(new Font("Monospaced", Font.PLAIN, 48));
            textArea1.setBackground(UIManager.getColor("Menu.selectionBackground"));
            textArea1.setCaretColor(new Color(187, 23, 58));
            textArea1.setForeground(SystemColor.desktop);
            panel1.add(textArea1, BorderLayout.NORTH);

            //---- button1 ----
            button1.setText("Add Car");
            button1.setMinimumSize(new Dimension(121, 100));
            button1.addActionListener(e -> button1ActionPerformed(e));
            panel1.add(button1, BorderLayout.SOUTH);

            //---- backButton ----
            backButton.setText("Back");
            backButton.addActionListener(e -> backButtonActionPerformed(e));
            panel1.add(backButton, BorderLayout.WEST);

            //======== panel3 ========
            {
                panel3.setBorder(null);
                panel3.setLayout(new GridLayoutManager(8, 6, new Insets(0, 0, 0, 0), 0, 0));

                //---- label1 ----
                label1.setText("Car Vin Number:");
                label1.setFont(new Font("Segoe UI", Font.PLAIN, 40));
                panel3.add(label1, new GridConstraints(0, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- CarVin ----
                CarVin.setBackground(new Color(244, 244, 244));
                CarVin.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
                CarVin.setMinimumSize(new Dimension(300, 47));
                panel3.add(CarVin, new GridConstraints(0, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- label2 ----
                label2.setText("Car Make:");
                label2.setFont(new Font("Segoe UI", Font.PLAIN, 40));
                panel3.add(label2, new GridConstraints(1, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- CarMake ----
                CarMake.setBackground(new Color(244, 244, 244));
                CarMake.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
                CarMake.setMinimumSize(new Dimension(300, 47));
                panel3.add(CarMake, new GridConstraints(1, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- label3 ----
                label3.setText("Car Model:");
                label3.setFont(new Font("Segoe UI", Font.PLAIN, 40));
                panel3.add(label3, new GridConstraints(3, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- label4 ----
                label4.setText("Car Color:");
                label4.setFont(new Font("Segoe UI", Font.PLAIN, 40));
                panel3.add(label4, new GridConstraints(2, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- CarColor ----
                CarColor.setBackground(new Color(244, 244, 244));
                CarColor.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
                CarColor.setMinimumSize(new Dimension(300, 47));
                panel3.add(CarColor, new GridConstraints(2, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- Car_Model ----
                Car_Model.setBackground(new Color(244, 244, 244));
                Car_Model.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
                Car_Model.setMinimumSize(new Dimension(300, 47));
                panel3.add(Car_Model, new GridConstraints(3, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- label5 ----
                label5.setText("Car Price:");
                label5.setFont(new Font("Segoe UI", Font.PLAIN, 40));
                panel3.add(label5, new GridConstraints(4, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- CarPrice ----
                CarPrice.setBackground(new Color(244, 244, 244));
                CarPrice.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
                CarPrice.setMinimumSize(new Dimension(300, 47));
                CarPrice.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                panel3.add(CarPrice, new GridConstraints(4, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- label6 ----
                label6.setText("Down Payment:");
                label6.setFont(new Font("Segoe UI", Font.PLAIN, 40));
                panel3.add(label6, new GridConstraints(5, 0, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));

                //---- DownPayment ----
                DownPayment.setBackground(new Color(244, 244, 244));
                DownPayment.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
                DownPayment.setMinimumSize(new Dimension(300, 47));
                panel3.add(DownPayment, new GridConstraints(5, 1, 1, 1,
                    GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
                    null, null, null));
            }
            panel1.add(panel3, BorderLayout.CENTER);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Justin Lee Plassmeyer
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton button1;
    private JButton backButton;
    private JPanel panel3;
    private JLabel label1;
    private JTextField CarVin;
    private JLabel label2;
    private JTextField CarMake;
    private JLabel label3;
    private JLabel label4;
    private JTextField CarColor;
    private JTextField Car_Model;
    private JLabel label5;
    private JTextField CarPrice;
    private JLabel label6;
    private JTextField DownPayment;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
