/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotavirtual;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author Colop
 */
public class AjustarImagen {
    
    public void ajustar (JLabel label, String direccion){
       label.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(direccion)).getImage()
                .getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT)));
    }
    public String Imagen(int a){
         String pokemon="/Imagenes/001.jpg";
        switch(a){
            case 1: 
                 pokemon = ("/Imagenes/001.jpg");
                break;
            case 2:
                 pokemon =("/Imagenes/002.jpg");
                break;
            case 3:
                 pokemon =("/Imagenes/003.jpg");
                break;
            case 4: 
                 pokemon =("/Imagenes/004.jpg");
                break;
            case 5:
                 pokemon =("/Imagenes/005.jpg");
                break;
            case 6:
                 pokemon =("/Imagenes/006.jpg");
                break;
            case 7: 
                 pokemon =("/Imagenes/007.jpg");
                break;
            case 8:
                 pokemon = ("/Imagenes/008.jpg");
                break;
            case 9:
                 pokemon = ("/Imagenes/009.jpg");
                break;
            case 10:
                 pokemon =("/Imagenes/010.jpg");
                break;
            case 11: 
                 pokemon = ("/Imagenes/011.jpg");
                break;
            case 12:
                 pokemon =("/Imagenes/012.jpg");
                break;
            case 13:
                 pokemon =("/Imagenes/013.jpg");
                break;
            case 14: 
                 pokemon =("/Imagenes/014.jpg");
                break;
            case 15:
                 pokemon =("/Imagenes/015.jpg");
                break;
            case 16:
                 pokemon =("/Imagenes/016.jpg");
                break;
            case 17: 
                 pokemon = ("/Imagenes/017.jpg");
                break;
            case 18:
                 pokemon =("/Imagenes/018.jpg");
                break;
            case 19:
                 pokemon = ("/Imagenes/019.jpg");
                 break;
            case 20:
                 pokemon =("/Imagenes/020.jpg");
                 break;
            case 21:
                 pokemon =("/Imagenes/021.jpg");
                break;
            case 22: 
                 pokemon =("/Imagenes/022.jpg");
                break;
            case 23:
                 pokemon =("/Imagenes/023.jpg");
                break;
            case 24:
                 pokemon = ("/Imagenes/024.jpg");
                break;
            case 25: 
                 pokemon = ("/Imagenes/025.jpg");
                break;
            case 26:
                 pokemon =("/Imagenes/026.jpg");
                break;
            case 27:
                 pokemon =("/Imagenes/027.jpg");
                break;
            case 28: 
                 pokemon = ("/Imagenes/028.jpg");
                break;
            case 29:
                 pokemon =("/Imagenes/029.jpg");
                break;
            case 30:
                 pokemon =("/Imagenes/030.jpg");
                 break;
            case 31: 
                 pokemon = ("/Imagenes/031.jpg");
                break;
            case 32:
                 pokemon = ("/Imagenes/032.jpg");
                break;
            case 33:
                 pokemon =("/Imagenes/033.jpg");
                break;
            case 34: 
                 pokemon = ("/Imagenes/034.jpg");
                break;
            case 35:
                 pokemon =("/Imagenes/035.jpg");
                break;
            case 36:
                 pokemon = ("/Imagenes/036.jpg");
                break;
            case 37: 
                 pokemon = ("/Imagenes/037.jpg");
                break;
            case 38:
                 pokemon =("/Imagenes/038.jpg");
                break;
            case 39:
                 pokemon =("/Imagenes/040.jpg");
                break;
            case 41: 
                 pokemon =("/Imagenes/041.jpg");
                break;
            case 42:
                 pokemon = ("/Imagenes/042.jpg");
                break;
            case 43:
                 pokemon =("/Imagenes/043.jpg");
                break;
            case 44: 
                 pokemon = ("/Imagenes/044.jpg");
                break;
            case 45:
                 pokemon = ("/Imagenes/045.jpg");
                break;
            case 46:
                 pokemon = ("/Imagenes/046.jpg");
                break;
            case 47: 
                 pokemon = ("/Imagenes/047.jpg");
                break;
            case 48:
                 pokemon = ("/Imagenes/048.jpg");
                break;
            case 49:
                 pokemon = ("/Imagenes/049.jpg");
                break;
            case 50:
                 pokemon = ("/Imagenes/050.jpg");
                break;
            case 51: 
                 pokemon = ("/Imagenes/051.jpg");
                break;
            case 52:
                 pokemon =("/Imagenes/052.jpg");
                break;
            case 53:
                 pokemon = ("/Imagenes/053.jpg");
                break;
            case 54: 
                 pokemon =("/Imagenes/054.jpg");
                break;
            case 55:
                 pokemon =("/Imagenes/055.jpg");
                break;
            case 56:
                 pokemon = ("/Imagenes/056.jpg");
                break;
            case 57: 
                 pokemon = ("/Imagenes/057.jpg");
                break;
            case 58:
                 pokemon =("/Imagenes/058.jpg");
                break;
            case 59:
                 pokemon = ("/Imagenes/059.jpg");
                break;
            case 60:
                 pokemon =("/Imagenes/060.jpg");
                break;
            case 61: 
                 pokemon =("/Imagenes/061.jpg");
                break;
            case 62:
                 pokemon =("/Imagenes/062.jpg");
                break;
            case 63:
                 pokemon = ("/Imagenes/063.jpg");
                break;
            case 64: 
                 pokemon = ("/Imagenes/064.jpg");
                break;
            case 65:
                 pokemon =("/Imagenes/065.jpg");
                break;
            case 66:
                 pokemon =("/Imagenes/066.jpg");
                break;
            case 67: 
                 pokemon = ("/Imagenes/067.jpg");
                break;
            case 68:
                 pokemon =("/Imagenes/068.jpg");
                break;
            case 69:
                 pokemon = ("/Imagenes/069.jpg");
                break;
            case 70:
                 pokemon = ("/Imagenes/070.jpg");
                break;
            case 71: 
                 pokemon = ("/Imagenes/071.jpg");
                break;
            case 72:
                 pokemon =("/Imagenes/072.jpg");
                break;
            case 73:
                 pokemon = ("/Imagenes/073.jpg");
                break;
            case 74: 
                 pokemon = ("/Imagenes/074.jpg");
                break;
            case 75:
                 pokemon =("/Imagenes/075.jpg");
                break;
            case 76:
                 pokemon = ("/Imagenes/076.jpg");
                break;
            case 77: 
                 pokemon =("/Imagenes/077.jpg");
                break;
            case 78:
                 pokemon =("/Imagenes/078.jpg");
                break;
            case 79:
                 pokemon =("/Imagenes/079.jpg");
                break;
            case 80:
                 pokemon = ("/Imagenes/080.jpg");
                break;
            case 81: 
                 pokemon =("/Imagenes/081.jpg");
                break;
            case 82:
                 pokemon =("/Imagenes/082.jpg");
                break;
            case 83:
                 pokemon =("/Imagenes/083.jpg");
                break;
            case 84: 
                 pokemon =("/Imagenes/084.jpg");
                break;
            case 85:
                 pokemon =("/Imagenes/085.jpg");
                break;
            case 86:
                 pokemon =("/Imagenes/086.jpg");
                break;
            case 87: 
                 pokemon = ("/Imagenes/087.jpg");
                break;
            case 88:
                 pokemon =("/Imagenes/088.jpg");
                break;
            case 89:
                 pokemon =("/Imagenes/089.jpg");
                break;
            case 90:
                 pokemon =("/Imagenes/090.jpg");
                break;
            case 91: 
                 pokemon =("/Imagenes/091.jpg");
                break;
            case 92:
                 pokemon =("/Imagenes/092.jpg");
                break;
            case 93:
                 pokemon =("/Imagenes/093.jpg");
                break;
            case 94: 
                 pokemon = ("/Imagenes/094.jpg");
                break;
            case 95:
                 pokemon =("/Imagenes/095.jpg");
                break;
            case 96:
                 pokemon =("/Imagenes/096.jpg");
                break;
            case 97: 
                 pokemon = ("/Imagenes/097.jpg");
                break;
            case 98:
                 pokemon =("/Imagenes/098.jpg");
                break;
            case 99:
                 pokemon =("/Imagenes/099.jpg");
                break;
            case 100:
                 pokemon =("/Imagenes/100.jpg");
                break;
            case 101: 
                 pokemon =("/Imagenes/101.jpg");
                break;
            case 102:
                 pokemon =("/Imagenes/102.jpg");
                break;
            case 103:
                 pokemon = ("/Imagenes/103.jpg");
                break;
            case 104: 
                 pokemon =("/Imagenes/104.jpg");
                break;
            case 105:
                 pokemon = ("/Imagenes/105.jpg");
                break;
            case 106:
                 pokemon =("/Imagenes/106.jpg");
                break;
            case 107: 
                 pokemon =("/Imagenes/107.jpg");
                break;
            case 108:
                 pokemon = ("/Imagenes/108.jpg");
                break;
            case 109:
                 pokemon = ("/Imagenes/109.jpg");
                break;
            case 110:
                 pokemon =("/Imagenes/110.jpg");
                break;
            case 111: 
                 pokemon =("/Imagenes/111.jpg");
                break;
            case 112:
                 pokemon =("/Imagenes/112.jpg");
                break;
            case 113:
                 pokemon =("/Imagenes/113.jpg");
                break;
            case 114: 
                 pokemon =("/Imagenes/114.jpg");
                break;
            case 115:
                 pokemon =("/Imagenes/115.jpg");
                break;
            case 116:
                 pokemon =("/Imagenes/116.jpg");
                break;
            case 117: 
                 pokemon =("/Imagenes/117.jpg");
                break;
            case 118:
                 pokemon =("/Imagenes/118.jpg");
                break;
            case 119:
                 pokemon =("/Imagenes/119.jpg");
                break;
            case 120:
                 pokemon =("/Imagenes/120.jpg");
                break;
            case 121: 
                 pokemon =("/Imagenes/121.jpg");
                break;
            case 122:
                 pokemon =("/Imagenes/122.jpg");
                break;
            case 123:
                 pokemon = ("/Imagenes/123.jpg");
                break;
            case 124: 
                 pokemon =("/Imagenes/124.jpg");
                break;
            case 125:
                 pokemon = ("/Imagenes/125.jpg");
                break;
            case 126:
                 pokemon =("/Imagenes/126.jpg");
                break;
            case 127: 
                 pokemon =("/Imagenes/127.jpg");
                break;
            case 128:
                 pokemon =("/Imagenes/128.jpg");
                break;
            case 129:
                 pokemon =("/Imagenes/129.jpg");
                break;
            case 130:
                 pokemon =("/Imagenes/130.jpg");
                break;
            case 131: 
                 pokemon =("/Imagenes/131.jpg");
                break;
            case 132:
                 pokemon =("/Imagenes/132.jpg");
                break;
            case 133:
                 pokemon =("/Imagenes/133.jpg");
                break;
            case 134: 
                 pokemon =("/Imagenes/134.jpg");
                break;
            case 135:
                 pokemon =("/Imagenes/135.jpg");
                break;
            case 136:
                 pokemon =("/Imagenes/136.jpg");
                break;
            case 137: 
                 pokemon =("/Imagenes/137.jpg");
                break;
            case 138:
                 pokemon = ("/Imagenes/138.jpg");
                break;
            case 139:
                 pokemon =("/Imagenes/139.jpg");
                break;
            case 140:
                 pokemon = ("/Imagenes/140.jpg");
                break;
            case 141: 
                 pokemon =("/Imagenes/141.jpg");
                break;
            case 142:
                 pokemon =("/Imagenes/142.jpg");
                break;
            case 143:
                 pokemon =("/Imagenes/143.jpg");
                break;
            case 144: 
                 pokemon =("/Imagenes/144.jpg");
                break;
            case 145:
                 pokemon = ("/Imagenes/145.jpg");
                break;
            case 146:
                 pokemon =("/Imagenes/146.jpg");
                break;
            case 147: 
                 pokemon =("/Imagenes/147.jpg");
                break;
            case 148:
                 pokemon = ("/Imagenes/148.jpg");
                break;
            case 149:
                 pokemon =("/Imagenes/149.jpg");
                break;
            case 150:
                 pokemon =("/Imagenes/150.jpg");
                break;
            case 151:
                 pokemon = ("/Imagenes/151.jpg");
                break;
            default: 
                    break;
        }
       return pokemon;
    } 
   
}
