package lab4.calculator;

public class Main {

    public static void main(String[] args) {

        LogicalOp op = new LogicalOp();

        /// LAB 4   JAVA FOR LOOPS

        // 1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numarul primit,
        // si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
        // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

        int numberTo100 = 25;
       op.printto100(85);

       // 2.Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numrul primit,
        // si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
        // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

        int numberToMinus100 = -75;
        op.printnegativ100(-89);

        // 3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda sa afiseze o
        // numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea
        // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

        int firstNumber = 1;
        int secondNumber = 3;
        op.countbetween(1, 3);

        // 4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda trebuie sa verifice
        // care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel
        // mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
        // atunci numaratoarea sa fie de la y la x).

        int smallest = 5;
        int biggest = 11;
        op.increasing(7,11);

        // 5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
        int nb = 100;
        op.evenNumbers(nb);

        // 6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
        int odd = 100;
        op.oddNumbers(odd);

        // 7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele
        // pana la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul.
        // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
        int one = 25;
       op.oneplusanother(90);


        // 8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate numerele
        // pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media numerelor. La final,
        // metoda sa returneze media. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
        int oneplus = 25;
        System.out.println(op.averagefor(25));

        // 9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
        //
        //
        //*******
        //
        //******
        //
        //*****
        //
        //****
        //
        //***
        //
        //**
        //
        //*

        op.asterix(7);

        // LAB 4 JAVA WHILE LOOP

        // 1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice
        // numrul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si
        // parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

        op.whileprintto100(88);

        // 2.  Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul
        // primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
        // Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

        op.whileprinttominus100(-79);

        // 3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda sa afiseze o
        // numaratoare intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al
        // doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x,
        // la y.

        op.whileprintfromonetoanother(1,3);

        // 4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda trebuie sa verifice
        // care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel
        // mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
        // atunci numaratoarea sa fie de la y la x).

        int sml = 11;
        int big = 13;
       // op.whileincreasing(11,13);

        // 5.  Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
        int numb = 1;
        op.whileevennumbers(numb);

        // 6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
        int num = 1;
        op.whileoddnumbers(num);

        // 7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala,
        // iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval. Introduceti o variabila int
        // count in metoda, pentru a numara toate numerele din interval. Apelati metoda in clasa Main, metoda main()
        // pentru a verifica daca functioneaza.

        System.out.println(op.whilegetAverage(111, 8899));

        // 8.  Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile
        // cu 7, din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

        int A= 14;
        int B = 25;
     op.countDivisibles(14,25);

        // 9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

        int i = 1, n = 20, t1 = 0, t2 = 1;
            while ( i <= n){
                System.out.print(t1 + " + ");
                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
                i++;
            }
        }

        // 10.



        }





