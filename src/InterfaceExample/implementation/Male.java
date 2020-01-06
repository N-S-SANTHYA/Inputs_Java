package InterfaceExample.implementation;

import InterfaceExample.interfaces.Human;

/**
 * InterfaceExample.implementation.Male Implementation of InterfaceExample.interfaces.Human Interface
 */
public class Male implements Human {

    public Male() {
        System.out.println("################  Hi! I'm the male default constructor ###############");
    }

    /**
     * Overridden methods
     */
    @Override
    public void talk() {
        System.out.println("Hey! I'm a male and I can talk but I don't sound sweet!");
    }

    @Override
    public void see() {
        System.out.println("Hey! Who said a male can't see?");
    }

    @Override
    public void walk() {
        System.out.println("Male : I can say that I walk pretty much in a nice manner!");
    }

    @Override
    public void sleep() {
        System.out.println("Male : I sleep all the day!!");
    }
}
