Proyecto: Sistema de Renting de Carros
Materia: ESTRUCTURA DE DATOS Y LABORATORIODocente: Dennis Arlex Garro AgudeloParcial: 2Porcentaje: 20%Modalidad: Grupos de maximo 3 estudiantesEntrega: Proyecto Java (ANT) comprimido y enviado por correo electronico
INDICACIONES GENERALES:
LEER(OJO) bien el enunciado completo y lo que se le esta pidiendo para que tengan los menores reprocesos y el panorama general de lo que va a realizar.
La solucion se debe mostrar y ejecutar en el lenguaje de programacion Java.
La calificacion es unanime para todos los integrantes del grupo.
En la clase principal no debe existir ningun otro metodo diferente al main.
En el metodo main NO ESTA PERMITIDO realizar ningun proceso diferente a crear el menu principal y llamar los metodos que realizan los procesos especificos. 
Se deben utilizar diferentes clases, objetos y herencias de estos en los cuales se demuestre el manejo correcto de la programacion orientada a objetos.
Se deben utilizar ciclos, condicionales, metodos, clases, LISTAS , COLAS PILAS OBJETUALES y variables (String, Integer, Float, Boolean, Objetos) demostrando el correcto dominio de estos elementos.
En las validaciones de los datos se debe utilizar metodos recursivos demostrando el correcto manejo de estos.
Tenga presente los cuatros principios de la POO: encapsulamiento, herencia, polimorfismo y abstraccion en la construccion de la solucion.
Esta permitido consultar y usar parte del codigo que se ha desarrollado durante el aprendizaje del proceso. 

HU1: Configuracion inicial del proyecto
Yo como Product Ownerrequiero que el equipo configure un proyecto Java funcional con estructura limpiapara garantizar la correcta organizacion del codigo y aplicacion de los principios de POO.
Criterios de aceptacion:
El proyecto se crea en Java.
Existe una clase principal con un unico metodo main.
El metodo main solo contiene el menu principal y llamadas a metodos externos.
Se aplican los cuatro principios de POO: encapsulamiento, herencia, polimorfismo y abstraccion.
Se implementan validaciones con metodos recursivos.
Se utilizan estructuras de control (ciclos, condicionales) y vectores dinamicos.

HU2: Creacion de clases de clientes
Yo como Product Ownerrequiero que se creen las clases necesarias para representar los clientes del sistema de rentingpara registrar su informacion y gestionar sus contratos de alquiler.
Criterios de aceptacion:
Crear la clase Cliente con los siguientes atributos:
Cedula (String) — sin caracteres especiales.
Nombre (String) — sin numeros ni caracteres especiales.
Apellido (String) — sin numeros ni caracteres especiales.
Telefono (String) — solo numeros.
Direccion (String).
LicenciaConduccion (String).
Las validaciones de los datos se realizan mediante metodos recursivos.
La clase implementa encapsulamiento (atributos privados y getters/setters).

HU3: Creacion de clases de vehiculos
Yo como Product Ownerrequiero que se modelen las clases Vehiculo, CarroSedan y CamionetaSUVpara representar los diferentes tipos de automoviles disponibles en el renting.
Criterios de aceptacion:
Clase base Vehiculo con atributos:
Placa (String) — sin caracteres especiales.
Marca (String) — sin numeros ni simbolos.
Modelo (int).
PrecioDiario (float).
Estado (String): disponible / alquilado.
Clase CarroSedan hereda de Vehiculo y agrega:
TipoCombustible (String): gasolina, diesel o electrico.
Transmision (String): automatica o manual.
Clase CamionetaSUV hereda de Vehiculo y agrega:
Traccion (String): 4x2 o 4x4.
CapacidadMaletero (float) — en litros.
Todos los campos de texto se validan sin caracteres especiales.
Los precios y capacidades deben ser numericos positivos.

HU4: Gestion de renting
Yo como Product Ownerrequiero que el sistema permita registrar, modificar, devolver y consultar los contratos de rentingpara administrar los alquileres de vehiculos de manera ordenada y precisa.
Criterios de aceptacion:
Crear la clase ContratoRenting con los atributos:
IdContrato (String).
CedulaCliente (String).
PlacaVehiculo (String).
FechaInicio (String).
FechaFin (String).
TotalDias (int).
ValorTotal (float).
No se permite alquilar mas de un vehiculo por cliente al mismo tiempo.
No se permite alquilar un vehiculo que este en estado “alquilado”.
Los contratos pueden modificarse solo en los campos de fecha o duracion.
El IdContrato, la cedula del cliente y la placa no pueden modificarse una vez registrados.

HU5: Creacion del menu principal
Yo como Product Ownerrequiero un menu principal que centralice todas las opciones de gestionpara que los usuarios puedan navegar facilmente entre las funcionalidades del sistema.
Criterios de aceptacion:
1. GESTIoN DE CLIENTES
   1.1 Registrar cliente
   1.2 Modificar cliente
   1.3 Eliminar cliente
   1.4 Buscar cliente
   1.5 Volver al menu principal

2. GESTIoN DE VEHiCULOS
   2.1 Registrar vehiculo
   2.2 Modificar vehiculo
   2.3 Eliminar vehiculo
   2.4 Buscar vehiculo
   2.5 Volver al menu principal

3. GESTION DE CONTRATOS DE RENTING
   3.1 Registrar nuevo contrato
   3.2 Modificar contrato
   3.3 Finalizar contrato (devolucion)
   3.4 Buscar contrato
   3.5 Volver al menu principal

4. IMPRIMIR INFORME GENERAL

5. SALIR DEL SISTEMA
El main solo despliega el menu y llama los metodos asociados.
El menu permite volver al principal sin reiniciar el programa.

HU6: Implementacion de estructuras dinamicas
Yo como Product Ownerrequiero que los registros se almacenen en vectores dinamicospara permitir la gestion de los datos sin tamaño fijo.
Criterios de aceptacion:
Crear estructuras:
vector_clientes
vector_vehiculos
vector_contratos
Al agregar un elemento, el vector crece dinamicamente.
Al eliminar, el vector reduce su tamaño.
Los datos permanecen sincronizados (si se elimina un cliente, su contrato tambien).

HU7: Impresion de informes y consultas
Yo como Product Ownerrequiero que el sistema pueda imprimir y listar todos los datos registradospara tener visibilidad general de los clientes, vehiculos y contratos activos.
Criterios de aceptacion:
El informe muestra todos los registros en formato ordenado y legible.
Se agrupan los contratos activos y los finalizados.
Se calcula el total de ingresos generados por renting.
Se aplican metodos sobrecargados para imprimir informacion por tipo (cliente, vehiculo, contrato).

HU8: Validaciones finales y control de flujo
Yo como Product Ownerrequiero que el sistema aplique validaciones consistentespara asegurar la integridad de los datos y la estabilidad del programa.
Criterios de aceptacion:
Las validaciones de entrada se realizan mediante metodos recursivos.
Se evitan errores por campos vacios o tipos incorrectos.
Se manejan adecuadamente las excepciones (try-catch).
Las opciones de menu invalidas son controladas sin cerrar el programa.
Todos los atributos estan encapsulados con getters y setters.
