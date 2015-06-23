import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class NumberThingy implements ActionListener {
	String Min;
	String Max;
	String Numb;
	int MinR;
	int MaxR;
	int NumbR;
	int RandNum;
	JFrame MainFrame = new JFrame("Number Thingy");
	JPanel MainPanel = new JPanel();
	JTextField Minimum = new JTextField(5);
	JTextField Maximum = new JTextField(5);
	JTextField Numbers = new JTextField(5);
	JButton ActivateButton = new JButton("Numberify");

	public static void main(String[] args) {
		NumberThingy Start = new NumberThingy();
		Start.StartUp();
	}

	public void StartUp() {
		MainFrame.add(MainPanel);
		MainPanel.add(Minimum);
		MainPanel.add(Maximum);
		MainPanel.add(Numbers);
		MainPanel.add(ActivateButton);
		ActivateButton.addActionListener(this);
		MainFrame.setVisible(true);
		MainFrame.pack();
	}

	public void actionPerformed(ActionEvent e) {
		Min = Minimum.getText();
		Max = Maximum.getText();
		Numb = Numbers.getText();
		MinR = Integer.parseInt(Min);
		MaxR = Integer.parseInt(Max);
		NumbR = Integer.parseInt(Numb);
		for (int I = 0; I < NumbR; I++) {
			RandNum = new Random().nextInt(MaxR - MinR);
			System.out.println(RandNum + MinR);
		}
	}
}
