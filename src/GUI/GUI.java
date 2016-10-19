package GUI;

import Biblioteca.Cliente;
import Biblioteca.Entidades.Livro;
import Biblioteca.Listas.ListaLivro;
import java.awt.Toolkit;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author redproxy
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }
    
    public void mostrarNotificacao(String mensagem)
    {
        Toolkit.getDefaultToolkit().beep();
        this.jLabelNotificacao.setText(mensagem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCampoPesquisa = new javax.swing.JTextField();
        jBotaoConsulta = new javax.swing.JButton();
        jBotaoEmprestar = new javax.swing.JButton();
        jBotaoDevolver = new javax.swing.JButton();
        jBotaoReservar = new javax.swing.JButton();
        jBotaoRenovar = new javax.swing.JButton();
        jCampoUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jDiasMaxEsperaReserva = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResultados = new javax.swing.JTable();
        jLabelNotificacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBotaoConsulta.setText("Consultar");
        jBotaoConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoConsultaActionPerformed(evt);
            }
        });

        jBotaoEmprestar.setText("Emprestar");
        jBotaoEmprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoEmprestarActionPerformed(evt);
            }
        });

        jBotaoDevolver.setText("Devolver");
        jBotaoDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoDevolverActionPerformed(evt);
            }
        });

        jBotaoReservar.setText("Reservar");
        jBotaoReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoReservarActionPerformed(evt);
            }
        });

        jBotaoRenovar.setText("Renovar");
        jBotaoRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoRenovarActionPerformed(evt);
            }
        });

        jCampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCampoUsuarioActionPerformed(evt);
            }
        });

        jLabel5.setText("Usuário:");

        jDiasMaxEsperaReserva.setText("1");

        jLabel1.setText("Reserva (dias):");

        jLabel7.setText("Id do livro:");

        jTableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Título", "Autor", "Categoria", "Disponível"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableResultados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );

        jLabelNotificacao.setForeground(new java.awt.Color(255, 3, 0));
        jLabelNotificacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNotificacao.setText("nenhuma notificação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBotaoEmprestar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jBotaoRenovar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBotaoDevolver)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDiasMaxEsperaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBotaoReservar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNotificacao)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBotaoConsulta)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNotificacao)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jCampoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBotaoConsulta))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jCampoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotaoEmprestar)
                    .addComponent(jBotaoRenovar)
                    .addComponent(jBotaoDevolver)
                    .addComponent(jDiasMaxEsperaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jBotaoReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Realiza a consulta pelo ID de um livro ou lista todos os 
     * livros se não houver nenhum ID.
     * @param evt 
     */
    private void jBotaoConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoConsultaActionPerformed
        
        // pega o ID do livro a ser buscado
        int livroId = -1;
        if (!this.jCampoPesquisa.getText().equals("")) {
            livroId = Integer.parseInt(this.jCampoPesquisa.getText());
        }
        
        try {
            // chama o método remoto para buscar os livros
            ListaLivro listaLivro = new ListaLivro();
            if (livroId >= 0) { 
                Livro livro = Cliente.interfaceServ.consultarLivro(livroId);
                if (livro != null) {
                    listaLivro.adicionar(livro);
                }
            } else {
                listaLivro = Cliente.interfaceServ.consultarTodosLivros();
            }
            
            
            DefaultTableModel tableModel = (DefaultTableModel) jTableResultados.getModel();
            
            // limpa a tabela antes de adicionar os resultados
            tableModel.setRowCount(0); 
            
            // prepara o modelo para popular a tabela de resultados na GUI
            for(Livro livro: listaLivro.getListaLivro()){
                tableModel.addRow(new Object[]{
                    livro.getId(), 
                    livro.getTitulo(),
                    livro.getAutor(), 
                    livro.getCategoria(), 
                    livro.getQuantidade()
                });
            }
            
        } catch (RemoteException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBotaoConsultaActionPerformed

    private void jCampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCampoUsuarioActionPerformed

    }//GEN-LAST:event_jCampoUsuarioActionPerformed

    private void jBotaoReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoReservarActionPerformed
        
        // pega a linha selecionada na tabela
        int row = jTableResultados.getSelectedRow();
        
        // pega o nome do cliente
        String nomeCliente = this.jCampoUsuario.getText();
        
        // dias máximos para receber notificação de reserva
        int diasMaxEsperaReserva = Integer.parseInt(this.jDiasMaxEsperaReserva.getText());
                
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o livro na tabela");
        } else if (nomeCliente.equals("")) {
            JOptionPane.showMessageDialog(null, "Insira um nome de usuário");
        } else if (diasMaxEsperaReserva <= 0) { 
            JOptionPane.showMessageDialog(null, "A quantidade de dias deve ser maior que 0");
        } else {
                
            // pega o ID do livro a ser reservado
            int livroId = Integer.parseInt(jTableResultados.getModel().getValueAt(row, 0).toString());    
                
            try {
                // chama o método remoto para reservar o livro (passa a referência do cliente como parâmetro)
                String resposta = Cliente.interfaceServ.reservarLivro(livroId, nomeCliente, Cliente.cliImpl, livroId);

                // exibe a resposta do servidor
                JOptionPane.showMessageDialog(null, resposta);

            } catch (RemoteException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBotaoReservarActionPerformed

    private void jBotaoEmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoEmprestarActionPerformed
        
        // pega a linha selecioanda na tabela
        int row = jTableResultados.getSelectedRow();
        
        // pega o nome do cliente
        String nomeCliente = this.jCampoUsuario.getText();
        
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o livro na tabela");
        } else if (nomeCliente.equals("")) {
            JOptionPane.showMessageDialog(null, "Insira um nome de usuário");
        } else {
                
            // pega o ID do livro a ser emprestado
            int livroId = Integer.parseInt(jTableResultados.getModel().getValueAt(row, 0).toString());    
                
            try {
                // chama o método remoto para emprestar o livro
                String resposta = Cliente.interfaceServ.emprestarLivro(livroId, nomeCliente);

                // exibe a resposta do servidor
                JOptionPane.showMessageDialog(null, resposta);

            } catch (RemoteException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBotaoEmprestarActionPerformed

    private void jBotaoDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoDevolverActionPerformed
        
        // pega a linha selecionada na tabela
        int row = jTableResultados.getSelectedRow();
        
        // pega o nome do cliente
        String nomeCliente = this.jCampoUsuario.getText();
        
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o livro na tabela");
        } else if (nomeCliente.equals("")) {
            JOptionPane.showMessageDialog(null, "Insira um nome de usuário");
        } else {
                
            // pega o ID do livro a ser devolvido
            int livroId = Integer.parseInt(jTableResultados.getModel().getValueAt(row, 0).toString());    
                
            try {
                // chama o método remoto para devolver o livro
                String resposta = Cliente.interfaceServ.devolverLivro(livroId, nomeCliente);

                // exibe a resposta do servidor
                JOptionPane.showMessageDialog(null, resposta);

            } catch (RemoteException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBotaoDevolverActionPerformed

    private void jBotaoRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoRenovarActionPerformed
        
        // pega a linha selecionada na tabela
        int row = jTableResultados.getSelectedRow();
        
        // pega o nome do cliente
        String nomeCliente = this.jCampoUsuario.getText();
        
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "Selecione o livro na tabela");
        } else if (nomeCliente.equals("")) {
            JOptionPane.showMessageDialog(null, "Insira um nome de usuário");
        } else {
                
            // pega o ID do livro a ser renovado
            int livroId = Integer.parseInt(jTableResultados.getModel().getValueAt(row, 0).toString());    
                
            try {
                // chama o método remoto para renovar o livro
                String resposta = Cliente.interfaceServ.renovarLivro(livroId, nomeCliente);

                // exibe a resposta do servidor
                JOptionPane.showMessageDialog(null, resposta);

            } catch (RemoteException ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jBotaoRenovarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotaoConsulta;
    private javax.swing.JButton jBotaoDevolver;
    private javax.swing.JButton jBotaoEmprestar;
    private javax.swing.JButton jBotaoRenovar;
    private javax.swing.JButton jBotaoReservar;
    private javax.swing.JTextField jCampoPesquisa;
    private javax.swing.JTextField jCampoUsuario;
    private javax.swing.JTextField jDiasMaxEsperaReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelNotificacao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableResultados;
    // End of variables declaration//GEN-END:variables
}
