package main.lab3.SelectionPanel;

import main.lab3.main.DifficultyMode;

import javax.swing.*;

public class CharacterSelectionPanel extends JPanel implements SelectionPanel_IF {

    private DifficultyMode mode;

    public CharacterSelectionPanel(DifficultyMode mode) {
        this.mode = mode;
    }

    @Override
    public void paint() {
        switch (mode) {
            case BEGINNER -> paintBeginner();
            case INTERMEDIATE -> paintIntermediate();
            case ADVANCE -> paintAdvance();
        }
    }

    public void paintBeginner() {
        System.out.println("painting beginner character selection model");

    }

    public void paintIntermediate() {
        System.out.println("painting intermediate character selection model");
    }

    public void paintAdvance() {
        System.out.println("painting advance weapon character model");
    }
}
