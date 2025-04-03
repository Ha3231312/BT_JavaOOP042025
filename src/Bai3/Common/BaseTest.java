package Bai3.Common;

public class BaseTest {
    public void createDriver(){
        System.out.println(Constant.browser);
        System.out.println(Constant.report);
        System.out.println(Constant.headless);

    }

    public void createDriver(String browser){
        System.out.println(Constant.browser);
        System.out.println(Constant.report);
        System.out.println(Constant.headless);

    }

    public void closeDriver(String brower){
        System.out.println(brower);

    }

    public void closeDriver(){
        System.out.println(Constant.browser);

    }


}
