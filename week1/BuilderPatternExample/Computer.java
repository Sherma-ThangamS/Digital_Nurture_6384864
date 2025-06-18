package code.week1.BuilderPatternExample;

public class Computer {

    private final String CPU;
    private final String RAM;


    private final String storage;
    private final String graphicsCard;
    private final boolean isBluetoothEnabled;
    private final boolean isWiFiEnabled;


    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isWiFiEnabled = builder.isWiFiEnabled;
    }

    public static class Builder {

        private final String CPU;
        private final String RAM;

        private String storage = "256GB SSD";
        private String graphicsCard = "Integrated";
        private boolean isBluetoothEnabled = false;
        private boolean isWiFiEnabled = false;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Builder setWiFiEnabled(boolean isWiFiEnabled) {
            this.isWiFiEnabled = isWiFiEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer {" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", Storage='" + storage + '\'' +
                ", Graphics Card='" + graphicsCard + '\'' +
                ", Bluetooth Enabled=" + isBluetoothEnabled +
                ", WiFi Enabled=" + isWiFiEnabled +
                '}';
    }
}
