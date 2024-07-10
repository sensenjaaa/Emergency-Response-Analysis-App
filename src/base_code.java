import java.util.Scanner;

public class base_code {
	public static void main(String[]args)
	{	
		Scanner input=new Scanner(System.in);
		welcome();
		boolean stop=false;
		while(!stop) {
			emergency_response_analysis();
			
			System.out.print("\nNote: 1 - Yes 0 - No");
			System.out.print("\nDo you want to continue? ");
			int choice=input.nextInt();
			
			if (choice==0)
			{
				thank_you();	
				stop=true;
			}
			if ((choice>1)||(choice<0))
			{
				dnr();
				stop=true;
			}
		}		
	}
	public static void welcome()
	{
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("\n\tWelcome to the Emergency Disaster Response Analysis (EDRA)\n");
		System.out.print("\n----------------------------------------------------------------------------\n");
		System.out.print("\nThis program enables you to identify the level of response depending on the "
				+ "\ntype disaster and the populace affected.\n");
		System.out.print("\nNote: Input only the number\n");
	}
	public static void emergency_response_analysis()
	{
		Scanner input=new Scanner(System.in);
		System.out.print("\nKind of Natural Disasters");
		System.out.print("\n1. Tropical Cyclones"
				+ "\n2. Floods"
				+ "\n3. Storm Surges"
				+ "\n4. Earthquake"
				+ "\n5. Volcanic Eruptions"
				+ "\n6. Landslides"
				+ "\n7. Tsunami ");
		
		System.out.print("\n\nWhat kind of natural disaster are you experiencing: ");
		int disasterType=input.nextInt();
		int magnitudeLevel=0;  
		int size=0;
		int popu_identifier=0;
		
		switch (disasterType)
		{
		case 1:
		    System.out.print("\nIntensity of the Tropical Cyclone");
		    System.out.print("\n1. Tropical Cyclone Warning Signal no.1 (30-60 km/h winds)"
		            + "\n2. Tropical Cyclone Warning Signal no.2 (61-120 km/h winds)"
		            + "\n3. Tropical Cyclone Warning Signal no.3 (121-170 km/h winds)"
		            + "\n4. Tropical Cyclone Warning Signal no.4 (171-220 km/h winds)"
		            + "\n5. Tropical Cyclone Warning Signal no.5 (Over 220 km/h winds)");

		    System.out.print("\n\nWhat is the intensity level of the tropical cyclone: ");
		    magnitudeLevel = input.nextInt();
		    if ((magnitudeLevel<=5)&&(magnitudeLevel>=1)) {
		    	System.out.print("Population size of the Region affected: ");
				size=input.nextInt();
				
				popu_identifier=popuCalculation(size);
				if (magnitudeLevel==1){
					System.out.print(population(popu_identifier));
					System.out.print(BlueAlert());
				}
				if (magnitudeLevel==2){
					System.out.print(population(popu_identifier));
					System.out.print(YellowAlert());
				}
				if (magnitudeLevel==3){
					System.out.print(population(popu_identifier));
					System.out.print(YellowAlert());
				}
				if (magnitudeLevel==4){
					System.out.print(population(popu_identifier));
					System.out.print(OrangeAlert());
				}
				if (magnitudeLevel==5){
					System.out.print(population(popu_identifier));
					System.out.print(RedAlert());
				}		    
			}else {
				System.out.print("\n==================================================================\n");
				System.out.print("\n\tSystem does not recognize the magnitude provided\n");
				System.out.print("\n==================================================================\n");
			}
		    break;
		case 2:
			System.out.print("\nMagnitude of the Flooding");
			System.out.print("\n1. Low-level Flooding - Minor flooding affecting low-lying areas."
					+ "\n2. Moderate-level Flooding - Widespread flooding affecting low-lying areas."
					+ "\n3. High-level Flooding - Extensive and severe flooding in low-lying areas."
					+ "\n4. Flash Flooding - Rapid and intense flooding, often caused by heavy rainfall.");
			
			System.out.print("\n\nWhat is the magnitude scale of the flooding: ");
			magnitudeLevel=input.nextInt();
			if ((magnitudeLevel<=4)&&(magnitudeLevel>=1)) {
				System.out.print("Population size of the Region affected: ");
				size=input.nextInt();
				
				popu_identifier=popuCalculation(size);
				if (magnitudeLevel==1){
					System.out.print(population(popu_identifier));
					System.out.print(BlueAlert());
				}
				if (magnitudeLevel==2){
					System.out.print(population(popu_identifier));
					System.out.print(YellowAlert());
				}
				if (magnitudeLevel==3){
					System.out.print(population(popu_identifier));
					System.out.print(OrangeAlert());
				}
				if (magnitudeLevel==4){
					System.out.print(population(popu_identifier));
					System.out.print(RedAlert());
				}
			}else {
				System.out.print("\n==================================================================\n");
				System.out.print("\n\tSystem does not recognize the magnitude provided\n");
				System.out.print("\n==================================================================\n");
			}
			break;
		case 3:
			System.out.print("\nMagnitude of the Storm Surges");
			System.out.print("\n1. Low-level Storm Surges - Up to 1 meter (3.28 feet)"
					+ "\n2. Moderate-level Storm Surges - 1 to 2 meters (3.28 to 6.56 feet)"
					+ "\n3. High-level Storm Surges - 2 to 3 meters (6.56 to 9.84 feet)"
					+ "\n4. Very High-Level Storm Surge - Over 3 meters (9.84 feet)");
			
			System.out.print("\n\nWhat is the magnitude scale of the storm surges: ");
			magnitudeLevel=input.nextInt();
			if ((magnitudeLevel<=4)&&(magnitudeLevel>=1)) {
				System.out.print("Population size of the Region affected: ");
				size=input.nextInt();
				
				popu_identifier=popuCalculation(size);
				if (magnitudeLevel==1){
					System.out.print(population(popu_identifier));
					System.out.print(BlueAlert());
				}
				if (magnitudeLevel==2){
					System.out.print(population(popu_identifier));
					System.out.print(YellowAlert());
				}
				if (magnitudeLevel==3){
					System.out.print(population(popu_identifier));
					System.out.print(OrangeAlert());
				}
				if (magnitudeLevel==4){
					System.out.print(population(popu_identifier));
					System.out.print(RedAlert());
				}
			}else {
				System.out.print("\n==================================================================\n");
				System.out.print("\n\tSystem does not recognize the magnitude provided\n");
				System.out.print("\n==================================================================\n");
			}
			break;
		case 4:
	        System.out.print("\nMagnitude of the Earthquake");
	        System.out.print("\n1. Minor Earthquake - Below 4.0"
	                + "\n2. Light Earthquake - 4.0 to 4.9"
	                + "\n3. Moderate Earthquake - 5.0 to 5.9"
	                + "\n4. Strong Earthquake - 6.0 to 6.9"
	                + "\n5. Major Earthquake - 7.0 to 7.9"
	                + "\n6. Great Earthquake - 8.0 and above");

	        System.out.print("\n\nWhat is the magnitude scale of the earthquake: ");
	        magnitudeLevel = input.nextInt();
	        if ((magnitudeLevel<=6)&&(magnitudeLevel>=1)) {
	        	System.out.print("Population size of the Region affected: ");
				size=input.nextInt();
				
				popu_identifier=popuCalculation(size);
				if (magnitudeLevel==1){
					System.out.print(population(popu_identifier));
					System.out.print(BlueAlert());
				}
				if (magnitudeLevel==2){
					System.out.print(population(popu_identifier));
					System.out.print(YellowAlert());
				}
				if (magnitudeLevel==3){
					System.out.print(population(popu_identifier));
					System.out.print(YellowAlert());
				}
				if (magnitudeLevel==4){
					System.out.print(population(popu_identifier));
					System.out.print(OrangeAlert());
				}
				if (magnitudeLevel==5){
					System.out.print(population(popu_identifier));
					System.out.print(RedAlert());
				}
				if (magnitudeLevel==6){
					System.out.print(population(popu_identifier));
					System.out.print(RedAlert());
				}
	        }else {
	        	System.out.print("\n==================================================================\n");
				System.out.print("\n\tSystem does not recognize the magnitude provided\n");
				System.out.print("\n==================================================================\n");
	        }
	        break;
	    case 5:
		    System.out.print("\nMagnitude of the Volcanic Eruptions");
		    System.out.print("\n1. Minor Activity - Low-level volcanic activity with minimal threat."
		            + "\n2. Moderate Activity - Increased volcanic activity with potential ash emission."
		            + "\n3. Significant Activity - Eruption with ash plumes and potential lava flow."
		            + "\n4. Major Eruption - Violent eruption with widespread ashfall and lava flow."
		            + "\n5. Catastrophic Eruption - Massive eruption with severe impact on the surrounding area.");

		    System.out.print("\n\nWhat is the magnitude scale of the volcanic eruptions: ");
		    magnitudeLevel = input.nextInt();
		    if ((magnitudeLevel<=5)&&(magnitudeLevel>=1)) {
	        	System.out.print("Population size of the Region affected: ");
				size=input.nextInt();
				
				popu_identifier=popuCalculation(size);
				if (magnitudeLevel==1){
					System.out.print(population(popu_identifier));
					System.out.print(YellowAlert());
				}
				if (magnitudeLevel==2){
					System.out.print(population(popu_identifier));
					System.out.print(YellowAlert());
				}
				if (magnitudeLevel==3){
					System.out.print(population(popu_identifier));
					System.out.print(OrangeAlert());
				}
				if (magnitudeLevel==4){
					System.out.print(population(popu_identifier));
					System.out.print(RedAlert());
				}
				if (magnitudeLevel==5){
					System.out.print(population(popu_identifier));
					System.out.print(RedAlert());
				}
	        }else {
	        	System.out.print("\n==================================================================\n");
				System.out.print("\n\tSystem does not recognize the magnitude provided\n");
				System.out.print("\n==================================================================\n");
	        }
	        break;
		case 6:
		    System.out.print("\nMagnitude of the Landslides");
		    System.out.print("\n1. Minor Landslide - Limited soil movement with minimal impact."
		            + "\n2. Moderate Landslide - Increased soil movement with potential property damage."
		            + "\n3. Significant Landslide - Extensive soil movement with risk to structures."
		            + "\n4. Major Landslide - Severe soil movement causing widespread damage."
		            + "\n5. Catastrophic Landslide - Massive soil movement with devastating impact on the area.");

		    System.out.print("\n\nWhat is the magnitude scale of the landslides: ");
		    magnitudeLevel = input.nextInt();
		    if ((magnitudeLevel<=6)&&(magnitudeLevel>=1)) {
	        	System.out.print("Population size of the Region affected: ");
				size=input.nextInt();
				
				popu_identifier=popuCalculation(size);
				if (magnitudeLevel==1){
					System.out.print(population(popu_identifier));
					System.out.print(BlueAlert());
				}
				if (magnitudeLevel==2){
					System.out.print(population(popu_identifier));
					System.out.print(YellowAlert());
				}
				if (magnitudeLevel==3){
					System.out.print(population(popu_identifier));
					System.out.print(YellowAlert());
				}
				if (magnitudeLevel==4){
					System.out.print(population(popu_identifier));
					System.out.print(OrangeAlert());
				}
				if (magnitudeLevel==5){
					System.out.print(population(popu_identifier));
					System.out.print(RedAlert());
				}
	        }else {
	        	System.out.print("\n==================================================================\n");
				System.out.print("\n\tSystem does not recognize the magnitude provided\n");
				System.out.print("\n==================================================================\n");
	        }
	        break;
	    case 7:
		    System.out.print("\nMagnitude of the Tsunami");
		    System.out.print("\n1. Minor Tsunami - Low-level tsunami with minimal coastal impact."
		            + "\n2. Moderate Tsunami - Increased wave height with potential flooding."
		            + "\n3. Significant Tsunami - Higher waves causing extensive coastal flooding."
		            + "\n4. Major Tsunami - Destructive waves with severe coastal inundation."
		            + "\n5. Catastrophic Tsunami - Massive waves causing widespread devastation.");

		    System.out.print("\n\nWhat is the magnitude scale of the tsunami: ");
		    magnitudeLevel = input.nextInt();
		    if ((magnitudeLevel<=6)&&(magnitudeLevel>=1)) {
		    	System.out.print("Population size of the Region affected: ");
				size=input.nextInt();
				
				popu_identifier=popuCalculation(size);
				if (magnitudeLevel==1){
					System.out.print(population(popu_identifier));
					System.out.print(BlueAlert());
				}
				if (magnitudeLevel==2){
					System.out.print(population(popu_identifier));
					System.out.print(YellowAlert());
				}
				if (magnitudeLevel==3){
					System.out.print(population(popu_identifier));
					System.out.print(OrangeAlert());
				}
				if (magnitudeLevel==4){
					System.out.print(population(popu_identifier));
					System.out.print(OrangeAlert());
				}
				if (magnitudeLevel==5){
					System.out.print(population(popu_identifier));
					System.out.print(RedAlert());
				}		    
		    }else {
		    	System.out.print("\n==================================================================\n");
				System.out.print("\n\tSystem does not recognize the magnitude provided\n");
				System.out.print("\n==================================================================\n");
		    }
		    break;
		default:
			System.out.print("\n==================================================================\n");
			System.out.print("\n\tSystem does not recognize the disaster provided\n");
			System.out.print("\n==================================================================\n");
		}
	}
	public static void thank_you() {
		System.out.print("\n\n------------------------------------------------------------------\n");
		System.out.print("\n\t\tThank you for using EDRA\n");
		System.out.print("\n------------------------------------------------------------------\n");
		System.out.print("\nLists of Emergency Hotlines: \n"
		        + "\nNational Disaster Risk Reduction Management Council: "
		        + "\n(02) 911-5061, (02) 911-5062, (02) 911-5063, (02) 911-5064 "
		        + "\n(02) 911-5065, (02) 911-1406, (02) 911-1873, (02) 912-2665 "
		        + "\n(02) 912-5668 "
		        + "\n\nPhilippine Institute of Volcanology and Seismology:"
		        + "\n(02) 426-1468, (02) 426-1469, (02) 426-1470, (02) 426-1471"
		        + "\n(02) 426-1472, (02) 426-1473, (02) 426-1474, (02) 426-1475"
		        + "\n(02) 426-1476, (02) 426-1477, (02) 426-1478, (02) 426-1479"
		        + "\n\nPhilippine Coast Guard: \n"
		        + "(02) 527-8481, (02) 527-8482, (02) 527-8483, (02) 527-8484"
		        + "\n(02) 527-8485, (02) 527-8486, (02) 527-8487, (02) 527-8488"
		        + "\n(02) 527-8489, (02) 527-3877"
		        + "\n0917-724-3682 [Globe], 0918-967-4697 [Smart]"
		        + "\n\nPAGASA: \n"
		        + "(02) 4342696, (02) 9264258, (02) 9271541, (02) 8323023");
	}
	public static void dnr()
	{
		System.out.println("\n\t\tThe system does not recognize your choice");
	}
	public static String BlueAlert()
	{
		return ("Blue Alert (Preparedness)"
                + "\nResource Allocation:"
                + "\n• Activate early warning."
                + "\n• Mobilizing communications and information dissemination teams."
                + "\n• Conduct public awareness campaigns."
                + "\n==================================================================\n");
	}
	public static String YellowAlert()
	{
		return("Yellow Alert (Preparedness)"
                + "\nResource Allocation:"
                + "\n• Preposition emergency supplies and equipment."
                + "\n• Activate local emergency response teams."
                + "\n• Conduct evacuation drills and readiness assessments."
                + "==================================================================\n");
	}
	public static String OrangeAlert()
	{
		return ("Orange Alert (Response)"
                + "\nResource Allocation:"
                + "\n• Deploy search and rescue teams."
                + "\n• Activate medical response teams."
                + "\n• Establish emergency shelters."
                + "\n• Initiate mass evacuation procedures."
                + "\n==================================================================\n");
	}
	public static String RedAlert()
	{
		return ("Red Alert (Full Response)"
                + "\nResource Allocation:"
                + "\n• Mobilize national and regional disaster response teams."
                + "\n• Activate medical facilities and field hospitals."
                + "\n• Request support from military and other relevant agencies."
                + "\n• Implement full-scale evacuation and relief operations."
                + "\n==================================================================\n");
	}
	public static int popuCalculation(int size){
		if (size<=1000) {
			return 1;
		}if ((size>1000)&&(size<=5000)) {
			return 2;
		}if ((size>5000)&&(size<=10000)) {
			return 3;
		}if ((size>10000)) {
			return 4;
		}
		else return 0;
	}
	public static String population(int popu_identifier)
	{
		if (popu_identifier==1) {
			return ("\n==================================================================\n"
					+"\tLow Population Impact - ");
		}
		if (popu_identifier==2) {
			return ("\n==================================================================\n"
					+"\tModerate Population Impact - ");
		}
		if (popu_identifier==3) {
			return ("\n==================================================================\n"
					+"\tHigh Population Impact - ");
		}
		if (popu_identifier==4) {
			return ("\n==================================================================\n"
					+"\tVery High Population Impact - ");
		}else {
			return "Invalid Population";
		}
	}
}
