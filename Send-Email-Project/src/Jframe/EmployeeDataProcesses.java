/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jframe;

import Operations.Employee;
import Operations.FileOperations;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yc_ke
 */
public class EmployeeDataProcesses extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeDataProcesses
     */
    public EmployeeDataProcesses() {
        initComponents();
        this.setLocationRelativeTo(null);
        fillEmployeeTable();
        jTableWidth();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableEmployee = new javax.swing.JTable();
        ButtonRemove = new javax.swing.JButton();
        ButtonAdd = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextIDRemove = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextNameRemove = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ComboboxEmployeeColumn = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        TextEditID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextEditName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TextEditedItem = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ButtonEdit = new javax.swing.JButton();
        TextAddId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TextAddName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TextAddSurname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TextAddPosition = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        TextAddUserName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        TextAddPassword = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        TextAddMail1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        TextAddMail2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TextAddMail3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        TextAddMail4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TextAddMail5 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        ButtonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        TableEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Surname", "Position", "User Name", "Password", "Emails"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableEmployee);

        ButtonRemove.setText("Remove Employee");
        ButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRemoveActionPerformed(evt);
            }
        });

        ButtonAdd.setText("Add Employee");
        ButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAddActionPerformed(evt);
            }
        });

        jButton4.setText("Return Manager Panel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Data Screen");

        jLabel2.setText("Enter the ıd and name of the person to be deleted ");

        jLabel3.setText("ID   :  ");

        jLabel4.setText("Name :    ");

        ComboboxEmployeeColumn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "name", "surname", "position", "userName", "password" }));
        ComboboxEmployeeColumn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboboxEmployeeColumnActionPerformed(evt);
            }
        });

        jLabel5.setText("Select the value of the Employee you want to update from the combobox and enter the values.");

        TextEditID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEditIDActionPerformed(evt);
            }
        });

        jLabel6.setText("ID   :  ");

        jLabel7.setText("Name :    ");

        jLabel8.setText("item to be edited :");

        ButtonEdit.setText("Edit Employee");
        ButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditActionPerformed(evt);
            }
        });

        jLabel9.setText("ID  :");

        jLabel10.setText("Name : ");

        jLabel11.setText("Surname :");

        TextAddPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextAddPositionActionPerformed(evt);
            }
        });

        jLabel12.setText("Position : ");

        jLabel13.setText("UserName :");

        jLabel14.setText("Password : ");

        jLabel15.setText("Mail-1 : ");

        jLabel16.setText("Mail-2(if There is)");

        jLabel17.setText("Mail-3(if There is)");

        jLabel18.setText("Mail-4(if There is)");

        jLabel19.setText("Mail-5(if There is)");

        ButtonClear.setText("Clear");
        ButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonClear)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextNameRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(TextIDRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(ButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboboxEmployeeColumn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(TextEditID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextEditedItem, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextEditName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addComponent(ButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextAddId, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(TextAddName)
                            .addComponent(TextAddSurname)
                            .addComponent(TextAddPosition)
                            .addComponent(TextAddUserName)
                            .addComponent(TextAddPassword)
                            .addComponent(TextAddMail3)
                            .addComponent(TextAddMail2)
                            .addComponent(TextAddMail1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 10, Short.MAX_VALUE))
                            .addComponent(TextAddMail5)
                            .addComponent(TextAddMail4)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ButtonClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextAddId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextAddName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextAddSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextAddPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextAddUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextAddPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextAddMail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextAddMail2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextAddMail3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextAddMail4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextAddMail5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addComponent(ButtonAdd))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TextIDRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TextNameRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addComponent(ButtonRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton4)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(TextEditID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addComponent(ComboboxEmployeeColumn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(TextEditName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7)
                                        .addComponent(TextEditedItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8)))
                                .addComponent(ButtonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void ButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRemoveActionPerformed
        try {
            int i = JOptionPane.showConfirmDialog(null,  "Do you want to continue?\nAfter this process, Employee will be deleted.", "Contunie?", JOptionPane.YES_NO_OPTION);
            // TODO add your handling code here:
            if(i==0)
            FileOperations.removeEmployeeFile(TextIDRemove.getText().trim(), TextNameRemove.getText().trim());
            
        } catch (IOException ex) {
            Logger.getLogger(EmployeeDataProcesses.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Employee wasn't deleted");
        }
        TextIDRemove.setText("");
        TextNameRemove.setText("");
       fillEmployeeTable();
    }//GEN-LAST:event_ButtonRemoveActionPerformed

    private void ComboboxEmployeeColumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboboxEmployeeColumnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboboxEmployeeColumnActionPerformed

    private void TextEditIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEditIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEditIDActionPerformed

    private void ButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditActionPerformed
        try {
            int i = JOptionPane.showConfirmDialog(null,  "Do you want to continue?\nAfter this process, Employee will be edited.", "Contunie?", JOptionPane.YES_NO_OPTION);
            // TODO add your handling code here:
            if(i==0){
                if(ComboboxEmployeeColumn.getSelectedItem()=="name")
                    FileOperations.editEmployeeFile(TextEditID.getText().trim(),TextEditName.getText().trim(),TextEditedItem.getText().trim(), true, false, false, false, false);
             else if(ComboboxEmployeeColumn.getSelectedItem()=="surname")
                    FileOperations.editEmployeeFile(TextEditID.getText().trim(),TextEditName.getText().trim(),TextEditedItem.getText().trim(), false, true, false, false, false);
            
             else if(ComboboxEmployeeColumn.getSelectedItem()=="position")
                    FileOperations.editEmployeeFile(TextEditID.getText().trim(),TextEditName.getText().trim(),TextEditedItem.getText().trim(), false, false, true, false, false);
            
             else if(ComboboxEmployeeColumn.getSelectedItem()=="userName")
                    FileOperations.editEmployeeFile(TextEditID.getText().trim(),TextEditName.getText().trim(),TextEditedItem.getText().trim(), false, false, false, true, false);
            
             else if(ComboboxEmployeeColumn.getSelectedItem()=="password")
                    FileOperations.editEmployeeFile(TextEditID.getText().trim(),TextEditName.getText().trim(),TextEditedItem.getText().trim(), false, false, false, false, true);
            
            } 
           
        } catch (IOException ex) {
            Logger.getLogger(EmployeeDataProcesses.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Employee wasn't Edited");
        }
        TextEditID.setText("");
        TextEditName.setText("");
        TextEditedItem.setText("");
       fillEmployeeTable();
    }//GEN-LAST:event_ButtonEditActionPerformed

    private void TextAddPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextAddPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextAddPositionActionPerformed

    private void ButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAddActionPerformed
        int i = JOptionPane.showConfirmDialog(null,  "Do you want to continue?\nAfter this process, Employee will be Added.", "Contunie?", JOptionPane.YES_NO_OPTION);
        // TODO add your handling code here:
        if(i==0){
            if(TextAddMail2.getText().trim().equals(""))
                FileOperations.addEmployeeFile(TextAddId.getText().trim(),TextAddName.getText().trim(),TextAddSurname.getText().trim(), TextAddPosition.getText().trim(),TextAddUserName.getText().trim(), TextAddPassword.getText().trim(),TextAddMail1.getText().trim());
            else if(TextAddMail3.getText().trim().equals(""))
                FileOperations.addEmployeeFile(TextAddId.getText().trim(),TextAddName.getText().trim(),TextAddSurname.getText().trim(), TextAddPosition.getText().trim(),TextAddUserName.getText().trim(), TextAddPassword.getText().trim(),TextAddMail1.getText().trim(),TextAddMail2.getText().trim());
            else if(TextAddMail4.getText().trim().equals(""))
                FileOperations.addEmployeeFile(TextAddId.getText().trim(),TextAddName.getText().trim(),TextAddSurname.getText().trim(), TextAddPosition.getText().trim(),TextAddUserName.getText().trim(), TextAddPassword.getText().trim(),TextAddMail1.getText().trim(),TextAddMail2.getText().trim(),TextAddMail3.getText().trim());
            else if(TextAddMail5.getText().trim().equals(""))
                FileOperations.addEmployeeFile(TextAddId.getText().trim(),TextAddName.getText().trim(),TextAddSurname.getText().trim(), TextAddPosition.getText().trim(),TextAddUserName.getText().trim(), TextAddPassword.getText().trim(),TextAddMail1.getText().trim(),TextAddMail2.getText().trim(),TextAddMail3.getText().trim(),TextAddMail4.getText().trim());
            else{
                FileOperations.addEmployeeFile(TextAddId.getText().trim(),TextAddName.getText().trim(),TextAddSurname.getText().trim(), TextAddPosition.getText().trim(),TextAddUserName.getText().trim(), TextAddPassword.getText().trim(),TextAddMail1.getText().trim(),TextAddMail2.getText().trim(),TextAddMail3.getText().trim(),TextAddMail4.getText().trim(),TextAddMail5.getText().trim());
            }
           
            
        }
       fillEmployeeTable();
        
    }//GEN-LAST:event_ButtonAddActionPerformed

    private void ButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonClearActionPerformed
        // TODO add your handling code here:
            TextAddId.setText("");
            TextAddName.setText("");
            TextAddSurname.setText("");
            TextAddPosition.setText("");
            TextAddUserName.setText("");
            TextAddPassword.setText("");
            TextAddMail1.setText("");
            TextAddMail2.setText("");
            TextAddMail3.setText("");
            TextAddMail4.setText("");
            TextAddMail5.setText("");
    }//GEN-LAST:event_ButtonClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeDataProcesses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDataProcesses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDataProcesses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDataProcesses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDataProcesses().setVisible(true);
                
            }
        });
    }
