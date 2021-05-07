package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

import java.rmi.RemoteException;

public class MernisServiceAdapter implements CustomerCheckService{

    public boolean CheckIfRealPerson(Customer customer){
        KPSPublicSoapProxy client = new KPSPublicSoapProxy();
        boolean result = false;
        try{
            result = client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateOfBirth.getYear());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
