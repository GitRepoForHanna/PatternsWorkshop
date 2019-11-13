package prototype;

public abstract class Animal {

    protected String name;
    protected String color;

    public Animal() {
    }

    public Animal(Animal target) {
        if(null != target) {
            this.name = target.getName();
            this.color = target.getColor();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Animal clone();

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Animal)) {
           return false;
        }
        Animal animal = (Animal)obj;
        return animal.getColor().equals(color) && animal.getName().equals(name);
    }
}
