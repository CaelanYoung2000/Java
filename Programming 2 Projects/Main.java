import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.io.IOException;

import java.util.Random;

import javax.swing.BorderFactory;

import javax.swing.ButtonGroup;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.JRadioButton;

class Main extends JFrame {
    
    Main() {
        
        //... Create the buttons.
        JRadioButton class1   = new JRadioButton("Barbarian");
        JRadioButton class2    = new JRadioButton("Bard");
        JRadioButton class3 = new JRadioButton("Cleric");
        JRadioButton class4    = new JRadioButton("Druid");
        JRadioButton class5   = new JRadioButton("Fighter");
        JRadioButton class6    = new JRadioButton("Monk");
        JRadioButton class7 = new JRadioButton("Paladin");
        JRadioButton class8   = new JRadioButton("Ranger");
        JRadioButton class9    = new JRadioButton("Rogue");
        JRadioButton class10 = new JRadioButton("Sorcerer");
        JRadioButton class11 = new JRadioButton("Warlock");
        JRadioButton class12   = new JRadioButton("Wizzard");
       
        //... Create a button group and add the buttons.
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(class1);
        bgroup.add(class2);
        bgroup.add(class3);
        bgroup.add(class4);
        bgroup.add(class5);
        bgroup.add(class6);
        bgroup.add(class7);
        bgroup.add(class8);
        bgroup.add(class9);
        bgroup.add(class10);
        bgroup.add(class11);
        bgroup.add(class12);
        
        //... Arrange buttons vertically in a panel
        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new GridLayout(10, 2));
        radioPanel.add(class1);
        radioPanel.add(class2);
        radioPanel.add(class3);
        radioPanel.add(class4);
        radioPanel.add(class5);
        radioPanel.add(class6);
        radioPanel.add(class7);
        radioPanel.add(class8);
        radioPanel.add(class9);
        radioPanel.add(class10);
        radioPanel.add(class11);
        radioPanel.add(class12);
        
        //... Add a titled border to the button panel.
        radioPanel.setBorder(BorderFactory.createTitledBorder(
                   BorderFactory.createEtchedBorder(), "Select Which Class You Want To Play As For Your Dungeons & Dragons Character"));

        //... Set window attributes.
        setContentPane(radioPanel);  // Button panel is only content.
        pack();                      // Layout window.
        
    }
    
    //================================================================= main
    public static void main(String[] args) throws IOException {
       
        JFrame window = new Main();
        window.setTitle("Dungeons & Dragons | Create New Character |");  // But window is too small to show it!
        
        JButton classSubmit = new JButton("Star Your Adventure!");

        classSubmit.setBounds(50, 375, 250, 50);

        classSubmit.addActionListener(new ActionListener() {
            
        public void actionPerformed(ActionEvent e)
        {
            
        System.exit(0);
        
        }
        
        });
        
        window.add(classSubmit);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);  // Center window.
        window.setVisible(true);
        
        
        
        Random race = new Random();
        int rand18 = 0;
        while (true){
            rand18 = race.nextInt(19);
            if(rand18 !=0) break;
        }

        switch (rand18) {
            case 1 -> System.out.print("\nRace: Human");
            case 2 -> System.out.print("\nRace: Dwarf");
            case 3 -> System.out.print("\nRace: Mountain Dwarf");
            case 4 -> System.out.print("\nRace: Hill Dwarf");
            case 5 -> System.out.print("\nRace: Dragonborn");
            case 6 -> System.out.print("\nRace: Half-Orc");
            case 7 -> System.out.print("\nRace: Elf");
            case 8 -> System.out.print("\nRace: Half Elf");
            case 9 -> System.out.print("\nRace: High Elf");
            case 10 -> System.out.print("\nRace: Wood Elf");
            case 11 -> System.out.print("\nRace: Dark Elf");
            case 12 -> System.out.print("\nRace: Halfling");
            case 13 -> System.out.print("\nRace: Stout Halfling");
            case 14 -> System.out.print("\nRace: Lightfoot Halfling");
            case 15 -> System.out.print("\nRace: Gnome");
            case 16 -> System.out.print("\nRace: Forest Gnome");
            case 17 -> System.out.print("\nRace: Rock Gnome");
            case 18 -> System.out.print("\nRace: Tielfing");
            default -> {
            }
        } 
        
Random strength = new Random();
int rand1 = 0;
while (true){
    rand1 = strength.nextInt(19);
    if(rand1 !=0) break;
}
       
Random dexterity = new Random();
int rand2 = 0;
while (true){
    rand2 = dexterity.nextInt(19);
    if(rand2 !=0) break;
}

Random constitution = new Random();
int rand3 = 0;
while (true){
    rand3 = constitution.nextInt(19);
    if(rand3 !=0) break;
}
       
