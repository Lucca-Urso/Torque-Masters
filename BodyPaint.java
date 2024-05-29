public class BodyPaint {
    private String bodyPaintColor;

    BodyPaint(String bodyPaintColor) {
        this.bodyPaintColor = bodyPaintColor;
    }

    public String toString() {
        return String.format("\n6 - Body Paint Color: %s", bodyPaintColor);
    }
}
