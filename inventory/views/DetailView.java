package inventory.views;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;
import com.sun.org.apache.xpath.internal.operations.String;
import inventory.presenters.InventoryPresenter;

public class DetailView extends javax.swing.JFrame implements View {
	private InventoryPresenter mainview;
	private InventoryCarRenderable car;
	private int millage;
	private String description;

	public DetailView(InventoryPresenter view, InventoryCarRenderable car) {
	    this.mainview = view;
	    this.car = car;
	    initComponents();
    }

	public DetailView(InventoryPresenter view, InventoryCarRenderable car, int millage, String description) {
		this.mainview = view;
		this.car = car;
		this.millage = millage;
		this.description = description;
		initComponents();
	}

	public java.lang.String render() {
		this.setVisible(true);
		StringBuilder response = new StringBuilder("Car in inventory\n");
		response.append("Car Vin: " + car.getVIN() +  "\nCar Make " + car.getMake()+"\nCar Model "+ car.getModel()+"\nCar Color "+ car.getColor()+"\nCar Price "
				+ car.getPrice()+"\nMillage " + millage + "\nDescription " + description);
		return response.toString();
	}

    private void okButtonActionPerformed(ActionEvent e) {
        View new_view = new InventoryMainView(this.mainview, this.mainview.getInventoryItems());
        this.mainview.switchView(new_view);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hammad Hanif
        label8 = new JLabel();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea_vin = new JTextArea();
        label2 = new JLabel();
        scrollPane2 = new JScrollPane();
        textAreamake = new JTextArea();
        label3 = new JLabel();
        scrollPane3 = new JScrollPane();
        textArea_model = new JTextArea();
        label4 = new JLabel();
        scrollPane4 = new JScrollPane();
        textPane_color = new JTextPane();
        label5 = new JLabel();
        scrollPane5 = new JScrollPane();
        textArea_price = new JTextArea();
        label6 = new JLabel();
        scrollPane6 = new JScrollPane();
        textPane_millage = new JTextPane();
        label7 = new JLabel();
        scrollPane7 = new JScrollPane();
        textArea_description = new JTextArea();
        button_back = new JButton();
        textArea1 = new JTextArea();

        //======== this ========
        setFont(new Font("Dialog", Font.ITALIC, 56));
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(9, 3, new Insets(0, 0, 0, 0), -1, -1));

        //---- label8 ----
        label8.setText("Detailed View of a car");
        label8.setFont(new Font("Segoe UI", Font.PLAIN, 40));
        label8.setHorizontalAlignment(SwingConstants.CENTER);
        label8.setMaximumSize(new Dimension(520, 54));
        label8.setMinimumSize(new Dimension(520, 54));
        label8.setPreferredSize(new Dimension(520, 54));
        contentPane.add(label8, new GridConstraints(0, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label1 ----
        label1.setText("VIN");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 45f));
        contentPane.add(label1, new GridConstraints(1, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== scrollPane1 ========
        {

            //---- textArea_vin ----
            textArea_vin.setBorder(new BevelBorder(BevelBorder.LOWERED));
            textArea_vin.setMinimumSize(new Dimension(250, 45));
            textArea_vin.setPreferredSize(new Dimension(250, 45));
            scrollPane1.setViewportView(textArea_vin);
        }
        contentPane.add(scrollPane1, new GridConstraints(1, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label2 ----
        label2.setText("Make");
        label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 45f));
        contentPane.add(label2, new GridConstraints(2, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== scrollPane2 ========
        {

            //---- textAreamake ----
            textAreamake.setPreferredSize(new Dimension(250, 45));
            textAreamake.setMinimumSize(new Dimension(250, 45));
            scrollPane2.setViewportView(textAreamake);
        }
        contentPane.add(scrollPane2, new GridConstraints(2, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label3 ----
        label3.setText("Model");
        label3.setFont(new Font("Segoe UI", Font.PLAIN, 45));
        contentPane.add(label3, new GridConstraints(3, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== scrollPane3 ========
        {

            //---- textArea_model ----
            textArea_model.setMinimumSize(new Dimension(250, 45));
            textArea_model.setPreferredSize(new Dimension(250, 45));
            scrollPane3.setViewportView(textArea_model);
        }
        contentPane.add(scrollPane3, new GridConstraints(3, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label4 ----
        label4.setText("Color");
        label4.setFont(new Font("Segoe UI", Font.PLAIN, 45));
        contentPane.add(label4, new GridConstraints(4, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== scrollPane4 ========
        {

            //---- textPane_color ----
            textPane_color.setPreferredSize(new Dimension(250, 45));
            scrollPane4.setViewportView(textPane_color);
        }
        contentPane.add(scrollPane4, new GridConstraints(4, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label5 ----
        label5.setText("Price");
        label5.setFont(new Font("Segoe UI", Font.PLAIN, 45));
        contentPane.add(label5, new GridConstraints(5, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== scrollPane5 ========
        {

            //---- textArea_price ----
            textArea_price.setPreferredSize(new Dimension(250, 45));
            scrollPane5.setViewportView(textArea_price);
        }
        contentPane.add(scrollPane5, new GridConstraints(5, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label6 ----
        label6.setText("Millage");
        label6.setFont(new Font("Segoe UI", Font.PLAIN, 45));
        contentPane.add(label6, new GridConstraints(6, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== scrollPane6 ========
        {

            //---- textPane_millage ----
            textPane_millage.setPreferredSize(new Dimension(250, 45));
            scrollPane6.setViewportView(textPane_millage);
        }
        contentPane.add(scrollPane6, new GridConstraints(6, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- label7 ----
        label7.setText("Description");
        label7.setFont(new Font("Segoe UI", Font.PLAIN, 45));
        contentPane.add(label7, new GridConstraints(7, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //======== scrollPane7 ========
        {

            //---- textArea_description ----
            textArea_description.setPreferredSize(new Dimension(250, 45));
            scrollPane7.setViewportView(textArea_description);
        }
        contentPane.add(scrollPane7, new GridConstraints(7, 2, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button_back ----
        button_back.setText("Back");
        contentPane.add(button_back, new GridConstraints(8, 2, 1, 1,
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
    private JLabel label8;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTextArea textArea_vin;
    private JLabel label2;
    private JScrollPane scrollPane2;
    private JTextArea textAreamake;
    private JLabel label3;
    private JScrollPane scrollPane3;
    private JTextArea textArea_model;
    private JLabel label4;
    private JScrollPane scrollPane4;
    private JTextPane textPane_color;
    private JLabel label5;
    private JScrollPane scrollPane5;
    private JTextArea textArea_price;
    private JLabel label6;
    private JScrollPane scrollPane6;
    private JTextPane textPane_millage;
    private JLabel label7;
    private JScrollPane scrollPane7;
    private JTextArea textArea_description;
    private JButton button_back;
    private JTextArea textArea1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}