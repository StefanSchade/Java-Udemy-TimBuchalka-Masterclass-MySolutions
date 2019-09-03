package de.stefanschade.learning.tryout.generics;

public  class  GenericContainer <T> {

    T data;

    public GenericContainer(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
