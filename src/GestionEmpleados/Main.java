package GestionEmpleados;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    public static void LimpiarPantalla() {
        for (int i = 0; i < 24; ++i) {
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        ArrayList < Person > aListPerson = new ArrayList < Person > ();

        Scanner entrada = new Scanner(System.in);

        boolean salida = false;
        int opcion, id, salario, existe = 0;
        String nombre, apellido;

        while (!salida) {
            System.out.println("::::::::::::::::::::::::::");
            System.out.println(":: Gestion de Empleados ::");
            System.out.println("::::::::::::::::::::::::::");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Eliminar Empleado");
            System.out.println("3. Actualizar Empleado");
            System.out.println("4. Mostrar Todos Los Empleados");
            System.out.println("0. Salir");
            System.out.println("");
            try {
                System.out.println("Elije una Opcion: ");
                opcion = entrada.nextInt();

                switch (opcion) {
                    case 1:
                        LimpiarPantalla();
                        Scanner datoId = new Scanner(System.in);
                        Scanner datoNombre = new Scanner(System.in);
                        Scanner datoApellido = new Scanner(System.in);
                        Scanner datoSalario = new Scanner(System.in);

                        System.out.println("::::::::::::::::::::::");
                        System.out.println(":: Agregar Empleado ::");
                        System.out.println("::::::::::::::::::::::");
                        System.out.println("");
                        System.out.print("Ingrese el Id: ");
                        id = datoId.nextInt();

                        for (int i = 0; i < aListPerson.size(); i++) {
                            if (aListPerson.get(i).getId() == id) {
                                existe = 1;
                            }
                        }

                        if (existe == 0) {
                            System.out.print("Ingrese el Nombre: ");
                            nombre = datoNombre.nextLine();
                            System.out.print("Ingrese el Apellido: ");
                            apellido = datoApellido.nextLine();
                            System.out.print("Ingrese el Salario: ");
                            salario = datoSalario.nextInt();
                            aListPerson.add(new Person(id, nombre, apellido, salario));
                            LimpiarPantalla();
                            System.out.println("Registro creado exitosamente!");
                            System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
                            System.out.println("");
                        } else {
                            LimpiarPantalla();
                            System.out.println("Este ID ya fue registrado, escoge la opción 1 y registra uno nevo!");
                            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                            System.out.println("");
                            break;
                        }
                        break;
                    case 2:
                        LimpiarPantalla();
                        if (!aListPerson.isEmpty()) {
                            Scanner datoElimina = new Scanner(System.in);

                            System.out.println("::::::::::::::::::::::");
                            System.out.println(":: Eliminar Empleado ::");
                            System.out.println("::::::::::::::::::::::");
                            System.out.println("");
                            System.out.println("Ingrese el ID a eliminar: ");
                            id = datoElimina.nextInt();
                            LimpiarPantalla();
                            for (int i = 0; i < aListPerson.size(); i++) {
                                if (aListPerson.get(i).getId() == id) {
                                    LimpiarPantalla();
                                    aListPerson.remove(i);
                                    System.out.println("Registro eliminado exitosamente!");
                                    System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
                                    System.out.println("");
                                    break;
                                } else {
                                    LimpiarPantalla();
                                    System.out.println("Este ID no ha sido registrado, escoge la opción 1 y registralo!");
                                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                                }
                            }
                            System.out.println("");
                        } else {
                            LimpiarPantalla();
                            System.out.println("Aun no existen registros, escoge la opción 1 y registra el primero!");
                            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        }
                        break;
                    case 3:
                        LimpiarPantalla();
                        if (!aListPerson.isEmpty()) {
                            Scanner datoActualiza = new Scanner(System.in);
                            Scanner actualizaId = new Scanner(System.in);
                            Scanner actualizaNombre = new Scanner(System.in);
                            Scanner actualizaApellido = new Scanner(System.in);
                            Scanner actualizaSalario = new Scanner(System.in);

                            int nuevoId, nuevoSalario;
                            String nuevoNombre, nuevoApellido;

                            System.out.println(":::::::::::::::::::::::::");
                            System.out.println(":: Actualizar Empleado ::");
                            System.out.println(":::::::::::::::::::::::::");
                            System.out.println("");
                            System.out.println("Ingrese el ID a actualizar: ");
                            id = datoActualiza.nextInt();
                            LimpiarPantalla();
                            for (int i = 0; i < aListPerson.size(); i++) {
                                if (aListPerson.get(i).getId() == id) {
                                    System.out.println("Registro encontrado! - Ingresemos los nuevos datos");
                                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>");
                                    System.out.println("");
                                    System.out.print("Id Actual: " + aListPerson.get(i).getId());
                                    System.out.print(" - Ingrese el nuevo Id: ");
                                    nuevoId = actualizaId.nextInt();
                                    aListPerson.get(i).setId(nuevoId);
                                    System.out.print("Nombre Actual: " + aListPerson.get(i).getFirstName());
                                    System.out.print(" - Ingrese el nuevo Nombre: ");
                                    nuevoNombre = actualizaNombre.nextLine();
                                    aListPerson.get(i).setFirstName(nuevoNombre);
                                    System.out.print("Apellido Actual: " + aListPerson.get(i).getLastName());
                                    System.out.print(" - Ingrese el nuevo Apellido: ");
                                    nuevoApellido = actualizaApellido.nextLine();
                                    aListPerson.get(i).setLastName(nuevoApellido);
                                    System.out.print("Salario Actual: " + aListPerson.get(i).getSalario());
                                    System.out.print(" - Ingrese el nuevo Salario: ");
                                    nuevoSalario = actualizaSalario.nextInt();
                                    aListPerson.get(i).setSalario(nuevoSalario);
                                    System.out.println("");
                                    LimpiarPantalla();
                                    System.out.println("Registro Actualizado exitosamente!");
                                    System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>");
                                    System.out.println("");
                                    break;
                                } else {
                                    LimpiarPantalla();
                                    System.out.println("Este ID no ha sido registrado, escoge la opción 1 y registralo!");
                                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                                }
                            }
                            System.out.println("");
                        } else {
                            LimpiarPantalla();
                            System.out.println("Aun no existen registros, escoge la opción 1 y registra el primero!");
                            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        }
                        break;
                    case 4:
                        LimpiarPantalla();
                        System.out.println(":::::::::::::::::::::::::::");
                        System.out.println(":: Empleados Registrados ::");
                        System.out.println(":::::::::::::::::::::::::::");
                        if (!aListPerson.isEmpty()) {
                            System.out.println("_______________________________");
                            System.out.print("ID" + "\t");
                            System.out.print("NOMBRE" + "\t");
                            System.out.print("APELLI" + "\t");
                            System.out.print("SALARIO" + "\t");
                            System.out.println("");
                            for (Person p: aListPerson)
                                System.out.println(p.getId() + "\t" + p.getFirstName() + "\t" + p.getLastName() + "\t" + p.getSalario());
                            System.out.println("_______________________________");
                            System.out.println("");
                        } else {
                            LimpiarPantalla();
                            System.out.println("Aun no existen registros, escoge la opción 1 y registra el primero!");
                            System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        }
                        break;
                    case 0:
                        salida = true;
                        break;
                    default:
                        LimpiarPantalla();
                        System.out.println("Escoge una opcion entre 1 y 4 o escoge 0 para salir.");
                        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                        System.out.println("");
                }
            } catch (InputMismatchException e) {
                LimpiarPantalla();
                System.out.println("Solo se permite usar numeros!");
                System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>");
                System.out.println("");
            }
        }
        LimpiarPantalla();
        System.out.println("Gracias por usar la Gestion de Empleados, hasta pronto!");
    }
}

    
        
    
