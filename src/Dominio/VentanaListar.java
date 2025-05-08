package Dominio;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class VentanaListar extends JPanel {

	private static final long serialVersionUID = 1L;

	private JList<Pelicula> jList;
	private DefaultListModel<Pelicula> listModel;
	
	
	public VentanaListar() {
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Peliculas");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(22, 124, 66, 29);
		add(lblNewLabel);
		
		
		//JList list = new JList();
		jList = new JList<Pelicula>();
		jList.setBounds(87, 37, 336, 236);
		add(jList);
		
		
	}
	
	private void ordenarPorNombre() {
        List<Pelicula> listaOrdenada = new ArrayList<>();
       
        for(int i = 0; i < listModel.getSize(); i++) {
            listaOrdenada.add(listModel.getElementAt(i));
        }
        
        Collections.sort(listaOrdenada);
        
        listModel.clear();
        for (Pelicula pelicula : listaOrdenada) {
            listModel.addElement(pelicula);
        }
    }

	
        public void setDefaultListModel(DefaultListModel<Pelicula> listModel2)
        {
            this.listModel = listModel2;
            ordenarPorNombre();
            jList.setModel(this.listModel);
        }
	
}
