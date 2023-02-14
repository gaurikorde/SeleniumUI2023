package testNGParameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameterizationExcel {

    public static ExcelReader excel ;

    @Test(dataProvider = "getData")
    public void testmethod(String username, String psd){
        System.out.println("Username :"+username);
        System.out.println("Password :"+psd);


    }

    @DataProvider
    public static Object[][] getData(){

        if (excel == null){
            excel = new ExcelReader("C://Users//Gauri K//IdeaProjects//SeleniumUI//src//test//java//testNGParameterization//data.xlsx");
        }

        String sheetName = "loginTest";
        int row = excel.getRowCount(sheetName);
        int col= excel.getColumnCount(sheetName);
        System.out.println(row +"  "+col);
        Object [][] data = new Object[row-1][col];     //3 ,2
        System.out.println(data.length);

        for(int rownum=2;rownum<=row;rownum++){
            for (int colnum=0;colnum<col;colnum++){
                System.out.println(rownum+"  "+colnum);
                data[rownum-2][colnum] = excel.getCellData(sheetName,colnum,rownum);
                //System.out.println(data[rownum-2][colnum]);
            }
        }

    return data;
    }
}

