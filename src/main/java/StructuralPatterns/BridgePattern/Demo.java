package StructuralPatterns.BridgePattern;

import StructuralPatterns.BridgePattern.devices.Device;
import StructuralPatterns.BridgePattern.devices.Radio;
import StructuralPatterns.BridgePattern.devices.Tv;
import StructuralPatterns.BridgePattern.remotes.AdvancedRemote;
import StructuralPatterns.BridgePattern.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device){
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
