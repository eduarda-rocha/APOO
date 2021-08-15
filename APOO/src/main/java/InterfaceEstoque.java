import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InterfaceEstoque extends javax.swing.JFrame {

    public InterfaceEstoque() {
        initComponents();
    }

    private Notebook notebook;
    private Mouse mouse;
    private Sistema sistema = new Sistema();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        painelNotebooks = new javax.swing.JPanel();
        txtModeloNot = new javax.swing.JLabel();
        inputModeloNot = new javax.swing.JTextField();
        txtMarcaNot = new javax.swing.JLabel();
        inputMarcaNot = new javax.swing.JTextField();
        txtPrecoNot = new javax.swing.JLabel();
        inputPrecoNot = new javax.swing.JTextField();
        txtQtdNot = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSONot = new javax.swing.JLabel();
        inputSONot = new javax.swing.JTextField();
        txtCPUNot = new javax.swing.JLabel();
        inputCPUNot = new javax.swing.JTextField();
        txtRAMNot = new javax.swing.JLabel();
        inputRAMNot = new javax.swing.JTextField();
        txtGPUNot = new javax.swing.JLabel();
        txtGBNot = new javax.swing.JLabel();
        inputGPUNot = new javax.swing.JTextField();
        txtVRAMNot = new javax.swing.JLabel();
        inputVRAMNot = new javax.swing.JTextField();
        txtGB2Not = new javax.swing.JLabel();
        txtHDDNot = new javax.swing.JLabel();
        inputHDDNot = new javax.swing.JTextField();
        txtSDDNot = new javax.swing.JLabel();
        inputSSDNot = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btConsultarNot = new javax.swing.JButton();
        btCadastrarNot = new javax.swing.JButton();
        btRemoverNot = new javax.swing.JButton();
        btAtualizarNot = new javax.swing.JButton();
        inputQtdNot = new javax.swing.JTextField();
        btS = new javax.swing.JButton();
        painelMouses = new javax.swing.JPanel();
        txtModeloMou = new javax.swing.JLabel();
        inputModeloMou = new javax.swing.JTextField();
        txtMarcaMou = new javax.swing.JLabel();
        inputMarcaMou = new javax.swing.JTextField();
        txtPrecoMou = new javax.swing.JLabel();
        inputPrecoMou = new javax.swing.JTextField();
        txtQtdMou = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDPIMou = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btConsultarMou = new javax.swing.JButton();
        btCadastrarMou = new javax.swing.JButton();
        btRemoverMou = new javax.swing.JButton();
        btAtualizarMou = new javax.swing.JButton();
        inputDPIMou = new javax.swing.JTextField();
        inputFIOMou = new javax.swing.JTextField();
        inputCORMou = new javax.swing.JTextField();
        txtFIOMou = new javax.swing.JLabel();
        txtCORMou = new javax.swing.JLabel();
        inputQtdMou = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                fechar(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTabbedPane1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        txtModeloNot.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtModeloNot.setText("Modelo:");

        inputModeloNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputModeloNotActionPerformed(evt);
            }
        });

        txtMarcaNot.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMarcaNot.setText("Marca:");

        txtPrecoNot.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPrecoNot.setText("Preço:");

        txtQtdNot.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtQtdNot.setText("QTD:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Especificações");

        txtSONot.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtSONot.setText("Sistema Operacional:");

        txtCPUNot.setText("CPU:");

        inputCPUNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCPUNotActionPerformed(evt);
            }
        });

        txtRAMNot.setText("RAM:");

        txtGPUNot.setText("GPU:");

        txtGBNot.setText("GB");

        txtVRAMNot.setText("VRAM:");

        txtGB2Not.setText("GB");

        txtHDDNot.setText("HHD:");

        txtSDDNot.setText("SDD:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Modelo", "Marca", "Preço", "Quantidade"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(25);
        }

        btConsultarNot.setText("CONSULTAR");
        btConsultarNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarNotActionPerformed(evt);
            }
        });

        btCadastrarNot.setText("CADASTRAR");
        btCadastrarNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarNotActionPerformed(evt);
            }
        });

        btRemoverNot.setText("REMOVER");
        btRemoverNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverNotActionPerformed(evt);
            }
        });

        btAtualizarNot.setText("ATUALIZAR");
        btAtualizarNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarNotActionPerformed(evt);
            }
        });

        btS.setText("LIMPAR");
        btS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelNotebooksLayout = new javax.swing.GroupLayout(painelNotebooks);
        painelNotebooks.setLayout(painelNotebooksLayout);
        painelNotebooksLayout.setHorizontalGroup(
            painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelNotebooksLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelNotebooksLayout.createSequentialGroup()
                        .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(painelNotebooksLayout.createSequentialGroup()
                                .addComponent(txtGPUNot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputGPUNot))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelNotebooksLayout.createSequentialGroup()
                                .addComponent(txtCPUNot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputCPUNot, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelNotebooksLayout.createSequentialGroup()
                                .addComponent(txtRAMNot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputRAMNot)
                                .addGap(1, 1, 1))
                            .addGroup(painelNotebooksLayout.createSequentialGroup()
                                .addComponent(txtVRAMNot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputVRAMNot)))
                        .addGap(9, 9, 9)
                        .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelNotebooksLayout.createSequentialGroup()
                                .addComponent(txtGBNot)
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelNotebooksLayout.createSequentialGroup()
                                .addComponent(txtGB2Not)
                                .addGap(18, 18, 18)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(painelNotebooksLayout.createSequentialGroup()
                        .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelNotebooksLayout.createSequentialGroup()
                                .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelNotebooksLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(8, 8, 8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelNotebooksLayout.createSequentialGroup()
                                        .addComponent(txtHDDNot)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputHDDNot, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSDDNot)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputSSDNot, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelNotebooksLayout.createSequentialGroup()
                                .addComponent(btS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btRemoverNot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAtualizarNot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCadastrarNot))
                            .addGroup(painelNotebooksLayout.createSequentialGroup()
                                .addComponent(txtSONot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputSONot))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelNotebooksLayout.createSequentialGroup()
                                .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelNotebooksLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtModeloNot)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputModeloNot, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelNotebooksLayout.createSequentialGroup()
                                        .addComponent(txtMarcaNot)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(inputMarcaNot, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrecoNot)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputPrecoNot, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelNotebooksLayout.createSequentialGroup()
                                        .addComponent(txtQtdNot)
                                        .addGap(10, 10, 10)
                                        .addComponent(inputQtdNot, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btConsultarNot, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(466, 466, 466))))
        );
        painelNotebooksLayout.setVerticalGroup(
            painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelNotebooksLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModeloNot)
                    .addComponent(inputModeloNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarNot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaNot)
                    .addComponent(inputMarcaNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoNot)
                    .addComponent(inputPrecoNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdNot)
                    .addComponent(inputQtdNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSONot)
                    .addComponent(inputSONot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPUNot)
                    .addComponent(inputCPUNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRAMNot)
                    .addComponent(inputRAMNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGBNot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGPUNot)
                    .addComponent(inputGPUNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVRAMNot)
                    .addComponent(inputVRAMNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGB2Not))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHDDNot)
                    .addComponent(inputHDDNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDDNot)
                    .addComponent(inputSSDNot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelNotebooksLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarNot)
                    .addComponent(btAtualizarNot)
                    .addComponent(btRemoverNot)
                    .addComponent(btS))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(painelNotebooksLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Notebooks", painelNotebooks);

        txtModeloMou.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtModeloMou.setText("Modelo:");

        inputModeloMou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputModeloMouActionPerformed(evt);
            }
        });

        txtMarcaMou.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtMarcaMou.setText("Marca:");

        txtPrecoMou.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtPrecoMou.setText("Preço:");

        inputPrecoMou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPrecoMouActionPerformed(evt);
            }
        });

        txtQtdMou.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtQtdMou.setText("QTD:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Especificações");

        txtDPIMou.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtDPIMou.setText("DPI:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Modelo", "Marca", "Preço", "Quantidade"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(25);
        }

        btConsultarMou.setText("CONSULTAR");

        btCadastrarMou.setText("CADASTRAR");

        btRemoverMou.setText("REMOVER");

        btAtualizarMou.setText("ATUALIZAR");

        txtFIOMou.setText("FIO:");

        txtCORMou.setText("COR:");

        javax.swing.GroupLayout painelMousesLayout = new javax.swing.GroupLayout(painelMouses);
        painelMouses.setLayout(painelMousesLayout);
        painelMousesLayout.setHorizontalGroup(
            painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMousesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMousesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(painelMousesLayout.createSequentialGroup()
                        .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMousesLayout.createSequentialGroup()
                                .addComponent(btRemoverMou)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btAtualizarMou)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btCadastrarMou))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMousesLayout.createSequentialGroup()
                                .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(painelMousesLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtModeloMou)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(inputModeloMou, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelMousesLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(painelMousesLayout.createSequentialGroup()
                                        .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(painelMousesLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(painelMousesLayout.createSequentialGroup()
                                                        .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtCORMou, javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(txtFIOMou, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(inputCORMou)
                                                            .addComponent(inputFIOMou, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(painelMousesLayout.createSequentialGroup()
                                                        .addGap(3, 3, 3)
                                                        .addComponent(txtDPIMou)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(inputDPIMou, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(painelMousesLayout.createSequentialGroup()
                                                .addComponent(txtMarcaMou)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(inputMarcaMou, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrecoMou)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(inputPrecoMou, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btConsultarMou, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelMousesLayout.createSequentialGroup()
                                        .addComponent(txtQtdMou)
                                        .addGap(10, 10, 10)
                                        .addComponent(inputQtdMou, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(466, 466, 466))))
        );
        painelMousesLayout.setVerticalGroup(
            painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMousesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModeloMou)
                    .addComponent(inputModeloMou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultarMou))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarcaMou)
                    .addComponent(inputMarcaMou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoMou)
                    .addComponent(inputPrecoMou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdMou)
                    .addComponent(inputQtdMou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDPIMou)
                    .addComponent(inputDPIMou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputFIOMou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFIOMou))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputCORMou, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCORMou))
                .addGap(39, 39, 39)
                .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMousesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btCadastrarMou)
                        .addComponent(btAtualizarMou))
                    .addComponent(btRemoverMou))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(painelMousesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Mouses", painelMouses);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Gerenciamento de Estoque");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarNotActionPerformed
        cadastrarNot();
    }//GEN-LAST:event_btCadastrarNotActionPerformed

    private void btAtualizarNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarNotActionPerformed
        attNot();
    }//GEN-LAST:event_btAtualizarNotActionPerformed

    private void btRemoverNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverNotActionPerformed
        delNot();
    }//GEN-LAST:event_btRemoverNotActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tabNot();
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        tabNot();
    }//GEN-LAST:event_formWindowActivated

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        clickTabNot();
    }//GEN-LAST:event_jTable1MouseClicked

    private void btSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSActionPerformed
        limparNot();
        tabNot();
    }//GEN-LAST:event_btSActionPerformed

    private void btConsultarNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarNotActionPerformed
        consultarNot();
    }//GEN-LAST:event_btConsultarNotActionPerformed

    private void inputModeloNotActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_inputModeloNotActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_inputModeloNotActionPerformed

    private void inputCPUNotActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_inputCPUNotActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_inputCPUNotActionPerformed

    private void inputModeloMouActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_inputModeloMouActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_inputModeloMouActionPerformed

    private void inputPrecoMouActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_inputPrecoMouActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_inputPrecoMouActionPerformed

    private void fechar(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_fechar

    }// GEN-LAST:event_fechar

    public void cadastrarNot() {
        notebook = new Notebook();

        notebook.setModelo(inputModeloNot.getText());

        if (sistema.cons(notebook)) {
            JOptionPane.showMessageDialog(null, "Já existe um modelo desse notebook no estoque.",
                    "Modelo já cadastrado", 0);
        } else {
            notebook.setMarca(inputMarcaNot.getText());

            try {
                notebook.setPreco(Double.parseDouble(inputPrecoNot.getText()));
                try {
                    notebook.setQtd(Integer.parseInt(inputQtdNot.getText()));

                    notebook.setSoNot(inputSONot.getText());
                    notebook.setCpuNot(inputCPUNot.getText());
                    notebook.setRamNot(inputRAMNot.getText());
                    notebook.setVramNot(inputVRAMNot.getText());
                    notebook.setGpuNot(inputGPUNot.getText());
                    notebook.setHddNot(inputHDDNot.getText());
                    notebook.setSsdNot(inputSSDNot.getText());

                    if (sistema.cad(notebook)) {
                        JOptionPane.showMessageDialog(null, "Notebook cadastrado com sucesso.",
                                "Confirmação de cadastro", -1);
                        limparNot();
                    }

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "A quantidade do produto deve ser um número.", "Valor inválido",
                            0);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "O preço do notebook deve ser um número.", "Valor inválido", 0);
            }
        }
    }

    public void limparNot() {

        inputModeloNot.setText("");
        inputMarcaNot.setText("");
        inputPrecoNot.setText("");
        inputQtdNot.setText(""); // ERRO
        inputSONot.setText("");
        inputCPUNot.setText("");
        inputRAMNot.setText("");
        inputGPUNot.setText("");
        inputVRAMNot.setText("");
        inputHDDNot.setText("");
        inputSSDNot.setText("");

        inputModeloNot.requestFocus();

    }

    public void tabNot() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        notebook = new Notebook();

        for (int posLin = 0; posLin < BDEstoque.getInstance().getBdNotebook().size(); posLin++) {
            notebook.setModelo(BDEstoque.getInstance().getBdNotebook().get(posLin).getModelo());
            notebook.setMarca(BDEstoque.getInstance().getBdNotebook().get(posLin).getMarca());
            notebook.setPreco(BDEstoque.getInstance().getBdNotebook().get(posLin).getPreco());
            notebook.setQtd(BDEstoque.getInstance().getBdNotebook().get(posLin).getQtd());

            modelo.insertRow(posLin,
                    new Object[] { notebook.getModelo(), notebook.getMarca(), notebook.getPreco(), notebook.getQtd() });
        }
    }

    public void tabMou() {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0);
        mouse = new Mouse();

        for (int posLin = 0; posLin < BDEstoque.getInstance().getBdMouse().size(); posLin++) {
            mouse.setModelo(BDEstoque.getInstance().getBdMouse().get(posLin).getModelo());
            mouse.setMarca(BDEstoque.getInstance().getBdMouse().get(posLin).getMarca());
            mouse.setPreco(BDEstoque.getInstance().getBdMouse().get(posLin).getPreco());
            mouse.setQtd(BDEstoque.getInstance().getBdMouse().get(posLin).getQtd());

            modelo.insertRow(posLin,
                    new Object[] { mouse.getModelo(), mouse.getMarca(), mouse.getPreco(), mouse.getQtd() });
        }
    }

    public void clickTabNot() {

        int linhaTab = jTable1.getSelectedRow();

        notebook = new Notebook();

        notebook = insereNot(linhaTab);

        inputModeloNot.setText(notebook.getModelo());
        inputMarcaNot.setText(notebook.getMarca());
        inputPrecoNot.setText(String.valueOf(notebook.getPreco()));
        inputQtdNot.setText(String.valueOf(notebook.getQtd())); // ERRO
        inputSONot.setText(notebook.getSoNot());
        inputCPUNot.setText(notebook.getCpuNot());
        inputRAMNot.setText(notebook.getRamNot());
        inputGPUNot.setText(notebook.getGpuNot());
        inputVRAMNot.setText(notebook.getVramNot());
        inputHDDNot.setText(notebook.getHddNot());
        inputSSDNot.setText(notebook.getSsdNot());

    }

    public Notebook insereNot(int linhaTab) {

        notebook = new Notebook();

        notebook.setModelo(BDEstoque.getInstance().getBdNotebook().get(linhaTab).getModelo());
        notebook.setMarca(BDEstoque.getInstance().getBdNotebook().get(linhaTab).getMarca());
        notebook.setPreco(BDEstoque.getInstance().getBdNotebook().get(linhaTab).getPreco());
        notebook.setQtd(BDEstoque.getInstance().getBdNotebook().get(linhaTab).getQtd());
        notebook.setSoNot(BDEstoque.getInstance().getBdNotebook().get(linhaTab).getSoNot());
        notebook.setCpuNot(BDEstoque.getInstance().getBdNotebook().get(linhaTab).getCpuNot());
        notebook.setRamNot(BDEstoque.getInstance().getBdNotebook().get(linhaTab).getRamNot());
        notebook.setVramNot(BDEstoque.getInstance().getBdNotebook().get(linhaTab).getVramNot());
        notebook.setHddNot(BDEstoque.getInstance().getBdNotebook().get(linhaTab).getHddNot());
        notebook.setSsdNot(BDEstoque.getInstance().getBdNotebook().get(linhaTab).getSsdNot());
        notebook.setGpuNot(BDEstoque.getInstance().getBdNotebook().get(linhaTab).getGpuNot());

        return notebook;
    }

    public void delNot() {

        notebook = new Notebook();

        notebook.setModelo(inputModeloNot.getText());

        if (sistema.cons(notebook)) {
            for (Notebook n : BDEstoque.getInstance().getBdNotebook()) {
                if (n.getModelo().equals(notebook.getModelo())) {
                    notebook = n;
                }
            }

            sistema.del(notebook);

            JOptionPane.showMessageDialog(null, "Dados do notebook removidos.", "REMOÇÃO BEM SUCEDIDA", -1);
            limparNot();

        } else {
            JOptionPane.showMessageDialog(null, "Modelo de notebook não encontrado.", "MODELO INVÁLIDO", 0);
        }

    }

    public void attNot() {

        notebook = new Notebook();

        notebook.setModelo(inputModeloNot.getText());

        if (sistema.cons(notebook)) {

            notebook.setMarca(inputMarcaNot.getText());

            try {
                notebook.setPreco(Double.parseDouble(inputPrecoNot.getText()));
                try {
                    notebook.setQtd(Integer.parseInt(inputQtdNot.getText()));

                    notebook.setSoNot(inputSONot.getText());
                    notebook.setCpuNot(inputCPUNot.getText());
                    notebook.setRamNot(inputRAMNot.getText());
                    notebook.setVramNot(inputVRAMNot.getText());
                    notebook.setGpuNot(inputGPUNot.getText());
                    notebook.setHddNot(inputHDDNot.getText());
                    notebook.setSsdNot(inputSSDNot.getText());

                    if (sistema.att(notebook)) {
                        JOptionPane.showMessageDialog(null, "Notebook atualizado com sucesso.",
                                "Confirmação de atualização", -1);
                        limparNot();
                    }

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "A quantidade do produto deve ser um número.", "Valor inválido",
                            0);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "O preço do notebook deve ser um número.", "Valor inválido", 0);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Não existe um modelo desse notebook no estoque.",
                    "Modelo não encontrado", 0);
        }
    }

    public void consultarNot() {
        notebook = new Notebook();

        notebook.setModelo(inputModeloNot.getText());

        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        if (sistema.cons(notebook)) {
            for (Notebook n : BDEstoque.getInstance().getBdNotebook()) {
                if (n.getModelo().equals(notebook.getModelo())) {
                    notebook = n;
                }
            }
        }

        modelo.insertRow(0,
                new Object[] { notebook.getModelo(), notebook.getMarca(), notebook.getPreco(), notebook.getQtd() });
    }
    
      public void cadastrarMou() {
        mouse = new Mouse();

        mouse.setModelo(inputModeloMou.getText());

        if (sistema.cons(mouse)) {
            JOptionPane.showMessageDialog(null, "Já existe um modelo desse mouse no estoque.",
                    "Modelo já cadastrado", 0);
        } else {
            mouse.setMarca(inputMarcaMou.getText());

            try {
                mouse.setPreco(Double.parseDouble(inputPrecoMou.getText()));
                try {
                    mouse.setQtd(Integer.parseInt(inputQtdMou.getText()));

                    mouse.setDpiMou(inputDPIMou.getText());
                    mouse.setFioMou(inputFIOMou.getText());
                    mouse.setCorMou(inputCORMou.getText());
                  
                    if (sistema.cad(mouse)) {
                        JOptionPane.showMessageDialog(null, "Mouse cadastrado com sucesso.",
                                "Confirmação de cadastro", -1);
                        limparMou();
                    }

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "A quantidade do produto deve ser um número.", "Valor inválido",
                            0);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "O preço do mouse deve ser um número.", "Valor inválido", 0);
            }
        }
    }
    
    public void limparMou() {

        inputModeloMou.setText("");
        inputMarcaMou.setText("");
        inputPrecoMou.setText("");
        inputQtdMou.setText(""); 
        inputDPIMou.setText("");
        inputFIOMou.setText("");
        inputCORMou.setText("");
       
        inputModeloMou.requestFocus();
    }
    
    public void tabMou() {
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0);
        mouse = new Mouse();

        for (int posLin = 0; posLin < BDEstoque.getInstance().getBdMouse().size(); posLin++) {
            mouse.setModelo(BDEstoque.getInstance().getBdMouse().get(posLin).getModelo());
            mouse.setMarca(BDEstoque.getInstance().getBdMouse().get(posLin).getMarca());
            mouse.setPreco(BDEstoque.getInstance().getBdMouse().get(posLin).getPreco());
            mouse.setQtd(BDEstoque.getInstance().getBdMouse().get(posLin).getQtd());

            modelo.insertRow(posLin,
                    new Object[] { mouse.getModelo(), mouse.getMarca(), mouse.getPreco(), mouse.getQtd() });
        }
    }
    
    public void clickTabMou() {

        int linhaTab = jTable2.getSelectedRow();

        mouse = new Mouse();

        mouse = insereMou(linhaTab);

        inputModeloMou.setText(mouse.getModelo());
        inputMarcaMou.setText(mouse.getMarca());
        inputPrecoMou.setText(String.valueOf(mouse.getPreco()));
        inputQtdMou.setText(String.valueOf(mouse.getQtd())); 
        inputDPIMou.setText(mouse.getDpiMou());
        inputFIOMou.setText(mouse.getFioMou());
        inputCORMou.setText(mouse.getCorMou());
    }

    public Mouse insereMou(int linhaTab) {

        mouse = new Mouse();

        mouse.setModelo(BDEstoque.getInstance().getBdMouse().get(linhaTab).getModelo());
        mouse.setMarca(BDEstoque.getInstance().getBdMouse().get(linhaTab).getMarca());
        mouse.setPreco(BDEstoque.getInstance().getBdMouse().get(linhaTab).getPreco());
        mouse.setQtd(BDEstoque.getInstance().getBdMouse().get(linhaTab).getQtd());
        mouse.setDpiMou(BDEstoque.getInstance().getBdMouse().get(linhaTab).getDpiMou());
        mouse.setFioMou(BDEstoque.getInstance().getBdMouse().get(linhaTab).getFioMou());
        mouse.setCorMou(BDEstoque.getInstance().getBdMouse().get(linhaTab).getCorMou());

        return mouse;
    }

    public void delMou() {

        mouse = new Mouse();

        mouse.setModelo(inputModeloMou.getText());

        if (sistema.cons(mou)) {
            for (Mouse m : BDEstoque.getInstance().getBdMouse()) {
                if (m.getModelo().equals(mouse.getModelo())) {
                    mouse = m;
                }
            }

            sistema.del(mouse);

            JOptionPane.showMessageDialog(null, "Dados do mouse removidos.", "REMOÇÃO BEM SUCEDIDA", -1);
            limparMou();

        } else {
            JOptionPane.showMessageDialog(null, "Modelo de mouse não encontrado.", "MODELO INVÁLIDO", 0);
        }

    }
    
    public void attMou() {

       mouse = new Mouse();

        mouse.setModelo(inputModeloMou.getText());

        if (sistema.cons(mouse)) {

            mouse.setMarca(inputMarcaMou.getText());

            try {
                mouse.setPreco(Double.parseDouble(inputPrecoMou.getText()));
                try {
                    mouse.setQtd(Integer.parseInt(inputQtdMou.getText()));

                    mouse.setDpiMou(inputDPIMou.getText());
                    mouse.setFioMou(inputFIOMou.getText());
                    mouse.setCorMou(inputCORMou.getText());
              
                    if (sistema.att(mouse)) {
                        JOptionPane.showMessageDialog(null, "Mouse atualizado com sucesso.",
                                "Confirmação de atualização", -1);
                        limparMou();
                    }

                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(null, "A quantidade do produto deve ser um número.", "Valor inválido",
                            0);
                }
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "O preço do mouse deve ser um número.", "Valor inválido", 0);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Não existe um modelo desse nmouse no estoque.",
                    "Modelo não encontrado", 0);
        }
    }

    public void consultarMou() {
        mouse = new Mouse();

        mouse.setModelo(inputModeloMou.getText());

        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();
        modelo.setRowCount(0);

        if (sistema.cons(mouse)) {
            for (Mouse m : BDEstoque.getInstance().getBdMouse()) {
                if (m.getModelo().equals(mouse.getModelo())) {
                    mouse = m;
                }
            }
        }

        modelo.insertRow(0,
                new Object[] { mouse.getModelo(), mouse.getMarca(), mouse.getPreco(), mouse.getQtd() });
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceEstoque.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceEstoque.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceEstoque.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceEstoque.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAtualizarMou;
    private javax.swing.JButton btAtualizarNot;
    private javax.swing.JButton btCadastrarMou;
    private javax.swing.JButton btCadastrarNot;
    private javax.swing.JButton btConsultarMou;
    private javax.swing.JButton btConsultarNot;
    private javax.swing.JButton btRemoverMou;
    private javax.swing.JButton btRemoverNot;
    private javax.swing.JButton btS;
    private javax.swing.JTextField inputCORMou;
    private javax.swing.JTextField inputCPUNot;
    private javax.swing.JTextField inputDPIMou;
    private javax.swing.JTextField inputFIOMou;
    private javax.swing.JTextField inputGPUNot;
    private javax.swing.JTextField inputHDDNot;
    private javax.swing.JTextField inputMarcaMou;
    private javax.swing.JTextField inputMarcaNot;
    private javax.swing.JTextField inputModeloMou;
    private javax.swing.JTextField inputModeloNot;
    private javax.swing.JTextField inputPrecoMou;
    private javax.swing.JTextField inputPrecoNot;
    private javax.swing.JTextField inputQtdMou;
    private javax.swing.JTextField inputQtdNot;
    private javax.swing.JTextField inputRAMNot;
    private javax.swing.JTextField inputSONot;
    private javax.swing.JTextField inputSSDNot;
    private javax.swing.JTextField inputVRAMNot;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel painelMouses;
    private javax.swing.JPanel painelNotebooks;
    private javax.swing.JLabel txtCORMou;
    private javax.swing.JLabel txtCPUNot;
    private javax.swing.JLabel txtDPIMou;
    private javax.swing.JLabel txtFIOMou;
    private javax.swing.JLabel txtGB2Not;
    private javax.swing.JLabel txtGBNot;
    private javax.swing.JLabel txtGPUNot;
    private javax.swing.JLabel txtHDDNot;
    private javax.swing.JLabel txtMarcaMou;
    private javax.swing.JLabel txtMarcaNot;
    private javax.swing.JLabel txtModeloMou;
    private javax.swing.JLabel txtModeloNot;
    private javax.swing.JLabel txtPrecoMou;
    private javax.swing.JLabel txtPrecoNot;
    private javax.swing.JLabel txtQtdMou;
    private javax.swing.JLabel txtQtdNot;
    private javax.swing.JLabel txtRAMNot;
    private javax.swing.JLabel txtSDDNot;
    private javax.swing.JLabel txtSONot;
    private javax.swing.JLabel txtVRAMNot;
    // End of variables declaration//GEN-END:variables
}
