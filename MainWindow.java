import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class MainWindow extends JFrame {
    public MainWindow() {
        this.setTitle("Hola mundo");
        this.setSize(300, 300);
        this.setMinimumSize(new Dimension(200, 200));
        this.setLocationRelativeTo(null);

        this.init();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void init() {
        jpanel = new JPanel();
        jlHolaMundo = new JLabel();

        jlHolaMundo.setText("Hola Mundo!!");
        jlHolaMundo.setFont(new Font("Tahoma", 0, 24));
        jlHolaMundo.setHorizontalAlignment(SwingConstants.CENTER);

        GroupLayout jpanelLayout = new GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlHolaMundo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            )
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlHolaMundo)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            )
        );

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap()
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap()
            )
        );

        pack();
    }

    private JPanel jpanel;
    private JLabel jlHolaMundo;
}

