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
        jlNumero1 = new JLabel();
        jlNumero2 = new JLabel();
        jlResultado = new JLabel();
        jsNumero1 = new JSpinner();
        jsNumero2 = new JSpinner();
        jbSuma = new JButton();

        jlNumero1.setText("Numero 1:");
        jlNumero1.setHorizontalAlignment(SwingConstants.CENTER);

        jlNumero2.setText("Numero 2:");
        jlNumero2.setHorizontalAlignment(SwingConstants.CENTER);

        jlResultado.setText("Resultado:");
        jlResultado.setHorizontalAlignment(SwingConstants.CENTER);

        jbSuma.setText("Sumar");
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
                        .addComponent(jlNumero1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jsNumero1)
                    )
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlNumero2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jsNumero2)
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
                    .addComponent(jlNumero1)
                    .addComponent(jsNumero1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jlNumero2)
                    .addComponent(jsNumero2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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
            int numero1 = (int)jsNumero1.getValue();
            int numero2 = (int)jsNumero2.getValue();
            jlResultado.setText("Resultado: " + (numero1+numero2));
            System.out.println(this.getHeight());
            System.out.println(this.getWidth());
        }
    }

    private JPanel jpanel;
    private JLabel jlNumero1;
    private JLabel jlNumero2;
    private JLabel jlResultado;
    private JSpinner jsNumero1;
    private JSpinner jsNumero2;
    private JButton jbSuma;
}

