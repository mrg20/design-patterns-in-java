package ex1primerparcial2015;

import javax.swing.event.TableModelListener;
import java.util.ArrayList;


public class StudentsTable extends AbstractTableModel {
    @Override
    public void addTableModelListener(TableModelListener tableListener) {

    }

    @Override
    public ArrayList<Student> getColumnClass(int index) {
        return new ArrayList<Student>();
    }

    @Override
    public void setValueAt(int row, int column, Object itemToInsert) {
        Group group = new Group();
        if(itemToInsert instanceof Student)
            group.addStudent((Student) itemToInsert);
        //Inserting into our table...
    }

    //Més metodes...

}
