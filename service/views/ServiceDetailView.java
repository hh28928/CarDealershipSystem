package service.views;
import inventory.views.View;
import service.models.ServiceAppointmentModel;
import service.viewmodels.ServiceViewModel;
import inventory.models.CarModel;
import java.time.*;

public class ServiceDetailView extends javax.swing.JFrame implements View{
    
    private ServiceAppointmentModel currentAppointment;
    private ServiceViewModel viewModel;
    private ServiceMainView main_view;
    
    /** Creates new form ServiceDetailView */
    public ServiceDetailView(ServiceAppointmentModel appt, ServiceViewModel svm, ServiceMainView main_view) {
        currentAppointment = appt;
        viewModel = svm;
        this.main_view = main_view;
    }
                             
    private void initComponents() {

        edit_service_appointment_panel = new javax.swing.JPanel();
        customer_email_label = new javax.swing.JLabel();
        date_label = new javax.swing.JLabel();
        appointment_customer_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        appointment_month_textbox = new javax.swing.JTextField();
        appointment_day_textbox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        appointment_year_textbox = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        vin_label = new javax.swing.JLabel();
        make_label = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        model_label = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        color_label = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        comment_text_area = new java.awt.TextArea();
        save_appointment = new javax.swing.JButton();

        setTitle("Edit Appointment");

        edit_service_appointment_panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Edit Appointment"));

        customer_email_label.setText("Customer Email:");

        date_label.setText("Date:");

        appointment_customer_email.setText(currentAppointment.getEmail());

        jLabel8.setText("/");

        appointment_month_textbox.setText(Integer.toString(currentAppointment.getDate().getMonthValue()));

        appointment_day_textbox.setText(Integer.toString(currentAppointment.getDate().getDayOfMonth()));

        jLabel11.setText("/");

        appointment_year_textbox.setText(Integer.toString(currentAppointment.getDate().getYear()));

        jLabel12.setText("Vin #:");
        vin_label.setText(currentAppointment.getCar().getVIN());

        jLabel13.setText("Make:");
        make_label.setText(currentAppointment.getCar().getMake());

        jLabel14.setText("Model:");
        model_label.setText(currentAppointment.getCar().getModel());

        jLabel15.setText("Color:");
        color_label.setText(currentAppointment.getCar().getColor());

        comment_text_area.setText(currentAppointment.getComments());
        
        javax.swing.GroupLayout edit_service_appointment_panelLayout = new javax.swing.GroupLayout(edit_service_appointment_panel);
        edit_service_appointment_panel.setLayout(edit_service_appointment_panelLayout);
        edit_service_appointment_panelLayout.setHorizontalGroup(
            edit_service_appointment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_service_appointment_panelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(edit_service_appointment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(edit_service_appointment_panelLayout.createSequentialGroup()
                        .addComponent(customer_email_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appointment_customer_email, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                    .addGroup(edit_service_appointment_panelLayout.createSequentialGroup()
                        .addGroup(edit_service_appointment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(edit_service_appointment_panelLayout.createSequentialGroup()
                                .addComponent(date_label)
                                .addGap(0, 0, 0)
                                .addComponent(appointment_month_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(appointment_day_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(appointment_year_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(edit_service_appointment_panelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vin_label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(edit_service_appointment_panelLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(make_label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(edit_service_appointment_panelLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(model_label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(edit_service_appointment_panelLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(color_label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addComponent(comment_text_area, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        edit_service_appointment_panelLayout.setVerticalGroup(
            edit_service_appointment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(edit_service_appointment_panelLayout.createSequentialGroup()
                .addGroup(edit_service_appointment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customer_email_label)
                    .addComponent(appointment_customer_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(edit_service_appointment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(edit_service_appointment_panelLayout.createSequentialGroup()
                        .addGroup(edit_service_appointment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(appointment_month_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(appointment_day_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(appointment_year_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date_label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(edit_service_appointment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vin_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(edit_service_appointment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(make_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(edit_service_appointment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(model_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(edit_service_appointment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(color_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(comment_text_area, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        save_appointment.setText("Save");
        save_appointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_appointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(edit_service_appointment_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(save_appointment, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(edit_service_appointment_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save_appointment, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
//public ServiceAppointmentModel(CarModel c_model, String comments, LocalDate date, String email, int id)
    private void save_appointmentActionPerformed(java.awt.event.ActionEvent evt) 
    {                                                 
        String email = appointment_customer_email.getText();
        int month = Integer.parseInt(appointment_month_textbox.getText());
        int day = Integer.parseInt(appointment_day_textbox.getText());
        int year = Integer.parseInt(appointment_year_textbox.getText());
        LocalDate date = LocalDate.of(year,month,day);
        CarModel car = currentAppointment.getCar();
        int id = currentAppointment.getID();
        String comments = comment_text_area.getText();
        
        ServiceAppointmentModel edited_appointment = new ServiceAppointmentModel(car,comments,date,email,id);
        viewModel.updateAppointment(id, edited_appointment);
        
        ServiceMainView updated_main_view = new ServiceMainView(viewModel);
        main_view.dispose();
        viewModel.switchView(updated_main_view);
        this.setVisible(false);
        this.dispose();
    }                                                
    
    public String render()
    {
      initComponents();
      this.setVisible(true);
      return "ServiceDetailView rendered.";
    }
    
    // Variables declaration - do not modify                     
    private javax.swing.JTextField appointment_customer_email;
    private javax.swing.JTextField appointment_day_textbox;
    private javax.swing.JTextField appointment_month_textbox;
    private javax.swing.JTextField appointment_year_textbox;
    private javax.swing.JLabel color_label;
    private java.awt.TextArea comment_text_area;
    private javax.swing.JLabel customer_email_label;
    private javax.swing.JLabel date_label;
    private javax.swing.JPanel edit_service_appointment_panel;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel make_label;
    private javax.swing.JLabel model_label;
    private javax.swing.JButton save_appointment;
    private javax.swing.JLabel vin_label;
    // End of variables declaration                   
    
}
