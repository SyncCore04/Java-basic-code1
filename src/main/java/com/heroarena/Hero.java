package com.heroarena;

/**
 * 英雄抽象父类
 * 【多态】所有职业英雄都继承自 Hero，可用 Hero 类型统一引用任意子类对象
 */
public abstract class Hero {

    protected String name;       // 英雄名称
    protected int hp;            // 当前血量
    protected int maxHp;         // 最大血量
    protected int baseAttack;    // 基础攻击力

    public Hero(String name, int hp, int baseAttack) {
        this.name = name;
        this.maxHp = hp;
        this.hp = hp;
        this.baseAttack = baseAttack;
    }

    /**
     * 抽象攻击方法，由各子类实现具体攻击逻辑
     * 【多态】通过 Hero 引用调用此方法时，实际执行的是子类重写后的版本
     */
    public abstract void attack(Hero target);

    /**
     * 受击方法，默认直接扣血；子类可重写（如刺客实现闪避反击）
     *
     * @param damage   受到的伤害值
     * @param attacker 攻击者引用，用于反击等场景
     */
    public void takeDamage(int damage, Hero attacker) {
        this.hp = Math.max(0, this.hp - damage);
    }

    /**
     * 判断英雄是否存活
     */
    public boolean isAlive() {
        return this.hp > 0;
    }

    /**
     * 生成血量条：每20点血显示一格[████]，剩余不足一格用[█]，空血用[ ]
     */
    public String getHpBar() {
        int fullBlocks = hp / 20;
        int remainder = hp % 20;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fullBlocks; i++) {
            sb.append("[████]");
        }
        if (remainder > 0) {
            sb.append("[█]");
        }
        if (hp == 0) {
            sb.append("[ ]");
        }
        return sb.toString();
    }

    // ===== Getter =====
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getBaseAttack() {
        return baseAttack;
    }
}
