""" A) CalcularPerimetroRectangulo """
def CalcularPerimetroRectangulo(base,altura):
    return base + altura * 2




""" B) CalcularAreaRectangulo """
def CalcularAreaRectangulo(base,altura):
    return base * altura




""" C) CalcularAreaRectangulo """
def CalcularAreaRectangulo(Puntox1,Puntox2,Puntoy1,Puntoy2):
    return (Puntox2 - Puntox1) * (Puntoy2 - Puntoy1)




""" D) CalcularPerimetroCirculo """
import math

def CalcularPerimetroCirculo(diametro):
    return math.pi * diametro




""" E) CalcularAreaCirculo """
import math

def CalcularAreaCirculo (radio):
    return math.pi * math.pow(radio,2)




""" F) CalcularVolumenEsfera """
import math 

def CalcularVolumenEsfera(radio):
    return 4/3 * math.pi * math.pow(radio,3)




""" G) CalcularHipotenusaTriangulo """
import math

def CalcularHipotenusaTriangulo(catetoA,catetoB):
    return math.sqrt(catetoA**2 + catetoB**2)