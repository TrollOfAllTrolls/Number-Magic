import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class WhileTest implements ActionListener {
	int Var = 0;
	int Rand;
	JFrame MainFrame = new JFrame();
	JPanel MainPanel = new JPanel();
	JButton StartR = new JButton("Start");

	public static void main(String[] args) {
		WhileTest Start = new WhileTest();
		Start.StartUp();
	}

	public void StartUp() {
		MainFrame.add(MainPanel);
		MainPanel.add(StartR);
		StartR.addActionListener(this);
		MainFrame.setVisible(true);
		MainFrame.pack();

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == StartR) {
			Var = 1;
			while (Var == 1) {
				System.out.println(Rand = new Random().nextInt(9001));
			}
		}
	}
}
