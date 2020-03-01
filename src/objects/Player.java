package objects;

import framework.GameObject;
import framework.ObjectId;

import java.awt.Graphics;
import java.awt.Color;

public class Player extends GameObject {
    public Player(float x, float y, ObjectId objectId) {
        super(x, y, objectId);

        xVel = 1;
        yVel = 1;
    }

    @Override
    public void tick() {
        x += xVel;
        y += yVel;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.WHITE);
        graphics.fillRect((int) x, (int) y, 32, 32);
    }
}
