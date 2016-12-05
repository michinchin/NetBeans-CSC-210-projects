
package studenthealthservices;

/**
 *
 * @author Tony
 */
public class StudentHealthServices {


    public static void main(String[] args) {
        System.out.println("Current Patient Count: " + EMR.getPatientCount());
        EMR[] p = new EMR[5];
     
        p[0] = new EMR();
        p[1] = new EMR("Laura", "1/1/1960");
        p[2] = new EMR("Lawrence","2/5/1981");
        p[3] = new EMR();//
        p[4] = new EMR("Rick James","12/22/1940");
        System.out.println("Current Patient Count: " + EMR.getPatientCount());
        
        /*********** SIM First Patient  ************/
        System.out.println("\n\n *** Patient 1 ***\n");
        p[1].setbTemp(99.5);
        p[1].sethRate(77.0);
        p[1].setRfv("Headaches");
        p[1].setDiagnosis("Bad Dient");
        p[1].setMedicine("Exercise and Better Deit");
        System.out.println(p[1].toString());
        /*********** SIM Second Patient ************/
        System.out.println("\n\n *** Patient 2 ***\n");
        p[2].setbTemp(98.5);
        p[2].sethRate(66.0);
        p[2].setRfv("Pain in Foot");
        p[2].setDiagnosis("Bruised Heel");
        p[2].setMedicine("Light Walking for 3 weeks.");
        System.out.println(p[2].toString());
        /*********** SIM Third Patient  ************/
        System.out.println("\n\n *** Patient 3 ***\n");
        p[4].setbTemp(101.1);
        p[4].sethRate(88.0);
        p[4].setRfv("Dizziness and Fatigue");
        p[4].setDiagnosis("Fever");
        p[4].setMedicine("Rest");
        System.out.println(p[4].toString());
        
        
    }
    
}
