package primerparcial2015ex1;

import javax.swing.event.TableModelListener;
import java.util.ArrayList;

public interface TableModel {
    void addTableModelListener(TableModelListener tableListener);
    ArrayList<Student> getColumnClass(int index);
    int getRowCount();
    void setValueAt(int row, int column, Object itemToInsert);
    //... altres metodes
}
