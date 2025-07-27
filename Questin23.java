package oops_inheritance;



import java.util.Optional;


class InvalidEmployeeException extends RuntimeException {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmployeeException(String message) {
        super(message);
    }
}


class Employe {
    private String name;

    public Employe(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Employee Name: " + name);
    }
}


public class Questin23 {
    public static void main(String[] args) {
        try {
            
            Employe emp = null;
            Employe validEmp = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee: Employee is null"));

            validEmp.display();
        } catch (InvalidEmployeeException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
