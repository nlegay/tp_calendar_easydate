import java.util.Random;
import java.util.GregorianCalendar;
import java.util.Calendar;
public class EssaiCalendar{
    public static void main(String[] args){
	Random r = new Random();
	int jour = 0;
	/*
	GregorianCalendar date=new GregorianCalendar();
	System.out.println("Date du jour: "+date.get( Calendar.DAY_OF_MONTH )+"/"+date.get( Calendar.MONTH ) +"/"+date.get( Calendar.YEAR ));
	*/
	int mois = r.nextInt(11);
	do{
	    jour = r.nextInt(30)+1;
	}while(jour > new GregorianCalendar(1990, mois, 1).getActualMaximum(Calendar.DAY_OF_MONTH));
	GregorianCalendar date = new GregorianCalendar(1990, mois, jour);
	
	System.out.println("Date du jour: "+date.get( Calendar.DAY_OF_MONTH )+"/"+date.get( Calendar.MONTH ) +"/"+date.get( Calendar.YEAR ));
	/*
	GregorianCalendar date1 = new GregorianCalendar(1990, 11, r.nextInt(30)+1);
	System.out.println(date1.get( Calendar.DAY_OF_MONTH )+"/"+date1.get( Calendar.MONTH ) +"/"+date1.get( Calendar.YEAR ));
	GregorianCalendar date2 = new GregorianCalendar(2010, 0, r.nextInt(30)+1);
	System.out.println(date2.get( Calendar.DAY_OF_MONTH )+"/"+date2.get( Calendar.MONTH ) +"/"+date2.get( Calendar.YEAR ));
	
	
	GregorianCalendar date3 = new GregorianCalendar(2016, r.nextInt(11), r.nextInt(30)+1);
	System.out.println(date3.get( Calendar.DAY_OF_MONTH )+"/"+date3.get( Calendar.MONTH ) +"/"+date3.get( Calendar.YEAR ));
	GregorianCalendar date4 = new GregorianCalendar(2016, r.nextInt(11), r.nextInt(30)+1);
	System.out.println(date4.get( Calendar.DAY_OF_MONTH )+"/"+date4.get( Calendar.MONTH ) +"/"+date4.get( Calendar.YEAR ));
	
	GregorianCalendar test = new GregorianCalendar(2016, 1, 1);
	System.out.println(test.get( Calendar.DAY_OF_MONTH )+"/"+test.get( Calendar.MONTH ) +"/"+test.get( Calendar.YEAR ));
	System.out.println("le max du mois "+test.getActualMaximum(Calendar.DAY_OF_MONTH));
	*/
	
    }
}
