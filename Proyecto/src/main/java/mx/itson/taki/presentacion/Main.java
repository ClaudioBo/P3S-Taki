package mx.itson.taki.presentacion;

import java.awt.Color;
import mx.itson.taki.acciones.Acciones;

public class Main extends javax.swing.JFrame {

    Acciones acc;

    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBuscador = new mx.itson.taki.utilerias.JPanelCircular();
        txtIngrese = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pnlInformacion = new mx.itson.taki.utilerias.JPanelCircular();
        lblUbicacion = new javax.swing.JLabel();
        lblMedida = new javax.swing.JLabel();
        lblTemp = new javax.swing.JLabel();
        pnlInfo = new javax.swing.JPanel();
        lblPresion = new javax.swing.JLabel();
        txt1 = new javax.swing.JLabel();
        lblViento = new javax.swing.JLabel();
        txt2 = new javax.swing.JLabel();
        lblHumedad = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        lblMinTemp = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        lblNubes = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        lblMaxTemp = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        pnlHoras = new javax.swing.JPanel();
        lblHoraLocal = new javax.swing.JLabel();
        lblZonaHoraria = new javax.swing.JLabel();
        Htxt1 = new javax.swing.JLabel();
        lblSalidaSol = new javax.swing.JLabel();
        Htxt2 = new javax.swing.JLabel();
        lblPuestaSol = new javax.swing.JLabel();
        Htxt3 = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBuscador.setColor1(new java.awt.Color(122, 152, 180));
        pnlBuscador.setColor2(new java.awt.Color(86, 105, 131));
        pnlBuscador.setGx(366.0F);
        pnlBuscador.setGy(51.0F);
        pnlBuscador.setRadio(600.0F);

        txtIngrese.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtIngrese.setForeground(new java.awt.Color(255, 255, 255));
        txtIngrese.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtIngrese.setText("Ingrese la ciudad a consultar:");

        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscadorLayout = new javax.swing.GroupLayout(pnlBuscador);
        pnlBuscador.setLayout(pnlBuscadorLayout);
        pnlBuscadorLayout.setHorizontalGroup(
            pnlBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscadorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnlBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIngrese, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBuscadorLayout.createSequentialGroup()
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBuscadorLayout.setVerticalGroup(
            pnlBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscadorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtIngrese)
                .addGap(0, 0, 0)
                .addGroup(pnlBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(txtInput))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getContentPane().add(pnlBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 799, -1));

