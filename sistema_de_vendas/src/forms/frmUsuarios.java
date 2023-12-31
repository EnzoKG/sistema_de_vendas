/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package forms;

import classes.Dados;
import classes.Usuarios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author enzog
 */
public class frmUsuarios extends javax.swing.JInternalFrame {

    private Dados clsdados;
    private int usuarioAtual = 0;
    private boolean cmdAdicionar = false;
    private DefaultTableModel userTable;
    
    public void setDados(Dados clsDados) {
        this.clsdados = clsDados;
    }
    /**
     * Creates new form frmUsuarios
     */
    public frmUsuarios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodUsuario = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmeSenha = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        boxPerfil = new javax.swing.JComboBox<>();
        cmdInicio = new javax.swing.JButton();
        cmdVoltar = new javax.swing.JButton();
        cmdAvancar = new javax.swing.JButton();
        cmdFim = new javax.swing.JButton();
        cmdAdd = new javax.swing.JButton();
        cmdEditar = new javax.swing.JButton();
        cmdSalvar = new javax.swing.JButton();
        cmdBuscar = new javax.swing.JButton();
        cmdDeletar = new javax.swing.JButton();
        cmdCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de usuários");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setText("Código Usuário:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Sobrenome:");

        jLabel4.setText("Senha:");

        jLabel5.setText("Confirme a senha:");

