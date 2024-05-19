package com.pvzgame;
import com.pvzgame.Zombie.Zombie;

public class Map {
    // Attributes
    private Tile[][] tiles;
    private final int rows = 6;
    private final int cols = 11;
    
    // Constructor
    public Map() {
        tiles = new Tile[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                tiles[i][j] = new Tile(false, false, false);
            }
        }

        for (int j = 0; j < rows; j++) {
            tiles[j][0].changeProtectedAreaStatus(true);

        }

        for (int k = 0; k < rows; k++) {
            tiles[k][10].changeSpawnAreaStatus(true);
        }
    }

    // Getter
    public Tile[][] getTiles() {
        return tiles;
    }

    public Tile getTile(int row, int col) {
        return tiles[row][col];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
    
    // public void printMap(){
    //     for (int i =0;i<rows;i++){
    //         System.out.printf("///");
    //         for(int j=1;j<cols-1;j++){
                
    //             if(tiles[i][j].getPlant()!=null){
    //                 System.out.printf("[%s]",getPlant().getName());
    //             }
    //             else if(tiles[i][j].getZombies()!=null){
    //                 System.out.printf("[");
    //                 for(Zombie cekZombie : zombies){
    //                     System.out.printf("(%s)",cekZombie.getName());
    //                 }
    //                 System.out.printf("]");
    //             }
    //             else {
    //                 System.out.printf("kosong");
    //             }

    //             System.out.printf("||");
    //         }
    //         System.out.printf("...\n");
    //     }
    // }

    
}
