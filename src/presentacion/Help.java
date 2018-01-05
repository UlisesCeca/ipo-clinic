package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import java.awt.SystemColor;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JTextArea;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Help {

	private JFrame frmAdministracinHospital;
	private String window;
	private JTextArea txtaAyuda;
	/**
	 * Create the application.
	 */
	public Help(String window) {
		initialize();
		this.window = window;
		this.frmAdministracinHospital.setVisible(true);
		setHelp();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdministracinHospital = new JFrame();
		frmAdministracinHospital.setTitle(Messages.getString("Help.frmAdministracinHospital.title")); //$NON-NLS-1$
		frmAdministracinHospital.setIconImage(Toolkit.getDefaultToolkit().getImage(Help.class.getResource("/presentacion/icon.png"))); //$NON-NLS-1$
		frmAdministracinHospital.setResizable(false);
		frmAdministracinHospital.setBackground(SystemColor.menu);
		frmAdministracinHospital.setBounds(100, 100, 499, 424);
		frmAdministracinHospital.addWindowListener(new FrameWindowListener());
		frmAdministracinHospital.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		JPanel panelMain = new JPanel();
		panelMain.setBackground(SystemColor.menu);
		frmAdministracinHospital.getContentPane().add(panelMain, BorderLayout.CENTER);
		GridBagLayout gbl_panelMain = new GridBagLayout();
		gbl_panelMain.columnWidths = new int[]{14, 468, 10, 0};
		gbl_panelMain.rowHeights = new int[]{14, 330, 26, 0};
		gbl_panelMain.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panelMain.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panelMain.setLayout(gbl_panelMain);
		
		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 1;
		gbc_separator_2.gridy = 0;
		panelMain.add(separator_2, gbc_separator_2);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 1;
		panelMain.add(separator, gbc_separator);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, Messages.getString("Help.panel.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		panel.setBackground(Color.WHITE);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		panelMain.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		txtaAyuda = new JTextArea();
		txtaAyuda.setToolTipText(Messages.getString("Help.txtaAyuda.toolTipText")); //$NON-NLS-1$
		txtaAyuda.setLineWrap(true);
		txtaAyuda.setEditable(false);
		txtaAyuda.setDisabledTextColor(SystemColor.window);
		GridBagConstraints gbc_txtaAyuda = new GridBagConstraints();
		gbc_txtaAyuda.fill = GridBagConstraints.BOTH;
		gbc_txtaAyuda.gridx = 0;
		gbc_txtaAyuda.gridy = 0;
		panel.add(txtaAyuda, gbc_txtaAyuda);
		
		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.insets = new Insets(0, 0, 5, 0);
		gbc_separator_1.gridx = 2;
		gbc_separator_1.gridy = 1;
		panelMain.add(separator_1, gbc_separator_1);
		
		JButton btnAceptar = new JButton(Messages.getString("Help.btnAceptar.text")); //$NON-NLS-1$
		btnAceptar.setToolTipText(Messages.getString("Help.btnAceptar.toolTipText")); //$NON-NLS-1$
		btnAceptar.setContentAreaFilled(false);
		btnAceptar.setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAdministracinHospital.dispose();
			}
		});
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.fill = GridBagConstraints.VERTICAL;
		gbc_btnAceptar.anchor = GridBagConstraints.EAST;
		gbc_btnAceptar.insets = new Insets(0, 0, 0, 5);
		gbc_btnAceptar.gridx = 1;
		gbc_btnAceptar.gridy = 2;
		panelMain.add(btnAceptar, gbc_btnAceptar);
	}
	
	public void setHelp(){
		if (this.window.equalsIgnoreCase("inicio")  || this.window.equalsIgnoreCase("home")){ //$NON-NLS-1$
			this.txtaAyuda.setText(Messages.getString("Help.2") //$NON-NLS-1$
					+ Messages.getString("Help.3")); //$NON-NLS-1$
			
		} else if (this.window.equalsIgnoreCase("mi agenda") || this.window.equalsIgnoreCase("my agenda")){ //$NON-NLS-1$
			this.txtaAyuda.setText(Messages.getString("Help.5") //$NON-NLS-1$
					+ Messages.getString("Help.6")); //$NON-NLS-1$
			
		} else if (this.window.equalsIgnoreCase("mis pacientes") || this.window.equalsIgnoreCase("my patients")){ //$NON-NLS-1$
			this.txtaAyuda.setText(Messages.getString("Help.8") //$NON-NLS-1$
					+ Messages.getString("Help.9") //$NON-NLS-1$
					+ Messages.getString("Help.10")); //$NON-NLS-1$
			
		} else if (this.window.equalsIgnoreCase("especialistas") || this.window.equalsIgnoreCase("specialists")){ //$NON-NLS-1$
			this.txtaAyuda.setText(Messages.getString("Help.12") //$NON-NLS-1$
					+ Messages.getString("Help.13")) //$NON-NLS-1$
			;
		}  else if (this.window.equalsIgnoreCase("login")){ //$NON-NLS-1$
			this.txtaAyuda.setText(Messages.getString("Help.15")); //$NON-NLS-1$
			
		}  else if (this.window.equalsIgnoreCase("editar paciente")){ //$NON-NLS-1$
			this.txtaAyuda.setText(Messages.getString("Help.17")); //$NON-NLS-1$
			
		} else if (this.window.equalsIgnoreCase("añadir paciente")){ //$NON-NLS-1$
			this.txtaAyuda.setText(Messages.getString("Help.19") //$NON-NLS-1$
					+ Messages.getString("Help.20")); //$NON-NLS-1$
			
		}  else if (this.window.equalsIgnoreCase("enviar email")){ //$NON-NLS-1$
			this.txtaAyuda.setText(Messages.getString("Help.22") //$NON-NLS-1$
					+ Messages.getString("Help.23")); //$NON-NLS-1$
		} else if (this.window.equalsIgnoreCase("imagen medica")){ //$NON-NLS-1$
			this.txtaAyuda.setText(Messages.getString("Help.25")); //$NON-NLS-1$
		}
		
	}
	
	private class FrameWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent arg0) {
			frmAdministracinHospital.dispose();
		}
	}

}
