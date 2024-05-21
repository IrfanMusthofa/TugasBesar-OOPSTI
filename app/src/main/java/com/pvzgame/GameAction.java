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

    public void zombieMove(Zombie zombie, Map map, int row){
        Zombie temp = zombie;
        map.getTile(row, zombie.getCurrentCol()).removeZombie(zombie);
        map.getTile(row, zombie.getCurrentCol() - 1).addZombie(temp);
        temp.setCurrentCol(temp.getCurrentCol() - 1);
    }

    public void zombieAction(Zombie zombie, Map map, int row){
        switch (zombie.zombieCheck(map, row)){
            case 1:
                map.getTile(row, zombie.getCurrentCol()).getPlant().plantAttacked(zombie.getZombieAttackDamage()*zombie.getZombieAttackSpeed());
                if (map.getTile(row, zombie.getCurrentCol()).getPlant().getPlantHealth() <= 0){
                    map.getTile(row, zombie.getCurrentCol()).removePlant();
                }
                break;
            case 2:
                zombieMove(zombie, map, row);
                break;
            case 3:
                zombieMove(zombie, map, row);
                map.getTile(row, zombie.getCurrentCol()).removePlant();
                break;
            default:
                break;
        }
    }
    

    // ============= PLANT ACTION ==============

    // Plant Spawner


    
    // Dig
    public void dig (int row, int col, Map map) {
        try {

            // Error Handling
            if (row < 1 || col < 1 || row > 6 || col > 9) {
                throw new IllegalArgumentException("\n===== Index row atau col tidak valid! =====\n");
            }

            if (map.getTile(row,col).getPlant() == null) {
                throw new NullPointerException("\n===== Tidak ada tanaman untuk dicabut! =====\n");
            }

            // if it's land
            if (!map.getTile(row, col).getWater()) {
                map.getTile(row, col).removePlant();
            } else { // if it's water

                // Check if the tile has lilypad

                // if it's Lilypad
                if (map.getTile(row, col).getPlant().getPlantName().equals("Lilypad")) {
                    map.getTile(row, col).removePlant();
                } else { // if it's another plant on top of the Lilypad
                    map.getTile(row, col).setPlant(new LilypadFactory().create(0));
                }
            }
        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
} 
