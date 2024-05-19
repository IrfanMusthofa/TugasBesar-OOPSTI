package com.pvzgame.ZombieFactory;

import com.pvzgame.Zombie.PoleVaultingZombie;

public class PoleVaultingZombieFactory implements ZombieFactory<PoleVaultingZombie> {
    @Override
    public PoleVaultingZombie create(int birthTime, int currentRow) {
        return new PoleVaultingZombie(birthTime, currentRow);
    }
}
