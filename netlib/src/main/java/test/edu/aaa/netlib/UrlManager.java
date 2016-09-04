package test.edu.aaa.netlib;

import com.google.gson.Gson;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import test.edu.aaa.netlib.model.Url;

/**
 * Created by aaa on 2016/7/16.
 */
public class UrlManager {
    private static UrlManager manager=new UrlManager();

    List<Url> lu;

    private  UrlManager()
    {
        lu=new ArrayList<Url>();
    }
    private UrlManager getInstance()
    {
        return manager;
    }

    public void getNetSetting() {

        //FileInputStream fis=new FileInputStream();
    }
}
