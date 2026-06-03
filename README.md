Proyecto: Sistema de Renting de Carros
Materia: ESTRUCTURA DE DATOS Y LABORATORIODocente: Dennis Arlex Garro AgudeloParcial: 2Porcentaje: 20%Modalidad: Grupos de máximo 3 estudiantesEntrega: Proyecto Java (ANT) comprimido y enviado por correo electrónico
INDICACIONES GENERALES:
LEER(OJO) bien el enunciado completo y lo que se le está pidiendo para que tengan los menores reprocesos y el panorama general de lo que va a realizar.
La solución se debe mostrar y ejecutar en el lenguaje de programación Java.
La calificación es unánime para todos los integrantes del grupo.
En la clase principal no debe existir ningún otro método diferente al main.
En el método main NO ESTA PERMITIDO realizar ningún proceso diferente a crear el menú principal y llamar los métodos que realizan los procesos específicos. 
Se deben utilizar diferentes clases, objetos y herencias de estos en los cuales se demuestre el manejo correcto de la programación orientada a objetos.
Se deben utilizar ciclos, condicionales, métodos, clases, LISTAS , COLAS PILAS OBJETUALES y variables (String, Integer, Float, Boolean, Objetos) demostrando el correcto dominio de estos elementos.
En las validaciones de los datos se debe utilizar métodos recursivos demostrando el correcto manejo de estos.
Tenga presente los cuatros principios de la POO: encapsulamiento, herencia, polimorfismo y abstracción en la construcción de la solución.
Esta permitido consultar y usar parte del código que se ha desarrollado durante el aprendizaje del proceso. 

HU1: Configuración inicial del proyecto
Yo como Product Ownerrequiero que el equipo configure un proyecto Java funcional con estructura limpiapara garantizar la correcta organización del código y aplicación de los principios de POO.
Criterios de aceptación:
El proyecto se crea en Java.
Existe una clase principal con un único método main.
El método main solo contiene el menú principal y llamadas a métodos externos.
Se aplican los cuatro principios de POO: encapsulamiento, herencia, polimorfismo y abstracción.
Se implementan validaciones con métodos recursivos.
Se utilizan estructuras de control (ciclos, condicionales) y vectores dinámicos.

HU2: Creación de clases de clientes
Yo como Product Ownerrequiero que se creen las clases necesarias para representar los clientes del sistema de rentingpara registrar su información y gestionar sus contratos de alquiler.
Criterios de aceptación:
Crear la clase Cliente con los siguientes atributos:
Cedula (String) — sin caracteres especiales.
Nombre (String) — sin números ni caracteres especiales.
Apellido (String) — sin números ni caracteres especiales.
Teléfono (String) — solo números.
Dirección (String).
LicenciaConduccion (String).
Las validaciones de los datos se realizan mediante métodos recursivos.
La clase implementa encapsulamiento (atributos privados y getters/setters).

HU3: Creación de clases de vehículos
Yo como Product Ownerrequiero que se modelen las clases Vehiculo, CarroSedan y CamionetaSUVpara representar los diferentes tipos de automóviles disponibles en el renting.
Criterios de aceptación:
Clase base Vehiculo con atributos:
Placa (String) — sin caracteres especiales.
Marca (String) — sin números ni símbolos.
Modelo (int).
PrecioDiario (float).
Estado (String): disponible / alquilado.
Clase CarroSedan hereda de Vehiculo y agrega:
TipoCombustible (String): gasolina, diésel o eléctrico.
Transmisión (String): automática o manual.
Clase CamionetaSUV hereda de Vehiculo y agrega:
Tracción (String): 4x2 o 4x4.
CapacidadMaletero (float) — en litros.
Todos los campos de texto se validan sin caracteres especiales.
Los precios y capacidades deben ser numéricos positivos.

HU4: Gestión de renting
Yo como Product Ownerrequiero que el sistema permita registrar, modificar, devolver y consultar los contratos de rentingpara administrar los alquileres de vehículos de manera ordenada y precisa.
Criterios de aceptación:
Crear la clase ContratoRenting con los atributos:
IdContrato (String).
CedulaCliente (String).
PlacaVehiculo (String).
FechaInicio (String).
FechaFin (String).
TotalDias (int).
ValorTotal (float).
No se permite alquilar más de un vehículo por cliente al mismo tiempo.
No se permite alquilar un vehículo que esté en estado “alquilado”.
Los contratos pueden modificarse solo en los campos de fecha o duración.
El IdContrato, la cédula del cliente y la placa no pueden modificarse una vez registrados.

HU5: Creación del menú principal
Yo como Product Ownerrequiero un menú principal que centralice todas las opciones de gestiónpara que los usuarios puedan navegar fácilmente entre las funcionalidades del sistema.
Criterios de aceptación:
1. GESTIÓN DE CLIENTES
   1.1 Registrar cliente
   1.2 Modificar cliente
   1.3 Eliminar cliente
   1.4 Buscar cliente
   1.5 Volver al menú principal

2. GESTIÓN DE VEHÍCULOS
   2.1 Registrar vehículo
   2.2 Modificar vehículo
   2.3 Eliminar vehículo
   2.4 Buscar vehículo
   2.5 Volver al menú principal

3. GESTIÓN DE CONTRATOS DE RENTING
   3.1 Registrar nuevo contrato
   3.2 Modificar contrato
   3.3 Finalizar contrato (devolución)
   3.4 Buscar contrato
   3.5 Volver al menú principal

4. IMPRIMIR INFORME GENERAL

5. SALIR DEL SISTEMA
El main solo despliega el menú y llama los métodos asociados.
El menú permite volver al principal sin reiniciar el programa.

HU6: Implementación de estructuras dinámicas
Yo como Product Ownerrequiero que los registros se almacenen en vectores dinámicospara permitir la gestión de los datos sin tamaño fijo.
Criterios de aceptación:
Crear estructuras:
vector_clientes
vector_vehiculos
vector_contratos
Al agregar un elemento, el vector crece dinámicamente.
Al eliminar, el vector reduce su tamaño.
Los datos permanecen sincronizados (si se elimina un cliente, su contrato también).

HU7: Impresión de informes y consultas
Yo como Product Ownerrequiero que el sistema pueda imprimir y listar todos los datos registradospara tener visibilidad general de los clientes, vehículos y contratos activos.
Criterios de aceptación:
El informe muestra todos los registros en formato ordenado y legible.
Se agrupan los contratos activos y los finalizados.
Se calcula el total de ingresos generados por renting.
Se aplican métodos sobrecargados para imprimir información por tipo (cliente, vehículo, contrato).

HU8: Validaciones finales y control de flujo
Yo como Product Ownerrequiero que el sistema aplique validaciones consistentespara asegurar la integridad de los datos y la estabilidad del programa.
Criterios de aceptación:
Las validaciones de entrada se realizan mediante métodos recursivos.
Se evitan errores por campos vacíos o tipos incorrectos.
Se manejan adecuadamente las excepciones (try-catch).
Las opciones de menú inválidas son controladas sin cerrar el programa.
Todos los atributos están encapsulados con getters y setters.
