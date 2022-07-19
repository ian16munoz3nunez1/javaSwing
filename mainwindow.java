import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import javax.swing.WindowConstants;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import java.awt.Dimension;
import java.awt.event.*;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class mainwindow extends JFrame implements ActionListener {
    public mainwindow() {
        Image icono = new ImageIcon(getClass().getResource("nomina.png")).getImage();
        this.setTitle("Nomina");
        this.setIconImage(icono);
        this.setMinimumSize(new Dimension(400, 400));
        this.setLocationRelativeTo(null);

        this.init();
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void init() {
        jpanel = new JPanel();

        jlNombre = new JLabel();
        jlEmpresa = new JLabel();
        jlFecha = new JLabel();
        jlHorasTrabajadas = new JLabel();
        jlCostoHora = new JLabel();

        jtfNombre = new JTextField();
        jtfEmpresa = new JTextField();

        jsFecha = new JSpinner();
        jsHorasTrabajadas = new JSpinner();
        jsCostoHora = new JSpinner();

        jbNomina = new JButton();

        jlNombre.setText("Nombre:");
        jlNombre.setHorizontalAlignment(SwingConstants.CENTER);
        jlEmpresa.setText("Empresa:");
        jlEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
        jlFecha.setText("Fecha:");
        jlFecha.setHorizontalAlignment(SwingConstants.CENTER);
        jlHorasTrabajadas.setText("Horas trabajadas:");
        jlCostoHora.setText("Costo por hora:");
        jlCostoHora.setHorizontalAlignment(SwingConstants.CENTER);

        GregorianCalendar calendario = new GregorianCalendar();
        Date initDate = calendario.getTime();
        calendario.add(Calendar.YEAR, -100);
        Date earliestDate = calendario.getTime();
        calendario.add(Calendar.YEAR, 200);
        Date latestDate = calendario.getTime();
        SpinnerDateModel dateModel = new SpinnerDateModel(initDate, earliestDate, latestDate, Calendar.YEAR);
        jsFecha.setModel(dateModel);
        jsFecha.setEditor(new JSpinner.DateEditor(jsFecha, "dd/MM/yyyy"));

        jsHorasTrabajadas.setModel(new SpinnerNumberModel(0, 0, 60, 1));
        jsCostoHora.setModel(new SpinnerNumberModel(0.0f, 0.0f, 500.0f, 0.1f));

        jbNomina.setText("Nomina");
        jbNomina.addActionListener(this);

        int defaultSize = GroupLayout.DEFAULT_SIZE;
        int maxValue = Short.MAX_VALUE;
        GroupLayout jpanelLayout = new GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addContainerGap(defaultSize, maxValue)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.TRAILING)
                    .addComponent(jbNomina, defaultSize, defaultSize, maxValue)
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlNombre, 50, 100, maxValue)
                        .addGap(18, 18, maxValue)
                        .addComponent(jtfNombre, 50, 100, maxValue)
                    )
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlEmpresa, 50, 100, maxValue)
                        .addGap(18, 18, maxValue)
                        .addComponent(jtfEmpresa, 50, 100, maxValue)
                    )
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlFecha, 50, 100, maxValue)
                        .addGap(18, 18, maxValue)
                        .addComponent(jsFecha, 50, 100, maxValue)
                    )
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlHorasTrabajadas, 50, 100, maxValue)
                        .addGap(18, 18, maxValue)
                        .addComponent(jsHorasTrabajadas, 50, 100, maxValue)
                    )
                    .addGroup(Alignment.LEADING, jpanelLayout.createSequentialGroup()
                        .addComponent(jlCostoHora, 50, 100, maxValue)
                        .addGap(18, 18, maxValue)
                        .addComponent(jsCostoHora, 50, 100, maxValue)
                    )
                )
                .addContainerGap(defaultSize, maxValue)
            )
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addGroup(jpanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(jtfNombre)
                )
                .addGap(18, 18, maxValue)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jlEmpresa)
                    .addComponent(jtfEmpresa)
                )
                .addGap(18, 18, maxValue)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jlFecha)
                    .addComponent(jsFecha)
                )
                .addGap(18, 18, maxValue)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jlHorasTrabajadas)
                    .addComponent(jsHorasTrabajadas)
                )
                .addGap(18, 18, maxValue)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(jlCostoHora)
                    .addComponent(jsCostoHora)
                )
                .addGap(18, 18, maxValue)
                .addComponent(jbNomina, defaultSize, defaultSize, maxValue)
                .addContainerGap(defaultSize, maxValue)
            )
        );

        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel, defaultSize, defaultSize, maxValue)
                .addContainerGap()
            )
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel, defaultSize, defaultSize, maxValue)
                .addContainerGap()
            )
        );

        pack();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jbNomina) {
            String nombre = jtfNombre.getText().toUpperCase();
            String empresa = jtfEmpresa.getText().toUpperCase();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            String fecha = sdf.format(jsFecha.getValue());
            int horasTrabajadas = (int)jsHorasTrabajadas.getValue();
            double costoHora = (double)jsCostoHora.getValue();
            Nomina nomina = new Nomina(nombre, empresa, fecha, horasTrabajadas, costoHora);
            nomina.setVisible(true);
        }
    }

    private JPanel jpanel;

    private JLabel jlNombre;
    private JLabel jlEmpresa;
    private JLabel jlFecha;
    private JLabel jlHorasTrabajadas;
    private JLabel jlCostoHora;

    private JTextField jtfNombre;
    private JTextField jtfEmpresa;

    private JSpinner jsFecha;
    private JSpinner jsHorasTrabajadas;
    private JSpinner jsCostoHora;

    private JButton jbNomina;
}

