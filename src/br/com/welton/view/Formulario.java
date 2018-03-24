package br.com.welton.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
public class Formulario extends JFrame{

	GridBagConstraints gbc = null;
	
	static int NOVA_LINHA = 0;
	static int NOVA_COLUNA = 1;
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Formulario() {
		this.setLayout(new GridBagLayout());
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		gbc = new GridBagConstraints();
		gbc.insets = new Insets(10, 10, 0, 10);
		gbc.anchor = GridBagConstraints.WEST;
		JLabel lblTitulo = newDescricao("Efetue o login Agora e não perca tempo", NOVA_LINHA, 2);
		this.add(lblTitulo, gbc);
		
		JLabel lblUsuario = newDescricao("Usuário", NOVA_LINHA,1);
		this.add(lblUsuario, gbc);
		
		JTextField txtUsuario = newCampoDigitacao(30, 30, NOVA_COLUNA, 1);
		this.add(txtUsuario, gbc);
		
		JLabel lblSenha = newDescricao("Senha", NOVA_LINHA,1);
		this.add(lblSenha, gbc);
		
		
		JTextField txtSenha = newCampoDigitacao(30, 30,  NOVA_COLUNA,1);
		this.add(txtSenha, gbc);
		
		JButton btnEntrar = newBotao("Entrar", NOVA_LINHA,1);
		this.add(btnEntrar, gbc);
		
		JButton btnLimpar = newBotao("Limpar", NOVA_COLUNA,1);
		this.add(btnLimpar, gbc);
			
		
	}
	
	
	private JLabel newDescricao(String valor, int posicao, int qtdeColunas) {

		configurar(posicao, qtdeColunas);
		
		JLabel l = new JLabel(valor);
		l.setBorder(new LineBorder(Color.BLACK));
		return l;
	}
	
	private JTextField newCampoDigitacao(int colunas, int tamanho, int posicao, int qtdeColunas) {

		configurar(posicao, qtdeColunas);
		
		JTextField t = new JTextField(colunas);
		t.setPreferredSize(new Dimension(100, tamanho));
		return t;
	}
	
	private JButton newBotao(String descricao, int posicao, int qtdeColunas) {
		
		configurar(posicao, qtdeColunas);
		
		JButton b = new JButton(descricao);
		
		return b;
	}
	
	
	private void configurar(int posicao, int qtdeColunas) {
		if(posicao == NOVA_LINHA) {
			gbc.gridy = gbc.gridy + 1;
			gbc.gridx = 0;
		}
		else {
			gbc.gridx = gbc.gridx + 1;
		}
		
		gbc.gridwidth = qtdeColunas;
		
	}
	
	
}
