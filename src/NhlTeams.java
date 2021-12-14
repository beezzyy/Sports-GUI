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
			p = new FileOutputStream("src\\picks.txt", true);
			System.setOut(new PrintStream(p));
		} catch (FileNotFoundException e) {
			e.getMessage();
			System.exit(0);

		}

		JFrame nhl = new JFrame("NHL Teams");
		// nhl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		nhl.setLayout(new GridLayout(5, 10, 20, 20));

		JButton avalanche = new JButton("Avalanche");
		avalanche.addActionListener(e -> NhlTeams.mL("Avalanche"));

		JButton blackhawks = new JButton("Blackhawks");
		blackhawks.addActionListener(e -> NhlTeams.mL("Blackhawks"));

		JButton bluejackets = new JButton("Blue Jackets");
		bluejackets.addActionListener(e -> NhlTeams.mL("Blue Jackets"));

		JButton blues = new JButton("Blues");
		blues.addActionListener(e -> NhlTeams.mL("Blues"));

		JButton bruins = new JButton("Bruins");
		bruins.addActionListener(e -> NhlTeams.mL("Bruins"));

		JButton canadiens = new JButton("Canadiens");
		canadiens.addActionListener(e -> NhlTeams.mL("Canadiens"));

		JButton canucks = new JButton("Canucks");
		canucks.addActionListener(e -> NhlTeams.mL("Canucks"));

		JButton capitals = new JButton("Capitals");
		capitals.addActionListener(e -> NhlTeams.mL("Capitals"));

		JButton coyotes = new JButton("Coyotes");
		coyotes.addActionListener(e -> NhlTeams.mL("Coyotes"));

		JButton devils = new JButton("Devils");
		devils.addActionListener(e -> NhlTeams.mL("Devils"));

		JButton ducks = new JButton("Ducks");
		ducks.addActionListener(e -> NhlTeams.mL("Ducks"));

		JButton flames = new JButton("Flames");
		flames.addActionListener(e -> NhlTeams.mL("Flames"));

		JButton flyers = new JButton("Flyers");
		flyers.addActionListener(e -> NhlTeams.mL("Flyers"));

		JButton goldenknights = new JButton("GoldenKnights");
		goldenknights.addActionListener(e -> NhlTeams.mL("GoldenKnights"));

		JButton hurricanes = new JButton("Hurricanes");
		hurricanes.addActionListener(e -> NhlTeams.mL("Hurricanes"));

		JButton islanders = new JButton("Islanders");
		islanders.addActionListener(e -> NhlTeams.mL("Islanders"));

		JButton jets = new JButton("Jets");
		jets.addActionListener(e -> NhlTeams.mL("Jets"));

		JButton kings = new JButton("Kings");
		kings.addActionListener(e -> NhlTeams.mL("Kings"));

		JButton krakens = new JButton("Kraken");
		krakens.addActionListener(e -> NhlTeams.mL("Kraken"));

		JButton lightning = new JButton("Lightning");
		lightning.addActionListener(e -> NhlTeams.mL("Lightning"));

		JButton mapleleafs = new JButton("Maple Leafs");
		mapleleafs.addActionListener(e -> NhlTeams.mL("Maple Leafs"));

		JButton oilers = new JButton("Oilers");
		oilers.addActionListener(e -> NhlTeams.mL("Oilers"));

		JButton panthers = new JButton("Panthers");
		panthers.addActionListener(e -> NhlTeams.mL("Panthers"));

		JButton penguins = new JButton("Penguins");
		penguins.addActionListener(e -> NhlTeams.mL("Penguins"));

		JButton predators = new JButton("Predators");
		predators.addActionListener(e -> NhlTeams.mL("Predators"));

		JButton rangers = new JButton("Rangers");
		rangers.addActionListener(e -> NhlTeams.mL("Rangers"));

		JButton redwings = new JButton("Red Wings");
		redwings.addActionListener(e -> NhlTeams.mL("Red Wings"));

		JButton sabres = new JButton("Sabres");
		sabres.addActionListener(e -> NhlTeams.mL("Sabres"));

		JButton senators = new JButton("Senators");
		senators.addActionListener(e -> NhlTeams.mL("Senators"));

		JButton sharks = new JButton("Sharks");
		sharks.addActionListener(e -> NhlTeams.mL("Sharks"));

		JButton stars = new JButton("Stars");
		stars.addActionListener(e -> NhlTeams.mL("Stars"));

		JButton wild = new JButton("Wild");
		wild.addActionListener(e -> NhlTeams.mL("Wild"));

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
