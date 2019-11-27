package univs.edu.consulta;

import univs.edu.consulta.*;
import univs.edu.consulta.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class ConsultaTableModel extends AbstractTableModel {

    private List<Consulta> consultas = new ArrayList<>();
    private String[] colunas = {"Id", "Data", "Dentista", "Cliente",};

    public ConsultaTableModel(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    @Override
    public int getRowCount() {
        return consultas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Consulta consulta = consultas.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return consulta.getIdConsulta();
            case 1:
                return consulta.getData();
            case 2:
                return consulta.getDentista().getNome();
            case 3:
                return consulta.getCliente().getNome();
          
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
            case 3:
                return colunas[3];
            

        }
        return null;
    }

}
