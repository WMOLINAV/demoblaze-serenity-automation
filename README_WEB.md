# DemE Automation – Serenity BDD

## Descripción
Este proyecto implementa un escenario de automatización End‑to‑End para el sitio web https://www.demoblaze.com/, utilizando Serenity BDD con el patrón Screenplay.

El objetivo es validar un flujo completo de compra como parte de un ejercicio práctico de QA Automation.

## Alcance del Escenario Automatizado
El flujo automatizado cubre los siguientes pasos:

- Acceso al sitio Demoblaze
- Selección y agregado de dos productos al carrito
- Visualización del carrito
- Completar el formulario de compra
- Finalizar la compra
- Validar el mensaje de confirmación de la operación

## Tecnologías Utilizadas
- Java 17
- Maven
- Serenity BDD
- Cucumber (BDD)
- Selenium WebDriver
- Patrón Screenplay

## Requisitos Previos
Para ejecutar el proyecto se requiere:

- Java JDK 17 o superior
- Maven 3.8 o superior
- Google Chrome

## Ejecución del Proyecto
Desde la raíz del proyecto, ejecutar el siguiente comando:

```bash
mvn clean verify