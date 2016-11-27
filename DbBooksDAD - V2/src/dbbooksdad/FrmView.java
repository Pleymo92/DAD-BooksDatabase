package dbbooksdad;

//@author Pleymo

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class FrmView extends javax.swing.JFrame {
        
    private eventClass events;
    private tableView table;

    public FrmView(eventClass event) {
        initComponents();
        events=event;
        // Buttons Events
        btnNewBook.addActionListener(events);
        btnModify.addActionListener(events);
        btnDeleteBook.addActionListener(events);
        btnExit.addActionListener(events);
        // Table Events
        booksTable.addMouseListener(events);
        // Document Event
        txtFieldSearcher.getDocument().addDocumentListener(events);
        
    }
    
    // WARNING: Do NOT modify this code
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DbBooksPanel = new javax.swing.JPanel();
        BooksScrollPanel = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();
        ButtonsPanel = new javax.swing.JPanel();
        btnNewBook = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnDeleteBook = new javax.swing.JButton();
        txtFieldSearcher = new javax.swing.JTextField();
        TxtFieldsPanel = new javax.swing.JPanel();
        txtFieldCode = new javax.swing.JTextField();
        txtFieldTitle = new javax.swing.JTextField();
        txtFieldAuthor = new javax.swing.JTextField();
        txtFieldEditorial = new javax.swing.JTextField();
        txtFieldSubject = new javax.swing.JTextField();
        txtFieldStatus = new javax.swing.JTextField();
        lblCode = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblEditorial = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblSubject = new javax.swing.JLabel();
        lblSearcher = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        booksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        BooksScrollPanel.setViewportView(booksTable);

        btnNewBook.setText("Nuevo Libro");

        btnModify.setText("Modificar");

        btnExit.setText("Salir");

        btnDeleteBook.setText("Eliminar Libro");

        javax.swing.GroupLayout ButtonsPanelLayout = new javax.swing.GroupLayout(ButtonsPanel);
        ButtonsPanel.setLayout(ButtonsPanelLayout);
        ButtonsPanelLayout.setHorizontalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeleteBook, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(94, 94, 94))
        );
        ButtonsPanelLayout.setVerticalGroup(
            ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonsPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewBook)
                    .addComponent(btnDeleteBook))
                .addGap(34, 34, 34)
                .addGroup(ButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnModify))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        lblCode.setText("Código");

        lblTitle.setText("Título");

        lblAuthor.setText("Autor");

        lblEditorial.setText("Editorial");

        lblStatus.setText("Estado");

        lblSubject.setText("Asignatura");

        javax.swing.GroupLayout TxtFieldsPanelLayout = new javax.swing.GroupLayout(TxtFieldsPanel);
        TxtFieldsPanel.setLayout(TxtFieldsPanelLayout);
        TxtFieldsPanelLayout.setHorizontalGroup(
            TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TxtFieldsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TxtFieldsPanelLayout.createSequentialGroup()
                        .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCode, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TxtFieldsPanelLayout.createSequentialGroup()
                        .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSubject, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                        .addGap(49, 49, 49)
                        .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldEditorial)
                            .addComponent(txtFieldSubject)
                            .addComponent(txtFieldStatus)
                            .addComponent(txtFieldAuthor))))
                .addGap(6, 6, 6))
        );
        TxtFieldsPanelLayout.setVerticalGroup(
            TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TxtFieldsPanelLayout.createSequentialGroup()
                .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCode, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuthor)
                    .addComponent(txtFieldAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEditorial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubject))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TxtFieldsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        lblSearcher.setText("Buscar:");

        javax.swing.GroupLayout DbBooksPanelLayout = new javax.swing.GroupLayout(DbBooksPanel);
        DbBooksPanel.setLayout(DbBooksPanelLayout);
        DbBooksPanelLayout.setHorizontalGroup(
            DbBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DbBooksPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSearcher, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtFieldSearcher, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(344, 344, 344))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DbBooksPanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(TxtFieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(ButtonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(121, 121, 121))
            .addGroup(DbBooksPanelLayout.createSequentialGroup()
                .addComponent(BooksScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        DbBooksPanelLayout.setVerticalGroup(
            DbBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DbBooksPanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(DbBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldSearcher, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearcher, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(BooksScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DbBooksPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DbBooksPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TxtFieldsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DbBooksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1097, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DbBooksPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane BooksScrollPanel;
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JPanel DbBooksPanel;
    private javax.swing.JPanel TxtFieldsPanel;
    private javax.swing.JTable booksTable;
    private javax.swing.JButton btnDeleteBook;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnNewBook;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblEditorial;
    private javax.swing.JLabel lblSearcher;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblSubject;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtFieldAuthor;
    private javax.swing.JTextField txtFieldCode;
    private javax.swing.JTextField txtFieldEditorial;
    private javax.swing.JTextField txtFieldSearcher;
    private javax.swing.JTextField txtFieldStatus;
    private javax.swing.JTextField txtFieldSubject;
    private javax.swing.JTextField txtFieldTitle;
    // End of variables declaration//GEN-END:variables
           
    
    // Buttons getters

    public JButton getBtnNewBook() {
        return btnNewBook;
    }
    
    public JButton getBtnDeleteBook() {
        return btnDeleteBook;
    }

    public JButton getBtnModify() {
        return btnModify;
    }

    public JButton getBtnExit() {
        return btnExit;
    }
    
  
    // Text Fields getters

    public JTextField getTxtFieldSearcher() {
        return txtFieldSearcher;
    }

    public JTextField getTxtFieldCode() {
        return txtFieldCode;
    }

    public JTextField getTxtFieldTitle() {
        return txtFieldTitle;
    }

    public JTextField getTxtFieldAuthor() {
        return txtFieldAuthor;
    }

    public JTextField getTxtFieldEditorial() {
        return txtFieldEditorial;
    }

    public JTextField getTxtFieldSubject() {
        return txtFieldSubject;
    }

    public JTextField getTxtFieldStatus() {
        return txtFieldStatus;
    }
    
    
    // Table getters
    
    public JTable getBooksTable() {
        return booksTable;
    }
    
    public tableView getTable() {
        return table;
    }
   
}
