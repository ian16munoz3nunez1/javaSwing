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
        this.setTitle("Suma de numeros");
        this.setMinimumSize(new Dimension(300, 300));
        this.setLocationRelativeTo(null);

        this.init();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void init() {
        jpanel = new JPanel();
        jlLado = new JLabel();
        jlResultado = new JLabel();
        jsLado = new JSpinner();
        jbSuma = new JButton();

        jlLado.setText("Medida del lado:");
        jlLado.setHorizontalAlignment(SwingConstants.CENTER);

        jsLado.setModel(new SpinnerNumberModel(0.0f, 0.0f, 500.0f, 0.1f));
        jsLado.setValue(0.0f);

        jlResultado.setText("Area:");
        jlResultado.setHorizontalAlignment(SwingConstants.CENTER);

        jbSuma.setText("Calcular area");
        jbSuma.addActionListener(this);

        GroupLayout jpanelLayout = new GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.TRAILING)
                    .addComponent(jbSuma, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlResultado, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlLado, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jsLado)
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
                    .addComponent(jlLado)
                    .addComponent(jsLado)
                )
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jbSuma)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jlResultado)
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
        if(e.getSource() == jbSuma) {
            double lado = (double)jsLado.getValue();
            double area = lado * lado;
            jlResultado.setText("Resultado: " + area);
        }
    }

    private JPanel jpanel;
    private JLabel jlLado;
    private JLabel jlResultado;
    private JSpinner jsLado;
    private JButton jbSuma;
}

