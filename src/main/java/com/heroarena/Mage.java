package com.heroarena;

/**
 * 法师子类：高爆发，血量脆弱，攻击附带魔法灼烧真实伤害
 */
public class Mage extends Hero {

    private static final int BURN_DAMAGE = 5; // 魔法灼烧额外真实伤害

    public Mage(String name) {
        super(name, 100, 30); // 初始血量100，基础攻击力30
    }

    @Override
    public void attack(Hero target) {
        // 总伤害 = 基础攻击力 + 5点真实伤害（不计算防御，直接扣血）
        int totalDamage = baseAttack + BURN_DAMAGE;
        System.out.println("法师【" + name + "】对【" + target.getName()
                + "】发动攻击，附带魔法灼烧！造成" + baseAttack + "点法术伤害 + "
                + BURN_DAMAGE + "点真实伤害，共" + totalDamage + "点！");
        // 【多态】target 可能是任意 Hero 子类，takeDamage 会执行对应子类的重写版本
        target.takeDamage(totalDamage, this);
    }
}
