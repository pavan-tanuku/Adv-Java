package abstractTopic;

import java.awt.event.TextEvent;

abstract class Television {
    // abstract methods.
    public abstract void wifiConnectivity();
    public abstract void dolbyAudio();

    // concrete methods
    public void display() {
        System.out.println("Television Display...");
    }
}

class Sony extends Television {
    public void wifiConnectivity() {
        System.out.println("Wifi Connectivity is added!");
    }
    public void dolbyAudio() {
        System.out.println("Added Dolby Audio!");
    }

    // added new feature
    public void oledDisplay() {
        System.out.println("The Display was enhanced to OLED display");
    }
}

public class Example1 {
    static void main(String[] args) {
        System.out.println("Created the object as Dynamic dispatch.");
        Television tv = new Sony();
        tv.display();
        tv.dolbyAudio();
        tv.wifiConnectivity();
        System.out.println("we cannot access the oledDisplay() method, because the reference is Parent.");
        System.out.println();

        // Down-casting to access the oledDisplay()
        System.out.println("Down-casting to access the oldeDisplay() and parent methods.");
        Sony tv2 = (Sony) tv;
        tv2.dolbyAudio();
        tv2.oledDisplay();
        tv2.wifiConnectivity();
        tv2.display();

    }
}
