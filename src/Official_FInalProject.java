import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;

public class Official_FInalProject {
	public static void main(String[]args) {
		new Start();
	}
}

class Start{
	private JFrame mainFrame;
	private JPanel startPanel, btnsPanel, footerPanel;
	private JLabel homeLabel, ambulanceLabel;
	private JButton continueBtn, exitBtn;
	//Starting class
	public Start() {
		mainFrame = new JFrame("Emergency Response Analysis");
		mainFrame.setSize(700,400);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(new BorderLayout());
		
		ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\logo.png");
		mainFrame.setIconImage(icon.getImage());
		
		startPanel = new JPanel(new BorderLayout());
		startPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 0, 0));
		startPanel.setBackground(Color.decode("#343A40"));
		
		homeLabel = new JLabel();
		homeLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\home bg.png"));
				
		btnsPanel = new JPanel(new FlowLayout());
		btnsPanel.setBackground(Color.decode("#343A40"));
		//Proceeds to the disaster class
		continueBtn = new JButton("Proceed");
		continueBtn.setFocusPainted(false); 
		continueBtn.setBackground(Color.decode("#28A745"));
		continueBtn.setForeground(Color.white);
		
		continueBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new Disaster();
				mainFrame.dispose();
			}
			
		});
		//Exits the program
		exitBtn = new JButton("Exit");
		exitBtn.setBackground(Color.decode("#DC3545"));
		exitBtn.setForeground(Color.white);
		
		exitBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		btnsPanel.add(continueBtn);
		btnsPanel.add(exitBtn);
		
		startPanel.add(homeLabel, BorderLayout.NORTH);
		startPanel.add(btnsPanel, BorderLayout.CENTER);
		
		footerPanel = new JPanel(new BorderLayout());
		footerPanel.setBackground(Color.decode("#343A40"));
		
		ambulanceLabel = new JLabel();
		ambulanceLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\ambulance gif.gif"));
		
		footerPanel.add(ambulanceLabel, BorderLayout.WEST);
		
		mainFrame.add(startPanel, BorderLayout.NORTH);
		mainFrame.add(footerPanel, BorderLayout.SOUTH);
			
		mainFrame.setVisible(true);
	}
}

class Disaster {
    private JFrame disasterFrame;
    private JPanel mainPanel, headerPanel, contentPanel, userInputPanel, footerPanel, footerBtns, backPanel, proceedPanel, populationPanel, disasterPanel, disasterChoicePanel, magnitudePanel, resultPanel;
    private JLabel ambulanceLabel, headerLabel, disasterTypeLabel, populationLabel, resultLabel, magnitudeLabel;
    private Choice disasterTypeChoice, magnitudeChoice;
    private JTextField populationField;
    private JButton backBtn, analyzeButton, aboutUsBtn, hotlineBtn, instructionsBtn;
    //Disaster class which is also the main menu
    public Disaster() {
        disasterFrame = new JFrame("Emergency Response Analysis");
        disasterFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);;
        disasterFrame.setLocationRelativeTo(null);
        disasterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        disasterFrame.setLayout(new BorderLayout());
        
        ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\logo.png");
		disasterFrame.setIconImage(icon.getImage());
        
        mainPanel = new JPanel(new BorderLayout()); 
        
        headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(Color.decode("#343A40"));
               
        headerLabel = new JLabel();
        headerLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\title and logo.png"));
        headerLabel.setBorder(BorderFactory.createEmptyBorder(0, 400, 0, 0));
        
