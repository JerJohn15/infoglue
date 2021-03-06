/* ===============================================================================
 *
 * Part of the InfoGlue Content Management Platform (www.infoglue.org)
 *
 * ===============================================================================
 *
 *  Copyright (C)
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License version 2, as published by the
 * Free Software Foundation. See the file LICENSE.html for more information.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY, including the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc. / 59 Temple
 * Place, Suite 330 / Boston, MA 02111-1307 / USA.
 *
 * ===============================================================================
 */

package org.infoglue.cms.entities.workflow;

import org.infoglue.cms.entities.kernel.IBaseEntity;

public interface Workflow extends IBaseEntity
{
        
    public Integer getId();
     	    
    public WorkflowVO getValueObject();
    
    public void setValueObject(WorkflowVO valueObject);

    
    public java.lang.Integer getWorkflowId();
    
    public void setWorkflowId(java.lang.Integer workflowId);
    
    public java.lang.String getName();
    
    public void setName(java.lang.String name);
    
    public java.lang.String getDescription();
    
    public void setDescription(java.lang.String description);
    
    public java.util.Collection getActions();
    
    public void setActions(java.util.Collection actions);
        
}
