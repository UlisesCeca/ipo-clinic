package presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.GridBagLayout;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;

import javax.swing.text.AbstractDocument;

import java.awt.GridBagConstraints;
import javax.swing.JTabbedPane;
import java.awt.Insets;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JFormattedTextField;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import javax.swing.border.LineBorder;

import dominio.Appointment;
import dominio.ImagenMedica;
import dominio.Patient;
import dominio.Specialist;

import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;

import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.MaskFormatter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PrincipalWindow {

	private JFrame frmAdministracinHospital;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblCalleEspecialista;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblApellidosDoctor;
	private JLabel lblDni;
	private JLabel lblDNIDoctor;
	private JLabel lblTelefono;
	private JLabel lblMovil;
	private JLabel lblTelefonoDoctor;
	private JLabel lblMovilDoctor;
	private JLabel lblEmail;
	private JLabel lblEmailDoctor;
	private JLabel lblPais;
	private JLabel lblCodigoPostal;
	private JLabel lblPaisDoctor;
	private JLabel lblCodigoPostalDoctor;
	private JLabel lblProvincia;
	private JLabel lblLocalidad;
	private JLabel lblProvinciaDoctor;
	private JLabel lblLocalidadDoctor;
	private JLabel lblNlblCalleombre;
	private JLabel lblNumero;
	private JLabel lblCalleDoctor;
	private JLabel lblHora;
	private JLabel lblHoraCita;
	private JLabel lblNombreCita;
	private JLabel lblNombrePacienteCita;
	private JLabel lblApellidosCita;
	private JLabel lblApellidosPacienteCita;
	private JLabel lblNombre_2;
	private JLabel lblApellidos_2;
	private JLabel lblEdad;
	private JLabel lblSexo;
	private JLabel lblTelefono_2;
	private JLabel lblMovil_1;
	private JLabel lblEmail_1;
	private JLabel lblCodigoPostal_2;
	private JLabel lblLocalidad_1;
	private JLabel lblProvincia_1;
	private JLabel lblCalle_1;
	private JLabel lblNumero_1;
	private JLabel lblNombre_3;
	private JLabel lblApellidos_3;
	private JLabel lblNombreEspecialista;
	private JLabel lblApellidosEspecialista;
	private JLabel lblEspecialidad;
	private JLabel lblEspecialidadEspecialista;
	private JLabel lblPlanta;
	private JLabel lblDespacho;
	private JLabel lblPlantaEspecialista;
	private JLabel lblDespachoEspecialista;
	private JLabel lblExtension;
	private JLabel lblExtensionEspecialista;
	private JLabel lblFotoPaciente_1;
	private JLabel lblCodigoPostal_3;
	private JLabel lblLocalidad_2;
	private JLabel lblCodigoPostalEspecialista;
	private JLabel lblLocalidadEspecialista;
	private JLabel lblProvincia_3;
	private JLabel lblCalle_2;
	private JLabel lblProvinciaEspecialista;
	private JLabel lblNumero_3;
	private JLabel lblNumeroEspecialista;
	private JLabel lblCalle;
	private JLabel lblNumeroDoctor;
	private JLabel lblUltimaConexion;
	private PrincipalWindow thiswindow = this;
	private JButton btnBorrarPaciente;
	private JButton btnAnadirPaciente;
	private JButton btnEditarPaciente;
	private JLabel lblNombreDoctor;
	private JLabel lblFotoEspecialista;
	private JPanel pEspecialistas;
	private JTabbedPane tabbedPane;
	private JMenu mnArchivo;
	private JMenuBar menuBar;
	private JLabel lblFotoPaciente;
	private DefaultListModel<Patient> modelPacientes = new DefaultListModel<>();
	private JList <Patient> listPacientes = new JList<>( modelPacientes );
	private Appointment citaSara = new Appointment("09:21"); //$NON-NLS-1$
	private Appointment citaPaula = new Appointment("10:32"); //$NON-NLS-1$
	private Appointment citaRaul = new Appointment("13:12"); //$NON-NLS-1$
	private ImagenMedica image1 = new ImagenMedica("/presentacion/radiografiamanos.jpg", Messages.getString("PrincipalWindow.4"), Messages.getString("PrincipalWindow.5") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			+ Messages.getString("PrincipalWindow.6")); //$NON-NLS-1$
	private ImagenMedica image2 = new ImagenMedica("/presentacion/radiografiacraneo.jpg", Messages.getString("PrincipalWindow.8"), Messages.getString("PrincipalWindow.9") //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
			+ Messages.getString("PrincipalWindow.10")); //$NON-NLS-1$

	private ImagenMedica imagen1 = new ImagenMedica("", "", Messages.getString("PrincipalWindow.13")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	private ImagenMedica imagen2 = new ImagenMedica("", "", Messages.getString("PrincipalWindow.16")); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
	private Patient raul = new Patient ("Raul", "Garcia Jimenez", "926781091", "13120", "Porzuna", "Ciudad Real", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
			"Almendros", "03", "/presentacion/raul.jpg", "630956066", "raul123@gmail.com", "18", Messages.getString("PrincipalWindow.29"), citaRaul, true, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$
			Messages.getString("PrincipalWindow.30"), Messages.getString("PrincipalWindow.31"), image1, image2); //$NON-NLS-1$ //$NON-NLS-2$
	private Patient paula = new Patient ("Paula", "Baos Ramiza", "900124392", "13003", "Robledo", "Ciudad Real", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
			"La plaza", "20", "/presentacion/paula.jpg", "633727281", "paula12@gmail.com", "23", Messages.getString("PrincipalWindow.44"), citaPaula, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$
			true, Messages.getString("PrincipalWindow.45"), Messages.getString("PrincipalWindow.46"), image1, image2); //$NON-NLS-1$ //$NON-NLS-2$
	private Patient sara = new Patient ("Sara", "Jimenez Dorado", "911232292", "13009", "Ciudad Real", "Ciudad Real", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$
			"Ceunca", "04", "/presentacion/sara.jpg", "611627481", "sara123ulis@gmail.com", "32", Messages.getString("PrincipalWindow.59"), citaSara, true, //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$
			Messages.getString("PrincipalWindow.60"), Messages.getString("PrincipalWindow.61"), image1, image2); //$NON-NLS-1$ //$NON-NLS-2$
	private Specialist javier = new Specialist ("Javier", "Ramirez Loz Santos", "922781091", "13121", "Porzuna", "Ciudad Real", "Remedios", "3", "/presentacion/javier.jpg", Messages.getString("PrincipalWindow.71"), "3", "3.12", "32"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$ //$NON-NLS-10$ //$NON-NLS-11$ //$NON-NLS-12$ //$NON-NLS-13$
	private Specialist pablo = new Specialist ("Pablo", "Motos Jimenez", "922781091", "13004", "Robledo", "Ciudad Real", "El Hoyo", "1", "/presentacion/pablo.jpg", Messages.getString("PrincipalWindow.84"), "2", "2.30", "23"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$ //$NON-NLS-10$ //$NON-NLS-11$ //$NON-NLS-12$ //$NON-NLS-13$
	private Specialist victor = new Specialist ("Victor", "Jimenez Jimenez", "922781091", "13009", "Ciudad Real", "Ciudad Real", "Plaza la Constitución", "24", "/presentacion/victor.jpg", Messages.getString("PrincipalWindow.97"), "3", "3.10", "33"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$ //$NON-NLS-10$ //$NON-NLS-11$ //$NON-NLS-12$ //$NON-NLS-13$
	private JFormattedTextField ftxtNombre;
	private JFormattedTextField ftxtApellidos;
	private JFormattedTextField ftxtEdad;
	private JComboBox cbSexo;
	private boolean done = true;
	private JFormattedTextField ftxtTelefono;
	private Patient currentPatient;
	private JFormattedTextField ftxtMovil;
	private JFormattedTextField ftxtEmail;
	private JFormattedTextField ftxtCodigoPostal;
	private JFormattedTextField ftxtLocalidad;
	private JFormattedTextField ftxtProvincia;
	private JFormattedTextField ftxtCalle;
	private JFormattedTextField ftxtNumero;
	private JSeparator separator_8;
	private JSeparator separator_9;
	private String previouspic;
	private JButton btnExaminar;
	private JRadioButtonMenuItem idioma;
	private JPanel pBotones;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JSeparator separator_7;
	private String mode =""; //$NON-NLS-1$
	private JLabel lblCheck;
	private JRadioButtonMenuItem rdbtnmntmEspaol;
	private JRadioButtonMenuItem rdbtnmntmIngls;
	private JLabel lblAntecedentes;
	private JLabel lblTratamiento;
	private JLabel lblImgenesMdicas;
	private JTextArea txtaAntecedentes;
	private JTextArea txtaTratamiento;
	private JButton btnImagen;
	private JButton btnImagen_1;
	private JRadioButtonMenuItem fuente;
	private JRadioButtonMenuItem rdbtnmntmGrande;
	private JRadioButtonMenuItem rdbtnmntmPequeo;
	private JRadioButtonMenuItem rdbtnmntmMediano;
	/**
	 * Create the application.
	 */
	public PrincipalWindow(JRadioButtonMenuItem fuente, JRadioButtonMenuItem idioma) {
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
		frmAdministracinHospital.setIconImage(Toolkit.getDefaultToolkit().getImage(PrincipalWindow.class.getResource("/presentacion/icon.png"))); //$NON-NLS-1$
		frmAdministracinHospital.setTitle(Messages.getString("PrincipalWindow.frmAdministracinHospital.title")); //$NON-NLS-1$
		frmAdministracinHospital.setBounds(100, 100, 1333, 740);
		frmAdministracinHospital.addWindowListener(new FrameWindowListener());
		frmAdministracinHospital.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.info);
		frmAdministracinHospital.getContentPane().add(tabbedPane, BorderLayout.NORTH);
		
		JPanel pInicio = new JPanel();
		pInicio.setToolTipText(Messages.getString("PrincipalWindow.pInicio.toolTipText")); //$NON-NLS-1$
		tabbedPane.addTab(Messages.getString("PrincipalWindow.103"), null, pInicio, null); //$NON-NLS-1$
		pInicio.setBackground(SystemColor.text);
		GridBagLayout gbl_pInicio = new GridBagLayout();
		gbl_pInicio.columnWidths = new int[]{410, 537, 0};
		gbl_pInicio.rowHeights = new int[]{626, 0};
		gbl_pInicio.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_pInicio.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pInicio.setLayout(gbl_pInicio);
		
		JPanel pFoto = new JPanel();
		pFoto.setOpaque(false);
		GridBagConstraints gbc_pFoto = new GridBagConstraints();
		gbc_pFoto.insets = new Insets(0, 0, 0, 5);
		gbc_pFoto.fill = GridBagConstraints.BOTH;
		gbc_pFoto.gridx = 0;
		gbc_pFoto.gridy = 0;
		pInicio.add(pFoto, gbc_pFoto);
		GridBagLayout gbl_pFoto = new GridBagLayout();
		gbl_pFoto.columnWidths = new int[] {120, 142, 114, 0};
		gbl_pFoto.rowHeights = new int[] {193, 20, 0};
		gbl_pFoto.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_pFoto.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		pFoto.setLayout(gbl_pFoto);
		
		JLabel lblFotoDoctor = new JLabel(Messages.getString("PrincipalWindow.lblFotoDoctor.text")); //$NON-NLS-1$
		lblFotoDoctor.setToolTipText(Messages.getString("PrincipalWindow.lblFotoDoctor.toolTipText")); //$NON-NLS-1$
		lblFotoDoctor.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/medicoUli.jpg"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblFotoDoctor = new GridBagConstraints();
		gbc_lblFotoDoctor.gridwidth = 3;
		gbc_lblFotoDoctor.insets = new Insets(0, 0, 5, 0);
		gbc_lblFotoDoctor.fill = GridBagConstraints.VERTICAL;
		gbc_lblFotoDoctor.gridx = 0;
		gbc_lblFotoDoctor.gridy = 0;
		pFoto.add(lblFotoDoctor, gbc_lblFotoDoctor);
		
		lblUltimaConexion = new JLabel(Messages.getString("PrincipalWindow.lblUltimaConexion.text")); //$NON-NLS-1$
		lblUltimaConexion.setToolTipText(Messages.getString("PrincipalWindow.lblUltimaConexion.toolTipText")); //$NON-NLS-1$
		GridBagConstraints gbc_lblUltimaConexion = new GridBagConstraints();
		gbc_lblUltimaConexion.anchor = GridBagConstraints.SOUTH;
		gbc_lblUltimaConexion.insets = new Insets(0, 0, 0, 5);
		gbc_lblUltimaConexion.gridx = 1;
		gbc_lblUltimaConexion.gridy = 1;
		pFoto.add(lblUltimaConexion, gbc_lblUltimaConexion);
		
		JPanel pDatosPersonales = new JPanel();
		pDatosPersonales.setBorder(new TitledBorder(null, Messages.getString("PrincipalWindow.pDatosPersonales.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		pDatosPersonales.setOpaque(false);
		GridBagConstraints gbc_pDatosPersonales = new GridBagConstraints();
		gbc_pDatosPersonales.fill = GridBagConstraints.BOTH;
		gbc_pDatosPersonales.gridx = 1;
		gbc_pDatosPersonales.gridy = 0;
		pInicio.add(pDatosPersonales, gbc_pDatosPersonales);
		GridBagLayout gbl_pDatosPersonales = new GridBagLayout();
		gbl_pDatosPersonales.columnWidths = new int[]{72, 131};
		gbl_pDatosPersonales.rowHeights = new int[]{0, 27, 33, 29, 36, 0, 0, 28, 32, 29, 35, 0, 0, 32, 33, 30, 28, 25, 0};
		gbl_pDatosPersonales.columnWeights = new double[]{0.0, 1.0};
		gbl_pDatosPersonales.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pDatosPersonales.setLayout(gbl_pDatosPersonales);
		
		lblNombre = new JLabel(Messages.getString("PrincipalWindow.lblNombre.text")); //$NON-NLS-1$
		lblNombre.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 0;
		pDatosPersonales.add(lblNombre, gbc_lblNombre);
		
		lblApellidos = new JLabel(Messages.getString("PrincipalWindow.lblApellidos.text")); //$NON-NLS-1$
		lblApellidos.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblApellidos = new GridBagConstraints();
		gbc_lblApellidos.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblApellidos.insets = new Insets(0, 0, 5, 0);
		gbc_lblApellidos.gridx = 1;
		gbc_lblApellidos.gridy = 0;
		pDatosPersonales.add(lblApellidos, gbc_lblApellidos);
		
		lblNombreDoctor = new JLabel(Messages.getString("PrincipalWindow.lblNombreDoctor.text")); //$NON-NLS-1$
		lblNombreDoctor.setToolTipText(Messages.getString("PrincipalWindow.lblNombreDoctor.toolTipText")); //$NON-NLS-1$
		lblNombreDoctor.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblNombreDoctor = new GridBagConstraints();
		gbc_lblNombreDoctor.fill = GridBagConstraints.VERTICAL;
		gbc_lblNombreDoctor.anchor = GridBagConstraints.WEST;
		gbc_lblNombreDoctor.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreDoctor.gridx = 0;
		gbc_lblNombreDoctor.gridy = 1;
		pDatosPersonales.add(lblNombreDoctor, gbc_lblNombreDoctor);
		
		lblApellidosDoctor = new JLabel(Messages.getString("PrincipalWindow.lblApellidosDoctor.text")); //$NON-NLS-1$
		lblApellidosDoctor.setToolTipText(Messages.getString("PrincipalWindow.lblApellidosDoctor.toolTipText")); //$NON-NLS-1$
		lblApellidosDoctor.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblApellidosDoctor = new GridBagConstraints();
		gbc_lblApellidosDoctor.fill = GridBagConstraints.VERTICAL;
		gbc_lblApellidosDoctor.anchor = GridBagConstraints.WEST;
		gbc_lblApellidosDoctor.insets = new Insets(0, 0, 5, 0);
		gbc_lblApellidosDoctor.gridx = 1;
		gbc_lblApellidosDoctor.gridy = 1;
		pDatosPersonales.add(lblApellidosDoctor, gbc_lblApellidosDoctor);
		
		lblDni = new JLabel(Messages.getString("PrincipalWindow.lblDni.text")); //$NON-NLS-1$
		lblDni.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 0;
		gbc_lblDni.gridy = 2;
		pDatosPersonales.add(lblDni, gbc_lblDni);
		
		lblDNIDoctor = new JLabel(Messages.getString("PrincipalWindow.lblDNIDoctor.text")); //$NON-NLS-1$
		lblDNIDoctor.setToolTipText(Messages.getString("PrincipalWindow.lblDNIDoctor.toolTipText")); //$NON-NLS-1$
		lblDNIDoctor.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblDNIDoctor = new GridBagConstraints();
		gbc_lblDNIDoctor.fill = GridBagConstraints.VERTICAL;
		gbc_lblDNIDoctor.anchor = GridBagConstraints.WEST;
		gbc_lblDNIDoctor.insets = new Insets(0, 0, 5, 5);
		gbc_lblDNIDoctor.gridx = 0;
		gbc_lblDNIDoctor.gridy = 3;
		pDatosPersonales.add(lblDNIDoctor, gbc_lblDNIDoctor);
		
		JSeparator separator = new JSeparator();
		separator.setOpaque(true);
		separator.setPreferredSize(new Dimension(300,1));
		separator.setAlignmentY(1.0f);
		separator.setAlignmentX(1.0f);
		separator.setBorder(new LineBorder(Color.LIGHT_GRAY));
		separator.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.gridheight = 2;
		gbc_separator.anchor = GridBagConstraints.WEST;
		gbc_separator.insets = new Insets(0, 0, 5, 0);
		gbc_separator.gridx = 1;
		gbc_separator.gridy = 4;
		pDatosPersonales.add(separator, gbc_separator);
		
		lblTelefono = new JLabel(Messages.getString("PrincipalWindow.lblTelefono.text")); //$NON-NLS-1$
		lblTelefono.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.WEST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 0;
		gbc_lblTelefono.gridy = 6;
		pDatosPersonales.add(lblTelefono, gbc_lblTelefono);
		
		lblMovil = new JLabel(Messages.getString("PrincipalWindow.lblMovil.text")); //$NON-NLS-1$
		lblMovil.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblMovil = new GridBagConstraints();
		gbc_lblMovil.anchor = GridBagConstraints.WEST;
		gbc_lblMovil.insets = new Insets(0, 0, 5, 0);
		gbc_lblMovil.gridx = 1;
		gbc_lblMovil.gridy = 6;
		pDatosPersonales.add(lblMovil, gbc_lblMovil);
		
		lblTelefonoDoctor = new JLabel(Messages.getString("PrincipalWindow.lblTelefonoDoctor.text")); //$NON-NLS-1$
		lblTelefonoDoctor.setToolTipText(Messages.getString("PrincipalWindow.lblTelefonoDoctor.toolTipText")); //$NON-NLS-1$
		lblTelefonoDoctor.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblTelefonoDoctor = new GridBagConstraints();
		gbc_lblTelefonoDoctor.fill = GridBagConstraints.VERTICAL;
		gbc_lblTelefonoDoctor.anchor = GridBagConstraints.WEST;
		gbc_lblTelefonoDoctor.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefonoDoctor.gridx = 0;
		gbc_lblTelefonoDoctor.gridy = 7;
		pDatosPersonales.add(lblTelefonoDoctor, gbc_lblTelefonoDoctor);
		
		lblMovilDoctor = new JLabel(Messages.getString("PrincipalWindow.lblMovilDoctor.text")); //$NON-NLS-1$
		lblMovilDoctor.setToolTipText(Messages.getString("PrincipalWindow.lblMovilDoctor.toolTipText")); //$NON-NLS-1$
		lblMovilDoctor.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblMovilDoctor = new GridBagConstraints();
		gbc_lblMovilDoctor.fill = GridBagConstraints.VERTICAL;
		gbc_lblMovilDoctor.anchor = GridBagConstraints.WEST;
		gbc_lblMovilDoctor.insets = new Insets(0, 0, 5, 0);
		gbc_lblMovilDoctor.gridx = 1;
		gbc_lblMovilDoctor.gridy = 7;
		pDatosPersonales.add(lblMovilDoctor, gbc_lblMovilDoctor);
		
		lblEmail = new JLabel(Messages.getString("PrincipalWindow.lblEmail.text")); //$NON-NLS-1$
		lblEmail.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblEmail = new GridBagConstraints();
		gbc_lblEmail.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblEmail.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail.gridx = 0;
		gbc_lblEmail.gridy = 8;
		pDatosPersonales.add(lblEmail, gbc_lblEmail);
		
		lblEmailDoctor = new JLabel(Messages.getString("PrincipalWindow.lblEmailDoctor.text")); //$NON-NLS-1$
		lblEmailDoctor.setToolTipText(Messages.getString("PrincipalWindow.lblEmailDoctor.toolTipText")); //$NON-NLS-1$
		lblEmailDoctor.setBorder(new LineBorder(Color.LIGHT_GRAY)); //$NON-NLS-1$
		GridBagConstraints gbc_lblEmailDoctor = new GridBagConstraints();
		gbc_lblEmailDoctor.fill = GridBagConstraints.VERTICAL;
		gbc_lblEmailDoctor.anchor = GridBagConstraints.WEST;
		gbc_lblEmailDoctor.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmailDoctor.gridx = 0;
		gbc_lblEmailDoctor.gridy = 9;
		pDatosPersonales.add(lblEmailDoctor, gbc_lblEmailDoctor);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setPreferredSize(new Dimension(300,1));
		separator_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.anchor = GridBagConstraints.WEST;
		gbc_separator_1.gridheight = 2;
		gbc_separator_1.insets = new Insets(0, 0, 5, 0);
		gbc_separator_1.gridx = 1;
		gbc_separator_1.gridy = 10;
		pDatosPersonales.add(separator_1, gbc_separator_1);
		
		lblPais = new JLabel(Messages.getString("PrincipalWindow.lblPais.text")); //$NON-NLS-1$
		lblPais.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblPais = new GridBagConstraints();
		gbc_lblPais.anchor = GridBagConstraints.WEST;
		gbc_lblPais.insets = new Insets(0, 0, 5, 5);
		gbc_lblPais.gridx = 0;
		gbc_lblPais.gridy = 12;
		pDatosPersonales.add(lblPais, gbc_lblPais);
		
		lblCodigoPostal = new JLabel(Messages.getString("PrincipalWindow.lblCodigoPostal.text")); //$NON-NLS-1$
		lblCodigoPostal.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblCodigoPostal = new GridBagConstraints();
		gbc_lblCodigoPostal.anchor = GridBagConstraints.WEST;
		gbc_lblCodigoPostal.insets = new Insets(0, 0, 5, 0);
		gbc_lblCodigoPostal.gridx = 1;
		gbc_lblCodigoPostal.gridy = 12;
		pDatosPersonales.add(lblCodigoPostal, gbc_lblCodigoPostal);
		
		lblPaisDoctor = new JLabel(Messages.getString("PrincipalWindow.lblPaisDoctor.text")); //$NON-NLS-1$
		lblPaisDoctor.setToolTipText(Messages.getString("PrincipalWindow.lblPaisDoctor.toolTipText")); //$NON-NLS-1$
		lblPaisDoctor.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblPaisDoctor = new GridBagConstraints();
		gbc_lblPaisDoctor.fill = GridBagConstraints.VERTICAL;
		gbc_lblPaisDoctor.anchor = GridBagConstraints.WEST;
		gbc_lblPaisDoctor.insets = new Insets(0, 0, 5, 5);
		gbc_lblPaisDoctor.gridx = 0;
		gbc_lblPaisDoctor.gridy = 13;
		pDatosPersonales.add(lblPaisDoctor, gbc_lblPaisDoctor);
		
		lblCodigoPostalDoctor = new JLabel(Messages.getString("PrincipalWindow.lblCodigoPostalDoctor.text")); //$NON-NLS-1$
		lblCodigoPostalDoctor.setToolTipText(Messages.getString("PrincipalWindow.lblCodigoPostalDoctor.toolTipText")); //$NON-NLS-1$
		lblCodigoPostalDoctor.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblCodigoPostalDoctor = new GridBagConstraints();
		gbc_lblCodigoPostalDoctor.fill = GridBagConstraints.VERTICAL;
		gbc_lblCodigoPostalDoctor.anchor = GridBagConstraints.WEST;
		gbc_lblCodigoPostalDoctor.insets = new Insets(0, 0, 5, 0);
		gbc_lblCodigoPostalDoctor.gridx = 1;
		gbc_lblCodigoPostalDoctor.gridy = 13;
		pDatosPersonales.add(lblCodigoPostalDoctor, gbc_lblCodigoPostalDoctor);
		
		lblProvincia = new JLabel(Messages.getString("PrincipalWindow.lblProvincia.text")); //$NON-NLS-1$
		lblProvincia.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblProvincia = new GridBagConstraints();
		gbc_lblProvincia.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblProvincia.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvincia.gridx = 0;
		gbc_lblProvincia.gridy = 14;
		pDatosPersonales.add(lblProvincia, gbc_lblProvincia);
		
		lblLocalidad = new JLabel(Messages.getString("PrincipalWindow.lblLocalidad.text")); //$NON-NLS-1$
		lblLocalidad.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblLocalidad = new GridBagConstraints();
		gbc_lblLocalidad.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblLocalidad.insets = new Insets(0, 0, 5, 0);
		gbc_lblLocalidad.gridx = 1;
		gbc_lblLocalidad.gridy = 14;
		pDatosPersonales.add(lblLocalidad, gbc_lblLocalidad);
		
		lblProvinciaDoctor = new JLabel(Messages.getString("PrincipalWindow.lblProvinciaDoctor.text")); //$NON-NLS-1$
		lblProvinciaDoctor.setToolTipText(Messages.getString("PrincipalWindow.lblProvinciaDoctor.toolTipText")); //$NON-NLS-1$
		lblProvinciaDoctor.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblProvinciaDoctor = new GridBagConstraints();
		gbc_lblProvinciaDoctor.fill = GridBagConstraints.VERTICAL;
		gbc_lblProvinciaDoctor.anchor = GridBagConstraints.WEST;
		gbc_lblProvinciaDoctor.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvinciaDoctor.gridx = 0;
		gbc_lblProvinciaDoctor.gridy = 15;
		pDatosPersonales.add(lblProvinciaDoctor, gbc_lblProvinciaDoctor);
		
		lblLocalidadDoctor = new JLabel(Messages.getString("PrincipalWindow.lblLocalidadDoctor.text")); //$NON-NLS-1$
		lblLocalidadDoctor.setToolTipText(Messages.getString("PrincipalWindow.lblLocalidadDoctor.toolTipText")); //$NON-NLS-1$
		lblLocalidadDoctor.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblLocalidadDoctor = new GridBagConstraints();
		gbc_lblLocalidadDoctor.fill = GridBagConstraints.VERTICAL;
		gbc_lblLocalidadDoctor.anchor = GridBagConstraints.WEST;
		gbc_lblLocalidadDoctor.insets = new Insets(0, 0, 5, 0);
		gbc_lblLocalidadDoctor.gridx = 1;
		gbc_lblLocalidadDoctor.gridy = 15;
		pDatosPersonales.add(lblLocalidadDoctor, gbc_lblLocalidadDoctor);
		
		lblCalle = new JLabel(Messages.getString("PrincipalWindow.lblCalle.text")); //$NON-NLS-1$
		lblCalle.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblCalle = new GridBagConstraints();
		gbc_lblCalle.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblCalle.insets = new Insets(0, 0, 5, 5);
		gbc_lblCalle.gridx = 0;
		gbc_lblCalle.gridy = 16;
		pDatosPersonales.add(lblCalle, gbc_lblCalle);
		
		lblNumero = new JLabel(Messages.getString("PrincipalWindow.lblNumero.text")); //$NON-NLS-1$
		lblNumero.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblNumero = new GridBagConstraints();
		gbc_lblNumero.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNumero.insets = new Insets(0, 0, 5, 0);
		gbc_lblNumero.gridx = 1;
		gbc_lblNumero.gridy = 16;
		pDatosPersonales.add(lblNumero, gbc_lblNumero);
		
		lblCalleDoctor = new JLabel(Messages.getString("PrincipalWindow.lblCalleDoctor.text")); //$NON-NLS-1$
		lblCalleDoctor.setToolTipText(Messages.getString("PrincipalWindow.lblCalleDoctor.toolTipText")); //$NON-NLS-1$
		lblCalleDoctor.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblCalleDoctor = new GridBagConstraints();
		gbc_lblCalleDoctor.fill = GridBagConstraints.VERTICAL;
		gbc_lblCalleDoctor.anchor = GridBagConstraints.WEST;
		gbc_lblCalleDoctor.insets = new Insets(0, 0, 0, 5);
		gbc_lblCalleDoctor.gridx = 0;
		gbc_lblCalleDoctor.gridy = 17;
		pDatosPersonales.add(lblCalleDoctor, gbc_lblCalleDoctor);
		
		lblNumeroDoctor = new JLabel(Messages.getString("PrincipalWindow.lblNumeroDoctor.text")); //$NON-NLS-1$
		lblNumeroDoctor.setToolTipText(Messages.getString("PrincipalWindow.lblNumeroDoctor.toolTipText")); //$NON-NLS-1$
		lblNumeroDoctor.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblNumeroDoctor = new GridBagConstraints();
		gbc_lblNumeroDoctor.fill = GridBagConstraints.VERTICAL;
		gbc_lblNumeroDoctor.anchor = GridBagConstraints.WEST;
		gbc_lblNumeroDoctor.gridx = 1;
		gbc_lblNumeroDoctor.gridy = 17;
		pDatosPersonales.add(lblNumeroDoctor, gbc_lblNumeroDoctor);
		
		JPanel pMIAgenda = new JPanel();
		pMIAgenda.setToolTipText(Messages.getString("PrincipalWindow.pMIAgenda.toolTipText")); //$NON-NLS-1$
		pMIAgenda.setBackground(Color.WHITE);
		tabbedPane.addTab(Messages.getString("PrincipalWindow.105"), null, pMIAgenda, null); //$NON-NLS-1$
		GridBagLayout gbl_pMIAgenda = new GridBagLayout();
		gbl_pMIAgenda.columnWidths = new int[]{305, 794, 0};
		gbl_pMIAgenda.rowHeights = new int[]{242, 0};
		gbl_pMIAgenda.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_pMIAgenda.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pMIAgenda.setLayout(gbl_pMIAgenda);
		
		JPanel pBuscarCitas = new JPanel();
		pBuscarCitas.setOpaque(false);
		pBuscarCitas.setBorder(new TitledBorder(null, Messages.getString("PrincipalWindow.pBuscarCitas.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_pBuscarCitas = new GridBagConstraints();
		gbc_pBuscarCitas.insets = new Insets(0, 0, 0, 5);
		gbc_pBuscarCitas.fill = GridBagConstraints.BOTH;
		gbc_pBuscarCitas.gridx = 0;
		gbc_pBuscarCitas.gridy = 0;
		pMIAgenda.add(pBuscarCitas, gbc_pBuscarCitas);
		GridBagLayout gbl_pBuscarCitas = new GridBagLayout();
		gbl_pBuscarCitas.columnWidths = new int[]{0, 0};
		gbl_pBuscarCitas.rowHeights = new int[]{0, 0};
		gbl_pBuscarCitas.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pBuscarCitas.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pBuscarCitas.setLayout(gbl_pBuscarCitas);
		
		DefaultListModel<Patient> modelCitas = new DefaultListModel<>();
		JList <Patient> listCitas = new JList<>( modelCitas );
		listCitas.setToolTipText(Messages.getString("PrincipalWindow.listCitas.toolTipText")); //$NON-NLS-1$
		listCitas.setBorder(null);
		GridBagConstraints gbc_listCitas = new GridBagConstraints();
		gbc_listCitas.fill = GridBagConstraints.BOTH;
		gbc_listCitas.gridx = 0;
		gbc_listCitas.gridy = 0;
		pBuscarCitas.add(listCitas, gbc_listCitas);
		modelCitas.addElement(sara);
		modelCitas.addElement(paula);
		modelCitas.addElement(raul);
		listCitas.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                setCitasInfo(listCitas.getSelectedValue());
            }
        });
		
		JPanel pDatosCitas = new JPanel();
		pDatosCitas.setOpaque(false);
		pDatosCitas.setBorder(new TitledBorder(null, Messages.getString("PrincipalWindow.pDatosCitas.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		GridBagConstraints gbc_pDatosCitas = new GridBagConstraints();
		gbc_pDatosCitas.fill = GridBagConstraints.BOTH;
		gbc_pDatosCitas.gridx = 1;
		gbc_pDatosCitas.gridy = 0;
		pMIAgenda.add(pDatosCitas, gbc_pDatosCitas);
		GridBagLayout gbl_pDatosCitas = new GridBagLayout();
		gbl_pDatosCitas.columnWidths = new int[]{210, 2, 0};
		gbl_pDatosCitas.rowHeights = new int[]{183, 0};
		gbl_pDatosCitas.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pDatosCitas.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		pDatosCitas.setLayout(gbl_pDatosCitas);
		
		JPanel pDatos = new JPanel();
		pDatos.setOpaque(false);
		pDatos.setBorder(null);
		GridBagConstraints gbc_pDatos = new GridBagConstraints();
		gbc_pDatos.insets = new Insets(0, 0, 0, 5);
		gbc_pDatos.fill = GridBagConstraints.BOTH;
		gbc_pDatos.gridx = 0;
		gbc_pDatos.gridy = 0;
		pDatosCitas.add(pDatos, gbc_pDatos);
		GridBagLayout gbl_pDatos = new GridBagLayout();
		gbl_pDatos.columnWidths = new int[]{210, 609, 0};
		gbl_pDatos.rowHeights = new int[]{190, 215, 0};
		gbl_pDatos.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pDatos.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		pDatos.setLayout(gbl_pDatos);
		
		lblFotoPaciente = new JLabel(Messages.getString("PrincipalWindow.lblFotoPaciente.text")); //$NON-NLS-1$
		lblFotoPaciente.setToolTipText(Messages.getString("PrincipalWindow.lblFotoPaciente.toolTipText")); //$NON-NLS-1$
		lblFotoPaciente.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/27705-200.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblFotoPaciente = new GridBagConstraints();
		gbc_lblFotoPaciente.fill = GridBagConstraints.VERTICAL;
		gbc_lblFotoPaciente.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoPaciente.gridx = 0;
		gbc_lblFotoPaciente.gridy = 0;
		pDatos.add(lblFotoPaciente, gbc_lblFotoPaciente);
		
		JPanel pDatosCitas_2 = new JPanel();
		pDatosCitas_2.setBorder(null);
		pDatosCitas_2.setOpaque(false);
		GridBagConstraints gbc_pDatosCitas_2 = new GridBagConstraints();
		gbc_pDatosCitas_2.anchor = GridBagConstraints.EAST;
		gbc_pDatosCitas_2.gridheight = 2;
		gbc_pDatosCitas_2.fill = GridBagConstraints.VERTICAL;
		gbc_pDatosCitas_2.gridx = 1;
		gbc_pDatosCitas_2.gridy = 0;
		pDatos.add(pDatosCitas_2, gbc_pDatosCitas_2);
		GridBagLayout gbl_pDatosCitas_2 = new GridBagLayout();
		gbl_pDatosCitas_2.columnWidths = new int[]{183, 399, 0};
		gbl_pDatosCitas_2.rowHeights = new int[]{25, 31, 28, 31, 31, 30, 0, 0};
		gbl_pDatosCitas_2.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pDatosCitas_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pDatosCitas_2.setLayout(gbl_pDatosCitas_2);
		
		lblHora = new JLabel(Messages.getString("PrincipalWindow.lblHora.text")); //$NON-NLS-1$
		lblHora.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblHora = new GridBagConstraints();
		gbc_lblHora.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblHora.insets = new Insets(0, 0, 5, 5);
		gbc_lblHora.gridx = 0;
		gbc_lblHora.gridy = 0;
		pDatosCitas_2.add(lblHora, gbc_lblHora);
		
		lblHoraCita = new JLabel(Messages.getString("PrincipalWindow.lblHoraCita.text")); //$NON-NLS-1$
		lblHoraCita.setToolTipText(Messages.getString("PrincipalWindow.lblHoraCita.toolTipText")); //$NON-NLS-1$
		lblHoraCita.setVisible(false);
		lblHoraCita.setBorder(new LineBorder(Color.LIGHT_GRAY)); //$NON-NLS-1$
		lblHoraCita.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblHoraCita = new GridBagConstraints();
		gbc_lblHoraCita.fill = GridBagConstraints.VERTICAL;
		gbc_lblHoraCita.anchor = GridBagConstraints.WEST;
		gbc_lblHoraCita.insets = new Insets(0, 0, 5, 5);
		gbc_lblHoraCita.gridx = 0;
		gbc_lblHoraCita.gridy = 1;
		pDatosCitas_2.add(lblHoraCita, gbc_lblHoraCita);
		
		lblNombreCita = new JLabel(Messages.getString("PrincipalWindow.lblNombreCita.text")); //$NON-NLS-1$
		lblNombreCita.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombreCita = new GridBagConstraints();
		gbc_lblNombreCita.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNombreCita.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreCita.gridx = 0;
		gbc_lblNombreCita.gridy = 2;
		pDatosCitas_2.add(lblNombreCita, gbc_lblNombreCita);
		
		lblNombrePacienteCita = new JLabel(Messages.getString("PrincipalWindow.lblNombrePacienteCita.text")); //$NON-NLS-1$
		lblNombrePacienteCita.setToolTipText(Messages.getString("PrincipalWindow.lblNombrePacienteCita.toolTipText")); //$NON-NLS-1$
		lblNombrePacienteCita.setVisible(false);
		lblNombrePacienteCita.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		lblNombrePacienteCita.setBackground(Color.WHITE);
		GridBagConstraints gbc_lblNombrePacienteCita = new GridBagConstraints();
		gbc_lblNombrePacienteCita.fill = GridBagConstraints.VERTICAL;
		gbc_lblNombrePacienteCita.anchor = GridBagConstraints.WEST;
		gbc_lblNombrePacienteCita.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombrePacienteCita.gridx = 0;
		gbc_lblNombrePacienteCita.gridy = 3;
		pDatosCitas_2.add(lblNombrePacienteCita, gbc_lblNombrePacienteCita);
		
		lblApellidosCita = new JLabel(Messages.getString("PrincipalWindow.lblApellidosCita.text")); //$NON-NLS-1$
		lblApellidosCita.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblApellidosCita = new GridBagConstraints();
		gbc_lblApellidosCita.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblApellidosCita.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidosCita.gridx = 0;
		gbc_lblApellidosCita.gridy = 4;
		pDatosCitas_2.add(lblApellidosCita, gbc_lblApellidosCita);
		
		lblApellidosPacienteCita = new JLabel(Messages.getString("PrincipalWindow.lblApellidosPacienteCita.text")); //$NON-NLS-1$
		lblApellidosPacienteCita.setToolTipText(Messages.getString("PrincipalWindow.lblApellidosPacienteCita.toolTipText")); //$NON-NLS-1$
		lblApellidosPacienteCita.setVisible(false);
		lblApellidosPacienteCita.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		lblApellidosPacienteCita.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_lblApellidosPacienteCita = new GridBagConstraints();
		gbc_lblApellidosPacienteCita.fill = GridBagConstraints.VERTICAL;
		gbc_lblApellidosPacienteCita.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidosPacienteCita.anchor = GridBagConstraints.WEST;
		gbc_lblApellidosPacienteCita.gridx = 0;
		gbc_lblApellidosPacienteCita.gridy = 5;
		pDatosCitas_2.add(lblApellidosPacienteCita, gbc_lblApellidosPacienteCita);
		
		JPanel pMisPacientes = new JPanel();
		pMisPacientes.setToolTipText(Messages.getString("PrincipalWindow.pMisPacientes.toolTipText")); //$NON-NLS-1$
		pMisPacientes.setBackground(Color.WHITE);
		tabbedPane.addTab(Messages.getString("PrincipalWindow.107"), null, pMisPacientes, null); //$NON-NLS-1$
		GridBagLayout gbl_pMisPacientes = new GridBagLayout();
		gbl_pMisPacientes.columnWidths = new int[] {305, 800, 0};
		gbl_pMisPacientes.rowHeights = new int[]{149, 0};
		gbl_pMisPacientes.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_pMisPacientes.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pMisPacientes.setLayout(gbl_pMisPacientes);
		
		JPanel pPacientes = new JPanel();
		pPacientes.setBorder(new TitledBorder(null, Messages.getString("PrincipalWindow.pPacientes.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		pPacientes.setOpaque(false);
		GridBagConstraints gbc_pPacientes = new GridBagConstraints();
		gbc_pPacientes.insets = new Insets(0, 0, 0, 5);
		gbc_pPacientes.fill = GridBagConstraints.BOTH;
		gbc_pPacientes.gridx = 0;
		gbc_pPacientes.gridy = 0;
		pMisPacientes.add(pPacientes, gbc_pPacientes);
		GridBagLayout gbl_pPacientes = new GridBagLayout();
		gbl_pPacientes.columnWidths = new int[]{0, 0};
		gbl_pPacientes.rowHeights = new int[]{0, 0};
		gbl_pPacientes.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pPacientes.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pPacientes.setLayout(gbl_pPacientes);
		
		modelPacientes = new DefaultListModel<>();
		listPacientes = new JList<>( modelPacientes );
		listPacientes.setToolTipText(Messages.getString("PrincipalWindow.listPacientes.toolTipText")); //$NON-NLS-1$
		GridBagConstraints gbc_listPacientes = new GridBagConstraints();
		gbc_listPacientes.fill = GridBagConstraints.BOTH;
		gbc_listPacientes.gridx = 0;
		gbc_listPacientes.gridy = 0;
		pPacientes.add(listPacientes, gbc_listPacientes);
		modelPacientes.addElement(raul);
		modelPacientes.addElement(paula);
		modelPacientes.addElement(sara);
		listPacientes.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent arg0) {
				currentPatient = listPacientes.getSelectedValue();
            if (!done){
            	int salir = JOptionPane.showConfirmDialog(null, Messages.getString("PrincipalWindow.108"), Messages.getString("PrincipalWindow.109"), //$NON-NLS-1$ //$NON-NLS-2$
            
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			
			if (salir == JOptionPane.YES_OPTION) {
				hideNewEdit();
				unsetNeededField();
				done = true;
				currentPatient.setPicturePath(previouspic);
				refreshPacients();}
            } else if (listPacientes.getSelectedValue() != null){
				hideNewEdit();
                setPacientesInfo(listPacientes.getSelectedValue());
            }}
        });
		
		JPanel pDatosPacientes = new JPanel();
		pDatosPacientes.setBorder(new TitledBorder(null, Messages.getString("PrincipalWindow.pDatosPacientes.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		pDatosPacientes.setOpaque(false);
		GridBagConstraints gbc_pDatosPacientes = new GridBagConstraints();
		gbc_pDatosPacientes.fill = GridBagConstraints.BOTH;
		gbc_pDatosPacientes.gridx = 1;
		gbc_pDatosPacientes.gridy = 0;
		pMisPacientes.add(pDatosPacientes, gbc_pDatosPacientes);
		GridBagLayout gbl_pDatosPacientes = new GridBagLayout();
		gbl_pDatosPacientes.columnWidths = new int[] {277, 643, 453};
		gbl_pDatosPacientes.rowHeights = new int[] {213, 33, 0, 0};
		gbl_pDatosPacientes.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pDatosPacientes.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		pDatosPacientes.setLayout(gbl_pDatosPacientes);
		
		lblFotoPaciente_1 = new JLabel(Messages.getString("PrincipalWindow.lblFotoPaciente_1.text")); //$NON-NLS-1$
		lblFotoPaciente_1.setToolTipText(Messages.getString("PrincipalWindow.lblFotoPaciente_1.toolTipText")); //$NON-NLS-1$
		lblFotoPaciente_1.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/27705-200.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblFotoPaciente_1 = new GridBagConstraints();
		gbc_lblFotoPaciente_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoPaciente_1.gridx = 0;
		gbc_lblFotoPaciente_1.gridy = 0;
		pDatosPacientes.add(lblFotoPaciente_1, gbc_lblFotoPaciente_1);
		
		JPanel pDatosPacientes_1 = new JPanel();
		pDatosPacientes_1.setBorder(null);
		pDatosPacientes_1.setOpaque(false);
		GridBagConstraints gbc_pDatosPacientes_1 = new GridBagConstraints();
		gbc_pDatosPacientes_1.gridheight = 3;
		gbc_pDatosPacientes_1.fill = GridBagConstraints.BOTH;
		gbc_pDatosPacientes_1.gridx = 1;
		gbc_pDatosPacientes_1.gridy = 0;
		pDatosPacientes.add(pDatosPacientes_1, gbc_pDatosPacientes_1);
		GridBagLayout gbl_pDatosPacientes_1 = new GridBagLayout();
		gbl_pDatosPacientes_1.columnWidths = new int[]{171, 4, 161, 138, 106, 92, 86, 0};
		gbl_pDatosPacientes_1.rowHeights = new int[]{27, 30, 30, 34, 34, 0, 27, 28, 31, 30, 30, 31, 34, 26, 30, 30, 30, 0, 29, 59, 0};
		gbl_pDatosPacientes_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pDatosPacientes_1.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		pDatosPacientes_1.setLayout(gbl_pDatosPacientes_1);
		
		lblNombre_2 = new JLabel(Messages.getString("PrincipalWindow.lblNombre_2.text")); //$NON-NLS-1$
		lblNombre_2.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombre_2 = new GridBagConstraints();
		gbc_lblNombre_2.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNombre_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre_2.gridx = 0;
		gbc_lblNombre_2.gridy = 0;
		pDatosPacientes_1.add(lblNombre_2, gbc_lblNombre_2);
		
		lblApellidos_2 = new JLabel(Messages.getString("PrincipalWindow.lblApellidos_2.text")); //$NON-NLS-1$
		lblApellidos_2.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblApellidos_2 = new GridBagConstraints();
		gbc_lblApellidos_2.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblApellidos_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos_2.gridx = 2;
		gbc_lblApellidos_2.gridy = 0;
		pDatosPacientes_1.add(lblApellidos_2, gbc_lblApellidos_2);
		
		lblAntecedentes = new JLabel(Messages.getString("PrincipalWindow.lblAntecedentes.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblAntecedentes = new GridBagConstraints();
		gbc_lblAntecedentes.anchor = GridBagConstraints.WEST;
		gbc_lblAntecedentes.insets = new Insets(0, 0, 5, 5);
		gbc_lblAntecedentes.gridx = 4;
		gbc_lblAntecedentes.gridy = 0;
		pDatosPacientes_1.add(lblAntecedentes, gbc_lblAntecedentes);


		ftxtNombre = new JFormattedTextField();
		ftxtNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();

			    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
			    	e.consume();
			}
		});
		ftxtNombre.setToolTipText(Messages.getString("PrincipalWindow.ftxtNombre.toolTipText")); //$NON-NLS-1$
		ftxtNombre.setFocusable(false);
		ftxtNombre.setEditable(false);
		GridBagConstraints gbc_ftxtNombre = new GridBagConstraints();
		gbc_ftxtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtNombre.gridx = 0;
		gbc_ftxtNombre.gridy = 1;
		pDatosPacientes_1.add(ftxtNombre, gbc_ftxtNombre);
		
		ftxtApellidos = new JFormattedTextField();
		ftxtApellidos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();

			    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
			    	e.consume();
			}
		});
		ftxtApellidos.setToolTipText(Messages.getString("PrincipalWindow.ftxtApellidos.toolTipText")); //$NON-NLS-1$
		ftxtApellidos.setFocusable(false);
		ftxtApellidos.setEditable(false);
		GridBagConstraints gbc_ftxtApellidos = new GridBagConstraints();
		gbc_ftxtApellidos.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtApellidos.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtApellidos.gridx = 2;
		gbc_ftxtApellidos.gridy = 1;
		pDatosPacientes_1.add(ftxtApellidos, gbc_ftxtApellidos);
		
		txtaAntecedentes = new JTextArea();
		txtaAntecedentes.setToolTipText(Messages.getString("PrincipalWindow.txtaAntecedentes.toolTipText")); //$NON-NLS-1$
		txtaAntecedentes.setFocusable(false);
		txtaAntecedentes.setLineWrap(true);
		txtaAntecedentes.setEditable(false);
		txtaAntecedentes.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_txtaAntecedentes = new GridBagConstraints();
		gbc_txtaAntecedentes.gridwidth = 2;
		gbc_txtaAntecedentes.gridheight = 4;
		gbc_txtaAntecedentes.insets = new Insets(0, 0, 5, 5);
		gbc_txtaAntecedentes.fill = GridBagConstraints.BOTH;
		gbc_txtaAntecedentes.gridx = 4;
		gbc_txtaAntecedentes.gridy = 1;
		pDatosPacientes_1.add(txtaAntecedentes, gbc_txtaAntecedentes);
		
		lblEdad = new JLabel(Messages.getString("PrincipalWindow.lblEdad.text")); //$NON-NLS-1$
		lblEdad.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblEdad = new GridBagConstraints();
		gbc_lblEdad.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblEdad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEdad.gridx = 0;
		gbc_lblEdad.gridy = 2;
		pDatosPacientes_1.add(lblEdad, gbc_lblEdad);
		
		lblSexo = new JLabel(Messages.getString("PrincipalWindow.lblSexo.text")); //$NON-NLS-1$
		lblSexo.setToolTipText(Messages.getString("PrincipalWindow.lblSexo.toolTipText")); //$NON-NLS-1$
		GridBagConstraints gbc_lblSexo = new GridBagConstraints();
		gbc_lblSexo.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblSexo.insets = new Insets(0, 0, 5, 5);
		gbc_lblSexo.gridx = 2;
		gbc_lblSexo.gridy = 2;
		pDatosPacientes_1.add(lblSexo, gbc_lblSexo);
		
		MaskFormatter formatoEDAD;
		try {
			formatoEDAD = new MaskFormatter("##"); //$NON-NLS-1$
			formatoEDAD.setPlaceholderCharacter('X');
			ftxtEdad = new JFormattedTextField(formatoEDAD);
		} catch (ParseException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		ftxtEdad.setFocusable(false);
		ftxtEdad.setEditable(false);
		GridBagConstraints gbc_ftxtEdad = new GridBagConstraints();
		gbc_ftxtEdad.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtEdad.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtEdad.gridx = 0;
		gbc_ftxtEdad.gridy = 3;
		pDatosPacientes_1.add(ftxtEdad, gbc_ftxtEdad);
		
		cbSexo = new JComboBox();
		cbSexo.setToolTipText(Messages.getString("PrincipalWindow.cbSexo.toolTipText")); //$NON-NLS-1$
		cbSexo.setEnabled(false);
		cbSexo.setBackground(Color.LIGHT_GRAY);
		cbSexo.addItem(""); //$NON-NLS-1$
		cbSexo.addItem(Messages.getString("PrincipalWindow.113")); //$NON-NLS-1$
		cbSexo.addItem(Messages.getString("PrincipalWindow.114")); //$NON-NLS-1$
		cbSexo.setDoubleBuffered(true);
		GridBagConstraints gbc_cbSexo = new GridBagConstraints();
		gbc_cbSexo.insets = new Insets(0, 0, 5, 5);
		gbc_cbSexo.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbSexo.gridx = 2;
		gbc_cbSexo.gridy = 3;
		pDatosPacientes_1.add(cbSexo, gbc_cbSexo);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setPreferredSize(new Dimension(300,1));
		separator_2.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_2.gridwidth = 3;
		gbc_separator_2.gridheight = 2;
		gbc_separator_2.insets = new Insets(0, 0, 5, 5);
		gbc_separator_2.gridx = 0;
		gbc_separator_2.gridy = 4;
		pDatosPacientes_1.add(separator_2, gbc_separator_2);
		
		lblTelefono_2 = new JLabel(Messages.getString("PrincipalWindow.lblTelefono_2.text")); //$NON-NLS-1$
		lblTelefono_2.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblTelefono_2 = new GridBagConstraints();
		gbc_lblTelefono_2.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblTelefono_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono_2.gridx = 0;
		gbc_lblTelefono_2.gridy = 6;
		pDatosPacientes_1.add(lblTelefono_2, gbc_lblTelefono_2);
		
		lblMovil_1 = new JLabel(Messages.getString("PrincipalWindow.lblMovil_1.text")); //$NON-NLS-1$
		lblMovil_1.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblMovil_1 = new GridBagConstraints();
		gbc_lblMovil_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblMovil_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblMovil_1.gridx = 2;
		gbc_lblMovil_1.gridy = 6;
		pDatosPacientes_1.add(lblMovil_1, gbc_lblMovil_1);
		
		lblTratamiento = new JLabel(Messages.getString("PrincipalWindow.lblTratamiento.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblTratamiento = new GridBagConstraints();
		gbc_lblTratamiento.anchor = GridBagConstraints.WEST;
		gbc_lblTratamiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblTratamiento.gridx = 4;
		gbc_lblTratamiento.gridy = 6;
		pDatosPacientes_1.add(lblTratamiento, gbc_lblTratamiento);
		
		MaskFormatter formatoTELEFONO;
		try {
			formatoTELEFONO = new MaskFormatter("#########"); //$NON-NLS-1$
			formatoTELEFONO.setPlaceholderCharacter('X');
			ftxtTelefono = new JFormattedTextField(formatoTELEFONO);
		} catch (ParseException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		ftxtTelefono.setToolTipText(Messages.getString("PrincipalWindow.ftxtTelefono.toolTipText")); //$NON-NLS-1$
		ftxtTelefono.setFocusable(false);
		ftxtTelefono.setEditable(false);
		GridBagConstraints gbc_ftxtTelefono = new GridBagConstraints();
		gbc_ftxtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtTelefono.gridx = 0;
		gbc_ftxtTelefono.gridy = 7;
		pDatosPacientes_1.add(ftxtTelefono, gbc_ftxtTelefono);
		
		MaskFormatter formatoMOVIL;
		try {
			formatoMOVIL = new MaskFormatter("#########"); //$NON-NLS-1$
			formatoMOVIL.setPlaceholderCharacter('X');
			ftxtMovil = new JFormattedTextField(formatoMOVIL);
		} catch (ParseException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		ftxtMovil.setToolTipText(Messages.getString("PrincipalWindow.ftxtMovil.toolTipText")); //$NON-NLS-1$
		ftxtMovil.setFocusable(false);
		ftxtMovil.setEditable(false);
		GridBagConstraints gbc_ftxtMovil = new GridBagConstraints();
		gbc_ftxtMovil.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtMovil.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtMovil.gridx = 2;
		gbc_ftxtMovil.gridy = 7;
		pDatosPacientes_1.add(ftxtMovil, gbc_ftxtMovil);
		
		txtaTratamiento = new JTextArea();
		txtaTratamiento.setToolTipText(Messages.getString("PrincipalWindow.txtaTratamiento.toolTipText")); //$NON-NLS-1$
		txtaTratamiento.setFocusable(false);
		txtaTratamiento.setLineWrap(true);
		txtaTratamiento.setEditable(false);
		txtaTratamiento.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_txtaTratamiento = new GridBagConstraints();
		gbc_txtaTratamiento.gridwidth = 2;
		gbc_txtaTratamiento.gridheight = 4;
		gbc_txtaTratamiento.insets = new Insets(0, 0, 5, 5);
		gbc_txtaTratamiento.fill = GridBagConstraints.BOTH;
		gbc_txtaTratamiento.gridx = 4;
		gbc_txtaTratamiento.gridy = 7;
		pDatosPacientes_1.add(txtaTratamiento, gbc_txtaTratamiento);
		
		lblEmail_1 = new JLabel(Messages.getString("PrincipalWindow.lblEmail_1.text")); //$NON-NLS-1$
		lblEmail_1.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblEmail_1 = new GridBagConstraints();
		gbc_lblEmail_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblEmail_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblEmail_1.gridx = 0;
		gbc_lblEmail_1.gridy = 8;
		pDatosPacientes_1.add(lblEmail_1, gbc_lblEmail_1);
		
		MaskFormatter formatoEMAIL;
		try {
			formatoEMAIL = new MaskFormatter("AAAAAAA@gmail.com"); //$NON-NLS-1$
			formatoEMAIL.setPlaceholderCharacter('x');
			ftxtEmail = new JFormattedTextField(formatoEMAIL);
		} catch (ParseException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		ftxtEmail.setToolTipText(Messages.getString("PrincipalWindow.ftxtEmail.toolTipText")); //$NON-NLS-1$
		ftxtEmail.setFocusable(false);
		ftxtEmail.setEditable(false);
		GridBagConstraints gbc_ftxtEmail = new GridBagConstraints();
		gbc_ftxtEmail.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtEmail.gridx = 0;
		gbc_ftxtEmail.gridy = 9;
		pDatosPacientes_1.add(ftxtEmail, gbc_ftxtEmail);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setPreferredSize(new Dimension(300,1));
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_separator_3.gridheight = 2;
		gbc_separator_3.gridwidth = 3;
		gbc_separator_3.insets = new Insets(0, 0, 5, 5);
		gbc_separator_3.gridx = 0;
		gbc_separator_3.gridy = 10;
		pDatosPacientes_1.add(separator_3, gbc_separator_3);
		
		lblCodigoPostal_2 = new JLabel(Messages.getString("PrincipalWindow.lblCodigoPostal_2.text")); //$NON-NLS-1$
		lblCodigoPostal_2.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblCodigoPostal_2 = new GridBagConstraints();
		gbc_lblCodigoPostal_2.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblCodigoPostal_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigoPostal_2.gridx = 0;
		gbc_lblCodigoPostal_2.gridy = 12;
		pDatosPacientes_1.add(lblCodigoPostal_2, gbc_lblCodigoPostal_2);
		
		lblLocalidad_1 = new JLabel(Messages.getString("PrincipalWindow.lblLocalidad_1.text")); //$NON-NLS-1$
		lblLocalidad_1.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblLocalidad_1 = new GridBagConstraints();
		gbc_lblLocalidad_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblLocalidad_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocalidad_1.gridx = 2;
		gbc_lblLocalidad_1.gridy = 12;
		pDatosPacientes_1.add(lblLocalidad_1, gbc_lblLocalidad_1);
		
		lblImgenesMdicas = new JLabel(Messages.getString("PrincipalWindow.lblImgenesMdicas.text")); //$NON-NLS-1$
		GridBagConstraints gbc_lblImgenesMdicas = new GridBagConstraints();
		gbc_lblImgenesMdicas.anchor = GridBagConstraints.WEST;
		gbc_lblImgenesMdicas.gridwidth = 2;
		gbc_lblImgenesMdicas.insets = new Insets(0, 0, 5, 5);
		gbc_lblImgenesMdicas.gridx = 4;
		gbc_lblImgenesMdicas.gridy = 12;
		pDatosPacientes_1.add(lblImgenesMdicas, gbc_lblImgenesMdicas);
		

		MaskFormatter formatoCP;
		try {
			formatoCP = new MaskFormatter("#####"); //$NON-NLS-1$
			formatoCP.setPlaceholderCharacter('X');
			ftxtCodigoPostal = new JFormattedTextField(formatoCP);
		} catch (ParseException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		ftxtCodigoPostal.setToolTipText(Messages.getString("PrincipalWindow.ftxtCodigoPostal.toolTipText")); //$NON-NLS-1$
		ftxtCodigoPostal.setFocusable(false);
		ftxtCodigoPostal.setEditable(false);
		GridBagConstraints gbc_ftxtCodigoPostal = new GridBagConstraints();
		gbc_ftxtCodigoPostal.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtCodigoPostal.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtCodigoPostal.gridx = 0;
		gbc_ftxtCodigoPostal.gridy = 13;
		pDatosPacientes_1.add(ftxtCodigoPostal, gbc_ftxtCodigoPostal);
		
		ftxtLocalidad = new JFormattedTextField();
		ftxtLocalidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();

			    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
			    	e.consume();
			}
		});
		ftxtLocalidad.setToolTipText(Messages.getString("PrincipalWindow.ftxtLocalidad.toolTipText")); //$NON-NLS-1$
		ftxtLocalidad.setFocusable(false);
		ftxtLocalidad.setEditable(false);
		GridBagConstraints gbc_ftxtLocalidad = new GridBagConstraints();
		gbc_ftxtLocalidad.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtLocalidad.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtLocalidad.gridx = 2;
		gbc_ftxtLocalidad.gridy = 13;
		pDatosPacientes_1.add(ftxtLocalidad, gbc_ftxtLocalidad);
		
		btnImagen = new JButton(Messages.getString("PrincipalWindow.btnImagen.text")); //$NON-NLS-1$
		btnImagen.setToolTipText(Messages.getString("PrincipalWindow.btnImagen.toolTipText")); //$NON-NLS-1$
		btnImagen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (mode.equals("NEW") && !done){ //$NON-NLS-1$
					JOptionPane.showMessageDialog(frmAdministracinHospital, Messages.getString("PrincipalWindow.120"), "ERROR", //$NON-NLS-1$ //$NON-NLS-2$
							JOptionPane.ERROR_MESSAGE);
				} else {
					if (!listPacientes.isSelectionEmpty()){
						if (currentPatient.getImage1().getImagePath().equals("")){ //$NON-NLS-1$
							btnCargarImagen(imagen1, btnImagen);
						} else {
							new ImageInfo(currentPatient.getImage1(), btnImagen);
						}
					
					} else {
						JOptionPane.showMessageDialog(frmAdministracinHospital, Messages.getString("PrincipalWindow.123"), "ERROR", //$NON-NLS-1$ //$NON-NLS-2$
								JOptionPane.ERROR_MESSAGE);
					}
				}
				
			}
		});
		btnImagen.setSize(new Dimension(199, 199));
		btnImagen.setFocusTraversalPolicyProvider(true);
		btnImagen.setFocusable(false);
		btnImagen.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/infoimagenes.png"))); //$NON-NLS-1$
		btnImagen.setContentAreaFilled(false);
		btnImagen.setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		GridBagConstraints gbc_btnImagen = new GridBagConstraints();
		gbc_btnImagen.fill = GridBagConstraints.BOTH;
		gbc_btnImagen.insets = new Insets(0, 0, 5, 5);
		gbc_btnImagen.gridx = 4;
		gbc_btnImagen.gridy = 13;
		pDatosPacientes_1.add(btnImagen, gbc_btnImagen);
		
		lblProvincia_1 = new JLabel(Messages.getString("PrincipalWindow.lblProvincia_1.text")); //$NON-NLS-1$
		lblProvincia_1.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblProvincia_1 = new GridBagConstraints();
		gbc_lblProvincia_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblProvincia_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvincia_1.gridx = 0;
		gbc_lblProvincia_1.gridy = 14;
		pDatosPacientes_1.add(lblProvincia_1, gbc_lblProvincia_1);
		
		lblCalle_1 = new JLabel(Messages.getString("PrincipalWindow.lblCalle_1.text")); //$NON-NLS-1$
		lblCalle_1.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblCalle_1 = new GridBagConstraints();
		gbc_lblCalle_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblCalle_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCalle_1.gridx = 2;
		gbc_lblCalle_1.gridy = 14;
		pDatosPacientes_1.add(lblCalle_1, gbc_lblCalle_1);
		
		ftxtProvincia = new JFormattedTextField();
		ftxtProvincia.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();

			    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
			    	e.consume();
			}
		});
		ftxtProvincia.setToolTipText(Messages.getString("PrincipalWindow.ftxtProvincia.toolTipText")); //$NON-NLS-1$
		ftxtProvincia.setFocusable(false);
		ftxtProvincia.setEditable(false);
		GridBagConstraints gbc_ftxtProvincia = new GridBagConstraints();
		gbc_ftxtProvincia.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtProvincia.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtProvincia.gridx = 0;
		gbc_ftxtProvincia.gridy = 15;
		pDatosPacientes_1.add(ftxtProvincia, gbc_ftxtProvincia);
		
		ftxtCalle = new JFormattedTextField();
		ftxtCalle.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();

			    if(!(Character.isAlphabetic(c) ||  (c==KeyEvent.VK_BACK_SPACE)||  c==KeyEvent.VK_DELETE ))
			    	e.consume();
			}
		});
		ftxtCalle.setToolTipText(Messages.getString("PrincipalWindow.ftxtCalle.toolTipText")); //$NON-NLS-1$
		ftxtCalle.setFocusable(false);
		ftxtCalle.setEditable(false);
		GridBagConstraints gbc_ftxtCalle = new GridBagConstraints();
		gbc_ftxtCalle.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtCalle.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtCalle.gridx = 2;
		gbc_ftxtCalle.gridy = 15;
		pDatosPacientes_1.add(ftxtCalle, gbc_ftxtCalle);
		
		btnImagen_1 = new JButton(Messages.getString("PrincipalWindow.btnImagen_1.text")); //$NON-NLS-1$
		btnImagen_1.setToolTipText(Messages.getString("PrincipalWindow.btnImagen_1.toolTipText")); //$NON-NLS-1$
		btnImagen_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (mode.equals("NEW") && !done){ //$NON-NLS-1$
					JOptionPane.showMessageDialog(frmAdministracinHospital, Messages.getString("PrincipalWindow.127"), "ERROR", //$NON-NLS-1$ //$NON-NLS-2$
							JOptionPane.ERROR_MESSAGE);
				} else {
					if (!listPacientes.isSelectionEmpty()){
						if (currentPatient.getImage2().getImagePath().equals("")){ //$NON-NLS-1$
							btnCargarImagen(imagen2, btnImagen_1);
						} else {
							new ImageInfo(currentPatient.getImage2(), btnImagen_1);
						}
					
					} else {
						JOptionPane.showMessageDialog(frmAdministracinHospital, Messages.getString("PrincipalWindow.130"), "ERROR", //$NON-NLS-1$ //$NON-NLS-2$
								JOptionPane.ERROR_MESSAGE);
					}
				}
				
			}
		});
		btnImagen_1.setSize(new Dimension(199, 199));
		btnImagen_1.setFocusTraversalPolicyProvider(true);
		btnImagen_1.setFocusable(false);
		btnImagen_1.setContentAreaFilled(false);
		btnImagen_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 3));
		btnImagen_1.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/infoimagenes.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_btnImagen_1 = new GridBagConstraints();
		gbc_btnImagen_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnImagen_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnImagen_1.gridx = 4;
		gbc_btnImagen_1.gridy = 15;
		pDatosPacientes_1.add(btnImagen_1, gbc_btnImagen_1);
		
		lblNumero_1 = new JLabel(Messages.getString("PrincipalWindow.lblNumero_1.text")); //$NON-NLS-1$
		lblNumero_1.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblNumero_1 = new GridBagConstraints();
		gbc_lblNumero_1.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNumero_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumero_1.gridx = 0;
		gbc_lblNumero_1.gridy = 16;
		pDatosPacientes_1.add(lblNumero_1, gbc_lblNumero_1);
		
		MaskFormatter formatoNUMERO;
		try {
			formatoNUMERO = new MaskFormatter("##"); //$NON-NLS-1$
			formatoNUMERO.setPlaceholderCharacter('X');
			ftxtNumero = new JFormattedTextField(formatoNUMERO);
		} catch (ParseException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}
		ftxtNumero.setToolTipText(Messages.getString("PrincipalWindow.ftxtNumero.toolTipText")); //$NON-NLS-1$
		ftxtNumero.setFocusable(false);
		ftxtNumero.setDisabledTextColor(Color.WHITE);
		ftxtNumero.setSelectedTextColor(Color.WHITE);
		ftxtNumero.setEditable(false);
		GridBagConstraints gbc_ftxtNumero = new GridBagConstraints();
		gbc_ftxtNumero.insets = new Insets(0, 0, 5, 5);
		gbc_ftxtNumero.fill = GridBagConstraints.HORIZONTAL;
		gbc_ftxtNumero.gridx = 0;
		gbc_ftxtNumero.gridy = 17;
		pDatosPacientes_1.add(ftxtNumero, gbc_ftxtNumero);
		
		separator_9 = new JSeparator();
		GridBagConstraints gbc_separator_9 = new GridBagConstraints();
		gbc_separator_9.insets = new Insets(0, 0, 5, 5);
		gbc_separator_9.gridx = 0;
		gbc_separator_9.gridy = 18;
		pDatosPacientes_1.add(separator_9, gbc_separator_9);
		
		pBotones = new JPanel();
		pBotones.setOpaque(false);
		GridBagConstraints gbc_pBotones = new GridBagConstraints();
		gbc_pBotones.gridwidth = 3;
		gbc_pBotones.insets = new Insets(0, 0, 0, 5);
		gbc_pBotones.fill = GridBagConstraints.BOTH;
		gbc_pBotones.gridx = 0;
		gbc_pBotones.gridy = 19;
		pDatosPacientes_1.add(pBotones, gbc_pBotones);
		GridBagLayout gbl_pBotones = new GridBagLayout();
		gbl_pBotones.columnWidths = new int[]{67, 11, 63, 0, 0};
		gbl_pBotones.rowHeights = new int[]{33, 26, 0};
		gbl_pBotones.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_pBotones.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		pBotones.setLayout(gbl_pBotones);
		
		btnAceptar = new JButton(Messages.getString("PrincipalWindow.btnAceptar.text")); //$NON-NLS-1$
		btnAceptar.setToolTipText(Messages.getString("PrincipalWindow.btnAceptar.toolTipText")); //$NON-NLS-1$
		btnAceptar.setFocusable(false);
		btnAceptar.addActionListener(new NewAndSave());
		btnAceptar.setVisible(false);
		btnAceptar.setEnabled(false);
		btnAceptar.setBorder(new LineBorder(Color.GREEN, 3));
		btnAceptar.setContentAreaFilled(false);
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.fill = GridBagConstraints.BOTH;
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptar.gridx = 0;
		gbc_btnAceptar.gridy = 0;
		pBotones.add(btnAceptar, gbc_btnAceptar);
		
		separator_7 = new JSeparator();
		GridBagConstraints gbc_separator_7 = new GridBagConstraints();
		gbc_separator_7.insets = new Insets(0, 0, 5, 5);
		gbc_separator_7.gridx = 1;
		gbc_separator_7.gridy = 0;
		pBotones.add(separator_7, gbc_separator_7);
		
		btnCancelar = new JButton(Messages.getString("PrincipalWindow.btnCancelar.text")); //$NON-NLS-1$
		btnCancelar.setToolTipText(Messages.getString("PrincipalWindow.btnCancelar.toolTipText")); //$NON-NLS-1$
		btnCancelar.addActionListener(new BtnCancelarListener());
		btnCancelar.setFocusable(false);
		btnCancelar.setEnabled(false);
		btnCancelar.setVisible(false);
		btnCancelar.setBorder(new LineBorder(Color.RED, 3));
		btnCancelar.setContentAreaFilled(false);
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.fill = GridBagConstraints.BOTH;
		gbc_btnCancelar.gridx = 2;
		gbc_btnCancelar.gridy = 0;
		pBotones.add(btnCancelar, gbc_btnCancelar);
		
		lblCheck = new JLabel(Messages.getString("PrincipalWindow.lblCheck.text")); //$NON-NLS-1$
		lblCheck.setVisible(false);
		GridBagConstraints gbc_lblCheck = new GridBagConstraints();
		gbc_lblCheck.gridwidth = 4;
		gbc_lblCheck.insets = new Insets(0, 0, 0, 5);
		gbc_lblCheck.gridx = 0;
		gbc_lblCheck.gridy = 1;
		pBotones.add(lblCheck, gbc_lblCheck);
		
		separator_8 = new JSeparator();
		GridBagConstraints gbc_separator_8 = new GridBagConstraints();
		gbc_separator_8.anchor = GridBagConstraints.EAST;
		gbc_separator_8.gridheight = 3;
		gbc_separator_8.insets = new Insets(0, 0, 5, 5);
		gbc_separator_8.gridx = 3;
		gbc_separator_8.gridy = 16;
		pDatosPacientes_1.add(separator_8, gbc_separator_8);
		
		btnAnadirPaciente = new JButton(Messages.getString("PrincipalWindow.btnAnadirPaciente.text")); //$NON-NLS-1$
		btnAnadirPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listPacientes.clearSelection();
				setBlankFields();
				currentPatient = new Patient ("", "", "", "", "", "", "", "", "", "", "", "", "", null, true, "", "", //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$ //$NON-NLS-6$ //$NON-NLS-7$ //$NON-NLS-8$ //$NON-NLS-9$ //$NON-NLS-10$ //$NON-NLS-11$ //$NON-NLS-12$ //$NON-NLS-13$ //$NON-NLS-14$ //$NON-NLS-15$
						null, null);
				setNeededField();
				showNewEdit();
				done = false;
				mode = "NEW"; //$NON-NLS-1$
				lblFotoPaciente_1.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/27705-200.png"))); //$NON-NLS-1$
			}
		});
		btnAnadirPaciente.setToolTipText(Messages.getString("PrincipalWindow.btnAnadirPaciente.toolTipText")); //$NON-NLS-1$
		btnAnadirPaciente.setFocusable(false);
		btnAnadirPaciente.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/add.png"))); //$NON-NLS-1$
		btnAnadirPaciente.setContentAreaFilled(false);
		btnAnadirPaciente.setBorderPainted(false);
		GridBagConstraints gbc_btnAnadirPaciente = new GridBagConstraints();
		gbc_btnAnadirPaciente.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnAnadirPaciente.insets = new Insets(0, 0, 0, 5);
		gbc_btnAnadirPaciente.gridx = 3;
		gbc_btnAnadirPaciente.gridy = 19;
		pDatosPacientes_1.add(btnAnadirPaciente, gbc_btnAnadirPaciente);
		
		btnEditarPaciente = new JButton(Messages.getString("PrincipalWindow.btnEditarPaciente.text")); //$NON-NLS-1$
		btnEditarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!listPacientes.isSelectionEmpty()){
					setNeededField();
					showNewEdit();
					done = false;
					mode = "EDIT"; //$NON-NLS-1$
						
									
				} else {
					JOptionPane.showMessageDialog(frmAdministracinHospital, Messages.getString("PrincipalWindow.153"), "ERROR", //$NON-NLS-1$ //$NON-NLS-2$
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnEditarPaciente.setToolTipText(Messages.getString("PrincipalWindow.btnEditarPaciente.toolTipText")); //$NON-NLS-1$
		btnEditarPaciente.setFocusable(false);
		btnEditarPaciente.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/write.png"))); //$NON-NLS-1$
		btnEditarPaciente.setContentAreaFilled(false);
		btnEditarPaciente.setBorderPainted(false);
		GridBagConstraints gbc_btnEditarPaciente = new GridBagConstraints();
		gbc_btnEditarPaciente.anchor = GridBagConstraints.SOUTH;
		gbc_btnEditarPaciente.insets = new Insets(0, 0, 0, 5);
		gbc_btnEditarPaciente.gridx = 4;
		gbc_btnEditarPaciente.gridy = 19;
		pDatosPacientes_1.add(btnEditarPaciente, gbc_btnEditarPaciente);
		
		btnBorrarPaciente = new JButton(Messages.getString("PrincipalWindow.btnBorrarPaciente.text")); //$NON-NLS-1$
		btnBorrarPaciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!listPacientes.isSelectionEmpty()){
					DefaultListModel model = (DefaultListModel) listPacientes.getModel();
					int selectedIndex = listPacientes.getSelectedIndex();
					
					int borrar = JOptionPane.showConfirmDialog(null, Messages.getString("PrincipalWindow.156"), Messages.getString("PrincipalWindow.157"), //$NON-NLS-1$ //$NON-NLS-2$
							JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
					
					if (borrar == JOptionPane.YES_OPTION && listPacientes.getSelectedIndex() != -1) {
						
						model.remove(selectedIndex);
						hidePacientesInfo();
						setBlankFields();
					}				
					
				} else {
					JOptionPane.showMessageDialog(frmAdministracinHospital, Messages.getString("PrincipalWindow.158"), "ERROR", //$NON-NLS-1$ //$NON-NLS-2$
							JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnBorrarPaciente.setToolTipText(Messages.getString("PrincipalWindow.btnBorrarPaciente.toolTipText")); //$NON-NLS-1$
		btnBorrarPaciente.setFocusable(false);
		btnBorrarPaciente.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/del.png"))); //$NON-NLS-1$
		btnBorrarPaciente.setBorderPainted(false);
		btnBorrarPaciente.setContentAreaFilled(false);
		GridBagConstraints gbc_btnBorrarPaciente = new GridBagConstraints();
		gbc_btnBorrarPaciente.insets = new Insets(0, 0, 0, 5);
		gbc_btnBorrarPaciente.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnBorrarPaciente.gridx = 5;
		gbc_btnBorrarPaciente.gridy = 19;
		pDatosPacientes_1.add(btnBorrarPaciente, gbc_btnBorrarPaciente);
		
		btnExaminar = new JButton(Messages.getString("PrincipalWindow.btnExaminar.text")); //$NON-NLS-1$
		btnExaminar.setToolTipText(Messages.getString("PrincipalWindow.btnExaminar.toolTipText")); //$NON-NLS-1$
		btnExaminar.setVisible(false);
		btnExaminar.setEnabled(false);
		btnExaminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnExaminar.addActionListener(new BtnCargaFoto());
			}
		});
		btnExaminar.setFocusable(false);
		btnExaminar.setBorder(new LineBorder(SystemColor.activeCaption, 3));
		btnExaminar.setContentAreaFilled(false);
		GridBagConstraints gbc_btnExaminar = new GridBagConstraints();
		gbc_btnExaminar.fill = GridBagConstraints.VERTICAL;
		gbc_btnExaminar.insets = new Insets(0, 0, 5, 5);
		gbc_btnExaminar.gridx = 0;
		gbc_btnExaminar.gridy = 1;
		pDatosPacientes.add(btnExaminar, gbc_btnExaminar);
		
		pEspecialistas = new JPanel();
		pEspecialistas.setToolTipText(Messages.getString("PrincipalWindow.pEspecialistas.toolTipText")); //$NON-NLS-1$
		pEspecialistas.setVisible(false);
		tabbedPane.addTab(Messages.getString("PrincipalWindow.161"), null, pEspecialistas, null); //$NON-NLS-1$
		pEspecialistas.setBackground(Color.WHITE);
		GridBagLayout gbl_pEspecialistas = new GridBagLayout();
		gbl_pEspecialistas.columnWidths = new int[]{305, 0, 0};
		gbl_pEspecialistas.rowHeights = new int[]{0, 0};
		gbl_pEspecialistas.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_pEspecialistas.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pEspecialistas.setLayout(gbl_pEspecialistas);
		
		JPanel pEspecialistass = new JPanel();
		pEspecialistass.setBorder(new TitledBorder(null, Messages.getString("PrincipalWindow.pEspecialistass.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		pEspecialistass.setOpaque(false);
		GridBagConstraints gbc_pEspecialistass = new GridBagConstraints();
		gbc_pEspecialistass.insets = new Insets(0, 0, 0, 5);
		gbc_pEspecialistass.fill = GridBagConstraints.BOTH;
		gbc_pEspecialistass.gridx = 0;
		gbc_pEspecialistass.gridy = 0;
		pEspecialistas.add(pEspecialistass, gbc_pEspecialistass);
		GridBagLayout gbl_pEspecialistass = new GridBagLayout();
		gbl_pEspecialistass.columnWidths = new int[]{0, 0};
		gbl_pEspecialistass.rowHeights = new int[]{0, 0};
		gbl_pEspecialistass.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_pEspecialistass.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		pEspecialistass.setLayout(gbl_pEspecialistass);

		DefaultListModel<Specialist> modelEspecialistas = new DefaultListModel<>();
		JList <Specialist> listEspecialistas = new JList<>( modelEspecialistas );
		listEspecialistas.setToolTipText(Messages.getString("PrincipalWindow.listEspecialistas.toolTipText")); //$NON-NLS-1$
		listEspecialistas.setBackground(new Color(255, 255, 255));
		GridBagConstraints gbc_listEspecialistas = new GridBagConstraints();
		gbc_listEspecialistas.fill = GridBagConstraints.BOTH;
		gbc_listEspecialistas.gridx = 0;
		gbc_listEspecialistas.gridy = 0;
		pEspecialistass.add(listEspecialistas, gbc_listEspecialistas);
		modelEspecialistas.addElement(javier);
		modelEspecialistas.addElement(pablo);
		modelEspecialistas.addElement(victor);
		listEspecialistas.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent arg0) {
                setEspecialistasInfo(listEspecialistas.getSelectedValue());
            }
        });
		
		JPanel pDatosEspecialistas = new JPanel();
		pDatosEspecialistas.setBorder(new TitledBorder(null, Messages.getString("PrincipalWindow.pDatosEspecialistas.borderTitle"), TitledBorder.LEADING, TitledBorder.TOP, null, null)); //$NON-NLS-1$
		pDatosEspecialistas.setOpaque(false);
		GridBagConstraints gbc_pDatosEspecialistas = new GridBagConstraints();
		gbc_pDatosEspecialistas.fill = GridBagConstraints.BOTH;
		gbc_pDatosEspecialistas.gridx = 1;
		gbc_pDatosEspecialistas.gridy = 0;
		pEspecialistas.add(pDatosEspecialistas, gbc_pDatosEspecialistas);
		GridBagLayout gbl_pDatosEspecialistas = new GridBagLayout();
		gbl_pDatosEspecialistas.columnWidths = new int[]{264, 629, 0};
		gbl_pDatosEspecialistas.rowHeights = new int[]{0, 0, 0};
		gbl_pDatosEspecialistas.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_pDatosEspecialistas.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		pDatosEspecialistas.setLayout(gbl_pDatosEspecialistas);
		
		lblFotoEspecialista = new JLabel(Messages.getString("PrincipalWindow.lblFotoEspecialista.text")); //$NON-NLS-1$
		lblFotoEspecialista.setToolTipText(Messages.getString("PrincipalWindow.lblFotoEspecialista.toolTipText")); //$NON-NLS-1$
		lblFotoEspecialista.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/especialista.png"))); //$NON-NLS-1$
		GridBagConstraints gbc_lblFotoEspecialista = new GridBagConstraints();
		gbc_lblFotoEspecialista.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblFotoEspecialista.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotoEspecialista.gridx = 0;
		gbc_lblFotoEspecialista.gridy = 0;
		pDatosEspecialistas.add(lblFotoEspecialista, gbc_lblFotoEspecialista);
		
		JPanel pDatosEspecialista = new JPanel();
		pDatosEspecialista.setOpaque(false);
		GridBagConstraints gbc_pDatosEspecialista = new GridBagConstraints();
		gbc_pDatosEspecialista.gridheight = 2;
		gbc_pDatosEspecialista.insets = new Insets(0, 0, 5, 0);
		gbc_pDatosEspecialista.fill = GridBagConstraints.BOTH;
		gbc_pDatosEspecialista.gridx = 1;
		gbc_pDatosEspecialista.gridy = 0;
		pDatosEspecialistas.add(pDatosEspecialista, gbc_pDatosEspecialista);
		GridBagLayout gbl_pDatosEspecialista = new GridBagLayout();
		gbl_pDatosEspecialista.columnWidths = new int[]{180, 159, 0, 341, 0};
		gbl_pDatosEspecialista.rowHeights = new int[]{27, 28, 31, 30, 35, 0, 25, 27, 30, 25, 29, 29, 34, 25, 29, 28, 31, 29, 38, 0};
		gbl_pDatosEspecialista.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_pDatosEspecialista.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pDatosEspecialista.setLayout(gbl_pDatosEspecialista);
		
		lblNombre_3 = new JLabel(Messages.getString("PrincipalWindow.lblNombre_3.text")); //$NON-NLS-1$
		lblNombre_3.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblNombre_3 = new GridBagConstraints();
		gbc_lblNombre_3.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNombre_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre_3.gridx = 0;
		gbc_lblNombre_3.gridy = 0;
		pDatosEspecialista.add(lblNombre_3, gbc_lblNombre_3);
		
		lblApellidos_3 = new JLabel(Messages.getString("PrincipalWindow.lblApellidos_3.text")); //$NON-NLS-1$
		lblApellidos_3.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblApellidos_3 = new GridBagConstraints();
		gbc_lblApellidos_3.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblApellidos_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidos_3.gridx = 1;
		gbc_lblApellidos_3.gridy = 0;
		pDatosEspecialista.add(lblApellidos_3, gbc_lblApellidos_3);
		
		lblNombreEspecialista = new JLabel(Messages.getString("PrincipalWindow.lblNombreEspecialista.text")); //$NON-NLS-1$
		lblNombreEspecialista.setToolTipText(Messages.getString("PrincipalWindow.lblNombreEspecialista.toolTipText")); //$NON-NLS-1$
		lblNombreEspecialista.setVisible(false);
		lblNombreEspecialista.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblNombreEspecialista = new GridBagConstraints();
		gbc_lblNombreEspecialista.fill = GridBagConstraints.VERTICAL;
		gbc_lblNombreEspecialista.anchor = GridBagConstraints.WEST;
		gbc_lblNombreEspecialista.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreEspecialista.gridx = 0;
		gbc_lblNombreEspecialista.gridy = 1;
		pDatosEspecialista.add(lblNombreEspecialista, gbc_lblNombreEspecialista);
		
		lblApellidosEspecialista = new JLabel(Messages.getString("PrincipalWindow.lblApellidosEspecialista.text")); //$NON-NLS-1$
		lblApellidosEspecialista.setToolTipText(Messages.getString("PrincipalWindow.lblApellidosEspecialista.toolTipText")); //$NON-NLS-1$
		lblApellidosEspecialista.setVisible(false);
		lblApellidosEspecialista.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblApellidosEspecialista = new GridBagConstraints();
		gbc_lblApellidosEspecialista.fill = GridBagConstraints.VERTICAL;
		gbc_lblApellidosEspecialista.anchor = GridBagConstraints.WEST;
		gbc_lblApellidosEspecialista.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellidosEspecialista.gridx = 1;
		gbc_lblApellidosEspecialista.gridy = 1;
		pDatosEspecialista.add(lblApellidosEspecialista, gbc_lblApellidosEspecialista);
		
		lblEspecialidad = new JLabel(Messages.getString("PrincipalWindow.lblEspecialidad.text")); //$NON-NLS-1$
		lblEspecialidad.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblEspecialidad = new GridBagConstraints();
		gbc_lblEspecialidad.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblEspecialidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecialidad.gridx = 0;
		gbc_lblEspecialidad.gridy = 2;
		pDatosEspecialista.add(lblEspecialidad, gbc_lblEspecialidad);
		
		lblEspecialidadEspecialista = new JLabel(Messages.getString("PrincipalWindow.lblEspecialidadEspecialista.text")); //$NON-NLS-1$
		lblEspecialidadEspecialista.setToolTipText(Messages.getString("PrincipalWindow.lblEspecialidadEspecialista.toolTipText")); //$NON-NLS-1$
		lblEspecialidadEspecialista.setVisible(false);
		lblEspecialidadEspecialista.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblEspecialidadEspecialista = new GridBagConstraints();
		gbc_lblEspecialidadEspecialista.fill = GridBagConstraints.VERTICAL;
		gbc_lblEspecialidadEspecialista.anchor = GridBagConstraints.WEST;
		gbc_lblEspecialidadEspecialista.insets = new Insets(0, 0, 5, 5);
		gbc_lblEspecialidadEspecialista.gridx = 0;
		gbc_lblEspecialidadEspecialista.gridy = 3;
		pDatosEspecialista.add(lblEspecialidadEspecialista, gbc_lblEspecialidadEspecialista);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setPreferredSize(new Dimension(300,1));
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.gridheight = 2;
		gbc_separator_4.gridwidth = 4;
		gbc_separator_4.insets = new Insets(0, 0, 5, 0);
		gbc_separator_4.gridx = 0;
		gbc_separator_4.gridy = 4;
		pDatosEspecialista.add(separator_4, gbc_separator_4);
		
		lblPlanta = new JLabel(Messages.getString("PrincipalWindow.lblPlanta.text")); //$NON-NLS-1$
		lblPlanta.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblPlanta = new GridBagConstraints();
		gbc_lblPlanta.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblPlanta.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlanta.gridx = 0;
		gbc_lblPlanta.gridy = 6;
		pDatosEspecialista.add(lblPlanta, gbc_lblPlanta);
		
		lblDespacho = new JLabel(Messages.getString("PrincipalWindow.lblDespacho.text")); //$NON-NLS-1$
		lblDespacho.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblDespacho = new GridBagConstraints();
		gbc_lblDespacho.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblDespacho.insets = new Insets(0, 0, 5, 5);
		gbc_lblDespacho.gridx = 1;
		gbc_lblDespacho.gridy = 6;
		pDatosEspecialista.add(lblDespacho, gbc_lblDespacho);
		
		lblPlantaEspecialista = new JLabel(Messages.getString("PrincipalWindow.lblPlantaEspecialista.text")); //$NON-NLS-1$
		lblPlantaEspecialista.setToolTipText(Messages.getString("PrincipalWindow.lblPlantaEspecialista.toolTipText")); //$NON-NLS-1$
		lblPlantaEspecialista.setVisible(false);
		lblPlantaEspecialista.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblPlantaEspecialista = new GridBagConstraints();
		gbc_lblPlantaEspecialista.fill = GridBagConstraints.VERTICAL;
		gbc_lblPlantaEspecialista.anchor = GridBagConstraints.WEST;
		gbc_lblPlantaEspecialista.insets = new Insets(0, 0, 5, 5);
		gbc_lblPlantaEspecialista.gridx = 0;
		gbc_lblPlantaEspecialista.gridy = 7;
		pDatosEspecialista.add(lblPlantaEspecialista, gbc_lblPlantaEspecialista);
		
		lblDespachoEspecialista = new JLabel(Messages.getString("PrincipalWindow.lblDespachoEspecialista.text")); //$NON-NLS-1$
		lblDespachoEspecialista.setToolTipText(Messages.getString("PrincipalWindow.lblDespachoEspecialista.toolTipText")); //$NON-NLS-1$
		lblDespachoEspecialista.setVisible(false);
		lblDespachoEspecialista.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblDespachoEspecialista = new GridBagConstraints();
		gbc_lblDespachoEspecialista.fill = GridBagConstraints.VERTICAL;
		gbc_lblDespachoEspecialista.anchor = GridBagConstraints.WEST;
		gbc_lblDespachoEspecialista.insets = new Insets(0, 0, 5, 5);
		gbc_lblDespachoEspecialista.gridx = 1;
		gbc_lblDespachoEspecialista.gridy = 7;
		pDatosEspecialista.add(lblDespachoEspecialista, gbc_lblDespachoEspecialista);
		
		lblExtension = new JLabel(Messages.getString("PrincipalWindow.lblExtension.text")); //$NON-NLS-1$
		lblExtension.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblExtension = new GridBagConstraints();
		gbc_lblExtension.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblExtension.insets = new Insets(0, 0, 5, 5);
		gbc_lblExtension.gridx = 0;
		gbc_lblExtension.gridy = 8;
		pDatosEspecialista.add(lblExtension, gbc_lblExtension);
		
		lblExtensionEspecialista = new JLabel(Messages.getString("PrincipalWindow.lblExtensionEspecialista.text")); //$NON-NLS-1$
		lblExtensionEspecialista.setToolTipText(Messages.getString("PrincipalWindow.lblExtensionEspecialista.toolTipText")); //$NON-NLS-1$
		lblExtensionEspecialista.setVisible(false);
		lblExtensionEspecialista.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblExtensionEspecialista = new GridBagConstraints();
		gbc_lblExtensionEspecialista.fill = GridBagConstraints.VERTICAL;
		gbc_lblExtensionEspecialista.anchor = GridBagConstraints.WEST;
		gbc_lblExtensionEspecialista.insets = new Insets(0, 0, 5, 5);
		gbc_lblExtensionEspecialista.gridx = 0;
		gbc_lblExtensionEspecialista.gridy = 9;
		pDatosEspecialista.add(lblExtensionEspecialista, gbc_lblExtensionEspecialista);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setPreferredSize(new Dimension(300,1));
		GridBagConstraints gbc_separator_5 = new GridBagConstraints();
		gbc_separator_5.gridheight = 2;
		gbc_separator_5.gridwidth = 4;
		gbc_separator_5.insets = new Insets(0, 0, 5, 0);
		gbc_separator_5.gridx = 0;
		gbc_separator_5.gridy = 10;
		pDatosEspecialista.add(separator_5, gbc_separator_5);
		
		lblCodigoPostal_3 = new JLabel(Messages.getString("PrincipalWindow.lblCodigoPostal_3.text")); //$NON-NLS-1$
		lblCodigoPostal_3.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblCodigoPostal_3 = new GridBagConstraints();
		gbc_lblCodigoPostal_3.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblCodigoPostal_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigoPostal_3.gridx = 0;
		gbc_lblCodigoPostal_3.gridy = 12;
		pDatosEspecialista.add(lblCodigoPostal_3, gbc_lblCodigoPostal_3);
		
		lblLocalidad_2 = new JLabel(Messages.getString("PrincipalWindow.lblLocalidad_2.text")); //$NON-NLS-1$
		lblLocalidad_2.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblLocalidad_2 = new GridBagConstraints();
		gbc_lblLocalidad_2.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblLocalidad_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocalidad_2.gridx = 1;
		gbc_lblLocalidad_2.gridy = 12;
		pDatosEspecialista.add(lblLocalidad_2, gbc_lblLocalidad_2);
		
		lblCodigoPostalEspecialista = new JLabel(Messages.getString("PrincipalWindow.lblCodigoPostalEspecialista.text")); //$NON-NLS-1$
		lblCodigoPostalEspecialista.setToolTipText(Messages.getString("PrincipalWindow.lblCodigoPostalEspecialista.toolTipText")); //$NON-NLS-1$
		lblCodigoPostalEspecialista.setVisible(false);
		lblCodigoPostalEspecialista.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblCodigoPostalEspecialista = new GridBagConstraints();
		gbc_lblCodigoPostalEspecialista.fill = GridBagConstraints.VERTICAL;
		gbc_lblCodigoPostalEspecialista.anchor = GridBagConstraints.WEST;
		gbc_lblCodigoPostalEspecialista.insets = new Insets(0, 0, 5, 5);
		gbc_lblCodigoPostalEspecialista.gridx = 0;
		gbc_lblCodigoPostalEspecialista.gridy = 13;
		pDatosEspecialista.add(lblCodigoPostalEspecialista, gbc_lblCodigoPostalEspecialista);
		
		lblLocalidadEspecialista = new JLabel(Messages.getString("PrincipalWindow.lblLocalidadEspecialista.text")); //$NON-NLS-1$
		lblLocalidadEspecialista.setToolTipText(Messages.getString("PrincipalWindow.lblLocalidadEspecialista.toolTipText")); //$NON-NLS-1$
		lblLocalidadEspecialista.setVisible(false);
		lblLocalidadEspecialista.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblLocalidadEspecialista = new GridBagConstraints();
		gbc_lblLocalidadEspecialista.fill = GridBagConstraints.VERTICAL;
		gbc_lblLocalidadEspecialista.anchor = GridBagConstraints.WEST;
		gbc_lblLocalidadEspecialista.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocalidadEspecialista.gridx = 1;
		gbc_lblLocalidadEspecialista.gridy = 13;
		pDatosEspecialista.add(lblLocalidadEspecialista, gbc_lblLocalidadEspecialista);
		
		lblProvincia_3 = new JLabel(Messages.getString("PrincipalWindow.lblProvincia_3.text")); //$NON-NLS-1$
		lblProvincia_3.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblProvincia_3 = new GridBagConstraints();
		gbc_lblProvincia_3.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblProvincia_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvincia_3.gridx = 0;
		gbc_lblProvincia_3.gridy = 14;
		pDatosEspecialista.add(lblProvincia_3, gbc_lblProvincia_3);
		
		lblCalle_2 = new JLabel(Messages.getString("PrincipalWindow.lblCalle_2.text")); //$NON-NLS-1$
		lblCalle_2.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblCalle_2 = new GridBagConstraints();
		gbc_lblCalle_2.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblCalle_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblCalle_2.gridx = 1;
		gbc_lblCalle_2.gridy = 14;
		pDatosEspecialista.add(lblCalle_2, gbc_lblCalle_2);
		
		lblProvinciaEspecialista = new JLabel(Messages.getString("PrincipalWindow.lblProvinciaEspecialista.text")); //$NON-NLS-1$
		lblProvinciaEspecialista.setToolTipText(Messages.getString("PrincipalWindow.lblProvinciaEspecialista.toolTipText")); //$NON-NLS-1$
		lblProvinciaEspecialista.setVisible(false);
		lblProvinciaEspecialista.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblProvinciaEspecialista = new GridBagConstraints();
		gbc_lblProvinciaEspecialista.fill = GridBagConstraints.VERTICAL;
		gbc_lblProvinciaEspecialista.anchor = GridBagConstraints.WEST;
		gbc_lblProvinciaEspecialista.insets = new Insets(0, 0, 5, 5);
		gbc_lblProvinciaEspecialista.gridx = 0;
		gbc_lblProvinciaEspecialista.gridy = 15;
		pDatosEspecialista.add(lblProvinciaEspecialista, gbc_lblProvinciaEspecialista);
		
		lblCalleEspecialista = new JLabel(Messages.getString("PrincipalWindow.lblCalleEspecialista.text")); //$NON-NLS-1$
		lblCalleEspecialista.setToolTipText(Messages.getString("PrincipalWindow.lblCalleEspecialista.toolTipText")); //$NON-NLS-1$
		lblCalleEspecialista.setVisible(false);
		lblCalleEspecialista.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblCalleEspecialista = new GridBagConstraints();
		gbc_lblCalleEspecialista.fill = GridBagConstraints.VERTICAL;
		gbc_lblCalleEspecialista.anchor = GridBagConstraints.WEST;
		gbc_lblCalleEspecialista.insets = new Insets(0, 0, 5, 5);
		gbc_lblCalleEspecialista.gridx = 1;
		gbc_lblCalleEspecialista.gridy = 15;
		pDatosEspecialista.add(lblCalleEspecialista, gbc_lblCalleEspecialista);
		
		lblNumero_3 = new JLabel(Messages.getString("PrincipalWindow.lblNumero_3.text")); //$NON-NLS-1$
		lblNumero_3.setToolTipText(""); //$NON-NLS-1$
		GridBagConstraints gbc_lblNumero_3 = new GridBagConstraints();
		gbc_lblNumero_3.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblNumero_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumero_3.gridx = 0;
		gbc_lblNumero_3.gridy = 16;
		pDatosEspecialista.add(lblNumero_3, gbc_lblNumero_3);
		
		lblNumeroEspecialista = new JLabel(Messages.getString("PrincipalWindow.lblNumeroEspecialista.text")); //$NON-NLS-1$
		lblNumeroEspecialista.setToolTipText(Messages.getString("PrincipalWindow.lblNumeroEspecialista.toolTipText")); //$NON-NLS-1$
		lblNumeroEspecialista.setBackground(Color.WHITE);
		lblNumeroEspecialista.setVisible(false);
		lblNumeroEspecialista.setOpaque(true);
		lblNumeroEspecialista.setBorder(new LineBorder(Color.LIGHT_GRAY));
		GridBagConstraints gbc_lblNumeroEspecialista = new GridBagConstraints();
		gbc_lblNumeroEspecialista.fill = GridBagConstraints.VERTICAL;
		gbc_lblNumeroEspecialista.anchor = GridBagConstraints.WEST;
		gbc_lblNumeroEspecialista.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroEspecialista.gridx = 0;
		gbc_lblNumeroEspecialista.gridy = 17;
		pDatosEspecialista.add(lblNumeroEspecialista, gbc_lblNumeroEspecialista);
		
		JButton btnContactar = new JButton(Messages.getString("PrincipalWindow.btnContactar.text")); //$NON-NLS-1$
		btnContactar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (!listEspecialistas.isSelectionEmpty()){
						new ContactEspecialist(listEspecialistas.getSelectedValue());	
					
				} else {
					JOptionPane.showMessageDialog(frmAdministracinHospital, Messages.getString("PrincipalWindow.163"), "ERROR", //$NON-NLS-1$ //$NON-NLS-2$
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnContactar.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/27630.png"))); //$NON-NLS-1$
		btnContactar.setToolTipText(Messages.getString("PrincipalWindow.btnContactar.toolTipText")); //$NON-NLS-1$
		btnContactar.setFocusable(false);
		btnContactar.setBorderPainted(false);
		btnContactar.setContentAreaFilled(false);
		GridBagConstraints gbc_btnContactar = new GridBagConstraints();
		gbc_btnContactar.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnContactar.gridx = 3;
		gbc_btnContactar.gridy = 18;
		pDatosEspecialista.add(btnContactar, gbc_btnContactar);
		
		menuBar = new JMenuBar();
		frmAdministracinHospital.setJMenuBar(menuBar);
		
		mnArchivo = new JMenu(Messages.getString("PrincipalWindow.mnArchivo.text")); //$NON-NLS-1$
		menuBar.add(mnArchivo);
		
		JMenuItem mntmSalir = new JMenuItem(Messages.getString("PrincipalWindow.mntmSalir.text")); //$NON-NLS-1$
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int salir = JOptionPane.showConfirmDialog(null, Messages.getString("PrincipalWindow.166"), Messages.getString("PrincipalWindow.167"), //$NON-NLS-1$ //$NON-NLS-2$
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if (salir == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		mntmSalir.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/cerrrar.png"))); //$NON-NLS-1$
		mnArchivo.add(mntmSalir);
		
		JMenu mnAyuda = new JMenu(Messages.getString("PrincipalWindow.mnAyuda.text")); //$NON-NLS-1$
		menuBar.add(mnAyuda);
		
		JMenu mnPreferencias = new JMenu(Messages.getString("PrincipalWindow.mnPreferencias.text")); //$NON-NLS-1$
		mnPreferencias.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/System-Preferences.png"))); //$NON-NLS-1$
		mnAyuda.add(mnPreferencias);
		
		JMenu mnIdioma = new JMenu(Messages.getString("PrincipalWindow.mnIdioma.text")); //$NON-NLS-1$
		mnPreferencias.add(mnIdioma);
		mnIdioma.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/idioma.png"))); //$NON-NLS-1$
		
		rdbtnmntmEspaol = new JRadioButtonMenuItem(Messages.getString("PrincipalWindow.rdbtnmntmEspaol.text")); //$NON-NLS-1$
		rdbtnmntmEspaol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Messages.setIdioma("español"); //$NON-NLS-1$
				idioma = rdbtnmntmEspaol;
				PrincipalWindow l = new PrincipalWindow(idioma, fuente);
				l.setEspanol();
				rdbtnmntmEspaol.setSelected(true);
				frmAdministracinHospital.dispose();
			}
		});
		buttonGroup_1.add(rdbtnmntmEspaol);
		rdbtnmntmEspaol.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/spanish.png"))); //$NON-NLS-1$
		mnIdioma.add(rdbtnmntmEspaol);
		
		rdbtnmntmIngls = new JRadioButtonMenuItem(Messages.getString("PrincipalWindow.rdbtnmntmIngls.text")); //$NON-NLS-1$
		rdbtnmntmIngls.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Messages.setIdioma("inglés"); //$NON-NLS-1$
				 PrincipalWindow l = new PrincipalWindow(idioma, fuente);
				 l.setIngles();
				 rdbtnmntmIngls.setSelected(true);
				frmAdministracinHospital.dispose();
			}
		});
		buttonGroup_1.add(rdbtnmntmIngls);
		rdbtnmntmIngls.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/english.png"))); //$NON-NLS-1$
		mnIdioma.add(rdbtnmntmIngls);
		
		JMenu mnTamanoFuente = new JMenu(Messages.getString("PrincipalWindow.mnTamanoFuente.text")); //$NON-NLS-1$
		mnPreferencias.add(mnTamanoFuente);
		mnTamanoFuente.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/font.png"))); //$NON-NLS-1$
		
		rdbtnmntmPequeo = new JRadioButtonMenuItem(Messages.getString("PrincipalWindow.rdbtnmntmPequeo.text")); //$NON-NLS-1$
		rdbtnmntmPequeo.addActionListener(new MiPequenaActionListener());
		rdbtnmntmPequeo.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/fontpeque.png"))); //$NON-NLS-1$
		buttonGroup.add(rdbtnmntmPequeo);
		mnTamanoFuente.add(rdbtnmntmPequeo);
		
		rdbtnmntmMediano = new JRadioButtonMenuItem(Messages.getString("PrincipalWindow.rdbtnmntmMediano.text")); //$NON-NLS-1$
		rdbtnmntmMediano.addActionListener(new MiNormalActionListener());
		rdbtnmntmMediano.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/fontnormal.png"))); //$NON-NLS-1$
		buttonGroup.add(rdbtnmntmMediano);
		mnTamanoFuente.add(rdbtnmntmMediano);
		
		rdbtnmntmGrande = new JRadioButtonMenuItem(Messages.getString("PrincipalWindow.rdbtnmntmGrande.text")); //$NON-NLS-1$
		rdbtnmntmGrande.addActionListener(new MiGrandeActionListener());
		rdbtnmntmGrande.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/fontbig.png"))); //$NON-NLS-1$
		buttonGroup.add(rdbtnmntmGrande);
		mnTamanoFuente.add(rdbtnmntmGrande);
		
		if (fuente.getText().equals("Pequeño")){ //$NON-NLS-1$
			rdbtnmntmPequeo.setSelected(true);
		} else if (fuente.getText().equals("Mediano")){ //$NON-NLS-1$
			rdbtnmntmMediano.setSelected(true);
		} else if (fuente.getText().equals("Grande")){ //$NON-NLS-1$
			rdbtnmntmGrande.setSelected(true);
		}
		
		if (idioma.getText().equals("Español")){ //$NON-NLS-1$
			rdbtnmntmEspaol.setSelected(true);
		}
		else {
			rdbtnmntmIngls.setSelected(true);
		}
		
		JSeparator separator_6 = new JSeparator();
		mnAyuda.add(separator_6);
		
		JMenuItem mntmAcercaDe = new JMenuItem(Messages.getString("PrincipalWindow.mntmAcercaDe.text")); //$NON-NLS-1$
		mntmAcercaDe.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/information-icon.png"))); //$NON-NLS-1$
		mntmAcercaDe.addActionListener(new AcercadeListener());
		mnAyuda.add(mntmAcercaDe);
		
		JMenu menuHelp = new JMenu(Messages.getString("PrincipalWindow.menuHelp.text")); //$NON-NLS-1$

	    Component horizontalGlue = Box.createHorizontalGlue();
	    horizontalGlue.setMaximumSize(new Dimension(11897, 0));
	    menuBar.add(horizontalGlue);
		
		JMenu mnUlises = new JMenu(Messages.getString("PrincipalWindow.mnUlises.text")); //$NON-NLS-1$
		menuBar.add(mnUlises);
		
		JMenuItem mntmCerrarSesion = new JMenuItem(Messages.getString("PrincipalWindow.mntmCerrarSesion.text")); //$NON-NLS-1$
		mntmCerrarSesion.addActionListener(new BtnLogoutlistener());
		mntmCerrarSesion.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/logout.png"))); //$NON-NLS-1$
		mnUlises.add(mntmCerrarSesion);
		menuBar.add(menuHelp);
		
		JMenuItem mntmAyudaVentana = new JMenuItem(Messages.getString("PrincipalWindow.mntmAyudaVentana.text")); //$NON-NLS-1$
		mntmAyudaVentana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Help(tabbedPane.getTitleAt(tabbedPane.getSelectedIndex()));
			}
		});
		mntmAyudaVentana.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/info-flat.png"))); //$NON-NLS-1$
		menuHelp.add(mntmAyudaVentana);
		 ftxtNombre.addFocusListener(new MiFocusListener());
		 ftxtApellidos.addFocusListener(new MiFocusListener());
		 ftxtEdad.addFocusListener(new MiFocusListener());
		 cbSexo.addFocusListener(new MiFocusListener());
		 ftxtTelefono.addFocusListener(new MiFocusListener());
		 ftxtMovil.addFocusListener(new MiFocusListener());
		 ftxtCodigoPostal.addFocusListener(new MiFocusListener());
		 ftxtLocalidad.addFocusListener(new MiFocusListener());
		 ftxtProvincia.addFocusListener(new MiFocusListener());
		 ftxtCalle.addFocusListener(new MiFocusListener());
		 ftxtNumero.addFocusListener(new MiFocusListener());
		 ftxtEmail.addFocusListener(new MiFocusListener());
		 txtaAntecedentes.addFocusListener(new MiFocusListener());
		 txtaTratamiento.addFocusListener(new MiFocusListener());
	}
	
	private void setBlankFields(){
		ftxtNombre.setValue(""); //$NON-NLS-1$
		ftxtApellidos.setValue(""); //$NON-NLS-1$
		ftxtEdad.setValue(""); //$NON-NLS-1$
		ftxtTelefono.setValue(""); //$NON-NLS-1$
		ftxtMovil.setValue(""); //$NON-NLS-1$
		ftxtEmail.setValue(""); //$NON-NLS-1$
		ftxtCodigoPostal.setValue(""); //$NON-NLS-1$
		ftxtLocalidad.setValue(""); //$NON-NLS-1$
		ftxtProvincia.setValue(""); //$NON-NLS-1$
		ftxtCalle.setValue(""); //$NON-NLS-1$
		ftxtNumero.setValue(""); //$NON-NLS-1$
		cbSexo.setSelectedItem(""); //$NON-NLS-1$
		ftxtNombre.setValue(""); //$NON-NLS-1$
		ftxtApellidos.setValue(""); //$NON-NLS-1$
		txtaAntecedentes.setText(""); //$NON-NLS-1$
		txtaTratamiento.setText(""); //$NON-NLS-1$
		btnImagen.setText(Messages.getString("PrincipalWindow.200")); //$NON-NLS-1$
		btnImagen_1.setText(Messages.getString("PrincipalWindow.201")); //$NON-NLS-1$
	}
	
	private void setCitasInfo(Patient patient){
		lblHoraCita.setVisible(true);
		lblNombrePacienteCita.setVisible(true);
		lblApellidosPacienteCita.setVisible(true);
		lblHoraCita.setText(patient.getAppointment().getTime());
		lblNombrePacienteCita.setText(patient.getName());
		lblApellidosPacienteCita.setText(patient.getSurname());
		Image image = Toolkit.getDefaultToolkit().getImage(patient.getPicturePath());
		Image scaledImg = image.getScaledInstance(200, 200, Image.SCALE_DEFAULT);	
		if(PrincipalWindow.class.getResource(patient.getPicturePath()) == null){
			lblFotoPaciente.setIcon(new ImageIcon(scaledImg));	
		} else {
			lblFotoPaciente.setIcon(new ImageIcon(PrincipalWindow.class.getResource(patient.getPicturePath())));	
		}
		
	}
	
	private void hideNewEdit(){
		btnAnadirPaciente.setVisible(true);
		btnEditarPaciente.setVisible(true);
		btnBorrarPaciente.setVisible(true);
		btnAnadirPaciente.setEnabled(true);
		btnEditarPaciente.setEnabled(true);
		btnBorrarPaciente.setEnabled(true);
		txtaAntecedentes.setEditable(false);
		txtaTratamiento.setEditable(false);
		txtaAntecedentes.setFocusable(false);
		txtaTratamiento.setFocusable(false);
		btnExaminar.setEnabled(false);
		btnExaminar.setVisible(false);
		btnAceptar.setVisible(false);
		btnAceptar.setEnabled(false);
		btnCancelar.setVisible(false);
		btnCancelar.setEnabled(false);
		ftxtNombre.setFocusable(false);
		ftxtApellidos.setFocusable(false);
		ftxtEdad.setFocusable(false);
		ftxtTelefono.setFocusable(false);
		ftxtMovil.setFocusable(false);
		ftxtEmail.setFocusable(false);
		ftxtCodigoPostal.setFocusable(false);
		ftxtLocalidad.setFocusable(false);
		ftxtProvincia.setFocusable(false);
		ftxtCalle.setFocusable(false);
		ftxtNumero.setFocusable(false);
		cbSexo.setFocusable(false);
		ftxtNombre.setEditable(false);
		ftxtApellidos.setEditable(false);
		ftxtEdad.setEditable(false);
		ftxtTelefono.setEditable(false);
		ftxtMovil.setEditable(false);
		ftxtEmail.setEditable(false);
		ftxtCodigoPostal.setEditable(false);
		ftxtLocalidad.setEditable(false);
		ftxtProvincia.setEditable(false);
		ftxtCalle.setEditable(false);
		ftxtNumero.setEditable(false);
		cbSexo.setEditable(false);
		cbSexo.setEnabled(false);
	}
	
	private void showNewEdit(){
		ftxtNombre.setEditable(true);
		ftxtApellidos.setEditable(true);
		ftxtEdad.setEditable(true);
		ftxtTelefono.setEditable(true);
		ftxtMovil.setEditable(true);
		ftxtEmail.setEditable(true);
		txtaAntecedentes.setEditable(true);
		txtaTratamiento.setEditable(true);
		txtaAntecedentes.setFocusable(true);
		txtaTratamiento.setFocusable(true);
		ftxtCodigoPostal.setEditable(true);
		ftxtLocalidad.setEditable(true);
		ftxtProvincia.setEditable(true);
		ftxtCalle.setEditable(true);
		ftxtNumero.setEditable(true);
		cbSexo.setEnabled(true);
		ftxtNombre.setFocusable(true);
		ftxtApellidos.setFocusable(true);
		ftxtEdad.setFocusable(true);
		ftxtTelefono.setFocusable(true);
		ftxtMovil.setFocusable(true);
		ftxtEmail.setFocusable(true);
		ftxtCodigoPostal.setFocusable(true);
		ftxtLocalidad.setFocusable(true);
		ftxtProvincia.setFocusable(true);
		ftxtCalle.setFocusable(true);
		ftxtNumero.setFocusable(true);
		cbSexo.setFocusable(true);
		ftxtNombre.requestFocus();
		btnAnadirPaciente.setVisible(false);
		btnEditarPaciente.setVisible(false);
		btnBorrarPaciente.setVisible(false);
		btnAnadirPaciente.setEnabled(false);
		btnExaminar.setVisible(true);
		btnExaminar.setEnabled(true);
		btnAceptar.setVisible(true);
		btnAceptar.setEnabled(true);
		btnCancelar.setVisible(true);
		btnCancelar.setEnabled(true);
		btnEditarPaciente.setEnabled(false);
		btnBorrarPaciente.setEnabled(false);
		
	}
	
	private void setEspecialistasInfo(Specialist specialist){
		lblNombreEspecialista.setVisible(true);
		lblApellidosEspecialista.setVisible(true);
		lblEspecialidadEspecialista.setVisible(true);
		lblPlantaEspecialista.setVisible(true);
		lblDespachoEspecialista.setVisible(true);
		lblExtensionEspecialista.setVisible(true);
		lblLocalidadEspecialista.setVisible(true);
		lblCodigoPostalEspecialista.setVisible(true);
		lblProvinciaEspecialista.setVisible(true);
		lblCalleEspecialista.setVisible(true);
		lblNumeroEspecialista.setVisible(true);
		lblNombreEspecialista.setText(specialist.getName());
		lblApellidosEspecialista.setText(specialist.getSurname());
		lblEspecialidadEspecialista.setText(specialist.getField());
		lblPlantaEspecialista.setText(specialist.getOfficeFloor());
		lblDespachoEspecialista.setText(specialist.getOfficeNumber());
		lblExtensionEspecialista.setText(specialist.getPhoneAndExtension());
		lblLocalidadEspecialista.setText(specialist.getTown());
		lblCodigoPostalEspecialista.setText(specialist.getZipCode());
		lblProvinciaEspecialista.setText(specialist.getProvince());
		lblCalleEspecialista.setText(specialist.getStreet());
		lblNumeroEspecialista.setText(specialist.getHouseNumber());
		lblFotoEspecialista.setIcon(new ImageIcon(PrincipalWindow.class.getResource(specialist.getPicturePath())));
		
	}
	
	private void setPacientesInfo(Patient patient){
		ftxtNombre.setText(patient.getName());
		ftxtApellidos.setText(patient.getSurname());
		ftxtEdad.setText(patient.getAge());
		ftxtTelefono.setText(patient.getPhoneNumber());
		ftxtMovil.setText(patient.getMobilePhone());
		ftxtEmail.setText(patient.getEmail());
		ftxtCodigoPostal.setText(patient.getZipCode());
		ftxtLocalidad.setText(patient.getTown());
		ftxtProvincia.setText(patient.getProvince());
		ftxtCalle.setText(patient.getStreet());
		ftxtNumero.setText(patient.getHouseNumber());
		cbSexo.setSelectedItem(patient.getGenre());
		txtaAntecedentes.setText(patient.getAntecedentes());
		txtaTratamiento.setText(patient.getTratamiento());
		if (!patient.getImage1().getName().equals("")){ //$NON-NLS-1$
			btnImagen.setText(patient.getImage1().getName());
		} else {
			btnImagen.setText(Messages.getString("PrincipalWindow.203")); //$NON-NLS-1$
		}
		if (!patient.getImage2().getName().equals("")){ //$NON-NLS-1$
			btnImagen_1.setText(patient.getImage2().getName());
		} else {
			btnImagen_1.setText(Messages.getString("PrincipalWindow.205")); //$NON-NLS-1$
		}
		if (PrincipalWindow.class.getResource(patient.getPicturePath()) != null){
			lblFotoPaciente_1.setIcon(new ImageIcon(PrincipalWindow.class.getResource(patient.getPicturePath())));
			
		} else {
			Image image = Toolkit.getDefaultToolkit().getImage(patient.getPicturePath());
			Image scaledImg = image.getScaledInstance(200, 200, Image.SCALE_DEFAULT);	
			lblFotoPaciente_1.setIcon(new ImageIcon(scaledImg));
			
		}
		
	}
	
	private void setNeededField(){
		lblNombre_2.setText(Messages.getString("PrincipalWindow.206")); //$NON-NLS-1$
		lblApellidos_2.setText(Messages.getString("PrincipalWindow.207")); //$NON-NLS-1$
		lblEdad.setText(Messages.getString("PrincipalWindow.208")); //$NON-NLS-1$
		lblSexo.setText(Messages.getString("PrincipalWindow.209")); //$NON-NLS-1$
		lblTelefono_2.setText(Messages.getString("PrincipalWindow.210")); //$NON-NLS-1$
		lblMovil_1.setText(Messages.getString("PrincipalWindow.211")); //$NON-NLS-1$
		lblEmail_1.setText(Messages.getString("PrincipalWindow.212")); //$NON-NLS-1$
		lblCodigoPostal_2.setText(Messages.getString("PrincipalWindow.213")); //$NON-NLS-1$
		lblLocalidad_1.setText(Messages.getString("PrincipalWindow.214")); //$NON-NLS-1$
		lblProvincia_1.setText(Messages.getString("PrincipalWindow.215")); //$NON-NLS-1$
		lblCalle_1.setText(Messages.getString("PrincipalWindow.216")); //$NON-NLS-1$
		lblNumero_1.setText(Messages.getString("PrincipalWindow.217")); //$NON-NLS-1$
		lblAntecedentes.setText(Messages.getString("PrincipalWindow.218")); //$NON-NLS-1$
		lblTratamiento.setText(Messages.getString("PrincipalWindow.219")); //$NON-NLS-1$
		
	}
	
	private void unsetNeededField(){
		lblNombre_2.setText(Messages.getString("PrincipalWindow.220")); //$NON-NLS-1$
		lblApellidos_2.setText(Messages.getString("PrincipalWindow.221")); //$NON-NLS-1$
		lblEdad.setText(Messages.getString("PrincipalWindow.222")); //$NON-NLS-1$
		lblSexo.setText(Messages.getString("PrincipalWindow.223")); //$NON-NLS-1$
		lblTelefono_2.setText(Messages.getString("PrincipalWindow.224")); //$NON-NLS-1$
		lblMovil_1.setText(Messages.getString("PrincipalWindow.225")); //$NON-NLS-1$
		lblEmail_1.setText(Messages.getString("PrincipalWindow.226")); //$NON-NLS-1$
		lblCodigoPostal_2.setText(Messages.getString("PrincipalWindow.227")); //$NON-NLS-1$
		lblLocalidad_1.setText(Messages.getString("PrincipalWindow.228")); //$NON-NLS-1$
		lblProvincia_1.setText(Messages.getString("PrincipalWindow.229")); //$NON-NLS-1$
		lblCalle_1.setText(Messages.getString("PrincipalWindow.230")); //$NON-NLS-1$
		lblNumero_1.setText(Messages.getString("PrincipalWindow.231")); //$NON-NLS-1$
		lblAntecedentes.setText(Messages.getString("PrincipalWindow.232")); //$NON-NLS-1$
		lblTratamiento.setText(Messages.getString("PrincipalWindow.233")); //$NON-NLS-1$
		
	}
	
	private void btnCargarImagen(ImagenMedica imagen, JButton boton){

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
					imagen.setImagePath(file.getAbsolutePath());
					new ImageInfo(imagen, boton);

				} catch (IOException ex) {
					System.out.println(ex.getStackTrace());
				}
			}
		}
	
	public void setEspanol(){
		rdbtnmntmEspaol.setSelected(true);
	}
	
	public void setIngles(){
		rdbtnmntmIngls.setSelected(true);
	}
	
	
	private void hidePacientesInfo(){
		lblFotoPaciente_1.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/27705-200.png"))); //$NON-NLS-1$
	}
	
	public JList getPacientesList(){
		return this.listPacientes;
	}
	
	public void refreshPacients(){
		listPacientes.repaint();
		setPacientesInfo(currentPatient);
	}
	
	private class AcercadeListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(frmAdministracinHospital, Messages.getString("PrincipalWindow.237"), Messages.getString("PrincipalWindow.238"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
	
	private class BtnLogoutlistener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int salir = JOptionPane.showConfirmDialog(null, Messages.getString("PrincipalWindow.239"), Messages.getString("PrincipalWindow.240"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

			if (salir == JOptionPane.YES_OPTION) {
				new Login(fuente, idioma);
				frmAdministracinHospital.dispose();
				
			}
		}
	}
	
	private class FrameWindowListener extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent arg0) {
			if (!done){
				int salir = JOptionPane.showConfirmDialog(null, Messages.getString("PrincipalWindow.241"), Messages.getString("PrincipalWindow.242"), //$NON-NLS-1$ //$NON-NLS-2$
						JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				
				if (salir == JOptionPane.YES_OPTION) {
					System.exit(0);
					
				}
			
			} else if(done){
				int salir = JOptionPane.showConfirmDialog(null, Messages.getString("PrincipalWindow.243"), Messages.getString("PrincipalWindow.244"), //$NON-NLS-1$ //$NON-NLS-2$
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if (salir == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
			
		}
	}
	
	private class MiPequenaActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Font f = new FontUIResource(frmAdministracinHospital.getFont().getFontName(), frmAdministracinHospital.getFont().getStyle(), 10);
	        UIManager.put(Messages.getString("PrincipalWindow.245"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.246"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.247"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.248"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.249"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.250"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.251"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.252"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.253"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.254"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.255"), f); //$NON-NLS-1$
	        SwingUtilities.updateComponentTreeUI(frmAdministracinHospital);
			
		}
	}

	private class MiNormalActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Font f = new FontUIResource(frmAdministracinHospital.getFont().getFontName(), frmAdministracinHospital.getFont().getStyle(), 13);
	        UIManager.put(Messages.getString("PrincipalWindow.256"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.257"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.258"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.259"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.260"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.261"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.262"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.263"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.264"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.265"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.266"), f); //$NON-NLS-1$
	        SwingUtilities.updateComponentTreeUI(frmAdministracinHospital);
		}
	}

	private class MiGrandeActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Font f = new FontUIResource(frmAdministracinHospital.getFont().getFontName(), frmAdministracinHospital.getFont().getStyle(), 15);
	        UIManager.put(Messages.getString("PrincipalWindow.267"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.268"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.269"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.270"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.271"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.272"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.273"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.274"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.275"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.276"), f); //$NON-NLS-1$
	        UIManager.put(Messages.getString("PrincipalWindow.277"), f); //$NON-NLS-1$
	        SwingUtilities.updateComponentTreeUI(frmAdministracinHospital);
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
			FileNameExtensionFilter filtro = new FileNameExtensionFilter(Messages.getString("PrincipalWindow.278"), Messages.getString("PrincipalWindow.279")); //$NON-NLS-1$ //$NON-NLS-2$
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
					lblFotoPaciente_1.setIcon(new ImageIcon((scaledImg)));
					previouspic = currentPatient.getPicturePath();
					currentPatient.setPicturePath(file.getAbsolutePath().toString());

				} catch (IOException ex) {
					System.out.println(ex.getStackTrace());
				}
			}
		}
	}
	
