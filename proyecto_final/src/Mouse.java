import java.awt.MouseInfo;
import java.awt.Point;

public class Mouse implements Imetodos{
    public int posX, posY;
    @Override
    public int thisX() {
        Point posMaus=MouseInfo.getPointerInfo().getLocation();
        posX=(int)posMaus.getX();
        return posX;        
    }

    @Override
    public int thisY() {
        Point posMaus=MouseInfo.getPointerInfo().getLocation();
        posY=(int)posMaus.getY();
        return posY;
    }
}
