package imageviewer;

public interface Image {
    
    public String getName();
    public byte[] data();
    public Image next();
    public Image prev();
    
}
