package com.heroarena;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * 游戏主控类：包含 main 方法，负责菜单、选角、回合制战斗流程
 */
public class GameController {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== HeroArena 英雄竞技场 =====");
        System.out.println("请选择你的英雄：1.战士 2.法师 3.刺客");

        // ===== 输入异常处理：确保玩家输入 1/2/3 =====
        int playerChoice = 0;
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                playerChoice = Integer.parseInt(input);
                if (playerChoice >= 1 && playerChoice <= 3) {
                    break;
                } else {
                    System.out.println("输入无效，请输入 1、2 或 3：");
                }
            } catch (NumberFormatException e) {
                System.out.println("输入无效，请输入数字 1、2 或 3：");
            }
        }

        // 创建玩家英雄
        Hero player = createHero(playerChoice, "玩家");

        // 电脑从三个职业中随机选择一个
        Random rand = new Random();
        int cpuChoice = rand.nextInt(3) + 1;
        Hero cpu = createHero(cpuChoice, "电脑");

        System.out.println("\n你的英雄：" + player.getName()
                + "（血量" + player.getHp() + "，攻击" + player.getBaseAttack() + "）");
        System.out.println("电脑英雄：" + cpu.getName()
                + "（血量" + cpu.getHp() + "，攻击" + cpu.getBaseAttack() + "）");
        System.out.println("===== 战斗开始！=====\n");

        // 【多态】ArrayList<Hero> 可存储不同子类对象（Warrior / Mage / Assassin）
        ArrayList<Hero> heroList = new ArrayList<>();
        heroList.add(player);
        heroList.add(cpu);
        System.out.println("参赛英雄共 " + heroList.size() + " 名：");
        for (Hero h : heroList) {
            // 【多态】遍历调用 getName，运行时指向具体子类对象
            System.out.println("  - " + h.getName());
        }
        System.out.println();

        // ===== 回合制战斗，玩家先手 =====
        int round = 1;
        while (player.isAlive() && cpu.isAlive()) {
            System.out.println("----- 第 " + round + " 回合 -----");

            // 玩家攻击电脑
            // 【多态】通过 Hero 引用调用 attack，实际执行子类重写的攻击逻辑
            player.attack(cpu);
            if (!cpu.isAlive()) {
                System.out.println("\nVictory！你击败了" + cpu.getName() + "！");
                break;
            }

            // 电脑攻击玩家
            cpu.attack(player);
            if (!player.isAlive()) {
                System.out.println("\nDefeat！你被" + cpu.getName() + "击败了...");
                break;
            }

            // 显示双方当前血量条
            System.out.println("\n【血量状态】");
            System.out.println(player.getName() + "  " + player.getHpBar()
                    + "  " + player.getHp() + "/" + player.getMaxHp());
            System.out.println(cpu.getName() + "  " + cpu.getHpBar()
                    + "  " + cpu.getHp() + "/" + cpu.getMaxHp());
            System.out.println();

            // ===== 暂停等待玩家输入1，进行下一回合 =====
            System.out.print("输入 1 进行下一回合：");
            while (true) {
                String cmd = scanner.nextLine().trim();
                try {
                    if (Integer.parseInt(cmd) == 1) {
                        break;
                    } else {
                        System.out.print("输入无效，请输入 1 进行下一回合：");
                    }
                } catch (NumberFormatException e) {
                    System.out.print("输入无效，请输入数字 1 进行下一回合：");
                }
            }
            System.out.println();

            round++;
        }

        scanner.close();
    }

    /**
     * 根据选择编号创建对应职业的英雄对象
     * 【多态】返回类型为 Hero，实际返回的是具体子类实例
     */
    private static Hero createHero(int choice, String prefix) {
        switch (choice) {
            case 1:
                return new Warrior(prefix + "战士");
            case 2:
                return new Mage(prefix + "法师");
            case 3:
                return new Assassin(prefix + "刺客");
            default:
                return new Warrior(prefix + "战士");
        }
    }
}