        backPanel = new JPanel(new BorderLayout());
        backPanel.setBackground(Color.decode("#343A40"));
        backPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        //Back button that is directed back at the starting class
        backBtn = new JButton();
        backBtn.setContentAreaFilled(false);
        backBtn.setOpaque(false);
        backBtn.setBorderPainted(false);
        backBtn.setFocusPainted(false); 
        backBtn.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\icons8-go-back-50.png"));
        backBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new Start();
				disasterFrame.dispose();
			}
			
		});
        
        backPanel.add(backBtn, BorderLayout.WEST);
        
        headerPanel.add(backPanel, BorderLayout.NORTH);
        headerPanel.add(headerLabel, BorderLayout.CENTER);
        
        contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBackground(Color.decode("#343A40"));
        //The panel where the user inputs the information
        userInputPanel = new JPanel(new BorderLayout());

        populationPanel = new JPanel(new FlowLayout());
        populationPanel.setBackground(Color.decode("#343A40"));
        
        populationLabel = new JLabel("Population affected: ");
        populationLabel.setForeground(Color.white);
        populationLabel.setFont(new Font("Calibri", Font.PLAIN, 24));
        
        populationField = new JTextField(9);
        populationField.setFont(new Font("Calibri", Font.PLAIN, 18));
        
        populationPanel.add(populationLabel);
        populationPanel.add(populationField);

        disasterPanel = new JPanel(new GridLayout(2,2,0,0));
        
        disasterChoicePanel = new JPanel(new FlowLayout());
        disasterChoicePanel.setBackground(Color.decode("#343A40"));
        
        disasterTypeLabel = new JLabel("Kind of Natural Disaster: ");
        disasterTypeLabel.setForeground(Color.white);
        disasterTypeLabel.setFont(new Font("Calibri", Font.PLAIN, 24));
        
        disasterTypeChoice = new Choice();
        disasterTypeChoice.setFont(new Font("Calibri", Font.PLAIN, 18));
        
        disasterTypeChoice.add("------Disasters------");
        disasterTypeChoice.add("Tropical Cyclones");
        disasterTypeChoice.add("Floods");
        disasterTypeChoice.add("Storm Surges");
        disasterTypeChoice.add("Earthquake");
        disasterTypeChoice.add("Volcanic Eruptions");
        disasterTypeChoice.add("Landslides");
        disasterTypeChoice.add("Tsunami");
        disasterChoicePanel.add(disasterTypeLabel);
        disasterChoicePanel.add(disasterTypeChoice);

        magnitudePanel = new JPanel(new FlowLayout());
        magnitudePanel.setBackground(Color.decode("#343A40"));

        disasterTypeChoice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    updateMagnitudePanel(e.getItem().toString());
                }
            }
        });

        proceedPanel = new JPanel(new FlowLayout());
        proceedPanel.setBackground(Color.decode("#343A40"));
        
        analyzeButton = new JButton("Analyze");
        analyzeButton.setBackground(Color.decode("#28A745"));
        analyzeButton.setForeground(Color.white);
        analyzeButton.setFont(new Font("Calibri", Font.PLAIN, 18));
        analyzeButton.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\icons8-analysis-24.png"));

        analyzeButton.addActionListener(new AnalyzeButtonListener());
        
        proceedPanel.add(analyzeButton);
        
        resultPanel = new JPanel(new FlowLayout());
        resultPanel.setBackground(Color.decode("#343A40"));

        disasterPanel.add(disasterChoicePanel);
        disasterPanel.add(magnitudePanel);

        userInputPanel.add(populationPanel, BorderLayout.NORTH);
        userInputPanel.add(disasterPanel, BorderLayout.CENTER);
        userInputPanel.add(proceedPanel, BorderLayout.SOUTH);
        
        contentPanel.add(userInputPanel, BorderLayout.NORTH);
        contentPanel.add(resultPanel, BorderLayout.CENTER);
        //Footer panel which contains different button that accesses different class
        footerPanel = new JPanel(new BorderLayout());
        footerPanel.setBackground(Color.decode("#343A40"));
        
        ambulanceLabel = new JLabel();
		ambulanceLabel.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\ambulance gif.gif"));
        
		footerBtns = new JPanel(new FlowLayout());
		footerBtns.setBackground(Color.decode("#343A40"));
		footerBtns.setBorder(BorderFactory.createEmptyBorder(0, 850, 10, 0));
		
        aboutUsBtn = new JButton("About Us");
        aboutUsBtn.setBackground(Color.decode("#28A745"));
        aboutUsBtn.setForeground(Color.white);
        aboutUsBtn.setFont(new Font("Calibri", Font.PLAIN, 18));
        aboutUsBtn.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\icons8-about-us-50.png"));
        
        aboutUsBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new AboutUs();
				disasterFrame.dispose();
			}
			
		});
        
        hotlineBtn = new JButton("Emergency Hotline");
        hotlineBtn.setBackground(Color.decode("#F0AD4E"));
        hotlineBtn.setForeground(Color.white);
        hotlineBtn.setFont(new Font("Calibri", Font.PLAIN, 18));
        hotlineBtn.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\icons8-hotline-50.png"));
        hotlineBtn.addActionListener(e -> new Hotline());
        
        instructionsBtn = new JButton("Instructions");
        instructionsBtn.setBackground(Color.decode("#D9534F"));
        instructionsBtn.setForeground(Color.white);
        instructionsBtn.setFont(new Font("Calibri", Font.PLAIN, 18));
        instructionsBtn.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\icons8-instructions-50.png"));
        instructionsBtn.addActionListener(e -> new Instructions());
        
        footerBtns.add(aboutUsBtn);
        footerBtns.add(hotlineBtn);
        footerBtns.add(instructionsBtn);
        
        footerPanel.add(ambulanceLabel, BorderLayout.WEST);
        footerPanel.add(footerBtns, BorderLayout.SOUTH);

        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(contentPanel, BorderLayout.CENTER);
        mainPanel.add(footerPanel, BorderLayout.SOUTH);
        
        disasterFrame.add(mainPanel, BorderLayout.CENTER);

        disasterFrame.setVisible(true);
    }
    //This updates the magnitude panel which does not contain anything initially
    private void updateMagnitudePanel(String disasterType) {
        magnitudePanel.removeAll();

        magnitudeLabel = new JLabel();
        magnitudeLabel.setForeground(Color.white);
        magnitudeLabel.setFont(new Font("Calibri", Font.PLAIN, 24));

        magnitudeChoice = new Choice();
        magnitudeChoice.setFont(new Font("Calibri", Font.PLAIN, 18));


        switch (disasterType) {
            case "Tropical Cyclones":
                magnitudeLabel.setText("Intensity of the Tropical Cyclone: ");
                magnitudeChoice.add("1. Tropical Cyclone Warning Signal no.1 (30-60 km/h winds)");
                magnitudeChoice.add("2. Tropical Cyclone Warning Signal no.2 (61-120 km/h winds)");
                magnitudeChoice.add("3. Tropical Cyclone Warning Signal no.3 (121-170 km/h winds)");
                magnitudeChoice.add("4. Tropical Cyclone Warning Signal no.4 (171-220 km/h winds)");
                magnitudeChoice.add("5. Tropical Cyclone Warning Signal no.5 (Over 220 km/h winds)");
                break;
            case "Floods":
                magnitudeLabel.setText("Magnitude of the Flooding: ");
                magnitudeChoice.add("1. Low-level Flooding - Minor flooding affecting low-lying areas.");
                magnitudeChoice.add("2. Moderate-level Flooding - Widespread flooding affecting low-lying areas.");
                magnitudeChoice.add("3. High-level Flooding - Extensive and severe flooding in low-lying areas.");
                magnitudeChoice.add("4. Flash Flooding - Rapid and intense flooding, often caused by heavy rainfall.");
                break;
            case "Storm Surges":
                magnitudeLabel.setText("Magnitude of the Storm Surges: ");
                magnitudeChoice.add("1. Low-level Storm Surges - Up to 1 meter (3.28 feet)");
                magnitudeChoice.add("2. Moderate-level Storm Surges - 1 to 2 meters (3.28 to 6.56 feet)");
                magnitudeChoice.add("3. High-level Storm Surges - 2 to 3 meters (6.56 to 9.84 feet)");
                magnitudeChoice.add("4. Very High-Level Storm Surge - Over 3 meters (9.84 feet)");
                break;
            case "Earthquake":
                magnitudeLabel.setText("Magnitude of the Earthquake: ");
                magnitudeChoice.add("1. Minor Earthquake - Below 4.0");
                magnitudeChoice.add("2. Light Earthquake - 4.0 to 4.9");
                magnitudeChoice.add("3. Moderate Earthquake - 5.0 to 5.9");
                magnitudeChoice.add("4. Strong Earthquake - 6.0 to 6.9");
                magnitudeChoice.add("5. Major Earthquake - 7.0 to 7.9");
                magnitudeChoice.add("6. Great Earthquake - 8.0 and above");
                break;
            case "Volcanic Eruptions":
                magnitudeLabel.setText("Magnitude of the Volcanic Eruptions: ");
                magnitudeChoice.add("1. Minor Activity - Low-level volcanic activity with minimal threat.");
                magnitudeChoice.add("2. Moderate Activity - Increased volcanic activity with potential ash emission.");
                magnitudeChoice.add("3. Significant Activity - Eruption with ash plumes and potential lava flow.");
                magnitudeChoice.add("4. Major Eruption - Violent eruption with widespread ashfall and lava flow.");
                magnitudeChoice.add("5. Catastrophic Eruption - Massive eruption with severe impact on the surrounding area.");
                break;
            case "Landslides":
                magnitudeLabel.setText("Magnitude of the Landslides: ");
                magnitudeChoice.add("1. Minor Landslide - Limited soil movement with minimal impact.");
                magnitudeChoice.add("2. Moderate Landslide - Increased soil movement with potential property damage.");
                magnitudeChoice.add("3. Significant Landslide - Extensive soil movement with risk to structures.");
                magnitudeChoice.add("4. Major Landslide - Severe soil movement causing widespread damage.");
                magnitudeChoice.add("5. Catastrophic Landslide - Massive soil movement with devastating impact on the area.");
                break;
            case "Tsunami":
                magnitudeLabel.setText("Magnitude of the Tsunami: ");
                magnitudeChoice.add("1. Minor Tsunami - Low-level tsunami with minimal coastal impact.");
                magnitudeChoice.add("2. Moderate Tsunami - Increased wave height with potential flooding.");
                magnitudeChoice.add("3. Significant Tsunami - Higher waves causing extensive coastal flooding.");
                magnitudeChoice.add("4. Major Tsunami - Destructive waves with severe coastal inundation.");
                magnitudeChoice.add("5. Catastrophic Tsunami - Massive waves causing widespread devastation.");
                break;
        }

        magnitudePanel.add(magnitudeLabel);
        magnitudePanel.add(magnitudeChoice);
        magnitudePanel.revalidate();
        magnitudePanel.repaint();
    }
    //This is activated when the analyze button is pressed and shows the results
    private class AnalyzeButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String populationText = populationField.getText();
                int populationIdentifier = popuIdentifier(populationText);
                String population = populationString(populationIdentifier);
                String selectedMagnitude = magnitudeChoice.getSelectedItem();
                int magnitudeIdentifier = magniIdentifier(selectedMagnitude);

                String alertMessage = "";

                String result = "";
                switch (magnitudeIdentifier) {
                    case 1:
                        alertMessage = BlueAlert();
                        result = population.concat(alertMessage);
                        break;
                    case 2:
                        alertMessage = YellowAlert();
                        result = population.concat(alertMessage);
                        break;
                    case 3:
                    case 4:
                        alertMessage = OrangeAlert();
                        result = population.concat(alertMessage);
                        break;
                    case 5:
                    case 6:
                        alertMessage = RedAlert();
                        result = population.concat(alertMessage);
                        break;
                    default:
                        alertMessage = "Invalid Magnitude";
                        JOptionPane.showMessageDialog(null, alertMessage, "Input Error", JOptionPane.ERROR_MESSAGE);
                        return;
                }

                if (resultLabel != null) {
                    resultPanel.remove(resultLabel);
                }

                resultLabel = new JLabel("<html>" + result.replace("\n", "<br>") + "</html>");
                resultLabel.setForeground(Color.white);
                resultLabel.setFont(new Font("Calibri", Font.PLAIN, 20));
                resultPanel.add(resultLabel);

                resultPanel.revalidate();
                resultPanel.repaint();

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Please enter a valid population number.", "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    //Identifies the degree of population size
    public static int popuIdentifier(String populationField) {
        int size = Integer.parseInt(populationField);

        if (size <= 1000) {
            return 1;
        } else if ((size > 1000) && (size <= 5000)) {
            return 2;
        } else if ((size > 5000) && (size <= 10000)) {
            return 3;
        } else if (size > 10000) {
            return 4;
        } else {
            return 0;
        }
    }
    //The string population impact is identified using the degree of population size
    public static String populationString(int popuIdentifier) {
        switch (popuIdentifier) {
            case 1:
                return "==================================================================\n"
                        + "Low Population Impact - ";
            case 2:
                return "==================================================================\n"
                        + "Moderate Population Impact - ";
            case 3:
                return "==================================================================\n"
                        + "High Population Impact - ";
            case 4:
                return "==================================================================\n"
                        + "Very High Population Impact - ";
            default:
                return "Invalid Population";
        }
    }
    //Identifies the magnitude level of the disaster
    public static int magniIdentifier(String magnitudeChoice) {
        String substring = magnitudeChoice.substring(0, 1);
        return Integer.parseInt(substring);
    }

    public static String BlueAlert() {
        return ("Blue Alert (Preparedness)"
                + "\nResource Allocation:"
                + "\n• Activate early warning."
                + "\n• Mobilizing communications and information dissemination teams."
                + "\n• Conduct public awareness campaigns."
                + "\n==================================================================\n");
    }

    public static String YellowAlert() {
        return ("Yellow Alert (Preparedness)"
                + "\nResource Allocation:"
                + "\n• Preposition emergency supplies and equipment."
                + "\n• Activate local emergency response teams."
                + "\n• Conduct evacuation drills and readiness assessments."
                + "\n==================================================================\n");
    }

    public static String OrangeAlert() {
        return ("Orange Alert (Response)"
                + "\nResource Allocation:"
                + "\n• Deploy search and rescue teams."
                + "\n• Activate medical response teams."
                + "\n• Establish emergency shelters."
                + "\n• Initiate mass evacuation procedures."
                + "\n==================================================================\n");
    }

    public static String RedAlert() {
        return ("Red Alert (Full Response)"
                + "\nResource Allocation:"
                + "\n• Mobilize national and regional disaster response teams."
                + "\n• Activate medical facilities and field hospitals."
                + "\n• Request support from military and other relevant agencies."
                + "\n• Implement full-scale evacuation and relief operations."
                + "\n==================================================================\n");
    }
}

