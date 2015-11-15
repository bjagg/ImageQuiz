/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * JStudyDialog.java
 *
 * Created on May 20, 2006, 4:50 PM
 */

package scripteditor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.KeyStroke;

/**
 *
 * @author  Moz123
 */
public class JStudyDialog extends javax.swing.JDialog{
    int result;
    double delayT;
    boolean canSet = false;
    int modeType;
    int mState;
     public static boolean esc=false;
    /** Creates new form JStudyDialog */
    public JStudyDialog(int mode, double delay, boolean scriptMode, int progState) {
        initComponents();//Added by preethy on 20/03/2012
        addEscapeListener(this); //Added by preethy on 20/03/2012          
        mState = progState;
//        this.tfDelayTime.setText(Double.toString(delay));
        this.jSlider1.setMinimum(1);
        this.jSlider1.setMaximum(40);
        jSlider1.setValue((int)(delay * 10));
        
        
//        if(scriptMode)
//        {
//            
//             this.lblScriptMode.setText("Yes");
//        }
//        else{
//            
//            this.lblScriptMode.setText("No");
//        }
        
        if(scriptMode){
            this.jSlider1.setEnabled(false); 
        }
        else{
            this.jSlider1.setEnabled(true);
            canSet = true;
        }
        
        
        if(progState == 3){
            cboMode.removeItemAt(0);
            if(mode < 2)
            this.cboMode.setSelectedIndex(mode-1);
            else if(mode >= 3){
               this.cboMode.setSelectedIndex(mode-2); 
            }
        }
        
        if(progState == 2){
            this.cboMode.setSelectedIndex(1);
        }
        
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        cboMode = new javax.swing.JComboBox();
        B_continue = new javax.swing.JButton();
        B_quit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabelDelay = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setTitle("Quiz / Test Options");
        setModal(true);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Mode select", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        cboMode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Image Naming With Prompt", "Image Naming Without Prompt", "Image Comparison", "Image Verification" }));
        cboMode.setSelectedIndex(1);

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(cboMode, 0, 239, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(cboMode, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        B_continue.setText("Continue");
        B_continue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B_continueKeyPressed(evt);
            }
        });
        B_continue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                B_continueMouseReleased(evt);
            }
        });

        B_quit.setText("Cancel");
        B_quit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                B_quitKeyPressed(evt);
            }
        });
        B_quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                B_quitMouseReleased(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Speed", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jSlider1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSlider1PropertyChange(evt);
            }
        });
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Image Display Time: (0.1 - 4 seconds)");

        jLabelDelay.setText("4.0");

        jLabel4.setText("More");

        jLabel3.setText("Less");

        jLabel5.setText("seconds");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                        .add(jLabelDelay)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel5)
                        .add(90, 90, 90))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel2)
                            .add(jSlider1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel4))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jLabel4)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 10, Short.MAX_VALUE)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel5)
                            .add(jLabelDelay))
                        .add(11, 11, 11))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel3)
                            .add(jSlider1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(51, 51, 51)
                        .add(B_continue)
                        .add(41, 41, 41)
                        .add(B_quit))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(new java.awt.Component[] {B_continue, B_quit}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(15, 15, 15)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(16, 16, 16)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(B_continue, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(B_quit, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        layout.linkSize(new java.awt.Component[] {B_continue, B_quit}, org.jdesktop.layout.GroupLayout.VERTICAL);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        double temp = jSlider1.getValue() * .1;
        String temps = String.valueOf(temp);
        jLabelDelay.setText(String.valueOf(temps.toCharArray(), 0, 3));
    }//GEN-LAST:event_jSlider1StateChanged

    private void jSlider1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSlider1PropertyChange

    }//GEN-LAST:event_jSlider1PropertyChange

    private void B_quitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B_quitKeyPressed
        result = 0;
        this.hide();
    }//GEN-LAST:event_B_quitKeyPressed

    private void B_continueKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B_continueKeyPressed
//  double testDelay = Double.parseDouble(tfDelayTime.getText());

        if(canSet)
        {
            delayT = jSlider1.getValue() * .1;             
            modeType = this.cboMode.getSelectedIndex();
        }
        
        result = 1;
        this.hide();
    }//GEN-LAST:event_B_continueKeyPressed
    public int getResults() { // Returns 0 for Quit or 1 for Continue
        return result;
    }
    
    public double getDelay() { // Will return the delay time (must be between .1 and 10 seconds)
        return delayT;
    }
    
    public int getMode() {
//        return modeType;
        
        return this.cboMode.getSelectedIndex() + 1;
    }
    private void B_quitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_quitMouseReleased
// TODO add your handling code here:
        result = 0;
        this.hide();
        
    }//GEN-LAST:event_B_quitMouseReleased

    private void B_continueMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_B_continueMouseReleased
// TODO add your handling code here:
//        double testDelay = Double.parseDouble(tfDelayTime.getText());
        
      
        
        if(canSet)
        {
           delayT = jSlider1.getValue() * .1; 
                 //modeType = this.cboMode.getSelectedIndex()+1;
           
        }
        
        result = 1;
        this.hide();
    }//GEN-LAST:event_B_continueMouseReleased
    public static void addEscapeListener(final JDialog dialog) { 
    ActionListener escListener = new ActionListener() { 
        @Override       
        public void actionPerformed(ActionEvent e) { 
          esc=true;
           
    dialog.setVisible(false);        }    }; 
    dialog.getRootPane().registerKeyboardAction(escListener,KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),JComponent.WHEN_IN_FOCUSED_WINDOW);
}
    
    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JStudyDialog().setVisible(true);
            }
        });
    }
    */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_continue;
    private javax.swing.JButton B_quit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cboMode;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDelay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables

}