Random intelligence = new Random();
int rand4 = 0;
while (true){
    rand4 = intelligence.nextInt(19);
    if(rand4 !=0) break;
}
      
Random wisdom = new Random();
int rand5 = 0;
while (true){
    rand5 = wisdom.nextInt(19);
    if(rand5 !=0) break;
}

Random charisma = new Random();
int rand6 = 0;
while (true){
    rand6 = charisma.nextInt(19);
    if(rand6 !=0) break;
    
}

Random alignment = new Random();
int alignmentrand = 0;
while (true){
    alignmentrand = alignment.nextInt(10);
    if(alignmentrand !=0) break;
    
}

switch (alignmentrand) {
            case 1 -> System.out.print("\n\nAlignment: Lawful Good");
            case 2 -> System.out.print("\n\nAlignment: Neutral Good");
            case 3 -> System.out.print("\n\nAlignment: Chatoic Good");
            case 4 -> System.out.print("\n\nAlignment: Lawful Neutral");
            case 5 -> System.out.print("\n\nAlignment: True Neutral");
            case 6 -> System.out.print("\n\nAlignment: Chaotic Neutral");
            case 7 -> System.out.print("\n\nAlignment: Lawful Evil");
            case 8 -> System.out.print("\n\nAlignment: Neutral Evil");
            case 9 -> System.out.print("\n\nAlignment: Chaotic Evil");
                default -> {
            }
                
}

