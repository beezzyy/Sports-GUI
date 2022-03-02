import java.awt.Desktop;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Menu {
	static File file = new File("C:\\Users\\adirb\\UdemyCertificationCourse\\Buttons\\src\\picks.txt");
	
	public static void menu() {
	JButton Outline, NHL, NBA, NFL,TXT;
	   
	Outline=new JButton("Outline");    
	NHL=new JButton("NHL");    
	NBA=new JButton("NBA"); 
	NFL =new JButton("NFL");
	TXT = new JButton("OPEN FILE");
	
	JFrame f = new JFrame("LBets Menu");  
	
	f.add(Outline);f.add(NHL);f.add(NBA);f.add(NFL);f.add(TXT);      
  
	f.setLayout(new GridLayout(5, 10, 20, 20));    
	f.setSize(400,400); 
	
	
	  
	Outline.addActionListener(e ->DateOutline.Outline());
	NHL.addActionListener(e ->NhlTeams.displayNHL());
	NBA.addActionListener(e->NbaTeams.displayNBA());
	NFL.addActionListener(e->NflTeams.NflDisplay());
	TXT.addActionListener(e->{
		try {
			Desktop.getDesktop().open(file);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});
	f.setVisible(true);  
	f.setLocationRelativeTo(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
