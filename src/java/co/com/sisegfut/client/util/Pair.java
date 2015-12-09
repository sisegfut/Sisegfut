/**
* Pair
**/

package co.com.sisegfut.client.util;

import java.io.Serializable;

/**
 *
 * @author anfeh_000 
 */
public class Pair<D extends Object, E extends Object> implements Serializable {
    
    private D a;
    private E b;

    public Pair() {
    }
    
    
    
    public Pair(D a, E b) {
        this.a= a;
        this.b= b;
    }

    public D getA() {
        return a;
    }

    public void setA(D a) {
        this.a = a;
    }

    public E getB() {
        return b;
    }

    public void setB(E b) {
        this.b = b;
    }
    
    @Override
    public boolean equals(Object obj){
        
        if (!(obj instanceof Pair)) {
            return false;
        }
        
        Pair objeto= (Pair) obj;
        
        if (this.getA().equals(objeto.getA()) && this.getB().equals(objeto.getB())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.a != null ? this.a.hashCode() : 0);
        hash = 89 * hash + (this.b != null ? this.b.hashCode() : 0);
        return hash;
    }
    
}
