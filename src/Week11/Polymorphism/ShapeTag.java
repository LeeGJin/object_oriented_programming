package Week11.Polymorphism;

public class ShapeTag {
    private String tag;

    public ShapeTag(String tag) { this.tag = tag; }
    public String getShapeTag() { return tag; }

    @Override
    public String toString() {
        return "#" + tag;
    }
}
