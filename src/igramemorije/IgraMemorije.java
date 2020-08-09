package igramemorije;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class IgraMemorije {

    public static void main(String[] args) throws InterruptedException, Exception {

        MyThread mt = new MyThread();
        Scanner s = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);

        System.out.println("Da li zelite da zapocnete igru?\n1. Da\n2. Ne");
        int odg = s.nextInt();
        if (odg == 2) {
            throw new Exception("Igra se prekida");
        }
        if (odg == 1) {
            System.out.println("Unesite vase ime...");
            String ime = ss.nextLine();
            System.out.println("Igra pocinje!");
            System.out.println(ime + " pazljivo pogledajte objekte i zapamtite boje i pozicije");
            Thread.sleep(1000);
            int br = 0;
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setTitle("Memory Game");
            f.setVisible(true);
            f.setSize(250, 250);
            f.setLocation(0, 100);
            f.add(new Krug());
            Thread.sleep(3000);

            JFrame f2 = new JFrame();
            f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f2.setTitle("Memory Game");
            f2.setVisible(true);
            f2.setSize(250, 250);
            f2.setLocation(250, 100);
            f2.add(new Krug2());
            Thread.sleep(3000);

            JFrame f3 = new JFrame();
            f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f3.setTitle("Memory Game");
            f3.setVisible(true);
            f3.setSize(250, 250);
            f3.setLocation(500, 100);
            f3.add(new Krug3());
            Thread.sleep(3000);

            JFrame f4 = new JFrame();
            f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f4.setTitle("Memory Game");
            f4.setVisible(true);
            f4.setSize(250, 250);
            f4.setLocation(750, 100);
            f4.add(new Krug4());
            Thread.sleep(3000);

            JFrame f5 = new JFrame();
            f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f5.setTitle("Memory Game");
            f5.setVisible(true);
            f5.setSize(250, 250);
            f5.setLocation(1000, 100);
            f5.add(new Krug5());
            Thread.sleep(3000);

            f.dispose();
            Thread.sleep(1000);
            f2.dispose();
            Thread.sleep(1000);
            f3.dispose();
            Thread.sleep(1000);
            f4.dispose();
            Thread.sleep(1000);
            f5.dispose();
            Thread.sleep(1000);

            System.out.println("Na kom mestu se nalazi CRVENI krug?\n1. \n2. \n3. \n4. \n5.");
            odg = s.nextInt();
            if (odg == 1) {
                br++;
                System.out.println("Tacno!");
            }
            if ((odg < 1) || (odg > 1)) {
                System.out.println("Netacno");
            }

            System.out.println("Na kom mestu se nalazi ZELENI krug?\n1. \n2. \n3. \n4. \n5.");
            odg = s.nextInt();
            if (odg == 4) {
                br++;
                System.out.println("Tacno!");
            }
            if ((odg < 4) || (odg > 4)) {
                System.out.println("Netacno");
            }

            System.out.println("Na kom mestu se nalazi PRAZNI krug?\n1. \n2. \n3. \n4. \n5.");
            odg = s.nextInt();
            if (odg == 3) {
                br++;
                System.out.println("Tacno!");
            }
            if ((odg < 3) || (odg > 3)) {
                System.out.println("Netacno");
            }

            System.out.println("Na kom mestu se nalazi NARANDZASTI krug?\n1. \n2. \n3. \n4. \n5.");
            odg = s.nextInt();
            if (odg == 5) {
                br++;
                System.out.println("Tacno!");
            }
            if ((odg < 5) || (odg > 5)) {
                System.out.println("Netacno");
            }

            System.out.println("Na kom mestu se nalazi PLAVI krug?\n1. \n2. \n3. \n4. \n5.");
            odg = s.nextInt();
            if (odg == 2) {
                br++;
                System.out.println("Tacno!");
            }
            if ((odg < 2) || (odg > 2)) {
                System.out.println("Netacno");
            }
            System.out.println(ime+" cestitam! imali ste "+br+" tacnih odgovora");
            
        }
    }
}
// VCRVENI       1
// PLAV0         2
//PRAZNI        3
//ZELENO        4
// NARANDZASTI   5
