package cn.com.phicomm.day04.repeat;

public class RepeatGenericObject<T> {

    private T name;

    public RepeatGenericObject() {
    }

    public RepeatGenericObject(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RepeatGenericObject{" +
                "name=" + name +
                '}';
    }
}
