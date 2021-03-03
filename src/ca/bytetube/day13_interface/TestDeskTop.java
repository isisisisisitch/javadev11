package ca.bytetube.day13_interface;

public class TestDeskTop {
    public static void main(String[] args) {
        Desktop desktop = new Desktop();
        USB usb = new Mouse();
        desktop.startUp();
        desktop.useUSB(usb);
        desktop.shutDown();
    }
}
