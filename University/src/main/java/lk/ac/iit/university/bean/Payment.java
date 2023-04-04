package lk.ac.iit.university.bean;
//if thre are compilation errors, your grade will be downgraded to zero.
public class Payment {
    // Define instance variables: "id" as int, "studentId" as String, and "amount" as double
    //Create setters and getters
    //Create class constructors 
    //One without instance variables - use keyword super() inside the constructor 
    //One with all instance varibales - use keyword super() inside the constructor 
    /**
     * Example: public test(){ supper(); }
     */

    /**
     * Example: public test(int a, int b){ super(); this.a = a; this.b = b; }
     */

	private int id;
	private String studentId;
	private double amount;

	public Payment(){
		super();
	}

	public Payment(int id, String studentId, double amount) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	//the equals and tostring code shown below are correct.
    
    @Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	final Payment other = (Payment) obj;
	return this.id == other.id;
    }

    @Override
    public String toString() {
	return "Payment{" + "id=" + id + ", studentId=" + studentId + ", amount=" + amount + '}';
    }
}
