<?xml version="1.0" encoding="euc-kr"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <HTML>
      <HEAD><TITLE>��ǰ �����Դϴ�. </TITLE>
    </HEAD>	
      <BODY>       <BR/>
	  <P align="center"><font color="#FA4C79" size="6"> �ڵ��� ����Ʈ </font></P>
        <BR/>
        <TABLE align="center" BORDER="1" cellpadding="5" cellspacing="2">
          <THEAD>
            <TR>
             <TH bgcolor="navy"><font color="white">�𵨸�</font></TH>
             <TH bgcolor="navy"><font color="white">��Ż�</font></TH>
             <TH bgcolor="navy"><font color="white">��������</font></TH>
             <TH bgcolor="navy"><font color="white">������</font></TH>
             <TH bgcolor="navy"><font color="white">����</font></TH>
             <TH bgcolor="navy"><font color="white">����</font></TH>
             <TH bgcolor="navy"><font color="white">����</font></TH>
            </TR>
          </THEAD>
          <TBODY>
            <xsl:apply-templates select = "/��ǰ/�ڵ���"/>
          </TBODY>
        </TABLE>
      </BODY>
    </HTML>
  </xsl:template>

  <xsl:template match = "/��ǰ/�ڵ���">
  <TR>
    <TD><xsl:value-of select="�𵨸�"/></TD>
    <TD><xsl:value-of select="��Ż�"/></TD>
    <TD><xsl:value-of select="��������"/></TD>
    <TD><xsl:value-of select="������"/></TD>
    <TD><xsl:value-of select="����"/></TD>
    <TD><xsl:value-of select="����"/></TD>
    <TD><xsl:value-of select="����"/></TD>
  </TR>
  </xsl:template>
</xsl:stylesheet>