private class NewAndSave implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			if (mode.equals(Messages.getString("PrincipalWindow.280"))){ //$NON-NLS-1$
				if (ftxtNombre.getText().length() != 0 && ftxtApellidos.getText().length() != 0 && !ftxtTelefono.getText().equals("XXXXXXXXX") &&
							!ftxtCodigoPostal.getText().equals("XXXXX") && ftxtLocalidad.getText().length() != 0 &&
							ftxtProvincia.getText().length() != 0 && ftxtCalle.getText().length() != 0 && !ftxtNumero.getText().equals("XX") &&
							Messages.getString("PrincipalWindow.281").length() != 0 && !ftxtMovil.getText().equals("XXXXXXXXX") && !ftxtEmail.getText().equals("xxxxxxx@gmail.com") && //$NON-NLS-1$
							!ftxtEdad.getText().equals("XX") && !cbSexo.getSelectedItem().equals("") && //$NON-NLS-1$
							txtaAntecedentes.getDocument().getLength() != 0 && txtaTratamiento.getDocument().getLength() != 0){
					currentPatient.setName(ftxtNombre.getText());
					currentPatient.setSurname(ftxtApellidos.getText());
					currentPatient.setAge(ftxtEdad.getText());
					currentPatient.setGenre(cbSexo.getSelectedItem().toString());
					currentPatient.setPhoneNumber(ftxtTelefono.getText());
					currentPatient.setMobilePhone(ftxtMovil.getText());
					currentPatient.setZipCode(ftxtCodigoPostal.getText());
					currentPatient.setTown(ftxtLocalidad.getText());
					currentPatient.setProvince(ftxtProvincia.getText());
					currentPatient.setStreet(ftxtCalle.getText());
					currentPatient.setHouseNumber(ftxtNumero.getText());
					currentPatient.setEmail(ftxtEmail.getText());
					currentPatient.setAntecedentes(txtaAntecedentes.getText());
					currentPatient.setTratamiento(txtaTratamiento.getText());
					JOptionPane.showMessageDialog(frmAdministracinHospital, Messages.getString("PrincipalWindow.283"), Messages.getString("PrincipalWindow.284"), //$NON-NLS-1$ //$NON-NLS-2$
							JOptionPane.INFORMATION_MESSAGE);
					refreshPacients();
					lblCheck.setVisible(false);
					unsetNeededField();
					hideNewEdit();
					done = true;
					previouspic = null;
				} else {
					lblCheck.setVisible(true);
					lblCheck.setText("<html><font color='red'>Hay un campo o más obligatorios en blanco, corrija esto</font></html>");
				}
			} else if(mode.equalsIgnoreCase(Messages.getString("PrincipalWindow.286"))){ //$NON-NLS-1$
				if (ftxtNombre.getText().length() != 0 && ftxtApellidos.getText().length() != 0 && !ftxtTelefono.getText().equals("XXXXXXXXX") &&
						!ftxtCodigoPostal.getText().equals("XXXXX") && ftxtLocalidad.getText().length() != 0 &&
						ftxtProvincia.getText().length() != 0 && ftxtCalle.getText().length() != 0 && !ftxtNumero.getText().equals("XX") &&
						"para rellenar".length() != 0 &&  !ftxtMovil.getText().equals("XXXXXXXXX") && !ftxtEmail.getText().equals("xxxxxxx@gmail.com") && //$NON-NLS-1$
						!ftxtEdad.getText().equals("XX") && !cbSexo.getSelectedItem().equals("") && !currentPatient.getPicturePath().equals("") && //$NON-NLS-1$ //$NON-NLS-2$
						txtaAntecedentes.getDocument().getLength() != 0 && txtaTratamiento.getDocument().getLength() != 0){
					
					currentPatient = new Patient(ftxtNombre.getText(), ftxtApellidos.getText(), ftxtTelefono.getText(),
							ftxtCodigoPostal.getText(), ftxtLocalidad.getText(), ftxtProvincia.getText(), 
							ftxtCalle.getText(), ftxtNumero.getText(), currentPatient.getPicturePath(), ftxtMovil.getText(),
							ftxtEmail.getText(), ftxtEdad.getText(), (String) cbSexo.getSelectedItem(), null, false,
							txtaAntecedentes.getText(),txtaTratamiento.getText(), imagen1, imagen2);
					JOptionPane.showMessageDialog(frmAdministracinHospital, Messages.getString("PrincipalWindow.290"), Messages.getString("PrincipalWindow.291"), //$NON-NLS-1$ //$NON-NLS-2$
							JOptionPane.INFORMATION_MESSAGE);
					modelPacientes.addElement(currentPatient);
					done = true;
					unsetNeededField();
					lblCheck.setVisible(false);
					listPacientes.repaint();
					listPacientes.setSelectedValue(currentPatient, true);
					previouspic = null;
					
				} else if (currentPatient.getPicturePath().equals("")){ //$NON-NLS-1$
					lblCheck.setVisible(true);
					lblCheck.setText(Messages.getString("PrincipalWindow.293")); //$NON-NLS-1$
					
				} else {
					lblCheck.setVisible(true);
					lblCheck.setText(Messages.getString("PrincipalWindow.294")); //$NON-NLS-1$
				}
			}
		}
		
		
	}
