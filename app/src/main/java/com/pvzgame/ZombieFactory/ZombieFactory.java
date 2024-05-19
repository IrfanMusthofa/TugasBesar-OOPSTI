package com.pvzgame.ZombieFactory;
import com.pvzgame.Zombie.Zombie;

public interface ZombieFactory<T extends Zombie> {
    T create(int birthTime, int currentRow);
}