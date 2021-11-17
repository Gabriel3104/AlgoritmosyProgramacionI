"""Escribir un programa que utilice la función anterior para generar una tabla de
conversión de temperaturas, desde 0 °F hasta 120 °F, de 10 en 10."""

def conversionGradosFahrenheit():
    for fahrenheit in range(0, 130, 10):
        print(f'fahrenheit > {fahrenheit} : celsius > {conversionGradosCelcius(fahrenheit)}')

conversionGradosFahrenheit()










    