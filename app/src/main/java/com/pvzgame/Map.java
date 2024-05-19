package com.pvzgame;
import com.pvzgame.Zombie.*;

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

        // Protected Area
        for (int j = 0; j < rows; j++) {
            tiles[j][0].setProtectedAreaStatus(true);

        }

        // Spawn Area
        for (int k = 0; k < rows; k++) {
            tiles[k][10].setSpawnAreaStatus(true);
        }

        // Water Area
        for (int l = 2; l < 4; l++) {
            for (int m = 1; m < 10; m++) {
                tiles[l][m].setWaterStatus(true);
            }
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

    public void printMap() {
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols - 1 ; j++) {
                synchronized(tiles[i][j]) {
                    System.out.print("["); // Opening bracket
                    
                    // Water or Land
                    if (tiles[i][j].getWater()) System.out.print("W|"); // Water
                    else System.out.print("L|"); // Land
                    
                    if (tiles[i][j].getPlant() != null) {
                        System.out.print("P." + tiles[i][j].getPlant().getPlantType() + "|");
                    }

                    if (!tiles[i][j].getZombies().isEmpty()) {
                        for (Zombie zombiePrint : tiles[i][j].getZombies()) {
                            System.out.print("Z." + zombiePrint.getZombieType());
                            if (tiles[i][j].getZombies().get(tiles[i][j].getZombies().size()) != zombiePrint) {
                                System.out.print(" ");
                            }
                        }
                    }
                }
                System.out.print("]"); // Closing bracket
            }
            System.out.println(); // newLine
        }
    }
}