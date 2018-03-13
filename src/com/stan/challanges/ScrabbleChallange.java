/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stan.challanges;

import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author stachu
 * 
 *Challange descrption:
 *give a variable number of words
 * and create a programm that will output the word with maximum points,
 * based on following scroe system:
 * e,a,i,o,n,r,t,l,s,u - 1 point
 * d,g - 2 points
 * b,c,m,p - 3 points
 * f,h,v,w,y - 4 points
 * k - 5 points
 * j,x - 8 points
 * q,z - 10 points
 * Example:
 * input: {"This", "is", "a", "cool", "Challange"}
 * output: Challange
 */
public class ScrabbleChallange {
    private final HashMap<String, Integer> points;
    private String input;
    public ScrabbleChallange (String input)
    {
        this.points = new HashMap<String, Integer>();
        //1 pointers
        this.points.put("e", 1);
        this.points.put("a", 1);
        this.points.put("i", 1);
        this.points.put("o", 1);
        this.points.put("n", 1);
        this.points.put("r", 1);
        this.points.put("t", 1);
        this.points.put("l", 1);
        this.points.put("s", 1);
        this.points.put("u", 1);
        //2 pointers
        this.points.put("d", 2);
        this.points.put("g", 2);
        //3 pointers
        this.points.put("b", 3);
        this.points.put("c", 3);
        this.points.put("m", 3);
        this.points.put("p", 3);
        //4 pointers
        this.points.put("f", 4);
        this.points.put("h", 4);
        this.points.put("v", 4);
        this.points.put("w", 4);
        this.points.put("y", 4);
        //5 pointers
        this.points.put("k", 5);
        //8 pointers
        this.points.put("j", 8);
        this.points.put("x", 8);
        //10 pointers
        this.points.put("q", 10);
        this.points.put("z", 10);
        
        this.input = input;
    }
    public String winnerWord()
    {
        String winner="no Winner - something went wrong sorry :(";
        StringTokenizer st = new StringTokenizer(this.input, ",");
        int maxResult = 0;
        while (st.hasMoreTokens())
	{
           String temp = st.nextToken();
           int tempResult=0;
           for(int i=0; i<temp.length();i++)
           {
               char debug = temp.charAt(i);
               if(this.points.get(""+temp.charAt(i))!=null)
                   tempResult=tempResult+this.points.get(""+temp.charAt(i));
           }
           if(tempResult > maxResult)
           {
               maxResult=tempResult;
               winner = temp;
           }
               
        }
        winner = winner.replace(",", "");
        winner = winner.replace("\"", "");
        winner = winner.replace("}", "");
        winner = winner.replace("{", "");
        return winner;
    }
    
}
