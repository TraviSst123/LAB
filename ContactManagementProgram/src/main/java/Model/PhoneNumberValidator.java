package Model;

public class PhoneNumberValidator {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber.replaceAll("\\s+", ""); 

        
        if (phoneNumber.length() > 11) {
            return false;
        }

     

        return true;
    }
}