package com.pvzgame.ZombieFactory;

import com.pvzgame.Zombie.DolphinRiderZombie;

public class DolphinRiderZombieFactory implements ZombieFactory<DolphinRiderZombie> {
    @Override
    public DolphinRiderZombie create(int birthTime, int currentRow) {
        return new DolphinRiderZombie(birthTime, currentRow);
    }
}
