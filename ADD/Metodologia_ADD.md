# Respuestas sobre Attribute-Driven Design (ADD)

## 1. ¿Cuál es el propósito principal de la metodología ADD en el diseño de arquitecturas de software?
**Respuesta:**  
El propósito principal de ADD es proporcionar un enfoque sistemático para tomar decisiones arquitectónicas basadas en atributos de calidad (rendimiento, seguridad, escalabilidad, etc.), garantizando que el software cumpla requisitos no funcionales desde las primeras fases del desarrollo. Esto reduce riesgos y evita cambios costosos en etapas avanzadas.

---

## 2. ¿Qué atributos de calidad se consideran en ADD y por qué son importantes en el proceso de diseño?
**Respuesta:**  
Los atributos clave incluyen:  
- **Rendimiento**: Tiempos de respuesta eficientes.  
- **Escalabilidad**: Capacidad de manejar crecimiento.  
- **Seguridad**: Protección contra accesos no autorizados.  
- **Disponibilidad**: Tiempo operativo garantizado.  
- **Mantenibilidad**: Facilidad de actualización.  

**Importancia:**  
Estos atributos definen la calidad del software y guían la selección de tácticas arquitectónicas para cumplir con los objetivos del sistema.

---

## 3. Explica la importancia de la selección del módulo a diseñar en ADD. ¿Cuáles son los criterios principales para elegir un módulo?
**Respuesta:**  
**Importancia:**  
Priorizar módulos críticos permite abordar riesgos temprano y evitar bloqueos en el desarrollo.  

**Criterios de selección:**  
- **Dependencias**: Módulos con alta interacción con otros.  
- **Riesgos arquitectónicos**: Impacto en rendimiento/seguridad.  
- **Prioridades del negocio**: Requisitos urgentes.  
- **Complejidad técnica**: Viabilidad de implementación.  

---

## 4. ¿Cómo influyen las tácticas arquitectónicas en la toma de decisiones dentro de ADD? Menciona dos ejemplos de tácticas y su aplicación.
**Respuesta:**  
Las tácticas son estrategias técnicas para mejorar atributos específicos. Influyen al:  
- **Optimizar atributos clave**: Ejemplo: *Caché* (mejora rendimiento) o *OAuth 2.0* (aumenta seguridad).  
- **Mitigar riesgos**: Ejemplo: *Balanceo de carga* (escalabilidad) o *replicación de datos* (disponibilidad).  

**Ejemplos:**  
- **Caché en memoria**: Reduce latencia en autenticación.  
- **Autenticación multifactor**: Mitiga fraudes.  

---

## 5. ¿Cuál es la relación entre los escenarios de calidad y la evaluación de la arquitectura en ADD?
**Respuesta:**  
Los escenarios de calidad (fuente, estímulo, artefactos, entorno, respuesta y medida) sirven como métricas para evaluar si la arquitectura cumple con los atributos esperados. Durante la evaluación, se validan estos escenarios mediante pruebas técnicas (ej: pruebas de carga) o revisiones de diseño.

---

## 6. Describe los principales pasos del proceso ADD y cómo se interrelacionan.
**Pasos:**  
1. **Identificar atributos de calidad**: Basados en requisitos del negocio.  
2. **Seleccionar módulo a diseñar**: Priorizando impacto y riesgos.  
3. **Elegir tácticas arquitectónicas**: Para abordar atributos clave.  
4. **Definir arquitectura**: Componentes, conectores y despliegue.  
5. **Evaluar y documentar**: Validar escenarios y registrar decisiones.  

**Interrelación:**  
Cada paso depende del anterior. Por ejemplo, las tácticas se eligen según los atributos, y la evaluación verifica que el diseño cumpla dichos atributos.

---

## 7. ¿Por qué es crucial documentar las decisiones arquitectónicas en ADD? Menciona al menos tres elementos que deben incluirse en la documentación.
**Importancia:**  
Facilita la comunicación del equipo, permite reutilizar decisiones y justifica cambios futuros.  

**Elementos clave:**  
- **Diagramas de arquitectura**: Visualización de componentes.  
- **Decisiones técnicas**: Justificación de tácticas usadas.  
- **Escenarios evaluados**: Resultados de pruebas (ej: latencia).  

---

## 8. En un proyecto real, ¿cómo se puede evaluar si una arquitectura diseñada con ADD cumple con los atributos de calidad esperados?
**Métodos:**  
- **Pruebas de carga**: Simular concurrencia para medir rendimiento.  
- **Revisión técnica**: Análisis de viabilidad por arquitectos.  
- **Pruebas de seguridad**: Penetración o auditorías.  
- **Modelado**: Herramientas para predecir escalabilidad.  

**Ejemplo:**  
En el módulo de autenticación, se probaron 10,000 usuarios concurrentes para validar la latencia (<500 ms).

---

## 9. ¿Cuáles son los beneficios de utilizar ADD en comparación con otros enfoques de diseño arquitectónico?
**Beneficios:**  
- **Enfoque estructurado**: Decisiones basadas en atributos medibles.  
- **Reducción de riesgos**: Problemas detectados temprano.  
- **Documentación clara**: Trazabilidad de decisiones.  
- **Flexibilidad**: Iteraciones controladas para refinamiento.  

**Diferencia clave:**  
ADD prioriza requisitos no funcionales (calidad) sobre funcionales, a diferencia de métodos centrados solo en funcionalidad.

---

## 10. ¿Qué desafíos pueden surgir al aplicar ADD en un equipo de desarrollo y cómo podrían abordarse?
**Desafíos:**  
1. **Complejidad técnica**: Equipos sin experiencia en tácticas avanzadas.  
   - *Solución*: Capacitación o asesoría externa.  
2. **Tiempo inicial**: ADD requiere análisis detallado.  
   - *Solución*: Iteraciones cortas y priorización.  
3. **Resistencia al cambio**: Equipos acostumbrados a otros métodos.  
   - *Solución*: Demostrar beneficios con casos prácticos.  