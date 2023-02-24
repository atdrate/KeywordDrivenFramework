package com.bridgelabz.qa.keyworddriven;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.bridgelabz.qa.engine.KeyWordEngine;

public class Logintest {
     public KeyWordEngine keyWordEngine;
     
     @Test
     public void loginTest() throws InvalidFormatException {
    	 keyWordEngine=new KeyWordEngine();
    	 keyWordEngine.startExecution("login");
     }
}
