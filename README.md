# 🚸 Sistema de Movilidad Urbana

Se desea desarrollar un sistema para gestionar el alquiler de vehículos de movilidad urbana.

El sistema debe permitir registrar usuarios, distintos tipos de vehículos y los alquileres realizados.

---

## 🛣️ Vehículos

Existen distintos tipos de vehículos disponibles para alquilar.

Algunos ejemplos son:
- 🚲 Bicicletas, de las cuales se conoce su rodado.
- 🛴 Monopatines, de los cuales se conoce su marca.

Todos los vehículos comparten la característica común que es su disponibilidad para ser alquilado.

---

## 👥 Usuarios

El sistema registra usuarios que pueden utilizar los vehículos disponibles. Para este ejemplo solo nos importa su nombre.

Un usuario puede realizar múltiples alquileres a lo largo del tiempo.

---

## 💰 Alquileres

Cada vez que un usuario alquila un vehículo, se registra una operación de alquiler.

De cada alquiler se conoce:
- la fecha de inicio
- la fecha de fin

Además:
- un alquiler involucra a un único usuario
- un alquiler involucra a un único vehículo

---

## ⚙️ Comportamiento del sistema

El sistema debe permitir:

- Alquilar un vehículo disponible
- Registrar la operación de alquiler
- Actualizar el estado del vehículo según corresponda
- Consultar:
  - los vehículos disponibles
  - los alquileres realizados

---

## 🎯 Se pide

1. Identificar las clases del dominio.
2. Determinar los atributos y comportamientos relevantes de cada clase.
3. Definir las relaciones entre las clases (incluyendo multiplicidad).
4. Modelar el diagrama UML de clases.
5. Implementar la solución en Java respetando el modelo diseñado.
6. Desarrollar pruebas unitarias que validen el comportamiento del sistema.

---

## 💡 Consideraciones

- Evitar incluir información innecesaria en el modelo.
- Priorizar los comportamientos por sobre los datos.
- Justificar las decisiones de diseño tomadas.