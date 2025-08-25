# Mini-Hackathon

## Lineamientos
- Debes crear una clase `Hackathon.java` en el paquete `co.edu.utadeo.fcni`.  
- Para cada uno de los siguientes puntos escribe un método `static` denominado `mXX` (donde **XX** es el número de la pregunta), por ejemplo: `m1`, `m2`, `m3`...  
- Para cada método hay cinco pruebas en el archivo `HackathonTest.java` que está en este mismo directorio.  

## Ejercicios

1. Reciba un número entero del **1 al 5** y diga si es primo o no, retornando `true` o `false`.  
   - Si el número está por fuera del rango, lanza un `InvalidInputException`.

2. Reciba un número entero y retorne un `String` `"par"` o `"impar"`, según sea el caso.

3. Reciba un número del **1 al 7** y retorne el día de la semana correspondiente.  
   - Ejemplo: si se ingresa `1` retorna `"lunes"`.  
   - Si el número está por fuera del rango, lanza un `InvalidInputException`.

4. Reciba un `String` y lo imprima todo en **mayúsculas**.  
   - Ejemplo: `"hello"` → imprime `"HELLO"`.

5. Reciba un número y retorne el `String`:  
   - `"cero"` si es 0,  
   - `"positivo"` si es mayor que 0,  
   - `"negativo"` si es menor que 0.

6. Reciba una letra y retorne `true` si es una **vocal**, de lo contrario `false`.

7. Reciba **dos números del 1 al 5** y retorne `true` si ambos son primos, de lo contrario `false`.  
   - Si alguno de los números está por fuera del rango, lanza un `InvalidInputException`.

8. Reciba un **importe bruto** y retorne su importe neto.  
   - Si es mayor de `15000`, aplicar un **16% de impuestos**.  
   - Si es menor o igual, aplicar un **10% de impuestos**.  
   - Si el importe bruto es negativo, lanza un `InvalidInputException`.

9. Reciba un **arreglo de enteros** y cuente el número de veces que aparece el número `7`.  
   - Retorna ese valor.

10. Reciba un **arreglo de enteros** y retorne la **suma** de todos los números.  
    - Este método **no lanza excepciones**.

11. Reciba un **arreglo de enteros** y retorne el **promedio** de todos los números.  
    - Si el arreglo está vacío, lanza un `InvalidInputException`.

12. Reciba un **arreglo de enteros** y retorne el **número más alto**.  
    - Si el arreglo está vacío, lanza un `InvalidInputException`.

13. Reciba un **arreglo de enteros** y lo imprima **al revés** (un valor por línea).  
    - Este método **no lanza excepciones**.

14. Reciba **3 números** y los imprima en pantalla **de menor a mayor** (cada uno en una línea separada).
