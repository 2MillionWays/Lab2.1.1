package ross.goncharuk;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Computer[] objects = new Computer[5];

        Computer mouse = new Computer();
        Computer keyboard = new Computer();
        Computer display = new Computer();
        Computer desktop = new Computer();
        Computer laptop = new Computer();

        objects[0] = mouse;
        objects[1] = keyboard;
        objects[2] = display;
        objects[3] = desktop;
        objects[4] = laptop;

        mouse.setPrice(122);
        keyboard.setPrice(234);
        display.setPrice(3546);
        desktop.setPrice(8769);
        laptop.setPrice(21231);

        for(Computer arrayElement : objects){
            arrayElement.setPrice(arrayElement.getPrice()+(arrayElement.getPrice()*10/100));
        }
        System.out.println(mouse.getPrice());
        System.out.println(laptop.getPrice());

        for(Computer arrayElement : objects){
            arrayElement.view();
        }
    }
}
