package first;

public class tesla extends car implements Comparable<tesla>{
    private float batteryCapacity;

    public tesla(float height, float weight, String color, float batteryCapacity) {

        super(height, weight, color);
        this.batteryCapacity = batteryCapacity;

    }

    public tesla(){

    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBattery Capacity: " + batteryCapacity;
    }


    @Override
    public int compareTo(tesla o) {
        return Float.compare(o.getBatteryCapacity(), batteryCapacity)*-1;
    }
}
