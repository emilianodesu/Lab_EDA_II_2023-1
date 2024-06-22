"""Gráficas"""
import numpy as np
import matplotlib.pyplot as plt

x_tam = np.array([50, 100, 500, 800, 1000, 2000, 5000, 10000])
y_ops_IS = np.array([1335, 5058, 126588, 318276, 501192, 1994219, 12518275, 50111677])
y_ops_SS = np.array([1319, 5144, 125742, 321191, 501492, 2002990, 12507487, 50014982])
y_ops_BS = np.array([1773, 7436, 185951, 477113, 746913, 2993509, 18683954, 75022813])
y_ops_HS = np.array([1109, 2645, 17697, 30517, 39171, 86595, 243513, 526219])
y_ops_QS = np.array([784, 1902, 13404, 23679, 30481, 67322, 207357, 498129])
y_ops_MS = np.array([898, 2005, 12329, 20887, 26671, 57360, 157030, 334021])

x_1 = x_tam[:5]
x_2 = x_tam[4:]
y_IS_1 = y_ops_IS[:5]
y_IS_2 = y_ops_IS[4:]
y_SS_1 = y_ops_SS[:5]
y_SS_2 = y_ops_SS[4:]
y_BS_1 = y_ops_BS[:5]
y_BS_2 = y_ops_BS[4:]

# plt.plot(x_1, y_IS_1, 'r--o', label='Insertion Sort')
# plt.plot(x_1, y_SS_1, 'g--o', label='Selection Sort')
# plt.plot(x_1, y_BS_1, 'b--o', label='Bubble Sort')
# plt.title("Comparativa de complejidad algorítmica")
# plt.xlabel('Tamaño del arreglo')
# plt.ylabel('Operaciones')
# plt.grid(True)
# plt.legend()
# plt.show()

# plt.plot(x_2, y_IS_2, 'r--o', label='Insertion Sort')
# plt.plot(x_2, y_SS_2, 'g--o', label='Selection Sort')
# plt.plot(x_2, y_BS_2, 'b--o', label='Bubble Sort')
# plt.title("Comparativa de complejidad algorítmica")
# plt.xlabel('Tamaño del arreglo')
# plt.ylabel('Operaciones')
# plt.grid(True)
# plt.legend()
# plt.show()

plt.plot(x_tam, y_ops_IS, 'r--o', label='Insertion Sort')
plt.plot(x_tam, y_ops_SS, 'g--o', label='Selection Sort')
plt.plot(x_tam, y_ops_BS, 'b--o', label='Bubble Sort')
plt.plot(x_tam, y_ops_HS, 'c--o', label='Heap Sort')
plt.plot(x_tam, y_ops_QS, 'm--o', label='Quick Sort')
plt.plot(x_tam, y_ops_MS, 'y--o', label='Merge Sort')
plt.title("Comparativa de complejidad algorítmica")
plt.xlabel('Tamaño del arreglo')
plt.ylabel('Operaciones')
plt.grid(True)
plt.legend()
plt.show()