class AboutUs{
	private JFrame accountFrame;
	private JPanel mainPanel, titleBar, content, aboutUSPanel, creatorPanel;
	private JLabel title, mission, vision, creatorImg, creatorDescription;
	private JButton backBtn;
	//About us class which contains developer information, mission and vision
	public AboutUs() {
		accountFrame = new JFrame("About Us");
		accountFrame.setSize(1100,700);
		accountFrame.setLocationRelativeTo(null);
		accountFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		accountFrame.setLayout(new BorderLayout());	
		
		ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\logo.png");
		accountFrame.setIconImage(icon.getImage());
		
		mainPanel = new JPanel(new BorderLayout());
		
		titleBar = new JPanel(new BorderLayout());
		titleBar.setBackground(Color.decode("#28A745"));
		
		title = new JLabel("<html><p>About Us</p></html>", JLabel.CENTER);
		title.setForeground(Color.white);
		title.setFont(new Font("Calibri", Font.BOLD, 30));
		title.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 100));
		
		backBtn = new JButton();
        backBtn.setContentAreaFilled(false);
        backBtn.setOpaque(false);
        backBtn.setBorderPainted(false);
        backBtn.setFocusPainted(false); 
        backBtn.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\icons8-go-back-50.png"));
        backBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				new Disaster();
				accountFrame.dispose();
			}
			
		});
		
        titleBar.add(backBtn, BorderLayout.WEST);
		titleBar.add(title, BorderLayout.CENTER);
		
		content = new JPanel(new BorderLayout());
		content.setBackground(Color.decode("#343A40"));
		
		aboutUSPanel = new JPanel(new GridLayout(2,1,1,1));
		aboutUSPanel.setBackground(Color.decode("#343A40"));
		aboutUSPanel.setBorder(BorderFactory.createEmptyBorder(0, 100, 0, 100));
		
		String missionString = "<html><p style='text-align:justify;'><b>Mission: </b><br>Our mission is to provide timely and accurate assessments of disasters, determine the required level of emergency response, and disseminate crucial information to affected populations. We aim to minimize the impact of disasters by efficiently mobilizing resources and coordinating response efforts.</p></html>";
		mission = new JLabel(missionString);
		mission.setForeground(Color.white);
		mission.setFont(new Font("Calibri", Font.PLAIN, 24));
		
		String visionString = "<html><p style='text-align:justify;'><b>Vision: </b><br>We envision a world where communities are resilient in the face of disasters, where swift and effective emergency response saves lives and minimizes suffering. Through innovation, collaboration, and proactive measures, we strive to build a safer and more resilient future for all.</p></html>";
		vision = new JLabel(visionString);
		vision.setForeground(Color.white);
		vision.setFont(new Font("Calibri", Font.PLAIN, 24));

		aboutUSPanel.add(mission);
		aboutUSPanel.add(vision);
		
		content.add(aboutUSPanel, BorderLayout.CENTER);
		
		creatorPanel = new JPanel(new BorderLayout());
		creatorPanel.setBackground(Color.decode("#343A40"));
		
		creatorImg = new JLabel();
		creatorImg.setIcon(new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\profile.png"));
		creatorImg.setBorder(BorderFactory.createEmptyBorder(50, 100, 0, 0));
		
		String creatorDescriptionString = "<html><p>Developed by: Janssen Rianne G. Razo<br>"
				+ "Facebook Account: Janssen Rianne Razo<br>"
				+ "Email: jrianne87@gmail.com<br>"
				+ "Contact no.: 09934053130</p></html>";
		creatorDescription = new JLabel(creatorDescriptionString);
		creatorDescription.setForeground(Color.white);
		creatorDescription.setFont(new Font("Calibri", Font.PLAIN, 20));
		creatorDescription.setBorder(BorderFactory.createEmptyBorder(0, 75, 0, 0));
		
		creatorPanel.add(creatorImg, BorderLayout.NORTH);
		creatorPanel.add(creatorDescription, BorderLayout.CENTER);
		
		mainPanel.add(titleBar, BorderLayout.NORTH);
		mainPanel.add(content, BorderLayout.CENTER);
		mainPanel.add(creatorPanel, BorderLayout.WEST);
        
        accountFrame.add(mainPanel);
		
		accountFrame.setVisible(true);
	}
}

