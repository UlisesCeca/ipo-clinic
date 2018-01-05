package presentacion;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;

import dominio.ImagenMedica;

import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ImageInfo {

	private JFrame frmAdministracinHospital;
	private JTextArea textArea;
	private JButton btnAceptar;
	private JButton btnEditar;
	private JButton btnEditar2;
	private boolean doneNEW = true;
	private JButton btnCancelar;
	private boolean done = true;
	private JLabel lblFoto;
	private String mode = ""; //$NON-NLS-1$
	private String previouspic;
	private ImagenMedica imagen;
	private JButton button;
	private JLabel lblNombre;
	private JLabel lblCheck;
	JFormattedTextField formattedTextField;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem;
	private JSeparator separator;

	/**
	 * Create the application.
	 */
	public ImageInfo(ImagenMedica imagen, JButton button) {
		this.button = button;
		this.imagen = imagen;
		initialize();
		this.frmAdministracinHospital.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdministracinHospital = new JFrame();
		frmAdministracinHospital.setTitle(Messages.getString("ImageInfo.frmAdministracinHospital.title")); //$NON-NLS-1$
		frmAdministracinHospital.setIconImage(Toolkit.getDefaultToolkit().getImage(ImageInfo.class.getResource("/presentacion/icon.png"))); //$NON-NLS-1$
		frmAdministracinHospital.setBounds(100, 100, 792, 466);
		frmAdministracinHospital.addWindowListener(new FrameWindowListener());
		frmAdministracinHospital.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frmAdministracinHospital.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{70, 199, 67, 0, 3, 0};
		gbl_panel.rowHeights = new int[]{259, 20, 68, 35, 20, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblFoto = new JLabel(Messages.getString("ImageInfo.lblFoto.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblFoto = new GridBagConstraints();
		gbc_lblFoto.gridwidth = 3;
		gbc_lblFoto.insets = new Insets(0, 0, 5, 5);
		gbc_lblFoto.gridx = 0;
		gbc_lblFoto.gridy = 0;
		panel.add(lblFoto, gbc_lblFoto);
		
		lblNombre = new JLabel(Messages.getString("ImageInfo.lblNombre.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		panel.add(lblNombre, gbc_lblNombre);
		
		formattedTextField = new JFormattedTextField();
		formattedTextField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();

			    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
			    	e.consume();
			}
		});
		formattedTextField.setToolTipText(Messages.getString("ImageInfo.formattedTextField.toolTipText")); //$NON-NLS-1$
		formattedTextField.setFocusable(false);
		formattedTextField.addFocusListener(new MiFocusListener());
		formattedTextField.setText(imagen.getName());
		formattedTextField.setEditable(false);
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.anchor = GridBagConstraints.NORTH;
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.gridx = 1;
		gbc_formattedTextField.gridy = 2;
		panel.add(formattedTextField, gbc_formattedTextField);
		
		textArea = new JTextArea();
		textArea.setToolTipText(Messages.getString("ImageInfo.textArea.toolTipText")); //$NON-NLS-1$
		textArea.setFocusable(false);
		textArea.addFocusListener(new MiFocusListener());
		textArea.setEditable(false);
		textArea.setText(imagen.getInfo());
		textArea.setLineWrap(true);
		textArea.setBorder(new TitledBorder(null, Messages.getString("ImageInfo.textArea.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_textArea = new GridBagConstraints();
		gbc_textArea.gridheight = 3;
		gbc_textArea.insets = new Insets(0, 0, 5, 5);
		gbc_textArea.fill = GridBagConstraints.BOTH;
		gbc_textArea.gridx = 3;
		gbc_textArea.gridy = 0;
		panel.add(textArea, gbc_textArea);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.anchor = GridBagConstraints.SOUTHEAST;
		gbc_panel_1.gridx = 3;
		gbc_panel_1.gridy = 3;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{315, 79, 0};
		gbl_panel_1.rowHeights = new int[]{30, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);

		btnEditar = new JButton(Messages.getString("ImageInfo.btnEditar.text")); //$NON-NLS-1$
		btnEditar.setToolTipText(Messages.getString("ImageInfo.btnEditar.toolTipText")); //$NON-NLS-1$
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(doneNEW){
				textArea.setEditable(true);
				textArea.setFocusable(true);
				formattedTextField.setEditable(true);
				formattedTextField.setFocusable(true);
				formattedTextField.requestFocus();
				textArea.setCaretPosition(textArea.getDocument().getLength());
				btnAceptar.setVisible(false);
				btnEditar.setVisible(false);
				btnCancelar.setVisible(true);
				btnEditar2.setVisible(true);
				lblNombre.setText(Messages.getString("ImageInfo.2")); //$NON-NLS-1$
				done = false;
				doneNEW = true;
				lblCheck.setVisible(false);
				}
			}
		});
		btnEditar.setFocusable(false);
		btnEditar.setBorder(new LineBorder(Color.ORANGE, 3));
		btnEditar.setContentAreaFilled(false);
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.fill = GridBagConstraints.VERTICAL;
		gbc_btnEditar.anchor = GridBagConstraints.EAST;
		gbc_btnEditar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEditar.gridx = 0;
		gbc_btnEditar.gridy = 0;
		panel_1.add(btnEditar, gbc_btnEditar);
		
		btnCancelar = new JButton(Messages.getString("ImageInfo.btnCancelar.text")); //$NON-NLS-1$
		btnCancelar.setToolTipText(Messages.getString("ImageInfo.btnCancelar.toolTipText")); //$NON-NLS-1$
		btnCancelar.setVisible(false);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!doneNEW){
					lblCheck.setVisible(true);
					lblCheck.setText(Messages.getString("ImageInfo.3")); //$NON-NLS-1$
				} else {
					if (!done){
						int salir = JOptionPane.showConfirmDialog(null, Messages.getString("ImageInfo.4"), Messages.getString("ImageInfo.5"), //$NON-NLS-1$ //$NON-NLS-2$
								JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
						
						if (salir == JOptionPane.YES_OPTION) {
								hideNewEdit();
								unsetNeededField();
								done = true;
								formattedTextField.setText(imagen.getName());
								textArea.setText(imagen.getInfo());
								lblCheck.setVisible(false);
							}
						
					}
				}
				
				
			}
		});		
		btnCancelar.setBorder(new LineBorder(new Color(255, 0, 0), 3));
		btnCancelar.setContentAreaFilled(false);
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.VERTICAL;
		gbc_btnCancelar.gridx = 1;
		gbc_btnCancelar.gridy = 0;
		panel_1.add(btnCancelar, gbc_btnCancelar);
		
		btnAceptar = new JButton(Messages.getString("ImageInfo.btnAceptar.text")); //$NON-NLS-1$
		btnAceptar.setToolTipText(Messages.getString("ImageInfo.btnAceptar.toolTipText")); //$NON-NLS-1$
		btnAceptar.setFocusable(false);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAdministracinHospital.dispose();
			}
		});
		btnAceptar.setBorder(new LineBorder(Color.GREEN, 3));
		btnAceptar.setContentAreaFilled(false);
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.fill = GridBagConstraints.VERTICAL;
		gbc_btnAceptar.gridx = 1;
		gbc_btnAceptar.gridy = 0;
		panel_1.add(btnAceptar, gbc_btnAceptar);
		
		btnEditar2 = new JButton(Messages.getString("ImageInfo.btnEditar2.text")); //$NON-NLS-1$
		btnEditar2.setToolTipText(Messages.getString("ImageInfo.btnEditar2.toolTipText")); //$NON-NLS-1$
		btnEditar2.setVisible(false);
		btnEditar2.setFocusable(false);
		btnEditar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (formattedTextField.getText().length() != 0){
					imagen.setInfo(textArea.getText());
					imagen.setName(formattedTextField.getText());
					btnEditar.setVisible(true);
					btnAceptar.setVisible(true);
					btnEditar2.setVisible(false);
					btnCancelar.setVisible(false);
					formattedTextField.setEditable(false);
					textArea.setEditable(false);
					lblNombre.setText(Messages.getString("ImageInfo.6")); //$NON-NLS-1$
					formattedTextField.setFocusable(false);
					textArea.setFocusable(false);
					JOptionPane.showMessageDialog(frmAdministracinHospital, Messages.getString("ImageInfo.7"), Messages.getString("ImageInfo.8"), //$NON-NLS-1$ //$NON-NLS-2$
							JOptionPane.INFORMATION_MESSAGE);
					lblCheck.setVisible(false);
					done = true;
					doneNEW = true;
					button.setText(imagen.getName());
				} else {
					lblCheck.setVisible(true);
					lblCheck.setText(Messages.getString("ImageInfo.9")); //$NON-NLS-1$
					
				}
			}
		});
		btnEditar2.setFocusable(false);
		btnEditar2.setBorder(new LineBorder(Color.GREEN, 3));
		btnEditar2.setContentAreaFilled(false);
		GridBagConstraints gbc_btnEditar2 = new GridBagConstraints();
		gbc_btnEditar2.fill = GridBagConstraints.VERTICAL;
		gbc_btnEditar2.anchor = GridBagConstraints.EAST;
		gbc_btnEditar2.insets = new Insets(0, 0, 0, 5);
		gbc_btnEditar2.gridx = 0;
		gbc_btnEditar2.gridy = 0;
		panel_1.add(btnEditar2, gbc_btnEditar2);
		Image image;
		if (PrincipalWindow.class.getResource(imagen.getImagePath()) != null){
			image = Toolkit.getDefaultToolkit().getImage(PrincipalWindow.class.getResource(imagen.getImagePath()));
		} else {
		    image = Toolkit.getDefaultToolkit().getImage(imagen.getImagePath());
		}
		Image scaledImg = image.getScaledInstance(200, 200, Image.SCALE_DEFAULT);	
		lblFoto.setIcon(new ImageIcon(scaledImg));
		
		lblCheck = new JLabel(Messages.getString("ImageInfo.lblCheck.text")); //$NON-NLS-1$
		lblCheck.setVisible(false);
		lblCheck.setForeground(Color.RED);
		GridBagConstraints gbc_lblCheck = new GridBagConstraints();
		gbc_lblCheck.insets = new Insets(0, 0, 0, 5);
		gbc_lblCheck.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblCheck.gridx = 3;
		gbc_lblCheck.gridy = 4;
		panel.add(lblCheck, gbc_lblCheck);
		
		separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridx = 4;
		gbc_separator.gridy = 4;
		panel.add(separator, gbc_separator);
		
		menuBar = new JMenuBar();
		frmAdministracinHospital.setJMenuBar(menuBar);
		Component horizontalGlue = Box.createHorizontalGlue();
	    horizontalGlue.setMaximumSize(new Dimension(11897, 0));
	    menuBar.add(horizontalGlue);
		menu = new JMenu(Messages.getString("ImageInfo.menu.text")); //$NON-NLS-1$
		menuBar.add(menu);
		
		menuItem = new JMenuItem(Messages.getString("ImageInfo.menuItem.text")); //$NON-NLS-1$
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Help(Messages.getString("ImageInfo.10")); //$NON-NLS-1$
			}
		});
		menuItem.setIcon(new ImageIcon(ImageInfo.class.getResource("/presentacion/info-flat.png"))); //$NON-NLS-1$
		menu.add(menuItem);
		
		if (imagen.getName().equals("")){ //$NON-NLS-1$
			formattedTextField.setEditable(true);
			formattedTextField.setFocusable(true);
			formattedTextField.requestFocus();
			textArea.setEditable(true);
			textArea.setFocusable(true);
			formattedTextField.setFocusable(true);
			textArea.setCaretPosition(textArea.getDocument().getLength());
			btnAceptar.setVisible(false);
			btnEditar.setVisible(false);
			btnCancelar.setVisible(true);
			btnEditar2.setVisible(true);
			lblNombre.setText(Messages.getString("ImageInfo.13")); //$NON-NLS-1$
			doneNEW = false;
			done = false;
		}
	}

	private void hideNewEdit(){
		btnEditar2.setVisible(false);
		btnCancelar.setVisible(false);
		btnEditar.setVisible(true);
		btnAceptar.setVisible(true);
	}
	
	private void showNewEdit(){
		btnEditar2.setVisible(true);
		btnCancelar.setVisible(true);
		formattedTextField.setEditable(true);
		textArea.setEditable(true);
		btnEditar.setVisible(false);
		btnAceptar.setVisible(false);
	}
	
	private void unsetNeededField(){
		formattedTextField.setEditable(false);
		textArea.setEditable(false);
		formattedTextField.setFocusable(false);
		textArea.setFocusable(false);
	}
	
	private class FrameWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent arg0) {
			if (!doneNEW){
				lblCheck.setVisible(true);
				lblCheck.setText(Messages.getString("ImageInfo.14")); //$NON-NLS-1$
			} else {
				if (!done){
					int salir = JOptionPane.showConfirmDialog(null, Messages.getString("ImageInfo.15"), Messages.getString("ImageInfo.16"), //$NON-NLS-1$ //$NON-NLS-2$
							JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					
					if (salir == JOptionPane.YES_OPTION) {
						frmAdministracinHospital.dispose();
						
					}
				
				} else {
					frmAdministracinHospital.dispose();
					
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
	
private class BtnCargaFoto implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {

			JFileChooser fcAbrir = new JFileChooser();
			FileNameExtensionFilter filtro = new FileNameExtensionFilter("PNG", "png"); //$NON-NLS-1$ //$NON-NLS-2$
			fcAbrir.setFileFilter(filtro);
			int valor = fcAbrir.showOpenDialog(frmAdministracinHospital);

			//Recoger el nombre del fichero seleccionado por el usuario
			if (valor == JFileChooser.APPROVE_OPTION) {
				File file = fcAbrir.getSelectedFile();
				try {
					FileReader fr = new FileReader(file.getAbsolutePath());
					BufferedReader br = new BufferedReader(fr);
					Image image = Toolkit.getDefaultToolkit().getImage(file.getAbsolutePath());
					Image scaledImg = image.getScaledInstance(200, 200, Image.SCALE_DEFAULT);	
					lblFoto.setIcon(new ImageIcon((scaledImg)));
					imagen.setImagePath(file.getAbsolutePath().toString());
					showNewEdit();

				} catch (IOException ex) {
					System.out.println(ex.getStackTrace());
				}
			}
		}
	}

}