        pnlInformacion.setGx(366.0F);
        pnlInformacion.setGy(421.0F);
        pnlInformacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUbicacion.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        lblUbicacion.setForeground(new java.awt.Color(255, 255, 255));
        lblUbicacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUbicacion.setText("Ciudad XX");
        pnlInformacion.add(lblUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 40, 280, -1));

        lblMedida.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        lblMedida.setForeground(new java.awt.Color(255, 255, 255));
        lblMedida.setText("°c");
        pnlInformacion.add(lblMedida, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, -1, -1));

        lblTemp.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        lblTemp.setForeground(new java.awt.Color(255, 255, 255));
        lblTemp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTemp.setText("-000");
        pnlInformacion.add(lblTemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 260, 110));

        pnlInfo.setBackground(new Color(0,0,0,0));

        lblPresion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPresion.setForeground(new java.awt.Color(255, 255, 255));
        lblPresion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPresion.setText("0000 hpa");

        txt1.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt1.setText("Presión atmosférica");

        lblViento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblViento.setForeground(new java.awt.Color(255, 255, 255));
        lblViento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViento.setText("0.00 m/s");

        txt2.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt2.setText("Viento");

        lblHumedad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblHumedad.setForeground(new java.awt.Color(255, 255, 255));
        lblHumedad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHumedad.setText("00%");

        txt3.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3.setText("Humedad");

        lblDireccion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(255, 255, 255));
        lblDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDireccion.setText("00°");

        txt4.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txt4.setForeground(new java.awt.Color(255, 255, 255));
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4.setText("Dirección");

        lblMinTemp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMinTemp.setForeground(new java.awt.Color(255, 255, 255));
        lblMinTemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinTemp.setText("00.00 °c");

        txt5.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txt5.setForeground(new java.awt.Color(255, 255, 255));
        txt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt5.setText("Temp. Minima");

        lblNubes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNubes.setForeground(new java.awt.Color(255, 255, 255));
        lblNubes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNubes.setText("00%");

        txt6.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txt6.setForeground(new java.awt.Color(255, 255, 255));
        txt6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt6.setText("Nubosidad");

        lblMaxTemp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMaxTemp.setForeground(new java.awt.Color(255, 255, 255));
        lblMaxTemp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMaxTemp.setText("00.00°c");

        txt7.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        txt7.setForeground(new java.awt.Color(255, 255, 255));
        txt7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt7.setText("Temp. Maxima");

        javax.swing.GroupLayout pnlInfoLayout = new javax.swing.GroupLayout(pnlInfo);
        pnlInfo.setLayout(pnlInfoLayout);
        pnlInfoLayout.setHorizontalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPresion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMinTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaxTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblViento, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNubes, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        pnlInfoLayout.setVerticalGroup(
            pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlInfoLayout.createSequentialGroup()
                            .addComponent(lblPresion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlInfoLayout.createSequentialGroup()
                            .addComponent(lblHumedad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(lblMinTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(lblMaxTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(lblViento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInfoLayout.createSequentialGroup()
                        .addComponent(lblNubes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnlInformacion.add(pnlInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 440, 110));

        pnlHoras.setBackground(new Color(0,0,0,30));

        lblHoraLocal.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblHoraLocal.setForeground(new java.awt.Color(255, 255, 255));
        lblHoraLocal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHoraLocal.setText("00:00");
        lblHoraLocal.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lblZonaHoraria.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblZonaHoraria.setForeground(new java.awt.Color(255, 255, 255));
        lblZonaHoraria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblZonaHoraria.setText("(GMT -7)");

        Htxt1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Htxt1.setForeground(new java.awt.Color(255, 255, 255));
        Htxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Htxt1.setText("Hora Local");

        lblSalidaSol.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblSalidaSol.setForeground(new java.awt.Color(255, 255, 255));
        lblSalidaSol.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalidaSol.setText("00:00");
        lblSalidaSol.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        Htxt2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Htxt2.setForeground(new java.awt.Color(255, 255, 255));
        Htxt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Htxt2.setText("Salida del sol");

        lblPuestaSol.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        lblPuestaSol.setForeground(new java.awt.Color(255, 255, 255));
        lblPuestaSol.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPuestaSol.setText("00:00");
        lblPuestaSol.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        Htxt3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Htxt3.setForeground(new java.awt.Color(255, 255, 255));
        Htxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Htxt3.setText("Puesta del sol");

        javax.swing.GroupLayout pnlHorasLayout = new javax.swing.GroupLayout(pnlHoras);
        pnlHoras.setLayout(pnlHorasLayout);
        pnlHorasLayout.setHorizontalGroup(
            pnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHorasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Htxt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Htxt3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPuestaSol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSalidaSol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHoraLocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Htxt1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblZonaHoraria)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        pnlHorasLayout.setVerticalGroup(
            pnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHorasLayout.createSequentialGroup()
                .addGroup(pnlHorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHorasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHoraLocal))
                    .addGroup(pnlHorasLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblZonaHoraria)))
                .addGap(0, 0, 0)
                .addComponent(Htxt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSalidaSol)
                .addGap(0, 0, 0)
                .addComponent(Htxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPuestaSol)
                .addGap(0, 0, 0)
                .addComponent(Htxt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlInformacion.add(pnlHoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 190, 250));

        icono.setBackground(new java.awt.Color(0, 0, 0));
        icono.setFont(new java.awt.Font("Century Gothic", 1, 100)); // NOI18N
        icono.setForeground(new java.awt.Color(255, 255, 255));
        icono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/taki/presentacion/50d.png"))); // NOI18N
        icono.setMaximumSize(new java.awt.Dimension(128, 128));
        icono.setMinimumSize(new java.awt.Dimension(128, 128));
        icono.setName(""); // NOI18N
        icono.setPreferredSize(new java.awt.Dimension(128, 128));
        pnlInformacion.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 70, 60));

        lblEstado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstado.setText("Estado");
        pnlInformacion.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 170, 30));

        getContentPane().add(pnlInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 63, 799, 386));
        pnlInformacion.setGx(getWidth()/2);
        pnlInformacion.setGy(getHeight());
        pnlInformacion.actualizar();

        acc = new Acciones(this);
        acc.txtInput = txtInput;
        acc.lblUbicacion = lblUbicacion;
        acc.lblTemp = lblTemp;
        acc.lblMedida = lblMedida;
        acc.icono = icono;
        acc.lblEstado = lblEstado;
        acc.lblPresion = lblPresion;
        acc.lblViento = lblViento;
        acc.lblHumedad = lblHumedad;
        acc.lblDireccion = lblDireccion;
        acc.lblMinTemp = lblMinTemp;
        acc.lblMaxTemp = lblMaxTemp;
        acc.lblNubes = lblNubes;
        acc.lblHoraLocal = lblHoraLocal;
        acc.lblZonaHoraria = lblZonaHoraria;
        acc.lblSalidaSol = lblSalidaSol;
        acc.lblPuestaSol = lblPuestaSol;

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        acc.apretarBoton();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Htxt1;
    private javax.swing.JLabel Htxt2;
    private javax.swing.JLabel Htxt3;
    private javax.swing.JLabel icono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblHoraLocal;
    private javax.swing.JLabel lblHumedad;
    private javax.swing.JLabel lblMaxTemp;
    private javax.swing.JLabel lblMedida;
    private javax.swing.JLabel lblMinTemp;
    private javax.swing.JLabel lblNubes;
    private javax.swing.JLabel lblPresion;
    private javax.swing.JLabel lblPuestaSol;
    private javax.swing.JLabel lblSalidaSol;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lblViento;
    private javax.swing.JLabel lblZonaHoraria;
    public mx.itson.taki.utilerias.JPanelCircular pnlBuscador;
    private javax.swing.JPanel pnlHoras;
    private javax.swing.JPanel pnlInfo;
    public mx.itson.taki.utilerias.JPanelCircular pnlInformacion;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JLabel txtIngrese;
    public javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables

}
