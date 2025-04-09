package strategypattern.rendererexample;

public class ImageManager {
    private Renderer renderer;

    public void setDeviceRenderer(Renderer renderer) {
        this.renderer = renderer;
    }

    public void show() {
        renderer.showImage();
    }
}
