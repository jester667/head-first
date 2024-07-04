package com.example.headfirst.strategy.knight;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Character {
    private WeaponBehavior weaponBehavior;

    public void performUseWeapon() {
        weaponBehavior.useWeapon();
    }
    abstract void fight();

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
