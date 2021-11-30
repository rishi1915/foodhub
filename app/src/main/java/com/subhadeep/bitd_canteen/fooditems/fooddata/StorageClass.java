package com.subhadeep.bitd_canteen.fooditems.fooddata;

import com.subhadeep.bitd_canteen.R;

import java.util.ArrayList;

/**
 * Created by rajat on 08-01-2017.
 */

public class StorageClass {

    private static ArrayList<FoodDetails> foodItems ;
    private static ArrayList<FoodDetails> foodCart ;
    public StorageClass(){

    }

    public void setCatalogData(){
        if (foodItems ==null){
            foodItems = new ArrayList<>();

            foodItems.add(new FoodDetails(50,"Burger", R.drawable.burger));
            foodItems.add(new FoodDetails(70,"Full Meals", R.drawable.vada_pav));
            foodItems.add(new FoodDetails(45,"Aloo Paratha", R.drawable.aloo_paratha));
            foodItems.add(new FoodDetails(40,"Curd Rice", R.drawable.bread_pakora));
            foodItems.add(new FoodDetails(10,"Frooti", R.drawable.cheese_sandwich));
            foodItems.add(new FoodDetails(30,"Puri", R.drawable.chole_bhature));
            foodItems.add(new FoodDetails(20,"Dosa", R.drawable.chole_kulche));
            foodItems.add(new FoodDetails(20,"Idli Sambar", R.drawable.idli_sambar));
            foodItems.add(new FoodDetails(30,"Lemon Rice", R.drawable.khamand));
            foodItems.add(new FoodDetails(40,"Masala Dosa", R.drawable.masala_dosa));
            foodItems.add(new FoodDetails(35,"Chapathi", R.drawable.paneer_paratha));
            foodItems.add(new FoodDetails(15,"Coffee", R.drawable.pav_bhaji));
            foodItems.add(new FoodDetails(50,"Cake", R.drawable.pizza));
            foodItems.add(new FoodDetails(20,"Mad Angles", R.drawable.pizza2));
            foodItems.add(new FoodDetails(25,"Vada", R.drawable.rava_dosa));
            foodItems.add(new FoodDetails(10,"Tea", R.drawable.red_pasta));
            foodItems.add(new FoodDetails(10,"Samosa", R.drawable.samosa));
            foodItems.add(new FoodDetails(50,"Veg. Sandwich", R.drawable.veg_sandwich));
            foodItems.add(new FoodDetails(70,"Ice Cream", R.drawable.white_pasta));

        }
    }

    public ArrayList<FoodDetails> getCatalogData(){
        return foodItems;
    }

    public ArrayList<FoodDetails> getFoodCart(){
        if (foodCart ==null){
            foodCart = new ArrayList<>();
        }
        return foodCart;
    }

}
