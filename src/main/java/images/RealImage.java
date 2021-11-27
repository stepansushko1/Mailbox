package images;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RealImage implements Image{

    public String fileName;

    private void loadFromDisk() {
        System.out.println(this.fileName + " file was uploaded from the disk!");
    }

    public RealImage(String path){
        this.fileName = path;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("The Real Image is uploaded!");
    }
}
