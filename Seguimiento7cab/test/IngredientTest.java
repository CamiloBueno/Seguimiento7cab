import model.Ingredient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class IngredientTest {

    Ingredient ingredientSetup;

    public void setup1(){
        ingredientSetup = new Ingredient();
        ingredientSetup.setName("Tomate");
        try {
            ingredientSetup.setWeight(245);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void addWeight(){
        setup1();
        try{
            ingredientSetup.addWeight(54);
            assertEquals(ingredientSetup.getWeight(), 299);
        } catch(Exception e){
            e.printStackTrace();
        }

    }

    @Test
    public void addWeight2(){
        setup1();
        boolean failed = true;
        try{
            ingredientSetup.addWeight(-100);
            failed = false;
        } catch (Exception e){
            e.printStackTrace();
        }
        assertTrue(failed);
    }

    @Test
    public void removeWeightTest(){
        setup1();
        try{
            ingredientSetup.removeWeight(45);
        }catch(Exception e){
            e.printStackTrace();
        }
        assertEquals(200, ingredientSetup.getWeight());
    }

    @Test
    public void removeWeightTest2(){
        setup1();
        boolean failed = true;
        try{
            ingredientSetup.removeWeight(-100);
            failed = false;
        }catch (Exception e){
            e.printStackTrace();
        }
        assertTrue(failed);
    }



}