public void jTableWidth(){
    TableEmployee.setAutoResizeMode(TableEmployee.AUTO_RESIZE_OFF);
    TableEmployee.getColumnModel().getColumn(0).setPreferredWidth(35);
     TableEmployee.getColumnModel().getColumn(1).setPreferredWidth(80);
      TableEmployee.getColumnModel().getColumn(2).setPreferredWidth(80);
       TableEmployee.getColumnModel().getColumn(3).setPreferredWidth(80);
       TableEmployee.getColumnModel().getColumn(4).setPreferredWidth(80);
       TableEmployee.getColumnModel().getColumn(5).setPreferredWidth(80);
       TableEmployee.getColumnModel().getColumn(6).setPreferredWidth(800);
}     
public void fillEmployeeTable(){
     ArrayList<Employee> empList=(ArrayList<Employee>) FileOperations.readEmployeeFile();
    DefaultTableModel tblModel = (DefaultTableModel)TableEmployee.getModel();
    while (tblModel.getRowCount()>0)
          {
             tblModel.removeRow(0);
          }
     String mail;
    for(int i=0;i<empList.size();i++){
        mail="";
           for(int j=0;j<empList.get(i).mails.size();j++){
              
               mail+=empList.get(i).mails.get(j)+"  , ";
               
           }
           if(empList.get(i).position.equals("Employee")){
                String [] data = {empList.get(i).ıd,empList.get(i).name,empList.get(i).surname,empList.get(i).position,empList.get(i).userName,empList.get(i).Password,mail};
                tblModel.addRow(data);
           }
         }
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAdd;
    private javax.swing.JButton ButtonClear;
    private javax.swing.JButton ButtonEdit;
    private javax.swing.JButton ButtonRemove;
    private javax.swing.JComboBox<String> ComboboxEmployeeColumn;
    private javax.swing.JTable TableEmployee;
    private javax.swing.JTextField TextAddId;
    private javax.swing.JTextField TextAddMail1;
    private javax.swing.JTextField TextAddMail2;
    private javax.swing.JTextField TextAddMail3;
    private javax.swing.JTextField TextAddMail4;
    private javax.swing.JTextField TextAddMail5;
    private javax.swing.JTextField TextAddName;
    private javax.swing.JTextField TextAddPassword;
    private javax.swing.JTextField TextAddPosition;
    private javax.swing.JTextField TextAddSurname;
    private javax.swing.JTextField TextAddUserName;
    private javax.swing.JTextField TextEditID;
    private javax.swing.JTextField TextEditName;
    private javax.swing.JTextField TextEditedItem;
    private javax.swing.JTextField TextIDRemove;
    private javax.swing.JTextField TextNameRemove;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
