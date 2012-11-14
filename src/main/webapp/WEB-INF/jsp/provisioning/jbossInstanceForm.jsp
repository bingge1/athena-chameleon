<%@ page language="java" errorPage="/sample/common/error.jsp" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<%@ include file="/taglib/taglibs.jsp"%>
<script type="text/javascript">
	onMenu(2);

	$(document).ready(function (){
		
		$('#nextBtn').click(function() { 
			if(!$('#serverIp').val()) {
				alert('Server IP가 입력되지 않았습니다. 정보를 입력하여 주십시오.');
				$('#serverIp').focus();
				return false;
			} else if(!$('#serverPort').val()) {
				alert('Server Port가 입력되지 않았습니다. 정보를 입력하여 주십시오.');
				$('#serverPort').focus();
				return false;
			} else if(!$('#sshLoginId').val()) {
				alert('SSH Login ID가 입력되지 않았습니다. 정보를 입력하여 주십시오.');
				$('#sshLoginId').focus();
				return false;
			} else if(!$('#sshLoginPassword').val()) {
				alert('SSH Login Password가 입력되지 않았습니다. 정보를 입력하여 주십시오.');
				$('#sshLoginPassword').focus();
				return false;
			} else if(!$('#engineHome').val()) {
				alert('JBoss Engine Home이 입력되지 않았습니다. 정보를 입력하여 주십시오.');
				$('#engineHome').focus();
				return false;
			} else if(!$('#serverHome').val()) {
				alert('JBoss Server Home이 입력되지 않았습니다. 정보를 입력하여 주십시오.');
				$('#serverHome').focus();
				return false;
			} else if(!$('#serverName').val()) {
				alert('JBoss Server Name이 입력되지 않았습니다. 정보를 입력하여 주십시오.');
				$('#serverName').focus();
				return false;
			} else {
				var form = $("#instanceForm").get(0);
				form.action = "<c:url value='/provisioning/dataSourceForm.do' />";
				form.submit();
			}
		});
	});
</script>
<form:form modelAttribute="provisioning" method="post" id="instanceForm" name="instanceForm">
	<input type="hidden" id="targetWas" name="targetWas" value="${provisioning.targetWas}">
	
	<div class="tit_box">JBoss 인스턴스 정보 입력</div>
    <div class="bt_tab_box01">
    	<div class="bt_tab_txt01">JBoss</div>
        <div class="bt_tab_txt01" style="color:#858686"><a href="<c:url value='/provisioning/wasInstanceForm.do?targetWas=T' />">Tomcat</a></div>
    </div>
	<div class="bg_formbox" style="height:600px;">
    	<div class="formbox_txt01"><p style="padding-top:11px; padding-left:15px;">Server IP</p></div>
        <div class="formbox_form01"><input type="text" id="serverIp" name="jbossInstance.serverIp" title="Server IP 입력" class="input_form02" /></div>
        
        <div class="formbox_txt02"><p style="padding-top:11px; padding-left:15px;">Server Port</p></div>
        <div class="formbox_form02"><input type="text" id="serverPort" name="jbossInstance.serverPort" title="Server Port 입력" class="input_form02" /></div>
       
        <div class="formbox_txt02"><p style="padding-top:11px; padding-left:15px;">SSH Login ID</p></div>
        <div class="formbox_form02"><input type="text" id="sshLoginId" name="jbossInstance.sshLoginId" title="Ssh-login-id 입력" class="input_form02" /></div>
        
        <div class="formbox_txt02"><p style="padding-top:11px; padding-left:15px;">SSH Login Password</p></div>
        <div class="formbox_form02"><input type="password" id="sshLoginPassword" name="jbossInstance.sshLoginPassword" title="Ssh password 입력" class="input_form02" /></div>
        
        <div class="formbox_txt02"><p style="padding-top:11px; padding-left:15px;">JBoss Engine Home</p></div>
        <div class="formbox_form02">
	        <div class="formbox_sub01"><input type="text" id="engineHome" name="jbossInstance.engineHome" title="JBoss Engine Home 입력" class="input_form02"/></div> <!-- Inputbox 가로폭을 250으로 줄임 -->
<!-- 	        <div class="formbox_radiotxt"><p style="padding-top:11px; padding-left:0;">신규설치 :</p></div> -->
<!-- 	        <div class="formbox_radioform" style="margin-left:10px"><input type="radio" id="newInstallY" name="jbossInstance.newInstallYn" value="Y" class="regular-radio" checked /><label for="newInstallY"></label></div> -->
<!-- 	        <div class="formbox_radiotxt"><p style="padding-top:11px; padding-left:0;">Yes</p></div> -->
<!-- 	        <div class="formbox_radioform"><input type="radio" id="newInstallN" name="jbossInstance.newInstallYn" value="N" class="regular-radio" /><label for="newInstallN"></label></div> -->
<!-- 	        <div class="formbox_radiotxt"><p style="padding-top:11px; padding-left:0;">No</p></div> -->
     	</div>
     	
        <div class="formbox_txt02"><p style="padding-top:11px; padding-left:15px;">JBoss Server Home</p></div>
        <div class="formbox_form02"><input type="text" id="serverHome" name="jbossInstance.serverHome" title="JBoss Server Home 입력" class="input_form02" /></div>
        
        <div class="formbox_txt02"><p style="padding-top:11px; padding-left:15px;">JBoss Server Name</p></div>
        <div class="formbox_form02"><input type="text" id="serverName" name="jbossInstance.serverName" title="JBoss Server Name 입력" class="input_form02" /></div>
        
        <div class="formbox_txt02"><p style="padding-top:11px; padding-left:15px;">Port Group</p></div>
        <div class="formbox_form02">
       	   <div class="formbox_radioform" style="margin-left:0"><input type="radio" id="portGroup1" name="jbossInstance.portGroup" value="ports-default" class="regular-radio" checked /><label for="portGroup1"></label></div>
           <div class="formbox_radiotxt"><p style="padding-top:11px; padding-left:0;">ports-default</p></div>
           <div class="formbox_radioform"><input type="radio" id="portGroup2" name="jbossInstance.portGroup" value="ports-01" class="regular-radio" /><label for="portGroup2"></label></div>
           <div class="formbox_radiotxt"><p style="padding-top:11px; padding-left:0;">ports-01</p></div>
           <div class="formbox_radioform"><input type="radio" id="portGroup3" name="jbossInstance.portGroup" value="ports-02" class="regular-radio" /><label for="portGroup3"></label></div>
           <div class="formbox_radiotxt"><p style="padding-top:11px; padding-left:0;">ports-02</p></div>
           <div class="formbox_radioform"><input type="radio" id="portGroup4" name="jbossInstance.portGroup" value="ports-03" class="regular-radio" /><label for="portGroup4"></label></div>
           <div class="formbox_radiotxt"><p style="padding-top:11px; padding-left:0;">ports-03</p></div>        	
       </div>

       <div class="common_btn"><a href="javascript:void(0);" id="nextBtn"><img src="<c:url value='/images/common/bt_next01.png' />" /></a></div>        
   </div>        
 </form:form>
