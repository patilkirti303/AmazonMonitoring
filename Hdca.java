import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

// Example of waiting for an element
WebDriverWait wait = new WebDriverWait(driver, 10); // 10 seconds timeout
WebElement performanceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("performance-metrics")));