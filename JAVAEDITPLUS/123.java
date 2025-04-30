import javax.swing.*;
import java.awt.*;
import java.util.Random;

class panel_area extends JPanel {
    JButton[][] Area_b;

    panel_area() {
        int row = 10;
        int col = 20;
        setBounds(300, 50, 718, 400);
        setLayout(new GridLayout(row, col, 1, 1));
        setBackground(Color.CYAN);
        Area_b = new JButton[row][col]; // Initialize the 2D array

        Random rand = new Random();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Area_b[i][j] = new JButton();
                int randomNumber = rand.nextInt(5001); // Generates a random number between 0 and 5000
                Area_b[i][j].setText(String.valueOf(randomNumber)); // Set the button text to the random number
                add(Area_b[i][j]);
            }
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new panel_area());
        frame.setVisible(true);
    }
}
