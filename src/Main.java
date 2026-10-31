import javax.swing.*;
import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread (best practice for Swing)
        SwingUtilities.invokeLater(() -> {
            ConverterGUI app = new ConverterGUI();
            ImageIcon img = new ImageIcon("src/icon.png");
            app.setIconImage(img.getImage());
            app.setVisible(true);
        });
    }
}