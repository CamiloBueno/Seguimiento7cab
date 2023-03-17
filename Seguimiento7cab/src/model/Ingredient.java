package model;

import Exceptions.WrongWeightException;

public class Ingredient {

    String name;
    int weight;

    public Ingredient() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) throws Exception{
        if(weight<0){
            throw new WrongWeightException();
        }
        this.weight = weight;

    }

    public void addWeight(int weight) throws Exception{
        if(weight <0){
            throw new WrongWeightException();
        }
        this.weight += weight;
    }

    public void removeWeight(int weight) throws Exception{
        if(weight <0){
            throw new WrongWeightException();
        }
        this.weight -= weight;
    }
}
