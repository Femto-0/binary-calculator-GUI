import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;

public class BinaryCalculatorModel extends JFrame {

    private JPanel contentPane;
    private JPanel panel;
    private JLabel lblDisplay;
    private JTextField txtInput;
    private JButton btnSquare;
    private JButton btnSquareRoot;
    private JButton btnCube;
    private JPanel panel_2;
    private JButton btnLog2;
    private JButton btnLog10;
    private JButton btnCubeRoot;
    private JButton btnLog;
    private JPanel panel_1;
    private JTextArea txtDisplay;
    private double output;
    String is= " is ";


    /**
     * Create the frame.
     */
    public BinaryCalculatorModel() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        panel = new JPanel();
        contentPane.add(panel, BorderLayout.NORTH);

        lblDisplay = new JLabel("Enter number: ");
        panel.add(lblDisplay);

        txtInput = new JTextField();
        panel.add(txtInput);
        txtInput.setColumns(10);

        panel_2 = new JPanel();
        contentPane.add(panel_2, BorderLayout.CENTER);

        btnLog = new JButton("Log");
        btnLog.addActionListener(e -> logButtonPressed());
        panel_2.add(btnLog);

        btnLog2 = new JButton("Log 2");
        btnLog2.addActionListener(e -> log2ButtonPressed());
        panel_2.add(btnLog2);

        btnLog10 = new JButton("Log 10");
        btnLog10.addActionListener(e -> log10ButtonPressed());
        panel_2.add(btnLog10);

        btnSquare = new JButton("Square");
        btnSquare.addActionListener(e -> squareButtonPressed());
        panel_2.add(btnSquare);

        btnSquareRoot = new JButton("Square Root");
        btnSquareRoot.addActionListener(e -> squareRootButtonPressed());
        panel_2.add(btnSquareRoot);

        btnCube = new JButton("Cube");
        btnCube.addActionListener(e -> cubeButtonPressed());
        panel_2.add(btnCube);

        btnCubeRoot = new JButton("Cube Root");
        btnCubeRoot.addActionListener(e -> cubeRootButtonPressed());
        panel_2.add(btnCubeRoot);

        panel_1 = new JPanel();
        contentPane.add(panel_1, BorderLayout.WEST);

        txtDisplay = new JTextArea();
        txtDisplay.setRows(10);
        txtDisplay.setColumns(21);
        panel_1.add(txtDisplay);
    }

    protected void cubeRootButtonPressed() {
        double givenInput= Double.parseDouble(txtInput.getText());
        txtDisplay.setText("");
        output=  Math.pow(givenInput, ((double) 1 /3));
        txtDisplay.setText("Cube root of "+givenInput+ is+ output);
    }

    protected void cubeButtonPressed() {
        double givenInput= Double.parseDouble(txtInput.getText());
        txtDisplay.setText("");
        output= Math.pow(givenInput, 3);
        txtDisplay.setText("Cube of "+givenInput+is+ output);

    }

    protected void squareRootButtonPressed() {
        double givenInput= Double.parseDouble(txtInput.getText());
        txtDisplay.setText("");
        output= Math.pow(givenInput, ((double) 1 /2));
        txtDisplay.setText("Square root of "+givenInput+is+ output);


    }

    protected void squareButtonPressed() {
        double givenInput= Double.parseDouble(txtInput.getText());
        txtDisplay.setText("");
        output=  Math.pow(givenInput, 2);
        txtDisplay.setText("Square of "+givenInput+is+ output);


    }

    protected void log10ButtonPressed() {
        double givenInput= Double.parseDouble(txtInput.getText());
        txtDisplay.setText("");
        output= Math.log10(givenInput);
        txtDisplay.setText("Log base 10 of "+givenInput+is+ output);


    }

    protected void log2ButtonPressed() {
        double givenInput= Double.parseDouble(txtInput.getText());
        txtDisplay.setText("");
        output= Math.log(givenInput)/Math.log(2);
        txtDisplay.setText("Log base 2 of "+givenInput+is+ output);


    }

    protected void logButtonPressed() {
        double givenInput= Double.parseDouble(txtInput.getText());
        txtDisplay.setText("");
        output= Math.log(givenInput);
        txtDisplay.setText("Log of "+givenInput+" is: "+ output);


    }

}
