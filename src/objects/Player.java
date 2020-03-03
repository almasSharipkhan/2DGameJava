package objects;

import framework.GameObject;
import framework.KeyInput;
import framework.ObjectId;

import java.awt.Graphics;
import java.awt.Color;

public class Player extends GameObject {
    private float _acceleration = 1f;
    private float _deceleration = 0.5f;
    private KeyInput keyInput;

    public Player(float x, float y, ObjectId objectId, KeyInput keyInput) {
        super(x, y, objectId);

        this.keyInput = keyInput;
    }

    @Override
    public void tick() {
        x += xVel;
        y += yVel;

        if (keyInput.keys[0]) {
            yVel -= _acceleration;
        } else if (keyInput.keys[2]) {
            yVel += _acceleration;
        } else if (!keyInput.keys[0] && !keyInput.keys[2]) {
            if (yVel > 0) {
                yVel -= _deceleration;
            }  else if (yVel < 0) {
                yVel += _deceleration;
            }
        }

        if (keyInput.keys[1]) {
            xVel -= _acceleration;
        } else if (keyInput.keys[3]) {
            xVel += _acceleration;
        } else if (!keyInput.keys[1] && !keyInput.keys[3]) {
            if (xVel > 0) {
                xVel -= _deceleration;
            }  else if (xVel < 0) {
                xVel += _deceleration;
            }
        }

        xVel = clamp(xVel, 5, -5);
        yVel = clamp(yVel, 5, -5);
    }

    private float clamp(float value, float max, float min) {
        if (value >= max) {
            value = max;
        } else if (value <= min) {
            value = min;
        }

        return value;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(Color.WHITE);
        graphics.fillRect((int) x, (int) y, 32, 32);
    }
}
