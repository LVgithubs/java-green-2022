package ex13;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(600, 400); // width,height
        setVisible(true); // 화면에 보이게 한다
        setLocationRelativeTo(null); // 중앙으로 오도록 한다
        // 메뉴를 종료 시켜도 메인은 종료되지 않는다.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 메뉴를 종료 시키면 메인을 종료한다

        JPanel panel = (JPanel) getContentPane();
        // panel.setLayout(new BorderLayout());
        JButton btn1 = new JButton("버튼1");
        panel.add(btn1);
    }

}
