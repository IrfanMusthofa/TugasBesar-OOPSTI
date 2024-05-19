package com.pvzgame;

import com.pvzgame.Plant.*; // Import All the Plant class
import com.pvzgame.PlantFactory.*; // Import All the PeashooterFactory class
import com.pvzgame.Zombie.*; // Import All the Zombie class
import com.pvzgame.ZombieFactory.*; // Import All the ZombieFactory class

// import com.pvzgame.PlantFactory.*;
public class Main {
    
    public static int gameTime = 0;
    public static Boolean gameRunning = false;


    public static void main(String[] args) {

        // Driver for Plant
        Plant plant1 = new PeashooterFactory().create(5);
        System.out.println(plant1.getPlantName());
        System.out.println(plant1.getIsWaterType());

        System.out.println("=====================================");

        Plant plant2 = new KelpFactory().create(10);
        System.out.println(plant2.getPlantName());
        System.out.println(plant2.getBirthTime());
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

        System.out.println("=====================================");

        Plant plant10 = new RepeaterFactory().create(100);
        System.out.println(plant10.getPlantName());
        System.out.println(plant10.getIsWaterType());

        System.out.println("=====================================");
        System.out.println("ZOMBIE ONLY)");

        Zombie zombie1 = new BucketHeadZombieFactory().create(5);
        System.out.println(zombie1.getZombieName());
        System.out.println(zombie1.getHasTool());
        System.out.println(zombie1.getIsAquatic());
        System.out.println(zombie1.getIsHidden());


        System.out.println("=====================================");

        Zombie zombie2 = new ConeHeadZombieFactory().create(5);
        System.out.println(zombie2.getZombieName());
        System.out.println(zombie2.getHasTool());
        System.out.println(zombie2.getIsAquatic());
        System.out.println(zombie2.getIsHidden());

        System.out.println("=====================================");

        Zombie zombie3 = new DolphinRiderZombieFactory().create(5);
        System.out.println(zombie3.getZombieName());
        System.out.println(zombie3.getHasTool());
        System.out.println(zombie3.getIsAquatic());
        System.out.println(zombie3.getIsHidden());

        System.out.println("=====================================");

        Zombie zombie4 = new DuckyTubeZombieFactory().create(5);
        System.out.println(zombie4.getZombieName());
        System.out.println(zombie4.getHasTool());
        System.out.println(zombie4.getIsAquatic());
        System.out.println(zombie4.getIsHidden());

        System.out.println("=====================================");

        Zombie zombie5 = new FootBallZombieFactory().create(5);
        System.out.println(zombie5.getZombieName());
        System.out.println(zombie5.getHasTool());
        System.out.println(zombie5.getIsAquatic());
        System.out.println(zombie5.getIsHidden());

        System.out.println("=====================================");

        Zombie zombie6 = new NewsPaperZombieFactory().create(5);
        System.out.println(zombie6.getZombieName());
        System.out.println(zombie6.getHasTool());
        System.out.println(zombie6.getIsAquatic());
        System.out.println(zombie6.getIsHidden());

        System.out.println("=====================================");

        Zombie zombie7 = new PoleVaultingZombieFactory().create(5);
        System.out.println(zombie7.getZombieName());
        System.out.println(zombie7.getHasTool());
        System.out.println(zombie7.getIsAquatic());

        System.out.println("=====================================");

        Zombie zombie8 = new SnorkelZombieFactory().create(5);
        System.out.println(zombie8.getZombieName());
        System.out.println(zombie8.getHasTool());
        System.out.println(zombie8.getIsAquatic());
        System.out.println(zombie8.getIsHidden());

        System.out.println("=====================================");

        Zombie zombie9 = new NormalZombieFactory().create(5);
        System.out.println(zombie9.getZombieName());
        System.out.println(zombie9.getHasTool());
        System.out.println(zombie9.getIsAquatic());
        System.out.println(zombie9.getIsHidden());

        System.out.println("=====================================");

        Zombie zombie10 = new ScreenDoorZombieFactory().create(5);
        System.out.println(zombie10.getZombieName());
        System.out.println(zombie10.getHasTool());
        System.out.println(zombie10.getIsAquatic());
        System.out.println(zombie10.getIsHidden());

        System.out.println("=====================================");
    }




    
}