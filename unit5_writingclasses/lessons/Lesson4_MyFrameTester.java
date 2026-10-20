/*
 * Author: Zia M
 * Date: Oct 20, 2026
 * Topic: instance variable as reference variabel Java Builtin
 */
public class Lesson4_MyFrameTester {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame {
    JFrame f;
    JButton b1;
    JButton b2;

    MyFrame() {
        f=new JFrame("This is a window");
        b1=new JButton("Press");
        b1.setBounds(150, 150, 100, 40);
        b2=new JButton("Press");
        b2.setBounds(150, 250, 100, 40);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.add(b1);
        frame.add(b2);
        frame.setVisible(true);
    }
}
