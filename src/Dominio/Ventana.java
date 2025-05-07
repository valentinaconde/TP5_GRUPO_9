package Dominio;

import java.awt.BorderLayout;
//import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	
	public Ventana() {
		setTitle("Programa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout());
        setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Peliculas");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Agregar");
		mntmNewMenuItem.addActionListener(e -> {
			contentPane.removeAll();
			contentPane.add(new VentanaAgregar(), BorderLayout.CENTER);
			contentPane.revalidate();
			contentPane.repaint();
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Listar");
		mnNewMenu.add(mntmNewMenuItem_1);

	}

}
