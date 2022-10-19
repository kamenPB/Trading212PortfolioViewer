
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kamen
 */
public class PostgreSQLUtility {
    
    private final String postgresURL = "jdbc:postgresql://trading212.cib8wneubxyv.eu-west-2.rds.amazonaws.com:5432/postgres";
    private final String username = "postgresAdmin";
    private final String password = "Monika94!!";
	private final String schemaName = "trading212";
    
    public Connection getPostgreSQLConnection () {
        
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(postgresURL, username, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
			System.out.println(e.getMessage());
        }
        return conn;
    }
	
	public void insertRowsToTable (ArrayList<CSVRecord> csvRecords, String tableName) {
		
		Connection conn = getPostgreSQLConnection();
		String sqlPrepStmntString = "insert into " + schemaName + "." + tableName + " values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement prepStmnt = conn.prepareStatement(sqlPrepStmntString);
			
			for (CSVRecord record : csvRecords) {
				prepStmnt.setObject(1, record.getAction());
				prepStmnt.setObject(2, record.getDate());
				prepStmnt.setObject(3, record.getTicker());
				prepStmnt.setObject(4, record.getName());
				prepStmnt.setObject(5, record.getNumberOfShares());
				prepStmnt.setObject(6, record.getPricePerShare());
				prepStmnt.setObject(7, record.getCurrency());
				prepStmnt.setObject(8, record.getExchangeRate());
				prepStmnt.setObject(9, record.getResult());
				prepStmnt.setObject(10, record.getTotalCost());
				prepStmnt.setObject(11, record.getWithholdingTax());
				prepStmnt.setObject(12, record.getWithholdingTaxCurrency());
				prepStmnt.setObject(13, record.getChargeAmount());
				prepStmnt.setObject(14, record.getDepositFee());
				prepStmnt.setObject(15, record.getCurrencyConverstionFee());
				
				if (record.getAction().contains("buy")) prepStmnt.executeUpdate();
			}
		} catch (SQLException e) {
			System.out.println("Unable to execute statement. " + e.getMessage());
		}
		
	} 
	
	public void truncateTable (String tableName) {
		
		Connection conn = getPostgreSQLConnection();
		String sqlPrepStmntString = "delete from " + schemaName + "." + tableName;
		
		try { 
			PreparedStatement prepStmnt = conn.prepareStatement(sqlPrepStmntString);
			prepStmnt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Unable to execute statement. " + e.getMessage());
		}
		
	}
    
}
