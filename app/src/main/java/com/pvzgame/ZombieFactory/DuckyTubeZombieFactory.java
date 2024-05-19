package com.pvzgame.ZombieFactory;

import com.pvzgame.Zombie.DuckyTubeZombie;

public class DuckyTubeZombieFactory implements ZombieFactory<DuckyTubeZombie> {
    @Override
    public DuckyTubeZombie create(int birthTime, int currentRow) {
        return new DuckyTubeZombie(birthTime, currentRow);
    }
}