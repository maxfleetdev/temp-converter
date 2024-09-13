public class Main {
    public static Window window;

    public static void main(String[] args) {
        createWindow();
    }

    public static void createWindow() {
        window = new Window(500, 100, "Temp Converter");
    }
}
