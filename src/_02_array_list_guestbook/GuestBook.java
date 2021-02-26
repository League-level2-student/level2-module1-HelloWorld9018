package _02_array_list_guestbook;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	
	JButton buttonAdd = new JButton();
	JButton buttonView = new JButton();
	String newName = "";
	
	ArrayList<String> guestList = new ArrayList<String>();
		
		void createGUI() {
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			
			
			buttonAdd.setPreferredSize(new Dimension(150, 40 ));
			buttonView.setPreferredSize(new Dimension(150, 40));
			
			frame.setTitle("The One-way Hotel");
			buttonAdd.setText("Add Name");
			buttonView.setText("View Guest Book");
			
			frame.setVisible(true);
			frame.add(panel);
			panel.add(buttonAdd);
			panel.add(buttonView);
			
			frame.pack();
			
			buttonAdd.addActionListener(this);
			buttonView.addActionListener(this);
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton buttonClicked = (JButton) e.getSource();
			
			if(buttonClicked == buttonAdd) {
				System.out.println("Add Name button clicked");
				String input = JOptionPane.showInputDialog("Enter name: Last, First");
				guestList.add(input);
			}
			else if (buttonClicked == buttonView){
				System.out.println("Guest Book button clicked");
				System.out.println(guestList);
				
				newName = "";
				for (int i = 0; i<guestList.size(); i++) {
					
					
					newName += "Guest #" + (i+1) + ": " + guestList.get(i) + "\n";
					
					
				}
				System.out.println(newName);
			JOptionPane.showMessageDialog(null, newName);
				
			}
			
		}
		
	
	
}
