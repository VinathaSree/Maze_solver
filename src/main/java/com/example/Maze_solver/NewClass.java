package com.example.Maze_solver;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class NewClass extends JFrame {
    private int maze[][] = {
            {1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,0,1,0,1,0,1,0,0,0,0,0,1},
            {1,0,1,0,0,0,1,0,1,1,1,0,1},
            {1,0,0,0,1,1,1,0,0,0,0,0,1},
            {1,0,1,0,0,0,0,0,1,1,1,0,1},
            {1,0,1,0,1,1,1,0,1,0,0,0,1},
            {1,0,1,0,1,0,0,0,1,1,1,0,1},
            {1,0,1,0,1,1,1,0,1,0,1,0,1},
            {1,0,0,0,0,0,0,0,0,0,1,9,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1}
    };
    public List<Integer> path = new ArrayList<>();
    public NewClass(){
        setTitle("Maze solver");
        setSize(640,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DepthFirst.searchPath(maze,1,1,path);
    }
    @Override
    public void paint(Graphics graphics){
        graphics.translate(50,50);
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[0].length ; j++) {
                Color color;
                switch(maze[i][j]){
                    case 1 : color = Color.BLACK;
                    break;
                    case 9 : color = Color.RED;
                    break;
                    default: color = Color.WHITE;
                    break;
                }
                graphics.setColor(color);
                graphics.fillRect(30*j,30*i,30,30);
                graphics.setColor(Color.red);
                graphics.drawRect(30*j,30*i,30,30);
            }
        }
        for (int i = 0; i < path.size() ; i+=2) {
            int pathx = path.get(i);
            int pathy = path.get(i+1);
            System.out.println("x co-ordinate "+pathx);
            System.out.println("y co-ordinate "+pathy);
            graphics.setColor(Color.GREEN);
            graphics.fillRect(30*pathx,30*pathy,30,30);
        }
    } 
}
