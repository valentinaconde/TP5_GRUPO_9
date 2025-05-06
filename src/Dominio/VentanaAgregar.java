package Dominio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;

public class VentanaAgregar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNombre;
	private JLabel lblID;
    private static int ID=1;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaAgregar frame = new VentanaAgregar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaAgregar() {
		setTitle("Programa");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(67, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(66, 91, 69, 14);
		contentPane.add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(184, 90, 125, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGenero.setBounds(67, 136, 46, 14);
		contentPane.add(lblGenero);
		
		JComboBox<?> cbGenero = new JComboBox();
		cbGenero.setBounds(279, 132, 30, 22);
		contentPane.add(cbGenero);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(67, 172, 135, 23);
		btnAceptar.addActionListener(e -> accionAceptar());
		contentPane.add(btnAceptar);
		
		lblID = new JLabel("");
		lblID.setBounds(184, 42, 46, 14);
		contentPane.add(lblID);
		lblID.setText("" + ID);
		
		
	}
	
	private void accionAceptar() {
		 String nombre = tfNombre.getText().trim();

		    if (nombre.isEmpty()) {
		        javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un nombre.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
		        return;
		    }
			ID++;
		lblID.setText(""+ID);
		tfNombre.setText("");
	}
}
