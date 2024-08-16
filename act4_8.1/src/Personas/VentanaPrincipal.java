
package Personas;

 import java.awt.*;
 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import javax.swing.*;
public class VentanaPrincipal  extends JFrame implements 
ActionListener {
    
    private ListaPersonas lista;
    private Container contenedor;
   
    private JLabel nombre, apellidos, telefono, direccion;
    // Campos de ingreso de texto
    private JTextField txtNombre, txtApellidos, txtTelefono, 
   txtDireccion;
    private JButton btnAñadir, btnEliminar, btnBorrarLista; 
    private JList listaNombres;
    private DefaultListModel modelo; 
    private JScrollPane scrollLista;
    
    
    public VentanaPrincipal(){
        lista = new ListaPersonas(); 
        inicio();
        setTitle("Personas");
        setSize(270,350); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); 
       
    }
    
     private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
       
        nombre = new JLabel();
        nombre.setText("Nombre: ");
        nombre.setBounds(25, 20, 135, 23); 
        txtNombre = new JTextField();
        txtNombre.setBounds(105, 20, 135, 23);
        apellidos = new JLabel();
        apellidos.setText("Apellidos: ");
        apellidos.setBounds(25, 50, 135, 23);
        txtApellidos = new JTextField();
        txtApellidos.setBounds(105, 50, 135, 23);
        
        telefono = new JLabel();
        telefono.setText("Teléfono: ");
        telefono.setBounds(25, 80, 135, 23); 
       
        txtTelefono = new JTextField();
        
        txtTelefono.setBounds(105, 80, 135, 23);
        direccion = new JLabel();
        direccion.setText("Dirección: ");
        direccion.setBounds(25, 110, 135, 23); 
        txtDireccion = new JTextField();
        txtDireccion.setBounds(105, 110, 135, 23);
        btnAñadir = new JButton();
        btnAñadir.setText("Añadir");
        btnAñadir.setBounds(85, 150, 80, 23); 
        btnAñadir.addActionListener(this);
        btnEliminar= new JButton();
        btnEliminar.setText("Eliminar");
        btnEliminar.setBounds(25, 280, 80, 23);
        btnEliminar.addActionListener(this);
        btnBorrarLista= new JButton();
        btnBorrarLista.setText("Borrar Lista");
        btnBorrarLista.setBounds(120, 280, 120, 23);
        btnBorrarLista.addActionListener(this);
        
        listaNombres = new JList();
        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel();
        scrollLista = new JScrollPane();
        scrollLista.setBounds(20, 190 ,220, 80);
        scrollLista.setViewportView(listaNombres);
        contenedor.add(nombre);
        contenedor.add(txtNombre);
        contenedor.add(apellidos);
        contenedor.add(txtApellidos);
        contenedor.add(telefono);
        contenedor.add(txtTelefono);
        contenedor.add(direccion);
        contenedor.add(txtDireccion);
        contenedor.add(btnAñadir);
        contenedor.add(btnEliminar);
        contenedor.add(btnBorrarLista);
        contenedor.add(scrollLista);
        }
     
      @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == btnAñadir) {
            añadirPersona();
        }
        if (evento.getSource() == btnEliminar) { 
            eliminarNombre(listaNombres.getSelectedIndex() );
        }
        
        if (evento.getSource() == btnBorrarLista) {
            borrarLista();
        }
    }
   
    private void añadirPersona() {
   
        Persona persona = new Persona(txtNombre.getText(), 
        txtApellidos.getText(), 
        txtTelefono.getText(), txtDireccion.getText());
        lista.añadirPersona(persona);
        String elemento = txtNombre.getText() + "-" + 
        txtApellidos.getText() + 
        "-" + txtTelefono.getText() + "-" + txtDireccion.getText();
        modelo.addElement(elemento); 
        listaNombres.setModel(modelo);
        txtNombre.setText("");
        txtApellidos.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        
    }

    private void eliminarNombre(int indice) {
        if (indice >= 0) {
            modelo.removeElementAt(indice);
            lista.eliminarPersona(indice);

        } 
        
        else { 
            JOptionPane.showMessageDialog(null, "Debe seleccionar un "
                    + "elemento","Error", JOptionPane.ERROR_MESSAGE);
        }
    }  

    private void borrarLista() {
        lista.borrarLista();
        modelo.clear(); 
    }
 }




    
    

