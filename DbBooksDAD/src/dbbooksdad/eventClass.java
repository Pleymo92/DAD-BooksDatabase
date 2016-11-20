package dbbooksdad;

//@author Pleymo

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class eventClass implements ActionListener, MouseListener, DocumentListener{
    
    private connectionClass clConnect;
    private manageBooks manage;
    private FrmView frm;

    public eventClass(){
        try {
            clConnect = new connectionClass();      
            manage = new manageBooks(clConnect);
            frm = new FrmView(this);
            frm.setVisible(true);
            refreshTable();
            
        } catch (SQLException exc) {
            Logger.getLogger(eventClass.class.getName()).log(Level.SEVERE, null, exc);
        }
    }

    public void refreshTable(){
        manage.fillTable("select * from libros");
        frm.getBooksTable().setModel(new tableView(manage.getRespondSQL()));
    }
    
    public void refreshTableQuerry(String querry) {
        manage.fillTableQuerry(querry);
        frm.getBooksTable().setModel(new tableView(manage.getRespondSQL()));
    }
    
    @Override
    public void actionPerformed(ActionEvent actEvent) {
        // Button NewBook
        if(actEvent.getSource() == frm.getBtnNewBook()) {
            try {
                Book book = new Book();
                book.setTitle(frm.getTxtFieldTitle().getText());
                book.setAuthor(frm.getTxtFieldAuthor().getText());
                book.setEditorial(frm.getTxtFieldEditorial().getText());
                book.setSubject(frm.getTxtFieldSubject().getText());
                book.setStatus(frm.getTxtFieldStatus().getText());
                manage.newUser(book);
                refreshTable();                              
            } catch (SQLException ex) {
                Logger.getLogger(FrmView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // Button DeleteBook
        if(actEvent.getSource() == frm.getBtnDeleteBook()) {
            try {
                Book book = new Book();
                book.setCode(frm.getTxtFieldCode().getText());
                manage.deleteUser(book);
                refreshTable();
            } catch (SQLException ex) {
                Logger.getLogger(FrmView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // Button Modify
        if(actEvent.getSource() == frm.getBtnModify()) {
            try {
                Book book = new Book();
                book.setCode(frm.getTxtFieldCode().getText());
                book.setTitle(frm.getTxtFieldTitle().getText());
                book.setAuthor(frm.getTxtFieldAuthor().getText());
                book.setEditorial(frm.getTxtFieldEditorial().getText());
                book.setSubject(frm.getTxtFieldSubject().getText());
                book.setStatus(frm.getTxtFieldStatus().getText());
                manage.Modify(book);
                refreshTable();                
            } catch (SQLException ex) {
                Logger.getLogger(FrmView.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // Button Exit
        if(actEvent.getSource() == frm.getBtnExit()) {
            System.exit(DISPOSE_ON_CLOSE);
        }
    }

    @Override
    public void mouseClicked(MouseEvent mosEvent) {
        try {
            String code="";
            int row=0;
            row=frm.getBooksTable().getSelectedRow();
            code=String.valueOf(frm.getBooksTable().getValueAt(row, 0));
            //
            Book book = manage.showBook(code);
            frm.getTxtFieldCode().setText(book.getCode());
            frm.getTxtFieldTitle().setText(book.getTitle());
            frm.getTxtFieldAuthor().setText(book.getAuthor());
            frm.getTxtFieldEditorial().setText(book.getEditorial());
            frm.getTxtFieldSubject().setText(book.getSubject());
            frm.getTxtFieldStatus().setText(book.getStatus());
        } catch (SQLException ex) {
            Logger.getLogger(eventClass.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }

    @Override
    public void mousePressed(MouseEvent mosEvent) { }

    @Override
    public void mouseReleased(MouseEvent mosEvent) { }

    @Override
    public void mouseEntered(MouseEvent mosEvent) { }

    @Override
    public void mouseExited(MouseEvent mosEvent) { }
    
    //Doc Listener
    @Override
    public void insertUpdate(DocumentEvent docEvent) {
        String txtfield="";
        txtfield = frm.getTxtFieldSearcher().getText();
        if(txtfield.equals("")){
            refreshTable();
        } else {
            refreshTableQuerry(txtfield);
        }
    }

    @Override
    public void removeUpdate(DocumentEvent docEvent) {
        String txtfield="";
        txtfield = frm.getTxtFieldSearcher().getText();
        if(txtfield.equals("")) {
            refreshTable();
        } else {
            refreshTableQuerry(txtfield);
        }
    }

    @Override
    public void changedUpdate(DocumentEvent docEvent) {
        String txtfield="";
        txtfield = frm.getTxtFieldSearcher().getText();
        if(txtfield.equals("")) {
            refreshTable();
        } else {
            refreshTableQuerry(txtfield);
        }
    }
}
