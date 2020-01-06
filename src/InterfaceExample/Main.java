package InterfaceExample;

import InterfaceExample.implementation.Female;
import InterfaceExample.implementation.Male;
import InterfaceExample.interfaces.Human;

/**
 * Class to test the Interfaces and Methods created
 */
public class Main {
    public static void main(String args[]) {

        // Male InterfaceExample.implementation of Human interface
        Human male = new Male();
        male.see();
        male.sleep();
        male.talk();
        male.walk();

        System.out.println("\n");

        // Female InterfaceExample.implementation of Human interface
        Human female = new Female();
        female.see();
        female.sleep();
        female.talk();
        female.walk();

        System.out.println("\n");

        // Specific female InterfaceExample.implementation
        Female knowAboutFemale = new Female("brown", "wheatish", true);
        knowAboutFemale.canGiveBirth();
        knowAboutFemale.knowAboutMe();
    }
}
