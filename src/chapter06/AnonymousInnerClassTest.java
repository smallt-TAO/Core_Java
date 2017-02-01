package chapter06;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * This program demonstrates anonymous inner classes.
 * @version 1.10
 * @author Smalltao
 *
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
    	TalkingClock clock = new TalkingClock();
    	clock.start(1000, true);
    	
    	JOptionPane.showMessageDialog(null, "Quit program?");
    	System.exit(0);
    }
}

/**
 * A clock that prints the time in regular intervals.
 */
class TalkingClock {
	/**
	 * Start the clock.
	 * @param interval the interval between messages (inmilliseconds)
	 * @param beep true if the clock should beep
	 */
	public void start(int interval, final boolean beep) {
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Date now = new Date();
				System.out.println("At the tone, the time is " + now);
				if (beep) Toolkit.getDefaultToolkit().beep();
			}
		};
		Timer t = new Timer(interval, listener);
		t.start();
	}
}
