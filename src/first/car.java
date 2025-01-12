package first;

public class car {
    private float height, weight;
    private String color;

    public car(float height, float weight, String color) {
        this.height = height;
        this.weight = weight;
        this.color = color;
    }

    public car() {
    }
    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void speaker(){
        System.out.println("Húuuuuuu");
    }

    @Override
    public String toString() {
        return "Xe : Height: "+height +", Weight: "+weight+", Mau sac: "+color;
    }


}
