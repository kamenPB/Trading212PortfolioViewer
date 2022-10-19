
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kamen
 */
public class ContentTableModelBuys extends AbstractTableModel{
    
    private String columnNames[] = {
        "Action",
        "Timestamp",
        "Ticker",
        "Name",
        "No. of shares",
        "Price / share",
        "Currency",
        "Exchange rate",
        "Total cost",
        "Currency converstion fee"
    };
    
    private ArrayList<CSVRecord> csvRecords;
    
    public ContentTableModelBuys() {
        csvRecords = new ArrayList<>();
    }
    
    public ContentTableModelBuys(ArrayList<CSVRecord> csvRecords) {
        this.csvRecords = csvRecords;
    }

    @Override
    public int getRowCount() {
        return csvRecords.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CSVRecord csvRecord = getCSVRecord(rowIndex);
        
        switch (columnIndex) {
            case 0: return csvRecord.action;
            case 1: return csvRecord.date;
            case 2: return csvRecord.ticker;
            case 3: return csvRecord.name;
            case 4: return csvRecord.numberOfShares;
            case 5: return csvRecord.pricePerShare;
            case 6: return csvRecord.currency;
            case 7: return csvRecord.exchangeRate;
            case 8: return csvRecord.totalCost;
            case 9: return csvRecord.currencyConverstionFee;
            default: return null;
        }
    }

    public CSVRecord getCSVRecord (int row) {
        return csvRecords.get(row);
    }
}
