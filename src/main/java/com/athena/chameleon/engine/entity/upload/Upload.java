/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Revision History
 * Author			Date				Description
 * ---------------	----------------	------------
 * Hyo-jeong Lee	2012. 9. 13.		First Draft.
 */
package com.athena.chameleon.engine.entity.upload;

import java.io.Serializable;
import java.lang.reflect.Field;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * This Genre class is a Value Object class for Upload.
 * 
 * @author Hyo-jeong Lee
 * @version 1.0
 */
public class Upload implements Serializable {

    private static final long serialVersionUID = 1L;
    private String projectNm;
    private String department;
    private String person;
    private String orgRole;
    private String beforeWas;
    private String afterWas;
    private CommonsMultipartFile   projectSrc;
    private CommonsMultipartFile   deploySrc;
    
	/**
	 * @return the projectNm
	 */
	public String getProjectNm() {
		return projectNm;
	}
	/**
	 * @param projectNm the projectNm to set
	 */
	public void setProjectNm(String projectNm) {
		this.projectNm = projectNm;
	}
	/**
	 * @return the person
	 */
	public String getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(String person) {
		this.person = person;
	}
	/**
	 * @return the beforeWas
	 */
	public String getBeforeWas() {
	    if(beforeWas == null)
	        return "";
	    else if(beforeWas.equals("W"))
	        return "WEB LOGIC";
	    else if(beforeWas.equals("J"))
	        return "JEUS";
	    else if(beforeWas.equals("S"))
	        return "WEBSPHERE";
	    else 
	        return beforeWas;
	}
	/**
	 * @param beforeWas the beforeWas to set
	 */
	public void setBeforeWas(String beforeWas) {
		this.beforeWas = beforeWas;
	}
	/**
	 * @return the afterWas
	 */
	public String getAfterWas() {
	    if(afterWas == null)
            return "";
        else if(afterWas.equals("B"))
            return "JBoss";
        else if(afterWas.equals("T"))
            return "Tomcat";
        else
            return afterWas;
	}
	/**
	 * @param afterWas the afterWas to set
	 */
	public void setAfterWas(String afterWas) {
		this.afterWas = afterWas;
	}
	/**
	 * @return the projectSrc
	 */
	public CommonsMultipartFile getProjectSrc() {
		return projectSrc;
	}
	/**
	 * @param projectSrc the projectSrc to set
	 */
	public void setProjectSrc(CommonsMultipartFile projectSrc) {
		this.projectSrc = projectSrc;
	}
	/**
	 * @return the deploySrc
	 */
	public CommonsMultipartFile getDeploySrc() {
		return deploySrc;
	}
	/**
	 * @param deploySrc the deploySrc to set
	 */
	public void setDeploySrc(CommonsMultipartFile deploySrc) {
		this.deploySrc = deploySrc;
	}
	/**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }
    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    /**
     * @return the orgRole
     */
    public String getOrgRole() {
        return orgRole;
    }
    /**
     * @param orgRole the orgRole to set
     */
    public void setOrgRole(String orgRole) {
        this.orgRole = orgRole;
    }
    
	public String toString() {
		return getReflectionToString(this);
	}

	/**
	 * 
	 * Model class 의 field 를 문자열로 정리하여 반환함.
	 * 
	 * @param object
	 * @return
	 */
	@SuppressWarnings({ "rawtypes" })
	public static String getReflectionToString(Object object) {
		Class clazz = object.getClass();
		Field[] fields = clazz.getDeclaredFields();
		StringBuilder returnString = new StringBuilder();
		for (Field field : fields) {
			field.setAccessible(true);
			returnString.append(field.getName());
			returnString.append(" = ");
			try {
				returnString.append(field.get(object));
			}
			catch (IllegalArgumentException e) {
				returnString.append("IllegalArgumentException occured!!");
				returnString.append(e.toString());
			}
			catch (IllegalAccessException e) {
				returnString.append("IllegalAccessException occured!!");
				returnString.append(e.toString());
			}
			returnString.append(";");
		}
		return returnString.toString();
	}

}
