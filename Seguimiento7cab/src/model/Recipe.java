package model;

import java.util.ArrayList;

public class Recipe {


    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

    public Recipe() {}

    public void addIngredient(String name, int weight){

        try{
            for (int i = 0; i < ingredients.size(); i++) {

                if(ingredients.get(i).getName().equals(name)){
                    ingredients.get(i).setWeight(weight);
                    return;
                }
            }
            Ingredient ingredient = new Ingredient();
            ingredient.setName(name);
            ingredient.setWeight(weight);
            ingredients.add(ingredient);
        } catch (Exception e) {
            e.printStackTrace();//para imprimir la exception
        }
    }
    public void removeIngredient(String name) {
        for (int i = 0; i < ingredients.size(); i++) {

            if (ingredients.get(i).getName().equals(name)) {
                ingredients.remove(i);
                return;
            }
        }
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }
}
