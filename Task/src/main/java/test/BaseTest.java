package test;

import browser.DriverManager;
import browser.DriverManagerFactory;
import browser.DriverType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

public class BaseTest {
    public WebDriver driver;
    DriverManager driverManager;




    @BeforeClass
    public void setUp() {
        driverManager = new DriverManagerFactory().getManager(DriverType.FIREFOX);
        driver = driverManager.getDriver();
        driverManager.openUrl("https://demoqa.com/");
    }

    public List<HashMap<String, String>> getJsonData(String jsonFilePath) throws IOException {

        //convert json file content to json string
        String jsonContent = FileUtils.readFileToString(new File(jsonFilePath),
                StandardCharsets.UTF_8);

        ObjectMapper mapper = new ObjectMapper();
        List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
        });

        return data;

    }

    @AfterSuite
    public void tearDown() {
        driverManager.quitDriver();
    }
}
