package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);

	public int type;

	private Tipo(int value) {
		this.type = value;
	}
}