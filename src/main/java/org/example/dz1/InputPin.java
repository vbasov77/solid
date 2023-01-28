package org.example.dz1;

public class InputPin implements Unlocker{
    @Override
    public void unblocking() {
        System.out.println("Гаджет разблокирован");
    }
}
