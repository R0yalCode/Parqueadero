# Parqueadero
![Diagrama_UML_Parqueadero](https://github.com/user-attachments/assets/6acd3cd7-3803-45c0-9c4c-7af6a8a2b59a)
>Diagrama UML Parqueadero

## [Carpeta.java](https://github.com/R0yalCode/Parqueadero/tree/main/Parqueadero): 
Esta carpeta te redirige a los archivos .java necesarios para poder ejecutar el proyecto localmente. 

## Cambios en el Diagrama de Clases

A continuación se detallan los principales cambios introducidos en la actualización del diagrama de clases:

### 1. Nuevas Clases Añadidas

- **Vehiculo**: Se introducen las subclases **Bicicleta**, **Automovil** y **Motocicleta**, especializando los atributos con características propias, como `tieneLuzReflejante` y `numeroPuertas`.
  
- **Factura**: Para gestionar detalles de facturación, como `fechaEmision`, `montoTotal` y `cliente`.

- **Pago**: Relacionada con la clase **Factura** y **Cajero** para registrar pagos, con atributos como `monto` y `fecha`.

- **Boleto**: Representa los boletos emitidos, con atributos como `codigo` y `suscripcionActiva`, e incluye el método `consultarSuscripcion()`.

- **Suscripcion**: Relaciona al **ClienteRegular** con información de suscripciones, incluyendo `fechaInicio`, `precio` y métodos como `activarSuscripcion()` y `cancelarSuscripcion()`.

### 2. Nuevas Interfaces

- **IParqueadero**: Define operaciones relacionadas con el manejo del parqueadero, tales como `registrarVehiculo()`, `liberarPlaza()` y `verificarPlazaOcupada()`.

- **InteraccionCliente**: Gestiona las interacciones de los empleados con los clientes, con métodos como `gestionarEntrada()` y `consultarDisponibilidad()`.

### 3. Nuevos Atributos

- **Persona**: Se añade el atributo `fechaNacimiento`.
  
- **Empleado**: Se incorporan nuevos métodos como `gestionarEntrada()` y `gestionarSalida()`.

### 4. Nuevas Relaciones

- **Parqueadero**: Se establece una relación con **Cliente**, diferenciando entre los tipos **ClienteRegular** y **Visitante**.

- Se agrega una asociación entre **Pago** y **Factura**, para vincular los detalles de las transacciones.

- **ClienteRegular**: Tiene una relación directa con **Suscripcion** para gestionar los estados de sus membresías.

### 5. Enumeraciones Actualizadas

- Se añadió una nueva enumeración llamada **MetodoPago** con los valores: `EFECTIVO`, `TRANSFERENCIA` y `TARJETA`.

### 6. Cambios en Cardinalidades

- La relación entre **Plaza** y **Piso** ha sido redefinida como una relación de "uno a muchos" (1..*).
  
- **Plaza** ahora está asociada directamente con **TipoVehiculo**.

### 7. Métodos Específicos Añadidos

- **ClienteRegular**: Se añadió el método `consultarDescuento()`.

- **Supervisor** y **Cajero**: Se incluyen los métodos `asignarPlaza()` y `realizarPago()`.









