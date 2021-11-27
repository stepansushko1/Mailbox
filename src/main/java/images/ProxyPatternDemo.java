package images;

public class ProxyPatternDemo {
    public static void main(String[] args){
        String demoFileName = "test.png";
        ProxyImage proxyImg = new ProxyImage(demoFileName);
        proxyImg.display();
    }
}
