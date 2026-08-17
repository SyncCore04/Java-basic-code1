package com.heroarena;

import java.util.Random;

/**
 * 刺客子类：高风险高回报，25%概率闪避反击
 * 闪避只在被攻击时触发；主动攻击时正常造成基础攻击力伤害
 */
public class Assassin extends Hero {

    private static final double DODGE_RATE = 0.25;   // 闪避概率 25%
    private static final int COUNTER_DAMAGE = 15;    // 闪避反击伤害

    public Assassin(String name) {
        super(name, 120, 25); // 初始血量120，基础攻击力25
    }

    @Override
    public void attack(Hero target) {
        // 主动攻击时正常造成基础攻击力伤害
        System.out.println("刺客【" + name + "】对【" + target.getName()
                + "】发动攻击，造成" + baseAttack + "点伤害！");
        // 【多态】target 可能是任意 Hero 子类，takeDamage 会执行对应子类的重写版本
        target.takeDamage(baseAttack, this);
    }

    @Override
    public void takeDamage(int damage, Hero attacker) {
        Random rand = new Random();
        if (rand.nextDouble() < DODGE_RATE) {
            // 触发闪避反击：完全不受伤害，并立刻对攻击者造成15点额外反击伤害
            System.out.println("刺客【" + name + "】触发闪避反击！完美躲过【"
                    + attacker.getName() + "】的攻击，并反击造成"
                    + COUNTER_DAMAGE + "点伤害！");
            // 直接扣攻击者血量（反击伤害不再触发对方闪避，避免递归）
            attacker.hp = Math.max(0, attacker.hp - COUNTER_DAMAGE);
        } else {
            // 未闪避，正常扣血
            this.hp = Math.max(0, this.hp - damage);
        }
    }
}
