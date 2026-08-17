package com.heroarena;

import java.util.Random;

/**
 * 战士子类：皮厚血多，输出稳定，30%概率暴击
 */
public class Warrior extends Hero {

    private static final double CRIT_RATE = 0.3;       // 暴击概率 30%
    private static final double CRIT_MULTIPLIER = 1.8; // 暴击伤害倍率

    public Warrior(String name) {
        super(name, 150, 20); // 初始血量150，基础攻击力20
    }

    @Override
    public void attack(Hero target) {
        Random rand = new Random();
        int damage;
        if (rand.nextDouble() < CRIT_RATE) {
            // 触发暴击：基础攻击力 * 1.8
            damage = (int) (baseAttack * CRIT_MULTIPLIER);
            System.out.println("战士【" + name + "】对【" + target.getName()
                    + "】发动攻击，触发暴击！造成" + damage + "点伤害！");
        } else {
            damage = baseAttack;
            System.out.println("战士【" + name + "】对【" + target.getName()
                    + "】发动攻击，造成" + damage + "点伤害！");
        }
        // 【多态】target 可能是任意 Hero 子类，takeDamage 会执行对应子类的重写版本
        target.takeDamage(damage, this);
    }
}
