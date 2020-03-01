package framework;

import java.awt.Graphics;

public abstract class GameObject {
    protected float x;
    protected float xVel;
    protected float y;
    protected float yVel;
    protected ObjectId objectId;

    public GameObject(float x, float y, ObjectId objectId) {
        this.x = x;
        this.y = y;
        this.objectId = objectId;
    }

    public abstract void tick();
    public abstract void render(Graphics graphics);

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getxVel() {
        return xVel;
    }

    public void setxVel(float xVel) {
        this.xVel = xVel;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getyVel() {
        return yVel;
    }

    public void setyVel(float yVel) {
        this.yVel = yVel;
    }

    public ObjectId getId() {
        return objectId;
    }

    public void setId(ObjectId objectId) {
        this.objectId = objectId;
    }
}
