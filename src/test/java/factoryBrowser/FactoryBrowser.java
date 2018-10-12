package factoryBrowser;

public class FactoryBrowser {

    public static IBrowser make(String typeBrowser){

            IBrowser browser;
            switch (typeBrowser.toLowerCase()){
                case "chrome":
                    browser= new Chrome();
                    break;
                case "firefox":
                    browser= new FireFox();
                    break;
                case "ie":
                    browser= new IE();
                    break;
                default:
                    browser=new Chrome();
                    break;

            }
        return browser;

    }
}
