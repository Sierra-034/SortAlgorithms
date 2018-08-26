public class Racional implements Comparator {

	private int numerator, denominator;

	public Racional() { numerator = 0; denominator = 1; }

	public Racional(int n, int d) throws Exception {
		numerator = n;
		if(d == 0)
			throw new Exception(" Denominador == 0");

		denominator = d;
	}

	public int compare(Racional operator2) {
		int first = operator2.getDenominator() * this.numerator;
		int second = this.denominator * operator2.getNumerator();

		if(first > second) return 1;
		if(first == second) return 0;
		if(first < second) return -1;

		return 0;
	}

	@Override
	public String toString() {
		float cociente = (float) numerator / denominator;
		return String.format("%.5f", cociente);
	}

	public void setNumerator(int n) { numerator = n; }
	public void setDenominator(int d) { denominator = d; }
	public int getNumerator() { return numerator; }
	public int getDenominator() { return denominator; }
}