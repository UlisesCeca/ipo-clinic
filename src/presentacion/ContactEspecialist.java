package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import dominio.Specialist;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import java.awt.Toolkit;

public class ContactEspecialist {

	private JFrame frmContactarEspecialista;
	private JTextField txtTitulo;
	private JTextField txtDestinatario;
	private JLabel lblCheck;
	private JLabel lblAdjunto1;
	private JLabel lblAdjunto2;
	private JLabel lblAdjunto3;
	private JTextArea txtpDescripcion;
	private Specialist specialist;
	private JLabel lblFotoEmail;
	private boolean loaded1 = false;
	private boolean loaded2 = false;
	private boolean loaded3 = false;
	
	/**
	 * Create the application.
	 */
	public ContactEspecialist(Specialist s) {
		initialize();
		frmContactarEspecialista.setVisible(true);
		this.txtDestinatario.setText(s.getName() + " " + s.getSurname()); //$NON-NLS-1$
		this.lblFotoEmail.setIcon(new ImageIcon(PrincipalWindow.class.getResource(s.getPicturePath())));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmContactarEspecialista = new JFrame();
		frmContactarEspecialista.setIconImage(Toolkit.getDefaultToolkit().getImage(ContactEspecialist.class.getResource("/presentacion/27630.png"))); //$NON-NLS-1$
		frmContactarEspecialista.setResizable(false);
		frmContactarEspecialista.setTitle(Messages.getString("ContactEspecialist.frmContactarEspecialista.title")); //$NON-NLS-1$
		frmContactarEspecialista.setBounds(100, 100, 698, 610);
		frmContactarEspecialista.addWindowListener(new FrameWindowListener());
		frmContactarEspecialista.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
		
		JPanel panel = new JPanel();
		panel.setBorder(null);
		panel.setBackground(Color.WHITE);
		frmContactarEspecialista.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{314, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel pFoto = new JPanel();
		pFoto.setBorder(null);
		pFoto.setOpaque(false);
		GridBagConstraints gbc_pFoto = new GridBagConstraints();
		gbc_pFoto.insets = new Insets(0, 0, 0, 5);
		gbc_pFoto.fill = GridBagConstraints.BOTH;
		gbc_pFoto.gridx = 0;
		gbc_pFoto.gridy = 0;
		panel.add(pFoto, gbc_pFoto);
		GridBagLayout gbl_pFoto = new GridBagLayout();
		gbl_pFoto.columnWidths = new int[]{306, 0};
		gbl_pFoto.rowHeights = new int[]{225, 0};
		gbl_pFoto.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pFoto.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pFoto.setLayout(gbl_pFoto);
		
		lblFotoEmail = new JLabel(""); //$NON-NLS-1$
		lblFotoEmail.setToolTipText(Messages.getString("ContactEspecialist.lblFotoEmail.toolTipText")); //$NON-NLS-1$
		lblFotoEmail.setIcon(new ImageIcon(ContactEspecialist.class.getResource("/presentacion/especialista.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblFotoEmail = new GridBagConstraints();
		gbc_lblFotoEmail.gridx = 0;
		gbc_lblFotoEmail.gridy = 0;
		pFoto.add(lblFotoEmail, gbc_lblFotoEmail);
		
		JPanel pDatosEmail = new JPanel();
		pDatosEmail.setBorder(new TitledBorder(null, Messages.getString("ContactEspecialist.pDatosEmail.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		pDatosEmail.setOpaque(false);
		GridBagConstraints gbc_pDatosEmail = new GridBagConstraints();
		gbc_pDatosEmail.fill = GridBagConstraints.BOTH;
		gbc_pDatosEmail.gridx = 1;
		gbc_pDatosEmail.gridy = 0;
		panel.add(pDatosEmail, gbc_pDatosEmail);
		GridBagLayout gbl_pDatosEmail = new GridBagLayout();
		gbl_pDatosEmail.columnWidths = new int[]{321, 0};
		gbl_pDatosEmail.rowHeights = new int[]{0, 0, 25, 0, 33, 209, 33, 46, 101, 18, 0};
		gbl_pDatosEmail.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pDatosEmail.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pDatosEmail.setLayout(gbl_pDatosEmail);
		
		JLabel lblDestinatario = new JLabel(Messages.getString("ContactEspecialist.lblDestinatario.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblDestinatario = new GridBagConstraints();
		gbc_lblDestinatario.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDestinatario.insets = new Insets(0, 0, 5, 0);
		gbc_lblDestinatario.gridx = 0;
		gbc_lblDestinatario.gridy = 0;
		pDatosEmail.add(lblDestinatario, gbc_lblDestinatario);
		
		txtDestinatario = new JTextField();
		txtDestinatario.setToolTipText(Messages.getString("ContactEspecialist.txtDestinatario.toolTipText")); //$NON-NLS-1$
		txtDestinatario.setEnabled(false);
		GridBagConstraints gbc_txtDestinatario = new GridBagConstraints();
		gbc_txtDestinatario.insets = new Insets(0, 0, 5, 0);
		gbc_txtDestinatario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDestinatario.gridx = 0;
		gbc_txtDestinatario.gridy = 1;
		pDatosEmail.add(txtDestinatario, gbc_txtDestinatario);
		txtDestinatario.setColumns(10);
		
		JLabel lblTtulo = new JLabel(Messages.getString("ContactEspecialist.lblTtulo.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblTtulo = new GridBagConstraints();
		gbc_lblTtulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblTtulo.anchor = GridBagConstraints.SOUTH;
		gbc_lblTtulo.insets = new Insets(0, 0, 5, 0);
		gbc_lblTtulo.gridx = 0;
		gbc_lblTtulo.gridy = 2;
		pDatosEmail.add(lblTtulo, gbc_lblTtulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setToolTipText(Messages.getString("ContactEspecialist.txtTitulo.toolTipText")); //$NON-NLS-1$
		txtTitulo.addFocusListener(new MiFocusListener());
		GridBagConstraints gbc_txtTitulo = new GridBagConstraints();
		gbc_txtTitulo.insets = new Insets(0, 0, 5, 0);
		gbc_txtTitulo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTitulo.gridx = 0;
		gbc_txtTitulo.gridy = 3;
		pDatosEmail.add(txtTitulo, gbc_txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblDescripcin = new JLabel(Messages.getString("ContactEspecialist.lblDescripcin.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblDescripcin = new GridBagConstraints();
		gbc_lblDescripcin.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblDescripcin.anchor = GridBagConstraints.SOUTH;
		gbc_lblDescripcin.insets = new Insets(0, 0, 5, 0);
		gbc_lblDescripcin.gridx = 0;
		gbc_lblDescripcin.gridy = 4;
		pDatosEmail.add(lblDescripcin, gbc_lblDescripcin);
		
		txtpDescripcion = new JTextArea();
		txtpDescripcion.setToolTipText(Messages.getString("ContactEspecialist.txtpDescripcion.toolTipText")); //$NON-NLS-1$
		txtpDescripcion.addFocusListener(new MiFocusListener());
		txtpDescripcion.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_txtpDescripcion = new GridBagConstraints();
		gbc_txtpDescripcion.insets = new Insets(0, 0, 5, 0);
		gbc_txtpDescripcion.fill = GridBagConstraints.BOTH;
		gbc_txtpDescripcion.gridx = 0;
		gbc_txtpDescripcion.gridy = 5;
		pDatosEmail.add(txtpDescripcion, gbc_txtpDescripcion);
		
		JLabel lblAdjuntos = new JLabel(Messages.getString("ContactEspecialist.lblAdjuntos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblAdjuntos = new GridBagConstraints();
		gbc_lblAdjuntos.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblAdjuntos.anchor = GridBagConstraints.SOUTH;
		gbc_lblAdjuntos.insets = new Insets(0, 0, 5, 0);
		gbc_lblAdjuntos.gridx = 0;
		gbc_lblAdjuntos.gridy = 6;
		pDatosEmail.add(lblAdjuntos, gbc_lblAdjuntos);
		
		JPanel pAdjuntos = new JPanel();
		pAdjuntos.setBorder(null);
		pAdjuntos.setOpaque(false);
		GridBagConstraints gbc_pAdjuntos = new GridBagConstraints();
		gbc_pAdjuntos.insets = new Insets(0, 0, 5, 0);
		gbc_pAdjuntos.fill = GridBagConstraints.BOTH;
		gbc_pAdjuntos.gridx = 0;
		gbc_pAdjuntos.gridy = 7;
		pDatosEmail.add(pAdjuntos, gbc_pAdjuntos);
		GridBagLayout gbl_pAdjuntos = new GridBagLayout();
		gbl_pAdjuntos.columnWidths = new int[]{111, 89, 117, 0};
		gbl_pAdjuntos.rowHeights = new int[]{44, 0};
		gbl_pAdjuntos.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pAdjuntos.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pAdjuntos.setLayout(gbl_pAdjuntos);
		
		lblAdjunto1 = new JLabel(Messages.getString("ContactEspecialist.lblAdjunto1.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblAdjunto1 = new GridBagConstraints();
		gbc_lblAdjunto1.anchor = GridBagConstraints.WEST;
		gbc_lblAdjunto1.insets = new Insets(0, 0, 0, 5);
		gbc_lblAdjunto1.gridx = 0;
		gbc_lblAdjunto1.gridy = 0;
		pAdjuntos.add(lblAdjunto1, gbc_lblAdjunto1);
		
		lblAdjunto2 = new JLabel(Messages.getString("ContactEspecialist.lblAdjunto2.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblAdjunto2 = new GridBagConstraints();
		gbc_lblAdjunto2.anchor = GridBagConstraints.WEST;
		gbc_lblAdjunto2.insets = new Insets(0, 0, 0, 5);
		gbc_lblAdjunto2.gridx = 1;
		gbc_lblAdjunto2.gridy = 0;
		pAdjuntos.add(lblAdjunto2, gbc_lblAdjunto2);
		
		lblAdjunto3 = new JLabel(Messages.getString("ContactEspecialist.lblAdjunto3.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblAdjunto3 = new GridBagConstraints();
		gbc_lblAdjunto3.anchor = GridBagConstraints.WEST;
		gbc_lblAdjunto3.gridx = 2;
		gbc_lblAdjunto3.gridy = 0;
		pAdjuntos.add(lblAdjunto3, gbc_lblAdjunto3);
		
		JPanel pBotones = new JPanel();
		pBotones.setOpaque(false);
		GridBagConstraints gbc_pBotones = new GridBagConstraints();
		gbc_pBotones.insets = new Insets(0, 0, 5, 0);
		gbc_pBotones.fill = GridBagConstraints.BOTH;
		gbc_pBotones.gridx = 0;
		gbc_pBotones.gridy = 8;
		pDatosEmail.add(pBotones, gbc_pBotones);
		GridBagLayout gbl_pBotones = new GridBagLayout();
		gbl_pBotones.columnWidths = new int[]{56, 11, 49, 0};
		gbl_pBotones.rowHeights = new int[]{33, 21, 30, 0};
		gbl_pBotones.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pBotones.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		pBotones.setLayout(gbl_pBotones);
		
		JButton btnAadir = new JButton(Messages.getString("ContactEspecialist.btnAadir.text")); //$NON-NLS-1$
		btnAadir.setToolTipText(Messages.getString("ContactEspecialist.btnAadir.toolTipText")); //$NON-NLS-1$
		btnAadir.addActionListener(new AdjuntarListener());
		btnAadir.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
		btnAadir.setBackground(Color.LIGHT_GRAY);
		btnAadir.setContentAreaFilled(false);
		btnAadir.setFocusable(false);
		GridBagConstraints gbc_btnAadir = new GridBagConstraints();
		gbc_btnAadir.insets = new Insets(0, 0, 5, 5);
		gbc_btnAadir.fill = GridBagConstraints.BOTH;
		gbc_btnAadir.gridx = 0;
		gbc_btnAadir.gridy = 0;
		pBotones.add(btnAadir, gbc_btnAadir);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 1;
		pBotones.add(separator, gbc_separator);
		
		JButton btnEnviar = new JButton(Messages.getString("ContactEspecialist.btnEnviar.text")); //$NON-NLS-1$
		btnEnviar.setToolTipText(Messages.getString("ContactEspecialist.btnEnviar.toolTipText")); //$NON-NLS-1$
		btnEnviar.addActionListener(new EnviarEmailListener());
		btnEnviar.setBorder(new LineBorder(new Color(0, 255, 0), 3, true));
		btnEnviar.setFocusable(false);
		btnEnviar.setContentAreaFilled(false);
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnviar.fill = GridBagConstraints.BOTH;
		gbc_btnEnviar.gridx = 0;
		gbc_btnEnviar.gridy = 2;
		pBotones.add(btnEnviar, gbc_btnEnviar);
		
		JButton btnCancelar = new JButton(Messages.getString("ContactEspecialist.btnCancelar.text")); //$NON-NLS-1$
		btnCancelar.setToolTipText(Messages.getString("ContactEspecialist.btnCancelar.toolTipText")); //$NON-NLS-1$
		btnCancelar.addActionListener(new BtnCancelarContactListener());
		
		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 0, 5);
		gbc_separator_2.gridx = 1;
		gbc_separator_2.gridy = 2;
		pBotones.add(separator_2, gbc_separator_2);
		btnCancelar.setContentAreaFilled(false);
		btnCancelar.setFocusable(false);
		btnCancelar.setBorder(new LineBorder(new Color(255, 0, 0), 3));
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.BOTH;
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 2;
		pBotones.add(btnCancelar, gbc_btnCancelar);
		
		lblCheck = new JLabel(Messages.getString("ContactEspecialist.lblCheck.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblCheck = new GridBagConstraints();
		gbc_lblCheck.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblCheck.gridx = 0;
		gbc_lblCheck.gridy = 9;
		pDatosEmail.add(lblCheck, gbc_lblCheck);
		
		JMenuBar menuBar = new JMenuBar();
		frmContactarEspecialista.setJMenuBar(menuBar);
		
		Component horizontalGlue = Box.createHorizontalGlue();
	    horizontalGlue.setMaximumSize(new Dimension(11897, 0));
	    menuBar.add(horizontalGlue);
		JMenu menu = new JMenu(Messages.getString("ContactEspecialist.menu.text")); //$NON-NLS-1$
		menuBar.add(menu);
		
		JMenuItem menuItem = new JMenuItem(Messages.getString("ContactEspecialist.menuItem.text")); //$NON-NLS-1$
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Help("enviar email"); //$NON-NLS-1$
			}
		});
		menuItem.setIcon(new ImageIcon(ContactEspecialist.class.getResource("/presentacion/info-flat.png"))); //$NON-NLS-1$
		menu.add(menuItem);
	}
	
	private class FrameWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent arg0) {
			int salir = JOptionPane.showConfirmDialog(null, Messages.getString("ContactEspecialist.6"), Messages.getString("ContactEspecialist.7"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			
			if (salir == JOptionPane.YES_OPTION) {
				frmContactarEspecialista.dispose();
			}
		}
	}
	
	private class BtnCancelarContactListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int salir = JOptionPane.showConfirmDialog(null, Messages.getString("ContactEspecialist.8"), Messages.getString("ContactEspecialist.9"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			
			if (salir == JOptionPane.YES_OPTION) {
				frmContactarEspecialista.dispose();
			}
		}
	}
	
	private class EnviarEmailListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (txtTitulo.getText().length() == 0 || txtpDescripcion.getText().length() == 0){
				lblCheck.setVisible(true);
				lblCheck.setText(Messages.getString("ContactEspecialist.10")); //$NON-NLS-1$
				
				
			} else {
				JOptionPane.showMessageDialog(frmContactarEspecialista, Messages.getString("ContactEspecialist.11"), Messages.getString("ContactEspecialist.12"), //$NON-NLS-1$ //$NON-NLS-2$
						JOptionPane.INFORMATION_MESSAGE);
				lblCheck.setVisible(false);
				frmContactarEspecialista.dispose();
			}
		}
	}
	
	private class AdjuntarListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			if (loaded1 && loaded2 && loaded3) {
				JOptionPane.showMessageDialog(null, Messages.getString("ContactEspecialist.13"), "Error.", JOptionPane.ERROR_MESSAGE); //$NON-NLS-1$ //$NON-NLS-2$
				
			} else {
				JFileChooser archivo = new JFileChooser();
	
				FileNameExtensionFilter filtro = new FileNameExtensionFilter(".doc", "doc");	//filtramos //$NON-NLS-1$ //$NON-NLS-2$
				archivo.setFileFilter(filtro);
				filtro = new FileNameExtensionFilter(".png", "png");	//filtramos //$NON-NLS-1$ //$NON-NLS-2$
				archivo.setFileFilter(filtro);
	
				int valor = archivo.showOpenDialog(frmContactarEspecialista); // Mostramos la ventana de guardado

				if (valor == JFileChooser.APPROVE_OPTION) {
					try {
						
							File file = archivo.getSelectedFile();
							// Apertura del fichero y creacion de BufferedReader
							FileReader fr = new FileReader(file.getAbsolutePath());
							
							String filename=archivo.getSelectedFile().getName();
							
							if (!loaded1){
								lblAdjunto1.setText(filename);
								JOptionPane.showMessageDialog(null, Messages.getString("ContactEspecialist.19"), Messages.getString("ContactEspecialist.20"), //$NON-NLS-1$ //$NON-NLS-2$
										JOptionPane.INFORMATION_MESSAGE);
								loaded1 = true;
								
							} else if (!loaded2){
								lblAdjunto2.setText(filename);
								JOptionPane.showMessageDialog(null, Messages.getString("ContactEspecialist.21"), Messages.getString("ContactEspecialist.22"), //$NON-NLS-1$ //$NON-NLS-2$
										JOptionPane.INFORMATION_MESSAGE);
								loaded2 = true;
								
							} else if (!loaded3) {
								lblAdjunto3.setText(filename);
								JOptionPane.showMessageDialog(null, Messages.getString("ContactEspecialist.23"), Messages.getString("ContactEspecialist.24"), //$NON-NLS-1$ //$NON-NLS-2$
										JOptionPane.INFORMATION_MESSAGE);
								loaded3 = true;
								
							}
						
							
				
					} catch (IOException ioe) {
						JOptionPane.showMessageDialog(null, Messages.getString("ContactEspecialist.25"), Messages.getString("ContactEspecialist.26"), //$NON-NLS-1$ //$NON-NLS-2$
								JOptionPane.WARNING_MESSAGE);
				}
				}
			}
		}
	}
	
	private class MiFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			e.getComponent().setBackground(new Color(250, 250, 210));
		}

		@Override
		public void focusLost(FocusEvent e) {
			e.getComponent().setBackground(new Color(250, 250, 250));
		}
	}
			
			
}