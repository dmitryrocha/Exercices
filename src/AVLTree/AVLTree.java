package AVLTree;

public class AVLTree {
    private No raiz;
    private AVLTree dir;
    private AVLTree esq;
    private int balanco;

    public AVLTree() {
        this.raiz = null;
        this.dir  = null;
        this.esq = null;
        this.balanco = 0;
    }

    public AVLTree(No no) {
        this.raiz = no;
        this.dir  = null;
        this.esq = null;
        this.balanco = 0;
    }

    public boolean isEmpty() {
        return (this.raiz == null);
    }

    public void imprimirPreOrdem() {
        if(!isEmpty()){
            System.out.print(this.raiz.getValor() + " ");
            if(this.esq != null) {
                this.esq.imprimirPreOrdem();
            }
            if(this.dir != null) {
                this.dir.imprimirPreOrdem();
            }
        }
    }

    public void imprimirNaOrdem() {
        if(!isEmpty()){
            if(this.esq != null) {
                this.esq.imprimirNaOrdem();
            }
            System.out.print(this.raiz.getValor()+" ");
            if(this.dir != null) {
                this.dir.imprimirNaOrdem();
            }
        }
    }

    public void imprimirPosOrdem() {
        if(!isEmpty()) {
            if(this.dir != null) {
                this.dir.imprimirPosOrdem();
            }
            if(this.esq != null) {
                this.esq.imprimirPosOrdem();
            }
            System.out.println(this.raiz.getValor());
        }
    }

    public AVLTree inserir(No newNo) {
        if(isEmpty()) {
            this.raiz = newNo;
        } else {
            AVLTree arvoreNova = new AVLTree(newNo);
            if(newNo.getValor() < this.raiz.getValor()) {
                if(this.esq == null) {
                    this.esq = arvoreNova;
                } else {
                    this.esq = this.esq.inserir(newNo);
                }
            } else if(newNo.getValor() > this.raiz.getValor()) {
                if(this.dir == null) {
                    this.dir = arvoreNova;
                } else {
                    this.dir = this.dir.inserir(newNo);
                }
            }
        }
        return this;
    }

    public int getBalanco() {
        return this.balanco;
    }

    public void setBalanco(int balanco) {
        this.balanco = balanco;
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public AVLTree getDir() {
        return dir;
    }

    public void setDir(AVLTree dir) {
        this.dir = dir;
    }

    public AVLTree getEsq() {
        return esq;
    }

    public void setEsq(AVLTree esq) {
        this.esq = esq;
    }

    public String printArvore(int level) {
        String str = this.toString()+"\n";
        for(int i = 0; i < level; i++) {
            str+="\t";
        }
        if(this.esq != null) {
            str+= "+-ESQ: "+this.esq.printArvore(level+1);
        } else {
            str+= "+-ESQ: NULL";
        }
        str += "\n";

        for(int i = 0; i < level; i++) {
            str+="\t";
        }

        if(this.dir != null) {
            str+= "+-DIR: "+this.dir.printArvore(level+1);
        } else {
            str+= "+-DIR: NULL";
        }
        str += "\n";

        return str;
    }

    public int calcularAltura() {
        if(this.esq == null && this.dir == null) {
            // não tem filhos
            return 1;
        } else if (this.esq != null && this.dir == null) {
            // só o da esquerda tem filhos
            return 1 + this.calcularAltura();
        } else if (this.esq == null && this.dir != null) {
            // só o da direita em filhos
            return 1 + this.dir.calcularAltura(); 
        } else {
            // tem filhos dos dois lados, então recorre ao Math para ver quem tem mais filhos
            return 1 + Math.max(this.esq.calcularAltura(), this.dir.calcularAltura());
        }
    }

    public void calcularBalanceamento() {
        if(this.dir == null && this.esq == null) {
            // os dois lados não possuem filhos
            this.balanco = 0;
        } else if(this.esq == null && this.dir != null) {
            // tem descendência à direita
            this.balanco = this.dir.calcularAltura() - 0; // o menos 0 é para demonstrar que não há altura à esquerda
        } else if (this.esq != null && this.dir == null) {
            // tem descendência à esquerda
            this.balanco = 0 - this.esq.calcularAltura(); // é zero menos a altura porque agora a esquerda tem descendência
        } else {
            this.balanco = this.dir.calcularAltura() - this.esq.calcularAltura();
        }
        if(this.dir != null) {
            this.dir.calcularBalanceamento();
        }
        if(this.esq != null) {
            this.esq.calcularBalanceamento(); 
        }
    }

    public String toString() {
        return "["+this.raiz.getValor()+"] ("+this.balanco+")";
    }

}