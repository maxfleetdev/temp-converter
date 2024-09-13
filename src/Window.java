import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame{

    // Window Variables
    private final int X_SIZE;
    private final int Y_SIZE;
    private final String W_NAME;

    // GUI Variables
    private final JFrame frame;
    private final JTextField inputField = new JTextField(15);
    private final JButton fButton = new JButton("To Fahrenheit");
    private final JButton cButton = new JButton("To Celsius");

    // Constructor
    public Window(int x_size, int y_size, String name) {
        // Set Definitions
        this.X_SIZE = x_size;
        this.Y_SIZE = y_size;
        this.W_NAME = name;

        // Create & Define JFrame(Window)
        this.frame = new JFrame();
        setBounds(0, 0, x_size, y_size);
        setVisible(true);
        setTitle(W_NAME);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Add GUI Components
        add(inputField);
        add(cButton);
        add(fButton);

        // Set Actions
        setActionListeners();
    }

    public void setActionListeners() {
        // To Celsius
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inputField.getText();
                double result = Math.toCelsius(Double.parseDouble(text));
                JOptionPane.showMessageDialog(null, result + "C");
            }
        });

        // To Fahrenheit
        fButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = inputField.getText();
                double result = Math.toFahrenheit(Double.parseDouble(text));
                JOptionPane.showMessageDialog(null, result + "F");
            }
        });
    }
}
