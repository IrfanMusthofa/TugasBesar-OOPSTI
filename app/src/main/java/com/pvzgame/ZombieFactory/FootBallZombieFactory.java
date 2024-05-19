package com.pvzgame.ZombieFactory;

import com.pvzgame.Zombie.FootBallZombie;

public class FootBallZombieFactory implements ZombieFactory<FootBallZombie> {
    @Override
    public FootBallZombie create(int birthTime, int currentRow) {
        return new FootBallZombie(birthTime, currentRow);
    }
}