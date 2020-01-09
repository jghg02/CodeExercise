package exercise;

public class TwoDimensionalArrays {


  /**
   * Implement a function that assigns correct numbers in a field of Minesweeper, which is represented as a 2 dimensional array.
   * <p>
   * The size of the field is 3x4, and there are bombs at the positions [0, 0] (row index = 0, column index = 0)&nbsp;and [0, 1] (row index = 0,
   * column index = 1).
   * Then, the resulting field should be:
   * [[-1,-1,1,0],
   * [2,2,1,0],
   * [0,0,0,0]]
   * <p>
   * Your function should return the resulting 2D array after taking the following three arguments:
   *
   * @param bombs:   A list of bomb locations.  Given as an array of arrays.  Example: [[0, 0], [0, 1]] ([row index = 0, column index = 0], [row
   *                 index = 0, column index = 1].  Assume that there are no duplicates.
   * @param numRows: The number of rows in the resulting field.
   * @param numCols: The number of columns in the resulting field.
   * @return In the resulting field:
   * -1:  represents that there is a bomb in that location.
   * 1,2,3... etc. represents that there are 1,2,3...etc. bombs in the surrounding cells (including diagonally adjacent cells).
   * 0:  represents that there are no bombs in the surrounding cells.
   */
  public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
    int[][] field = new int[numRows][numCols];

    // for each coordinate into bombs put in this fields -1 because that value represent a bomb into matrix
    for (int[] bomb : bombs) {
      int rowIndex = bomb[0]; // get a coordinate in x
      int colIndex = bomb[1]; // get a coordinate in y
      field[rowIndex][colIndex] = -1; // for each coordinate put -1 into the matrix
      /**
       * para poder saber si las posiciones adjuntas al la bomba (valor -1 dentro de la matriz)
       * es necesario poder recorrer todos los valores que son adyacentes a esa posicion dentro de la matriz
       * por esto desde la coordenada en donde esta la bomba se deben de considerar la nueva matriz que se genera
       * desde la posicion de la bomba por lo cual la condicion de los fors es hasta 2 debido que se deben de chequear los valores que estan
       * cerca de la posicion de la bomba es decir que si la bomba esta en la posicion (1,1) la matriz que se debe de evaluar para colocar
       * el valor correspondiente es:
       * recordar que en la posicion (1,1) hay una bomba
       *
       * [0,0,0]
       * [0,-1,0]
       * [0,0,0]
       *
       * por este motivo esta en el for rowIndex + 2
       *  */
      for (int i = rowIndex - 1; i < rowIndex + 2; i++) {
        for (int j = colIndex - 1; j < colIndex + 2; j++) {
          if (0 <= i && i < numRows &&
              0 <= j && j < numCols &&
              field[i][j] != -1) {
            field[i][j] += 1;
          }
        }
      }
    }

    return field;
  }

}
