# ProcesoDevco
# Automatización del aplicativo travelocity.com

Se realiza la automatización de la página  https://www.travelocity.com, creando 5 escenarios automatizados y 
15 escenarios de ejecución manual, para un total de 20 escenarios.

 

# ESTRATEGIA DE AUTOMATIZACION

Se define la ruta critica donde se abarcan los escenarios de búsqueda de hoteles, autos, vuelos, cosas para hacer y cruceros.
Únicamente se realiza un flujo completo en el escenario "reservar un auto", dado que los demás exigen tarjeta de crédito para finalizar el proceso de reserva.  

# REQUERIMIENTOS
Para ejecutar el proyecto de automatización se requiere:
 
 	•   Java JDK 1.8 
 	•   Gradle versión 6.10 o superior 
 	•   Google Chrome versión  86.0.4240

# FRAMEWORK

# BDD

Se utiliza BDD como framework de automatización para la automatización de los escenarios de prueba, la idea es escribir las pruebas antes de escribir el código fuente,  lo que haremos será escribir pruebas que verifiquen que el comportamiento del código es correcto desde el punto de vista de negocio. Partimos de historias de usuario, siguiendo el modelo “Como [rol ] quiero [ característica ] para que [los beneficios]”. A partir de aquí, en lugar de describir en 'lenguaje natural' lo que tiene que hacer esa nueva funcionalidad, vamos a usar un lenguaje que nos va a permitir describir todas nuestras funcionalidades de una misma forma, un lenguaje específico para BDD.

# Gherkin

Se utiliza Gherkin como lenguaje de desarrollo de las funcionalidades dado que es un lenguaje comprensible por humanos y por ordenadores, con el vamos a definir el comportamiento de la página que vamos a automatizar.
Se trata de un lenguaje fácil de leer, fácil de entender y fácil de escribir. Utilizar Gherkin nos va a permitir crear una documentación viva a la vez que automatizamos los tests, haciéndolo además con un lenguaje que puede entender negocio.
Lo bueno de Gherkin es que para empezar a hacer BDD sólo nos hace falta conocer 5 palabras, con las que construiremos sentencias con las que vamos a describir las funcionalidades:
- Feature: Indica el nombre de la funcionalidad que vamos a probar. Debe ser un título claro y explícito. Incluimos aquí una descripción en forma de historia de usuario: “Como [rol] quiero [característica] para que [los beneficios]”. Sobre esta descripción empezaremos a construir nuestros escenarios de prueba.
- Scenario: Describe cada escenario que vamos a probar.
-	Given: Provee contexto para el escenario en que se va a ejecutar el test, tales como punto donde se ejecuta el test, o prerequisitos en los datos. Incluye los pasos necesarios para poner al sistema en el estado que se desea probar.
-	When: Especifica el conjunto de acciones que lanzan el test. La interacción del usuario que acciona la funcionalidad que deseamos testear.
-	Then: Especifica el resultado esperado en el test. Observamos los cambios en el sistema y vemos si son los deseados.

# Cucumber

Se utiliza cucumber como herramienta para para automatizar las pruebas en BDD. Cucumber nos va permitir ejecutar descripciones funcionales en texto plano como pruebas de software automatizadas. Totalmente compatible con el lenguaje Gherkin.

# Compilador

Se crea el proyecto sobre Gradle, es una herramienta de automatización de la construcción de nuestro código, es la versión mejorada de Maven, pero intenta llevarlo todo un paso más allá. Para empezar, se apoya en Groovy y en un DSL (Domain Specific Language) para trabajar con un lenguaje sencillo y claro a la hora de construir el build comparado con Maven. Por otro lado, dispone de una gran flexibilidad que permite trabajar con ella utilizando otros lenguajes y no solo Java. Dispone por otro lado de un sistema de gestión de dependencias sólido.

### Patrones de desarrollo
---
Para el desarrollo de la automatización se utilizaron los siguientes patrones de desarrollo:
Variables: camelCase
Funciones: camelCase
Clases: PascalCase
Paquetes: camelCase

Camel Case: El nombre viene porque se asemeja a las dos jorobas de un camello, y se puede dividir en dos tipos:
– Upper Camel Case, cuando la primera letra de cada una de las palabras es mayúscula. También denominado Pascal Case. Ejemplo: EjemploDeNomenclatura.
– Lower Camel Case, igual que la anterior con la excepción de que la primera letra es minúscula. Ejemplo: ejemploDeNomenclatura.
Es muy usada en los #hashTags de Twitter o en lenguajes como Java, PHP, C#…

# EJECUCIÓN DEL PROYECTO

Normalmente el proyecto se puede ejecutar desde cualquier IDE, desde las opciones de ejecución que éste posea. Sin embargo, si se desea ejecutar 
desde el pipeline RM o desde una línea de comandos, podemos usar las siguientes instrucciones:
	
	•	clean test aggregate (1)
	•	clean test --tests NOMBRE_RUNNEER aggregate (2)
	
La opción (1) ejecutará todos los runners del proyecto, mientras que la opción (2) ejecutará únicamente el runner que se indique.

Al ejecutar los tests, las evidencias de la ejecución de las pruebas quedarán en el directorio:

	•	$(Repository.Name)/target/site/serenity


# DETALLES GENERALES DE LA IMPLEMENTACIÓN

La estructura completa del proyecto es la siguiente:

	exceptions: clases que controlan las posibles excepciones técnicas y del negocio que se presentan durante la ejecución de pruebas

	models: clases relacionadas con el modelo de dominio y sus respectivos builder cuando es necesario

	tasks: clases que representan tareas que realiza el actor a nivel de proceso de negocio

	interactions: clases que representan las interacciones directas con la interfaz de usuario

	userinterfaces: mapean los objetos de la interfaz de usuario

	questions: donde se verifican los resultados de las operaciones realizadas en la aplicación
	
	utils: clases de utilidad que se pueden reusar

	runners: clases que permiten ejecutar los tests

	stepdefinitions: clases que mapean las líneas Gherkin a código java

	features: la representación de las historias de usuario en lenguaje Gherkin

# HERRAMIENTA DE AUTOMATIZACION UTILIZADO

Se utiliza el IDE de IntelliJ para el desarrollo de la automatización. IntelliJ es una plataforma de desarrollo, diseñada para ser extendida de forma indefinida a través de plug-ins. Fue concebida desde sus orígenes para convertirse en una plataforma de integración de herramientas de desarrollo. No tiene en mente un lenguaje específico, sino que es un IDE genérico, aunque goza de mucha popularidad entre la comunidad de desarrolladores del lenguaje Java usando el plug-in JDT que viene incluido en la distribución estándar del IDE.
Proporciona herramientas para la gestión de espacios de trabajo, escribir, desplegar, ejecutar y depurar aplicaciones.

# NAVEGADOR UTILIZADO

Por defecto, los tests se ejecutan en el navegador Google Chrome versión  86.0.4240
