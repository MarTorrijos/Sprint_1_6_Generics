
## Descripción

Ejercicios pensados para aprender el uso de Generics.

### Tecnologias usadas

- Java 23

- IntelliJ


***

## Nivel 1

<br>

EJERCICIO 1:

Crea una clase llamada NoGenericMethods que almacene tres argumentos del mismo tipo, junto con los métodos para almacenar y extraer estos objetos y un constructor para inicializar los tres. Comprueba que los argumentos se pueden colocar en cualquier posición en la llamada al constructor.

<br>

EJERCICIO 2:

Crea una clase llamada Person con los atributos nombre, apellido y edad. Después crea una clase llamada GenericMethods con un método genérico que acepte tres argumentos de tipo genérico. Este método solo debe imprimir por pantalla los argumentos que ha recibido. En el main() de la clase principal, llama al método genérico con diferentes tipos de parámetros.

<br>

## Nivel 2

<br>

EJERCICIO 1:

Modifica el ejercicio anterior de manera que uno de los argumentos del método genérico no sea genérico.

<br>

EJERCICIO 2:

Modifica el apartado anterior de manera que los argumentos del método genérico sean una lista de argumentos de variable indefinida.

<br>

## Nivel 3

<br>

EJERCICIO 1:

Crea una interfaz llamada Teléfono y tres clases: Smartphone, Genérica y Principal.

La interfaz Teléfono debe tener un método llamado llamar(). La clase Smartphone debe implementar Teléfono, y además del método llamar(), también debe tener el método hacerFotos().

La clase Genérica debe tener dos métodos genéricos, el primero debe recibir un tipo de argumento limitado por la interfaz Teléfono y el segundo debe recibir un argumento limitado por la clase Smartphone. Desde estos dos métodos, llama a los métodos correspondientes de Teléfono y Smartphone. En el main() de la clase Principal, pasa un objeto de la clase Smartphone a los dos métodos genéricos de la clase Genérica.

El método limitado por la interfaz Teléfono, de la clase Genérica, puede llamar al método hacerFotos()

***


## Cómo ejecutarlo
Clona el repositorio o descarga el archivo zip, luego ábrelo en tu entorno de desarrollo integrado (IDE) preferido.