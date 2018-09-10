package becvkerlibreria;
/**
 * Escenario para la configuracion de un escenario
 * @author Jhon Rodriguez
 * @since 10/09/2018
 * @version 1.0
 */
import becker.robots.*;
import java.awt.Color;

public class escenario {
    private City ciudad;
    private Robot robot;
    
    /**
     * Descripcion del constructor
     */
    public escenario(){
        this.ciudad = new City();

        Wall zona1 = new Wall(ciudad, 0, 0, Direction.NORTH);
        
        for(int i = 0; i<=4; i++){
            Wall pared = new Wall(ciudad, i, 0, Direction.WEST);
        }
        
        for(int i = 0; i<=4; i++){
            Wall pared = new Wall(ciudad, i, 0, Direction.EAST);
        }
        
        for(int i = 0; i<=4; i++){
            Wall pared = new Wall(ciudad, i, 8, Direction.EAST);
        }
        
        Wall zona2 = new Wall(ciudad, 0, 2, Direction.NORTH);
        
        for(int i = 0; i<=4; i++){
            Wall pared = new Wall(ciudad, i, 2, Direction.WEST);
        }
        
        for(int i = 0; i<=4; i++){
            Wall pared = new Wall(ciudad, i, 2, Direction.EAST);
        }
        
        for(int i = 0; i<=4; i++){
            Wall pared = new Wall(ciudad, i, 8, Direction.EAST);
        }
        
        Wall zona3 = new Wall(ciudad, 0, 2, Direction.NORTH);
        
        for(int i = 0; i<=4; i++){
            Wall pared = new Wall(ciudad, i, 4, Direction.WEST);
        }
        
        for(int i = 0; i<=4; i++){
            Wall pared = new Wall(ciudad, i, 4, Direction.EAST);
        }
        
        for(int i = 0; i<=4; i++){
            Wall pared = new Wall(ciudad, i, 8, Direction.EAST);
        }
        this.robot = new Robot(ciudad, 1, 1, Direction.WEST);
        robot.setLabel("ROBOT");
        
        /*for(int i = 2; i<=6; i++){
            for(int j = 1; j<=5; j++){
                if(i==j+1){
                    Thing thing = new Thing(this.ciudad, i, j);
                    thing.getIcon().setColor(Color.WHITE);
                    thing.getIcon().setLabel("TO");
                }
            }
        }*/
    }
    
    /**
     * Descripcion del metodo
     * @param pasos descripcion del parametro
     * @return descripocion retorno
     */
    public int ejecutar(int pasos){
        this.robot.turnLeft();
        
        for(int i = 0; i < 2; i++){
            this.robot.move();
            System.out.println(this.robot.getAvenue());
            System.out.println(this.robot.getStreet());
            System.out.println(this.robot.getDirection());
        }
        return 1;
    }
    public static void main(String[] args){
        
    }
    
    // est6o es documentacion javadoc /**
    // run luego generar javadoc
}
