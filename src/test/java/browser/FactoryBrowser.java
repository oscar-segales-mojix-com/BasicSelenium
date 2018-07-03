package browser;

public class FactoryBrowser {

    public static IBrowser make (String browserType){

        IBrowser browser;
        switch ( browserType.toUpperCase()){
            case "CHROME":
                browser= new Chrome();
                break;
            case "FIREFOX":
                browser= new FireFox();
                break;
            case "IE":
                browser= new InternetExplorer();
                break;
            case "SAFARI":
                browser= new Safari();
                break;
             default:
                 browser= new Chrome();
                 break;
        }
        return browser;
    }
}
