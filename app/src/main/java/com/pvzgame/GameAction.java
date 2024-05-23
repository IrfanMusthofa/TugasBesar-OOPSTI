package com.pvzgame;

import java.util.List;
import java.util.Random;

import com.pvzgame.Zombie.*;
import com.pvzgame.ZombieFactory.*;
import com.pvzgame.Plant.*;
import com.pvzgame.PlantFactory.*;

public class GameAction implements ZombieEnum {
    
    // Attributes
    public ZombieEnum.landZombie[] landZombie = ZombieEnum.landZombie.values();
    public ZombieEnum.aquaticZombie[] aquaticZombie = ZombieEnum.aquaticZombie.values();

    // ============= ZOMBIE ACTION ==============
    // Zombie Spawner
    public void zombieSpawner(Tile tile) {

        // Max of total Zombie exist at a time is 10
        if (Zombie.getZombieCount() >= 10) {
            return;
        }

        // Randomly choose any type of zombie
        Random random = new Random();     
        if (tile.getWater()) { // Water
            ZombieEnum.aquaticZombie randomAquaticZombie = aquaticZombie[random.nextInt(aquaticZombie.length)];
            switch (randomAquaticZombie) {
                case SnorkelZombie:
                    tile.addZombie(new SnorkelZombieFactory().create(Main.gameTime));
                    break;
                case DuckyTubeZombie:
                    tile.addZombie(new DuckyTubeZombieFactory().create(Main.gameTime));
                    break;
                case DolphinRiderZombie:
                    tile.addZombie(new DolphinRiderZombieFactory().create(Main.gameTime));
                    break;
                default:
                    break;
            }
        } else { // Not Water
            ZombieEnum.landZombie randomLandZombie = landZombie[random.nextInt(landZombie.length)];
            switch (randomLandZombie) {
                case BucketHeadZombie:
                    tile.addZombie(new BucketHeadZombieFactory().create(Main.gameTime));
                    break;
                case ConeHeadZombie:
                    tile.addZombie(new ConeHeadZombieFactory().create(Main.gameTime));
                    break;
                case FootBallZombie:
                    tile.addZombie(new FootBallZombieFactory().create(Main.gameTime));
                    break;
                case NewsPaperZombie:
                    tile.addZombie(new NewsPaperZombieFactory().create(Main.gameTime));
                    break;
                case PoleVaultingZombie:
                    tile.addZombie(new PoleVaultingZombieFactory().create(Main.gameTime));
                    break;
                case ScreenDoorZombie:
                    tile.addZombie(new ScreenDoorZombieFactory().create(Main.gameTime));
                    break;
                case NormalZombie:
                    tile.addZombie(new NormalZombieFactory().create(Main.gameTime));
                    break;
                default:
                    break;
            }
        }
        Zombie.incZombieCount();
    }

    public void zombieMove(Zombie zombie, Map map, int row, int col){ // Immediately normally move
        if (col != 0) {
            map.getTile(row, col - 1).addZombie(zombie);
            map.getTile(row, col).removeZombie(zombie);
        }
    }

    public void zombieAction(Zombie zombie, Map map, int row, int col){
        switch (zombie.zombieCheck(map, row, col)){
            case 1:
                // zombieAttackdamage * zombieAttackSpeed
                map.getTile(row, col).getPlant().plantAttacked(zombie.getZombieAttackDamage()*zombie.getZombieAttackSpeed());
                if (map.getTile(row, col).getPlant().getPlantHealth() <= 0){ // cek apakah plant sudah mati terbunuh
                    map.getTile(row, col).removePlant();
                }
                break;
            case 2:
                zombieMove(zombie, map, row, col);
                break;
            case 3:
                zombieMove(zombie, map, row, col);
                map.getTile(row, col).removePlant();
                break;
            default: 
                break;
        }
    }


