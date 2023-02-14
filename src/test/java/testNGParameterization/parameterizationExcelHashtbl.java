package testNGParameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class parameterizationExcelHashtbl {

    public static ExcelReader excel ;

    @Test(dataProvider = "dp2")
    //@Test(dataProvider = "getData") when name not assign to data provider
    public void testmethod(Hashtable<String,String> data){
//        System.out.println("Username :"+data.get("Username"));
//        System.out.println("Password :"+data.get("psd"));
//        System.out.println("Active :"+data.get("is_active"));
//        System.out.println("location :"+data.get("location"));

        System.out.println("Mum :"+data.get("mum"));
        System.out.println("pup1 :"+data.get("pup1"));
        System.out.println("pup2 :"+data.get("pup2"));
        System.out.println("pup3 :"+data.get("pup3"));
        System.out.println("pup4 :"+data.get("pup4"));
        System.out.println("pup5 :"+data.get("pup5"));



    }

    @DataProvider(name="dp1")
    public static Object[][] getData(){

        if (excel == null){
            excel = new ExcelReader("C://Users//Gauri K//IdeaProjects//SeleniumUI//src//test//java//testNGParameterization//data.xlsx");
        }

        String sheetName = "loginTest";
        int row = excel.getRowCount(sheetName);
        int col= excel.getColumnCount(sheetName);
        System.out.println(row +"  "+col);
        //Object [][] data = new Object[row-1][col];     //3 ,2
        Object[][] data = new Object[row-1][1];
        Hashtable<String,String> table = null;
        System.out.println(data.length);

        for(int rownum=2;rownum<=row;rownum++){
            table = new Hashtable<String,String>();

            for (int colnum=0;colnum<col;colnum++){
                System.out.println(rownum+"  "+colnum);

               // data[rownum-2][colnum] = excel.getCellData(sheetName,colnum,rownum);

                table.put(excel.getCellData(sheetName, colnum, 1), excel.getCellData(sheetName, colnum, rownum));
                data[rownum-2][0]=table;
                //System.out.println(data[rownum-2][colnum]);
            }
        }

    return data;
    }


    @DataProvider(name="dp2")
    public static Object[][] getData2(){

        if (excel == null){
            excel = new ExcelReader("C://Users//Gauri K//IdeaProjects//SeleniumUI//src//test//java//testNGParameterization//data2.xlsx");
        }

        String sheetName = "loginTest";
        int row = excel.getRowCount(sheetName);
        int col= excel.getColumnCount(sheetName);
        System.out.println(row +"  "+col);
        //Object [][] data = new Object[row-1][col];     //3 ,2
        Object[][] data = new Object[row-1][1];
        Hashtable<String,String> table = null;
        System.out.println(data.length);

        for(int rownum=2;rownum<=row;rownum++){
            table = new Hashtable<String,String>();

            for (int colnum=0;colnum<col;colnum++){
                System.out.println(rownum+"  "+colnum);

                // data[rownum-2][colnum] = excel.getCellData(sheetName,colnum,rownum);

                table.put(excel.getCellData(sheetName, colnum, 1), excel.getCellData(sheetName, colnum, rownum));
                data[rownum-2][0]=table;
                //System.out.println(data[rownum-2][colnum]);
            }
        }

        return data;
    }

}

