package com.pvzgame;

import java.util.Scanner;

import com.pvzgame.Plant.*; // Import the Plant class
import com.pvzgame.PlantFactory.*; // Import the PeashooterFactory class

// import com.pvzgame.PlantFactory.*;
public class Main {
    
    public static int gameTime = 0;
    public static Boolean gameRunning = false;


    public static void main(String[] args) {

        // Driver for Plant
        Plant plant1 = new PeashooterFactory().create(5);
        System.out.println(plant1.getPlantName());
        System.out.println(plant1.getBirthTime());
        System.out.println(plant1.getSunCost());
        System.out.println(plant1.getPlantHealth());
        System.out.println(plant1.getPlantAttackDamage());
        System.out.println(plant1.getPlantAttackSpeed());
        System.out.println(plant1.getIsWaterType());

        System.out.println("=====================================");

        Plant plant2 = new KelpFactory().create(10);
        System.out.println(plant2.getPlantName());
        System.out.println(plant2.getBirthTime());
        System.out.println(plant2.getSunCost());
        System.out.println(plant2.getPlantHealth());
        System.out.println(plant2.getPlantAttackDamage());
        System.out.println(plant2.getPlantAttackSpeed());
        System.out.println(plant2.getIsWaterType());

        System.out.println("=====================================");
        // Driver for Peashooter
        Plant plant3 = new JalapenoFactory().create(100);
        System.out.println(plant3.getPlantName());
        System.out.println(plant3.getIsWaterType());
     
        System.out.println("=====================================");
        Plant plant4 = new LilypadFactory().create(100);
        System.out.println(plant4.getPlantName());
        System.out.println(plant4.getIsWaterType());

        System.out.println("=====================================");

        Plant plant5 = new SunflowerFactory().create(100);
        System.out.println(plant5.getPlantName());
        System.out.println(plant5.getIsWaterType());

        System.out.println("=====================================");

        Plant plant6 = new WallnutFactory().create(100);
        System.out.println(plant6.getPlantName());
        System.out.println(plant6.getIsWaterType());

        System.out.println("=====================================");

        Plant plant7 = new PotatoMineFactory().create(100);
        System.out.println(plant7.getPlantName());
        System.out.println(plant7.getIsWaterType());

        System.out.println("=====================================");

        Plant plant8 = new SnowpeaFactory().create(100);
        System.out.println(plant8.getPlantName());
        System.out.println(plant8.getIsWaterType());

        System.out.println("=====================================");

        Plant plant9 = new SquashFactory().create(100);
        System.out.println(plant9.getPlantName());
        System.out.println(plant9.getIsWaterType());

        Plant plant10 = new RepeaterFactory().create(100);
        System.out.println(plant10.getPlantName());
        System.out.println(plant10.getIsWaterType());

        


    }




    
}