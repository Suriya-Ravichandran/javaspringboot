package abi;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class proj2 extends JFrame implements ActionListener {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public proj2() {
        this.setTitle("Login Page");
        this.setLayout(new GridLayout(30, 20));

        usernameField = new JTextField();
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        loginButton.addActionListener(this);

        this.add(new JLabel("Username:"));
        this.add(usernameField);
        this.add(new JLabel("Password:"));
        this.add(passwordField);
        this.add(loginButton);

        this.setSize(300,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new proj2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = String.valueOf(passwordField.getPassword());

        // For simplicity, let's use a hardcoded username and password
        if (username.equals("abi") && password.equals("user")) {
            showSuccessfulLoginPage();
        } else {
            JOptionPane.showMessageDialog(this, "Login Failed. Please try again.");
        }
    }

    private void showSuccessfulLoginPage() {
        // Close the login page
        this.dispose();

        // Create and display a successful login page
        JFrame successFrame = new JFrame("Successful Login Page");
        successFrame.setLayout(new FlowLayout());
        JLabel successLabel = new JLabel("Welcome! Login successful.");
        successFrame.add(successLabel);

        successFrame.setSize(250,100);
        successFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        successFrame.setVisible(true);
    }
}