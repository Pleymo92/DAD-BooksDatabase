package dbbooksdad;

//@author Pleymo

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class manageBooks {
    
    private connectionClass clConnect;
    private ResultSet result;
    
    public manageBooks (connectionClass connection) throws SQLException {
        clConnect = connection;
    }
    
    public void Modify(Book book) throws SQLException {
        String querry = "update libros set titulo = '" + book.getTitle()
                                    + "', autor = '" + book.getAuthor()
                                    + "', editorial = '" + book.getEditorial()
                                    + "', asignatura = '" + book.getSubject()
                                    + "', estado = '" + book.getStatus()
                                    + "' where codigo = " + book.getCode();
        if(clConnect.execQuerryUpdate(querry) > 0) {
            JOptionPane.showMessageDialog(null, "Modificación Correcta");
        }else{
            JOptionPane.showMessageDialog(null, "Se ha producido un Error");
        }
    }
    
    public void newBook(Book book) throws SQLException{
        String querry = "INSERT INTO libros(titulo, autor, editorial, asignatura, estado) VALUES ('"
                                                  +book.getTitle()
                                           +"', '"+book.getAuthor()
                                           +"', '"+book.getEditorial()
                                           +"', '"+book.getSubject()
                                           +"', '"+book.getStatus()+"');";
        if(clConnect.execQuerryUpdate(querry) > 0) {
            JOptionPane.showMessageDialog(null, "Nuevo Libro añadido Correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "Se ha producido un Error");
        }
    }
  
    public void deleteBook(Book book) throws SQLException{
        String querry = "delete from libros where codigo = " + book.getCode();
        if (clConnect.execQuerryUpdate(querry) > 0) {
            JOptionPane.showMessageDialog(null, "Libro Eliminado Correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Se ha producido un Error");
        }
    }
    
    public Book showBook(String code) throws SQLException{
        Book book = new Book();
        String querry = "select * from libros where codigo = " + code;
        clConnect.execQuerry(querry);
        result = clConnect.getResult();
        result.next();
        //
        book.setCode(code);
        book.setTitle(result.getString("titulo"));
        book.setAuthor(result.getString("autor"));
        book.setEditorial(result.getString("editorial"));
        book.setSubject(result.getString("asignatura"));
        book.setStatus(result.getString("estado"));
        return book;
    }
    
    public void fillTable(String querry){
        try {
            clConnect.execQuerry(querry);
            result = clConnect.getResult();
        } catch (SQLException exc) {
            Logger.getLogger(manageBooks.class.getName()).log(Level.SEVERE, null, exc);
        }
    }
    
    public void fillTableQuerry(String querry){
        try {
                clConnect.execQuerry("SELECT * from libros where codigo like '%" + querry
                                                            +"%' or titulo like '%" + querry
                                                            +"%' or autor like '%" + querry
                                                            +"%' or editorial like '%" + querry
                                                            +"%' or asignatura like '%" + querry
                                                            +"%' or estado like'%" + querry + "%'");
                result = clConnect.getResult();
        } catch (SQLException exc) {
            Logger.getLogger(manageBooks.class.getName()).log(Level.SEVERE, null, exc);
        }
    }

    public ResultSet getResult() {
        return result;
    }
    
}
