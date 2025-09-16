package org.example.models;

public class Theatre {
    Row row1 = new Row();
    Row row2 = new Row();
    Row row3 = new Row();
    Row row4 = new Row();
    Row row5 = new Row();
    Row row6 = new Row();
    Row row7 = new Row();
    Row row8 = new Row();
    Row row9 = new Row();
    Row row10 = new Row();
    Row row11 = new Row();
    Row row12 = new Row();

    public Theatre(){}

    public Row getRow1() {
        return row1;
    }


    public Row getRow2() {
        return row2;
    }


    public Row getRow3() {
        return row3;
    }


    public Row getRow4() {
        return row4;
    }


    public Row getRow5() {
        return row5;
    }


    public Row getRow6() {
        return row6;
    }


    public Row getRow7() {
        return row7;
    }


    public Row getRow8() {
        return row8;
    }


    public Row getRow9() {
        return row9;
    }


    public Row getRow10() {
        return row10;
    }


    public Row getRow11() {
        return row11;
    }


    public Row getRow12() {
        return row12;
    }

    @Override
    public String toString(){
        return
                "      A   B   C   D   E   F   G   H   I   J   K   L   M   N" + "\n" +
                        " 1 | " + row1.toString() + "\n" +
                        " 2 | " + row2.toString() + "\n" +
                        " 3 | " + row3.toString() + "\n" +
                        " 4 | " + row4.toString() + "\n" +
                        " 5 | " + row5.toString() + "\n" +
                        " 6 | " + row6.toString() + "\n" +
                        " 7 | " + row7.toString() + "\n" +
                        " 8 | " + row8.toString() + "\n" +
                        " 9 | " + row9.toString() + "\n" +
                        "10 | " + row10.toString() + "\n" +
                        "11 | " + row11.toString() + "\n" +
                        "12 | " + row12.toString() + "\n";
    }
}
