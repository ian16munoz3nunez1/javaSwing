import java.awt.Dimension;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;

public class MainWindow extends JFrame implements ActionListener {
    public MainWindow() {
        this.setTitle("Area de un circulo");
        this.setMinimumSize(new Dimension(300, 300));
        this.setLocationRelativeTo(null);

        this.init();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void init() {
        jpanel = new JPanel();
        jlRadio = new JLabel();
        jlArea = new JLabel();
        jsRadio = new JSpinner();
        jbArea = new JButton();

        jlRadio.setText("Radio:");
        jlRadio.setHorizontalAlignment(SwingConstants.CENTER);
        jlArea.setText("Area:");
        jlArea.setHorizontalAlignment(SwingConstants.CENTER);

        jsRadio.setModel(new SpinnerNumberModel(0.0f, 0.0f, 500.0f, 0.1f));
        jsRadio.setValue(0.0f);

        jbArea.setText("Calcular area");
        jbArea.addActionListener(this);

        GroupLayout jpanelLayout = new GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.TRAILING)
                    .addComponent(jbArea, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlArea, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlRadio, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jsRadio)
                    )
                )
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            )
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jlRadio)
                    .addComponent(jsRadio)
                )
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jbArea)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jlArea)
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

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbArea) {
            double radio = (double)jsRadio.getValue();
            double area = Math.PI * radio * radio;
            jlArea.setText("Area: " + area);
        }
    }

    private JPanel jpanel;
    private JLabel jlRadio;
    private JLabel jlArea;
    private JSpinner jsRadio;
    private JButton jbArea;
}

