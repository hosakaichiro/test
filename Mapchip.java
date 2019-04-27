import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MapChip extends JPanel{

	
	
	try{
		File file = new File("C:\\java_pre\\app\\キャラチップ\\キャラチップ\\pipo-charachip021b.png");
		BufferedImage image = ImageIO.read(file);
		
	}catch(IOException e){
		
	}
	System.out.println("hosaka");
	

}