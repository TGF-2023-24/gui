package pnpl.design;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import java.util.List;
/**
 * The services class used by VSM.
 */

public class Services {
    
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
	 public EObject myService(EObject self, String arg) {
	       // TODO Auto-generated code
	      return self;
	    }
	 
	 public void deleteRelationIfOnlyChild(EObject element) {
	        // Obtén el contenedor del nodo, asumiendo que es una relación o que contiene relaciones
	        EObject container = element.eContainer();

	        if (container == null) {
	            return; // Si el contenedor es nulo, no se puede proceder
	        }

	        // Obtén las relaciones desde el contenedor (modifica 'getRelations' y 'getChilds' según tu metamodelo)
	        List<EObject> relations = (List<EObject>) container.eGet(container.eClass().getEStructuralFeature("relations"));

	        for (EObject relation : relations) {
	            List<EObject> children = (List<EObject>) relation.eGet(relation.eClass().getEStructuralFeature("Childs"));

	            // Verifica si la relación tiene al nodo como único hijo
	            if (children.contains(element) && children.size() == 1) {
	                // Elimina la relación
	                EcoreUtil.delete(relation);
	                break; // Sale del bucle después de eliminar la relación
	            }
	        }
	 }
}
