package ch05.exercises.game;

import java.awt.*;

/**
 * An obstacle for our game. Hedges include a rectangle shape.
 * They are built using sizes determined by the constants in the Field class.
 */
public class Hedge implements GamePiece {
    int x, y;

    // Drawing helpers
    private final Color hedgeColor = Color.GREEN.darker();
    private final int hedgeWidth = (int)(Field.TREE_WIDTH_IN_PIXELS);
    private final int hedgeHeight = (int)(hedgeWidth / 2);

    // Boundary helpers
    private Rectangle boundingBox;

    @Override
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
        boundingBox = new Rectangle(x, y, hedgeWidth, hedgeHeight);
    }

    @Override
    public int getPositionX() {
        return x;
    }

    @Override
    public int getPositionY() {
        return y;
    }

    @Override
    public Rectangle getBoundingBox() {
        return boundingBox;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(hedgeColor);
        g.fillRect(x, y, hedgeWidth, hedgeHeight);
        g.setColor(hedgeColor);
        g.fillOval(x, y, hedgeWidth, hedgeHeight);
    }

    @Override
    public boolean isTouching(GamePiece otherPiece) {
        // We don't really have any collisions to detect yet, so just return "no".
        // As we fill out all of the game pieces, we'll come back to this method
        // and provide a more useful response.
        return false;
    }
}