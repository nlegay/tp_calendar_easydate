import java.util.Random;
import java.util.GregorianCalendar;
import java.util.Calendar;
public class EssaiCalendar{
    public static void main(String[] args){
    	Random r = new Random();
    	int jour = 0;
    	int mois = 0;
    	
		GregorianCalendar date = new GregorianCalendar();
		System.out.println("Date du jour: "+date.get(Calendar.DAY_OF_MONTH)+"/"+(date.get(Calendar.MONTH)+1)+"/"+date.get(Calendar.YEAR));
		
    	jour = r.nextInt(31)+1;
    	GregorianCalendar date1990 = new GregorianCalendar(1990, 11, jour);
    	System.out.println("Date de 1990: "+date1990.get(Calendar.DAY_OF_MONTH)+"/"+(date1990.get(Calendar.MONTH)+1)+"/"+date1990.get(Calendar.YEAR));
    	
    	jour = r.nextInt(31)+1;
    	GregorianCalendar date2010 = new GregorianCalendar(2010, 0, jour);
    	System.out.println("Date de 2010: "+date2010.get(Calendar.DAY_OF_MONTH)+"/"+(date2010.get(Calendar.MONTH)+1)+"/"+date2010.get(Calendar.YEAR));
    	
    	mois = r.nextInt(12); // les mois commencent a 0
    	do{
    		jour = r.nextInt(31)+1;
    	}while(jour > new GregorianCalendar(date.get(Calendar.YEAR), mois, 1).getActualMaximum(Calendar.DAY_OF_MONTH));
    	GregorianCalendar dateNow = new GregorianCalendar(date.get(Calendar.YEAR), mois, jour);
	
    	System.out.println("Premi�re date de l'annee courante: "+dateNow.get(Calendar.DAY_OF_MONTH)+"/"+(dateNow.get(Calendar.MONTH)+1)+"/"+dateNow.get(Calendar.YEAR));
    	
    	mois = r.nextInt(12); // les mois commencent a 0
    	do{
    		jour = r.nextInt(31)+1;
    	}while(jour > new GregorianCalendar(date.get(Calendar.YEAR), mois, 1).getActualMaximum(Calendar.DAY_OF_MONTH));
    	GregorianCalendar dateNow2 = new GregorianCalendar(date.get(Calendar.YEAR), mois, jour);
	
    	System.out.println("Deuxi�me date de l'annee courante: "+dateNow2.get(Calendar.DAY_OF_MONTH)+"/"+(dateNow2.get(Calendar.MONTH)+1)+"/"+dateNow2.get(Calendar.YEAR));
    	
    	if(dateNow.compareTo(dateNow2) == 1){
    		System.out.println("La deuxi�me date pr�c�de la premi�re.");
    	}else if(dateNow.compareTo(dateNow2) == -1){
    		System.out.println("La premi�re date pr�c�de la deuxi�me.");
    	}
    	
    	long temps = new GregorianCalendar((date.get(Calendar.YEAR)), 11, 31).getTimeInMillis() - date.getTimeInMillis();
    	System.out.println(temps/(1000*60*60*24));
    }
}
