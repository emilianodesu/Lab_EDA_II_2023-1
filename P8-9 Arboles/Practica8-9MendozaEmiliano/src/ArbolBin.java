import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Edgar
 */
public class ArbolBin {
    Nodo root;

    public ArbolBin() {
        root = null;
    }

    public ArbolBin(int val) {
        root = new Nodo(val);
    }

    public ArbolBin(Nodo root) {
        this.root = root;
    }

    public void setRoot(int value) {
        root = new Nodo(value);
    }

    public int getRoot() {
        return root.valor;
    }

    public void add(Nodo padre, Nodo hijo, int lado) {
        if (lado == 0)
            padre.setIzq(hijo);
        else
            padre.setDer(hijo);
    }

    protected void visit(Nodo n) {
        System.out.println(n.valor + " ");
    }

    public void breadthFirst() {
        Nodo r = root;
        Queue<Nodo> queue = new LinkedList<>();
        if (r != null) {
            queue.add(r);
            while (!queue.isEmpty()) {
                r = queue.poll();
                visit(r);
                if (r.izq != null)
                    queue.add(r.izq);
                if (r.der != null)
                    queue.add(r.der);
            }
        }
    }

    public void contains(int x) {
        boolean flag = false;
        Nodo r = root;
        Queue<Nodo> queue = new LinkedList<>();
        if (r != null) {
            queue.add(r);
            while (!queue.isEmpty()) {
                r = queue.poll();
                if (r.valor == x){
                    System.out.println("El valor " + x + " SI esta en el arbol");
                    flag = true;
                }
                if (r.izq != null)
                    queue.add(r.izq);
                if (r.der != null)
                    queue.add(r.der);
            }
        }
        if (!flag) {
            System.out.println("El valor " + x + " NO esta en el arbol");
        }
    }

    public Nodo search(int x) {
        Nodo r = root;
        Queue<Nodo> queue = new LinkedList<>();
        if (r != null) {
            queue.add(r);
            while (!queue.isEmpty()) {
                r = queue.poll();
                if (r.valor == x) {
                    return r;
                }
                if (r.izq != null)
                    queue.add(r.izq);
                if (r.der != null)
                    queue.add(r.der);
            }
        }
        System.out.println("El valor " + x + " NO esta en el arbol");
        return null;
    }

    public Nodo getParent(int value) {
        Nodo r = root;
        Queue<Nodo> queue = new LinkedList<>();
        if (r != null) {
            queue.add(r);
            while (!queue.isEmpty()) {
                r = queue.poll();
                if ((r.izq != null) && (r.izq.valor == value)) {
                    return r;
                }
                if ((r.der != null) && (r.der.valor == value)) {
                    return r;
                }
                if (r.izq != null)
                    queue.add(r.izq);
                if (r.der != null)
                    queue.add(r.der);
            }
        }
        return null;
    }

    public void delete(int value) {
        Nodo node = search(value);
        if (node == root) {
            if (node.izq == null && node.der == null) {
                System.out.println("NO ES POSIBLE ELIMINAR LA RAÍZ PORQUE EL ÁRBOL NO TIENE MAS NODOS ");
            }else if (node.izq != null && node.der == null) {
                root = node.izq;
            } else if (node.izq == null && node.der != null) {
                root = node.der;
            } else {
                Nodo derAux = node.der;
                Nodo temp = node.izq;
                while (temp.der != null) {
                }
                Nodo topLeft = temp;
                topLeft.der = derAux;
                root = node.izq;
            }
        } else {
            Nodo parent = getParent(value);
            if (node.izq == null && node.der == null) {
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
                if (parent.der == node) {
                    Nodo derAux = node.der;
                    parent.der = node.izq;
                    topLeft.der = derAux;
                } else if (parent.izq == node) {
                    Nodo derAux = node.der;
                    parent.izq = node.izq;
                    topLeft.der = derAux;
                }
            }
        }
    }

    public void preorder() {
        preorderUtil(root);
    }

    private void preorderUtil(Nodo n) {
        visit(n);
        if (n.izq != null)
            preorderUtil(n.izq);
        if (n.der != null)
            preorderUtil(n.der);
    }

    public void inorder() {
        inorderUtil(root);
    }

    private void inorderUtil(Nodo n) {
        if (n.izq != null)
            inorderUtil(n.izq);
        visit(n);
        if (n.der != null)
            inorderUtil(n.der);
    }

    public void postorder() {
        postorderUtil(root);
    }

    private void postorderUtil(Nodo n) {
        if (n.izq != null)
            postorderUtil(n.izq);
        if (n.der != null)
            postorderUtil(n.der);
        visit(n);
    }
}
