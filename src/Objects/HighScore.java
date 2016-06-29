package Objects;

import GraphicHandler.LevelHandler;

import java.awt.*;

/**
 * Created by Anton on 09-Jun-16.
 */
public class HighScore {

    private String score;
    private Font font;

    public HighScore(int score) {
        this.score = Integer.toString(score);
        this.font = new Font("Calibri", Font.BOLD, 28);

    }

    public void tick(int score) {
        this.score = Integer.toString(score);

    }

    public void render(Graphics g) {
        g.setFont(font);
        g.setColor(Color.green);
        g.drawString(String.format("Level: %d | Score: %s", LevelHandler.getCurrentLevel(), score), 125, 30);
    }

}
