/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Napakalaki.*;

/**
 *
 * @author jesusjimsa
 */
public class NapakalakiView extends javax.swing.JFrame {

	private Napakalaki napakalakiModel = new Napakalaki();
	private Player currentPlayer;
	private Monster currentMonster;

	public void setNapakalaki(Napakalaki napakalaki) {

		napakalakiModel = napakalaki;

		currentPlayer = napakalaki.getCurrentPlayer();
		playerView.setPlayer(currentPlayer);

		currentMonster = napakalaki.getCurrentMonster();
		monsterView.setMonster(currentMonster);

		playerView.setNapakalaki(napakalaki, this);

		// Se desactivan los botones al inicio
		nextTurnButton.setEnabled(false);
		combatButton.setEnabled(false);
		nextTurnButton.setEnabled(false);
		playerView.alterStealButton(false);

		repaint();
	}

	/**
	 * Creates new form NapakalakiView
	 */
	public NapakalakiView() {
		this.setTitle("NAPAKALAKI");
		initComponents();
		setLocationRelativeTo(null);    // Ventana centrada
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playerView = new GUI.PlayerView();
        monsterView = new GUI.MonsterView();
        meetMonsterButton = new javax.swing.JButton();
        nextTurnButton = new javax.swing.JButton();
        combatButton = new javax.swing.JButton();
        resultadoCombate = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(232, 254, 232));

        playerView.setBorder(new javax.swing.border.MatteBorder(null));

        monsterView.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        meetMonsterButton.setBackground(new java.awt.Color(255, 204, 153));
        meetMonsterButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        meetMonsterButton.setText("Ver monstruo");
        meetMonsterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meetMonsterButtonActionPerformed(evt);
            }
        });

        nextTurnButton.setBackground(new java.awt.Color(255, 153, 0));
        nextTurnButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        nextTurnButton.setText("Next turn");
        nextTurnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextTurnButtonActionPerformed(evt);
            }
        });

        combatButton.setBackground(new java.awt.Color(204, 0, 0));
        combatButton.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        combatButton.setText("Combat");
        combatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combatButtonActionPerformed(evt);
            }
        });

        resultadoCombate.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(playerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monsterView, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(meetMonsterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(nextTurnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(combatButton)
                            .addComponent(resultadoCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playerView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(monsterView, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultadoCombate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(meetMonsterButton)
                            .addComponent(combatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextTurnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	public void checkPendingBadConsequence() {
		if (!combatButton.isEnabled() && napakalakiModel.nextTurnAllowed()) {
			nextTurnButton.setEnabled(true);
		}
	}

	public void showView() {
		this.setVisible(true);
	}

    private void meetMonsterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meetMonsterButtonActionPerformed
		monsterView.showMonster();
		combatButton.setEnabled(true);
		meetMonsterButton.setEnabled(false);
		playerView.ChangeMakeVisibleButton(false);
    }//GEN-LAST:event_meetMonsterButtonActionPerformed

    private void nextTurnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextTurnButtonActionPerformed
		if (napakalakiModel.nextTurn()) {
			playerView.setPlayer(napakalakiModel.getCurrentPlayer());
			monsterView.setMonster(napakalakiModel.getCurrentMonster());
			meetMonsterButton.setEnabled(true);
			nextTurnButton.setEnabled(false);
			playerView.alterStealButton(false);
		}
		else {
			DialogView dialog = new DialogView(this, false);
			dialog.setDialog("Cumple el mal rollo antes de continuar");
			dialog.setVisible(true);
		}
    }//GEN-LAST:event_nextTurnButtonActionPerformed

    private void combatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combatButtonActionPerformed
		CombatResult combatResult = napakalakiModel.developCombat();
		DialogView dialog = new DialogView(this, true);

		switch (combatResult) {
			case WIN:
				dialog.setDialog("Has ganado el combate! :D");
				break;
			case LOSE:
				dialog.setDialog("Has perdido el combate T.T");
				break;
			case LOSEANDCONVERT:
				dialog.setDialog("Pierdes el combate y te conviertes en sectario :(");
				break;
			case WINGAME:
				dialog.setDialog("Has ganado el juego.\nBIEEEEEN!!");
				dialog.setVisible(true);
				System.exit(0);
				break;
		}
		
		dialog.setVisible(true);
		playerView.setPlayer(napakalakiModel.getCurrentPlayer());
		combatButton.setEnabled(false);
		playerView.alterStealButton(true);
		nextTurnButton.setEnabled(true);
    }//GEN-LAST:event_combatButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton combatButton;
    private javax.swing.JButton meetMonsterButton;
    private GUI.MonsterView monsterView;
    private javax.swing.JButton nextTurnButton;
    private GUI.PlayerView playerView;
    private javax.swing.JLabel resultadoCombate;
    // End of variables declaration//GEN-END:variables
}