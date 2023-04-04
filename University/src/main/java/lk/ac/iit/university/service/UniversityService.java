package lk.ac.iit.university.service;

import lk.ac.iit.university.bean.Payment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//if thre are compilation errors, your grade will be downgraded to zero.
public class UniversityService {

    //singlton storage, simulating a repository for payments.
    static HashMap<Integer, Payment> paymentEntriesIdMap = getPaymentIdMap();

    public UniversityService() {
	super();
	if (paymentEntriesIdMap == null) {
	    paymentEntriesIdMap = new HashMap<Integer, Payment>();
	    // Creating some objects of payments while initializing
	    Payment studentPayment1 = new Payment(1, "w1234567", 100.23);
	    Payment studentPayment2 = new Payment(4, "w1234568", 200.04);
	    Payment studentPayment3 = new Payment(3, "w1234569", 8000.04);
	    Payment studentPayment4 = new Payment(2, "w1234560", 7000.21);

	    paymentEntriesIdMap.put(1, studentPayment1);
	    paymentEntriesIdMap.put(4, studentPayment2);
	    paymentEntriesIdMap.put(3, studentPayment3);
	    paymentEntriesIdMap.put(2, studentPayment4);
	}
    }

    public List<Payment> getAllPayments() {
	List<Payment> payments = new ArrayList<Payment>(paymentEntriesIdMap.values());
	return payments;
    }

    public Payment getPayment(int id) {
	Payment payment  = paymentEntriesIdMap.get(id);
	return payment;
    }

    public Payment addPayment(Payment payment) {
	payment.setId(paymentEntriesIdMap.size() + 1);
	paymentEntriesIdMap.put(payment.getId(), payment);
	return payment;
    }

    public Payment updatePayment(Payment payment) {
	if (payment.getId() <= 0) {
	    return null;
	}
	paymentEntriesIdMap.put(payment.getId(), payment);
	return payment;

    }

    public void deletePayment(int id) {
	paymentEntriesIdMap.remove(id);
    }

    public static HashMap<Integer, Payment> getPaymentIdMap() {
	return paymentEntriesIdMap;
    }

}
