"""Escribir una función que reciba una cantidad de pesos, una tasa de interés y un
número de años y devuelva el monto final a obtener. La fórmula a utilizar es:
𝐶𝑛 = 𝐶 × (1 + 𝑥 )n
            (100)

Donde 𝐶 es el capital inicial, 𝑥 es la tasa de interés y 𝑛 es el número de años a calcular."""

def montoFinal(C,x,n):
    print(C*((1+x/100)**n))


montoFinal(100000,6.5,0.5)


