import java.util.GregorianCalendar;
public class EasyDate{
    GregorianCalendar date;
    EasyDate(){
	date = new GregorianCalendar();
    }
    EasyDate(int jour, int mois){
	date = new GregorianCalendar(annee, mois, jour);
    }
    EasyDate(int jour, int mois, int annee){
	date = new GregorianCalendar(annee, mois, jour);
    }
    String toString(){
	return date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH) +"/"+date.get(Calendar.YEAR);
    }
}
