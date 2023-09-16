package matosbalboa007;
import robocode.*;
import java.awt.Color;

/**
 * matosbalboa007 - a class by (itallo guilherme matos do nascimento)
 */
public class matosbalboa007 extends Robot {
    public void run() {    
        setColors(Color.darkGray,Color.black,Color.lightGray,Color.red,Color.blue);
        while (true) {
			ahead(55);
		    turnRight(60); 
		}
    }
	//tank robô inimigo
   public void onScannedRobot(ScannedRobotEvent e) {
	String robotank = e.getName();   
    double distancia = e.getDistance();
	System.out.print(robotank + "distância" + distancia);
    if (distancia < 135) {
		fire(3);
	} else {
		fire(1);
	}
   }
  //colisão com a parede 
  public void onHitWall(HitWallEvent e ) {
	  back(100);
	  turnRight(90);
  }
}
