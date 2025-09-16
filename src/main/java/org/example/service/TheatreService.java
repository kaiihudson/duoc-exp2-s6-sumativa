package org.example.service;

import org.example.models.Column;
import org.example.models.Row;
import org.example.models.Theatre;

public class TheatreService {
    public static boolean verifySeat(Row row, Column seat) {
        return switch (seat) {
            case COLUMN_A -> row.isSeat1();
            case COLUMN_B -> row.isSeat2();
            case COLUMN_C -> row.isSeat3();
            case COLUMN_D -> row.isSeat4();
            case COLUMN_E -> row.isSeat5();
            case COLUMN_F -> row.isSeat6();
            case COLUMN_G -> row.isSeat7();
            case COLUMN_H -> row.isSeat8();
            case COLUMN_I -> row.isSeat9();
            case COLUMN_J -> row.isSeat10();
            case COLUMN_K -> row.isSeat11();
            case COLUMN_L -> row.isSeat12();
            case COLUMN_M -> row.isSeat13();
            case COLUMN_N -> row.isSeat14();
        };
    }
    public static Row verifyRow(int row, Theatre theatre) throws Exception {
        return switch (row){
            case 1 -> theatre.getRow1();
            case 2 -> theatre.getRow2();
            case 3 -> theatre.getRow3();
            case 4 -> theatre.getRow4();
            case 5 -> theatre.getRow5();
            case 6 -> theatre.getRow6();
            case 7 -> theatre.getRow7();
            case 8 -> theatre.getRow8();
            case 9 -> theatre.getRow9();
            case 10 -> theatre.getRow10();
            case 11 -> theatre.getRow11();
            case 12 -> theatre.getRow12();
            default -> throw new Exception("Fila "+ row +" no Valida");
        };
    }
    public static Column parseColumn(char column) {
        return switch (column) {
            case 'a' -> Column.COLUMN_A;
            case 'b' -> Column.COLUMN_B;
            case 'c' -> Column.COLUMN_C;
            case 'd' -> Column.COLUMN_D;
            case 'e' -> Column.COLUMN_E;
            case 'f' -> Column.COLUMN_F;
            case 'g' -> Column.COLUMN_G;
            case 'h' -> Column.COLUMN_H;
            case 'i' -> Column.COLUMN_I;
            case 'j' -> Column.COLUMN_J;
            case 'k' -> Column.COLUMN_K;
            case 'l' -> Column.COLUMN_L;
            case 'm' -> Column.COLUMN_M;
            case 'n' -> Column.COLUMN_N;
            default -> null;
        };
    }
    private static void takeSeat(Row row, int index){
        switch (index) {
            case 1 -> row.setSeat1(true);
            case 2 -> row.setSeat2(true);
            case 3 -> row.setSeat3(true);
            case 4 -> row.setSeat4(true);
            case 5 -> row.setSeat5(true);
            case 6 -> row.setSeat6(true);
            case 7 -> row.setSeat7(true);
            case 8 -> row.setSeat8(true);
            case 9 -> row.setSeat9(true);
            case 10 -> row.setSeat10(true);
            case 11 -> row.setSeat11(true);
            case 12 -> row.setSeat12(true);
            case 13 -> row.setSeat13(true);
            case 14 -> row.setSeat14(true);
        }
    }
    private static void releaseSeat(Row row, int index){
        switch (index) {
            case 1 -> row.setSeat1(false);
            case 2 -> row.setSeat2(false);
            case 3 -> row.setSeat3(false);
            case 4 -> row.setSeat4(false);
            case 5 -> row.setSeat5(false);
            case 6 -> row.setSeat6(false);
            case 7 -> row.setSeat7(false);
            case 8 -> row.setSeat8(false);
            case 9 -> row.setSeat9(false);
            case 10 -> row.setSeat10(false);
            case 11 -> row.setSeat11(false);
            case 12 -> row.setSeat12(false);
            case 13 -> row.setSeat13(false);
            case 14 -> row.setSeat14(false);
        }
    }
    private static int parseColumnsToInt(Column column) {
        return switch (column){
            case COLUMN_A -> 1;
            case COLUMN_B -> 2;
            case COLUMN_C -> 3;
            case COLUMN_D -> 4;
            case COLUMN_E -> 5;
            case COLUMN_F -> 6;
            case COLUMN_G -> 7;
            case COLUMN_H -> 8;
            case COLUMN_I -> 9;
            case COLUMN_J -> 10;
            case COLUMN_K -> 11;
            case COLUMN_L -> 12;
            case COLUMN_M -> 13;
            case COLUMN_N -> 14;
        };
    }
    public static boolean checkAvailableSeat(int row, Column seat, Theatre theatre){
        Row parsedRow = null;
        boolean notAvailable = true;
        try {
            parsedRow = verifyRow(row, theatre);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        if (parsedRow != null){
            notAvailable = verifySeat(parsedRow, seat);
        }
        return notAvailable;
    }
    public static void reserveSeat(int row, Column column, Theatre theatre){
        Row parsedRow = null;
        try {
            parsedRow = verifyRow(row, theatre);
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        if (parsedRow != null) {
            takeSeat(parsedRow, parseColumnsToInt(column));
        }
    }
    public static void unreserveSeat(int row, Column column, Theatre theatre){
        Row parsedRow = null;
        try {
            parsedRow = verifyRow(row, theatre);
        } catch (Exception e){
            System.err.println(e.getMessage());
        }
        if (parsedRow != null) {
            releaseSeat(parsedRow, parseColumnsToInt(column));
        }
    }

}
