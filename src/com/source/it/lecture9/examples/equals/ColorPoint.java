package com.source.it.lecture9.examples.equals;

import java.awt.*;

public class ColorPoint extends Point {
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        if (!super.equals(o)) return false;
        if (!(o instanceof ColorPoint)) {
            return true;
        }
        ColorPoint that = (ColorPoint) o;

        return !(color != null ? !color.equals(that.color) : that.color != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
