import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

import javax.swing.WindowConstants;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Nomina extends JFrame {
    int horasTrabajadas;
    double costoHora, sueldoBase, impuesto, totalPagar;
    String nombre, empresa, fecha;
    public Nomina(String nombre, String empresa, String fecha, int horasTrabajadas, double costoHora) {
        Image icono = new ImageIcon(getClass().getResource("nomina.png")).getImage();
        this.nombre = nombre;
        this.empresa = empresa;
        this.fecha = fecha;
        this.horasTrabajadas = horasTrabajadas;
        this.costoHora = costoHora;

        this.setTitle("Resultados");
        this.setIconImage(icono);
        this.setMinimumSize(new Dimension(300, 400));
        this.setLocationRelativeTo(null);

        this.init();
    }

    private void init() {
        jpanel = new JPanel();

        jlNombre = new JLabel();
        jlEmpresa = new JLabel();
        jlFecha = new JLabel();
        jlHorasTrabajadas = new JLabel();
        jlCostoHora = new JLabel();
        jlSueldoBase = new JLabel();
        jlImpuesto = new JLabel();
        jlTotalPagar = new JLabel();

        jlNombre.setText("Nombre: " + this.nombre);
        jlNombre.setHorizontalAlignment(SwingConstants.CENTER);
        jlEmpresa.setText("Empresa: " + this.empresa);
        jlEmpresa.setHorizontalAlignment(SwingConstants.CENTER);
        jlFecha.setText("Fecha: " + this.fecha);
        jlFecha.setHorizontalAlignment(SwingConstants.CENTER);
        jlHorasTrabajadas.setText("Horas trabajadas: " + this.horasTrabajadas);
        jlHorasTrabajadas.setHorizontalAlignment(SwingConstants.CENTER);
        jlCostoHora.setText("Costo por hora: " + this.costoHora);
        jlCostoHora.setHorizontalAlignment(SwingConstants.CENTER);
        this.sueldoBase = this.horasTrabajadas * this.costoHora;
        this.impuesto = this.sueldoBase * (double)0.16;
        this.totalPagar = this.sueldoBase - this.impuesto;
        this.sueldoBase = this.horasTrabajadas * this.costoHora;
        this.impuesto = this.sueldoBase * 0.16;
        this.totalPagar = this.sueldoBase - this.impuesto;
        jlSueldoBase.setText("Sueldo base: " + this.sueldoBase);
        jlSueldoBase.setHorizontalAlignment(SwingConstants.CENTER);
        jlImpuesto.setText("Impuesto: " + this.impuesto);
        jlImpuesto.setHorizontalAlignment(SwingConstants.CENTER);
        jlTotalPagar.setText("Total a pagar: " + this.totalPagar);
        jlTotalPagar.setHorizontalAlignment(SwingConstants.CENTER);

        int defaultSize = GroupLayout.DEFAULT_SIZE;
        int maxValue = Short.MAX_VALUE;
        GroupLayout jpanelLayout = new GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addContainerGap(defaultSize, maxValue)
                .addGroup(jpanelLayout.createParallelGroup(Alignment.TRAILING)
                    .addComponent(jlNombre, defaultSize, defaultSize, maxValue)
                    .addComponent(jlEmpresa, defaultSize, defaultSize, maxValue)
                    .addComponent(jlFecha, defaultSize, defaultSize, maxValue)
                    .addComponent(jlHorasTrabajadas, defaultSize, defaultSize, maxValue)
                    .addComponent(jlCostoHora, defaultSize, defaultSize, maxValue)
                    .addComponent(jlSueldoBase, defaultSize, defaultSize, maxValue)
                    .addComponent(jlImpuesto, defaultSize, defaultSize, maxValue)
                    .addComponent(jlTotalPagar, defaultSize, defaultSize, maxValue)
                )
                .addContainerGap(defaultSize, maxValue)
            )
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(Alignment.LEADING)
            .addGroup(jpanelLayout.createSequentialGroup()
                .addContainerGap(defaultSize, maxValue)
                .addComponent(jlNombre)
                .addGap(18, 18, maxValue)
                .addComponent(jlEmpresa)
                .addGap(18, 18, maxValue)
                .addComponent(jlFecha)
                .addGap(18, 18, maxValue)
                .addComponent(jlHorasTrabajadas)
                .addGap(18, 18, maxValue)
                .addComponent(jlCostoHora)
                .addGap(18, 18, maxValue)
                .addComponent(jlSueldoBase)
                .addGap(18, 18, maxValue)
                .addComponent(jlImpuesto)
                .addGap(18, 18, maxValue)
                .addComponent(jlTotalPagar)
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

    private JPanel jpanel;

    private JLabel jlNombre;
    private JLabel jlEmpresa;
    private JLabel jlFecha;
    private JLabel jlHorasTrabajadas;
    private JLabel jlCostoHora;
    private JLabel jlSueldoBase;
    private JLabel jlImpuesto;
    private JLabel jlTotalPagar;
}

