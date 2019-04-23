package finance.views;

import finance.viewmodels.FinanceViewModel;
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
public class AddFinanceView extends javax.swing.JFrame implements View {
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
    }
    public String render() {
      
        StringBuilder response = new StringBuilder("Financed Car\n");
        response.append("Car Vin: " + this.vin +  "\nCar Make " +this.make+"\nCar Model "+this.model+"\nCar Color "+this.color+"\nCar Price "+this.price+"\nDown Payment "+this.amountPaid+ "\n");
        initComponents();
        this.setVisible(true);
        return response.toString();
    }

    private void button1ActionPerformed(ActionEvent e) {

        try{
            this.vin = CarVin.getText();
            this.make = CarMake.getText();
            this.model = Car_Model.getText();
            this.color = CarColor.getText();
            this.price = Integer.parseInt(CarPrice.getText());
            this.amountPaid = Integer.parseInt(DownPayment.getText());
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "It seems that something went wrong.\nMake sure that All fields have values.\nAlso make sure that -Price- and -Down Payment- are number values.");
            System.out.println("Error in adding financed vehical.");
        }
        CarModel car = new CarModel(this.vin,this.make,this.model,this.color);
        this.financedViewModel.addFinancedCar(car,this.price,this.amountPaid);
        JOptionPane.showMessageDialog(null,"Car was successfully added to the system");



    }

    private void backButtonActionPerformed(ActionEvent e) {
        View new_view = new FinanceMainView(this.financedViewModel, this.financedViewModel.getFinanced_cars());
        this.financedViewModel.switchView(new_view);
        this.dispose();
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
                panel3.setLayout(new GridBagLayout());
                ((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0};
                ((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
                ((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {0.01, 0.01, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {0.01, 0.01, 0.01, 0.01, 0.01, 0.01, 0.0, 0.0, 1.0E-4};

                //---- label1 ----
                label1.setText("Car Vin Number:");
                label1.setFont(new Font("Segoe UI", Font.PLAIN, 40));
                panel3.add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));

                //---- CarVin ----
                CarVin.setBackground(new Color(244, 244, 244));
                CarVin.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
                CarVin.setMinimumSize(new Dimension(300, 47));
                CarVin.setPreferredSize(new Dimension(300, 47));
                panel3.add(CarVin, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));

                //---- label2 ----
                label2.setText("Car Make:");
                label2.setFont(new Font("Segoe UI", Font.PLAIN, 40));
                panel3.add(label2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));

                //---- CarMake ----
                CarMake.setBackground(new Color(244, 244, 244));
                CarMake.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
                CarMake.setMinimumSize(new Dimension(300, 47));
                CarMake.setPreferredSize(new Dimension(300, 47));
                panel3.add(CarMake, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));

                //---- label3 ----
                label3.setText("Car Model:");
                label3.setFont(new Font("Segoe UI", Font.PLAIN, 40));
                panel3.add(label3, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));

                //---- label4 ----
                label4.setText("Car Color:");
                label4.setFont(new Font("Segoe UI", Font.PLAIN, 40));
                panel3.add(label4, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));

                //---- CarColor ----
                CarColor.setBackground(new Color(244, 244, 244));
                CarColor.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
                CarColor.setMinimumSize(new Dimension(300, 47));
                CarColor.setPreferredSize(new Dimension(300, 47));
                panel3.add(CarColor, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));

                //---- Car_Model ----
                Car_Model.setBackground(new Color(244, 244, 244));
                Car_Model.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
                Car_Model.setMinimumSize(new Dimension(300, 47));
                Car_Model.setPreferredSize(new Dimension(300, 47));
                panel3.add(Car_Model, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));

                //---- label5 ----
                label5.setText("Car Price:");
                label5.setFont(new Font("Segoe UI", Font.PLAIN, 40));
                panel3.add(label5, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));

                //---- CarPrice ----
                CarPrice.setBackground(new Color(244, 244, 244));
                CarPrice.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
                CarPrice.setMinimumSize(new Dimension(300, 47));
                CarPrice.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
                CarPrice.setPreferredSize(new Dimension(300, 47));
                panel3.add(CarPrice, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));

                //---- label6 ----
                label6.setText("Down Payment:");
                label6.setFont(new Font("Segoe UI", Font.PLAIN, 40));
                panel3.add(label6, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));

                //---- DownPayment ----
                DownPayment.setBackground(new Color(244, 244, 244));
                DownPayment.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
                DownPayment.setMinimumSize(new Dimension(300, 47));
                DownPayment.setPreferredSize(new Dimension(300, 47));
                panel3.add(DownPayment, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 0, 0), 0, 0));
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
