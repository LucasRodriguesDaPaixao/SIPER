/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import DAO.DaoProduto;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lucas
 */
public class InterfacePedidos extends javax.swing.JFrame {

    /** Creates new form InterfacePedidos */
    public InterfacePedidos() {
        initComponents();
        carregarlista();
        carregarlista2();
        carregarlista3();
    }
    public void carregarlista(){
        DefaultTableModel modelo = (DefaultTableModel) tblBebida.getModel();
        modelo.setNumRows(0);
           
           DAO.DaoProduto itensCliente = new DaoProduto();
           ResultSet dados = itensCliente.listar("1");

           
           try{
               //função para verificar o tanto de itens que tem em "dados"
               while(dados.next()){
                   modelo.addRow(new Object[]{
                       dados.getString(1),
                       dados.getString(2),
                       dados.getString(3),
                       dados.getString(4)
                   });
               }

           }catch(SQLException error){
              throw new RuntimeException(error);

           }
    }
     public void carregarlista2(){
        DefaultTableModel modelo = (DefaultTableModel) tblLanche.getModel();
        modelo.setNumRows(0);
           
           DAO.DaoProduto itensCliente = new DaoProduto();
           ResultSet dados = itensCliente.listar("2");

           
           try{
               //função para verificar o tanto de itens que tem em "dados"
               while(dados.next()){
                   modelo.addRow(new Object[]{
                       dados.getString(1),
                       dados.getString(2),
                       dados.getString(3),
                       dados.getString(4)
                   });
               }

           }catch(SQLException error){
              throw new RuntimeException(error);

           }
    }
     
     public void carregarlista3(){
        DefaultTableModel modelo = (DefaultTableModel) tblRefeicao.getModel();
        modelo.setNumRows(0);
           
           DAO.DaoProduto itensCliente = new DaoProduto();
           ResultSet dados = itensCliente.listar("4");

           
           try{
               //função para verificar o tanto de itens que tem em "dados"
               while(dados.next()){
                   modelo.addRow(new Object[]{
                       dados.getString(1),
                       dados.getString(2),
                       dados.getString(3),
                       dados.getString(4)
                   });
               }

           }catch(SQLException error){
              throw new RuntimeException(error);

           }
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

        logo = new javax.swing.JLabel();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        tbdMenu = new javax.swing.JTabbedPane();
        panelPedido = new javax.swing.JPanel();
        panelCompra = new javax.swing.JPanel();
        panelBtn = new javax.swing.JPanel();
        btnFnzCompra = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        panelBebida = new javax.swing.JPanel();
        tblBebidas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBebida = new javax.swing.JTable();
        panelLanche = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblLanche = new javax.swing.JTable();
        panelRefeicao = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblRefeicao = new javax.swing.JTable();
        lblTexto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

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

        jInternalFrame2.setPreferredSize(new java.awt.Dimension(600, 250));
        jInternalFrame2.setVisible(true);

        tbdMenu.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tbdMenu.setPreferredSize(new java.awt.Dimension(590, 250));
        tbdMenu.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbdMenuAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        panelPedido.setLayout(new java.awt.GridBagLayout());

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weighty = 1.0;
        panelPedido.add(panelCompra, gridBagConstraints);

        panelBtn.setLayout(new java.awt.GridBagLayout());

        btnFnzCompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnFnzCompra.setText("Finalizar Compra");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        panelBtn.add(btnFnzCompra, gridBagConstraints);

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpar.setText("Limpar Lista");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LAST_LINE_END;
        panelBtn.add(btnLimpar, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Valor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        panelBtn.add(jLabel1, gridBagConstraints);

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTotal.setText("R$: 15.90");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        panelBtn.add(lblTotal, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 1.0;
        panelPedido.add(panelBtn, gridBagConstraints);

        tbdMenu.addTab("Lista de Pedidos", new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/carrinho-de-compras.png")), panelPedido); // NOI18N

        tblBebidas.setText("Bebidas");
        tblBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblBebidasActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(tblBebida);

        javax.swing.GroupLayout panelBebidaLayout = new javax.swing.GroupLayout(panelBebida);
        panelBebida.setLayout(panelBebidaLayout);
        panelBebidaLayout.setHorizontalGroup(
            panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBebidaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tblBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(213, 213, 213))
        );
        panelBebidaLayout.setVerticalGroup(
            panelBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBebidaLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(tblBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBebidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
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
        jScrollPane3.setViewportView(tblLanche);

        javax.swing.GroupLayout panelLancheLayout = new javax.swing.GroupLayout(panelLanche);
        panelLanche.setLayout(panelLancheLayout);
        panelLancheLayout.setHorizontalGroup(
            panelLancheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLancheLayout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLancheLayout.setVerticalGroup(
            panelLancheLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLancheLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
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
        jScrollPane4.setViewportView(tblRefeicao);

        javax.swing.GroupLayout panelRefeicaoLayout = new javax.swing.GroupLayout(panelRefeicao);
        panelRefeicao.setLayout(panelRefeicaoLayout);
        panelRefeicaoLayout.setHorizontalGroup(
            panelRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRefeicaoLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRefeicaoLayout.setVerticalGroup(
            panelRefeicaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRefeicaoLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 66, Short.MAX_VALUE))
        );

        tbdMenu.addTab("Refeição", new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/almoco.png")), panelRefeicao); // NOI18N

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbdMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 784, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame2Layout.createSequentialGroup()
                .addComponent(tbdMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jInternalFrame2, gridBagConstraints);

        lblTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Imagens/ctgAlimento.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(lblTexto, gridBagConstraints);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbdMenuAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbdMenuAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tbdMenuAncestorAdded

    private void tblBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblBebidasActionPerformed
        // TODO add your handling code here:
       

    }//GEN-LAST:event_tblBebidasActionPerformed
    private void panelBebidaActionPerformed(javax.swing.event.AncestorEvent evt) {                                      
    
    }
    
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
                if ("Metal".equals(info.getName())) {
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
                new InterfacePedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFnzCompra;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelBebida;
    private javax.swing.JPanel panelBtn;
    private javax.swing.JPanel panelCompra;
    private javax.swing.JPanel panelLanche;
    private javax.swing.JPanel panelPedido;
    private javax.swing.JPanel panelRefeicao;
    private javax.swing.JTabbedPane tbdMenu;
    private javax.swing.JTable tblBebida;
    private javax.swing.JButton tblBebidas;
    private javax.swing.JTable tblLanche;
    private javax.swing.JTable tblRefeicao;
    // End of variables declaration//GEN-END:variables

}
