package functional_tests.automationFramework;

import org.apache.commons.lang3.StringUtils;


public class UrlConfiguration {

    private static String getExecutionEnv() {
        // Defines the host url based on the env used. This env should be provided via console

        String strHostServer = System.getProperty("Logitech.website.url");
        if(StringUtils.isEmpty(strHostServer)) {
            //throw new IllegalArgumentException("Must supply a scion website url (scion.website.url property) to execute tests against");
            strHostServer = "http://logitech:log!tech@52.24.132.228/" ;
        }

        if( ! StringUtils.endsWith(strHostServer, "/")) {
            strHostServer = strHostServer + "/";
        }
        return strHostServer;
    }

    public static String getPage(String strPage){
        //Provides the test url based on execution environment defined and module per model to be tested
        String url = getExecutionEnv();
        if (strPage.equals("Home")) {
            url += "homepage.html";
        }
        else if (strPage.equals("Category")) {
            url += "nav-category.html";
        }
        else if (strPage.equals("pdp")) {
            url += "pdp.html";
        }
        else if (strPage.equals("compare")) {
            url += "compare.html";
        }
        return url;
    }

}

