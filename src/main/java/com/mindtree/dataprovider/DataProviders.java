package com.mindtree.dataprovider;

import org.testng.annotations.DataProvider;

import com.mindtree.utility.XLUtils;

public class DataProviders {
	
	XLUtils ob = new XLUtils();
	@DataProvider(name = "productSearch")
	public Object[][] getProduct() {
		int rows = ob.getRowCount("SearchProduct");
		// Total Columns
		int column = ob.getColumnCount("SearchProduct");
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = ob.getCellData("SearchProduct", j, i + 2);
			}
		}
		return data;
	}

}
