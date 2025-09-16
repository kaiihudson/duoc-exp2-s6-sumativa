package org.example.models;

public class Row {
    boolean seat1; // column A
    boolean seat2; // column B
    boolean seat3; // column C
    boolean seat4; // column D
    boolean seat5; // column E
    boolean seat6; // column F
    boolean seat7; // column G
    boolean seat8; // column H
    boolean seat9; // column I
    boolean seat10; // column J
    boolean seat11; // column K
    boolean seat12; // column L
    boolean seat13; // column M
    boolean seat14; // column N

    public Row() {
        this.seat1 = false;
        this.seat2 = false;
        this.seat3 = false;
        this.seat4 = false;
        this.seat5 = false;
        this.seat6 = false;
        this.seat7 = false;
        this.seat8 = false;
        this.seat9 = false;
        this.seat10 = false;
        this.seat11 = false;
        this.seat12 = false;
        this.seat13 = false;
        this.seat14 = false;
    }

    public boolean isSeat1() {
        return seat1;
    }

    public void setSeat1(boolean seat1) {
        this.seat1 = seat1;
    }

    public boolean isSeat2() {
        return seat2;
    }

    public void setSeat2(boolean seat2) {
        this.seat2 = seat2;
    }

    public boolean isSeat3() {
        return seat3;
    }

    public void setSeat3(boolean seat3) {
        this.seat3 = seat3;
    }

    public boolean isSeat4() {
        return seat4;
    }

    public void setSeat4(boolean seat4) {
        this.seat4 = seat4;
    }

    public boolean isSeat5() {
        return seat5;
    }

    public void setSeat5(boolean seat5) {
        this.seat5 = seat5;
    }

    public boolean isSeat6() {
        return seat6;
    }

    public void setSeat6(boolean seat6) {
        this.seat6 = seat6;
    }

    public boolean isSeat7() {
        return seat7;
    }

    public void setSeat7(boolean seat7) {
        this.seat7 = seat7;
    }

    public boolean isSeat8() {
        return seat8;
    }

    public void setSeat8(boolean seat8) {
        this.seat8 = seat8;
    }

    public boolean isSeat9() {
        return seat9;
    }

    public void setSeat9(boolean seat9) {
        this.seat9 = seat9;
    }

    public boolean isSeat10() {
        return seat10;
    }

    public void setSeat10(boolean seat10) {
        this.seat10 = seat10;
    }

    public boolean isSeat11() {
        return seat11;
    }

    public void setSeat11(boolean seat11) {
        this.seat11 = seat11;
    }

    public boolean isSeat12() {
        return seat12;
    }

    public void setSeat12(boolean seat12) {
        this.seat12 = seat12;
    }

    public boolean isSeat13() {
        return seat13;
    }

    public void setSeat13(boolean seat13) {
        this.seat13 = seat13;
    }

    public boolean isSeat14() {
        return seat14;
    }

    public void setSeat14(boolean seat14) {
        this.seat14 = seat14;
    }

    @Override
    public String toString() {
        return
                (seat1? "[x] ": "[ ] ") +
                (seat2? "[x] ": "[ ] ") +
                (seat3? "[x] ": "[ ] ") +
                (seat4? "[x] ": "[ ] ") +
                (seat5? "[x] ": "[ ] ") +
                (seat6? "[x] ": "[ ] ") +
                (seat7? "[x] ": "[ ] ") +
                (seat8? "[x] ": "[ ] ") +
                (seat9? "[x] ": "[ ] ") +
                (seat10? "[x] ": "[ ] ") +
                (seat11? "[x] ": "[ ] ") +
                (seat12? "[x] ": "[ ] ") +
                (seat13? "[x] ": "[ ] ") +
                (seat14? "[x] ": "[ ] ");
    }
}
