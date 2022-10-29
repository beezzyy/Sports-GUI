import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class DateOutline {

	public static void Outline() {
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd");
		String dateOnly = dateFormat.format(currentDate);

		FileOutputStream p = null;
		try {
			p = new FileOutputStream("C:\\Users\\adirb\\SportsGUI\\Sports-GUI\\src\\Picks.txt", true);
			System.setOut(new PrintStream(p));
		} catch (FileNotFoundException e) {
			e.getMessage();
			System.exit(0);

		}

		JFrame outline = new JFrame("Outline");
		outline.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		outline.setLayout(new GridLayout(5, 10, 20, 20));
		outline.setSize(350, 350);

		JButton date = new JButton("Date");
		date.addActionListener(e -> System.out.println(":zap:VIP CARD " + dateOnly + ":zap:\n"));
		date.addActionListener(e -> outline.dispose());

		JButton everyone = new JButton("Everyone");
		everyone.addActionListener(e -> System.out.println("\n@everyone"));
		everyone.addActionListener(e -> outline.dispose());

		outline.add(date);
		outline.add(everyone);

		outline.setVisible(true);
		outline.setLocationRelativeTo(null);

	}

}
