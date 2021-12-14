import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import javax.swing.JTextField;

public class NflTeams {
	
public static void mL(String name){
		
		JFrame oddy = new JFrame("Odds");
//		oddy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oddy.setLayout(new GridLayout(5, 10, 20, 20));
		oddy.setSize(350,350);
		
		
		
		JButton ML = new JButton("ML");
		ML.addActionListener(e -> System.out.println(name+ " ML"));
		ML.addActionListener(e->oddy.dispose());
		
		JButton odd = new JButton("+");
//		String oddline = JOptionPane.showInputDialog("Odd line");
//
//		text.setName("+" + oddline);
		odd.addActionListener(e->System.out.println(name+" +"+JOptionPane.showInputDialog("Odd line")));
		odd.addActionListener(e->oddy.dispose());
		
		oddy.add(ML);
		oddy.add(odd);
		
	
		oddy.setVisible(true);
		oddy.setLocationRelativeTo(null);
		
	}
	
	
	
	public static void NflDisplay()
	{
		FileOutputStream p = null;
		try {
			p = new FileOutputStream("C:\\Users\\adirb\\UdemyCertificationCourse\\Buttons\\src\\picks.txt",true);
			System.setOut(new PrintStream(p));
		}catch(FileNotFoundException e){
			e.getMessage();
			System.exit(0);
			
		}
		
		
		JFrame nfl = new JFrame("NFL Teams");
//		nfl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nfl.setLayout(new GridLayout(5, 10, 20, 20));
		
		

		JButton fortyniners = new JButton("49ers");
		fortyniners.addActionListener(e -> NflTeams.mL("49ers"));

		JButton bears = new JButton("Bears");
		bears.addActionListener(e -> NflTeams.mL("Bears"));

		JButton bengals = new JButton("Bengals");
		bengals.addActionListener(e -> NflTeams.mL("Bengals"));

		JButton bills = new JButton("Bills");
		bills.addActionListener(e -> NflTeams.mL("Bills"));

		JButton broncos = new JButton("Broncos");
		broncos.addActionListener(e -> NflTeams.mL("Broncos"));
		
		JButton browns = new JButton("Browns");
		browns.addActionListener(e -> NflTeams.mL("Browns"));

		JButton buccaneers = new JButton("Buccaneers");
		buccaneers.addActionListener(e -> NflTeams.mL("Buccaneers"));

		JButton cardinals = new JButton("Cardinals");
		cardinals.addActionListener(e -> NflTeams.mL("Cardinals"));

		JButton chargers = new JButton("Chargers");
		chargers.addActionListener(e -> NflTeams.mL("Chargers"));

		JButton chiefs = new JButton("Chiefs");
		chiefs.addActionListener(e -> NflTeams.mL("Chiefs"));

		JButton colts = new JButton("Colts");
		colts.addActionListener(e -> NflTeams.mL("Colts"));

		JButton cowboys = new JButton("Cowboys");
		cowboys.addActionListener(e -> NflTeams.mL("Cowboys"));

		JButton dolphins = new JButton("Dolphins");
		dolphins.addActionListener(e -> NflTeams.mL("Dolphins"));
		
		JButton eagles = new JButton("Eagles");
		eagles.addActionListener(e -> NflTeams.mL("Eagles"));

		JButton falcons = new JButton("Falcons");
		falcons.addActionListener(e -> NflTeams.mL("Falcons"));

		JButton footballTeam = new JButton("Football Team");
		footballTeam.addActionListener(e -> NflTeams.mL("Football Team"));

		JButton giants = new JButton("Giants");
		giants.addActionListener(e -> NflTeams.mL("Giants"));

		JButton jaguars = new JButton("Jaguars");
		jaguars.addActionListener(e -> NflTeams.mL("Jaguars"));
		
		JButton jets = new JButton("Jets");
		jets.addActionListener(e -> NflTeams.mL("Jets"));

		JButton lions = new JButton("Lions");
		lions.addActionListener(e -> NflTeams.mL("Lions"));

		JButton packers = new JButton("Packers");
		packers.addActionListener(e -> NflTeams.mL("Packers"));

		JButton panthers = new JButton("Panthers");
		panthers.addActionListener(e -> NflTeams.mL("Panthers"));

		JButton patriots = new JButton("Patriots");
		patriots.addActionListener(e -> NflTeams.mL("Patriots"));

		JButton raiders = new JButton("Raiders");
		raiders.addActionListener(e -> NflTeams.mL("Raiders"));

		JButton rams = new JButton("Rams");
		rams.addActionListener(e -> NflTeams.mL("Rams"));

		JButton ravens = new JButton("Ravens");
		ravens.addActionListener(e -> NflTeams.mL("Ravens"));

		JButton saints = new JButton("Saints");
		saints.addActionListener(e -> NflTeams.mL("Saints"));

		JButton seahawks = new JButton("Seahawks");
		seahawks.addActionListener(e -> NflTeams.mL("Seahawks"));

		JButton steelers = new JButton("Steelers");
		steelers.addActionListener(e -> NflTeams.mL("Steelers"));

		JButton texans = new JButton("Texans");
		texans.addActionListener(e -> NflTeams.mL("Texans"));

		JButton titans = new JButton("Titans");
		titans.addActionListener(e -> NflTeams.mL("Titans"));
		
		JButton vikings = new JButton("Vikings");
		vikings.addActionListener(e -> NflTeams.mL("Vikings"));

		
		
		
		nfl.add(fortyniners);
		nfl.add(bears);
		nfl.add(bengals);
		nfl.add(bills);
		nfl.add(broncos);
		nfl.add(browns);
		nfl.add(buccaneers);
		nfl.add(cardinals);
		nfl.add(chargers);
		nfl.add(chiefs);
		nfl.add(colts);
		nfl.add(cowboys);
		nfl.add(dolphins);
		nfl.add(eagles);
		nfl.add(falcons);
		nfl.add(footballTeam);
		nfl.add(giants);
		nfl.add(jaguars);
		nfl.add(jets);
		nfl.add(lions);
		nfl.add(packers);
		nfl.add(panthers);
		nfl.add(raiders);
		nfl.add(patriots);
		nfl.add(raiders);
		nfl.add(rams);
		nfl.add(ravens);
		nfl.add(saints);
		nfl.add(seahawks);
		nfl.add(steelers);
		nfl.add(texans);
		nfl.add(titans);
		nfl.add(vikings);
		
		
		nfl.pack();
		nfl.setVisible(true);
		nfl.setLocationRelativeTo(null);
		
	}

}
