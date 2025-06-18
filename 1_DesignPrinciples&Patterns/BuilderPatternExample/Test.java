package code.week1.BuilderPatternExample;

public class Test {
    public static void main(String[] args) {

        Computer basicComputer = new Computer.Builder("Intel i5", "8GB")
                .build();

        Computer gamingComputer = new Computer.Builder("AMD Ryzen 9", "32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setBluetoothEnabled(true)
                .setWiFiEnabled(true)
                .build();


        System.out.println("Basic Computer:\n" + basicComputer);
        System.out.println("\nGaming Computer:\n" + gamingComputer);
    }
}
