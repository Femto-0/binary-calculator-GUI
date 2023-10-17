import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextArea;

public class ResultDisplay extends JFrame {

    private JPanel contentPane;
    private JPanel panel;
    private JTextArea textArea;

    /**
     * Create the frame.
     */
    public ResultDisplay() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        panel = new JPanel();
        contentPane.add(panel, BorderLayout.CENTER);

        textArea = new JTextArea();
        textArea.setRows(10);
        textArea.setColumns(30);
        panel.add(textArea);
        setVisible(true);
    }


    public void display(double result) {
        textArea.setText("");
        textArea.setText("Result:"+ result);

    }


}

