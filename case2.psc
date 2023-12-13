Algoritmo sin_titulo
	Definir s, r, m, d, operaciones Como Entero
	Escribir 'bienvenido a mi calculadora basica '
	Escribir 'que operacion quieres hacer?'
	Escribir '1 suma, 2 resta, 3 multiplicacion, 4 divicion'
	Leer operaciones
	Según operaciones Hacer
		1:
			Definir a, b, resul Como Real
			Escribir 'suma'
			Escribir 'digite el primer numero'
			Leer a
			Escribir 'digite el segundo numero'
			Leer b
			resul <- a+b
			Escribir 'el resultado es: ', resul
		2:
			Definir a, b, resul Como Real
			Escribir 'resta'
			Escribir 'digite el primer numero'
			Leer a
			Escribir 'digite el segundo numero'
			Leer b
			resul <- a-b
			Escribir 'el resultado es: ', resul
		3:
			Definir a, b, resul Como Real
			Escribir 'multiplicacion'
			Escribir 'digite el primer numero'
			Leer a
			Escribir 'digite el segundo numero'
			Leer b
			resul <- a*b
			Escribir 'el resultado es: ', resul
		4:
			Definir a, b, resul Como Real
			Escribir 'divicion'
			Escribir 'digite el primer numero'
			Leer a
			Escribir 'digite el segundo numero'
			Leer b
			resul <- a/b
			Escribir 'el resultado es: ', resul
			Escribir 'adios'
		De Otro Modo:
			Escribir 'dije de 1 a 4 ._.'
	FinSegún
FinAlgoritmo
