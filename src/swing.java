import javax.swing.*;

public class swing {
    public swing() {
        JFrame jFrame = new JFrame("hello world");
        jFrame.setLayout(null);
        jFrame.setSize(400,20);
        jFrame.setVisible(true);
        JButton jButton = new JButton("CLICK ME");
        jButton.setBounds(50,50,100,20);
        jFrame.add(jButton);

    }

    public static void main(String[] args) {
        new swing();

    }
}
