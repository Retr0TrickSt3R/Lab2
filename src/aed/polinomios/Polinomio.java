package aed.polinomios;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;


/**
 * Operaciones sobre polinomios de una variable con coeficientes enteros.
 */
public class Polinomio {

	// Una lista de monomios -- NO CAMBIA a private; el tester necesita acceso
	PositionList<Monomio> terms;

	/**
	 * Crea un polinomio representando el valor 0.
	 */
	public Polinomio() {
		terms = new NodePositionList<>();
	}

	/**
	 * Crea un polinomio definado por una lista con monomios.
	 * @param terms una lista de monomios
	 */
	public Polinomio(PositionList<Monomio> terms) {
		this.terms = terms;
	}

	/**
	 * Crea un polinomio definado por un String.
	 * La representación del polinomio es una secuencia de monomios separados
	 * por '+' (y posiblemente con caracteres blancos).
	 * Un monomio esta compuesto por tres partes,
	 * el coefficiente (un entero), el caracter 'x' (el variable), y el exponente
	 * compuesto por un un caracter '^' seguido por un entero.
	 * Se puede omitir multiples partes de un monomio, 
	 * ejemplos:
	 * <pre>
	 * {@code
	 * new Polinomio("2x^3 + 9");
	 * new Polinomio("2x^3 + -9");
	 * new Polinomio("x");   // == 1x^1
	 * new Polinomio("5");   // == 5x^0
	 * new Polinomio("8x");  // == 8x^1
	 * new Polinomio("0");   // == 0x^0
	 * }
	 * </pre>
	 * @throws IllegalArgumentException si el argumento es malformado
	 * @param polinomio - una secuencia de monomios separados por '+'
	 */
	public Polinomio(String polinomio) {
		throw new RuntimeException("no esta implementado todavia");
	}

	/**
	 * Suma dos polinomios.
	 * @param p1 primer polinomio.
	 * @param p2 segundo polinomio.
	 * @return la suma de los polinomios.
	 */
	public static Polinomio suma(Polinomio p1, Polinomio p2) {
		return sumaResta(p1, p2, true);
	}

	/**
	 * Substraccion de dos polinomios.
	 * @param p1 primer polinomio.
	 * @param p2 segundo polinomio.
	 * @return la resta de los polinomios.
	 */
	public static Polinomio resta(Polinomio p1, Polinomio p2) {
		return sumaResta(p1, p2, false);
	}

	/**
	 * Calcula el producto de dos polinomios.
	 * @param p1 primer polinomio.
	 * @param p2 segundo polinomio.
	 * @return el producto de los polinomios.
	 */
	public static Polinomio multiplica(Polinomio p1, Polinomio p2) {
		return null;
	}

	/**
	 * Calcula el producto de un monomio y un polinomio.
	 * @param m el monomio
	 * @param p el polinomio
	 * @return el producto del monomio y el polinomio
	 */
	public static Polinomio multiplica(Monomio m, Polinomio p) {
		return null;
	}

	/**
	 * Devuelve el exponente (grado) del monomio con el mayor grado
	 * dentro del polinomio
	 * Si el polinomio es vacio (la representacion del polinomio "0") entonces
	 * el valor devuelto debe ser -1.
	 * @return el grado del polinomio
	 */
	public int grado() {
		if(terms.isEmpty()) {
			return -1;
		}

		return terms.first().element().exponente();
	}

	/**
	 * Cambia las occurrencias del variable "x" dentro el polinomio p por el polinomio arg.
	 * @return El polinomio p donde el variable "x" esta sustuido por el polinomio arg.
	 * Ejemplo:
	 * <pre>
	 * {@code
	 * Polinomio p1 = new Polinomio("2x^3 + 9");
	 * Polinomio p2 = new Polinomio("x + 1");
	 * Polinomio.componer(p1,p2) =>
	 *   2 * (x+1)^3 + 9 = 2x^3 + 6x^2 + 6x^1 + 11
	 * }
	 * </pre>
	 *
	 */
	public static Polinomio componer(Polinomio p, Polinomio arg) {
		return null;
	}

	/**
	 * Calcula el derivado de un polinomio.
	 * @return el polinomio representando el derivado.
	 */
	public Polinomio derivada() {
		PositionList<Monomio> termsResult = new NodePositionList<>();

		for(Monomio mon : terms) {
			int exp = mon.exponente()-1;

			if(exp==-1) {
				continue;
			}

			int coef = mon.coeficiente()*mon.exponente();

			termsResult.addLast(new Monomio(coef, exp));
		}

		return new Polinomio(termsResult);
	}

	@Override
	public int hashCode() {
		return terms.hashCode();
	}

	@Override
	public String toString() {
		if (terms.isEmpty()) return "0";
		else {
			StringBuffer buf = new StringBuffer();
			Position<Monomio> cursor = terms.first();
			while (cursor != null) {
				Monomio p = cursor.element();
				int coef = p.coeficiente();
				int exp = p.exponente();
				buf.append(new Integer(coef).toString());
				if (exp > 0) {
					buf.append("x");
					buf.append("^");
					buf.append(new Integer(exp)).toString();
				}
				cursor = terms.next(cursor);
				if (cursor != null) buf.append(" + ");
			}
			return buf.toString();
		}
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Polinomio)) {
			return false;
		}

		Polinomio pol = (Polinomio) obj;

		return pol.terms.equals(this.terms);
	}


	private static Polinomio sumaResta(Polinomio p1, Polinomio p2, boolean esSuma) {
		PositionList<Monomio> termsResult = new NodePositionList<>();

		if(esVacio(p1)) {
			for(Monomio mon : p2.terms) {
				termsResult.addLast(
						new Monomio(((esSuma) ? 1 : -1)*mon.coeficiente(), mon.exponente()));
			}

			return new Polinomio(termsResult);
		}

		if(esVacio(p2)) {
			for(Monomio mon : p2.terms) {
				termsResult.addLast(
						new Monomio(mon.coeficiente(), mon.exponente()));
			}

			return new Polinomio(termsResult);
		}

		Position<Monomio> posMon1 = p1.terms.first();
		Position<Monomio> posMon2 = p2.terms.first();

		while(posMon1 != null && posMon2 != null) {
			Monomio mon1=posMon1.element();
			Monomio mon2=posMon2.element();

			if(mon1.exponente()>mon2.exponente()) {
				termsResult.addLast(new Monomio(mon1.coeficiente(), mon1.exponente()));
				posMon1 = p1.terms.next(posMon1);
			}
			else if(mon1.exponente()<mon2.exponente()) {
				termsResult.addLast(new Monomio(((esSuma) ? 1 : -1)*mon2.coeficiente(), mon2.exponente()));
				posMon2 = p2.terms.next(posMon2);
			}
			else {
				if(esSuma || !EsCero(mon1.coeficiente(), mon2.coeficiente(), (t, u) -> t-u)) {
					termsResult.addLast(
							new Monomio((esSuma) ? mon1.coeficiente()+mon2.coeficiente():mon1.coeficiente()-mon2.coeficiente()
									, mon1.exponente()));
				}
				
				posMon1 = p1.terms.next(posMon1);
				posMon2 = p2.terms.next(posMon2);
			}
		}

		return new Polinomio(termsResult);
	}

	private static boolean EsCero(int coef1, int coef2, BiFunction<Integer, Integer, Integer> fun) {
		return fun.apply(coef1, coef2) == 0;
	}

	private static boolean esVacio(Polinomio pol) {
		return pol.terms.isEmpty();
	}
}
