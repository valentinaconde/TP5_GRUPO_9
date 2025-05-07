package Dominio;


import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;

public class VentanaAgregar extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfNombre;
	private JLabel lblID;
    private static int ID=1;
	private JComboBox<String> cbGenero;
	private DefaultListModel<Pelicula> dlModel;
	private Pelicula pelicula;
	private Categoria categoria;
	

	public VentanaAgregar() {
		
		
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(67, 40, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(66, 91, 69, 14);
		add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(184, 90, 125, 20);
		add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGenero.setBounds(67, 136, 46, 14);
		add(lblGenero);
		
		 cbGenero = new JComboBox<String>();
	        cbGenero.setModel(new DefaultComboBoxModel<String>(new String[] {
	            "Seleccione un genero","Terror","Acción", "Suspenso", "Romantica"
	        }));
		
		
		cbGenero.setBounds(184, 132, 125, 22);
		add(cbGenero);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(67, 172, 135, 23);
		btnAceptar.addActionListener(e -> accionAceptar());
		add(btnAceptar);
		
		lblID = new JLabel("");
		lblID.setBounds(184, 42, 46, 14);
		add(lblID);
		lblID.setText("" + ID);
		
		
	}
	
	private void accionAceptar() {
		 String nombre = tfNombre.getText().trim();
		 String generoSeleccionado = (String) cbGenero.getSelectedItem();
		 
		    if (nombre.isEmpty()) {
		        javax.swing.JOptionPane.showMessageDialog(this, "Debe ingresar un nombre.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
		        return;
		    }
		    if (generoSeleccionado.equals("Seleccione un genero")) {
		    	javax.swing.JOptionPane.showMessageDialog(this, "Debe seleccionar un genero", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
		        return;
			}
		    categoria=new Categoria(generoSeleccionado);
		    pelicula= new Pelicula(ID,nombre,categoria);
		    dlModel= new DefaultListModel<Pelicula>();
		    dlModel.addElement(pelicula);
		    
		    ID++;
	        lblID.setText(""+ID);
	        tfNombre.setText("");
	        cbGenero.setSelectedIndex(0); 
	}
}
