package pnpl.design;

import org.eclipse.emf.ecore.EObject;

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
	            return operator + "(" + parseExpression(right) + ")";
	        
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
}