    // ============= PLANT ACTION ==============
    public void plantAction(Map map, int row, int col, Plant plant){

        // jalapeno
        if (plant.getPlantType() == 1){
            Tile[][] tiles = map.getTiles();
            for (int i=1;i<11;i++){
                tiles[row][i].removeAllZombies();
            }
        }

        // kelp
        else if (plant.getPlantType() == 2){
            if (map.getTile(row, col).getZombies() != null){
                map.getTile(row, col).removeZombie(map.getTile(row, col).getZombies().get(0));
                map.getTile(row, col).removePlant();
            }
        }

        // peashooter / repeater
        else if (plant.getPlantType() == 4 || plant.getPlantType() == 6){
            if (plant.timeToAttack()){
                for (int i = col;i<10;i++){
                    if(map.getTile(row,i).getZombies()!=null){
                        map.getTile(row,i).getZombies().get(0).zombieAttacked(plant.getPlantAttackDamage());
                    }
                }
            }
        }

        // potato mine
        else if (plant.getPlantType() == 5){
            if (map.getTile(row, col).getZombies() != null){
                map.getTile(row, col).removeAllZombies();
                map.getTile(row, col).removePlant();
            }
        }

        // snowpea
        else if (plant.getPlantType() == 7){
            if (plant.timeToAttack()){
                for (int i = col;i<10;i++){
                    if(map.getTile(row,i).getZombies()!=null){
                        map.getTile(row,i).getZombies().get(0).zombieAttacked(plant.getPlantAttackDamage());
                        map.getTile(row,i).getZombies().get(0).slowZombie();
                    }
                }
            }
        }

        //squash
        else if (plant.getPlantType() == 8){
            if (map.getTile(row, col-1).getZombies() != null){
                map.getTile(row, col-1).removeAllZombies();
                map.getTile(row, col).removePlant();
            }
            else if (map.getTile(row, col).getZombies() != null){
                map.getTile(row, col).removeAllZombies();
                map.getTile(row, col).removePlant();
            }
            else if (map.getTile(row, col+1).getZombies() != null){
                map.getTile(row, col+1).removeAllZombies();
                map.getTile(row, col).removePlant();
            }
        }
    }

    // Plant Spawner
    public void plant(int row, int col, Plant plant, Map map, Sun sun) {
        try {   
            // Error Handling
            if (plant.getSunCost() > sun.getSunPoints()) { // Sun Point not enough
                throw new Exception("\n===== Sun Point tidak cukup! =====");
            }

            if (row < 0 || col < 1 || row > 6 || col > 9) { // Index out of bound
                throw new IllegalArgumentException("\n===== Index row atau col tidak valid! =====");
            }

            // LAND PLANT
            if (!map.getTile(row, col).getWater()) {
                if (plant.getIsWaterType()) { 
                    throw new Exception("\n===== Tidak dapat menanam tanaman air di daratan! =====");
                } else if (map.getTile(row, col).getPlant() != null) {
                    throw new Exception("\n===== Sudah ada tanaman di tile tersebut! =====");
                } else if (map.getTile(row, col).getPlant() == null) {
                    map.getTile(row, col).setPlant(plant);
                    System.out.println("\n ===== Menanam " + plant.getPlantName() + " di daratan! =====");
                }
            }

            // WATER PLANT
            if (map.getTile(row, col).getWater()) {
                if (map.getTile(row, col).getPlant() != null) { // ada sesuatu di tile tersebut

                    // Ada lilypad
                    if (map.getTile(row, col).getPlant().getPlantName().equals("Lilypad")) {
                        if (plant.getIsWaterType()) {
                            throw new Exception("\n===== Tidak dapat menanam tanaman air di atas Lilypad! =====");
                        } else {
                            plant.setPlantHealth(plant.getPlantHealth() + 100);
                            map.getTile(row, col).setPlant(plant);
                            System.out.println("\n===== Menanam " + plant.getPlantName() + " di atas Lilypad! =====");
                        }
                    
                    // Ada tanaman air lain
                    } else if (!map.getTile(row, col).getPlant().getPlantName().equals("Lilypad")) {
                        throw new Exception("\n===== Sudah ada tanaman di tile tersebut! =====");
                    }

                // Tidak ada apa-apa di tile tersebut
                } else {
                    if (plant.getIsWaterType()) {
                        map.getTile(row, col).setPlant(plant);
                        System.out.println("\n===== Menanam " + plant.getPlantName() + " di air! =====");
                    } else {
                        throw new Exception("\n===== Tidak dapat menanam tanaman daratan di air, butuh Lilypad! =====");
                    }
                }
            }

            // Subtract Sun Point
            sun.subtractSun(plant.getSunCost());
            // System.out.println("Plant: " + plant.getPlantName() + "Sun berkurang: " + plant.getSunCost());
            // System.out.println("PlantTime: " + plant.getBirthTime());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    // Dig
    public void dig(int row, int col, Map map) {
        try {

            // Error Handling
            if (row < 0 || col < 1 || row > 5 || col > 9) {
                throw new IllegalArgumentException("\n===== Index row atau col tidak valid! =====\n");
            }

            if (map.getTile(row, col).getPlant() == null) {
                throw new NullPointerException("\n===== Tidak ada tanaman untuk dicabut! =====\n");
            }

            // if it's land
            if (!map.getTile(row, col).getWater()) {
                map.getTile(row, col).removePlant();
            } else { // if it's water

                // Check if the tile has lilypad

                // if it's Lilypad
                if (map.getTile(row, col).getPlant().getIsWaterType()) {
                    map.getTile(row, col).removePlant();
                } else {
                    map.getTile(row, col).setPlant(new LilypadFactory().create(0));
                } 
            }
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
} 