private class BtnCancelarListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if (!done){
			int salir = JOptionPane.showConfirmDialog(null, Messages.getString("PrincipalWindow.295"), Messages.getString("PrincipalWindow.296"), //$NON-NLS-1$ //$NON-NLS-2$
					JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
			
			if (salir == JOptionPane.YES_OPTION) {
				if (mode.equals(Messages.getString("PrincipalWindow.297"))){ //$NON-NLS-1$
					hideNewEdit();
					unsetNeededField();
					done = true;
					if (previouspic != null){
						currentPatient.setPicturePath(previouspic);
					}
					refreshPacients();
				} else {
					hideNewEdit();
					unsetNeededField();
					done = true;
					setBlankFields();
					lblFotoPaciente.setIcon(new ImageIcon(PrincipalWindow.class.getResource("/presentacion/27705-200.png"))); //$NON-NLS-1$
				}
				
			}
		
		}
	}
}

public class MyDocumentFilter extends DocumentFilter {

    @Override
    public void replace(FilterBypass fb, int i, int i1, String string, AttributeSet as) throws BadLocationException {
        for (int n = string.length(); n > 0; n--) {//an inserted string may be more than a single character i.e a copy and paste of 'aaa123d', also we iterate from the back as super.XX implementation will put last insterted string first and so on thus 'aa123d' would be 'daa', but because we iterate from the back its 'aad' like we want
            char c = string.charAt(n - 1);//get a single character of the string
            if (Character.isAlphabetic(c) || c == ' ') {//if its an alphabetic character or white space
                super.replace(fb, i, i1, String.valueOf(c), as);//allow update to take place for the given character
            }
        }
    }

    @Override
    public void remove(FilterBypass fb, int i, int i1) throws BadLocationException {
        super.remove(fb, i, i1);
    }

    @Override
    public void insertString(FilterBypass fb, int i, String string, AttributeSet as) throws BadLocationException {
        super.insertString(fb, i, string, as);

    }
}
}
