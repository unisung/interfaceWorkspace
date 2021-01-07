<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
<HTML>
<HEAD>
	<TITLE>제품 내역입니다. </TITLE>
	<style>
		div.list {width:800px; height:400px; padding:0px; border:3px solidc #b40000;}
		div.product {width:200px; height:200px; float:left; margin:0px; border:1px solid #000000;}
	</style>
</HEAD>
<BODY>
	<div class="list">
		<xsl:for-each select="/제품/신발">
			<div class="product">
				<!--	이미지 요소를 만나면 이미지 템플릿 규칙이 적용됨	-->
				<p align="center">
					<xsl:apply-templates select = "이미지"/><br/>
					<xsl:apply-templates select = "번호"/><br/>
					<xsl:apply-templates select = "모델명"/><br/>
					<xsl:apply-templates select = "코드"/><br/>
					<xsl:apply-templates select = "가격"/>
				</p>
			</div>
		</xsl:for-each>
	</div>
</BODY>
</HTML>
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
