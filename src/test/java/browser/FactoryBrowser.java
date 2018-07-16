package browser;

public class FactoryBrowser {

    public static IBrowser make(String browserType){
        IBrowser browser;
        switch ( browserType){
            case "chrome":
                browser= new Chrome();
                break;
            case "ie":
                browser= new IE();
                break;
            case "firefox":
                browser= new Firefox();
                break;
            case "safari":
                browser= new Safari();
                break;
            default:
                browser= new ChromeGrid();
                break;
        }
        return browser;
    }
}
