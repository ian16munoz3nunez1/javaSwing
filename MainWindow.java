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
import javax.swing.JTextField;

public class MainWindow extends JFrame implements ActionListener {
    public MainWindow() {
        this.setTitle("Boleta");
        this.setMinimumSize(new Dimension(400, 400));
        this.setLocationRelativeTo(null);

        this.init();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void init() {
        jpanel = new JPanel();

        jlEscuela = new JLabel();
        jlNombre = new JLabel();
        jlMatematicas = new JLabel();
        jlFisica = new JLabel();
        jlQuimica = new JLabel();
        jlBiologia = new JLabel();
        jlHistoria = new JLabel();

        jtfEscuela = new JTextField();
        jtfNombre = new JTextField();

        jsMatematicas = new JSpinner();
        jsFisica = new JSpinner();
        jsQuimica = new JSpinner();
        jsBiologia = new JSpinner();
        jsHistoria = new JSpinner();

        jbBoleta = new JButton();

        jlEscuela.setText("Escuela:");
        jlEscuela.setHorizontalAlignment(SwingConstants.CENTER);
        jlNombre.setText("Nombre:");
        jlNombre.setHorizontalAlignment(SwingConstants.CENTER);
        jlMatematicas.setText("Matematicas:");
        jlMatematicas.setHorizontalAlignment(SwingConstants.CENTER);
        jlFisica.setText("Fisica:");
        jlFisica.setHorizontalAlignment(SwingConstants.CENTER);
        jlQuimica.setText("Quimica:");
        jlQuimica.setHorizontalAlignment(SwingConstants.CENTER);
        jlBiologia.setText("Biologia:");
        jlBiologia.setHorizontalAlignment(SwingConstants.CENTER);
        jlHistoria.setText("Historia:");
        jlHistoria.setHorizontalAlignment(SwingConstants.CENTER);

        jsMatematicas.setModel(new SpinnerNumberModel(0, 0, 10, 1));
        jsMatematicas.setValue(0);
        jsFisica.setModel(new SpinnerNumberModel(0, 0, 10, 1));
        jsFisica.setValue(0);
        jsQuimica.setModel(new SpinnerNumberModel(0, 0, 10, 1));
        jsQuimica.setValue(0);
        jsBiologia.setModel(new SpinnerNumberModel(0, 0, 10, 1));
        jsBiologia.setValue(0);
        jsHistoria.setModel(new SpinnerNumberModel(0, 0, 10, 1));
        jsHistoria.setValue(0);

        jbBoleta.setText("Boleta");
        jbBoleta.addActionListener(this);

        GroupLayout jpanelLayout = new GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.TRAILING)
                    .addComponent(jbBoleta, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlEscuela, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jtfEscuela)
                    )
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlNombre, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jtfNombre)
                    )
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlMatematicas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jsMatematicas)
                    )
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlFisica, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jsFisica)
                    )
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlQuimica, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jsQuimica)
                    )
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlBiologia, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jsBiologia)
                    )
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlHistoria, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jsHistoria)
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
                    .addComponent(jlEscuela)
                    .addComponent(jtfEscuela, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtfNombre, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                )
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jlMatematicas)
                    .addComponent(jsMatematicas)
                )
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jlFisica)
                    .addComponent(jsFisica)
                )
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jlQuimica)
                    .addComponent(jsQuimica)
                )
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jlBiologia)
                    .addComponent(jsBiologia)
                )
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jlHistoria)
                    .addComponent(jsHistoria)
                )
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jbBoleta)
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
        if(e.getSource() == jbBoleta) {
            String escuela = jtfEscuela.getText();
            String nombre = jtfNombre.getText();
            int matematicas = (int)jsMatematicas.getValue();
            int fisica = (int)jsFisica.getValue();
            int quimica = (int)jsQuimica.getValue();
            int biologia = (int)jsBiologia.getValue();
            int historia = (int)jsHistoria.getValue();
            int promedio = (matematicas+fisica+quimica+biologia+historia)/5;

            System.out.println("Escuela: " + escuela);
            System.out.println("Nombre: " + nombre);
            System.out.println("Matematicas: " + matematicas);
            System.out.println("Fisica: " + fisica);
            System.out.println("Quimica: " + quimica);
            System.out.println("Biologia: " + biologia);
            System.out.println("Historia: " + historia);
            System.out.println("Promedio: " + promedio);
        }
    }

    private JPanel jpanel;

    private JLabel jlEscuela;
    private JLabel jlNombre;
    private JLabel jlMatematicas;
    private JLabel jlFisica;
    private JLabel jlQuimica;
    private JLabel jlBiologia;
    private JLabel jlHistoria;

    private JTextField jtfEscuela;
    private JTextField jtfNombre;

    private JSpinner jsMatematicas;
    private JSpinner jsFisica;
    private JSpinner jsQuimica;
    private JSpinner jsBiologia;
    private JSpinner jsHistoria;

    private JButton jbBoleta;
}

