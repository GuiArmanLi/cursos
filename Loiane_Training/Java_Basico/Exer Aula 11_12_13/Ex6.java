class Ex6 {
	public static void main(String[] args) {
		var raio = Integer.parseInt(args[0]);
		double area = Math.pow(raio, 2) * Math.PI;

		System.out.print("A area do circulo e: " + area);
	}
}