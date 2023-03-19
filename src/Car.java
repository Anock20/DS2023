public class Car implements Vehicle {
    public String type = null;
    public String color = null;
    public String name = null;

    public Car (String type, String color) {
        setColor(color);
        setType(type);
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return getColor() + " " + getType();
    }
}

