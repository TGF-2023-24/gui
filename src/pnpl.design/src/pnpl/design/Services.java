package pnpl.design;

import org.eclipse.emf.ecore.EObject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * The services class used by VSM.
 */

public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	 public String parseExpression(EObject expression) {
	        // Check if the object is a Feature
	        if (expression.eClass().getName().equals("Feature")) {
	            EObject feature = (EObject) expression.eGet(expression.eClass().getEStructuralFeature("feature"));
	            return (String) feature.eGet(feature.eClass().getEStructuralFeature("name"));
	        
	        // Check if the object is a UnaryExpression
	        } else if (expression.eClass().getName().equals("UnaryExpression")) {
	            String operator = expression.eGet(expression.eClass().getEStructuralFeature("operator")).toString();
	            EObject right = (EObject) expression.eGet(expression.eClass().getEStructuralFeature("right"));
	            return operator + parseExpression(right);
	        
	        // Check if the object is a BinaryExpression
	        } else if (expression.eClass().getName().equals("BinaryExpression")) {
	            EObject left = (EObject) expression.eGet(expression.eClass().getEStructuralFeature("left"));
	            String operator = expression.eGet(expression.eClass().getEStructuralFeature("operator")).toString();
	            EObject right = (EObject) expression.eGet(expression.eClass().getEStructuralFeature("right"));
	            return "(" + parseExpression(left) + " " + operator + " " + parseExpression(right) + ")";
	        } 
	        
	        // Return a default value for unknown expressions
	        return "--Invalid Expression--";
	    }
	 
	 /**
	     * Obtiene la lista de nodos en 'requires' de un nodo dado, excluyendo aquellos
	     * nodos que son padres en la jerarquía.
	     *
	     * @param node El nodo actual (EObject) del cual se obtendrán los 'requires'.
	     * @return Lista de nodos en 'requires' que no son padres en la jerarquía.
	     */
	    public List<EObject> getRequiresExcludingParents(EObject node) {
	        Set<EObject> parents = new HashSet<>();
	        collectParents(node, parents);

	        // Obtener los nodos de la referencia 'requires'
	        List<EObject> requires = (List<EObject>) node.eGet(node.eClass().getEStructuralFeature("requires"));
	        List<EObject> validRequires = new ArrayList<>();

	        // Excluir los nodos que son padres
	        for (EObject requiredNode : requires) {
	            if (!parents.contains(requiredNode)) {
	                validRequires.add(requiredNode);
	            }
	        }

	        return validRequires;
	    }

	    /**
	     * Recorre recursivamente los padres de un nodo para recolectar todos los nodos Parent.
	     *
	     * @param node El nodo actual.
	     * @param parents El conjunto que almacena los nodos padres encontrados.
	     */
	    private void collectParents(EObject node, Set<EObject> parents) {
	        EObject parent = findParent(node);
	        if (parent != null) {
	            parents.add(parent);
	            collectParents(parent, parents); // Llamada recursiva para seguir subiendo en la jerarquía.
	        }
	    }

	    /**
	     * Encuentra el nodo padre de un nodo actual buscando en las relaciones donde el nodo es un Child.
	     *
	     * @param node El nodo actual.
	     * @return El nodo padre si existe, de lo contrario null.
	     */
	    private EObject findParent(EObject node) {
	        // Buscar el contenedor que debería ser un 'FeatureModel'
	        EObject container = node.eContainer();

	        // Verificar si el contenedor es de tipo 'FeatureModel'
	        if (container != null && container.eClass().getName().equals("FeatureModel")) {
	            // Obtener las relaciones del 'FeatureModel'
	            List<EObject> relations = (List<EObject>) container.eGet(container.eClass().getEStructuralFeature("relations"));

	            // Buscar en las relaciones la que contiene el nodo actual en su lista de 'Childs'
	            for (EObject relation : relations) {
	                List<EObject> childs = (List<EObject>) relation.eGet(relation.eClass().getEStructuralFeature("Childs"));
	                if (childs.contains(node)) {
	                    // Si se encuentra, devolver el nodo 'Parent' de la relación
	                    return (EObject) relation.eGet(relation.eClass().getEStructuralFeature("Parent"));
	                }
	            }
	        }

	        return null; // No se encontró un nodo padre
	    }
}
