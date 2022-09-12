import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Scanner;





public class BomOyunu implements KeyListener{
	public static boolean is_s_pressed= false;
	public static boolean is_q_pressed= false;
	public static boolean is_b_pressed= false;
	public static boolean is_i_pressed= false;
	
	
	
	
	public BomOyunu() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int ilkSayı=1;
		System.out.println("*********Bom Oyununa Hoş Geldiniz**********");
	    System.out.println("Başlamak için S tuşuna basınız ");
	    System.out.println("Hangi sayının katlarında bom denileceğini giriniz: ");
		Scanner numInp=new Scanner(System.in);
		int num = numInp.nextInt();
		while (true) {
		if(ilkSayı%num!=0) {
	    
	    Scanner scNew = new Scanner(System.in);
		int numInput = scNew.nextInt();
		
		
		
		if(numInput!=ilkSayı) {
			System.out.println("Kaybettin!");
			break;
		}
		} else {
			Scanner stringInput = new Scanner(System.in);
			String inpStr = stringInput.nextLine();
			if(!inpStr.toLowerCase().equals("bom")) {
				System.out.println("Kaybettin!");
				break;
			}
		}
		
		ilkSayı++;
		
		
		
		}
			
			
			
			
		System.out.println("*********Bom Oyunu Bitti**********");
			
			
			
			
		
		
		
		

	}
	
	
	public void keyPressed (KeyEvent e) {    
        if(e.getKeyCode()==83) {
        	is_s_pressed=true;
        	System.out.println("Oyun Başlıyor...");
        } else if(e.getKeyCode()==81){
        	is_q_pressed=true;
        	System.out.println("Oyundan Çıkıldı...");
        } else if(e.getKeyCode()==66) {
        	is_b_pressed = true;
        } else if(e.getKeyCode()==73) {
        	is_i_pressed=true;
        }
        else {
        	System.out.println("Geçersiz Tuş..");
        }
    }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==83) {
			is_s_pressed=false;
		} else if(e.getKeyCode()==81) {
			is_q_pressed=false;
		} else if(e.getKeyCode()==66) {
        	is_b_pressed = true;
        } else if(e.getKeyCode()==73) {
        	is_i_pressed=true;
        }
		
	}    

}
