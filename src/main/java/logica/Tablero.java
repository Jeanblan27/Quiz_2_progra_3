package logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class Tablero {
  public static final int TAMANO = 8;
  public static final int FICHAS_BANDO = 12;

  private static final char LIBRE = '#';
  private static final chat CLARA = '.';
  private static final int[][] DIRECCIONES_REINA = {{1, 1}, {1, -1}, {-1, 1}, {-1, -1}}

  private final char[][] CASILLAS = new char[TAMANO][TAMANO];

  public Tablero() {reiniciar()} ;
}
