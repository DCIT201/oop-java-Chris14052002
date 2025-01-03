package avrms;

public class Customer implements LoyaltyProgram {
    private String customerId;
    private String firstName;
    private String lastName;
    private String contactInfo;
    private String address;
    private int rentalPoints;
    private Boolean hasLicense;
    
    public Customer(
            String customerId, 
            String firstName, 
            String lastName, 
            String contactInfo, 
            String address, 
            int rentalPoints, 
            Boolean hasLicense
    ){
            this.customerId = customerId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.contactInfo = contactInfo;
            this.address = address;
            this.rentalPoints = rentalPoints;
            this.hasLicense = hasLicense;
    }
    
    /******************************
                Getters
    *******************************/
    public String getCustomerId() { return this.customerId; }
    
    public String getFirstName() { return this.firstName; }
    
    public String getLastName() { return this.lastName; }
    
    public String getContactInfo() { return this.contactInfo; }
    
    public int getRentalPoints() { return this.rentalPoints; }
    
    public String getAddress() { return this.address; }
    
    public Boolean getHasLicense() { return this.hasLicense; }
    
    /******************************
                Setters
    *******************************/
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    
    public void setFirstName(String firstName) { this.firstName = firstName; }
    
    public void setLastName(String lastName) { this.lastName = lastName; }
    
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }
    
    public void setRentalPoints(int rentalPoints ){ this.rentalPoints = rentalPoints; }
    
    public void setAddress(String address) { this.address = address; }
    
    public void setHasLicense(boolean hasLicense) { this.hasLicense = hasLicense; }
    
    //Eligibility check
    public String checkEligibility(){
        // Check if a customer is eligible to drive
        if(this.hasLicense){
            return "You can rent a vehicle stay safe out there :)";
        } else {
            return "You cannot rent a vehicle get a license first :(";
        }
    }
    
    //Loyalty program implementation
    @Override
    public String putOnLoyaltyProgram(){
        // Check the rentalPoints of a customer if he deserves to be put on a loyalty program
        if(this.rentalPoints >= 10) {
            return "You have earned a free rental according to your current points";
        } else {
            return "You haven't earned the required points to be put on a loyalty program";
        }
    }

}
