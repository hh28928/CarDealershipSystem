/*
 * Created by JFormDesigner on Mon Apr 22 07:53:43 PDT 2019
 */

package inventory.views;

import java.util.Set;
import java.awt.*;
import javax.swing.*;
import com.intellij.uiDesigner.core.*;
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

        this.presenter = presenter;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hammad Hanif
        VIN_Lebal = new JLabel();
        VIN_textBox = new JTextField();
        Make_Label = new JLabel();
        Make_textbox = new JTextField();
        Model_Lebal = new JLabel();
        Model_textbox = new JTextField();
        Color_Label = new JLabel();
        Color_textbox = new JTextField();
        Price_Lebal = new JLabel();
        Price_textbox = new JTextField();
        button_add = new JButton();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayoutManager(7, 3, new Insets(0, 0, 0, 0), -1, -1));

        //---- VIN_Lebal ----
        VIN_Lebal.setText("VIN:");
        contentPane.add(VIN_Lebal, new GridConstraints(1, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        contentPane.add(VIN_textBox, new GridConstraints(1, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- Make_Label ----
        Make_Label.setText("Make:");
        contentPane.add(Make_Label, new GridConstraints(2, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        contentPane.add(Make_textbox, new GridConstraints(2, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- Model_Lebal ----
        Model_Lebal.setText("Model:");
        contentPane.add(Model_Lebal, new GridConstraints(3, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        contentPane.add(Model_textbox, new GridConstraints(3, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- Color_Label ----
        Color_Label.setText("Color:");
        contentPane.add(Color_Label, new GridConstraints(4, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        contentPane.add(Color_textbox, new GridConstraints(4, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- Price_Lebal ----
        Price_Lebal.setText("Price:");
        contentPane.add(Price_Lebal, new GridConstraints(5, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));
        contentPane.add(Price_textbox, new GridConstraints(5, 1, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            null, null, null));

        //---- button_add ----
        button_add.setText("Add");
        contentPane.add(button_add, new GridConstraints(6, 0, 1, 2,
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
    private JLabel VIN_Lebal;
    private JTextField VIN_textBox;
    private JLabel Make_Label;
    private JTextField Make_textbox;
    private JLabel Model_Lebal;
    private JTextField Model_textbox;
    private JLabel Color_Label;
    private JTextField Color_textbox;
    private JLabel Price_Lebal;
    private JTextField Price_textbox;
    private JButton button_add;

    @Override
    public String render() {
        return null;
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
