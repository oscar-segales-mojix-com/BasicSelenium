package factoryBrowser;

public class FactoryBrowser {

    public static IBrowser make (String type){
        IBrowser browser;

                switch (type){
                    case "chrome":
                        browser= new Chrome();
                        break;

                    default:
                        browser=new ChromeGrid();
                                break;
                }

        return browser;
    }
}