class Hotline{
	private JFrame hotlineFrame;
	private JPanel content, titleBar, hotlinePanel;
	private JLabel title, hotlines;
	//Hotline class which contains the emergency hotlines needed in an emergency
	public Hotline(){
		hotlineFrame = new JFrame("Emergency Hotlines");
		hotlineFrame.setSize(700,650);
		hotlineFrame.setLocationRelativeTo(null);
		hotlineFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		hotlineFrame.setLayout(new BorderLayout());
		
		ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\logo.png");
		hotlineFrame.setIconImage(icon.getImage());
		
		content = new JPanel(new BorderLayout());
		
		titleBar = new JPanel();
		titleBar.setBackground(Color.decode("#F0AD4E"));
		title = new JLabel("<html><p>Emergency Hotlines</p></html>", JLabel.CENTER);
		title.setForeground(Color.white);
		title.setFont(new Font("Calibri", Font.BOLD, 30));
		
		titleBar.add(title);
		
		hotlinePanel = new JPanel();
		hotlinePanel.setBackground(Color.decode("#343A40"));
		String hotlinesText = "<html>National Disaster Risk Reduction Management Council:<br>" +
                "(02) 911-5061, (02) 911-5062, (02) 911-5063, (02) 911-5064<br>" +
                "(02) 911-5065, (02) 911-1406, (02) 911-1873, (02) 912-2665<br>" +
                "(02) 912-5668<br><br>" +
                "Philippine Institute of Volcanology and Seismology:<br>" +
                "(02) 426-1468, (02) 426-1469, (02) 426-1470, (02) 426-1471<br>" +
                "(02) 426-1472, (02) 426-1473, (02) 426-1474, (02) 426-1475<br>" +
                "(02) 426-1476, (02) 426-1477, (02) 426-1478, (02) 426-1479<br><br>" +
                "Philippine Coast Guard:<br>" +
                "(02) 527-8481, (02) 527-8482, (02) 527-8483, (02) 527-8484<br>" +
                "(02) 527-8485, (02) 527-8486, (02) 527-8487, (02) 527-8488<br>" +
                "(02) 527-8489, (02) 527-3877<br>" +
                "0917-724-3682 [Globe], 0918-967-4697 [Smart]<br><br>" +
                "PAGASA:<br>" +
                "(02) 4342696, (02) 9264258, (02) 9271541, (02) 8323023" +
                "</html>";

        hotlines = new JLabel(hotlinesText);
        hotlines.setForeground(Color.white);
        hotlines.setFont(new Font("Calibri", Font.BOLD, 24));
        
        hotlinePanel.add(hotlines);
        
        content.add(titleBar, BorderLayout.NORTH);
        content.add(hotlinePanel, BorderLayout.CENTER);
        
        hotlineFrame.add(content, BorderLayout.CENTER);
        
		hotlineFrame.setVisible(true);
	}
}

