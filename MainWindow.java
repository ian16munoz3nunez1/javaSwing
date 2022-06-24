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
        this.setTitle("Area de un triangulo");
        this.setMinimumSize(new Dimension(300, 300));
        this.setLocationRelativeTo(null);

        this.init();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void init() {
        jpanel = new JPanel();
        jlBase = new JLabel();
        jlAltura = new JLabel();
        jlArea = new JLabel();
        jsBase = new JSpinner();
        jsAltura = new JSpinner();
        jbArea = new JButton();

        jlBase.setText("Base:");
        jlBase.setHorizontalAlignment(SwingConstants.CENTER);
        jlAltura.setText("Altura:");
        jlAltura.setHorizontalAlignment(SwingConstants.CENTER);
        jlArea.setText("Resultado:");
        jlArea.setHorizontalAlignment(SwingConstants.CENTER);

        jsBase.setModel(new SpinnerNumberModel(0.0f, 0.0f, 500.0f, 0.1f));
        jsBase.setValue(0.0f);
        jsAltura.setModel(new SpinnerNumberModel(0.0f, 0.0f, 500.0f, 0.1f));
        jsAltura.setValue(0.0f);

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
                        .addComponent(jlBase, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jsBase)
                    )
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlAltura, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jsAltura)
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
                    .addComponent(jlBase)
                    .addComponent(jsBase)
                )
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jlAltura)
                    .addComponent(jsAltura)
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
            double base = (double)jsBase.getValue();
            double altura = (double)jsAltura.getValue();
            double area = (base*altura)/2;
            jlArea.setText("Area: " + area);
        }
    }

    private JPanel jpanel;
    private JLabel jlBase;
    private JLabel jlAltura;
    private JLabel jlArea;
    private JSpinner jsBase;
    private JSpinner jsAltura;
    private JButton jbArea;
}

