/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamelogin;

public class GameStats {
    private static GameStats instance;
    private String playerName;
    private int score;
    private int level;
    private int time;

    private GameStats() {}

    public static GameStats getInstance() {
        if (instance == null) {
            instance = new GameStats();
        }
        return instance;
    }

    // Getters and setters
    public void setStats(String name, int score, int level, int time) {
        this.playerName = name;
        this.score = score;
        this.level = level;
        this.time = time;
    }

    public String getPlayerName() { return playerName; }
    public int getScore() { return score; }
    public int getLevel() { return level; }
    public int getTime() { return time; }
}
