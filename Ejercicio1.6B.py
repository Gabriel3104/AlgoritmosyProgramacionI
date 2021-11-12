#Escribir una funcion que: Dado un numero entero n, imprima su tabla de multiplicar.

def imprimirTablaDeMultiplicar(n):
    for i in range(1,11):
        print(f'{n} x {i} = {n*i}')
        
imprimirTablaDeMultiplicar(5)
    