switch (rand18) {
            case 1 -> System.out.print("\n\nStrength: (1) + "+rand1+"\n\nDexterity: (1) + (10) + "+rand2+"\n\nConstitution: (1) + "+rand3+"\n\nIntelligence: (1) + "+rand4+"\n\nWisdom: (1) + "+rand5+"\n\nCharisma: (1) + "+rand6);
            case 2 -> System.out.print("\n\nStrength: "+rand1+"\n\nDexterity: (10) + "+rand2+"\n\nConstitution: (2) + "+rand3+"\n\nIntelligence: "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: "+rand6);
            case 3 -> System.out.print("\n\nStrength: (2) + "+rand1+"\n\nDexterity: (10) + "+rand2+"\n\nConstitution: "+rand3+"\n\nIntelligence: "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: "+rand6);
            case 4 -> System.out.print("\n\nStrength: "+rand1+"\n\nDexterity:  (10) + "+rand2+"\n\nConstitution: "+rand3+"\n\nIntelligence: "+rand4+"\n\nWisdom: (1) + "+rand5+"\n\nCharisma: "+rand6);
            case 5 -> System.out.print("\n\nStrength: (2) + "+rand1+"\n\nDexterity:  (10) + "+rand2+"\n\nConstitution: "+rand3+"\n\nIntelligence: "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: (1) + "+rand6);
            case 6 -> System.out.print("\n\nStrength: (2) + "+rand1+"\n\nDexterity:  (10) + "+rand2+"\n\nConstitution: (1) + "+rand3+"\n\nIntelligence: "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: "+rand6);
            case 7 -> System.out.print("\n\nStrength: "+rand1+"\n\nDexterity:  (10) + (2) + "+rand2+"\n\nConstitution: "+rand3+"\n\nIntelligence: "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: "+rand6);
            case 8 -> System.out.print("\n\nStrength: (1) + "+rand1+"\n\nDexterity:  (10) + (1) + "+rand2+"\n\nConstitution: "+rand3+"\n\nIntelligence: "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: (2) + "+rand6);
            case 9 -> System.out.print("\n\nStrength: "+rand1+"\n\nDexterity:  (10) + "+rand2+"\n\nConstitution: "+rand3+"\n\nIntelligence: (1) + "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: (2) + "+rand6);
            case 10 -> System.out.print("\n\nStrength: "+rand1+"\n\nDexterity:  (10) + "+rand2+"\n\nConstitution: "+rand3+"\n\nIntelligence: "+rand4+"\n\nWisdom: (1) + "+rand5+"\n\nCharisma: "+rand6);
            case 11 -> System.out.print("\n\nStrength: "+rand1+"\n\nDexterity:  (10) + "+rand2+"\n\nConstitution: "+rand3+"\n\nIntelligence: "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: (1) + "+rand6);
            case 12 -> System.out.print("\n\nStrength: "+rand1+"\n\nDexterity:  (10) + (2) + "+rand2+"\n\nConstitution: "+rand3+"\n\nIntelligence: "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: "+rand6);
            case 13 -> System.out.print("\n\nStrength: "+rand1+"\n\nDexterity: (10) + "+rand2+"\n\nConstitution: (1) + "+rand3+"\n\nIntelligence: "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: "+rand6);
            case 14 -> System.out.print("\n\nStrength: "+rand1+"\n\nDexterity: (10) + "+rand2+"\n\nConstitution: "+rand3+"\n\nIntelligence: "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: (1) + "+rand6);
            case 15 -> System.out.print("\n\nStrength: "+rand1+"\n\nDexterity: (10) + "+rand2+"\n\nConstitution:  "+rand3+"\n\nIntelligence: (2) + "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: "+rand6);
            case 16 -> System.out.print("\n\nStrength: "+rand1+"\n\nDexterity: (10) + (1) + "+rand2+"\n\nConstitution:  "+rand3+"\n\nIntelligence: "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: "+rand6);
            case 17 -> System.out.print("\n\nStrength: "+rand1+"\n\nDexterity: (10) + "+rand2+"\n\nConstitution: (1) + "+rand3+"\n\nIntelligence: "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: "+rand6);
            case 18 -> System.out.print("\n\nStrength: "+rand1+"\n\nDexterity: (10) + "+rand2+"\n\nConstitution: "+rand3+"\n\nIntelligence: (1) +  "+rand4+"\n\nWisdom: "+rand5+"\n\nCharisma: (2) + "+rand6);
            default -> {
            }
        } 

switch (rand18) {
            case 1 -> System.out.println("\n\nBase Armor: "+(rand2 + 10 + 1));
            case 2 -> System.out.println("\n\nBase Armor: "+(rand2 + 10));
            case 3 -> System.out.println("\n\nBase Armor: "+(rand2 + 10));
            case 4 -> System.out.println("\n\nBase Armor: "+(rand2 + 10));
            case 5 -> System.out.println("\n\nBase Armor: "+(rand2 + 10));
            case 6 -> System.out.println("\n\nBase Armor: "+(rand2 + 10));
            case 7 -> System.out.println("\n\nBase Armor: "+(rand2 + 10 + 2));
            case 8 -> System.out.println("\n\nBase Armor: "+(rand2 + 10 + 1));
            case 9 -> System.out.println("\n\nBase Armor: "+(rand2 + 10));
            case 10 -> System.out.println("\n\nBase Armor: "+(rand2 + 10));
            case 11 -> System.out.println("\n\nBase Armor: "+(rand2 + 10 + 2));
            case 12 -> System.out.println("\n\nBase Armor: "+(rand2 + 10));
            case 13 -> System.out.println("\n\nBase Armor: "+(rand2 + 10));
            case 14 -> System.out.println("\n\nBase Armor: "+(rand2 + 10));
            case 15 -> System.out.println("\n\nBase Armor: "+(rand2 + 10));
            case 16 -> System.out.println("\n\nBase Armor: "+(rand2 + 10 + 1));
            case 17 -> System.out.println("\n\nBase Armor: "+(rand2 + 10));
            case 18 -> System.out.println("\n\nBase Armor: "+(rand2 + 10));
            default -> {
            }
        } 

/*     Had no issues that were shown on compiler side or even repl.it but when I ran the program it was unable to find my main class because the "hP" parameter being passed was losing the location of the main class



 Had no issues that were shown on compiler side or even repl.it but when I ran the program it was unable to find my main class because the "hP" parameter being passed was losing the location of the main class */


        Random objGenerator = new Random();
        
            for (int iCount = 0; iCount< 1; iCount++){
                
              int randomNumber = objGenerator.nextInt(14);
              
              int passToRoll;
        


    switch (randomNumber) {
            case 1 -> {
                
                passToRoll = 1;
                
                switch (passToRoll) {
                    case 1 -> {
                        Random randomRoll = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll.nextInt(13);
                            
                            System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                             
                        }
                        
                      }
                    
                    case 2 -> {
                        Random randomRoll2 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll2.nextInt(13);
                            
                            System.out.println("\nClass: Barbarian ");
                             
                            System.out.println("\nHit Points: "+(rand3 + 2 + randomRollClass1));
                            
                        }
                        
                      }
                    case 3 -> {
                        Random randomRoll3 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll3.nextInt(13);
                            
                            System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 4 -> {
                        Random randomRoll4 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll4.nextInt(13);
                            
                            System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 5 -> {
                        Random randomRoll5 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll5.nextInt(13);
                            
                            System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 6 -> {
                        Random randomRoll6 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll6.nextInt(13);
                            
                            System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 7 -> {
                        Random randomRoll7 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll7.nextInt(13);
                            
                            System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 8 -> {
                        Random randomRoll8 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll8.nextInt(13);
                            
                            System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 9 -> {
                        Random randomRoll9 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll9.nextInt(13);
                            
                            System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 10 -> {
                        Random randomRoll10 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll10.nextInt(13);
                            
                             System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 11 -> {
                        Random randomRoll1 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll1.nextInt(13);
                            
                             System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 12 -> {
                        Random randomRoll12 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll12.nextInt(13);
                            
                             System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 13 -> {
                        Random randomRoll14 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll14.nextInt(13);
                            
                             System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 14 -> {
                        Random randomRoll15 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll15.nextInt(13);
                            
                             System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 15 -> {
                        Random randomRoll16 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll16.nextInt(13);
                            
                             System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 16 -> {
                        Random randomRoll17 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll17.nextInt(13);
                            
                             System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 17 -> {
                        Random randomRoll18 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll18.nextInt(13);
                            
                            System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 18 -> {
                        Random randomRoll19 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll19.nextInt(13);
                            
                             System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                        }
                      }
                    default -> {
                      }
                }       }
            case 2 -> {
                
                passToRoll = 1;
                
                switch (passToRoll) {
                    case 1 -> {
                        Random randomRoll = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll.nextInt(9);
                            
                            System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                             
                        }
                        
                      }
                    
                    case 2 -> {
                        Random randomRoll2 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll2.nextInt(9);
                            
                             System.out.println("\nClass: Bard ");
                             
                            System.out.println("\nHit Points: "+(rand3 + 2 + randomRollClass1));
                            
                        }
                        
                      }
                    case 3 -> {
                        Random randomRoll3 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll3.nextInt(9);
                            
                             System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 4 -> {
                        Random randomRoll4 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll4.nextInt(9);
                            
                             System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 5 -> {
                        Random randomRoll5 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll5.nextInt(9);
                            
                             System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 6 -> {
                        Random randomRoll6 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll6.nextInt(9);
                            
                             System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 7 -> {
                        Random randomRoll7 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll7.nextInt(9);
                            
                             System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 8 -> {
                        Random randomRoll8 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll8.nextInt(9);
                            
                            System.out.println("\nClass: Bard ");;
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 9 -> {
                        Random randomRoll9 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll9.nextInt(9);
                            
                             System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 10 -> {
                        Random randomRoll10 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll10.nextInt(9);
                            
                            System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 11 -> {
                        Random randomRoll1 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll1.nextInt(9);
                            
                             System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 12 -> {
                        Random randomRoll12 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll12.nextInt(9);
                            
                              System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 13 -> {
                        Random randomRoll14 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll14.nextInt(9);
                            
                              System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 14 -> {
                        Random randomRoll15 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll15.nextInt(9);
                            
                              System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 15 -> {
                        Random randomRoll16 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll16.nextInt(9);
                            
                             System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 16 -> {
                        Random randomRoll17 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll17.nextInt(9);
                            
                             System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 17 -> {
                        Random randomRoll18 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll18.nextInt(9);
                            
                             System.out.println("\nClass: Bard ");
                             
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 18 -> {
                        Random randomRoll19 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll19.nextInt(9);
                            
                              System.out.println("\nClass: Bard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                        }
                      }
                    default -> {
                      }
                }       }
            case 3 -> {
                
                passToRoll = 1;
                
                switch (passToRoll) {
                    case 1 -> {
                        Random randomRoll = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll.nextInt(9);
                            
                             System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                             
                        }
                        
                      }
                    
                    case 2 -> {
                        Random randomRoll2 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll2.nextInt(9);
                            
                            System.out.println("\nClass: Cleric ");
                             
                            System.out.println("\nHit Points: "+(rand3 + 2 + randomRollClass1));
                            
                        }
                        
                      }
                    case 3 -> {
                        Random randomRoll3 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll3.nextInt(9);
                            
                           System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 4 -> {
                        Random randomRoll4 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll4.nextInt(9);
                            
                           System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 5 -> {
                        Random randomRoll5 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll5.nextInt(9);
                            
                            System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 6 -> {
                        Random randomRoll6 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll6.nextInt(9);
                            
                            System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 7 -> {
                        Random randomRoll7 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll7.nextInt(9);
                            
                           System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 8 -> {
                        Random randomRoll8 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll8.nextInt(9);
                            
                            System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 9 -> {
                        Random randomRoll9 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll9.nextInt(9);
                            
                            System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 10 -> {
                        Random randomRoll10 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll10.nextInt(9);
                            
                             System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 11 -> {
                        Random randomRoll1 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll1.nextInt(9);
                            
                             System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 12 -> {
                        Random randomRoll12 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll12.nextInt(9);
                            
                            System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 13 -> {
                        Random randomRoll14 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll14.nextInt(9);
                            
                           System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 14 -> {
                        Random randomRoll15 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll15.nextInt(9);
                            
                            System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 15 -> {
                        Random randomRoll16 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll16.nextInt(9);
                            
                            System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 16 -> {
                        Random randomRoll17 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll17.nextInt(9);
                            
                            System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 17 -> {
                        Random randomRoll18 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll18.nextInt(9);
                            
                            System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 18 -> {
                        Random randomRoll19 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll19.nextInt(9);
                            
                             System.out.println("\nClass: Cleric ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                        }
                      }
                    default -> {
                      }
                }       }
            case 4 -> {
                
                passToRoll = 1;
                
                switch (passToRoll) {
                    case 1 -> {
                        Random randomRoll = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll.nextInt(9);
                            
                            System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                             
                        }
                        
                      }
                    
                    case 2 -> {
                        Random randomRoll2 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll2.nextInt(9);
                            
                           System.out.println("\nClass: Druid");
                             
                            System.out.println("\nHit Points: "+(rand3 + 2 + randomRollClass1));
                            
                        }
                        
                      }
                    case 3 -> {
                        Random randomRoll3 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll3.nextInt(9);
                            
                            System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 4 -> {
                        Random randomRoll4 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll4.nextInt(9);
                            
                           System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 5 -> {
                        Random randomRoll5 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll5.nextInt(9);
                            
                            System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 6 -> {
                        Random randomRoll6 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll6.nextInt(9);
                            
                           System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 7 -> {
                        Random randomRoll7 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll7.nextInt(9);
                            
                            System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 8 -> {
                        Random randomRoll8 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll8.nextInt(9);
                            
                            System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 9 -> {
                        Random randomRoll9 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll9.nextInt(9);
                            
                            System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 10 -> {
                        Random randomRoll10 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll10.nextInt(9);
                            
                             System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 11 -> {
                        Random randomRoll1 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll1.nextInt(9);
                            
                            System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 12 -> {
                        Random randomRoll12 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll12.nextInt(9);
                            
                             System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 13 -> {
                        Random randomRoll14 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll14.nextInt(9);
                            
                             System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 14 -> {
                        Random randomRoll15 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll15.nextInt(9);
                            
                             System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 15 -> {
                        Random randomRoll16 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll16.nextInt(9);
                            
                             System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 16 -> {
                        Random randomRoll17 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll17.nextInt(9);
                            
                             System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 17 -> {
                        Random randomRoll18 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll18.nextInt(9);
                            
                             System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 18 -> {
                        Random randomRoll19 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll19.nextInt(9);
                            
                             System.out.println("\nClass: Druid");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                        }
                      }
                    default -> {
                      }
                }       }
            case 5 -> {
                
                passToRoll = 1;
                
                switch (passToRoll) {
                    case 1 -> {
                        Random randomRoll = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                             
                        }
                        
                      }
                    
                    case 2 -> {
                        Random randomRoll2 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll2.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                             
                            System.out.println("\nHit Points: "+(rand3 + 2 + randomRollClass1));
                            
                        }
                        
                      }
                    case 3 -> {
                        Random randomRoll3 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll3.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 4 -> {
                        Random randomRoll4 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll4.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 5 -> {
                        Random randomRoll5 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll5.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 6 -> {
                        Random randomRoll6 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll6.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 7 -> {
                        Random randomRoll7 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll7.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 8 -> {
                        Random randomRoll8 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll8.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 9 -> {
                        Random randomRoll9 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll9.nextInt(11);
                            
                           System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 10 -> {
                        Random randomRoll10 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll10.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 11 -> {
                        Random randomRoll1 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll1.nextInt(11);
                            
                             System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 12 -> {
                        Random randomRoll12 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll12.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 13 -> {
                        Random randomRoll14 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll14.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 14 -> {
                        Random randomRoll15 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll15.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 15 -> {
                        Random randomRoll16 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll16.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 16 -> {
                        Random randomRoll17 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll17.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 17 -> {
                        Random randomRoll18 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll18.nextInt(11);
                            
                            System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 18 -> {
                        Random randomRoll19 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll19.nextInt(11);
                            
                             System.out.println("\nClass: Fighter");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                        }
                      }
                    default -> {
                      }
                }       }
            case 6 -> {
                
                passToRoll = 1;
                
                switch (passToRoll) {
                    case 1 -> {
                        Random randomRoll = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll.nextInt(9);
                            
                            System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                             
                        }
                        
                      }
                    
                    case 2 -> {
                        Random randomRoll2 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll2.nextInt(9);
                            
                            System.out.println("\nClass: Monk");
                             
                            System.out.println("\nHit Points: "+(rand3 + 2 + randomRollClass1));
                            
                        }
                        
                      }
                    case 3 -> {
                        Random randomRoll3 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll3.nextInt(9);
                            
                           System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 4 -> {
                        Random randomRoll4 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll4.nextInt(9);
                            
                            System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 5 -> {
                        Random randomRoll5 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll5.nextInt(9);
                            
                            System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 6 -> {
                        Random randomRoll6 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll6.nextInt(9);
                            
                           System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 7 -> {
                        Random randomRoll7 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll7.nextInt(9);
                            
                           System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 8 -> {
                        Random randomRoll8 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll8.nextInt(9);
                            
                           System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 9 -> {
                        Random randomRoll9 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll9.nextInt(9);
                            
                           System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 10 -> {
                        Random randomRoll10 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll10.nextInt(9);
                            
                            System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 11 -> {
                        Random randomRoll1 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll1.nextInt(9);
                            
                            System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 12 -> {
                        Random randomRoll12 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll12.nextInt(9);
                            
                            System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 13 -> {
                        Random randomRoll14 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll14.nextInt(9);
                            
                            System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 14 -> {
                        Random randomRoll15 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll15.nextInt(9);
                            
                            System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 15 -> {
                        Random randomRoll16 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll16.nextInt(9);
                            
                             System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 16 -> {
                        Random randomRoll17 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll17.nextInt(9);
                            
                             System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 17 -> {
                        Random randomRoll18 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll18.nextInt(9);
                            
                            System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 18 -> {
                        Random randomRoll19 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll19.nextInt(9);
                            
                            System.out.println("\nClass: Monk");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                        }
                      }
                    default -> {
                      }
                }       }
            case 7 -> {
                
                passToRoll = 1;
                
                switch (passToRoll) {
                    case 1 -> {
                        Random randomRoll = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll.nextInt(11);
                            
                            System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                             
                        }
                        
                      }
                    
                    case 2 -> {
                        Random randomRoll2 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll2.nextInt(11);
                            
                            System.out.println("\nClass: Paladin");
                             
                            System.out.println("\nHit Points: "+(rand3 + 2 + randomRollClass1));
                            
                        }
                        
                      }
                    case 3 -> {
                        Random randomRoll3 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll3.nextInt(11);
                            
                            System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 4 -> {
                        Random randomRoll4 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll4.nextInt(11);
                            
                            System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 5 -> {
                        Random randomRoll5 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll5.nextInt(11);
                            
                            System.out.println("\nClass: Paladin");;
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 6 -> {
                        Random randomRoll6 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll6.nextInt(11);
                            
                            System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 7 -> {
                        Random randomRoll7 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll7.nextInt(11);
                            
                            System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 8 -> {
                        Random randomRoll8 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll8.nextInt(11);
                            
                            System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 9 -> {
                        Random randomRoll9 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll9.nextInt(11);
                            
                           System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 10 -> {
                        Random randomRoll10 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll10.nextInt(11);
                            
                             System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 11 -> {
                        Random randomRoll1 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll1.nextInt(11);
                            
                             System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 12 -> {
                        Random randomRoll12 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll12.nextInt(11);
                            
                            System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 13 -> {
                        Random randomRoll14 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll14.nextInt(11);
                            
                             System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 14 -> {
                        Random randomRoll15 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll15.nextInt(11);
                            
                             System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 15 -> {
                        Random randomRoll16 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll16.nextInt(11);
                            
                             System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 16 -> {
                        Random randomRoll17 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll17.nextInt(11);
                            
                             System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 17 -> {
                        Random randomRoll18 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){

                            int randomRollClass1 = randomRoll18.nextInt(11);
                            
                            System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 18 -> {
                        Random randomRoll19 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll19.nextInt(11);
                            
                            System.out.println("\nClass: Paladin");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                        }
                      }
                    default -> {
                      }
                }       }
            case 8 -> {
                
                passToRoll = 1;
                
                switch (passToRoll) {
                    case 1 -> {
                        Random randomRoll = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll.nextInt(11);
                            
                            System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                             
                        }
                        
                      }
                    
                    case 2 -> {
                        Random randomRoll2 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll2.nextInt(11);
                            
                             System.out.println("\nClass: Ranger");
                             
                            System.out.println("\nHit Points: "+(rand3 + 2 + randomRollClass1));
                            
                        }
                        
                      }
                    case 3 -> {
                        Random randomRoll3 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll3.nextInt(11);
                            
                             System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 4 -> {
                        Random randomRoll4 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll4.nextInt(11);
                            
                             System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 5 -> {
                        Random randomRoll5 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll5.nextInt(11);
                            
                            System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 6 -> {
                        Random randomRoll6 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll6.nextInt(11);
                            
                            System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 7 -> {
                        Random randomRoll7 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll7.nextInt(11);
                            
                           System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 8 -> {
                        Random randomRoll8 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll8.nextInt(11);
                            
                            System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 9 -> {
                        Random randomRoll9 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll9.nextInt(11);
                            
                           System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 10 -> {
                        Random randomRoll10 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll10.nextInt(11);
                            
                             System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 11 -> {
                        Random randomRoll1 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll1.nextInt(11);
                            
                              System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 12 -> {
                        Random randomRoll12 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll12.nextInt(11);
                            
                             System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 13 -> {
                        Random randomRoll14 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll14.nextInt(11);
                            
                             System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 14 -> {
                        Random randomRoll15 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll15.nextInt(11);
                            
                             System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 15 -> {
                        Random randomRoll16 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll16.nextInt(11);
                            
                              System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 16 -> {
                        Random randomRoll17 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll17.nextInt(11);
                            
                             System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 17 -> {
                        Random randomRoll18 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll18.nextInt(11);
                            
                             System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 18 -> {
                        Random randomRoll19 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll19.nextInt(11);
                            
                             System.out.println("\nClass: Ranger");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                        }
                      }
                    default -> {
                      }
                }       }
            case 9 -> {
                
                passToRoll = 1;
                
                switch (passToRoll) {
                    case 1 -> {
                        Random randomRoll = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll.nextInt(9);
                            
                            System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                             
                        }
                        
                      }
                    
                    case 2 -> {
                        Random randomRoll2 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll2.nextInt(9);
                            
                           System.out.println("\nClass: Rogue ");
                             
                            System.out.println("\nHit Points: "+(rand3 + 2 + randomRollClass1));
                            
                        }
                        
                      }
                    case 3 -> {
                        Random randomRoll3 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll3.nextInt(9);
                            
                            System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 4 -> {
                        Random randomRoll4 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll4.nextInt(9);
                            
                            System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 5 -> {
                        Random randomRoll5 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll5.nextInt(9);
                            
                            System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 6 -> {
                        Random randomRoll6 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll6.nextInt(9);
                            
                            System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 7 -> {
                        Random randomRoll7 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll7.nextInt(9);
                            
                            System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 8 -> {
                        Random randomRoll8 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll8.nextInt(9);
                            
                            System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 9 -> {
                        Random randomRoll9 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll9.nextInt(9);
                            
                            System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 10 -> {
                        Random randomRoll10 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll10.nextInt(9);
                            
                             System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 11 -> {
                        Random randomRoll1 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll1.nextInt(9);
                            
                             System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 12 -> {
                        Random randomRoll12 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll12.nextInt(9);
                            
                             System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 13 -> {
                        Random randomRoll14 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll14.nextInt(9);
                            
                             System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 14 -> {
                        Random randomRoll15 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll15.nextInt(9);
                            
                            System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 15 -> {
                        Random randomRoll16 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll16.nextInt(9);
                            
                            System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 16 -> {
                        Random randomRoll17 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll17.nextInt(9);
                            
                             System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 17 -> {
                        Random randomRoll18 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll18.nextInt(9);
                            
                            System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 18 -> {
                        Random randomRoll19 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll19.nextInt(9);
                            
                             System.out.println("\nClass: Rogue ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                        }
                      }
                    default -> {
                      }
                }       }
            case 10 -> {
                
                passToRoll = 1;
                
                switch (passToRoll) {
                    case 1 -> {
                        Random randomRoll = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll.nextInt(7);
                            
                           System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                             
                        }
                        
                      }
                    
                    case 2 -> {
                        Random randomRoll2 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll2.nextInt(7);
                            
                            System.out.println("\nClass: Sorcerer ");
                             
                            System.out.println("\nHit Points: "+(rand3 + 2 + randomRollClass1));
                            
                        }
                        
                      }
                    case 3 -> {
                        Random randomRoll3 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll3.nextInt(7);
                            
                           System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 4 -> {
                        Random randomRoll4 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll4.nextInt(7);
                            
                           System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 5 -> {
                        Random randomRoll5 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll5.nextInt(7);
                            
                            System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 6 -> {
                        Random randomRoll6 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll6.nextInt(7);
                            
                            System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 7 -> {
                        Random randomRoll7 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll7.nextInt(7);
                            
                           System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 8 -> {
                        Random randomRoll8 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll8.nextInt(7);
                            
                           System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 9 -> {
                        Random randomRoll9 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll9.nextInt(7);
                            
                           System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 10 -> {
                        Random randomRoll10 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll10.nextInt(7);
                            
                             System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 11 -> {
                        Random randomRoll1 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll1.nextInt(7);
                            
                             System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 12 -> {
                        Random randomRoll12 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll12.nextInt(7);
                            
                             System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 13 -> {
                        Random randomRoll14 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll14.nextInt(7);
                            
                             System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 14 -> {
                        Random randomRoll15 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll15.nextInt(7);
                            
                             System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 15 -> {
                        Random randomRoll16 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll16.nextInt(7);
                            
                             System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 16 -> {
                        Random randomRoll17 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll17.nextInt(7);
                            
                             System.out.println("\nClass: Barbarian ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 17 -> {
                        Random randomRoll18 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll18.nextInt(7);
                            
                            System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 18 -> {
                        Random randomRoll19 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll19.nextInt(7);
                            
                            System.out.println("\nClass: Sorcerer ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                        }
                      }
                    default -> {
                      }
                }       }
            case 11 -> {
                
                passToRoll = 1;
                
                switch (passToRoll) {
                    case 1 -> {
                        Random randomRoll = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll.nextInt(9);
                            
                            System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                             
                        }
                        
                      }
                    
                    case 2 -> {
                        Random randomRoll2 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll2.nextInt(9);
                            
                             System.out.println("\nClass: Warlock ");
                             
                            System.out.println("\nHit Points: "+(rand3 + 2 + randomRollClass1));
                            
                        }
                        
                      }
                    case 3 -> {
                        Random randomRoll3 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll3.nextInt(9);
                            
                            System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 4 -> {
                        Random randomRoll4 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll4.nextInt(9);
                            
                            System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 5 -> {
                        Random randomRoll5 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll5.nextInt(9);
                            
                            System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 6 -> {
                        Random randomRoll6 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll6.nextInt(9);
                            
                           System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 7 -> {
                        Random randomRoll7 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll7.nextInt(9);
                            
                            System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 8 -> {
                        Random randomRoll8 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll8.nextInt(9);
                            
                             System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 9 -> {
                        Random randomRoll9 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll9.nextInt(9);
                            
                            System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 10 -> {
                        Random randomRoll10 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll10.nextInt(9);
                            
                             System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 11 -> {
                        Random randomRoll1 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll1.nextInt(9);
                            
                              System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 12 -> {
                        Random randomRoll12 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll12.nextInt(9);
                            
                             System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 13 -> {
                        Random randomRoll14 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll14.nextInt(9);
                            
                             System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 14 -> {
                        Random randomRoll15 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll15.nextInt(9);
                            
                             System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 15 -> {
                        Random randomRoll16 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll16.nextInt(9);
                            
                            System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 16 -> {
                        Random randomRoll17 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll17.nextInt(9);
                            
                             System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 17 -> {
                        Random randomRoll18 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll18.nextInt(9);
                            
                             System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 18 -> {
                        Random randomRoll19 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll19.nextInt(9);
                            
                             System.out.println("\nClass: Warlock ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                        }
                      }
                    default -> {
                      }
                }       }
            case 12 -> {
                
                passToRoll = 1;
                
                switch (passToRoll) {
                    case 1 -> {
                        Random randomRoll = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll.nextInt(7);
                            
                             System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                             
                        }
                        
                      }
                    
                    case 2 -> {
                        Random randomRoll2 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll2.nextInt(7);
                            
                           System.out.println("\nClass: Wizard ");
                             
                            System.out.println("\nHit Points: "+(rand3 + 2 + randomRollClass1));
                            
                        }
                        
                      }
                    case 3 -> {
                        Random randomRoll3 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll3.nextInt(7);
                            
                            System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 4 -> {
                        Random randomRoll4 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll4.nextInt(7);
                            
                            System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 5 -> {
                        Random randomRoll5 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll5.nextInt(7);
                            
                           System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 6 -> {
                        Random randomRoll6 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll6.nextInt(7);
                            
                           System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 7 -> {
                        Random randomRoll7 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll7.nextInt(7);
                            
                           System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 8 -> {
                        Random randomRoll8 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll8.nextInt(7);
                            
                            System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 9 -> {
                        Random randomRoll9 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll9.nextInt(7);
                            
                            System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 10 -> {
                        Random randomRoll10 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll10.nextInt(7);
                            
                            System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 11 -> {
                        Random randomRoll1 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll1.nextInt(7);
                            
                            System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 12 -> {
                        Random randomRoll12 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll12.nextInt(7);
                            
                             System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 13 -> {
                        Random randomRoll14 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll14.nextInt(7);
                            
                             System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 14 -> {
                        Random randomRoll15 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll15.nextInt(7);
                            
                            System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 15 -> {
                        Random randomRoll16 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll16.nextInt(7);
                            
                            System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 16 -> {
                        Random randomRoll17 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll17.nextInt(7);
                            
                            System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                            
                        }
                      }
                    case 17 -> {
                        Random randomRoll18 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll18.nextInt(7);
                            
                            System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + 1 + randomRollClass1));
                            
                        }
                      }
                    case 18 -> {
                        Random randomRoll19 = new Random();
                        
                        for (int iCount1 = 0; iCount1< 1; iCount1++){
                            
                            int randomRollClass1 = randomRoll19.nextInt(7);
                            
                            System.out.println("\nClass: Wizard ");
                            
                            System.out.println("\nHit Points: "+(rand3 + randomRollClass1));
                        }
                      }
                    default -> {
                      }
                }       }
    }
            }
    }
}
        

           