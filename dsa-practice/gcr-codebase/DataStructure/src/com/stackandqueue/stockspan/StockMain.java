package com.stackandqueue.stockspan;

public class StockMain{
public static void main(String[] args) {
	
	StockSpanProblem  s =  new StockSpanProblem();
	
    int[] price = {100, 80, 60, 70, 60, 75, 85};

    int[] span = s.calculateSpan(price);

    System.out.print("Stock Span: ");
    for (int a : span) {
        System.out.print(a + " ");
    }
} 
}