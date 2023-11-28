import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

// Make new package if necessary
public class Main {
    public static void main(String[] args) {
        // UI
        JFrame frame = new JFrame();
        frame.setSize(500, 500);

        // Label for each patient
        JPanel dispPanel = new JPanel();

        String patientPanel = new String();
        Patient pat1 = new Patient("Daphne Von Oram", 62);
//        MRI mri1 = new MRI(2);
//        pat1.addMRI();
//        pat1.addBP();
        Patient pat2 = new Patient("Sebastian Compton", 31);

        ArrayList<Patient> patientList = new ArrayList<Patient>();
        patientList.add(pat1);
        patientList.add(pat2);

        ArrayList<String> imageList = new ArrayList<String>();
        imageList.add("https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
        imageList.add("https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg");


        for (Patient patient : patientList) {
            patientPanel = "Name: " + pat1.getFullName() + " Age " + pat1.getAge();
        }
        JLabel label = null;
        for (String url : imageList) {
            label = new JLabel();
            URL imageURL = null;
            try {
                imageURL = new URL(url);
            } catch (MalformedURLException e) {
                System.out.println(e.getMessage());
            }
            ImageIcon thisImageIcon = new ImageIcon(imageURL);
            label.setIcon(thisImageIcon);
        }


        JLabel label1 = new JLabel(patientPanel);
//        JLabel labelMRI = new JLabel(mri1);

        dispPanel.add(label1);
        dispPanel.add(label);
//        dispPanel.add(labelMRI);

        frame.setContentPane(dispPanel);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}