        txtCodUsuario.setEnabled(false);
        txtCodUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodUsuarioActionPerformed(evt);
            }
        });

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtSobrenome.setEnabled(false);
        txtSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSobrenomeActionPerformed(evt);
            }
        });

        txtSenha.setEnabled(false);
        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });

        txtConfirmeSenha.setEnabled(false);
        txtConfirmeSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmeSenhaActionPerformed(evt);
            }
        });

        jLabel6.setText("Perfil:");

        boxPerfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Administrador", "Funcionário" }));
        boxPerfil.setEnabled(false);
        boxPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxPerfilActionPerformed(evt);
            }
        });

        cmdInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left-arrow.png"))); // NOI18N
        cmdInicio.setToolTipText("Primeiro Cadastro");
        cmdInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdInicioActionPerformed(evt);
            }
        });

        cmdVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        cmdVoltar.setToolTipText("Cadastro Anterior");
        cmdVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVoltarActionPerformed(evt);
            }
        });

        cmdAvancar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.png"))); // NOI18N
        cmdAvancar.setToolTipText("Próximo Cadastro");
        cmdAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAvancarActionPerformed(evt);
            }
        });

        cmdFim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right.png"))); // NOI18N
        cmdFim.setToolTipText("Último Cadastro");
        cmdFim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdFimActionPerformed(evt);
            }
        });

        cmdAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        cmdAdd.setToolTipText("Novo Cadastro");
        cmdAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAddActionPerformed(evt);
            }
        });

        cmdEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pen.png"))); // NOI18N
        cmdEditar.setToolTipText("Editar Cadastro");
        cmdEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdEditarActionPerformed(evt);
            }
        });

        cmdSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/floppy-disk.png"))); // NOI18N
        cmdSalvar.setToolTipText("Salvar Cadastro");
        cmdSalvar.setEnabled(false);
        cmdSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalvarActionPerformed(evt);
            }
        });

        cmdBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/magnifying-glass.png"))); // NOI18N
        cmdBuscar.setToolTipText("Buscar Cadastro");

        cmdDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        cmdDeletar.setToolTipText("Deletar Cadastro");
        cmdDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDeletarActionPerformed(evt);
            }
        });

        cmdCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        cmdCancelar.setToolTipText("Cancelar");
        cmdCancelar.setEnabled(false);
        cmdCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCancelarActionPerformed(evt);
            }
        });

        mTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(mTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdFim, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtConfirmeSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCodUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(boxPerfil, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE))
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(289, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boxPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtConfirmeSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmdInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmdVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmdAvancar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmdBuscar)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmdDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmdAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmdEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmdSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(cmdCancelar)))))
                    .addComponent(cmdFim, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodUsuarioActionPerformed

    private void boxPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxPerfilActionPerformed

    private void cmdVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVoltarActionPerformed
        // TODO add your handling code here:
        usuarioAtual--;
        if(usuarioAtual == -1) {
            usuarioAtual = clsdados.qtdUsers() - 1;
        }
        visualizarCadastros();
    }//GEN-LAST:event_cmdVoltarActionPerformed

    private void cmdInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdInicioActionPerformed
        // TODO add your handling code here:
        usuarioAtual = 0;
        visualizarCadastros();
    }//GEN-LAST:event_cmdInicioActionPerformed

    private void cmdAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAddActionPerformed
        // TODO add your handling code here:
        cmdInicio.setEnabled(false);
        cmdVoltar.setEnabled(false);
        cmdAvancar.setEnabled(false);
        cmdFim.setEnabled(false);
        cmdAdd.setEnabled(false);
        cmdEditar.setEnabled(false);
        cmdSalvar.setEnabled(true);
        cmdBuscar.setEnabled(false);
        cmdDeletar.setEnabled(true);
        
        boxPerfil.setEnabled(true);
        txtCodUsuario.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfirmeSenha.setEnabled(true);
        
        boxPerfil.setSelectedIndex(0);
        txtCodUsuario.setText("");
        txtNome.setText("");
        txtSobrenome.setText("");
        txtSenha.setText("");
        txtConfirmeSenha.setText("");
        
        cmdAdicionar = true;
        
        txtCodUsuario.requestFocusInWindow();
        loadTable();
    }//GEN-LAST:event_cmdAddActionPerformed

    private void cmdSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalvarActionPerformed
        if(txtCodUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "O CÓDIGO do usuário não pode ser vazio!");
            txtCodUsuario.requestFocusInWindow();
            return;
        }
        
        if(boxPerfil.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o PERFIL do Usuário!");
            boxPerfil.requestFocusInWindow();
            return;
        }
        
        if(txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Escreva o NOME do usuário!");
            txtNome.requestFocusInWindow();
            return;
        }
        
        if(txtSobrenome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite o SOBRENOME do usuário!");
            txtSobrenome.requestFocusInWindow();
            return;
        }
        
        if(new String(txtSenha.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(rootPane, "A SENHA do usuário não pode ser vazia!");
            txtSenha.requestFocusInWindow();
            return;
        }
        
        if(new String(txtConfirmeSenha.getPassword()).equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Confirme a SENHA do usuário!");
            txtConfirmeSenha.requestFocusInWindow();
            return;
        }
        
        if(!new String(txtSenha.getPassword()).equals(new String(txtConfirmeSenha.getPassword()))) {
            JOptionPane.showMessageDialog(rootPane, "As SENHAS não coincidem!");
            txtConfirmeSenha.requestFocusInWindow();
            return;
        }
        
        int posLinha = clsdados.linhaUsuario(txtCodUsuario.getText());
        if(cmdAdicionar) {
            if(posLinha != -1) {
                JOptionPane.showMessageDialog(rootPane, "Esse CADASTRO de usuário já existe!");
                txtCodUsuario.requestFocusInWindow();
                return;
            }
        } else {
            if(posLinha == -1) {
                txtCodUsuario.requestFocusInWindow();
                return;
            }
        }
        
        Usuarios user = new Usuarios(txtCodUsuario.getText(), txtNome.getText(), txtSobrenome.getText(), new String(txtSenha.getPassword()), (String)boxPerfil.getSelectedItem());
        String msg;
        
        if(cmdAdicionar) {
            msg = clsdados.cadUsuario(user);
        } else {
            msg = clsdados.editUsuario(user, posLinha);
        }
        
        JOptionPane.showMessageDialog(rootPane, msg);
        
        // TODO add your handling code here:
        cmdInicio.setEnabled(true);
        cmdVoltar.setEnabled(true);
        cmdAvancar.setEnabled(true);
        cmdFim.setEnabled(true);
        cmdAdd.setEnabled(true);
        cmdEditar.setEnabled(true);
        cmdSalvar.setEnabled(false);
        cmdBuscar.setEnabled(true);
        cmdCancelar.setEnabled(false);
        
        boxPerfil.setEnabled(false);
        txtCodUsuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtConfirmeSenha.setEnabled(false);
        
        loadTable();
    }//GEN-LAST:event_cmdSalvarActionPerformed

    private void cmdDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDeletarActionPerformed
        // TODO add your handling code here:
        int del = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente DELETAR esse cadastro?");
        if(del != 0) {
            return;
        }
        
        String msg;
        msg = clsdados.delUsuario(usuarioAtual);
        JOptionPane.showMessageDialog(rootPane, msg);
        usuarioAtual = 0;
        visualizarCadastros();
        loadTable();
    }//GEN-LAST:event_cmdDeletarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSobrenomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSobrenomeActionPerformed

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void txtConfirmeSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmeSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmeSenhaActionPerformed

    private void cmdEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdEditarActionPerformed
        // TODO add your handling code here:
        cmdInicio.setEnabled(false);
        cmdVoltar.setEnabled(false);
        cmdAvancar.setEnabled(false);
        cmdFim.setEnabled(false);
        cmdAdd.setEnabled(false);
        cmdEditar.setEnabled(false);
        cmdSalvar.setEnabled(true);
        cmdBuscar.setEnabled(false);
        cmdDeletar.setEnabled(true);
        
        boxPerfil.setEnabled(true);
        txtNome.setEnabled(true);
        txtSobrenome.setEnabled(true);
        txtSenha.setEnabled(true);
        txtConfirmeSenha.setEnabled(true);
        
        txtNome.requestFocusInWindow();
        
        cmdAdicionar = false;
    }//GEN-LAST:event_cmdEditarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        visualizarCadastros();
        loadTable();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmdFimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdFimActionPerformed
        // TODO add your handling code here:
        usuarioAtual = clsdados.qtdUsers() - 1;
        visualizarCadastros();
    }//GEN-LAST:event_cmdFimActionPerformed

    private void cmdAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAvancarActionPerformed
        // TODO add your handling code here:
        usuarioAtual++;
        if(usuarioAtual == clsdados.qtdUsers()) {
            usuarioAtual = 0;
        }
        visualizarCadastros();
    }//GEN-LAST:event_cmdAvancarActionPerformed

    private void cmdCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCancelarActionPerformed
        // TODO add your handling code here:
        cmdInicio.setEnabled(true);
        cmdVoltar.setEnabled(true);
        cmdAvancar.setEnabled(true);
        cmdFim.setEnabled(true);
        cmdAdd.setEnabled(true);
        cmdEditar.setEnabled(true);
        cmdSalvar.setEnabled(false);
        cmdBuscar.setEnabled(true);
        cmdDeletar.setEnabled(false);
        
        boxPerfil.setEnabled(false);
        txtCodUsuario.setEnabled(false);
        txtNome.setEnabled(false);
        txtSobrenome.setEnabled(false);
        txtSenha.setEnabled(false);
        txtConfirmeSenha.setEnabled(false);
    }//GEN-LAST:event_cmdCancelarActionPerformed
    
    private void visualizarCadastros() {
        txtCodUsuario.setText(clsdados.getUsuarios()[usuarioAtual].getIdUsuario());
        txtNome.setText(clsdados.getUsuarios()[usuarioAtual].getNome());
        txtSobrenome.setText(clsdados.getUsuarios()[usuarioAtual].getSobrenome());
        txtSenha.setText(clsdados.getUsuarios()[usuarioAtual].getSenha());
        txtConfirmeSenha.setText(clsdados.getUsuarios()[usuarioAtual].getSenha());
        boxPerfil.setSelectedItem(clsdados.getUsuarios()[usuarioAtual].getPerfil());
    }
    
    private void loadTable() {
        String tituloCabecalho[] = {"Código do Usuário", "Nome", "Sobrenome", "Perfil"};
        String regCadastro[] = new String[4];
        userTable = new DefaultTableModel(null, tituloCabecalho);
        for(int i = 0; i < clsdados.qtdUsers(); i++) {
            regCadastro[0] = clsdados.getUsuarios()[i].getIdUsuario();
            regCadastro[1] = clsdados.getUsuarios()[i].getNome();
            regCadastro[2] = clsdados.getUsuarios()[i].getSobrenome();
            regCadastro[3] = clsdados.getUsuarios()[i].getPerfil();
            userTable.addRow(regCadastro);
        }
        mTable.setModel(userTable);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxPerfil;
    private javax.swing.JButton cmdAdd;
    private javax.swing.JButton cmdAvancar;
    private javax.swing.JButton cmdBuscar;
    private javax.swing.JButton cmdCancelar;
    private javax.swing.JButton cmdDeletar;
    private javax.swing.JButton cmdEditar;
    private javax.swing.JButton cmdFim;
    private javax.swing.JButton cmdInicio;
    private javax.swing.JButton cmdSalvar;
    private javax.swing.JButton cmdVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable mTable;
    private javax.swing.JTextField txtCodUsuario;
    private javax.swing.JPasswordField txtConfirmeSenha;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
