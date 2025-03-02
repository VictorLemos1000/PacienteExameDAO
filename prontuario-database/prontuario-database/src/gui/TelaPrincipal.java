package gui;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import model.Paciente;
import service.PacienteService;

public class TelaPrincipal extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JMenuBar barraMenu;
	private JMenu menuPaciente;
	private JMenu menuExame;
	private JMenuItem menuItemAdicionarPaciente;
	private JMenuItem menuItemAtualizarPaciente;
	private JScrollPane scrollPane;
	private JTable tablePacientes;
	private PacienteService pacService;
	private JTabbedPane tabbed;
	
	
	public TelaPrincipal(PacienteService pacService) {
		this.pacService = pacService;
		setTitle("Ger�ncia de Prontu�rios");
		setSize(480,360);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		barraMenu = new JMenuBar();
		menuPaciente = new JMenu("Paciente");
		barraMenu.add(menuPaciente);
		menuItemAdicionarPaciente = new JMenuItem("Adicionar");
		menuItemAdicionarPaciente.addActionListener(e -> new TelaCadastrarPaciente(pacService, this));
		menuItemAtualizarPaciente = new JMenuItem("Atualizar");
		menuPaciente.add(menuItemAdicionarPaciente);
		menuPaciente.add(menuItemAtualizarPaciente);
		add(barraMenu, BorderLayout.NORTH);
		
		tablePacientes = new JTable();
		scrollPane = new JScrollPane(tablePacientes);
		tabbed = new JTabbedPane();
		tabbed.addTab("Pacientes", scrollPane);
		add(tabbed, BorderLayout.CENTER);
		
		loadTablePaciente();
	}
	
	protected void loadTablePaciente() {
		List<Paciente> itens = pacService.getPacientes();
		System.out.println(itens);
		tablePacientes.setModel(new TabelaPacienteModel(itens));
	}

}
