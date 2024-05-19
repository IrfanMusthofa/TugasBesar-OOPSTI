package com.pvzgame.ZombieFactory;
import com.pvzgame.Zombie.BucketHeadZombie;

public class BucketHeadZombieFactory implements ZombieFactory<BucketHeadZombie> {
    @Override
    public BucketHeadZombie create(int birthTime, int currentRow) {
        return new BucketHeadZombie(birthTime, currentRow);
    }
}