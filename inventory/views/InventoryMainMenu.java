import java.awt.*;
import javax.swing.*;
import inventory.presenters.InventoryPresenter;
import inventory.views.InventoryCarRenderable;
import java.util.*;
/*
 * Created by JFormDesigner on Mon Apr 22 16:46:49 PDT 2019
 */



/**
 * @author Hammad Hanif
 */
public class InventoryMainMenu extends JFrame {

    Set<InventoryCarRenderable> inventoryCarRenderableSet;
    InventoryPresenter presenter;

    public InventoryMainMenu(Set<InventoryCarRenderable> inventoryCarRenderableSet, InventoryPresenter presenter) {
        this.inventoryCarRenderableSet = inventoryCarRenderableSet;
        this.presenter = presenter;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Hammad Hanif
        panel1 = new JPanel();
        label1 = new JLabel();
        scrollPane2 = new JScrollPane();
        list1 = new JList();
        detailedView = new JButton();
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
            label1.setText("Inventory Main View");
            panel1.add(label1, BorderLayout.NORTH);

            //======== scrollPane2 ========
            {
                scrollPane2.setViewportView(list1);
            }
            panel1.add(scrollPane2, BorderLayout.WEST);

            //---- detailedView ----
            detailedView.setText("Detail View");
            panel1.add(detailedView, BorderLayout.CENTER);

            //---- button_back ----
            button_back.setText("Back");
            panel1.add(button_back, BorderLayout.EAST);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Hammad Hanif
    private JPanel panel1;
    private JLabel label1;
    private JScrollPane scrollPane2;
    private JList list1;
    private JButton detailedView;
    private JButton button_back;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
