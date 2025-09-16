package org.example.common.utils;

public class Input {
    public static boolean validateCoordinate(String rawCoordinate){

        if (rawCoordinate.length() > 3 || rawCoordinate.isEmpty()){
            System.err.println("Coordenada no valida");
            return false;
        }
        char rawColumn = rawCoordinate.charAt(0);
//        Column column = null;
        int row;
        if (rawColumn >= 'a' && rawColumn <= 'n'){
//            column = TheatreService.parseColumn(rawColumn);
            String rawRow = rawCoordinate.substring(1);
            try {
                row = Integer.parseInt(rawRow);
            } catch (NumberFormatException e){
                System.err.println("La fila "+ rawRow + " no es valida para la columna "+ rawColumn);
                return false;
            }
            if (row > 14 || row <= 0) {
                System.err.println("La fila " + row + " no es valida para la columna "+ rawColumn);
                return false;
            }
            return true;
        } else {
            System.err.println("La columna "+ rawColumn + " no es valida.");
            return false;
        }
    }
}
