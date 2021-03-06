package finance.views;

import finance.viewmodels.FinanceViewModel;
import java.lang.StringBuilder;
import inventory.views.View;
import java.util.*;
import inventory.models.CarModel;
import finance.models.FinanceCarModel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;
import com.jgoodies.forms.factories.*;
import com.jgoodies.forms.layout.*;
import org.jdesktop.swingx.*;
/*
 * Created by JFormDesigner on Sun Apr 21 15:21:54 EDT 2019
 */



/**
 * @author Justin Lee Plassmeyer
 */
public class FinanceDetailView extends javax.swing.JFrame implements View {
    private FinanceViewModel view;
    private FinanceCarModel car;

    public FinanceDetailView(FinanceViewModel view, FinanceCarModel car) {
        this.view = view;
        this.car = car;
        initComponents();
    }
    public String render() {
        this.setVisible(true);
        StringBuilder response = new StringBuilder("Financed Car\n");
        CarModel tempCar = car.getCar();
        response.append("Car Vin: " + tempCar.getVIN() +  "\nCar Make " + tempCar.getMake()+"\nCar Model "+ tempCar.getModel()+"\nCar Color "+ tempCar.getColor()+"\nCar Price "
        + car.getPrice()+"\nDown Payment "+car.getAmount_paid()+ "\n");
        return response.toString();
    }


    private void okButtonActionPerformed(ActionEvent e) {
        View new_view = new FinanceMainView(this.view, this.view.getFinanced_cars());
        this.view.switchView(new_view);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Justin Lee Plassmeyer
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label2 = new JLabel();
        car_vin = new JTextArea();
        label3 = new JLabel();
        car_model = new JTextArea();
        label4 = new JLabel();
        car_make = new JTextArea();
        label5 = new JLabel();
        car_color = new JTextArea();
        label6 = new JLabel();
        car_price = new JTextArea();
        label7 = new JLabel();
        amount_paid = new JTextArea();
        label1 = new JLabel();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));

            // JFormDesigner evaluation mark
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), dialogPane.getBorder())); dialogPane.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new GridBagLayout());
                ((GridBagLayout)contentPanel.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
                ((GridBagLayout)contentPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
                ((GridBagLayout)contentPanel.getLayout()).columnWeights = new double[] {0.01, 0.01, 0.0, 1.0E-4};
                ((GridBagLayout)contentPanel.getLayout()).rowWeights = new double[] {0.01, 0.01, 0.01, 0.01, 0.01, 0.01, 0.0, 0.0, 1.0E-4};

                //---- label2 ----
                label2.setText("Car Vin");
                label2.setFont(new Font("Segoe UI", Font.PLAIN, 45));
                contentPanel.add(label2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 5, 10), 0, 0));

                //---- car_vin ----
                car_vin.setBorder(new BevelBorder(BevelBorder.LOWERED));
                car_vin.setPreferredSize(new Dimension(250, 45));
                car_vin.setMinimumSize(new Dimension(250, 45));
                contentPanel.add(car_vin, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 5, 10), 0, 0));

                //---- label3 ----
                label3.setText("Car Model");
                label3.setFont(new Font("Segoe UI", Font.PLAIN, 45));
                contentPanel.add(label3, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 5, 10), 0, 0));

                //---- car_model ----
                car_model.setBorder(new BevelBorder(BevelBorder.LOWERED));
                car_model.setPreferredSize(new Dimension(250, 45));
                car_model.setMinimumSize(new Dimension(250, 45));
                contentPanel.add(car_model, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 5, 10), 0, 0));

                //---- label4 ----
                label4.setText("Car Make");
                label4.setFont(new Font("Segoe UI", Font.PLAIN, 45));
                contentPanel.add(label4, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 5, 10), 0, 0));

                //---- car_make ----
                car_make.setBorder(new BevelBorder(BevelBorder.LOWERED));
                car_make.setPreferredSize(new Dimension(250, 45));
                car_make.setMinimumSize(new Dimension(250, 45));
                contentPanel.add(car_make, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 5, 10), 0, 0));

                //---- label5 ----
                label5.setText("Car Color");
                label5.setFont(new Font("Segoe UI", Font.PLAIN, 45));
                contentPanel.add(label5, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 5, 10), 0, 0));

                //---- car_color ----
                car_color.setBorder(new BevelBorder(BevelBorder.LOWERED));
                car_color.setPreferredSize(new Dimension(250, 45));
                car_color.setMinimumSize(new Dimension(250, 45));
                contentPanel.add(car_color, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 5, 10), 0, 0));

                //---- label6 ----
                label6.setText("Car's Price");
                label6.setFont(new Font("Segoe UI", Font.PLAIN, 45));
                contentPanel.add(label6, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 5, 10), 0, 0));

                //---- car_price ----
                car_price.setBorder(new BevelBorder(BevelBorder.LOWERED));
                car_price.setPreferredSize(new Dimension(250, 45));
                car_price.setMinimumSize(new Dimension(250, 45));
                contentPanel.add(car_price, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 5, 10), 0, 0));

                //---- label7 ----
                label7.setText("Amount Paid");
                label7.setFont(new Font("Segoe UI", Font.PLAIN, 45));
                contentPanel.add(label7, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 5, 10), 0, 0));

                //---- amount_paid ----
                amount_paid.setBorder(new BevelBorder(BevelBorder.LOWERED));
                amount_paid.setPreferredSize(new Dimension(250, 45));
                amount_paid.setMinimumSize(new Dimension(250, 45));
                contentPanel.add(amount_paid, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.NONE,
                    new Insets(0, 0, 5, 10), 0, 0));
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //---- label1 ----
            label1.setText("Detailed View of Car Finances");
            label1.setFont(new Font("Segoe UI", Font.PLAIN, 40));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            dialogPane.add(label1, BorderLayout.NORTH);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

                //---- okButton ----
                okButton.setText("Back");
                okButton.setPreferredSize(new Dimension(250, 48));
                okButton.addActionListener(e -> okButtonActionPerformed(e));
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Justin Lee Plassmeyer
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label2;
    private JTextArea car_vin;
    private JLabel label3;
    private JTextArea car_model;
    private JLabel label4;
    private JTextArea car_make;
    private JLabel label5;
    private JTextArea car_color;
    private JLabel label6;
    private JTextArea car_price;
    private JLabel label7;
    private JTextArea amount_paid;
    private JLabel label1;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
