package model;

import model.Signal;

enum Signal {  
	
    GREEN("绿色"), YELLOW("黄色"), RED("红色") ;
	private String name;
    private Signal(String name) {  
        this.name = name;  
    }     
}         
public class TrafficLight {  
    Signal color = Signal.YELLOW;  
    String cl = null;
    public void change() {  
        switch (color) {  
        case RED:  
            cl = Signal.GREEN.toString();  
            break;  
        case YELLOW:  
            cl =Signal.RED.values().toString();
            break;  
        case GREEN:  
            cl = Signal.YELLOW.toString();  
            break;
        default:
            cl = Signal.RED.values().toString();
        	break;
    }
        System.out.println(cl);
    }  
} 
