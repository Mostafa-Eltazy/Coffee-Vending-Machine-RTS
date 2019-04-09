/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.event.engine;

import Model.CoffeeMachine;
import Model.MoneyHandler;
import Model.Money_Sensor;
import Model.WaterHeater;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import system.views.WaterHeater_VIEW;

/**
 *
 * @author ragrag
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Logger.getRootLogger().setLevel(Level.OFF);

        // Register events
        Engine.registerEvents();
        WaterHeater_VIEW.getWaterHeaterView();
        CoffeeMachine.getCoffeeMachine();
        WaterHeater.getWaterHeater();
        Money_Sensor moneySensor=new Money_Sensor();
        MoneyHandler moneyHandle = MoneyHandler.getMoneyHandler();
        // Create Kettle

    }

}
