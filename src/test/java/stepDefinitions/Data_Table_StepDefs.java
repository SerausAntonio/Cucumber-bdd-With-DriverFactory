package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class Data_Table_StepDefs {

    @Given("My Credentials")
    public void myCredentials(DataTable dataTable) {
        List<String> creds = dataTable.values();
        System.out.println("USERNAME: "+ creds.get(0));
        System.out.println("PASSWORD: "+ creds.get(1));
        System.out.println("USERNAME: "+ creds.get(2));
        System.out.println("PASSWORD: "+ creds.get(3));
    }

    @And("single row with no header")
    public void singleRowWithNoHeader(DataTable dataTable) {
        List<String> row = dataTable.row(0);
        System.out.println("USERNAME: " +  row.get(0)  );
        System.out.println("PASSWORD: " + row.get(1));
        System.out.println("------------------------------------");
    }

    @And("more rows with no header")
    public void moreRowsWithNoHeader(DataTable dataTable) {
        List<List<String>> table = dataTable.asLists();
        System.out.println("USERNAME: " + table.get(0).get(0));
        System.out.println("PASSWORD: " + table.get(0).get(1));
        System.out.println("USERNAME: "+ table.get(1).get(0));
        System.out.println("PASSWORD: "+ table.get(1).get(1));
        System.out.println("---------------------------------");
    }

    @Given("I have a single row with header")
    public void iHaveASingleRowWithHeader(DataTable dataTable) {
        List<Map<String,String>>  creds = dataTable.asMaps();
        System.out.println("USERNAME :"+creds.get(0).get("username"));
        System.out.println("PASSWORD :"+creds.get(0).get("password"));
    }

    @And("I have multiple rows with headers")
    public void iHaveMultipleRowsWithHeaders(DataTable dataTable) {
        List<Map<String,String>>  creds = dataTable.asMaps();
        System.out.println("USERNAME :"+creds.get(0).get("username"));
        System.out.println("PASSWORD :"+creds.get(0).get("password"));
        System.out.println("USERNAME :"+creds.get(1).get("username"));
        System.out.println("PASSWORD :"+creds.get(1).get("password"));

    }
}
