import java.awt.GridLayout;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.PrintStream;
//import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import javax.swing.JTextField;

public class NbaTeams {

	public static void mL(String name) {

		JFrame oddy = new JFrame("Odds");
		// oddy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oddy.setLayout(new GridLayout(5, 10, 20, 20));
		oddy.setSize(350, 350);

		// JTextField text = new JTextField();

		JButton ML = new JButton("ML");
		ML.addActionListener(e -> System.out.println(name + " ML"));
		ML.addActionListener(e -> oddy.dispose());

		JButton odd = new JButton("+");
		// String oddline = JOptionPane.showInputDialog("Odd line");
		//
		// text.setName("+" + oddline);
		odd.addActionListener(e -> System.out.println(name + " +" + JOptionPane.showInputDialog("Odd line")));
		odd.addActionListener(e -> oddy.dispose());

		oddy.add(ML);
		oddy.add(odd);

		oddy.setVisible(true);
		oddy.setLocationRelativeTo(null);

	}

	public static void displayNBA() {
		FileOutputStream p = null;
		try {
			p = new FileOutputStream("C:\\Users\\adirb\\SportsGUI\\Sports-GUI\\src\\Picks.txt", true);
			System.setOut(new PrintStream(p));
		} catch (FileNotFoundException e) {
			e.getMessage();
			System.exit(0);

		}

		JFrame nba = new JFrame("NBA Teams");
		// nba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nba.setLayout(new GridLayout(5, 10, 20, 20));

		JButton philly = new JButton("76ers");
		philly.addActionListener(e -> NbaTeams.mL(":basketball:76ers"));

		JButton hawks = new JButton("Hawks");
		hawks.addActionListener(e -> NbaTeams.mL(":basketball:Hawks"));

		JButton wizards = new JButton("Wizards");
		wizards.addActionListener(e -> NbaTeams.mL(":basketball:Wizards"));

		JButton cavaliers = new JButton("Cavaliers");
		cavaliers.addActionListener(e -> NbaTeams.mL(":basketball:Cavaliers"));

		JButton pistons = new JButton("Pistons");
		pistons.addActionListener(e -> NbaTeams.mL(":basketball:Pistons"));

		JButton pacers = new JButton("Pacers");
		pacers.addActionListener(e -> NbaTeams.mL(":basketball:Pacers"));

		JButton raptors = new JButton("Raptors");
		raptors.addActionListener(e -> NbaTeams.mL(":basketball:Raptors"));

		JButton bucks = new JButton("Bucks");
		bucks.addActionListener(e -> NbaTeams.mL(":basketball:Bucks"));

		JButton mavericks = new JButton("Mavericks");
		mavericks.addActionListener(e -> NbaTeams.mL(":basketball:Mavericks"));

		JButton nuggets = new JButton("Nuggets");
		nuggets.addActionListener(e -> NbaTeams.mL(":basketball:Nuggets"));

		JButton grizzlies = new JButton("Grizzlies");
		grizzlies.addActionListener(e -> NbaTeams.mL(":basketball:Grizzlies"));

		JButton timberwolves = new JButton("Timberwolves");
		timberwolves.addActionListener(e -> NbaTeams.mL(":basketball:Timberwolves"));

		JButton spurs = new JButton("Spurs");
		spurs.addActionListener(e -> NbaTeams.mL(":basketball:Spurs"));

		JButton jazz = new JButton("Jazz");
		jazz.addActionListener(e -> NbaTeams.mL(":basketball:Jazz"));

		JButton clippers = new JButton("Clippers");
		clippers.addActionListener(e -> NbaTeams.mL(":basketball:Clippers"));

		JButton suns = new JButton("Suns");
		suns.addActionListener(e -> NbaTeams.mL(":basketball:Suns"));

		JButton trail = new JButton("Trail Blazers");
		trail.addActionListener(e -> NbaTeams.mL(":basketball:Trail Blazers"));

		JButton kings = new JButton("Kings");
		kings.addActionListener(e -> NbaTeams.mL(":basketball:Kings"));

		JButton knicks = new JButton("Knicks");
		knicks.addActionListener(e -> NbaTeams.mL(":basketball:Knicks"));

		JButton pelicans = new JButton("Pelicans");
		pelicans.addActionListener(e -> NbaTeams.mL(":basketball:Pelicans"));

		JButton hornets = new JButton("Hornets");
		hornets.addActionListener(e -> NbaTeams.mL(":basketball:Hornets"));

		JButton rockets = new JButton("Rockets");
		rockets.addActionListener(e -> NbaTeams.mL(":basketball:Rockets"));

		JButton heat = new JButton("Heat");
		heat.addActionListener(e -> NbaTeams.mL(":basketball:Heat"));

		JButton bulls = new JButton("Bulls");
		bulls.addActionListener(e -> NbaTeams.mL(":basketball:Bulls"));

		JButton nets = new JButton("Nets");
		nets.addActionListener(e -> NbaTeams.mL(":basketball:Nets"));

		JButton thunder = new JButton("Thunder");
		thunder.addActionListener(e -> NbaTeams.mL(":basketball:Thunder"));

		JButton warrior = new JButton("Warriors");
		warrior.addActionListener(e -> NbaTeams.mL(":basketball:Warriors"));

		JButton celtics = new JButton("Celtics");
		celtics.addActionListener(e -> NbaTeams.mL(":basketball:Celtics"));

		JButton lakers = new JButton("Lakers");
		lakers.addActionListener(e -> NbaTeams.mL(":basketball:Lakers"));

		JButton magic = new JButton("Magic");
		magic.addActionListener(e -> NbaTeams.mL(":basketball:Magic"));

		nba.add(philly);
		nba.add(bucks);
		nba.add(bulls);
		nba.add(cavaliers);
		nba.add(celtics);
		nba.add(clippers);
		nba.add(grizzlies);
		nba.add(hawks);
		nba.add(heat);
		nba.add(hornets);
		nba.add(jazz);
		nba.add(kings);
		nba.add(knicks);
		nba.add(lakers);
		nba.add(magic);
		nba.add(mavericks);
		nba.add(nets);
		nba.add(nuggets);
		nba.add(pacers);
		nba.add(pelicans);
		nba.add(pistons);
		nba.add(raptors);
		nba.add(rockets);
		nba.add(spurs);
		nba.add(suns);
		nba.add(thunder);
		nba.add(timberwolves);
		nba.add(trail);
		nba.add(warrior);
		nba.add(wizards);

		nba.pack();
		nba.setVisible(true);
		nba.setLocationRelativeTo(null);

	}

}
