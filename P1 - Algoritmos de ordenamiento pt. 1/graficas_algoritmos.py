"""Gráficas"""
import numpy as np
import matplotlib.pyplot as plt

x_tam = np.array([50, 100, 500, 800, 1000, 2000, 5000, 10000])
y_ops_IS = np.array([1335, 5058, 126588, 318276, 501192, 1994219, 12518275, 50111677])
y_ops_SS = np.array([1319, 5144, 125742, 321191, 501492, 2002990, 12507487, 50014982])
y_ops_BS = np.array([1773, 7436, 185951, 477113, 746913, 2993509, 18683954, 75022813])
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

plt.plot(x_2, y_IS_2, 'r--o', label='Insertion Sort')
plt.plot(x_2, y_SS_2, 'g--o', label='Selection Sort')
plt.plot(x_2, y_BS_2, 'b--o', label='Bubble Sort')
plt.title("Comparativa de complejidad algorítmica")
plt.xlabel('Tamaño del arreglo')
plt.ylabel('Operaciones')
plt.grid(True)
plt.legend()
plt.show()
