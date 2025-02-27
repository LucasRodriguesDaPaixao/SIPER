/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Model.Produto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class InterfacePedidos extends javax.swing.JFrame {
    private final Controller.ControllerPedidos controllerPedidos;
    DefaultTableModel modelo;
    double total = 0;
    String id;
    
    /*int delay = 20000;
    Timer timer;
    ActionListener taskPerformer = new ActionListener()
    {
        public void actionPerformed(ActionEvent evt)
        {
            controllerPedidos.carregarLista(tblBebida, "1");
            controllerPedidos.carregarLista(tblLanche, "2");
            controllerPedidos.carregarLista(tblRefeicao, "4");
        }
    };*/
    
    /** Creates new form InterfacePedidos**/
    public InterfacePedidos(String id) {
        initComponents();
        this.id = id;
        
        modelo =(DefaultTableModel) tblLista.getModel();
        modelo.setNumRows(0);
        
        controllerPedidos = new Controller.ControllerPedidos(this);
        controllerPedidos.carregarLista(tblBebida, "1");
        controllerPedidos.carregarLista(tblLanche, "2");
        controllerPedidos.carregarLista(tblRefeicao, "4");
        
        //this.timer = new Timer(delay, taskPerformer);
        //timer.start();
        
    }
    
     /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel9 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        lblTexto = new javax.swing.JLabel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        tbdMenu = new javax.swing.JTabbedPane();
        panelPedido = new javax.swing.JPanel();
        panelCompra = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        lblPrecoTotal = new java.awt.Label();
        jPanel10 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        btnFinalizarCompra = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        btnLimpar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        label6 = new java.awt.Label();
        btnDeletar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        panelBebida = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBebida = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnComprarBebida = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelLanche = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLanche = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnComprarLanche = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        panelRefeicao = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblRefeicao = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnComprarRefeicao = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblIdCliente = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/logo.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 10, 0);
        getContentPane().add(logo, gridBagConstraints);

        lblTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/ctgAlimento.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(lblTexto, gridBagConstraints);

        jInternalFrame2.setPreferredSize(new java.awt.Dimension(600, 250));
        jInternalFrame2.setVisible(true);

        tbdMenu.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tbdMenu.setPreferredSize(new java.awt.Dimension(590, 250));

        javax.swing.GroupLayout panelCompraLayout = new javax.swing.GroupLayout(panelCompra);
        panelCompra.setLayout(panelCompraLayout);
        panelCompraLayout.setHorizontalGroup(
            panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelCompraLayout.setVerticalGroup(
            panelCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        label1.setText("Valor total");
        jPanel5.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("R$:");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 20));

        lblPrecoTotal.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        lblPrecoTotal.setText("00,00");
        jPanel5.add(lblPrecoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 20));

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("Finalizar Compra");
        jPanel8.add(label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 107, 22));

        btnFinalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/finalizarCompra.png"))); // NOI18N
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });
        jPanel8.add(btnFinalizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 70));

        jPanel10.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label5.setText("Limpar");
        jPanel7.add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/Limpar.png"))); // NOI18N
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel7.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 80, 70));

        jPanel10.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 84, -1));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label6.setText("Deletar");
        jPanel6.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/delete.png"))); // NOI18N
        btnDeletar.setEnabled(false);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        jPanel6.add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 80, 70));

        jPanel10.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLista.getTableHeader().setReorderingAllowed(false);
        tblLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLista);
        if (tblLista.getColumnModel().getColumnCount() > 0) {
            tblLista.getColumnModel().getColumn(0).setResizable(false);
            tblLista.getColumnModel().getColumn(1).setResizable(false);
            tblLista.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout panelPedidoLayout = new javax.swing.GroupLayout(panelPedido);
        panelPedido.setLayout(panelPedidoLayout);
        panelPedidoLayout.setHorizontalGroup(
            panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidoLayout.createSequentialGroup()
                .addComponent(panelCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCodigo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(134, 134, 134)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane2)
        );
        panelPedidoLayout.setVerticalGroup(
            panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidoLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPedidoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPedidoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(panelCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCodigo))))
        );

        tbdMenu.addTab("Lista de Pedidos", new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/carrinho-de-compras.png")), panelPedido); // NOI18N

        tblBebida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Preço", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBebida.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblBebida);
        if (tblBebida.getColumnModel().getColumnCount() > 0) {
            tblBebida.getColumnModel().getColumn(0).setResizable(false);
            tblBebida.getColumnModel().getColumn(1).setResizable(false);
            tblBebida.getColumnModel().getColumn(2).setResizable(false);
            tblBebida.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarBebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/purchase.png"))); // NOI18N
        btnComprarBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarBebidaActionPerformed(evt);
            }
        });
        jPanel1.add(btnComprarBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Comprar");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        javax.swing.GroupLayout panelBebidaLayout = new javax.swing.GroupLayout(panelBebida);
        panelBebida.setLayout(panelBebidaLayout);
        panelBebidaLayout.setHorizontalGroup(
            panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBebidaLayout.createSequentialGroup()
                .addGap(70, 538, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelBebidaLayout.setVerticalGroup(
            panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBebidaLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbdMenu.addTab("Bebidas", new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/soda.png")), panelBebida); // NOI18N

        tblLanche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Preço", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLanche.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tblLanche);
        if (tblLanche.getColumnModel().getColumnCount() > 0) {
            tblLanche.getColumnModel().getColumn(0).setResizable(false);
            tblLanche.getColumnModel().getColumn(1).setResizable(false);
            tblLanche.getColumnModel().getColumn(2).setResizable(false);
            tblLanche.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarLanche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/purchase.png"))); // NOI18N
        btnComprarLanche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarLancheActionPerformed(evt);
            }
        });
        jPanel3.add(btnComprarLanche, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Comprar");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        javax.swing.GroupLayout panelLancheLayout = new javax.swing.GroupLayout(panelLanche);
        panelLanche.setLayout(panelLancheLayout);
        panelLancheLayout.setHorizontalGroup(
            panelLancheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLancheLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelLancheLayout.setVerticalGroup(
            panelLancheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLancheLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbdMenu.addTab("Lanches", new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/lanche.png")), panelLanche); // NOI18N

        tblRefeicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Preço", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRefeicao.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tblRefeicao);
        if (tblRefeicao.getColumnModel().getColumnCount() > 0) {
            tblRefeicao.getColumnModel().getColumn(0).setResizable(false);
            tblRefeicao.getColumnModel().getColumn(1).setResizable(false);
            tblRefeicao.getColumnModel().getColumn(2).setResizable(false);
            tblRefeicao.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarRefeicao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/purchase.png"))); // NOI18N
        btnComprarRefeicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarRefeicaoActionPerformed(evt);
            }
        });
        jPanel4.add(btnComprarRefeicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Comprar");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        javax.swing.GroupLayout panelRefeicaoLayout = new javax.swing.GroupLayout(panelRefeicao);
        panelRefeicao.setLayout(panelRefeicaoLayout);
        panelRefeicaoLayout.setHorizontalGroup(
            panelRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRefeicaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        panelRefeicaoLayout.setVerticalGroup(
            panelRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRefeicaoLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tbdMenu.addTab("Refeição", new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/almoco.png")), panelRefeicao); // NOI18N

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 306, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jInternalFrame2, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(5, 127, 178));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        lblIdCliente.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        getContentPane().add(lblIdCliente, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void comprar(JTable tabela)
    {
        int linha = tabela.getSelectedRow();
        String nome = tabela.getValueAt(linha, 1).toString();
        String preco = tabela.getValueAt(linha, 2).toString();
        String codigo = tabela.getValueAt(linha, 0).toString();
        
        total += Double.valueOf(preco);
        
        modelo.addRow(new Object[]
        {
            codigo,
            nome,
            preco
        });
        
        lblPrecoTotal.setText(String.valueOf(total));
    }
    
    private void btnComprarBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarBebidaActionPerformed
        comprar(tblBebida);
    }//GEN-LAST:event_btnComprarBebidaActionPerformed

    private void btnComprarLancheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarLancheActionPerformed
        comprar(tblLanche);
    }//GEN-LAST:event_btnComprarLancheActionPerformed

    private void btnComprarRefeicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarRefeicaoActionPerformed
        comprar(tblRefeicao);
    }//GEN-LAST:event_btnComprarRefeicaoActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int linha = tblLista.getSelectedRow();
        total -= Double.valueOf(tblLista.getValueAt(linha, 2).toString());
        modelo.removeRow(linha);
        lblPrecoTotal.setText(String.valueOf(total));
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        exibeMensagem("Esta ação irá apagar todos os itens do seu carrinho.", "Atenção", 2);
    }//GEN-LAST:event_btnLimparActionPerformed
    
    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        exibeMensagem("Você quer confirmar sua compra?\n"
                + "Esta ação irá encerrar a sua sessão", "Atenção", 1);
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed
    
    public void exibeMensagem(String msg, String titulo, int opcao)
    {
        int btnConfirma = JOptionPane.showConfirmDialog(null, msg, titulo, JOptionPane.YES_NO_OPTION);
        switch(opcao)
        {
            case 1:
                if (btnConfirma == JOptionPane.YES_OPTION)
                {
                    processaCompra();
                    new Interface().setVisible(true);
                    this.dispose();
                }
                break;
            case 2:
                if (btnConfirma == JOptionPane.YES_OPTION)
                {
                    limpaCarrinho();
                }
                break;
        }
    }
    
    private void limpaCarrinho()
    {
        modelo.setNumRows(0);
        total = 0;
        lblPrecoTotal.setText(String.valueOf(total));
        btnDeletar.setEnabled(false);
    }
    
    private void processaCompra()
    {
        // Armazena quantidade de itens no carrinho
        int qntItens = tblLista.getRowCount();
        //Cria um novo pedido no banco
        controllerPedidos.inserirPedido(Integer.valueOf(id));
        //Recebe Id do pedido para preencher tabela pedido_produto
        int idPedido = controllerPedidos.getIdPedido();
        
        for(int i = 0; i < qntItens; i++)
        {
            String nome = tblLista.getValueAt(i, 1).toString();
            String precoStr = tblLista.getValueAt(i, 2).toString();
            double preco = Double.valueOf(precoStr);
            int idProduto = Integer.valueOf(String.valueOf(tblLista.getValueAt(i, 0)));
            
            Produto p = new Produto(nome, preco);
            //Insere na tabela pedido_produto cada item individualmente
            controllerPedidos.inserirPedidoProduto(p, idProduto, idPedido);
        }
    }
    
    private void tblListaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaMouseClicked
        btnDeletar.setEnabled(true);
    }//GEN-LAST:event_tblListaMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(InterfacePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePedidos("").setVisible(true);
               
            }
        });
        
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarBebida;
    private javax.swing.JButton btnComprarLanche;
    private javax.swing.JButton btnComprarRefeicao;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JLabel lblCodigo;
    public javax.swing.JLabel lblIdCliente;
    private java.awt.Label lblPrecoTotal;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelBebida;
    private javax.swing.JPanel panelCompra;
    private javax.swing.JPanel panelLanche;
    private javax.swing.JPanel panelPedido;
    private javax.swing.JPanel panelRefeicao;
    private javax.swing.JTabbedPane tbdMenu;
    private javax.swing.JTable tblBebida;
    private javax.swing.JTable tblLanche;
    private javax.swing.JTable tblLista;
    private javax.swing.JTable tblRefeicao;
    // End of variables declaration//GEN-END:variables

}
