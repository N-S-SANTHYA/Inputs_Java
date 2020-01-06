package InterfaceExample.implementation;

import InterfaceExample.interfaces.Human;

/**
 * InterfaceExample.implementation.Female Implementation of InterfaceExample.interfaces.Human Interface
 */
public class Female implements Human {

    private String eyeColour;
    private String skinTone;
    private boolean canGiveBirth;

    public Female() {
        System.out.println("################ Hi! I'm the female default constructor! ###########");
    }

    public Female(final String eyeColour,
                  final String skinTone,
                  final boolean canGiveBirth) {
        System.out.println("################ Hi! I'm the female parameterised constructor!! ##################");
        this.eyeColour = eyeColour;
        this.skinTone = skinTone;
        this.canGiveBirth = canGiveBirth;
    }

    @Override
    public void talk() {
        System.out.println("Hey! I'm a female. I can talk and I sound sweet too!");
    }

    @Override
    public void see() {
        System.out.println("I am a female and can see very well!");
    }

    @Override
    public void walk() {
        System.out.println("Female : I can say that I walk pretty much in a nice manner!");
    }

    @Override
    public void sleep() {
        System.out.println("Female : Sleeping is my hobby too!!");
    }

    // Specific method for Female
    public void canGiveBirth() {
        if (this.canGiveBirth) {
            System.out.println("I can give birth!!");
        }
    }

    public void knowAboutMe() {
        System.out.println("Hi! I'm a female and My eye colour is " + this.eyeColour +
                " and skintone is " + this.skinTone);
    }
}
