"""Utilizando la función del ejercicio anterior, escribir un programa que le pregunte
al usuario la cantidad de pesos inicial, la tasa de interés y el número de años y muestre el monto
final a obtener"""

CantidaddePesos = (input("Cual es la Cantidad inicial en pesos que quiere ingresar?: "))
TasaDeInteres = (input("Cual es la Tasa de interes que quiere ingresar?: "))
NumeroDeAños = (input("Cual es el numero de años que quiere ingresar?: "))

print(int(CantidaddePesos) * ((1 + float(TasaDeInteres) / 100) ** float(NumeroDeAños)))



