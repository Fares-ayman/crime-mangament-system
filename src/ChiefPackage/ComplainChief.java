package ChiefPackage;

import static LoginPackage.LoginForm.ComplainList;
import static LoginPackage.LoginForm.DepartmentList;
import static LoginPackage.LoginForm.OfficersList;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.sql.*;
import javax.swing.JOptionPane;

public class ComplainChief extends javax.swing.JPanel {

    DisComplain comp;
    OfficerChief officer;
    BorderLayout b;
    
    private void Panelss()
    {
   
        ScroolPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        comp = new DisComplain();
        for(int i = 0; i < ComplainList.size(); i++)
        {
            if (ComplainList.get(i).isComplain_bool() == true)
            {
                comp.IDTxt.setText(String.valueOf(ComplainList.get(i).getCompliain_id()));
                comp.jTextArea1.setText(ComplainList.get(i).getComplain_text());
                comp.DateTxt.setText(ComplainList.get(i).getComplain_date());
                
                for (int j = 0; j < OfficersList.size(); j++)
                {
                    if (ComplainList.get(i).getOfficer_id() == OfficersList.get(j).getID())
                    {
                        comp.NameTxt.setText(OfficersList.get(j).getName());
                        comp.RateTxt.setText(String.valueOf(OfficersList.get(j).getEvaluation()));
                        comp.StatTxt.setText(String.valueOf(OfficersList.get(j).getID()));
                        for (int k=0; k<DepartmentList.size(); k++)
                        {
                            int DepID = DepartmentList.get(k).getID();
                            if (OfficersList.get(j).getDepartment_ID() == DepID)
                            {
                                comp.DepTxt.setText(DepartmentList.get(k).getName());
                            }
                        }
                    }
                }
                ScroolPanel.add(comp);
            }
            
        }
   }
    
    public ComplainChief() {
        initComponents();
        
        Panelss();
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
        ScroolPanel = new javax.swing.JPanel();
        DoneBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(31, 40, 51));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        ScroolPanel.setBackground(new java.awt.Color(11, 12, 16));

        javax.swing.GroupLayout ScroolPanelLayout = new javax.swing.GroupLayout(ScroolPanel);
        ScroolPanel.setLayout(ScroolPanelLayout);
        ScroolPanelLayout.setHorizontalGroup(
            ScroolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1239, Short.MAX_VALUE)
        );
        ScroolPanelLayout.setVerticalGroup(
            ScroolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(ScroolPanel);

        DoneBtn.setBackground(new java.awt.Color(197, 198, 199));
        DoneBtn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        DoneBtn.setText("Done");
        DoneBtn.setBorder(null);
        DoneBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DoneBtn.setFocusable(false);
        DoneBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DoneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DoneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DoneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneBtnActionPerformed
        
// TODO add your handling code here:
        DoneBtn.setVisible(false);
        b = new BorderLayout();
        officer = new OfficerChief();
        
        this.setLayout(b);
        this.add(officer);
        jScrollPane1.setVisible(false);
        
        officer.setVisible(true);
       
    }//GEN-LAST:event_DoneBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton DoneBtn;
    private javax.swing.JPanel ScroolPanel;
    protected javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
