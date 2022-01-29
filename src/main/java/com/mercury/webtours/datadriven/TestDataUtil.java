package com.mercury.webtours.datadriven;
import java.util.ArrayList;

/**
 * ****************************************************************************************************************
 * @author sakhter
 * Class Name: Test Data Util 
 * Description: This class will fetch the test date from the external excel file
 * Date: 01/29/2022
 * ****************************************************************************************************************
 */
import com.mercury.webtours.util.ExcelReader;

public class TestDataUtil {
	static ExcelReader reader;
	/**
	 * ****************************************************************************************************************
	                                          Test name: Login
	 * ****************************************************************************************************************
	 */	
public static ArrayList<Object[]> getLogin(){
	ArrayList<Object[]> myData = new ArrayList<Object[]>();
	try {
		reader = new ExcelReader("C:\\Users\\salma\\eclipse-workspace\\com.demo.mercury.webtours\\TestData\\testdata.xlsx");
	} catch (Exception e)
	{
		System.out.println("The unsuccessful message "+e.getMessage());
	}
	for (int rowCnt = 2;rowCnt<= reader.getRowCount("Login");rowCnt++) {
		String userID = reader.getCellData("Login", "Username", rowCnt);
		String passwd = reader.getCellData("Login", "Password", rowCnt);
		Object ob[] = {userID, passwd};
		myData.add(ob);
	}
	return myData;
		
	}

	
	
	/**
	 * ****************************************************************************************************************
	                >>>>>>>>>>>>>>>>>>>>>>>>>>>>> End of the File <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	 * ****************************************************************************************************************
	 */	
}
