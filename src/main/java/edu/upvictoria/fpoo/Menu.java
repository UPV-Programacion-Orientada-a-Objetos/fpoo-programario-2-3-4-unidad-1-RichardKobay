package edu.upvictoria.fpoo;

import edu.upvictoria.fpoo.helpers.Scanner;

public class Menu {
    void printMenu() {
        printPackages();
    }

    public void printPackages () {
        Scanner scanner = new Scanner();
        while (true) {
            System.out.println("1. Selectivas");
            System.out.println("2. Repetitivas");
            System.out.println("3. Arreglos");
            int opc = scanner.readInt("Selecciona una opción");
            if (opc >= 1 && opc <= 3) {
                if (opc == 1)
                    printFirstPackage();
                if (opc == 2)
                    printSecondPackage();
            }
        }
    }

    public void printSecondPackage () {
        Scanner scanner = new Scanner();
        while (true) {
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.println("8. ");
            System.out.println("9. ");
            System.out.println("10. ");
            System.out.println("11. ");
            System.out.println("12. ");
            System.out.println("13. ");
            System.out.println("14. ");
            System.out.println("15. ");
            System.out.println("16. ");
            System.out.println("17. ");
            System.out.println("18. ");
            System.out.println("19. ");
            System.out.println("20. ");
            System.out.println("21. ");
            System.out.println("22. ");
            System.out.println("23. ");
            System.out.println("24. ");
            System.out.println("25. ");
            System.out.println("26. ");
            System.out.println("27. ");
            System.out.println("28. ");
            System.out.println("29. ");
            System.out.println("30. ");
            System.out.println("31. ");
            System.out.println("32. ");
            System.out.println("33. ");
            System.out.println("34. ");
            System.out.println("35. ");
            System.out.println("36. ");
            System.out.println("37. ");
            System.out.println("38. ");
            System.out.println("39. Salir");
            int opc = scanner.readInt("Seleccione una opción");
            if (opc >= 1 && opc <= 39) {
                if (opc == 1) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioUno();
                if (opc == 2) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioDos();
                if (opc == 3) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioTres();
                if (opc == 4) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioCuatro();
                if (opc == 5) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioCinco();
                if (opc == 6) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioSeis();
                if (opc == 7) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioSiete();
                if (opc == 8) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioOcho();
                if (opc == 9) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioNueve();
                if (opc == 10) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioDiez();
                if (opc == 11) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioOnce();
                if (opc == 12) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioDoce();
                if (opc == 13) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioTrece();
                if (opc == 14) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioCatorce();
                if (opc == 15) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioQuince();
                if (opc == 16) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioDieciseis();
                if (opc == 17) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioDiecisiete();
                if (opc == 18) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioDieciocho();
                if (opc == 19) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioDiecinueve();
                if (opc == 20) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioVeinte();
                if (opc == 21) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioVeintiuno();
                if (opc == 22) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioVeintidos();
                if (opc == 23) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioVeintitres();
                if (opc == 24) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioVeinticuatro();
                if (opc == 25) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioVeinticinco();
                if (opc == 26) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioVeintiseis();
                if (opc == 27) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioVeintisiete();
                if (opc == 28) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioVeintiocho();
                if (opc == 29) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioVeintinueve();
                if (opc == 30) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioTreinta();
                if (opc == 31) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioTreintaYUno();
                if (opc == 32) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioTreintaYDos();
                if (opc == 33) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioTreintaYTres();
                if (opc == 34) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioTreintaYCuatro();
                if (opc == 35) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioTreintaYCinco();
                if (opc == 36) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioTreintaYSeis();
                if (opc == 37) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioTreintaYSiete();
                if (opc == 38) new edu.upvictoria.fpoo.estructuras.repetitivas.EjercicioTreintaYOcho();
                if (opc == 30) {
                    printPackages();
                    break;
                }
            }
        }
    }

    public void printFirstPackage () {
        Scanner scanner = new Scanner();
        while (true) {
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.println("8. ");
            System.out.println("9. ");
            System.out.println("10. ");
            System.out.println("11. ");
            System.out.println("12. ");
            System.out.println("13. ");
            System.out.println("14. ");
            System.out.println("15. ");
            System.out.println("16. ");
            System.out.println("17. ");
            System.out.println("18. ");
            System.out.println("19. ");
            System.out.println("20. ");
            System.out.println("21. ");
            System.out.println("22. ");
            System.out.println("23. ");
            System.out.println("24. ");
            System.out.println("25. ");
            System.out.println("26. ");
            System.out.println("27. ");
            System.out.println("28. ");
            System.out.println("29. ");
            System.out.println("30. ");
            System.out.println("31. salir");
            int opc = scanner.readInt("Seleccione una opción");
            if (opc >= 1 && opc <= 31) {
                if (opc == 1) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioUno();
                if (opc == 2) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioDos();
                if (opc == 3) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioTres();
                if (opc == 4) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioCuatro();
                if (opc == 5) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioCinco();
                if (opc == 6) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioSeis();
                if (opc == 7) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioSiete();
                if (opc == 8) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioOcho();
                if (opc == 9) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioNueve();
                if (opc == 10) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioDiez();
                if (opc == 11) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioOnce();
                if (opc == 12) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioDoce();
                if (opc == 14) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioCatorce();
                if (opc == 15) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioQuince();
                if (opc == 16) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioDieciseis();
                if (opc == 17) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioDiecisiete();
                if (opc == 18) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioDieciocho();
                if (opc == 19) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioDiecinueve();
                if (opc == 20) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioVeinte();
                if (opc == 21) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioVeintiuno();
                if (opc == 22) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioVeintidos();
                if (opc == 23) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioVeintitres();
                if (opc == 24) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioVeinticuatro();
                if (opc == 25) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioVeinticinco();
                if (opc == 26) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioVeintiseis();
                if (opc == 27) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioVeintisiete();
                if (opc == 28) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioVeintiocho();
                if (opc == 29) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioVeintinueve();
                if (opc == 30) new edu.upvictoria.fpoo.estructuras.selectivas.EjercicioTreinta();
                if (opc == 31) {
                    printPackages();
                    break;
                }
            }
        }
    }
}
