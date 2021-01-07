<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">

<HTML>
<HEAD>
	<TITLE>제품 내역입니다. </TITLE>
</HEAD>
<BODY> 
	<TABLE align="center" BORDER="1" style="">
		<TBODY>
			<table border="1">
			<tr>
				<xsl:apply-templates select = "/제품/신발"/>
			</tr>
			</table>
		</TBODY>
	</TABLE>
</BODY>
</HTML>
</xsl:template>

<xsl:template match = "/제품/신발">
<xsl:variable name="index"><xsl:number/></xsl:variable>

	
	

<xsl:choose>

 <xsl:when test="$index mod 5 = 0">

    <tr>
	</tr>

	<td width="200" height="100">
			<!-- 이미지 요소를 만나면 이미지 템플릿 규칙이 적용됨-->
			<p align="center"><xsl:apply-templates select = "이미지"/><br/>
			<xsl:apply-templates select = "모델명"/><br/>
			<xsl:apply-templates select = "코드"/><br/>
			<xsl:apply-templates select = "가격"/></p>
		</td>

  </xsl:when>
 <xsl:otherwise>

		<td width="200" height="100">
			<!-- 이미지 요소를 만나면 이미지 템플릿 규칙이 적용됨-->
			<p align="center"><xsl:apply-templates select = "이미지"/><br/>
			<xsl:apply-templates select = "모델명"/><br/>
			<xsl:apply-templates select = "코드"/><br/>
			<xsl:apply-templates select = "가격"/></p>
		</td>
  </xsl:otherwise>
  </xsl:choose>

 

  



</xsl:template>

<!-- 이미지 요소의 내용을 그림으로 출력하기 위해서 요소와 속성 생성하는 템플릿 규칙 -->
<xsl:template match = "이미지">
	<xsl:element name="img">
		<xsl:attribute name="src">
			<xsl:value-of select="."/>
		</xsl:attribute>
		<xsl:attribute name="width">120</xsl:attribute>
		<xsl:attribute name="height">90</xsl:attribute>
	</xsl:element>
</xsl:template>
</xsl:stylesheet>

