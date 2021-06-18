package com.company.Refactoritzacions_4;

/**

 public class Resumen {
    Extracion de metodo
    public void extracion_metodo(){

        void printOwing() {
        printBanner();

        // Print details.
        System.out.println("name: " + name);
        System.out.println("amount: " + getOutstanding());
    }
    /* soluction

    void printOwing() {
        printBanner();
        printDetails(getOutstanding());
    }

    void printDetails(double outstanding){
            System.out.println("name: " + name);
            System.out.println("amount: " + outstanding);
        }
    }

    /* Replace method with method object.
    public void replace (){
        class Order {
            // ...
            public double price() {
                double primaryBasePrice;
                double secondaryBasePrice;
                double tertiaryBasePrice;
                // Perform long computation.
            }
            /* soluction
            class Order {
                // ...
                public double price() {
                    return new PriceCalculator(this).compute();
                }
            }

            class PriceCalculator {
                private double primaryBasePrice;
                private double secondaryBasePrice;
                private double tertiaryBasePrice;

                public PriceCalculator(Order order) {
                    // Copy relevant information from the
                    // order object.
                }

                public double compute() {
                    // Perform long computation.
                }
            }
        }
    }
    /*Split temporary variable.
    public void temporary() {
        double temp = 2 * (height + width);
        System.out.println(temp);
        temp = height * width;
        System.out.println(temp);

        /* soluction
        final double perimeter = 2 * (height + width);
        System.out.println(perimeter);
        final double area = height * width;
        System.out.println(area);
    }
 /* Remove parameter assignment.
    public void parameter (){
        int discount(int inputVal, int quantity) {
            if (quantity > 50) {
                inputVal -= 2;
            }
            // ...
        }
        /* solucion
        int discount(int inputVal, int quantity) {
            int result = inputVal;
            if (quantity > 50) {
                result -= 2;
            }
            // ...
        }
        /* Decompose conditional.
    public void descompose(){
            if (date.before(SUMMER_START) || date.after(SUMMER_END)) {
                charge = quantity * winterRate + winterServiceCharge;
            }
            else {
                charge = quantity * summerRate;
            }
            /* soluction
            if (isSummer(date)) {
                charge = summerCharge(quantity);
            }
            else {
                charge = winterCharge(quantity);
            }

        }
        /* Consolidate conditional.
        public void consolidate(){
            double disabilityAmount() {
                if (seniority < 2) {
                    return 0;
                }
                if (monthsDisabled > 12) {
                    return 0;
                }
                if (isPartTime) {
                    return 0;
                }
                // Compute the disability amount.
                // ...
            }
            /* soluction
            double disabilityAmount() {
                if (isNotEligibleForDisability()) {
                    return 0;
                }
                // Compute the disability amount.
                // ...
            }

        }
        /* Consolidate duplicate conditional.
        public void duplicate(){
            if (isSpecialDeal()) {
                total = price * 0.95;
                send();
            }
            else {
                total = price * 0.98;
                send();

                /* soluction

                if (isSpecialDeal()) {
                    total = price * 0.95;
                }
                else {
                    total = price * 0.98;
                }
                send();
            }
        }
        /* Remove control flag.
        public void control() {
            /** break: detiene el bucle

             continue: detiene la ejecución de la rama del ciclo actual y va a comprobar las condiciones del ciclo en la siguiente iteración

             return: detiene la ejecución de toda la función y devuelve su resultado si se da en el operador

             Encuentre la asignación de valor a la bandera de control que causa la salida del ciclo o la iteración actual.

             Reemplácelo con break, si se trata de una salida de un bucle; continue, si se trata de una salida de una iteración o return, si necesita devolver este valor de la función.

             Elimine el código restante y las comprobaciones asociadas con la bandera de control.
        }
        /* Replace nested conditional.
        public void nested(){
            public double getPayAmount() {
                double result;
                if (isDead){
                    result = deadAmount();
                }
                else {
                    if (isSeparated){
                        result = separatedAmount();
                    }
                    else {
                        if (isRetired){
                            result = retiredAmount();
                        }
                        else{
                            result = normalPayAmount();
                        }
                    }
                }
                return result;
            }
            /* soluction
            public double getPayAmount() {
                if (isDead){
                    return deadAmount();
                }
                if (isSeparated){
                    return separatedAmount();
                }
                if (isRetired){
                    return retiredAmount();
                }
                return normalPayAmount();
            }
        }
        /* Replace conditional with polymorphism.
        public void polymorphism(){
            class Bird {
                // ...
                double getSpeed() {
                    switch (type) {
                        case EUROPEAN:
                            return getBaseSpeed();
                        case AFRICAN:
                            return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
                        case NORWEGIAN_BLUE:
                            return (isNailed) ? 0 : getBaseSpeed(voltage);
                    }
                    throw new RuntimeException("Should be unreachable");
                }
            }
            /* soluction
            abstract class Bird {
                // ...
                abstract double getSpeed();
            }

            class European extends Bird {
                double getSpeed() {
                    return getBaseSpeed();
                }
            }
            class African extends Bird {
                double getSpeed() {
                    return getBaseSpeed() - getLoadFactor() * numberOfCoconuts;
                }
            }
            class NorwegianBlue extends Bird {
                double getSpeed() {
                    return (isNailed) ? 0 : getBaseSpeed(voltage);
                }
            }

// Somewhere in client code
            speed = bird.getSpeed();
        }
        /* Separate query from modify
        public void query (){
            /** ¿Tiene un método que devuelve un valor pero también cambia algo dentro de un objeto?

             Solucion: Divida el método en dos métodos separados. Como era de esperar, uno de ellos debe devolver
             el valor y el otro modifica el objeto.

             }
        /* Parametrize method
        public void parametrize(){
            /** Múltiples métodos realizan acciones similares que son diferentes solo en sus valores internos,
             * números u operaciones.

             Solución
             Combine estos métodos utilizando un parámetro que pasará el valor especial necesario.
        }
        /* Replace parameter with explicit method
        public void explicit(){
            void setValue(String name, int value) {
                if (name.equals("height")) {
                    height = value;
                    return;
                }
                if (name.equals("width")) {
                    width = value;
                    return;
                }
                Assert.shouldNeverReachHere();
            }
            //solucion
            void setHeight(int arg) {
                height = arg;
            }
            void setWidth(int arg) {
                width = arg;
            }
        }
        /* Substitute algorithm
        public void alhorithm(){
            String foundPerson(String[] people){
                for (int i = 0; i < people.length; i++) {
                    if (people[i].equals("Don")){
                        return "Don";
                    }
                    if (people[i].equals("John")){
                        return "John";
                    }
                    if (people[i].equals("Kent")){
                        return "Kent";
                    }
                }
                return "";
            }
            //solucio
            String foundPerson(String[] people){
                List candidates =
                        Arrays.asList(new String[] {"Don", "John", "Kent"});
                for (int i=0; i < people.length; i++) {
                    if (candidates.contains(people[i])) {
                        return people[i];
                    }
                }
                return "";
            }

        }
        /* Extract class.
        /** Cuando una clase hace el trabajo de dos, resulta incómodo.

                Solución
        En su lugar, cree una nueva clase y coloque los campos y métodos responsables de la funcionalidad relevante en ella.

        /* Inline class.
        /** Una clase no hace casi nada y no es responsable de nada, y no se planean responsabilidades adicionales para ella.

         Solución
         Mueva todas las funciones de la clase a otra.

        /* Introduce foreign method.
        public void foreign (){
            class Report {
                // ...
                void sendReport() {
                    Date nextDay = new Date(previousEnd.getYear(),
                            previousEnd.getMonth(), previousEnd.getDate() + 1);
                    // ...
                }
            }
            //soluction
            class Report {
                // ...
                void sendReport() {
                    Date newStart = nextDay(previousEnd);
                    // ...
                }
                private static Date nextDay(Date arg) {
                    return new Date(arg.getYear(), arg.getMonth(), arg.getDate() + 1);
                }
            }
        }
        /* Introduce local extension.
        public void extension (){
            /** A utility class doesn’t contain some methods that you need. But you can’t add these methods to the class.

             Solution
             Create a new class containing the methods and make it either the child or wrapper of the utility class.
        }
        /* Replace data value with object.
        public void value (){
            /** A class (or group of classes) contains a data field. The field has its own behavior and associated data.

             Solution
             Create a new class, place the old field and its behavior in the class, and store the object of the class in the original class.
        }
        /* Encapsulate collection.
        /** A class contains a collection field and a simple getter and setter for working with the collection.

         Solution
         Make the getter-returned value read-only and create methods for adding/deleting elements of the collection.
    }
    /* Pull up.
    /** Dos clases tienen el mismo campo.

     Solución
     Elimine el campo de las subclases y muévalo a la superclase.**/

    /* Push down.
    /** ¿Se usa un campo solo en algunas subclases?

     Solución
     Mueva el campo a estas subclases.

    /*Replace array with object.
   public void arrayob () {
       String[] row = new String[2];
       row[0] = "Liverpool";
       row[1] = "15";

       //soluction
       Performance row = new Performance();
       row.setName("Liverpool");
       row.setWins("15");
   }
}
**/