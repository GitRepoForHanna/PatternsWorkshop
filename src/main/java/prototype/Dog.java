package prototype;

public class Dog extends Animal {

    private String breed;

    public Dog() {
    }

    public Dog(Dog target) {
        super(target);
        if(null != target) {
            this.breed = target.getBreed();
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public Animal clone() {
        return new Dog(this);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color=" + color + "\n" +
                "name=" + name + "\n" +
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Dog) || !super.equals(obj))  {
            return false;
        }
        Dog dog = (Dog)obj;
        return dog.getBreed().equals(breed);
    }
}
