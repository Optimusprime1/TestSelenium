
package components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBox extends JPanel
                          implements ActionListener {
    
	static String LeadTypeName;
	
    public ComboBox() {
        super(new BorderLayout());

        String[] LeadTypes = { "Family", "SME", "Corporate" };
        
        
        JComboBox LeadTypeList = new JComboBox(LeadTypes);
        LeadTypeList.setSelectedIndex(1);
        LeadTypeList.addActionListener(this);
        
        add(LeadTypeList, BorderLayout.PAGE_START);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        
        
        
    }

    /** Listens to the combo box. 
     * @return */
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
         LeadTypeName = (String)cb.getSelectedItem();
       
    }



    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("ComboBoxDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new ComboBox();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static String main() {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
                
            }
        });
		return LeadTypeName;
    }
}
