package com.pvzgame;

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

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
    
}
