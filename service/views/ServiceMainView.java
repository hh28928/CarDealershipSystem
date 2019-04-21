package service.views;
import service.viewmodels.ServiceViewModel;
import inventory.views.View;
import service.models.ServiceAppointmentModel;
import java.util.HashSet;
public class ServiceMainView extends javax.swing.JFrame implements View {
    
    private ServiceViewModel viewModel;
    private HashSet<ServiceAppointmentModel> appointments;
    
    /**
     * Creates new form ServiceMainView
     */
    public ServiceMainView(ServiceViewModel svm) {
        viewModel = svm;
        appointments = svm.loadServiceAppointments();
        initComponents();
        this.render();
    }                        
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ServiceMainViewPanel = new javax.swing.JPanel();
        add_appointment_button = new javax.swing.JButton();
        update_appointment_button = new javax.swing.JButton();
        delete_appointment_button = new javax.swing.JButton();
        appointment_list = new java.awt.List();
        exit_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Service Appointments");

        ServiceMainViewPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Appointments"));

        for(ServiceAppointmentModel appt : appointments)
        {
          appointment_list.add(appt.toString());
        }

        add_appointment_button.setText("Add");
        add_appointment_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_appointment_buttonActionPerformed(evt);
            }
        });

        update_appointment_button.setText("Edit");
        update_appointment_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_appointment_buttonActionPerformed(evt);
            }
        });

        delete_appointment_button.setText("Remove");
        delete_appointment_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_appointment_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ServiceMainViewPanelLayout = new javax.swing.GroupLayout(ServiceMainViewPanel);
        ServiceMainViewPanel.setLayout(ServiceMainViewPanelLayout);
        ServiceMainViewPanelLayout.setHorizontalGroup(
            ServiceMainViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceMainViewPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(appointment_list, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ServiceMainViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(update_appointment_button)
                    .addComponent(add_appointment_button)
                    .addComponent(delete_appointment_button))
                .addContainerGap())
        );

        ServiceMainViewPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {add_appointment_button, delete_appointment_button, update_appointment_button});

        ServiceMainViewPanelLayout.setVerticalGroup(
            ServiceMainViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ServiceMainViewPanelLayout.createSequentialGroup()
                .addComponent(add_appointment_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ServiceMainViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ServiceMainViewPanelLayout.createSequentialGroup()
                        .addComponent(update_appointment_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete_appointment_button))
                    .addComponent(appointment_list, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        exit_button.setText("OK");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ServiceMainViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ServiceMainViewPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit_button)
                .addContainerGap())
        );

        ServiceMainViewPanel.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleName("Service Apointments Menu");

        pack();
    }// </editor-fold>                        

    private void add_appointment_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void update_appointment_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        //System.out.println(appointment_list.getSelectedItem());
        if(appointment_list.getSelectedObjects().length == 0)
        {
          return;
        }
        String selected = appointment_list.getSelectedItem().substring(1,2);
        
        System.out.println(selected);
        return;
        /*
        ServiceAppointmentModel chosenAppt = null;
        for(ServiceAppointmentModel appt : appointments)
        {
          
        }
        viewModel.switchView(new ServiceDetailView(chosenAppt));
        */
    }                                                         

    private void delete_appointment_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        this.setVisible(false);
    }                                           
    
    public String render()
    {
      this.setVisible(true);
      return "ServiceMainView Rendered";
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JPanel ServiceMainViewPanel;
    private javax.swing.JButton add_appointment_button;
    private java.awt.List appointment_list;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete_appointment_button;
    private javax.swing.JButton exit_button;
    private javax.swing.JButton update_appointment_button;
    // End of variables declaration                   
    
}
