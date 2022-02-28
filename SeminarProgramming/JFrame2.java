package hw1;

import java.util.Random;
import javax.swing.ImageIcon;

public class JFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form JFrame2
     */
    public JFrame2() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jToggleButton1.setText("Toss!");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jToggleButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jToggleButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton1.isSelected()) {
        Random rd = new Random();
        int random = rd.nextInt(6)+1;
        switch(random){
            case 1:
               
                jLabel1.setIcon(new ImageIcon(getClass().getResource("images/1Die.jpg")));

                break;
            case 2:
                
                jLabel1.setIcon(new ImageIcon(getClass().getResource("images/2Die.jpg")));

                break;
            case 3:
                
                jLabel1.setIcon(new ImageIcon(getClass().getResource("images/3Die.jpg")));

                break;
            case 4:
                
                jLabel1.setIcon(new ImageIcon(getClass().getResource("images/4Die.jpg")));

                break;
            case 5:
               
                jLabel1.setIcon(new ImageIcon(getClass().getResource("images/5Die.jpg")));

                break;
            case 6:
                
                jLabel1.setIcon(new ImageIcon(getClass().getResource("images/6Die.jpg")));

                break;
        }
        Random rd2=new Random();
        int random2 = rd2.nextInt(6)+1;
        switch(random2){
            case 1:
               
                jLabel2.setIcon(new ImageIcon(getClass().getResource("images/1Die.jpg")));

                break;
            case 2:
                
                jLabel2.setIcon(new ImageIcon(getClass().getResource("images/2Die.jpg"))); 

                break;
            case 3:
                
                jLabel2.setIcon(new ImageIcon(getClass().getResource("images/3Die.jpg")));

                break;
            case 4:
                
                jLabel2.setIcon(new ImageIcon(getClass().getResource("images/4Die.jpg")));

                break;
            case 5:
               
                jLabel2.setIcon(new ImageIcon(getClass().getResource("images/5Die.jpg"))); 

                break;
            case 6:
                
                jLabel2.setIcon(new ImageIcon(getClass().getResource("images/6Die.jpg")));

                break;
        }
        
        } else {
            
       
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