class Instructions{
	private JFrame instructionFrame;
	private JPanel content, titleBar, instructionsPanel;
	private JLabel title, instructions;
	//Instructions class which contains the instructions on how to use the program
	public Instructions(){
		instructionFrame = new JFrame("Instructions");
		instructionFrame.setSize(350,400);
		instructionFrame.setLocationRelativeTo(null);
		instructionFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		instructionFrame.setLayout(new BorderLayout());
		
		ImageIcon icon = new ImageIcon("C:\\Users\\DELL\\OneDrive\\School\\CPE05 - Object Oriented Programming\\1Documents\\finals project\\logo.png");
		instructionFrame.setIconImage(icon.getImage());
		
		content = new JPanel(new BorderLayout());
				
		titleBar = new JPanel();
		titleBar.setBackground(Color.decode("#D9534F"));
		title = new JLabel("<html><p>How to use:</p></html>");
		title.setForeground(Color.white);
		title.setFont(new Font("Calibri", Font.BOLD, 30));
		
		titleBar.add(title);
		
		instructionsPanel = new JPanel();
		instructionsPanel.setBackground(Color.decode("#343A40"));
		String instructionString = "<html><p>1. Input the population size <br>of the region.<br><br>"
				+ "2. Select the type of disaster <br>the region is experiencing <br><br>"
				+ "3. Select the magnitude <br>of the disaster.<br><br>"
				+ "4. Press the \"analyze\" button.</html>";
		instructions = new JLabel(instructionString);
		instructions.setForeground(Color.white);
		instructions.setFont(new Font("Calibri", Font.PLAIN, 24));
		
		instructionsPanel.add(instructions);
		
		content.add(titleBar, BorderLayout.NORTH);
		content.add(instructionsPanel, BorderLayout.CENTER);
		
		instructionFrame.add(content, BorderLayout.CENTER);
        
		instructionFrame.setVisible(true);
	}
}