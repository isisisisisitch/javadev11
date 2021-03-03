package ca.bytetube.day13_interface;

public class Desktop {
    public void startUp(){
        System.out.println("Desktop starts");
    }


    public void shutDown(){
        System.out.println("Desktop shutDowns");
    }


    public void useUSB(USB usb){
        if (usb != null) {

        usb.open();
        //具体usb设备的功能
        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if (usb instanceof Keyboard) {
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            usb.close();
    }

    }
}
