package model;

import animals.Animal;

import java.util.HashMap;

public class Aviary<T extends Animal> {
    private Size size;
    private HashMap<String, T> aviaryMap = new HashMap<>();

    public Aviary(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setAviaryHashMap(HashMap<String, T> aviaryHashMap) {
        this.aviaryMap = aviaryHashMap;
    }

    public HashMap<String, T> getAviaryHashMap() {
        return aviaryMap;
    }

    public void addAnimal (T animal) {
        if(animal.getSize() == this.size){
            aviaryMap.put(animal.getName(), animal);
        }
        else {
            throw new WrongSizeException();
        }
    }

    public T getAnimal(String name) {
        return aviaryMap.get(name);
    }

    public boolean removeAnimal(String name) {
        if(aviaryMap.containsKey(name)) {
            aviaryMap.remove(name);
            return true;
        }
        else {
            return false;
        }
    }
}
