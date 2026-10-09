# ⚡ Simulación de Carga de Vehículos Eléctricos (POO en Java)

Este proyecto es una aplicación en Java que modela el proceso paso a paso de recarga de la batería de un vehículo eléctrico a través de una estación/surtidor de carga. Pone en práctica la simulación de eventos iterativos por tiempo, el control de límites superiores (capacidad máxima de batería) y la mutación incremental de estados en memoria.

---

## 🧩 Clases y Estructura del Sistema

El dominio del problema se divide en 3 clases principales:

*   **`VehiculoElectrico`**: Representa al automóvil y sus parámetros energéticos.
    *   **Atributos:** `capacidadBateria` (límite máximo en kWh) y `nivelActual` (carga presente en la batería).
    *   **Métodos:** `recibirCarga(double kw)`, calcula el espacio disponible antes de sobrecargar la batería y añade la cantidad de energía recibida asegurando que no exceda la capacidad máxima.
*   **`SurtidorElectrico`**: Modela la estación de recarga.
    *   **Métodos:** `iniciarCarga(VehiculoElectrico vehiculo, int minutos)`, ejecuta un bucle iterativo donde por cada minuto suministra una tasa fija de carga ($5.0\text{ kW}$) invocando a `recibirCarga()`, monitoreando y deteniendo el proceso si la batería se llena antes de tiempo (`break`).
*   **`Main`**: Instancia un vehículo con $80\text{ kW}$ de carga sobre $100\text{ kW}$ de capacidad total, crea la estación de carga y simula un ciclo de recarga programado para 6 minutos.

---

## ⚙️ Reglas de Negocio y Control de Flujo Iterativo

El proceso de recarga aplica las siguientes validaciones y controles en tiempo de ejecución:

1. **Simulación Minuto a Minuto:** Mediante un bucle `for`, el surtidor simula el paso del tiempo aplicando transferencias de energía en intervalos unitarios.
2. **Protección contra Sobrecarga (Tope de Capacidad):**
   * En `VehiculoElectrico`: Si los kW suministrados superan el espacio disponible (`kw > espacioDisponible`), la batería se fija exactamente en su `capacidadBateria`.
   * En `SurtidorElectrico`: Al inicio de cada minuto se evalúa si el vehículo ya alcanzó su capacidad máxima (`nivelActual >= capacidadBateria`). Si es así, interrumpe el ciclo anticipadamente usando `break`.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente desglose minuto a minuto por pantalla:

```text
Minutos de carga: 1
CARGANDO.
Nivel de bateria: 85.0
Minutos de carga: 2
CARGANDO.
Nivel de bateria: 90.0
Minutos de carga: 3
CARGANDO.
Nivel de bateria: 95.0
Minutos de carga: 4
CARGANDO.
Nivel de bateria: 100.0
Bateria llena.
