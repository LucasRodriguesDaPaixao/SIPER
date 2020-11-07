/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lucas
 */
public class Interface extends JFrame
{
    GridBagLayout layout = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();
    
    public static void main(String[] args)
    {
        java.awt.EventQueue.invokeLater(() -> 
        {
            new Interface().setVisible(true);
        });
        
    }
    
    public Interface()
    {
        initComponents();
    }
    
    private void initComponents()
    {
        setLayout(layout);
        getContentPane().setBackground(new Color(82, 167, 202)); 
        
        // Frame principal
        super.setTitle("SIPER");
        super.setSize(800, 600);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
        
        // Componentes de tela
        JPanel jPanel = new JPanel();
        JButton btnBG = new JButton(); // Imagem de fundo
        JButton btnEntrar = new JButton();
        JLabel lblLogo = new JLabel();
        JLabel lblComida = new JLabel();
        JLabel lblSiper = new JLabel();
        JLabel lblTxt1 = new JLabel();
        JLabel lblTxt2 = new JLabel();
        
        
        // Config Componente de tela
        btnEntrar.setBackground(new Color(255, 102, 102));
        btnEntrar.setFont(new Font("Arial", 1, 36));
        btnEntrar.setForeground(new Color(255, 255, 255));
        btnEntrar.setIcon(new ImageIcon(getClass().getResource("/View/Imagens/btnEntrar.png")));
        
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener((ActionEvent evt) ->
        {
            btnEntrarClick(evt);
        });
        
        btnEntrar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnEntrarClick(evt);
                
            }
        });
        
        gbc.weightx = 1;
        gbc.weighty = 1;
        
        /*btnBG.setBackground(new Color(51, 51, 255));
        btnBG.setIcon(new ImageIcon(getClass().getResource("/View/Imagens/background.png")));
        btnBG.setDisabledIcon(btnBG.getIcon());
        btnBG.setEnabled(false);*/
        //add(addComponent(btnBG, 0, 0, 0, 0, GridBagConstraints.BOTH));

        
        lblLogo.setIcon(new ImageIcon(getClass().getResource("/View/Imagens/logo.png")));
        gbc.anchor = GridBagConstraints.FIRST_LINE_START;
        gbc.insets = new Insets(0,10,0,15);
        /*btnBG.*/add(addComponent(lblLogo, 0, 0, 1, 1, GridBagConstraints.NONE), gbc);
        
        
        lblTxt1.setIcon(new ImageIcon(getClass().getResource("/View/Imagens/texto1.png")));
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0,15,0,0);
        /*btnBG.*/add(addComponent(lblTxt1, 1, 0, 1, 1, GridBagConstraints.NONE), gbc);
        
        lblTxt2.setIcon(new ImageIcon(getClass().getResource("/View/Imagens/texto2.png")));
        gbc.anchor = GridBagConstraints.LINE_START;
        gbc.insets = new Insets(0,10,0,0);
        /*btnBG.*/add(addComponent(lblTxt2, 2, 0, 1, 1, GridBagConstraints.NONE), gbc);
        
        
        lblComida.setIcon(new ImageIcon(getClass().getResource("/View/Imagens/burger.png")));
        gbc.anchor = GridBagConstraints.CENTER;
        add(addComponent(lblComida, 0, 2, 1, 1, GridBagConstraints.NONE), gbc);
        
        lblSiper.setIcon(new ImageIcon(getClass().getResource("/View/Imagens/siper.png")));
        gbc.anchor = GridBagConstraints.CENTER;
        add(addComponent(lblSiper, 1, 2, 1, 1, GridBagConstraints.NONE), gbc);
        
        
        gbc.anchor = GridBagConstraints.LAST_LINE_START;
        gbc.insets = new Insets(0,10,0,0);
        /*btnBG.*/add(addComponent(btnEntrar, 4, 0, 1, 1, GridBagConstraints.NONE), gbc);
       }
    
    public Component addComponent(Component comp, int row, int column, int width, int height, int fill)
    {
        gbc.fill = fill;
        gbc.gridx = column;
        gbc.gridy = row;
        gbc.gridwidth = width;
        gbc.gridheight = height;
        layout.setConstraints(comp, gbc);
        return comp;
    }
    
    private void btnEntrarClick(ActionEvent evt)
    {
        this.dispose();
        new InterfaceLogin().setVisible(true);
    }
}

