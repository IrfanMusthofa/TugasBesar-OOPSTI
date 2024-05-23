package com.pvzgame.Plant;
// import com.pvzgame.Tile;
// import com.pvzgame.Map;
// import com.pvzgame.Zombie.Zombie;
public class Snowpea extends Plant {

    // Constructor
    public Snowpea(int birthTime) {
        setBirthTime(birthTime);
        setPlantType(7);
        setPlantName("Snowpea");
        setIsWaterType(false);
        setSunCost(175);
        setPlantHealth(100);
        setPlantCooldown(10);
        setPlantAttackRange(-1);
        setPlantAttackDamage(25);
        setPlantAttackSpeed(4);
    }

    // public void plantAction(Map map, int row, int cols){ 
        
    //     if(inRange(map, row, cols)){
    //         Tile zombiePosition = zombiePosition(map, row, cols);
    //         List<Zombie> zombiesList =  zombiePosition.getZombies();
    //         zombiesList[0].zombieAttacked(getPlantAttackDamage());
    //         zombiesList[0].slowZombie();
    //     }
    // }

    // public boolean inRange(Map map, int row, int cols){
    //     Boolean inRange = false;
    //     for (int i = cols;i<10;i++){
    //         if(map.getTile(row,i).getZombies()!=null){
    //             inRange = true;
    //         }
    //     }
    //     return inRange;
    // }

    // public Tile zombiePosition(Map map, int row, int cols){
    //     Tile zombiePosition = null;
    //     int i = cols;
    //     while(map.getTile(row,i).getZombies()== null && i<10){ // i +1 trus sampe ketemu zombie
    //         i++;
    //     }
    //     return zombiePosition;
    // }
}
