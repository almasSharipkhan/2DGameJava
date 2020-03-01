package window;

import framework.GameObject;

import java.awt.Graphics;
import java.util.LinkedList;

public class Handler {
    public LinkedList<GameObject> objects = new LinkedList<GameObject>();

    public void tick() {
        for (GameObject tempObject : objects) {
            tempObject.tick();
        }
    }

    public void render(Graphics graphics) {
        for (GameObject tempObject : objects) {
            tempObject.render(graphics);
        }
    }

    public void addObject(GameObject tempObject) {
        objects.add(tempObject);
    }

    public void removeObject(GameObject tempObject) {
        objects.remove(tempObject);
    }
}
