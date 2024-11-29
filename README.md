# Parqueadero
![Diagrama_UML_Parqueadero](https://github.com/user-attachments/assets/6acd3cd7-3803-45c0-9c4c-7af6a8a2b59a)
>Diagrama UML Parqueadero

## [Carpeta.java](https://github.com/R0yalCode/Parqueadero/tree/develop/Parqueadero "Carpeta.java"): 
Esta carpeta te redirige a los archivos .java necesarios para poder ejecutar el proyecto localmente. 

### Cambios que se realizo desde el ultimo Diagrama UML: 
#### - Relación entre Parqueadero, Piso y Plaza:

**Antes:**

Había una relación directa entre Parqueadero y Plaza.


**Ahora:**

Se corrigió la relación para incluir una composición entre Parqueadero y Piso.

Cada Piso ahora tiene una agregación con múltiples Plazas.

---

#### -  Herencia de Vehículo:

**Antes:**

El tipo de vehículo (Automóvil, Motocicleta, Bicicleta) se manejaba con una enumeración.


**Ahora:**

Se implementó una generalización desde la clase Vehículo hacia las subclases:

Automóvil (con atributo numeroPuertas).

Motocicleta.

Bicicleta (con atributo tieneLuzReflejante).


---

#### - Manejo de usuarios (Usuario):

**Antes:**

No había una separación clara entre ClienteRegular y Visitante.


**Ahora:**

Usuario es una clase base con una generalización hacia:

ClienteRegular (con métodoPago y una asociación con Suscripción y Reserva).

Visitante (con tiempoUso como atributo específico).


---

#### - Empleado y sus subclases:

**Antes:**

Existía una clase Empleado sin una jerarquía ni métodos relevantes.


**Ahora:**

Empleado se divide en:

Supervisor, con métodos como asignarPlaza, registrarEntrada, y registrarSalida.

Cajero, con el método realizarPago y un atributo registroPagos.


---

#### - Reserva y manejo de pagos:

**Antes:**

La clase Reserva no tenía relación con las Plazas ni un flujo claro de pago.

No había una clase explícita para pagos.


**Ahora:**

Reserva está asociada a una Plaza específica y vinculada al ClienteRegular.

Se agregó la clase Pago, con atributos como monto, fecha, y la enumeración metodoPago (EFECTIVO, TRANSFERENCIA, TARJETA).


---

#### - Suscripción:

**Antes:**

La relación de suscripción no estaba representada.


**Ahora:**

Se agregó la clase Suscripción, con atributos como estado, fechaInicio, y fechaFin, relacionada con ClienteRegular.


---

#### - Métodos y funcionalidad:

**Antes:**

Muchas clases carecían de métodos para representar sus acciones.


**Ahora:**

Se incorporaron métodos relevantes en:

Supervisor: asignarPlaza, registrarEntrada, registrarSalida.

Cajero: realizarPago.


---

#### - Relación entre Dirección y Parqueadero:

**Antes:**

Dirección tenía una asociación débil con Parqueadero.


**Ahora:**

Se reforzó la relación, manteniéndola como una agregación, ya que una Dirección describe la ubicación de un Parqueadero.

---
