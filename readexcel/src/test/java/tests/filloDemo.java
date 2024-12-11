package tests;

import java.util.ArrayList;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class filloDemo {
	
	public static void main(String [] args) throws FilloException
	{
		Fillo filo = new Fillo();
		Connection conn = filo.getConnection("C:\\Users\\byerane\\eclipse-workspace\\testData\\testdata.xlsx");
		
		String query = "Select * from Sportz";  // table name (sheetname)
		Recordset recset = conn.executeQuery(query);
		
		List<String> data = new ArrayList<String>();
		
		// print excel data
		while(recset.next())
		{
			System.out.println(recset.getField("Email")+"--"+recset.getField("Append Text")+"--"+recset.getField("clear text"));
			data.add(recset.getField("Email"));
		}
		// Read data from list
		System.out.println("First Email--"+data.get(0));
				
		System.out.println("//==------=");
		
		// Total row in excel sheet
		System.out.println("Total Row in Sheet:- "+recset.getCount());
		
		System.out.println("//==------=");
		
		// Get last row data
		recset.moveLast();
		
		
		// get previous row 
		recset.movePrevious();
		
		// get first row data
		recset.moveFirst();
		
		recset.moveNext();
		
		//get column name
		int totalCols = recset.getFieldNames().size();
		System.out.println(totalCols);
		
		String firstColNm = recset.getFieldNames().get(0);
		System.out.println(firstColNm);
		
		System.out.println("//=--------------------------------------=");
		
//		String query1 = "select * from Sportz where clear text ='yahoo'";
//		Recordset recset1 = conn.executeQuery(query);
		
		Recordset recset1 = conn.executeQuery("select * from Sportz").where("clear text ='yahoo'");
		
		while(recset1.next())
		{
			System.out.println(recset1.getField("Email")+"--"+recset1.getField("Append Text")+"--"+recset1.getField("clear text"));
		}
		
		recset.close();
		conn.close();
	}
}
