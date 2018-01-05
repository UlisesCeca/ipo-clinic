package presentacion;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;

import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import javax.swing.plaf.FontUIResource;

import javax.swing.JSeparator;
import java.awt.Dimension;

public class Login {

	private JFrame frmAdministracinHospital;
	private JTextField txtUser;
	private JPasswordField txtPassword;
	private	Border bordeRojo = BorderFactory.createLineBorder(Color.RED);
	private	Border bordeVerde = BorderFactory.createLineBorder(Color.GREEN);
	private JLabel lblUserCheck;
	private JLabel lblPasswordCheck;
	private JButton btnLogin;
	private JMenuBar menuBar;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel icon;
	private JPanel pnlboton;
	private JMenu menu;
	private JMenu menu_1;
	private JMenu menu_2;
	private JRadioButtonMenuItem radioButtonMenuItem;
	private JRadioButtonMenuItem radioButtonMenuItem_1;
	private JSeparator separator;
	private JMenuItem menuItem;
	private JMenu menu_4;
	private JMenuItem menuItem_2;
	private JMenu menu_5;
	private JRadioButtonMenuItem radioButtonMenuItem_2;
	private JRadioButtonMenuItem radioButtonMenuItem_3;
	private JRadioButtonMenuItem fuente;
	private JRadioButtonMenuItem idioma;
	private JRadioButtonMenuItem radioButtonMenuItem_4;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
            // Set System L&F
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
    } 
    catch (UnsupportedLookAndFeelException e) {
       // handle exception
    }
    catch (ClassNotFoundException e) {
       // handle exception
    }
    catch (InstantiationException e) {
       // handle exception
    }
    catch (IllegalAccessException e) {
       // handle exception
    }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login(null, null);
					window.frmAdministracinHospital.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login(JRadioButtonMenuItem fuente, JRadioButtonMenuItem idioma) {
		this.idioma = idioma;
		this.fuente = fuente;
		initialize();
		frmAdministracinHospital.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdministracinHospital = new JFrame();
		frmAdministracinHospital.setTitle(Messages.getString("Login.frmAdministracinHospital.title")); //$NON-NLS-1$
		frmAdministracinHospital.setResizable(false);
		frmAdministracinHospital.setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/presentacion/icon.png"))); //$NON-NLS-1$
		frmAdministracinHospital.setBounds(100, 100, 443, 247);
		frmAdministracinHospital.addWindowListener(new FrameWindowListener());
		frmAdministracinHospital.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		JPanel panelLogin = new JPanel();
		frmAdministracinHospital.getContentPane().add(panelLogin, BorderLayout.CENTER);
		GridBagLayout gbl_panelLogin = new GridBagLayout();
		gbl_panelLogin.columnWidths = new int[]{139, 75, 139, 204, 0};
		gbl_panelLogin.rowHeights = new int[]{37, 28, 34, 0, 35, 26, 0};
		gbl_panelLogin.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelLogin.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelLogin.setLayout(gbl_panelLogin);
		
		JLabel lblIntroduzcaSusDatos = new JLabel(Messages.getString("Login.lblIntroduzcaSusDatos.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblIntroduzcaSusDatos = new GridBagConstraints();
		gbc_lblIntroduzcaSusDatos.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblIntroduzcaSusDatos.anchor = GridBagConstraints.SOUTH;
		gbc_lblIntroduzcaSusDatos.insets = new Insets(0, 0, 5, 5);
		gbc_lblIntroduzcaSusDatos.gridx = 2;
		gbc_lblIntroduzcaSusDatos.gridy = 0;
		panelLogin.add(lblIntroduzcaSusDatos, gbc_lblIntroduzcaSusDatos);
		
		JLabel lblUser = new JLabel(Messages.getString("Login.lblUser.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblUser = new GridBagConstraints();
		gbc_lblUser.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblUser.anchor = GridBagConstraints.SOUTH;
		gbc_lblUser.insets = new Insets(0, 0, 5, 5);
		gbc_lblUser.gridx = 2;
		gbc_lblUser.gridy = 1;
		panelLogin.add(lblUser, gbc_lblUser);
		
		icon = new JLabel(""); //$NON-NLS-1$
		GridBagConstraints gbc_icon = new GridBagConstraints();
		gbc_icon.anchor = GridBagConstraints.NORTH;
		gbc_icon.gridheight = 3;
		gbc_icon.insets = new Insets(0, 0, 5, 5);
		gbc_icon.gridx = 0;
		gbc_icon.gridy = 2;
		panelLogin.add(icon, gbc_icon);
		
		txtUser = new JTextField();
		txtUser.setToolTipText(Messages.getString("Login.txtUser.toolTipText")); //$NON-NLS-1$
		GridBagConstraints gbc_txtUser = new GridBagConstraints();
		gbc_txtUser.anchor = GridBagConstraints.NORTH;
		txtUser.addFocusListener(new MiFocusListener());
		txtUser.addKeyListener(new MyTextUserListener());
		gbc_txtUser.insets = new Insets(0, 0, 5, 5);
		gbc_txtUser.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUser.gridx = 2;
		gbc_txtUser.gridy = 2;
		panelLogin.add(txtUser, gbc_txtUser);
		txtUser.setColumns(10);
		
		lblUserCheck = new JLabel(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblUserCheck = new GridBagConstraints();
		gbc_lblUserCheck.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblUserCheck.insets = new Insets(0, 0, 5, 0);
		gbc_lblUserCheck.gridx = 3;
		gbc_lblUserCheck.gridy = 2;
		panelLogin.add(lblUserCheck, gbc_lblUserCheck);
		
		txtPassword = new JPasswordField();
		txtPassword.setToolTipText(Messages.getString("Login.3")); //$NON-NLS-1$
		txtPassword.addFocusListener(new MiFocusListener());
		txtPassword.addKeyListener(new MyTextPasswordListener());
		
		JLabel lblPassword = new JLabel(Messages.getString("Login.lblPassword.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPassword = new GridBagConstraints();
		gbc_lblPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPassword.anchor = GridBagConstraints.SOUTH;
		gbc_lblPassword.insets = new Insets(0, 0, 5, 5);
		gbc_lblPassword.gridx = 2;
		gbc_lblPassword.gridy = 3;
		panelLogin.add(lblPassword, gbc_lblPassword);
		txtPassword.setEnabled(false);
		GridBagConstraints gbc_txtPassword = new GridBagConstraints();
		gbc_txtPassword.anchor = GridBagConstraints.NORTH;
		gbc_txtPassword.insets = new Insets(0, 0, 5, 5);
		gbc_txtPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPassword.gridx = 2;
		gbc_txtPassword.gridy = 4;
		panelLogin.add(txtPassword, gbc_txtPassword);
		
		lblPasswordCheck = new JLabel(Messages.getString("Login.lblPasswordCheck.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblPasswordCheck = new GridBagConstraints();
		gbc_lblPasswordCheck.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblPasswordCheck.insets = new Insets(0, 0, 5, 0);
		gbc_lblPasswordCheck.gridx = 3;
		gbc_lblPasswordCheck.gridy = 4;
		panelLogin.add(lblPasswordCheck, gbc_lblPasswordCheck);
		
		pnlboton = new JPanel();
		pnlboton.setOpaque(false);
		GridBagConstraints gbc_pnlboton = new GridBagConstraints();
		gbc_pnlboton.insets = new Insets(0, 0, 0, 5);
		gbc_pnlboton.fill = GridBagConstraints.BOTH;
		gbc_pnlboton.gridx = 2;
		gbc_pnlboton.gridy = 5;
		panelLogin.add(pnlboton, gbc_pnlboton);
		GridBagLayout gbl_pnlboton = new GridBagLayout();
		gbl_pnlboton.columnWidths = new int[]{46, 51, 0, 0};
		gbl_pnlboton.rowHeights = new int[]{26, 0};
		gbl_pnlboton.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pnlboton.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pnlboton.setLayout(gbl_pnlboton);
		
		
		
		menuBar = new JMenuBar();
		frmAdministracinHospital.setJMenuBar(menuBar);
		
		menu = new JMenu(Messages.getString("Login.menu.text")); //$NON-NLS-1$
		menuBar.add(menu);
		
		menu_1 = new JMenu(Messages.getString("Login.menu_1.text")); //$NON-NLS-1$
		menu_1.setIcon(new ImageIcon(Login.class.getResource("/presentacion/System-Preferences.png"))); //$NON-NLS-1$
		menu.add(menu_1);
		
		menu_2 = new JMenu(Messages.getString("Login.menu_2.text")); //$NON-NLS-1$
		menu_2.setIcon(new ImageIcon(Login.class.getResource("/presentacion/idioma.png"))); //$NON-NLS-1$
		menu_1.add(menu_2);
		
		radioButtonMenuItem = new JRadioButtonMenuItem(Messages.getString("Login.radioButtonMenuItem.text")); //$NON-NLS-1$
		radioButtonMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Messages.setIdioma("español"); //$NON-NLS-1$
				idioma = radioButtonMenuItem;
				Login l = new Login(idioma, fuente);
				l.setEspanol();
				radioButtonMenuItem.setSelected(true);
				frmAdministracinHospital.dispose();
			}
		});
		buttonGroup_1.add(radioButtonMenuItem);
		radioButtonMenuItem.setIcon(new ImageIcon(Login.class.getResource("/presentacion/spanish.png"))); //$NON-NLS-1$
		menu_2.add(radioButtonMenuItem);
		
		radioButtonMenuItem_1 = new JRadioButtonMenuItem(Messages.getString("Login.radioButtonMenuItem_1.text")); //$NON-NLS-1$
		radioButtonMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Messages.setIdioma("inglés"); //$NON-NLS-1$
				 Login l = new Login(idioma, fuente);
				 l.setIngles();
				radioButtonMenuItem_1.setSelected(true);
				frmAdministracinHospital.dispose();
			}
		});
		buttonGroup_1.add(radioButtonMenuItem_1);
		radioButtonMenuItem_1.setIcon(new ImageIcon(Login.class.getResource("/presentacion/english.png"))); //$NON-NLS-1$
		menu_2.add(radioButtonMenuItem_1);
		
		menu_5 = new JMenu(Messages.getString("Login.menu_5.text")); //$NON-NLS-1$
		menu_1.add(menu_5);
		menu_5.setIcon(new ImageIcon(Login.class.getResource("/presentacion/font.png"))); //$NON-NLS-1$
		
		radioButtonMenuItem_2 = new JRadioButtonMenuItem(Messages.getString("Login.radioButtonMenuItem_2.text")); //$NON-NLS-1$
		buttonGroup.add(radioButtonMenuItem_2);
		radioButtonMenuItem_2.addActionListener(new MiPequenaActionListener());
		radioButtonMenuItem_2.setIcon(new ImageIcon(Login.class.getResource("/presentacion/fontpeque.png"))); //$NON-NLS-1$
		menu_5.add(radioButtonMenuItem_2);
		
		radioButtonMenuItem_3 = new JRadioButtonMenuItem(Messages.getString("Login.radioButtonMenuItem_3.text")); //$NON-NLS-1$
		buttonGroup.add(radioButtonMenuItem_3);
		radioButtonMenuItem_3.addActionListener(new MiNormalActionListener());
		radioButtonMenuItem_3.setIcon(new ImageIcon(Login.class.getResource("/presentacion/fontnormal.png"))); //$NON-NLS-1$
		menu_5.add(radioButtonMenuItem_3);
		
		radioButtonMenuItem_4 = new JRadioButtonMenuItem(Messages.getString("Login.13")); //$NON-NLS-1$
		buttonGroup.add(radioButtonMenuItem_4);
		radioButtonMenuItem_4.setText(Messages.getString("Login.radioButtonMenuItem_4.text")); //$NON-NLS-1$
		radioButtonMenuItem_4.addActionListener(new MiGrandeActionListener());
		radioButtonMenuItem_4.setIcon(new ImageIcon(Login.class.getResource("/presentacion/fontbig.png"))); //$NON-NLS-1$
		menu_5.add(radioButtonMenuItem_4);
		
		if (fuente == null || fuente.getText().equals(Messages.getString("Login.15"))){ //$NON-NLS-1$
			radioButtonMenuItem_3.setSelected(true);
		}
		else if(fuente.getText().equals(Messages.getString("Login.16"))){ //$NON-NLS-1$
			radioButtonMenuItem_2.setSelected(true);
		} else if (fuente.getText().equals(Messages.getString("Login.17"))){ //$NON-NLS-1$
			radioButtonMenuItem_4.setSelected(true);
		}
		
		if (idioma == null || idioma.getText().equals(Messages.getString("Login.18"))){ //$NON-NLS-1$
			radioButtonMenuItem.setSelected(true);
		}
		else {
			radioButtonMenuItem_1.setSelected(true);
		}
		
		btnLogin = new JButton(Messages.getString("Login.btnLogin.text")); //$NON-NLS-1$
		btnLogin.setToolTipText(Messages.getString("Login.btnLogin.toolTipText")); //$NON-NLS-1$
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.fill = GridBagConstraints.BOTH;
		gbc_btnLogin.insets = new Insets(0, 0, 0, 5);
		gbc_btnLogin.gridx = 1;
		gbc_btnLogin.gridy = 0;
		pnlboton.add(btnLogin, gbc_btnLogin);
		btnLogin.setContentAreaFilled(false);
		btnLogin.setBorder(new LineBorder(new Color(192, 192, 192), 3, true));
		btnLogin.setFocusable(false);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (radioButtonMenuItem_2.isSelected()){
					if (radioButtonMenuItem.isSelected()){
						new PrincipalWindow(radioButtonMenuItem_2, radioButtonMenuItem);
					} else {
						new PrincipalWindow(radioButtonMenuItem_2, radioButtonMenuItem_1);
					}
					
				} else if (radioButtonMenuItem_3.isSelected()){
					if (radioButtonMenuItem.isSelected()){
						new PrincipalWindow(radioButtonMenuItem_3, radioButtonMenuItem);
					} else {
						new PrincipalWindow(radioButtonMenuItem_3, radioButtonMenuItem_1);
					}
					
				} else if (radioButtonMenuItem_4.isSelected()){
					if (radioButtonMenuItem.isSelected()){
						new PrincipalWindow(radioButtonMenuItem_4, radioButtonMenuItem);
					} else {
						new PrincipalWindow(radioButtonMenuItem_4, radioButtonMenuItem_1);
					}
				}
				
				frmAdministracinHospital.dispose();
			}
		});
		btnLogin.setEnabled(false);
		
		separator = new JSeparator();
		menu.add(separator);
		
		menuItem = new JMenuItem(Messages.getString("Login.menuItem.text")); //$NON-NLS-1$
		menuItem.addActionListener(new AcercadeListener());
		menuItem.setIcon(new ImageIcon(Login.class.getResource("/presentacion/information-icon.png"))); //$NON-NLS-1$
		menu.add(menuItem);
		
		
		Component horizontalGlue = Box.createHorizontalGlue();
	    horizontalGlue.setMaximumSize(new Dimension(11897, 0));
	    menuBar.add(horizontalGlue);
		menu_4 = new JMenu("?"); //$NON-NLS-1$
		menuBar.add(menu_4);
		
		menuItem_2 = new JMenuItem(Messages.getString("Login.menuItem_2.text")); //$NON-NLS-1$
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Help("login"); //$NON-NLS-1$
			}
		});
		menuItem_2.setIcon(new ImageIcon(Login.class.getResource("/presentacion/info-flat.png"))); //$NON-NLS-1$
		menu_4.add(menuItem_2);
	}
	
	public void setEspanol(){
		radioButtonMenuItem.setSelected(true);
	}
	
	public void setIngles(){
		radioButtonMenuItem_1.setSelected(true);
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
	
	private class MyTextUserListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			if (txtUser.getText().equals("ulises")) { //$NON-NLS-1$
				txtUser.setBorder(bordeVerde);
				lblUserCheck.setIcon(new ImageIcon(Login.class.getResource("/presentacion/tick.png"))); //$NON-NLS-1$
				txtPassword.setEnabled(true);
			} else {
				txtUser.setBorder(bordeRojo);
				lblUserCheck.setIcon(new ImageIcon(Login.class.getResource("/presentacion/cross-error.png"))); //$NON-NLS-1$
				txtPassword.setEnabled(false);
				lblUserCheck.setToolTipText("Este usuario no existe."); //$NON-NLS-1$
			}
		}
	}
	
	private class MyTextPasswordListener extends KeyAdapter {
		@Override
		public void keyReleased(KeyEvent e) {
			char [] password = txtPassword.getPassword();
			if (isPasswordCorrect(password)) {
				txtPassword.setBorder(bordeVerde);
				lblPasswordCheck.setIcon(new ImageIcon(Login.class.getResource("/presentacion/tick.png"))); //$NON-NLS-1$
				btnLogin.setEnabled(true);
				btnLogin.setBorder(bordeVerde);
			} else {
				lblPasswordCheck.setIcon(new ImageIcon(Login.class.getResource("/presentacion/cross-error.png"))); //$NON-NLS-1$
				btnLogin.setEnabled(false);
				lblPasswordCheck.setToolTipText("La contraseña es erronea."); //$NON-NLS-1$
			}
		}
	}
	
	private static boolean isPasswordCorrect(char[] input) {
	    boolean isCorrect = true;
	    char[] correctPassword = { 'u', 'l', 'i', 's', 'e', 's',};

	    if (input.length != correctPassword.length) {
	        isCorrect = false;
	    } else {
	        isCorrect = Arrays.equals (input, correctPassword);
	    }

	    //Zero out the password.
	    Arrays.fill(correctPassword,'0');

	    return isCorrect;
	}
	
	private class AcercadeListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frmAdministracinHospital, Messages.getString("Login.30"), Messages.getString("Login.31"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
	
	private class FrameWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent arg0) {
			int salir = JOptionPane.showConfirmDialog(null, Messages.getString("Login.32"), Messages.getString("Login.33"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			
			if (salir == JOptionPane.YES_OPTION) {
					System.exit(0);
			}
		}
	}
	
	private class MiPequenaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Font f = new FontUIResource(frmAdministracinHospital.getFont().getFontName(), frmAdministracinHospital.getFont().getStyle(), 10);
	        UIManager.put("Label.font", f); //$NON-NLS-1$
	        UIManager.put("Menu.font", f); //$NON-NLS-1$
	        UIManager.put("MenuItem.font", f); //$NON-NLS-1$
	        UIManager.put("RadioButtonMenuItem.font", f); //$NON-NLS-1$
	        UIManager.put("TabbedPane.font", f); //$NON-NLS-1$
	        UIManager.put("List.font", f); //$NON-NLS-1$
	        UIManager.put("TitledBorder.font", f); //$NON-NLS-1$
	        UIManager.put("FormattedTextField.font", f); //$NON-NLS-1$
	        UIManager.put("Button.font", f); //$NON-NLS-1$
	        UIManager.put("ComboBox.font", f); //$NON-NLS-1$
	        UIManager.put("TextArea.font", f); //$NON-NLS-1$
	        UIManager.put("TextField.font", f); //$NON-NLS-1$
	        SwingUtilities.updateComponentTreeUI(frmAdministracinHospital);
			
		}
	}

	private class MiNormalActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Font f = new FontUIResource(frmAdministracinHospital.getFont().getFontName(), frmAdministracinHospital.getFont().getStyle(), 13);
	        UIManager.put("Label.font", f); //$NON-NLS-1$
	        UIManager.put("Menu.font", f); //$NON-NLS-1$
	        UIManager.put("MenuItem.font", f); //$NON-NLS-1$
	        UIManager.put("RadioButtonMenuItem.font", f); //$NON-NLS-1$
	        UIManager.put("TabbedPane.font", f); //$NON-NLS-1$
	        UIManager.put("List.font", f); //$NON-NLS-1$
	        UIManager.put("TitledBorder.font", f); //$NON-NLS-1$
	        UIManager.put("FormattedTextField.font", f); //$NON-NLS-1$
	        UIManager.put("Button.font", f); //$NON-NLS-1$
	        UIManager.put("ComboBox.font", f); //$NON-NLS-1$
	        UIManager.put("TextArea.font", f); //$NON-NLS-1$
	        UIManager.put("TextField.font", f); //$NON-NLS-1$
	        SwingUtilities.updateComponentTreeUI(frmAdministracinHospital);
		}
	}

	private class MiGrandeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Font f = new FontUIResource(frmAdministracinHospital.getFont().getFontName(), frmAdministracinHospital.getFont().getStyle(), 15);
	        UIManager.put("Label.font", f); //$NON-NLS-1$
	        UIManager.put("Menu.font", f); //$NON-NLS-1$
	        UIManager.put("MenuItem.font", f); //$NON-NLS-1$
	        UIManager.put("RadioButtonMenuItem.font", f); //$NON-NLS-1$
	        UIManager.put("TabbedPane.font", f); //$NON-NLS-1$
	        UIManager.put("List.font", f); //$NON-NLS-1$
	        UIManager.put("TitledBorder.font", f); //$NON-NLS-1$
	        UIManager.put("FormattedTextField.font", f); //$NON-NLS-1$
	        UIManager.put("Button.font", f); //$NON-NLS-1$
	        UIManager.put("ComboBox.font", f); //$NON-NLS-1$
	        UIManager.put("TextArea.font", f); //$NON-NLS-1$
	        UIManager.put("TextField.font", f); //$NON-NLS-1$
	        SwingUtilities.updateComponentTreeUI(frmAdministracinHospital);
		}
	}

}
