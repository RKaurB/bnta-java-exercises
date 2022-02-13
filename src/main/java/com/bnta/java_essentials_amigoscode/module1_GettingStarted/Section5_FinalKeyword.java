//

package com.bnta.java_essentials_amigoscode.module1_GettingStarted;

import java.awt.*;

public class Section5_FinalKeyword {

    public static void main(String[] args) {

        var name = "Anna";

        // Then we can redefine the actual name and change the value as we want...
        name = "Alex";
        name = "Alexa";

        // The final keyword, however, tells it not to be able to change the original value once it's been initialised
        final var finalName = "Bob";
        // Now, we are unable to reassign/mutate the actual value of the original variable...
        // finalName = "Brenda";
        // Another example...
        final var number = 0;
        // number++;

        // The final keyword also works with Methods and Classes, which will look at later
        // For variables, it simply means that we cannot change the value once we assign it
        // So we should be using final when we know that things won't change, e.g. the number of PI
        final var numberPI = Math.PI;

        // This also works for classes
        // With objects, the final keyword is a bit different...
        final Point point = new Point(0, 0);
        // point = new Point(100, 100);
        // We can still change the attributes of the actual point, but what we're not allowed to do is to reassign it, i.e. saying = new Point (as above)
        point.x = 100;
        point.y = 100;

    }

}
