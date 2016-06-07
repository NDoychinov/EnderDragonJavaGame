package Objects;

import Game.Game;
import GraphicHandler.PlatformHandler;

import java.awt.*;
import java.util.Random;

public class Platform {
    private int x;
    private int y;
    private int width;
    private int height;
    private boolean spawnedNewPlat = false;

    public Platform(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle getBounds() {
        return new Rectangle(this.x, this.y, this.width, this.height);
    }
    public Rectangle getTopBounds() {
        return new Rectangle(this.x, this.y, this.width, 10);
    }
    public Rectangle getBotBounds() {
        return new Rectangle(this.x, this.y+this.height-10, this.width, 10);
    }
    public Rectangle getJumpingBounds() {
        return new Rectangle(this.x, this.y-20, this.width, this.height+20);
    }

    public void tick() {
        y+=6;
        if (this.y>Game.HEIGHT){
            PlatformHandler.removeObject(this);
        }
//        if (this.y>Game.HEIGHT/4 && !spawnedNewPlat){
//            PlatformHandler.addRandomPlatform(this.y);
//            spawnedNewPlat = true;
//        }
    }

    public void render(Graphics g) {
        Color myColour = new Color(0, 0, 0, 127);
        g.setColor(myColour);
        g.fillRect(x, y, this.width, this.height);
    }


}
