import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Menu {
	
	public static void menu() {
	JButton Outline, NHL, NBA, NFL;
	   
	Outline=new JButton("Outline");    
	NHL=new JButton("NHL");    
	NBA=new JButton("NBA"); 
	NFL =new JButton("NFL");
	
	JFrame f = new JFrame("LBets Menu");  
	
	f.add(Outline);f.add(NHL);f.add(NBA);f.add(NFL);     
  
	f.setLayout(new GridLayout(5, 10, 20, 20));    
	f.setSize(400,400); 
	
	
	  
	Outline.addActionListener(e ->DateOutline.Outline());
	NHL.addActionListener(e ->NhlTeams.displayNHL());
	NBA.addActionListener(e->NbaTeams.displayNBA());
	NFL.addActionListener(e->NflTeams.NflDisplay());
	f.setVisible(true);  
	f.setLocationRelativeTo(null);
	
	}
}
