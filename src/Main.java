import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Run the GUI on the Event Dispatch Thread (best practice for Swing)
        SwingUtilities.invokeLater(() -> {
            ConverterGUI app = new ConverterGUI();
            app.setVisible(true);
        });
    }
}