/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Napakalaki.Treasure;

/**
 *
 * @author jesusjimsa
 */
public class TreasureView extends javax.swing.JPanel {
	
	Treasure treasureModel;

	/**
	 * Creates new form TreasureView
	 */
	public TreasureView() {
		initComponents();
	}
	
	public void setTreasure(Treasure t) {
		
		treasureModel = t;
		String nameText = "<html>" + treasureModel.getName() + "</html>";
		treasureName.setText(nameText);
		
		String bonusText = Integer.toString(treasureModel.getBonus());
		bonusNumber.setText(bonusText);
		
		treasureKindName.setText(treasureModel.getType().toString());
		
		// treasureImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(treasureModel.getIcon)));
		
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bonusNumber = new javax.swing.JLabel();
        treasureName = new javax.swing.JLabel();
        treasureKindName = new javax.swing.JLabel();
        treasureImage = new javax.swing.JLabel();

        bonusNumber.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        bonusNumber.setForeground(new java.awt.Color(255, 255, 102));
        bonusNumber.setText("Bonus");

        treasureName.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        treasureName.setText("Nombre Tesoro");

        treasureKindName.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        treasureKindName.setText("jLabel2");

        treasureImage.setText("(FOTO)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(treasureImage, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(treasureName))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(treasureKindName)
                                .addComponent(bonusNumber)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(treasureName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(treasureKindName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bonusNumber)
                .addGap(18, 18, 18)
                .addComponent(treasureImage, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bonusNumber;
    private javax.swing.JLabel treasureImage;
    private javax.swing.JLabel treasureKindName;
    private javax.swing.JLabel treasureName;
    // End of variables declaration//GEN-END:variables
}
