package org.example.principles.demo4.after;

public class Test {
    public static void main(String[] args) {
        HeimaSafetyDoor door = new HeimaSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();

        System.out.println("===============");

        HaierSafetyDoor door2 = new HaierSafetyDoor();
        door2.antiTheft();
        door2.waterProof();
    }
}
