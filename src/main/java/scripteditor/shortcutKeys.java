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
 * shortcutKeys.java
 *
 * Created on May 13, 2007, 11:54 AM
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
 * @author  Ben
 */
public class shortcutKeys extends javax.swing.JDialog {
    
    /** Creates new form shortcutKeys */
    public shortcutKeys() {
        initComponents();
         addEscapeListener(this);//Added by preethy 
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Keyboard Shortcuts:");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });

        jEditorPane1.setEditable(false);
        jEditorPane1.setText("F1  =  Help Files\nF2  =  Information on keyboard shortcuts (displays contents of this box)\nctrl-B = SELECT SPECIES BY FAMILY\nctrl-F = SEARCH\nctrl-G = GROUP SELECTION\nctrl-L = LOAD (and run) A SCRIPT\nctrl-Q = TAKE A QUIZ\nctrl-R = TAXA SELECTION\nctrl-S = STUDY\nctrl-T =  TAKE A TEST\nctrl-V = View Progress\nEscape or ctrl-E = Exit a Study session \n");
        jScrollPane1.setViewportView(jEditorPane1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(175, 175, 175)
                        .add(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
// TODO add your handling code here:
    
    }//GEN-LAST:event_formMouseReleased

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
// TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
        // TODO add your handling code here:
         this.setVisible(false);
         this.dispose();
    }//GEN-LAST:event_jButton1KeyReleased
    
public static void addEscapeListener(final JDialog dialog) { 
    ActionListener escListener = new ActionListener() { 
        @Override       
        public void actionPerformed(ActionEvent e) { 
           //esc=true;
            dialog.setVisible(false);        }    }; 
    dialog.getRootPane().registerKeyboardAction(escListener,KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),JComponent.WHEN_IN_FOCUSED_WINDOW);
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
