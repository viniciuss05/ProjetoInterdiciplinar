package univs.edu.dentista;

import univs.edu.dentista.*;
import univs.edu.dentista.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class DentistaTableModel extends AbstractTableModel {

    private List<Dentista> dentistas = new ArrayList<>();
    private String[] colunas = {"Id", "Nome", "Cpf"};

    public DentistaTableModel(List<Dentista> dentistas) {
        this.dentistas = dentistas;
    }

    @Override
    public int getRowCount() {
        return dentistas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Dentista dentista = dentistas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return dentista.getIdDentista();           
            case 1:
                return dentista.getNome();
            case 2:
                return dentista.getCpf();
        }
        return null;
    }

    public String getColumnName(int index) {
        switch (index) {
            case 0:
                return colunas[0];
            case 1:
                return colunas[1];
            case 2:
                return colunas[2];


        }
        return null;
    }

}
