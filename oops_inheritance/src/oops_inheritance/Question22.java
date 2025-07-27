package oops_inheritance;
import java.util.Optional;

public class Question22 {

	public static void main(String[] args) {
		String address = null;
        String output = Optional.ofNullable(address).orElse("India");

        System.out.println(output);
	}

}
