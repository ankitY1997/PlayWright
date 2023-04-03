package Example;
import com.microsoft.playwright.*;
public class Play_WrightDemo {
	

	    public static void main(String[] args) {
	        Playwright pt=Playwright.create();
	    Browser br= pt.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
	   Page pg  =br.newPage();
	   pg.navigate("https://www.msn.com/en-in/money/watchlist?id=bnmj77&noti=Price&ocid=msedgdhp&duration=5D");
	    br.close();
	    pt.close();
	        
	    }
	}


