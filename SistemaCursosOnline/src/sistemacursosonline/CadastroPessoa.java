
package sistemacursosonline;

import java.beans.PropertyVetoException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CadastroPessoa extends javax.swing.JInternalFrame {

    String situação;
    String atividades;
    String id_pessoas;
    public CadastroPessoa() {
        initComponents();
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(CadastroPessoaCurso.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cpfCnpj = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        idade = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        endereco = new javax.swing.JTextField();
        situacao = new javax.swing.JComboBox<>();
        btnCadastrar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        matricula = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        atividade = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Pessoas");

        jLabel1.setText("CPF/CNPJ:");

        jLabel2.setText("Email:");

        jLabel3.setText("Idade:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Endereço:");

        jLabel6.setText("Situação:");

        situacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Ativo", "Inativo" }));
        situacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                situacaoItemStateChanged(evt);
            }
        });

        btnCadastrar.setText("CADASTRAR PESSOA");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });

        btnListar.setText("LISTAR PESSOAS");
        btnListar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListarMouseClicked(evt);
            }
        });

        btnEditar.setText("EDITAR PESSOA");
        btnEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditarMouseClicked(evt);
            }
        });

        btnRemover.setText("REMOVER PESSOA");
        btnRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoverMouseClicked(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "CPF/CNPJ", "Nome", "Matrícula", "Email", "Idade", "Telefone", "Endereço", "Atividade", "Situação"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel7.setText("Nome:");

        jLabel8.setText("Matrícula:");

        jLabel9.setText("Atividade:");

        atividade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Aluno", "Professor" }));
        atividade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                atividadeItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRemover))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(telefone)
                            .addComponent(email)
                            .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endereco)
                            .addComponent(cpfCnpj)
                            .addComponent(nome)
                            .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(atividade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(379, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(atividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(situacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnEditar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemover)
                    .addComponent(btnListar))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void situacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_situacaoItemStateChanged
        if(situacao.getSelectedItem().equals("Ativo")){
            situação = "A";
        } else if (situacao.getSelectedItem().equals("Inativo")){
            situação = "I";
        } else {
            situação = " ";
        }
    }//GEN-LAST:event_situacaoItemStateChanged

    private void atividadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_atividadeItemStateChanged
        if(atividade.getSelectedItem().equals("Aluno")){
            atividades = "Aluno";
        } else if (atividade.getSelectedItem().equals("Professor")){
            atividades = "Professor";
        } else {
            atividades = " ";
        }
    }//GEN-LAST:event_atividadeItemStateChanged

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        try {
        Connection con = BancoClass.conexaoBanco();
        con.setAutoCommit(false);
        String sql = "INSERT INTO pessoas(cpf_cnpj,nome,matricula,email,idade,telefone,endereco,atividade,situacao) VALUES(?,?,?,?,?,?,?,?,?);";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, cpfCnpj.getText());
        stmt.setString(2, nome.getText());
        stmt.setString(3, matricula.getText());
        stmt.setString(4, email.getText());
        stmt.setString(5, idade.getText());
        stmt.setString(6, telefone.getText());
        stmt.setString(7, endereco.getText());
        stmt.setString(8, atividades);
        stmt.setString(9, situação);  

        stmt.executeUpdate(); 
        con.commit(); 

        JOptionPane.showMessageDialog(rootPane,"Pessoa cadastrada com sucesso!");

        cpfCnpj.setText(null);
        nome.setText(null);
        matricula.setText(null);
        email.setText(null);
        idade.setText(null);
        telefone.setText(null);
        endereco.setText(null);
        atividade.setSelectedIndex(-1); 
        situacao.setSelectedIndex(-1);  

        stmt.close();
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(CadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar " + atividades + ": " + ex.getMessage());
    }

    try {  
        Connection con = BancoClass.conexaoBanco();
        String sql = "SELECT * FROM pessoas ORDER BY id_pessoa DESC;";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        DefaultTableModel modeloTabela = (DefaultTableModel) table.getModel();
        modeloTabela.setNumRows(0);
        while(rs.next()) {
            Object [] dados = {
                rs.getString("id_pessoa"),
                rs.getString("cpf_cnpj"),
                rs.getString("nome"),
                rs.getString("matricula"),
                rs.getString("email"),
                rs.getString("idade"),
                rs.getString("telefone"),
                rs.getString("endereco"),
                rs.getString("atividade"),
                rs.getString("situacao")
            };
            modeloTabela.addRow(dados);
        }
        stmt.close();
        rs.close();
        con.close();
    } catch (SQLException ex) {
        Logger.getLogger(CadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(rootPane, "Erro ao atualizar tabela: " + ex.getMessage());
    }
        
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void btnListarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListarMouseClicked
        try {  
            Connection con = BancoClass.conexaoBanco();
            String sql = "SELECT * FROM pessoas ORDER BY id_pessoa DESC;";
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modeloTabela = (DefaultTableModel) table.getModel();
            modeloTabela.setNumRows(0);
            while(rs.next()){
                Object [] dados = {
                    rs.getString("id_pessoa"),
                    rs.getString("cpf_cnpj"),
                    rs.getString("nome"),
                    rs.getString("matricula"),
                    rs.getString("email"),
                    rs.getString("idade"),
                    rs.getString("telefone"),
                    rs.getString("endereco"),
                    rs.getString("atividade"),
                    rs.getString("situacao")};
                modeloTabela.addRow(dados);
            }
            stmt.close();
            rs.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroCurso.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, " Lista não foi encontrada!");

        }
    }//GEN-LAST:event_btnListarMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        String activity;
        String situacoes;
        id_pessoas = (table.getValueAt(table.getSelectedRow(), 0)).toString();
        cpfCnpj.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
        nome.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
        matricula.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
        email.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
        idade.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
        telefone.setText(table.getValueAt(table.getSelectedRow(), 6).toString());
        endereco.setText(table.getValueAt(table.getSelectedRow(), 7).toString());
        activity = (table.getValueAt(table.getSelectedRow(), 8).toString());
        if(activity.equals("Aluno")){
            atividade.setSelectedItem("Aluno");
        }else if(activity.equals("Professor")){
            atividade.setSelectedItem("Professor");
        }
        situacoes = (table.getValueAt(table.getSelectedRow(), 9).toString());
        if(situacoes.equals("A")){
            situacao.setSelectedItem("Ativo");
        }else if(situacoes.equals("I")){
            situacao.setSelectedItem("Inativo");
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btnRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoverMouseClicked
    int selectedRow = table.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(rootPane, "Selecione uma pessoa para remover.");
        return;
    }
    int confirm = JOptionPane.showConfirmDialog(rootPane, 
        "Tem certeza de que deseja remover esta pessoa?", 
        "Confirmação", 
        JOptionPane.YES_NO_OPTION);
    
    if (confirm == JOptionPane.NO_OPTION) {
        return;
    }
    try {
        String idPessoa = table.getValueAt(selectedRow, 0).toString();
        Connection con = BancoClass.conexaoBanco();
        String sql = "DELETE FROM pessoas WHERE id_pessoa = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, idPessoa);

        int rowsAffected = stmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(rootPane, "Pessoa removida com sucesso!");
            DefaultTableModel modeloTabela = (DefaultTableModel) table.getModel();
            modeloTabela.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Erro ao remover a pessoa.");
        }
        String selectSql = "SELECT * FROM pessoas ORDER BY id_curso DESC;";
        PreparedStatement selectStmt = con.prepareStatement(selectSql);
        ResultSet rs = selectStmt.executeQuery();
        DefaultTableModel modeloTabela = (DefaultTableModel) table.getModel();
        modeloTabela.setNumRows(0);

        while(rs.next()){
                Object [] dados = {
                    rs.getString("id_pessoa"),
                    rs.getString("cpf_cnpj"),
                    rs.getString("nome"),
                    rs.getString("matricula"),
                    rs.getString("email"),
                    rs.getString("idade"),
                    rs.getString("telefone"),
                    rs.getString("endereco"),
                    rs.getString("atividade"),
                    rs.getString("situacao")};
                modeloTabela.addRow(dados);
            }
            stmt.close();
            rs.close();
            con.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(rootPane, "Erro ao remover a pessoa: " + nome.getText());
    }
    }//GEN-LAST:event_btnRemoverMouseClicked

    private void btnEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarMouseClicked
        try (Connection con = BancoClass.conexaoBanco()) {
        String sql = "UPDATE pessoas SET cpf_cnpj = ?, nome = ?, matricula = ?, email = ?, idade = ?, telefone = ?, endereco = ?, atividade = ?, situacao = ? WHERE id_pessoa = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, cpfCnpj.getText());
        stmt.setString(2, nome.getText());
        stmt.setString(3, matricula.getText());
        stmt.setString(4, email.getText());
        stmt.setString(5, idade.getText());
        stmt.setString(6, telefone.getText());
        stmt.setString(7, endereco.getText());
        stmt.setString(8, atividades);
        stmt.setString(9, situação);
        stmt.setString(10, id_pessoas);

        int rowsAffected = stmt.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(rootPane, "Pessoa editada com sucesso!");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Nenhuma pessoa foi encontrada para edição.");
        }

        String selectSql = "SELECT * FROM pessoas ORDER BY id_pessoa DESC;";
        PreparedStatement selectStmt = con.prepareStatement(selectSql);
        ResultSet rs = selectStmt.executeQuery();
        DefaultTableModel modeloTabela = (DefaultTableModel) table.getModel();
        modeloTabela.setNumRows(0);

        while (rs.next()) {
            Object[] dados = {
                rs.getString("id_pessoa"),
                rs.getString("cpf_cnpj"),
                rs.getString("nome"),
                rs.getString("matricula"),
                rs.getString("email"),
                rs.getString("idade"),
                rs.getString("telefone"),
                rs.getString("endereco"),
                rs.getString("atividade"),
                rs.getString("situacao")
            };
            modeloTabela.addRow(dados);
        }

        rs.close();
        selectStmt.close();
        stmt.close();
    } catch (SQLException ex) {
        Logger.getLogger(CadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(rootPane, nome.getText() + " não pode ser editado(a): " + ex.getMessage());
    }
    }//GEN-LAST:event_btnEditarMouseClicked

    private void setExtendedState(int MAXIMIZED_BOTH) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> atividade;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JTextField cpfCnpj;
    private javax.swing.JTextField email;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField idade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField matricula;
    private javax.swing.JTextField nome;
    private javax.swing.JComboBox<String> situacao;
    private javax.swing.JTable table;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
