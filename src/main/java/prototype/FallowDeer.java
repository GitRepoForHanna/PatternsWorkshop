package prototype;

public class FallowDeer extends Animal {

    private int spotCount;

    public FallowDeer() {

    }

    public FallowDeer(FallowDeer target) {
        super(target);
        if(null != target) {
            this.spotCount = target.getSpotCount();
        }
    }

    public int getSpotCount() {
        return spotCount;
    }

    public void setSpotCount(int spotCount) {
        this.spotCount = spotCount;
    }

    @Override
    public Animal clone() {
        return new FallowDeer(this);
    }

    @Override
    public String toString() {
        return "FallowDeer{" +
                "spotCount=" + spotCount +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof FallowDeer) || !super.equals(obj)) {
            return false;
        }
        FallowDeer fallowDeer = (FallowDeer)obj;
        return fallowDeer.getSpotCount() == spotCount;
    }
}
