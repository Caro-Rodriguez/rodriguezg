package tareahilos;

class MasHilos {
    public static void main(String[] args) {
        System.out.println("Inicio del hilo");

        hilos hiloA = hilos.CrearHilo("Primer hilo");
        hilos hiloB = hilos.CrearHilo("Segundo hilo");
        hilos hiloC = hilos.CrearHilo("Tercer hilo");

        for (int i = 0; i < 25; i++) 
        {
            System.out.print(".");
                try {
					Thread.sleep(80);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

        }
        System.out.println("Finalizo el hilo");
    }
}

public class hilos implements Runnable 
{
	Thread hilo;

     hilos(String unHilo){
         hilo= new Thread(this,unHilo);
     }
     public static hilos CrearHilo (String otroHilo){
         hilos miHilo=new hilos(otroHilo);
         miHilo.hilo.start(); 
         return miHilo;
     }
     public void run(){
         System.out.println(hilo.getName()+" Inicio del hilo ");
         try {
             for (int i=0; i<5;i++)
             {
                 Thread.sleep(400);
                 System.out.println(hilo.getName()+ ", a iterado "+i+" veces");
             }
         }catch (InterruptedException exc){
             System.out.println(hilo.getName()+ " Hilo interrumpido");
         }
         System.out.println(hilo.getName()+" Hilo finalizado ");
     }
	
}
