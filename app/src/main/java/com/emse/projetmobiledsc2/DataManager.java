package com.emse.projetmobiledsc2;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager INSTANCE;
//    private static String name;
    private List<String> nameList;
    private DataManager(){
        nameList = new ArrayList<>();
    }
    public static DataManager getInstance(){
        if(INSTANCE==null){
            INSTANCE=new DataManager();
        }
        return INSTANCE;
    }

    public List<String> getNameList() {
        return nameList;
    }

    public void addName(String name) {

        nameList.add(name);
    }
}
