package com.pvzgame;

import java.util.List;
import java.util.Random;

import com.pvzgame.Zombie.*;
import com.pvzgame.ZombieFactory.*;
import com.pvzgame.Plant.*;
import com.pvzgame.PlantFactory.*;
import com.pvzgame.*;

public class GameAction implements ZombieEnum {
    
    // Attributes
    public ZombieEnum.landZombie[] landZombie = ZombieEnum.landZombie.values();
    public ZombieEnum.aquaticZombie[] aquaticZombie = ZombieEnum.aquaticZombie.values();


    // Zombie Spawner
    public void zombieSpawner(Tile tile) {

        // Max of total Zombie exist at a time is 10
        if (Zombie.getZombieCount() >= 10) {
            return;
        }

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
                break;
            case 2:
                zombieMove(zombie, map, row);
                break;
            default:
                break;
        }
    }
    
    // Zombie Move for each tile
    // public void moveForward(int row, List<Zombie> zombies) {
    //     if (zombies.isEmpty()) return;
    //     if ()
    //     for(Zombie zombie : zombies) {
            
    //     }
    // }
    // Plant Spawner

    // public void moveForward(Map map, int row, int col){
    //     int newCol = col - 1;
    //     if (newCol >= 0) {
    //         map.getTile(row, col).removeZombie(this);
    //         map.getTile(row, newCol).addZombie(this);
    //         this.col = newCol;
    //     }
    // }

    // public void zombieAction(Map map, int row, int col){
    //     if (getZombieHealth() <= 125){ // pengecekan tool dan mengubah status tool
    //         setHasTool(false);
    //     }
    //     if (map.getTile(row, col).getPlant() != null){ // mengecek ada tanaman atau tidak
    //         map.getTile(row, col).getPlant().plantAttacked(getZombieAttackDamage()*getZombieAttackSpeed());
    //     } else {
    //         addCurrentMovePoints(getZombieMoveSpeed()); // movemodifier defaultnya 2 jadinya movetime setiap detik nambah 2
    //         if (getCurrentMovePoints() <= getMovePoint()){ // apakah sudah waktunya bergerak
    //             moveForward(map, row, col);
    //             resetCurrentMovePoints();
    //         }
    //     }
    // }
    // public void jumpZombie(int row, int col, Zombie zombie) {
    //     Tile currentTile = map.getTile(row, col);
        
    // }
} 
