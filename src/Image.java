import interfaces.Element;

public class Image implements Element {
    public String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void add() {

    }

    @Override
    public void remove() {

    }

    @Override
    public int get() {
        return 0;
    }

    public void print() {
        System.out.println("Image with name: " + imageName);
    }
}
