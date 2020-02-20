package org.example;

public class constructionCost{
    public static int[] materialCost = {1200, 1500, 1800, 2500};
    public static int calculateCost(int index, int total_area){
        return materialCost[index-1]*total_area;
    }
}