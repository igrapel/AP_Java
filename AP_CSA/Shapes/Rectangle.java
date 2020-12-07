
package classes;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author grape
 */
public class Rectangle {
    public int x;
    public int y;
    public int width, height;

    public Rectangle(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        width = w;
        height = h;
    }

    public static void main(String[] args) {
        
        Rectangle box = new Rectangle(25, 50, 50, 30);

    // New stuff - Create a program window and set it up.
    JFrame window = new JFrame();

    // Tell Swing to exit the program when the program window is closed.
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Set the window boundaries to be 300x300 on the screen, and position it 30 pixels from the top and left edges of the monitor.
    window.setBounds(30, 30, 300, 300);

    // Get the content pane of the window, and give it our own custom component.
    window.getContentPane().add(new JComponent() {  // Not a typo - this is some advanced magic called an "anonymous class".
        Rectangle myBox = box;    // Give the component a reference to our box object.
        public void paint(Graphics g) {
            g.drawRect(myBox.x, myBox.y, myBox.width, myBox.height);
        }
    });

    // Make our window appear.
    window.setVisible(true);
    }

    // Here is our toString method.
    // It's declared as an @Override, which means it overrides the toString method provided by the class that Rectangle is based on (in this case, java.lang.Object).
    // The method is in the public scope, returns a String-type value, and is called toString. It doesn't have parameters, so it gets empty parentheses.
    @Override
    public String toString() {
        // Now, we have to return a value from this method.

        // Start by declaring a local variable and filling it with some data.
        String stringValue = "Rectangle with location {";

        // We can "add" strings together to form a bigger string with the contents mashed next to each other (aka "concatenated").
        stringValue = stringValue + this.x + ",";

        // By "adding" this.y (the current object's y property) to a string, it also gets converted from an integer to a string without us needing to say anything special.
        stringValue = stringValue + this.y + "}";

        // We can take some shortcuts, too, by using the += operator so we don't have to rewrite stringValue twice every time!
        stringValue += ", width: " + this.width;

        // Remember, we don't need to use "this" when the name is not ambiguous, but it typically makes it clearer that some data is coming from the object instead of a local variable.
        stringValue += ", height: " + height;

        // Once we have a result value and no other code needs to be executed, we have to *return* it as the result of the method. Constructors and methods with "void" as their return type do not do this (though void methods can just say "return;")
        return stringValue;
    }
    
    
}
