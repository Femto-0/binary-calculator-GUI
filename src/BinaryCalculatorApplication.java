import java.awt.*;

public class BinaryCalculatorApplication {


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                BinaryCalculatorModel frame = new BinaryCalculatorModel();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
