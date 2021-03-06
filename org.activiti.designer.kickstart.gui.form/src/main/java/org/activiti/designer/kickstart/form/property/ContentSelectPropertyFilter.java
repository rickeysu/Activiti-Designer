package org.activiti.designer.kickstart.form.property;

import org.activiti.workflow.simple.alfresco.conversion.AlfrescoConversionConstants;

/**
 * @author Frederik Heremans
 */
public class ContentSelectPropertyFilter extends ReferencePropertyDefinitionFilter {

  @Override
  protected String getAcceptedType() {
    return  AlfrescoConversionConstants.CONTENT_TYPE_CONTENT;
  }
}
