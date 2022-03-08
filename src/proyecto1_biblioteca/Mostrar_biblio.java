/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package proyecto1_biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author ruben
 */
public class Mostrar_biblio extends javax.swing.JDialog {

    /**
     * Creates new form Mostrar_biblio
     */
    Libros[] libros;

    public Mostrar_biblio(java.awt.Frame parent, boolean modal, Libros[] libros) {
        super(parent, modal);
        this.libros = libros;

        initComponents();
        mostrar();
    }

    public Libros[] getLibros() {
        return libros;
    }

    public void mostrar() {

        String matriz[][] = new String[libros.length][16];
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                switch (libros[i].getTipo()) {
                    case 0:
                        matriz[i][0] = String.valueOf(i);
                        matriz[i][1] = String.valueOf(libros[i].getTipo());
                        matriz[i][2] = libros[i].getAutor();
                        matriz[i][3] = String.valueOf(libros[i].getAnio_publi());
                        matriz[i][4] = String.valueOf(libros[i].getIsbn());
                        matriz[i][5] = libros[i].getTitulo();
                        matriz[i][6] = String.valueOf(libros[i].getEdicion());
                        matriz[i][7] = "";
                        for (int k = 0; k < libros[i].getClaves().length; k++) {
                            matriz[i][7] += libros[i].getClaves()[k] + ",";
                        }
                        matriz[i][8] = libros[i].getDescripcion();
                        matriz[i][9] = "";
                        for (int k = 0; k < libros[i].getTemas().length; k++) {
                            matriz[i][9] += libros[i].getTemas()[k] + ",";
                        }
                        matriz[i][10] = String.valueOf(libros[i].getCopias());
                        matriz[i][11] = " ";
                        matriz[i][12] = " ";
                        matriz[i][13] = " ";
                        matriz[i][14] = String.valueOf(libros[i].getDisponible());
                        matriz[i][15] = " ";
                        break;
                    case 1:
                        matriz[i][0] = String.valueOf(i);
                        matriz[i][1] = String.valueOf(libros[i].getTipo());
                        matriz[i][2] = libros[i].getAutor();
                        matriz[i][3] = String.valueOf(libros[i].getAnio_publi());
                        matriz[i][4] = " ";
                        matriz[i][5] = libros[i].getTitulo();
                        matriz[i][6] = String.valueOf(libros[i].getEdicion());
                        matriz[i][7] = "";
                        for (int k = 0; k < libros[i].getClaves().length; k++) {
                            matriz[i][7] += libros[i].getClaves()[k] + ",";
                        }
                        matriz[i][8] = libros[i].getDescripcion();
                        matriz[i][9] = "";
                        for (int k = 0; k < libros[i].getTemas().length; k++) {
                            matriz[i][9] += libros[i].getTemas()[k] + ",";
                        }
                        matriz[i][10] = String.valueOf(libros[i].getCopias());
                        matriz[i][11] = libros[i].getCategoria();
                        matriz[i][12] = String.valueOf(libros[i].getEjemplares());
                        matriz[i][13] = " ";
                        matriz[i][14] = String.valueOf(libros[i].getDisponible());
                        matriz[i][15] = " ";
                        break;
                    case 2:
                        matriz[i][0] = String.valueOf(i);
                        matriz[i][1] = String.valueOf(libros[i].getTipo());
                        matriz[i][2] = libros[i].getAutor();
                        matriz[i][3] = String.valueOf(libros[i].getAnio_publi());
                        matriz[i][4] = " ";
                        matriz[i][5] = libros[i].getTitulo();
                        matriz[i][6] = String.valueOf(libros[i].getEdicion());
                       matriz[i][7]="";
                        for (int k = 0; k < libros[i].getClaves().length; k++) {
                            matriz[i][7] += libros[i].getClaves()[k] + ",";
                        }
                        matriz[i][8] = libros[i].getDescripcion();
                        matriz[i][9]="";
                        for (int k = 0; k < libros[i].getTemas().length; k++) {
                            matriz[i][9] += libros[i].getTemas()[k] + ",";
                        }
                        matriz[i][10] = String.valueOf(libros[i].getCopias());
                        matriz[i][11] = " ";
                        matriz[i][12] = " ";
                        matriz[i][13] = libros[i].getArea();
                        matriz[i][14] = String.valueOf(libros[i].getDisponible());
                        matriz[i][15] = " ";
                        break;
                    case 3:
                        matriz[i][0] = String.valueOf(i);
                        matriz[i][1] = String.valueOf(libros[i].getTipo());
                        matriz[i][2] = libros[i].getAutor();
                        matriz[i][3] = String.valueOf(libros[i].getAnio_publi());
                        matriz[i][4] = " ";
                        matriz[i][5] = libros[i].getTitulo();
                        matriz[i][6] = String.valueOf(libros[i].getEdicion());
                        matriz[i][7]="";
                        for (int k = 0; k < libros[i].getClaves().length; k++) {
                            matriz[i][7] += libros[i].getClaves()[k] + ",";
                        }
                        matriz[i][8] = libros[i].getDescripcion();
                        matriz[i][9]="";
                        for (int k = 0; k < libros[i].getTemas().length; k++) {
                            matriz[i][9] += libros[i].getTemas()[k] + ",";
                        }
                        matriz[i][10] = " ";
                        matriz[i][11] = " ";
                        matriz[i][12] = " ";
                        matriz[i][13] = " ";
                        matriz[i][14] = " ";
                        matriz[i][15] = String.valueOf(libros[i].getTamano());
                        break;
                    default:
                        throw new AssertionError();
                }
            }
        }
        tabla_libros.setModel(new javax.swing.table.DefaultTableModel(
                matriz,
                new String[]{
                    "No.", "Tipo", "Autor", "Año", "ISBN", "Titulo", "Edicion", "Palabras clave", "Descripcion", "Temas", "Copias", "Categorias",
                    "Ejemplares", "Area", "Disponibles", "Tamaño"
                }
        ));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_libros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabla_libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_libros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_libros;
    // End of variables declaration//GEN-END:variables
}
