package finance.views;

import java.awt.event.*;
import java.util.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;
import finance.viewmodels.FinanceViewModel;
import java.lang.StringBuilder;
import inventory.views.View;
import finance.models.FinanceCarModel;
import finance.views.AddFinanceView;
import inventory.models.CarModel;

import javax.swing.*;
import java.awt.*;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.jdesktop.swingx.*;

public class FinanceMainView extends javax.swing.JFrame implements View
{
    private Set<FinanceCarModel> financed_cars;
    private FinanceViewModel viewModel;

    public FinanceMainView(FinanceViewModel viewModel,Set<FinanceCarModel> financed_cars)
    {
        this.financed_cars = financed_cars;
        this.viewModel = viewModel;
        initComponents();
    }

    public String render() {

        this.setVisible(true);
        StringBuilder response = new StringBuilder(financed_cars.size() + " CARS CURRENTLY BEING FINANCED:\nRESULT #\t VIN\n");

        int counter = 1;
        for (FinanceCarModel car : financed_cars) {
            response.append(counter++ + "\t\t" + car.toString() + "\n");
        }
        return response.toString();
    }

    private void button1ActionPerformed(ActionEvent e) {
        this.setVisible(false);
    }

    private void new_financeActionPerformed(ActionEvent e) {
        View new_view = new AddFinanceView(viewModel);
        this.viewModel.switchView(new_view);
    }
    // itterates throuh the list of financed cars to find the correct vin
    // if is does not find it a popup will let the user know
    private void detailed_viewActionPerformed(ActionEvent e) {
        String enterd_vin = vin.getText();
        for(FinanceCarModel current_car: this.financed_cars)
        {
            CarModel temp_car = current_car.getCar();
            if(enterd_vin.equals(temp_car.getVIN()))
            {
                View view = new FinanceDetailView(this.viewModel,current_car);
            }
        }
        JOptionPane.showMessageDialog(null,"Car could not be found");

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Justin Lee Plassmeyer
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label8 = new JLabel();
        label7 = new JLabel();
        vin = new JTextField();
        panel1 = new JPanel();
        button1 = new JButton();
        new_finance = new JButton();
        detailed_view = new JButton();
        label1 = new JLabel();

        //======== this ========
        setBackground(new Color(0, 225, 150));
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
                ((GridBagLayout)contentPanel.getLayout()).columnWidths = new int[] {0, 0};
                ((GridBagLayout)contentPanel.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
                ((GridBagLayout)contentPanel.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
                ((GridBagLayout)contentPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

                //---- label2 ----
                label2.setText("Interest Rates");
                label2.setFont(new Font("Segoe UI", Font.PLAIN, 48));
                contentPanel.add(label2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 100, 0), 0, 0));

                //---- label3 ----
                label3.setText("4.3% for Most Customers");
                label3.setFont(new Font("Segoe UI", Font.PLAIN, 48));
                contentPanel.add(label3, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 100, 0), 0, 0));

                //---- label4 ----
                label4.setText("Down Payment ");
                label4.setFont(new Font("Segoe UI", Font.PLAIN, 48));
                contentPanel.add(label4, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 100, 0), 0, 0));

                //---- label5 ----
                label5.setText("5% of total Car Value Minimum");
                label5.setFont(new Font("Segoe UI", Font.PLAIN, 48));
                contentPanel.add(label5, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 100, 0), 0, 0));

                //---- label6 ----
                label6.setText("Credit Score Low ?");
                label6.setFont(new Font("Segoe UI", Font.PLAIN, 48));
                contentPanel.add(label6, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                    GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 100, 0), 0, 0));

                //---- label8 ----
                label8.setText("Don't Worry, No Credit Score Needed");
                label8.setFont(new Font("Segoe UI", Font.PLAIN, 48));
                contentPanel.add(label8, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                    GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 100, 0), 0, 0));

                //---- label7 ----
                label7.setText("Already Financed Find Vehicle by Entering VIN");
                label7.setFont(new Font("Segoe UI", Font.PLAIN, 36));
                contentPanel.add(label7, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
                    GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 100, 0), 0, 0));

                //---- vin ----
                vin.setPreferredSize(new Dimension(650, 48));
                contentPanel.add(vin, new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0,
                    GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== panel1 ========
            {
                panel1.setPreferredSize(new Dimension(250, 68));
                panel1.setLayout(new GridBagLayout());
                ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
                ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0};
                ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {1.0, 1.0E-4};

                //---- button1 ----
                button1.setText("Back");
                button1.setPreferredSize(new Dimension(150, 48));
                button1.setMargin(new Insets(2, 4, 3, 10));
                button1.addActionListener(e -> button1ActionPerformed(e));
                panel1.add(button1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 100), 0, 0));

                //---- new_finance ----
                new_finance.setText("Finance New Car");
                new_finance.setPreferredSize(new Dimension(250, 48));
                new_finance.addActionListener(e -> new_financeActionPerformed(e));
                panel1.add(new_finance, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 100), 0, 0));

                //---- detailed_view ----
                detailed_view.setText("Detailed View");
                detailed_view.setPreferredSize(new Dimension(250, 48));
                detailed_view.addActionListener(e -> detailed_viewActionPerformed(e));
                panel1.add(detailed_view, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(panel1, BorderLayout.SOUTH);

            //---- label1 ----
            label1.setText("Financing");
            label1.setFont(new Font("Segoe UI", Font.BOLD, 48));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            dialogPane.add(label1, BorderLayout.NORTH);
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
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label8;
    private JLabel label7;
    private JTextField vin;
    private JPanel panel1;
    private JButton button1;
    private JButton new_finance;
    private JButton detailed_view;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}