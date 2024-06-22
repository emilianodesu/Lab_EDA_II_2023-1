public class ArbolBinBusq extends ArbolBin {

    public ArbolBinBusq(int val) {
        super(val);
    }

    public ArbolBinBusq() {
        super();
    }

    public ArbolBinBusq(Nodo root) {
        super(root);
    }

    public void add(int value) {
        Nodo nuevoNodo = new Nodo(value);
        Nodo temp = root;
        while (true) {
            if (nuevoNodo.valor > temp.valor) {
                if (temp.der != null) {
                    temp = temp.der;
                } else {
                    temp.der = nuevoNodo;
                    break;
                }
            } else {
                if (temp.izq != null) {
                    temp = temp.izq;
                } else {
                    temp.izq = nuevoNodo;
                    break;
                }
            }
        }
        
    }

    @Override
    public void delete(int value) {
        Nodo node = search(value);
        if (node == root) {
            if (node.izq == null && node.der == null) {
                System.out.println("NO ES POSIBLE ELIMINAR LA RAÍZ PORQUE EL ÁRBOL NO TIENE MAS NODOS ");
            } else if (node.der == null && node.izq != null) {
                root = node.izq;
            } else if (node.der != null && node.izq == null) {
                root = node.der;
            } else {
                Nodo temp = node.izq;
                while (temp.der != null) {
                    temp = temp.der;
                }
                Nodo topLeft = temp;
                Nodo derAux = node.der;
                if (topLeft.izq == null && topLeft.der == null) {
                    if (node.izq == topLeft) {
                        root = topLeft;
                        topLeft.der = derAux;
                    } else {
                        topLeft.izq = node.izq;
                        root = topLeft;
                        Nodo topLeftParent = getParent(topLeft.valor);
                        topLeftParent.der = null;
                        topLeft.der = derAux;
                    }
                } else {
                    Nodo topLeftParent = getParent(topLeft.valor);
                    topLeftParent.der = topLeft.izq;
                    topLeft.izq = node.izq;
                    topLeft.der = derAux;
                    root = topLeft;
                }
            }
        } else {
            Nodo parent = getParent(value);
            if (node.der == null && node.izq == null) {
                if (parent.izq == node) {
                    parent.izq = null;
                }
                if (parent.der == node) {
                    parent.der = null;
                }
            } else if (node.izq == null && node.der != null) {
                if (parent.der == node) {
                    parent.der = node.der;
                } else if (parent.izq == node) {
                    parent.izq = node.der;
                }
            } else if (node.izq != null && node.der == null) {
                if (parent.der == node) {
                    parent.der = node.izq;
                } else if (parent.izq == node) {
                    parent.izq = node.izq;
                }
            } else {
                Nodo temp = node.izq;
                while (temp.der != null) {
                    temp = temp.der;
                }
                Nodo topLeft = temp;
                Nodo derAux = node.der;
                if (parent.der == node) {
                    if (topLeft.izq == null && topLeft.der == null) {
                        if (node.izq == topLeft) {
                            parent.der = topLeft;
                            topLeft.der = derAux;
                        } else {
                            Nodo topLeftParent = getParent(topLeft.valor);
                            topLeft.izq = node.izq;
                            parent.der = topLeft;
                            topLeftParent.der = null;
                            topLeft.der = derAux;
                        }
                    } else {
                        Nodo topLeftParent = getParent(topLeft.valor);
                        topLeftParent.der = topLeft.izq;
                        topLeft.izq = node.izq;
                        topLeft.der = derAux;
                        parent.der = topLeft;
                    }
                } else if (parent.izq == node) {
                    if (topLeft.izq == null && topLeft.der == null) {
                        if (node.izq == topLeft) {
                            parent.izq = topLeft;
                            topLeft.der = derAux;
                        } else {
                            Nodo topLeftParent = getParent(topLeft.valor);
                            topLeft.izq = node.izq;
                            parent.izq = topLeft;
                            topLeftParent.der = null;
                            topLeft.der = derAux;
                        }
                    } else {
                        Nodo topLeftParent = getParent(topLeft.valor);
                        topLeftParent.der = topLeft.izq;
                        topLeft.izq = node.izq;
                        topLeft.der = derAux;
                        parent.izq = topLeft;
                    }
                }
            }
        }
    }
}
