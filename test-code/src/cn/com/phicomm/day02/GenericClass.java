package cn.com.phicomm.day02;

public class GenericClass<E> {

    private  E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
