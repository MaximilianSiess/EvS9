package main.java.evs9;
import com.google.common.base.Preconditions;

public class Main {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(args[0]);
			Preconditions.checkArgument( i > 0, "i should be greater then 0!", i, 0);
		} catch (IllegalArgumentException e) {
			throw e;
		}
	}
}
