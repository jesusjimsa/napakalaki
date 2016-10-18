/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Napakalaki;

/**
 *
 * @author jaimefrias
 * @author jesusjimsa
 */
public class Prize {

	private int levels;
	private int treasures;

	Prize(int treasures, int levels) {
		this.levels = levels;
		this.treasures = treasures;
	}

	int getTreasures() {
		return treasures;
	}

	void setTreasures(int treasures) {
		this.treasures = treasures;
	}

	int getLevel() {
		return this.levels;
	}

	void setLevel(int levels) {
		this.levels = levels;
	}

	boolean winLevelsFrom(int lvl) {
		return levels > lvl;
	}

	@Override
	public String toString() {
		return "Treasures = " + Integer.toString(treasures) + " levels = " + Integer.toString(levels);
	}

}
