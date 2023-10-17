import java.awt.EventQueue;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.util.Objects;

public class BinaryCalculator extends JFrame{

    private JPanel contentPane;
    private JPanel panel;
    private static JTextField txtInputFirst;
    private static JTextField txtInputSecond;
    private JPanel panel_1;
    private JButton btnAdd;
    private JButton btnSubtract;
    private JButton btnDivide;
    private JButton btnMultiply;
    private double result;

    //something extra
    ImageIcon image;


    ResultDisplay obj= new ResultDisplay();
    private JPanel panel_2;
    private JLabel lblImageDisplay;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                BinaryCalculator frame = new BinaryCalculator();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public BinaryCalculator() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        panel = new JPanel();
        contentPane.add(panel, BorderLayout.NORTH);

        txtInputFirst = new JTextField();
        panel.add(txtInputFirst);
        txtInputFirst.setColumns(10);

        txtInputSecond = new JTextField();
        panel.add(txtInputSecond);
        txtInputSecond.setColumns(10);

        panel_1 = new JPanel();
        contentPane.add(panel_1, BorderLayout.CENTER);

        btnAdd = new JButton("Add");
        btnAdd.addActionListener(e -> addButtonPressed());
        panel_1.add(btnAdd);

        btnSubtract = new JButton("Subtract");
        btnSubtract.addActionListener(e -> subtractButtonPressed());
        panel_1.add(btnSubtract);

        btnDivide = new JButton("Divide");
        btnDivide.addActionListener(e -> divideButtonPressed());
        panel_1.add(btnDivide);

        btnMultiply = new JButton("Multiply");
        btnMultiply.addActionListener(e -> multiplyButtonPressed());
        panel_1.add(btnMultiply);

        panel_2 = new JPanel();
        contentPane.add(panel_2, BorderLayout.SOUTH);
        try{
            image= new ImageIcon(Objects.requireNonNull(getClass().getResource("math.jpeg"))); // to add a picture to the GUI
        }catch(Exception e){
            System.out.println("Null pointer exception");
        }
        lblImageDisplay = new JLabel(image);
        panel_2.add(lblImageDisplay);


    }

    protected void divideButtonPressed() {
        double a= Double.parseDouble(txtInputFirst.getText());
        double b= Double.parseDouble(txtInputSecond.getText());
        result= a/b;
        obj.display(result);
        dispose();
    }

    protected void multiplyButtonPressed() {
        double a= Double.parseDouble(txtInputFirst.getText());
        double b= Double.parseDouble(txtInputSecond.getText());
        result= a*b;
        obj.display(result);
        dispose();
    }

    protected void subtractButtonPressed() {
        double a= Double.parseDouble(txtInputFirst.getText());
        double b= Double.parseDouble(txtInputSecond.getText());
        result= a-b;
        obj.display(result);
        dispose();
    }

    protected void addButtonPressed() {

        double a= Double.parseDouble(txtInputFirst.getText());
        double b= Double.parseDouble(txtInputSecond.getText());
        result= a+b;
        obj.display(result);
        dispose();
    }

}
