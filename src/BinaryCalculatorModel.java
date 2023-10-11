import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BinaryCalculatorModel extends JFrame {

  private JLabel numberLabel;
  private JTextField inputNumber;
  private JButton log;
    private JButton log2;
    private JButton log10;
    private JButton cube;
    private JButton cubeRoot;
    private JButton square;
    private JButton squareRoot;
  private JButton performAllTasksButton;

  public BinaryCalculatorModel () {
    numberLabel = new JLabel();
    inputNumber = new JTextField();
    log = new JButton();
    log2 = new JButton();
    log10 = new JButton();
    cube = new JButton();
    cubeRoot = new JButton();
    square = new JButton();
    squareRoot = new JButton();
    performAllTasksButton = new JButton();
    add(numberLabel);
    add(inputNumber);
    add(log);
    add(log2);
    add(log10);
    add(cube);
    add(cubeRoot);
    add(square);
    add(squareRoot);
    add(performAllTasksButton);
    log.addActionListener(new PerformTask());
  }


  private class PerformTask implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {

    }
  }





}
