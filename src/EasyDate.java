import java.util.GregorianCalendar;
import java.util.Calendar;
public class EasyDate{
    GregorianCalendar date;
    EasyDate(){
    	date = new GregorianCalendar();
    }
    EasyDate(int jour, int mois){
    	date = new GregorianCalendar(new GregorianCalendar().get(Calendar.YEAR), mois, jour);
    }	
    EasyDate(int jour, int mois, int annee){
    	date = new GregorianCalendar(annee, mois, jour);
    }
    EasyDate(String chaine){
    	if(chaine.length() == 10 && chaine.matches("\\d\\d.\\d\\d.\\d\\d\\d\\d")){
        	int jour = Integer.parseInt(chaine.substring(0, 2));
        	int mois = Integer.parseInt(chaine.substring(3, 5))-1;
        	int annee = Integer.parseInt(chaine.substring(6, 10));
    		date = new GregorianCalendar(annee, mois, jour);
    	}else{
    		System.out.println("Format incorrect, date non renseignée");
    	}
    }
    public String toString(){
    	if(date == null){
    		return "Date incorrecte";
    	}
    	return date.get(Calendar.DAY_OF_MONTH)+"/"+(date.get(Calendar.MONTH)+1)+"/"+date.get(Calendar.YEAR);
    }
    int compareTo(EasyDate dateAComparer){
    	return this.date.compareTo(dateAComparer.date);
    }
    boolean equals(EasyDate dateATester){
    	return this.date.equals(dateATester.date);
    }
}
