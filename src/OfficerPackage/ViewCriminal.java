/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OfficerPackage;

import Classes.Criminal;
import LoginPackage.LoginForm;
import static LoginPackage.LoginForm.CasesList;
import static LoginPackage.LoginForm.CriminalList;
import static LoginPackage.LoginForm.NowOff;
import static LoginPackage.LoginForm.WitnessList;
import static OfficerPackage.DisFullCase.criminal_data;
import java.awt.BorderLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author farah
 */
public class ViewCriminal extends javax.swing.JPanel {

    DisFullCase Fcase;
    BorderLayout b;
    
    int criminal_id;
    int case_id;
    
    public ViewCriminal() {
        initComponents();
    }

    public ViewCriminal(int case_id)
    {
        initComponents();
        this.case_id=case_id;
        Fcase = new DisFullCase(case_id);
        b = new BorderLayout();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IDLbl = new javax.swing.JLabel();
        IDTxt = new javax.swing.JTextField();
        NameLbl = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();
        NameLbl1 = new javax.swing.JLabel();
        GenderTxt = new javax.swing.JTextField();
        NameLbl2 = new javax.swing.JLabel();
        BDTxt = new javax.swing.JTextField();
        AddressLbl = new javax.swing.JLabel();
        AddressTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        PnumTxt = new javax.swing.JTextField();
        PnumLbl = new javax.swing.JLabel();
        LocTxt = new javax.swing.JTextField();
        LocLbl = new javax.swing.JLabel();
        DangLbl = new javax.swing.JLabel();
        DangCBox = new javax.swing.JComboBox();
        UpdateBtn = new javax.swing.JButton();
        CloseBtn = new javax.swing.JButton();
        NameLbl3 = new javax.swing.JLabel();
        DangLbl1 = new javax.swing.JLabel();
        StatCBox = new javax.swing.JComboBox();
        WitList = new javax.swing.JScrollPane();
        caseList = new javax.swing.JList();

        setBackground(new java.awt.Color(31, 40, 51));

        IDLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        IDLbl.setForeground(new java.awt.Color(255, 255, 255));
        IDLbl.setText("ID");

        IDTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        IDTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        IDTxt.setEnabled(false);

        NameLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        NameLbl.setForeground(new java.awt.Color(255, 255, 255));
        NameLbl.setText("Name");

        NameTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        NameTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        NameTxt.setEnabled(false);

        NameLbl1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        NameLbl1.setForeground(new java.awt.Color(255, 255, 255));
        NameLbl1.setText("Gender");

        GenderTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        GenderTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        GenderTxt.setEnabled(false);

        NameLbl2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        NameLbl2.setForeground(new java.awt.Color(255, 255, 255));
        NameLbl2.setText("Birthdate");

        BDTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        BDTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        BDTxt.setEnabled(false);

        AddressLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AddressLbl.setForeground(new java.awt.Color(255, 255, 255));
        AddressLbl.setText("Address");

        AddressTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        AddressTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        PnumTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        PnumTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        PnumLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        PnumLbl.setForeground(new java.awt.Color(255, 255, 255));
        PnumLbl.setText("Phone Number");

        LocTxt.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        LocTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));

        LocLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LocLbl.setForeground(new java.awt.Color(255, 255, 255));
        LocLbl.setText("Current Location");

        DangLbl.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        DangLbl.setForeground(new java.awt.Color(255, 255, 255));
        DangLbl.setText("Dangerous Level");

        DangCBox.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        DangCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Low", "Moderate", "High", "Very High" }));

        UpdateBtn.setBackground(new java.awt.Color(102, 252, 241));
        UpdateBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        CloseBtn.setBackground(new java.awt.Color(102, 252, 241));
        CloseBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        CloseBtn.setText("Close");
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });

        NameLbl3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        NameLbl3.setForeground(new java.awt.Color(255, 255, 255));
        NameLbl3.setText("All Cases");

        DangLbl1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        DangLbl1.setForeground(new java.awt.Color(255, 255, 255));
        DangLbl1.setText("Status");

        StatCBox.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        StatCBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Arrested", "Not Arrested" }));

        WitList.setMaximumSize(new java.awt.Dimension(200, 50));
        WitList.setMinimumSize(new java.awt.Dimension(200, 50));
        WitList.setPreferredSize(new java.awt.Dimension(200, 50));

        WitList.setViewportView(caseList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(AddressLbl)
                                .addGap(95, 95, 95)
                                .addComponent(AddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(LocLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(LocTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PnumLbl)
                                .addGap(37, 37, 37)
                                .addComponent(PnumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DangLbl1)
                                .addGap(122, 122, 122)
                                .addComponent(StatCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(IDLbl)
                                        .addGap(84, 84, 84)
                                        .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NameLbl1)
                                        .addGap(35, 35, 35)
                                        .addComponent(GenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NameLbl3)
                                        .addGap(18, 18, 18)
                                        .addComponent(WitList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NameLbl)
                                        .addGap(129, 129, 129)
                                        .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NameLbl2)
                                        .addGap(92, 92, 92)
                                        .addComponent(BDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(DangLbl)
                                        .addGap(18, 18, 18)
                                        .addComponent(DangCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDLbl)
                            .addComponent(NameLbl))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(NameLbl1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(GenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(NameLbl2))
                    .addComponent(BDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(NameLbl3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(DangLbl))
                    .addComponent(DangCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(WitList, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PnumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddressLbl)
                            .addComponent(PnumLbl))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(LocLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(LocTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(DangLbl1))
                    .addComponent(StatCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CloseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
                
        for (int i =0; i < CriminalList.size(); i++)
        {
            if (CriminalList.get(i) == criminal_data)
            {
                CriminalList.get(i).setPhone(PnumTxt.getText());
                CriminalList.get(i).setStatus(StatCBox.getSelectedItem().toString());
                CriminalList.get(i).setLocation(LocTxt.getText());
                CriminalList.get(i).setAddress(AddressTxt.getText());
                NowOff.update_criminal_info(CriminalList.get(i));
            }
        }
        NowOff.update_case(case_id);
        Fcase=new DisFullCase(case_id);
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f,"Criminal's info has been updated successfully");
           
        this.setVisible(false);
        this.getParent().setLayout(b);
        this.getParent().add(Fcase);
        OfficerForm.HomeBtn.setVisible(true);
        Fcase.setVisible(true);
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
        this.setVisible(false);
        this.getParent().setLayout(b);
        this.getParent().add(Fcase);
        OfficerForm.HomeBtn.setVisible(true);
        Fcase.setVisible(true);
    }//GEN-LAST:event_CloseBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLbl;
    public javax.swing.JTextField AddressTxt;
    public javax.swing.JTextField BDTxt;
    private javax.swing.JButton CloseBtn;
    public javax.swing.JComboBox DangCBox;
    private javax.swing.JLabel DangLbl;
    private javax.swing.JLabel DangLbl1;
    public javax.swing.JTextField GenderTxt;
    private javax.swing.JLabel IDLbl;
    public javax.swing.JTextField IDTxt;
    private javax.swing.JLabel LocLbl;
    public javax.swing.JTextField LocTxt;
    private javax.swing.JLabel NameLbl;
    private javax.swing.JLabel NameLbl1;
    private javax.swing.JLabel NameLbl2;
    private javax.swing.JLabel NameLbl3;
    public javax.swing.JTextField NameTxt;
    private javax.swing.JLabel PnumLbl;
    public javax.swing.JTextField PnumTxt;
    public javax.swing.JComboBox StatCBox;
    private javax.swing.JButton UpdateBtn;
    public javax.swing.JScrollPane WitList;
    public javax.swing.JList caseList;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
