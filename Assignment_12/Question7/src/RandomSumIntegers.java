import java.util.Random;
import java.util.stream.Stream;

public class RandomSumIntegers {

	public static void main(String[] args) {
		Random r = new Random();

		Stream<Integer> strm4 = Stream.generate(() -> r.nextInt(10)).limit(10);
		strm4.forEach(ele -> System.out.println(ele));

	}

}
