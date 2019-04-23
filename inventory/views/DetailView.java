package inventory.views;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.util.Set;
import javax.swing.border.*;
import inventory.models.InventoryCarModel;
import inventory.presenters.InventoryPresenter;

public class DetailView extends javax.swing.JFrame implements View {
	private InventoryPresenter mainview;
	private InventoryCarRenderable car;
	private Set<InventoryCarModel> carModels;

	public DetailView(InventoryPresenter view, InventoryCarRenderable car) {
	    this.mainview = view;
	    this.car = car;
	    initComponents();
    }

	public java.lang.String render() {
		this.setVisible(true);
		StringBuilder response = new StringBuilder("Car in inventory\n");
		response.append("Car Vin: " + car.getVIN() +  "\nCar Make " + car.getMake()+"\nCar Model "+ car.getModel()+"\nCar Color "+ car.getColor()+"\nCar Price "
				+ car.getPrice());
		return response.toString();
	}

    private void okButtonActionPerformed(ActionEvent e) {
        View new_view = new InventoryMainView(this.mainview, this.mainview.getInventoryItems());
        this.mainview.switchView(new_view);
    }

    private void button_backActionPerformed(ActionEvent e) {
	    View new_view = new InventoryMainView(mainview, carModels);
	    this.mainview.switchView(new_view);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hammad Hanif
        label1 = new JLabel();
        panel1 = new JPanel();
        label2 = new JLabel();
        vin = new JLabel();
        label4 = new JLabel();
        make = new JLabel();
        label6 = new JLabel();
        model = new JLabel();
        label8 = new JLabel();
        color = new JLabel();
        label9 = new JLabel();
        price = new JLabel();
        label10 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        vin.setText(car.getVIN());
        make.setText(car.getMake());
        model.setText(car.getModel());
        color.setText(car.getColor());
        price.setText(Integer.toString(car.getPrice()));

        //---- label1 ----
        label1.setText("Detailed View");
        contentPane.add(label1, BorderLayout.NORTH);

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
            ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
            ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
            ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- label2 ----
            label2.setText("VIN");
            panel1.add(label2, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- vin ----
            vin.setText("text");
            panel1.add(vin, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- label4 ----
            label4.setText("Make");
            panel1.add(label4, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- make ----
            make.setText("text");
            panel1.add(make, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- label6 ----
            label6.setText("Model");
            panel1.add(label6, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- model ----
            model.setText("text");
            panel1.add(model, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- label8 ----
            label8.setText("Color");
            panel1.add(label8, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- color ----
            color.setText("text");
            panel1.add(color, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- label9 ----
            label9.setText("Price");
            panel1.add(label9, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- price ----
            price.setText("text");
            panel1.add(price, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 0), 0, 0));

            //---- button_back ----
            button_back.setText("Back");
            panel1.add(button_back, new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 0, 5), 0, 0));
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Hammad Hanif
    private JLabel label1;
    private JPanel panel1;
    private JLabel label2;
    private JLabel vin;
    private JLabel label4;
    private JLabel make;
    private JLabel label6;
    private JLabel model;
    private JLabel label8;
    private JLabel color;
    private JLabel label9;
    private JLabel price;
    private JLabel label10;
    private JLabel label11;
    private JButton button_back;

    // JFormDesigner - End of variables declaration  //GEN-END:variables

}