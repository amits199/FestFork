import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutomation {
    public static void main(String[] args) {
        // Specify the path to your WebDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to Amazon's website
        driver.get("https://www.amazon.com");

        // Find the search bar and input the product you want to search for
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Your Product Name");
        searchBox.submit();

        // Wait for search results to load (you might need to use explicit waits here)
        // Click on the first search result (assuming it's the product you want)
        WebElement firstResult = driver.findElement(By.cssSelector(".s-main-slot .s-result-item"));
        firstResult.click();

        // Add the product to the cart
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();

        // Proceed with the checkout process (this would involve multiple steps and might require more automation)

        // Remember to clean up and close the WebDriver instance when done
        driver.quit();
    }
}
