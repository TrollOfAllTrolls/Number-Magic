import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GamblingMachine implements ActionListener {
	int Slot1N = 0;
	int Slot2N = 0;
	int Slot3N = 0;
	String Slot1NR;
	String Slot2NR;
	String Slot3NR;
	JFrame MainFrame = new JFrame("Slot Machine");
	JPanel MainPanel = new JPanel();
	JLabel Slot1 = new JLabel("0");
	JLabel Slot2 = new JLabel("0");
	JLabel Slot3 = new JLabel("0");
	JButton Gamble = new JButton("Gamble");

	public static void main(String[] args) {
		GamblingMachine Start = new GamblingMachine();
		Start.StartUp();
	}

	public void StartUp() {
		MainFrame.add(MainPanel);
		MainPanel.add(Slot1);
		MainPanel.add(Slot2);
		MainPanel.add(Slot3);
		MainPanel.add(Gamble);
		Gamble.addActionListener(this);
		MainFrame.setVisible(true);
		MainFrame.pack();
	}

	public void actionPerformed(ActionEvent e) {
		Slot1N = new Random().nextInt(3);
		Slot2N = new Random().nextInt(3);
		Slot3N = new Random().nextInt(3);
		Slot1NR = Integer.toString(Slot1N);
		Slot2NR = Integer.toString(Slot2N);
		Slot3NR = Integer.toString(Slot3N);
		Slot1.setText(Slot1NR);
		Slot2.setText(Slot2NR);
		Slot3.setText(Slot3NR);
		if (Slot1N == Slot2N && Slot2N == Slot3N) {
			System.out.println("You Win! Please Play Again!");
		}
	}
}
