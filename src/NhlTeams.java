import java.awt.GridLayout;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NhlTeams {

	public static void mL(String name) {

		JFrame oddy = new JFrame("Odds");
		// oddy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oddy.setLayout(new GridLayout(5, 10, 20, 20));
		oddy.setSize(350, 350);

		JButton ML = new JButton("ML");
		ML.addActionListener(e -> System.out.println(name + " ML"));
		ML.addActionListener(e -> oddy.dispose());

		JButton odd = new JButton("+1.5");
		odd.addActionListener(e -> System.out.println(name + " +1.5"));
		odd.addActionListener(e -> oddy.dispose());

		oddy.add(ML);
		oddy.add(odd);

		oddy.setVisible(true);
		oddy.setLocationRelativeTo(null);

	}

	public static void displayNHL() {
		FileOutputStream p = null;
		try {
			p = new FileOutputStream("C:\\Users\\adirb\\SportsGUI\\Sports-GUI\\src\\Picks.txt", true);
			System.setOut(new PrintStream(p));
		} catch (FileNotFoundException e) {
			e.getMessage();
			System.exit(0);

		}

		JFrame nhl = new JFrame("NHL Teams");
		// nhl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nhl.setLayout(new GridLayout(5, 10, 20, 20));

		JButton avalanche = new JButton("Avalanche");
		avalanche.addActionListener(e -> NhlTeams.mL(":hockey:Avalanche"));

		JButton blackhawks = new JButton("Blackhawks");
		blackhawks.addActionListener(e -> NhlTeams.mL(":hockey:Blackhawks"));

		JButton bluejackets = new JButton("Blue Jackets");
		bluejackets.addActionListener(e -> NhlTeams.mL(":hockey:Blue Jackets"));

		JButton blues = new JButton("Blues");
		blues.addActionListener(e -> NhlTeams.mL(":hockey:Blues"));

		JButton bruins = new JButton("Bruins");
		bruins.addActionListener(e -> NhlTeams.mL(":hockey:Bruins"));

		JButton canadiens = new JButton("Canadiens");
		canadiens.addActionListener(e -> NhlTeams.mL(":hockey:Canadiens"));

		JButton canucks = new JButton("Canucks");
		canucks.addActionListener(e -> NhlTeams.mL(":hockey:Canucks"));

		JButton capitals = new JButton("Capitals");
		capitals.addActionListener(e -> NhlTeams.mL(":hockey:Capitals"));

		JButton coyotes = new JButton("Coyotes");
		coyotes.addActionListener(e -> NhlTeams.mL(":hockey:Coyotes"));

		JButton devils = new JButton("Devils");
		devils.addActionListener(e -> NhlTeams.mL(":hockey:Devils"));

		JButton ducks = new JButton("Ducks");
		ducks.addActionListener(e -> NhlTeams.mL(":hockey:Ducks"));

		JButton flames = new JButton("Flames");
		flames.addActionListener(e -> NhlTeams.mL(":hockey:Flames"));

		JButton flyers = new JButton("Flyers");
		flyers.addActionListener(e -> NhlTeams.mL(":hockey:Flyers"));

		JButton goldenknights = new JButton("Golden Knights");
		goldenknights.addActionListener(e -> NhlTeams.mL(":hockey:Golden Knights"));

		JButton hurricanes = new JButton("Hurricanes");
		hurricanes.addActionListener(e -> NhlTeams.mL(":hockey:Hurricanes"));

		JButton islanders = new JButton("Islanders");
		islanders.addActionListener(e -> NhlTeams.mL(":hockey:Islanders"));

		JButton jets = new JButton("Jets");
		jets.addActionListener(e -> NhlTeams.mL(":hockey:Jets"));

		JButton kings = new JButton("Kings");
		kings.addActionListener(e -> NhlTeams.mL(":hockey:Kings"));

		JButton krakens = new JButton("Kraken");
		krakens.addActionListener(e -> NhlTeams.mL(":hockey:Kraken"));

		JButton lightning = new JButton("Lightning");
		lightning.addActionListener(e -> NhlTeams.mL(":hockey:Lightning"));

		JButton mapleleafs = new JButton("Maple Leafs");
		mapleleafs.addActionListener(e -> NhlTeams.mL(":hockey:Maple Leafs"));

		JButton oilers = new JButton("Oilers");
		oilers.addActionListener(e -> NhlTeams.mL(":hockey:Oilers"));

		JButton panthers = new JButton("Panthers");
		panthers.addActionListener(e -> NhlTeams.mL(":hockey:Panthers"));

		JButton penguins = new JButton("Penguins");
		penguins.addActionListener(e -> NhlTeams.mL(":hockey:Penguins"));

		JButton predators = new JButton("Predators");
		predators.addActionListener(e -> NhlTeams.mL(":hockey:Predators"));

		JButton rangers = new JButton("Rangers");
		rangers.addActionListener(e -> NhlTeams.mL(":hockey:Rangers"));

		JButton redwings = new JButton("Red Wings");
		redwings.addActionListener(e -> NhlTeams.mL(":hockey:Red Wings"));

		JButton sabres = new JButton("Sabres");
		sabres.addActionListener(e -> NhlTeams.mL(":hockey:Sabres"));

		JButton senators = new JButton("Senators");
		senators.addActionListener(e -> NhlTeams.mL(":hockey:Senators"));

		JButton sharks = new JButton("Sharks");
		sharks.addActionListener(e -> NhlTeams.mL(":hockey:Sharks"));

		JButton stars = new JButton("Stars");
		stars.addActionListener(e -> NhlTeams.mL(":hockey:Stars"));

		JButton wild = new JButton("Wild");
		wild.addActionListener(e -> NhlTeams.mL(":hockey:Wild"));

		nhl.add(avalanche);
		nhl.add(blackhawks);
		nhl.add(bluejackets);
		nhl.add(blues);
		nhl.add(bruins);
		nhl.add(canadiens);
		nhl.add(canucks);
		nhl.add(capitals);
		nhl.add(coyotes);
		nhl.add(devils);
		nhl.add(ducks);
		nhl.add(flames);
		nhl.add(flyers);
		nhl.add(goldenknights);
		nhl.add(hurricanes);
		nhl.add(islanders);
		nhl.add(jets);
		nhl.add(kings);
		nhl.add(krakens);
		nhl.add(lightning);
		nhl.add(mapleleafs);
		nhl.add(oilers);
		nhl.add(panthers);
		nhl.add(penguins);
		nhl.add(predators);
		nhl.add(rangers);
		nhl.add(redwings);
		nhl.add(sabres);
		nhl.add(senators);
		nhl.add(sharks);
		nhl.add(stars);
		nhl.add(wild);

		nhl.pack();
		nhl.setVisible(true);
		nhl.setLocationRelativeTo(null);

	}

}
