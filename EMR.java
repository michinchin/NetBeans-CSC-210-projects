
package studenthealthservices;

/**
 *
 * @author Tony
 */
public class EMR {
    private String name;
    private String dob;
    private String rfv;
    private double bTemp;
    private double hRate;
    private String diagnosis;
    private String medicine;
    
    private static int patientCount = 0;

    public EMR() {
        patientCount++;
    }

    public EMR(String name, String dob) {
        this.name = name;
        this.dob = dob;
        patientCount++;
    }

    public EMR(String name, String dob, String rfv, double bTemp, double hRate, String diagnosis, String medicine) {
        this.name = name;
        this.dob = dob;
        this.rfv = rfv;
        this.bTemp = bTemp;
        this.hRate = hRate;
        this.diagnosis = diagnosis;
        this.medicine = medicine;
        patientCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getRfv() {
        return rfv;
    }

    public void setRfv(String rfv) {
        this.rfv = rfv;
    }

    public double getbTemp() {
        return bTemp;
    }

    public void setbTemp(double bTemp) {
        this.bTemp = bTemp;
    }

    public double gethRate() {
        return hRate;
    }

    public void sethRate(double hRate) {
        this.hRate = hRate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public static int getPatientCount() {
        return patientCount;
    }

    
    @Override
    public String toString() {
        return "Name             : " + name + 
               "\nDate Of Birth    : " + dob + 
               "\nReason For Visit : " + rfv + 
               "\nBody Temp        : " + bTemp + " F"+ 
               "\nHeart Rate       : " + hRate + "bpm" +  
               "\nDiagnosis        : " + diagnosis + 
               "\nMedicine         : " + medicine;
    }
    
    public boolean redFlags(){
        return this.hRate < 60 || this.hRate > 100 || this.bTemp < 97.3 || this.bTemp > 99.1;
    }
    
}
