# Maps FX
## About The Project
Maps FX is an app for wheel chair users to use in order to navigate around UCO's campus safely. We used Google's Directions api to perform the navigations.

## Built With
Java FX
Java
HTML
PHP
JQuery
AJAX
Google Maps API
SimpleJSON
JCraft

<html xmlns:v="urn:schemas-microsoft-com:vml"
xmlns:o="urn:schemas-microsoft-com:office:office"
xmlns:w="urn:schemas-microsoft-com:office:word"
xmlns:m="http://schemas.microsoft.com/office/2004/12/omml"
xmlns="http://www.w3.org/TR/REC-html40">
<head>
<meta http-equiv=Content-Type content="text/html; charset=windows-1252">
<meta name=ProgId content=Word.Document>
<meta name=Generator content="Microsoft Word 15">
<meta name=Originator content="Microsoft Word 15">
<link rel=File-List href="combined_files/filelist.xml">
<link rel=Edit-Time-Data href="combined_files/editdata.mso">
</head>

<body lang=EN-US link=blue vlink="#954F72" style='tab-interval:.5in;word-wrap:
break-word'>

<div class=WordSection1>

<p class=Title-Subject align=left style='margin-top:0in;margin-right:.75in;
margin-bottom:0in;margin-left:0in;text-align:left'><!--[if supportFields]><b
style='mso-bidi-font-weight:normal'><span style='mso-element:field-begin'></span><span
style='mso-spacerun:yes'> </span>SUBJECT<span style='mso-spacerun:yes'> 
</span>\* MERGEFORMAT <span style='mso-element:field-separator'></span></b><![endif]--><b
style='mso-bidi-font-weight:normal'>Software Design Specification</b><!--[if supportFields]><b
style='mso-bidi-font-weight:normal'><span style='mso-element:field-end'></span></b><![endif]--><b
style='mso-bidi-font-weight:normal'><o:p></o:p></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='font-family:"Arial",sans-serif'>Wheelchair
Navigation Version 1.0 approved<o:p></o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'>Prepared
by <o:p></o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'>Reuben
Randell<o:p></o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'>Blake
Brooks<o:p></o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'>Chad
Marshall<o:p></o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'>University
of Central Oklahoma<o:p></o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'>Software
Engineering 1<o:p></o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'>Dr.
Fu<o:p></o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal style='margin-bottom:0in'><span style='font-family:"Arial",sans-serif'>March
20th, 2021</span><b style='mso-bidi-font-weight:normal'><span style='font-size:
16.0pt;font-family:"Arial",sans-serif'><o:p></o:p></span></b></p>

<p class=Title-Revision align=left style='text-align:left;line-height:115%'><span
style='mso-bidi-font-family:Arial'><o:p>&nbsp;</o:p></span></p>

<p class=Title-Revision style='line-height:115%'><span style='mso-bidi-font-family:
Arial'><o:p>&nbsp;</o:p></span></p>

<p class=Title-Revision style='line-height:115%'><span style='mso-bidi-font-family:
Arial'><o:p>&nbsp;</o:p></span></p>

</div>

<b style='mso-bidi-font-weight:normal'><span style='font-size:16.0pt;
mso-bidi-font-size:10.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
SimSun;mso-font-kerning:14.0pt;mso-ansi-language:EN-US;mso-fareast-language:
EN-US;mso-bidi-language:AR-SA'><br clear=all style='page-break-before:always;
mso-break-type:section-break'>
</span></b>

<div class=WordSection2>

<div style='mso-element:para-border-div;border:solid windowtext 1.0pt;
mso-border-top-alt:.5pt;mso-border-left-alt:.75pt;mso-border-bottom-alt:.5pt;
mso-border-right-alt:.75pt;mso-border-color-alt:windowtext;mso-border-style-alt:
solid;padding:1.0pt 1.0pt 1.0pt 1.0pt;background:#4C4C4C;mso-shading:white;
mso-pattern:gray-70 auto'>

<p class=Contents><span style='mso-bidi-font-family:Arial'>Revisions<o:p></o:p></span></p>

</div>

<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0
 style='margin-left:5.4pt;border-collapse:collapse;border:none;mso-border-alt:
 solid windowtext 1.5pt;mso-padding-alt:0in 5.4pt 0in 5.4pt;mso-border-insideh:
 .75pt solid windowtext;mso-border-insidev:.75pt solid windowtext'>
 <thead>
  <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;page-break-inside:avoid'>
   <td width=78 valign=top style='width:58.5pt;border-top:1.5pt;border-left:
   1.5pt;border-bottom:1.0pt;border-right:1.0pt;border-color:windowtext;
   border-style:solid;mso-border-top-alt:1.5pt;mso-border-left-alt:1.5pt;
   mso-border-bottom-alt:.75pt;mso-border-right-alt:.75pt;mso-border-color-alt:
   windowtext;mso-border-style-alt:solid;background:#E5E5E5;mso-shading:windowtext;
   mso-pattern:gray-10 auto;padding:0in 5.4pt 0in 5.4pt'>
   <p class=Table-ColHead><span style='mso-bidi-font-family:Arial;color:black;
   mso-color-alt:windowtext'>Version</span><span style='mso-bidi-font-family:
   Arial'><o:p></o:p></span></p>
   </td>
   <td width=102 valign=top style='width:76.5pt;border-top:solid windowtext 1.5pt;
   border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
   mso-border-left-alt:solid windowtext .75pt;mso-border-alt:solid windowtext .75pt;
   mso-border-top-alt:solid windowtext 1.5pt;background:#E5E5E5;mso-shading:
   windowtext;mso-pattern:gray-10 auto;padding:0in 5.4pt 0in 5.4pt'>
   <p class=Table-ColHead><span style='mso-bidi-font-family:Arial;color:black;
   mso-color-alt:windowtext'>Primary Author(s)</span><span style='mso-bidi-font-family:
   Arial'><o:p></o:p></span></p>
   </td>
   <td width=288 valign=top style='width:3.0in;border-top:solid windowtext 1.5pt;
   border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
   mso-border-left-alt:solid windowtext .75pt;mso-border-alt:solid windowtext .75pt;
   mso-border-top-alt:solid windowtext 1.5pt;background:#E5E5E5;mso-shading:
   windowtext;mso-pattern:gray-10 auto;padding:0in 5.4pt 0in 5.4pt'>
   <p class=Table-ColHead><span style='mso-bidi-font-family:Arial;color:black;
   mso-color-alt:windowtext'>Description of Version</span><span
   style='mso-bidi-font-family:Arial'><o:p></o:p></span></p>
   </td>
   <td width=84 valign=top style='width:63.0pt;border-top:solid windowtext 1.5pt;
   border-left:none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.5pt;
   mso-border-left-alt:solid windowtext .75pt;mso-border-top-alt:1.5pt;
   mso-border-left-alt:.75pt;mso-border-bottom-alt:.75pt;mso-border-right-alt:
   1.5pt;mso-border-color-alt:windowtext;mso-border-style-alt:solid;background:
   #E5E5E5;mso-shading:windowtext;mso-pattern:gray-10 auto;padding:0in 5.4pt 0in 5.4pt'>
   <p class=Table-ColHead align=center style='text-align:center'><span
   style='mso-bidi-font-family:Arial;color:black;mso-color-alt:windowtext'>Date
   Completed</span><span style='mso-bidi-font-family:Arial'><o:p></o:p></span></p>
   </td>
  </tr>
 </thead>
 <tr style='mso-yfti-irow:1;page-break-inside:avoid'>
  <td width=78 valign=top style='width:58.5pt;border-top:none;border-left:solid windowtext 1.5pt;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .75pt;mso-border-alt:solid windowtext .75pt;
  mso-border-left-alt:solid windowtext 1.5pt;padding:0in 5.4pt 0in 5.4pt'>
  <p class=Table-Text style='mso-hyphenate:none'><span style='font-family:"Arial",sans-serif'>1.0<o:p></o:p></span></p>
  </td>
  <td width=102 valign=top style='width:76.5pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .75pt;mso-border-left-alt:solid windowtext .75pt;
  mso-border-alt:solid windowtext .75pt;padding:0in 5.4pt 0in 5.4pt'>
  <p class=Table-Text><span style='font-family:"Arial",sans-serif'>Reuben
  Randell<o:p></o:p></span></p>
  </td>
  <td width=288 valign=top style='width:3.0in;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .75pt;mso-border-left-alt:solid windowtext .75pt;
  mso-border-alt:solid windowtext .75pt;padding:0in 5.4pt 0in 5.4pt'>
  <p class=Table-Text><span style='font-size:11.0pt;font-family:"Arial",sans-serif;
  color:black'>Added JSON, HTML, and API to section 1.3. Updated 2.2 to add
  another design goal, updated sections 3.1 to provide an overview of the
  client-server architecture. Updated 3.2.1 to specify the type of architecture
  used. Added sections 6.1 and 6.2</span><span style='font-family:"Arial",sans-serif'><o:p></o:p></span></p>
  </td>
  <td width=84 valign=top style='width:63.0pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.5pt;
  mso-border-top-alt:solid windowtext .75pt;mso-border-left-alt:solid windowtext .75pt;
  mso-border-alt:solid windowtext .75pt;mso-border-right-alt:solid windowtext 1.5pt;
  padding:0in 5.4pt 0in 5.4pt'>
  <p class=Table-Text align=center style='text-align:center'><span
  style='font-family:"Arial",sans-serif'>4/21<o:p></o:p></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2;mso-yfti-lastrow:yes;page-break-inside:avoid'>
  <td width=78 valign=top style='width:58.5pt;border-top:none;border-left:solid windowtext 1.5pt;
  border-bottom:solid windowtext 1.5pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .75pt;mso-border-top-alt:.75pt;
  mso-border-left-alt:1.5pt;mso-border-bottom-alt:1.5pt;mso-border-right-alt:
  .75pt;mso-border-color-alt:windowtext;mso-border-style-alt:solid;padding:
  0in 5.4pt 0in 5.4pt'>
  <p class=Table-Text style='mso-hyphenate:none'><span style='font-family:"Arial",sans-serif'>1.0<o:p></o:p></span></p>
  </td>
  <td width=102 valign=top style='width:76.5pt;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.5pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .75pt;mso-border-left-alt:solid windowtext .75pt;
  mso-border-alt:solid windowtext .75pt;mso-border-bottom-alt:solid windowtext 1.5pt;
  padding:0in 5.4pt 0in 5.4pt'>
  <p class=Table-Text><span style='font-family:"Arial",sans-serif'>Chad Marshall<o:p></o:p></span></p>
  </td>
  <td width=288 valign=top style='width:3.0in;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.5pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .75pt;mso-border-left-alt:solid windowtext .75pt;
  mso-border-alt:solid windowtext .75pt;mso-border-bottom-alt:solid windowtext 1.5pt;
  padding:0in 5.4pt 0in 5.4pt'>
  <p class=Table-Text><span style='font-size:11.0pt;font-family:"Arial",sans-serif;
  color:black'>&nbsp;Added section 4 and created sequence diagrams</span><span
  style='font-family:"Arial",sans-serif;mso-fareast-language:ZH-CN'><o:p></o:p></span></p>
  </td>
  <td width=84 valign=top style='width:63.0pt;border-top:none;border-left:none;
  border-bottom:solid windowtext 1.5pt;border-right:solid windowtext 1.5pt;
  mso-border-top-alt:solid windowtext .75pt;mso-border-left-alt:solid windowtext .75pt;
  padding:0in 5.4pt 0in 5.4pt'>
  <p class=Table-Text align=center style='text-align:center'><span
  style='font-family:"Arial",sans-serif'>4/21<o:p></o:p></span></p>
  </td>
 </tr>
</table>

<div style='mso-element:para-border-div;border:solid windowtext 1.0pt;
mso-border-top-alt:.5pt;mso-border-left-alt:.75pt;mso-border-bottom-alt:.5pt;
mso-border-right-alt:.75pt;mso-border-color-alt:windowtext;mso-border-style-alt:
solid;padding:1.0pt 1.0pt 1.0pt 1.0pt;background:#4C4C4C;mso-shading:white;
mso-pattern:gray-70 auto'>

<p class=Contents align=left style='text-align:left;tab-stops:107.25pt center 207.0pt;
background:#4C4C4C;mso-shading:white;mso-pattern:gray-70 auto'><a
name="_Hlk107864645"><span style='mso-bidi-font-family:Arial'><span
style='mso-tab-count:1'>                             </span><span
style='mso-tab-count:1'>                  </span>Contents<o:p></o:p></span></a></p>

</div>

<span style='mso-bookmark:_Hlk107864645'></span>

<p class=MsoToc1><!--[if supportFields]><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;font-weight:normal'><span style='mso-element:
field-begin'></span><span style='mso-spacerun:yes'> </span>TOC \o
&quot;2-4&quot; \h \z \t &quot;Heading 1,1&quot; <span style='mso-element:field-separator'></span></span><![endif]--><span
class=MsoHyperlink><span style='font-family:"Arial",sans-serif;font-variant:
normal !important;color:blue;text-transform:uppercase;mso-no-proof:yes'><a
href="#_Toc528776591">1 Introduction<span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776591 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>1</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003500390031000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;font-weight:
normal;mso-no-proof:yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776592">1.1 System Overview<span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>... </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776592 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>1</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003500390032000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776593">1.2 Supporting Materials<span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776593 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>1</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003500390033000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776594">1.3 Definitions and Acronyms<span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776594 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>1</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003500390034000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc1><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776595">2 Design Considerations<span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776595 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>2</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003500390035000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;font-weight:
normal;mso-no-proof:yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776596">2.1 Assumptions<span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776596 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><b><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>Error! Bookmark not defined.</span></b><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776597">2.2 Constraints<span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776597 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>2</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003500390037000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776598"><span style='mso-fareast-language:ZH-CN'>2.3
Goals and Guidelines</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776598 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>2</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003500390038000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc1><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776599">3 Architecture<span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776599 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>3</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003500390039000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;font-weight:
normal;mso-no-proof:yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776600">3.1 Overview<span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>... </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776600 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>3</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003600300030000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776601">3.2 Strategies<span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776601 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>3</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003600300031000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc3><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
color:blue;mso-no-proof:yes'><a href="#_Toc528776602">3.2.1 Technical
Environment<span style='color:windowtext;display:none;mso-hide:screen;
text-decoration:none;text-underline:none'><span style='mso-tab-count:1 dotted'> </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776602 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><b><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>Error! Bookmark not defined.</span></b><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;mso-fareast-language:ZH-CN;font-style:normal;mso-no-proof:yes'><o:p></o:p></span></p>

<p class=MsoToc3><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
color:blue;mso-no-proof:yes'><a href="#_Toc528776603">3.2.2 Maintainability<span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-tab-count:1 dotted'>. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776603 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><b><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>Error! Bookmark not defined.</span></b><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;mso-fareast-language:ZH-CN;font-style:normal;mso-no-proof:yes'><o:p></o:p></span></p>

<p class=MsoToc3><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
color:blue;mso-no-proof:yes'><a href="#_Toc528776604">3.2.3 Performance<span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-tab-count:1 dotted'>. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776604 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>3</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003600300034000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;mso-fareast-language:ZH-CN;font-style:normal;mso-no-proof:yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776605">3.3 Software Specification<span style='color:
windowtext;display:none;mso-hide:screen;text-decoration:none;text-underline:
none'><span style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776605 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>3</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003600300035000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776606">3.4 Hardware Specification<span style='color:
windowtext;display:none;mso-hide:screen;text-decoration:none;text-underline:
none'><span style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776606 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>3</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003600300036000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc1><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776607">4 System Level Design<span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776607 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>5</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003600300037000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;font-weight:
normal;mso-no-proof:yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776608">4.1<span style='mso-fareast-language:ZH-CN'> Hierarchy
Chart Of Components</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776608 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>5</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003600300038000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776609">4.2<span style='mso-fareast-language:ZH-CN'>
Sequence Diagrams And Descriptions</span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776609 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>7</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003600300039000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc1><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776610">5 Object Level Design<span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776610 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>10</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003600310030000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;font-weight:
normal;mso-no-proof:yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776611"><span lang=EN style='mso-ansi-language:EN'>5.1</span><span
style='mso-fareast-language:ZH-CN'> Component C1</span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776611 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><b><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>Error! Bookmark not defined.</span></b><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc3><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
color:blue;mso-no-proof:yes'><a href="#_Toc528776612"><span style='mso-fareast-language:
ZH-CN'>5.1.1 Class D1 Of Component C1</span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776612 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><b><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>Error! Bookmark not defined.</span></b><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;mso-fareast-language:ZH-CN;font-style:normal;mso-no-proof:yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776613"><span lang=EN style='mso-ansi-language:EN'>5.2</span><span
style='mso-fareast-language:ZH-CN'> Component C2</span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776613 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><b><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>Error! Bookmark not defined.</span></b><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc1><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776614">6 User Interface Design<span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776614 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>11</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003600310034000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;font-weight:
normal;mso-no-proof:yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776615"><span style='mso-fareast-language:ZH-CN'>6.1 User
Interface Design Overview</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>... </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776615 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>11</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003600310035000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc2><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776616"><span style='mso-fareast-language:ZH-CN'>6.2 User
Interface Navigation Hierarchy</span><span style='color:windowtext;display:
none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776616 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>11</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003600310036000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;mso-no-proof:
yes'><o:p></o:p></span></p>

<p class=MsoToc1><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776617"><span style='mso-fareast-language:ZH-CN'>7
Requirements Traceability Matrix</span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776617 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;font-weight:normal;
mso-bidi-font-weight:bold;text-decoration:none;text-underline:none'>Error!
Bookmark not defined.</span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;font-weight:
normal;mso-no-proof:yes'><o:p></o:p></span></p>

<p class=MsoToc1><span class=MsoHyperlink><span style='font-family:"Arial",sans-serif;
font-variant:normal !important;color:blue;text-transform:uppercase;mso-no-proof:
yes'><a href="#_Toc528776618"><span style='mso-fareast-language:ZH-CN'>8
Appendices</span><span style='color:windowtext;display:none;mso-hide:screen;
text-decoration:none;text-underline:none'><span style='mso-tab-count:1 dotted'>.. </span></span><!--[if supportFields]><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'><span style='mso-element:field-begin'></span></span><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'> PAGEREF _Toc528776618 \h </span><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-separator'></span></span><![endif]--><span
style='color:windowtext;display:none;mso-hide:screen;text-decoration:none;
text-underline:none'>12</span><span style='color:windowtext;display:none;
mso-hide:screen;text-decoration:none;text-underline:none'><!--[if gte mso 9]><xml>
 <w:data>08D0C9EA79F9BACE118C8200AA004BA90B02000000080000000E0000005F0054006F0063003500320038003700370036003600310038000000</w:data>
</xml><![endif]--></span><!--[if supportFields]><span style='color:windowtext;
display:none;mso-hide:screen;text-decoration:none;text-underline:none'><span
style='mso-element:field-end'></span></span><![endif]--></a></span></span><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
DengXian;font-variant:normal !important;mso-fareast-language:ZH-CN;font-weight:
normal;mso-no-proof:yes'><o:p></o:p></span></p>

<p class=MsoNormal><!--[if supportFields]><b style='mso-bidi-font-weight:normal'><span
style='font-size:12.0pt;mso-bidi-font-size:10.0pt;font-family:"Arial",sans-serif;
text-transform:uppercase'><span style='mso-element:field-end'></span></span></b><![endif]--><span
style='font-family:"Arial",sans-serif'><o:p>&nbsp;</o:p></span></p>

</div>

<span style='font-size:11.0pt;mso-bidi-font-size:10.0pt;font-family:"Arial",sans-serif;
mso-fareast-font-family:SimSun;mso-ansi-language:EN-US;mso-fareast-language:
EN-US;mso-bidi-language:AR-SA'><br clear=all style='page-break-before:always;
mso-break-type:section-break'>
</span>

<div class=WordSection3>

<div style='mso-element:para-border-div;border:solid windowtext 1.0pt;
mso-border-alt:solid windowtext .75pt;padding:1.0pt 1.0pt 1.0pt 1.0pt;
background:#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'>

<h1 style='margin-left:0in;text-indent:0in;mso-list:l3 level1 lfo1;background:
#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'><a name="_Toc517668538"></a><a
name="_Toc528776591"><span style='mso-bookmark:_Toc517668538'><![if !supportLists]><span
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>1 </span></span><![endif]><span style='mso-bidi-font-family:
Arial'>Introduction</span></span></a><span style='mso-bidi-font-family:Arial'><o:p></o:p></span></h1>

</div>

<h2 style='margin-left:0in;text-indent:0in;mso-list:l3 level2 lfo1'><a
name="_Toc517668539"></a><a name="_Toc528776592"><span style='mso-bookmark:
_Toc517668539'><![if !supportLists]><span style='mso-fareast-font-family:Arial;
mso-bidi-font-family:Arial'><span style='mso-list:Ignore'>1.1 </span></span><![endif]><span
style='mso-bidi-font-family:Arial'>System Overview</span></span></a><a
name="_Toc517251108"></a><span style='mso-bookmark:_Toc517251108'><span
style='mso-bidi-font-family:Arial'><o:p></o:p></span></span></h2>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='mso-bookmark:_Toc517251108'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>Maps FXs goal is to provide an
application to not only those who have disabilities, but any user so that they
can navigate to and from buildings on campus. Given that the user has an
internet connection and a laptop, the user can travel anywhere on campus. The
front-end design is created with JavaFX which allows the user to use the app on
the plethora of devices that uses Java Runtime Environment. The back-end design
is written in HTML with JavaScript. The responses from the API calls are
received in JSON format and parsed at the JavaScript level.&nbsp;</span></span><span
style='mso-bookmark:_Toc517251108'><span style='font-family:"Arial",sans-serif;
color:black'><o:p></o:p></span></span></p>

<p class=Comment><span style='mso-bookmark:_Toc517251108'><span
style='font-family:"Arial",sans-serif;color:black;font-style:normal;mso-bidi-font-style:
italic'><o:p>&nbsp;</o:p></span></span></p>

<h2 style='margin-left:0in;text-indent:0in;mso-list:l3 level2 lfo1'><span
style='mso-bookmark:_Toc517251108'><a name="_Toc517668542"></a><a
name="_Toc528776593"><span style='mso-bookmark:_Toc517668542'><![if !supportLists]><span
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>1.2 </span></span><![endif]><span style='mso-bidi-font-family:
Arial'>Supporting Materials</span></span></a></span><span style='mso-bidi-font-family:
Arial'><o:p></o:p></span></h2>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='font-size:11.0pt;font-family:"Arial",sans-serif;color:black'>For
a uniform coding style, we are using Googles Style so that there is uniformity
from Googles HTML skeleton code to Java. Please refer to the documentation
below:</span><span style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='font-family:"Arial",sans-serif;color:black'><a
href="https://checkstyle.sourceforge.io/google_style.html"><span
style='font-size:11.0pt;mso-fareast-font-family:"Times New Roman";mso-fareast-theme-font:
major-fareast;color:black'>https://checkstyle.sourceforge.io/google_style.html</span></a><o:p></o:p></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='font-size:11.0pt;font-family:"Arial",sans-serif;color:black'>Instead
of using Javas standard GUI elements, we need something more powerful that
could handle the integration of web pages. Java FX was the solution to this
requirement. Please refer to the documentation below:</span><span
style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='font-family:"Arial",sans-serif;color:black'><a
href="https://openjfx.io/javadoc/16/"><span style='font-size:11.0pt;mso-fareast-font-family:
"Times New Roman";mso-fareast-theme-font:major-fareast;color:black'>https://openjfx.io/javadoc/16/</span></a><o:p></o:p></span></p>

<p class=Comment><span style='font-family:"Arial",sans-serif;mso-fareast-language:
ZH-CN'><o:p>&nbsp;</o:p></span></p>

<h2 style='margin-left:0in;text-indent:0in;mso-list:l3 level2 lfo1'><a
name="_Toc517251109"></a><a name="_Toc517668543"></a><a name="_Toc528776594"><span
style='mso-bookmark:_Toc517668543'><span style='mso-bookmark:_Toc517251109'><![if !supportLists]><span
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>1.3 </span></span><![endif]><span style='mso-bidi-font-family:
Arial'>Definitions and Acronyms</span></span></span></a><span style='mso-bidi-font-family:
Arial'><o:p></o:p></span></h2>

<p class=Comment><span style='font-family:"Arial",sans-serif;mso-fareast-language:
ZH-CN'>&lt;Define any important terms, acronyms, or abbreviations.&gt;</span><span
style='font-family:"Arial",sans-serif'><o:p></o:p></span></p>

<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0 width="95%"
 style='width:95.16%;margin-left:19.4pt;border-collapse:collapse;border:none;
 mso-border-alt:solid windowtext .5pt;mso-yfti-tbllook:480;mso-padding-alt:
 0in 5.4pt 0in 5.4pt;mso-border-insideh:.5pt solid windowtext;mso-border-insidev:
 .5pt solid windowtext'>
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes'>
  <td width="28%" valign=top style='width:28.1%;border:solid windowtext 1.0pt;
  mso-border-alt:solid windowtext .5pt;background:#E6E6E6;padding:0in 5.4pt 0in 5.4pt'>
  <p class=MsoBodyText><b><span style='font-size:10.0pt;font-family:"Arial",sans-serif;
  color:black;mso-color-alt:windowtext'>Term</span></b><b><span
  style='font-size:10.0pt;font-family:"Arial",sans-serif'><o:p></o:p></span></b></p>
  </td>
  <td width="71%" valign=top style='width:71.9%;border:solid windowtext 1.0pt;
  border-left:none;mso-border-left-alt:solid windowtext .5pt;mso-border-alt:
  solid windowtext .5pt;background:#E6E6E6;padding:0in 5.4pt 0in 5.4pt'>
  <p class=MsoBodyText><b><span style='font-size:10.0pt;font-family:"Arial",sans-serif;
  color:black;mso-color-alt:windowtext'>Description</span></b><b><span
  style='font-size:10.0pt;font-family:"Arial",sans-serif'><o:p></o:p></span></b></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1'>
  <td width="28%" valign=top style='width:28.1%;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0in 5.4pt 0in 5.4pt'>
  <p class=MsoBodyText><b><span style='font-size:10.0pt;font-family:"Arial",sans-serif'>JSON<o:p></o:p></span></b></p>
  </td>
  <td width="71%" valign=top style='width:71.9%;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0in 5.4pt 0in 5.4pt'>
  <p class=MsoBodyText><span style='font-size:10.0pt;font-family:"Arial",sans-serif'><span
  style='mso-spacerun:yes'>  </span><span class=SpellE><span style='color:red'>Javascript</span></span><span
  style='color:red'> Object Notation</span><o:p></o:p></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2'>
  <td width="28%" valign=top style='width:28.1%;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0in 5.4pt 0in 5.4pt'>
  <p class=MsoBodyText><b><span style='font-size:10.0pt;font-family:"Arial",sans-serif'>HTML<o:p></o:p></span></b></p>
  </td>
  <td width="71%" valign=top style='width:71.9%;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0in 5.4pt 0in 5.4pt'>
  <p class=MsoBodyText style='tab-stops:.9in'><span style='font-size:10.0pt;
  font-family:"Arial",sans-serif;color:red'>Hypertext markup language</span><span
  style='font-size:10.0pt;font-family:"Arial",sans-serif'><o:p></o:p></span></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3;mso-yfti-lastrow:yes'>
  <td width="28%" valign=top style='width:28.1%;border:solid windowtext 1.0pt;
  border-top:none;mso-border-top-alt:solid windowtext .5pt;mso-border-alt:solid windowtext .5pt;
  padding:0in 5.4pt 0in 5.4pt'>
  <p class=MsoBodyText><b><span style='font-size:10.0pt;font-family:"Arial",sans-serif'>API<o:p></o:p></span></b></p>
  </td>
  <td width="71%" valign=top style='width:71.9%;border-top:none;border-left:
  none;border-bottom:solid windowtext 1.0pt;border-right:solid windowtext 1.0pt;
  mso-border-top-alt:solid windowtext .5pt;mso-border-left-alt:solid windowtext .5pt;
  mso-border-alt:solid windowtext .5pt;padding:0in 5.4pt 0in 5.4pt'>
  <p class=MsoBodyText style='tab-stops:.9in'><span style='font-size:10.0pt;
  font-family:"Arial",sans-serif;color:red'>Application Programming Interface</span><span
  style='font-size:10.0pt;font-family:"Arial",sans-serif'><o:p></o:p></span></p>
  </td>
 </tr>
</table>

<p class=Comment><span style='font-family:"Arial",sans-serif;color:black;
font-style:normal;mso-bidi-font-style:italic'><o:p>&nbsp;</o:p></span></p>

<div style='mso-element:para-border-div;border:solid windowtext 1.0pt;
mso-border-alt:solid windowtext .75pt;padding:1.0pt 1.0pt 1.0pt 1.0pt;
background:#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'>

<h1 style='margin-left:0in;text-indent:0in;mso-list:l3 level1 lfo1;background:
#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'><a name="_Toc517668545"></a><a
name="_Toc528776595"><span style='mso-bookmark:_Toc517668545'><![if !supportLists]><span
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>2 </span></span><![endif]><span style='mso-bidi-font-family:
Arial'>Design Considerations</span></span></a><span style='mso-bidi-font-family:
Arial'><o:p></o:p></span></h1>

</div>

<h2 style='margin-left:0in;text-indent:0in;mso-list:l3 level2 lfo1'><a
name="_Toc517668547"></a><a name="_Toc528776597"><span style='mso-bookmark:
_Toc517668547'><![if !supportLists]><span style='mso-fareast-font-family:Arial;
mso-bidi-font-family:Arial'><span style='mso-list:Ignore'>2.1 </span></span><![endif]><span
style='mso-bidi-font-family:Arial'>Constraints</span></span></a><span
style='mso-bidi-font-family:Arial'><o:p></o:p></span></h2>

<p class=Comment><span style='mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;
color:black'>One of the largest constraints is transferring data between
front-end to back-end systems. In its current design, most of the work is
handled on the front-end and an <span class=SpellE>acceptible</span> parameter
for Googles Roads API is written to a text file as a JSON object in Java and
read by the HTML file and parsed as a JSON object in JavaScript. After parsing
the object, a path variable is assigned to the object and then passed to the
Roads API call. This is clunky and data reading on back-end isnt as snappy as
writing it on the front-end. This system will more than likely be overhauled
with the future developments made with the Directions API</span><span
style='mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;color:fuchsia'>.
&nbsp;</span><span style='font-family:"Arial",sans-serif;color:windowtext;
font-style:normal;mso-bidi-font-style:italic'><o:p></o:p></span></p>

<h2 style='margin-left:0in;text-indent:0in;mso-list:l3 level2 lfo1'><a
name="_Toc517668550"></a><a name="_Toc528776598"><span style='mso-bookmark:
_Toc517668550'><![if !supportLists]><span style='mso-fareast-font-family:Arial;
mso-bidi-font-family:Arial;mso-fareast-language:ZH-CN'><span style='mso-list:
Ignore'>2.2 </span></span><![endif]><span style='mso-bidi-font-family:Arial;
mso-fareast-language:ZH-CN'>Goals and Guidelines</span></span></a><span
style='mso-bookmark:_Toc517668550'><span style='mso-bidi-font-family:Arial;
mso-fareast-language:ZH-CN'><o:p></o:p></span></span></h2>

<p class=MsoNormal align=left style='margin-top:12.0pt;margin-right:0in;
margin-bottom:12.0pt;margin-left:0in;text-align:left'><span style='mso-bookmark:
_Toc517668550'><span style='mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;
mso-fareast-font-family:"Times New Roman";color:black'>Building a <span
class=GramE>Sand Castle</span> grain by grain.</span></span><span
style='mso-bookmark:_Toc517668550'><span style='font-size:12.0pt;font-family:
"Arial",sans-serif;mso-fareast-font-family:"Times New Roman";color:black'><o:p></o:p></span></span></p>

<p class=MsoNormal align=left style='margin-top:12.0pt;margin-right:0in;
margin-bottom:12.0pt;margin-left:0in;text-align:left'><span style='mso-bookmark:
_Toc517668550'><span style='mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;
mso-fareast-font-family:"Times New Roman";color:black'>A goal in the
development process is to make use of Object Orientation principles such that
the code written is reusable and simple to expand upon by anyone that works on
this project. Such principles include using classes to form objects like a <span
class=GramE>sand castle</span>; constantly expanding and being changed to
withstand the high-tide of changing requirements. By using classes instead of
stuffing methods and operations just in the main allows simpler solutions to
more complex problems. Solutions mentioned include the use of inheritance to
generalize class structure and define cut and dried dependency
relationships.&nbsp;&nbsp;</span></span><span style='mso-bookmark:_Toc517668550'><span
style='font-size:12.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
"Times New Roman";color:black'><o:p></o:p></span></span></p>

<p class=MsoNormal align=left style='margin-top:12.0pt;margin-right:0in;
margin-bottom:12.0pt;margin-left:0in;text-align:left'><span style='mso-bookmark:
_Toc517668550'><span style='mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;
mso-fareast-font-family:"Times New Roman";color:black'>Another goal is to make
a simple, but useful, product that is easy to use, simple to navigate, and does
its job without error.</span></span><span style='mso-bookmark:_Toc517668550'><span
style='font-size:12.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
"Times New Roman";color:black'><o:p></o:p></span></span></p>

<span style='mso-bookmark:_Toc517668550'></span>

<div style='mso-element:para-border-div;border:solid windowtext 1.0pt;
mso-border-alt:solid windowtext .75pt;padding:1.0pt 1.0pt 1.0pt 1.0pt;
background:#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'>

<h1 style='margin-left:0in;text-indent:0in;mso-list:l3 level1 lfo1;background:
#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'><a name="_Toc517668560"></a><a
name="_Toc517668555"></a><a name="_Toc523123114"></a><a name="_Toc528776599"><span
style='mso-bookmark:_Toc523123114'><span style='mso-bookmark:_Toc517668555'><span
style='mso-bookmark:_Toc517668560'><![if !supportLists]><span style='mso-fareast-font-family:
Arial;mso-bidi-font-family:Arial'><span style='mso-list:Ignore'>3 </span></span><![endif]><span
style='mso-bidi-font-family:Arial'>Architecture</span></span></span></span></a><span
style='mso-bookmark:_Toc517668560'><span style='mso-bidi-font-family:Arial'><o:p></o:p></span></span></h1>

</div>

<h2 style='margin-left:0in;text-indent:0in;mso-list:l3 level2 lfo1'><span
style='mso-bookmark:_Toc517668560'><a name="_Toc517668556"></a><a
name="_Toc523123115"></a><a name="_Toc528776600"><span style='mso-bookmark:
_Toc523123115'><span style='mso-bookmark:_Toc517668556'><![if !supportLists]><span
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>3.1 </span></span><![endif]><span style='mso-bidi-font-family:
Arial'>Overview</span></span></span></a></span><span style='mso-bookmark:_Toc517668560'><span
style='mso-bookmark:_Toc517668556'><span style='mso-bidi-font-family:Arial'><o:p></o:p></span></span></span></h2>

<p class=Comment><span style='mso-bookmark:_Toc517668560'><span
style='mso-bookmark:_Toc517668556'><span style='mso-bidi-font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>The map is displayed on the client
side so that the user can see what the map and route look like. After the user
inputs a start and end location, the coordinates of those locations will be
passed on to the server, to calculate the route from the start point to the end
point. The route is calculated using the breadcrumbs (interpolated points
that the API believes will make up our route) received from the server, after
passing two waypoints (start and end locations) to the server. After receiving
the breadcrumbs, the client can then display the route on the map (after some
additional parsing and/or calculations done on the client side). Any directions
will be calculated on the client side using those breadcrumbs received from the
server, since the APIs being used do not include functionality for displaying
directions. After the route is calculated, the directions are then calculated
and displayed on the client side so that the user can see the instructions for
getting to their destination.</span></span></span><span style='mso-bookmark:
_Toc517668560'><span style='mso-bookmark:_Toc517668556'><span style='font-family:
"Arial",sans-serif;color:black;mso-fareast-language:ZH-CN'><o:p></o:p></span></span></span></p>

<span style='mso-bookmark:_Toc517668556'></span>

<h2 style='margin-left:0in;text-indent:0in;mso-list:l3 level2 lfo1'><span
style='mso-bookmark:_Toc517668560'><a name="_Toc517668553"></a><a
name="_Toc523123118"></a><a name="_Toc528776601"><span style='mso-bookmark:
_Toc523123118'><span style='mso-bookmark:_Toc517668553'><![if !supportLists]><span
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>3.2 </span></span><![endif]><span style='mso-bidi-font-family:
Arial'>Strategies</span></span></span></a></span><span style='mso-bookmark:
_Toc517668560'><span style='mso-bidi-font-family:Arial'><o:p></o:p></span></span></h2>

<h3 style='margin-left:0in;text-indent:0in;mso-list:l3 level3 lfo1'><span
style='mso-bookmark:_Toc517668560'><![if !supportLists]><span lang=EN
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>3.2.1 </span></span><![endif]><span lang=EN
style='mso-bidi-font-family:Arial'>Architectural Style<o:p></o:p></span></span></h3>

<p class=Comment><span style='mso-bookmark:_Toc517668560'><span
style='mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;color:black'>Architectural
style is client/server because it uses an API that connects to the internet to
request and receive things like coordinates.</span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-family:"Arial",sans-serif;
color:black;mso-fareast-language:ZH-CN'><o:p></o:p></span></span></p>

<h3 style='margin-left:0in;text-indent:0in;mso-list:l3 level3 lfo1'><span
style='mso-bookmark:_Toc517668560'><a name="_Toc528776604"><![if !supportLists]><span
lang=EN style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>3.2.2 </span></span><![endif]><span lang=EN
style='mso-bidi-font-family:Arial'>Performance</span></a></span><span
style='mso-bookmark:_Toc517668560'><span lang=EN style='mso-bidi-font-family:
Arial'><o:p></o:p></span></span></h3>

<h2 style='margin-left:0in;text-indent:0in;mso-list:l3 level2 lfo1'><span
style='mso-bookmark:_Toc517668560'><a name="_Toc528776605"><![if !supportLists]><span
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>3.3 </span></span><![endif]><span style='mso-bidi-font-family:
Arial'>Software Specification</span></a></span><span style='mso-bookmark:_Toc517668560'><span
style='mso-bidi-font-family:Arial'><o:p></o:p></span></span></h2>

<h2 style='margin-left:0in;text-indent:0in;mso-list:l3 level2 lfo1'><span
style='mso-bookmark:_Toc517668560'><a name="_Toc528776606"><![if !supportLists]><span
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>3.4 </span></span><![endif]><span style='mso-bidi-font-family:
Arial'>Hardware Specification</span></a></span><span style='mso-bookmark:_Toc517668560'><span
style='mso-bidi-font-family:Arial'><o:p></o:p></span></span></h2>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
.5in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>·</span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-size:7.0pt;font-family:
"Arial",sans-serif;color:black'>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp;</span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;font-family:
"Arial",sans-serif;color:black'>Clients</span></span><span style='mso-bookmark:
_Toc517668560'><span style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
1.0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>o</span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-size:7.0pt;font-family:
"Arial",sans-serif;color:black'> &nbsp; </span></span><span style='mso-bookmark:
_Toc517668560'><span style='font-size:11.0pt;font-family:"Arial",sans-serif;
color:black'>Input devices:</span></span><span style='mso-bookmark:_Toc517668560'><span
style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:0in;margin-left:
1.5in;text-indent:-.25in;mso-list:l8 level1 lfo2;tab-stops:list .5in;
vertical-align:baseline'><span style='mso-bookmark:_Toc517668560'><![if !supportLists]><span
style='font-size:10.0pt;mso-bidi-font-size:11.0pt;font-family:Symbol;
mso-fareast-font-family:Symbol;mso-bidi-font-family:Symbol;color:black'><span
style='mso-list:Ignore'>·<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:11.0pt;font-family:"Arial",sans-serif;
color:black'>Keyboard<o:p></o:p></span></span></p>

<p style='margin-top:0in;margin-right:0in;margin-bottom:12.0pt;margin-left:
1.5in;text-indent:-.25in;mso-list:l8 level1 lfo2;tab-stops:list .5in;
vertical-align:baseline'><span style='mso-bookmark:_Toc517668560'><![if !supportLists]><span
style='font-size:10.0pt;mso-bidi-font-size:11.0pt;font-family:Symbol;
mso-fareast-font-family:Symbol;mso-bidi-font-family:Symbol;color:black'><span
style='mso-list:Ignore'>·<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:11.0pt;font-family:"Arial",sans-serif;
color:black'>Mouse<o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
1.0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>o</span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-size:7.0pt;font-family:
"Arial",sans-serif;color:black'> </span></span><span style='mso-bookmark:_Toc517668560'><span
style='font-size:11.0pt;font-family:"Arial",sans-serif;color:black'>Output
devices:</span></span><span style='mso-bookmark:_Toc517668560'><span
style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
1.5in;text-indent:-.25in;mso-list:l1 level1 lfo3;tab-stops:list .5in;
vertical-align:baseline'><span style='mso-bookmark:_Toc517668560'><![if !supportLists]><span
style='font-size:10.0pt;mso-bidi-font-size:11.0pt;font-family:Symbol;
mso-fareast-font-family:Symbol;mso-bidi-font-family:Symbol;color:black'><span
style='mso-list:Ignore'>·<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:11.0pt;font-family:"Arial",sans-serif;
color:black'>Display/monitor<o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
1.0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>o</span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-size:7.0pt;font-family:
"Arial",sans-serif;color:black'> &nbsp; </span></span><span style='mso-bookmark:
_Toc517668560'><span style='font-size:11.0pt;font-family:"Arial",sans-serif;
color:black'>PCs and laptops only</span></span><span style='mso-bookmark:_Toc517668560'><span
style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
.5in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>·</span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-size:7.0pt;font-family:
"Arial",sans-serif;color:black'> &nbsp; &nbsp; &nbsp; &nbsp; </span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;font-family:
"Arial",sans-serif;color:black'>Servers</span></span><span style='mso-bookmark:
_Toc517668560'><span style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
1.0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>o</span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-size:7.0pt;font-family:
"Arial",sans-serif;color:black'> &nbsp; </span></span><span style='mso-bookmark:
_Toc517668560'><span style='font-size:11.0pt;font-family:"Arial",sans-serif;
color:black'>Routes API servers</span></span><span style='mso-bookmark:_Toc517668560'><span
style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
1.0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>o</span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-size:7.0pt;font-family:
"Arial",sans-serif;color:black'> &nbsp; </span></span><span style='mso-bookmark:
_Toc517668560'><span style='font-size:11.0pt;font-family:"Arial",sans-serif;
color:black'>Accessible by many users</span></span><span style='mso-bookmark:
_Toc517668560'><span style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
.5in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>·</span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-size:7.0pt;font-family:
"Arial",sans-serif;color:black'> &nbsp; &nbsp; &nbsp; &nbsp; </span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;font-family:
"Arial",sans-serif;color:black'>Network</span></span><span style='mso-bookmark:
_Toc517668560'><span style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
1.0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>o</span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-size:7.0pt;font-family:
"Arial",sans-serif;color:black'> &nbsp; </span></span><span style='mso-bookmark:
_Toc517668560'><span style='font-size:11.0pt;font-family:"Arial",sans-serif;
color:black'>Connects clients and servers</span></span><span style='mso-bookmark:
_Toc517668560'><span style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></span></p>

<p class=Comment><span style='mso-bookmark:_Toc517668560'><span
style='font-family:"Arial",sans-serif'><o:p>&nbsp;</o:p></span></span></p>

<div style='mso-element:para-border-div;border:solid windowtext 1.0pt;
mso-border-alt:solid windowtext .75pt;padding:1.0pt 1.0pt 1.0pt 1.0pt;
background:#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'>

<h1 style='margin-left:0in;text-indent:0in;mso-list:l3 level1 lfo1;background:
#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'><span
style='mso-bookmark:_Toc517668560'><a name="_Toc528776607"><![if !supportLists]><span
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>4 </span></span><![endif]><span style='mso-bidi-font-family:
Arial'>System Level Design</span></a></span><span style='mso-bookmark:_Toc517668560'><span
style='mso-bidi-font-family:Arial'><o:p></o:p></span></span></h1>

</div>

<p class=Comment><span style='mso-bookmark:_Toc517668560'><span
style='font-family:"Arial",sans-serif;color:black;mso-fareast-language:ZH-CN'><o:p>&nbsp;</o:p></span></span></p>

<p class=Comment><span style='mso-bookmark:_Toc517668560'><span
style='mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;color:black'>The
main idea around the use of Java for the front end is that we need most of the
duties like route creation, logic and arithmetic, and computations to happen on
the Java side of things so that the only amount of data that needs to be sent
to the <span class=GramE>back-end</span> is a single literal string that can be
parsed and orchestrated by the JavaScript to perform a series of operations in
HTML.</span></span><span style='mso-bookmark:_Toc517668560'><span
style='font-family:"Arial",sans-serif;color:black;mso-fareast-language:ZH-CN'><o:p></o:p></span></span></p>

<h2 style='margin-left:0in;text-indent:0in;mso-list:l3 level2 lfo1'><span
style='mso-bookmark:_Toc517668560'><a name="_Toc528776608"><![if !supportLists]><span
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>4.1 </span></span><![endif]><span style='mso-bidi-font-family:
Arial;mso-fareast-language:ZH-CN'>Hierarchy Chart </span></a><span class=GramE><span
style='mso-bookmark:_Toc528776608'><span style='mso-bidi-font-family:Arial;
mso-fareast-language:ZH-CN'>Of</span></span></span></span><span
style='mso-bookmark:_Toc517668560'><span style='mso-bookmark:_Toc528776608'><span
style='mso-bidi-font-family:Arial;mso-fareast-language:ZH-CN'> Components</span></span></span><span
style='mso-bookmark:_Toc517668560'><span style='mso-bidi-font-family:Arial;
mso-fareast-language:ZH-CN'><span style='mso-tab-count:1'>   </span></span></span><span
style='mso-bookmark:_Toc517668560'><span style='mso-bidi-font-family:Arial'> <o:p></o:p></span></span></h2>

<p class=Comment><span style='mso-bookmark:_Toc517668560'><span
style='font-family:"Arial",sans-serif;mso-fareast-language:ZH-CN'><o:p>&nbsp;</o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'><!--[if gte vml 1]><v:shapetype
 id="_x0000_t75" coordsize="21600,21600" o:spt="75" o:preferrelative="t"
 path="m@4@5l@4@11@9@11@9@5xe" filled="f" stroked="f">
 <v:stroke joinstyle="miter"/>
 <v:formulas>
  <v:f eqn="if lineDrawn pixelLineWidth 0"/>
  <v:f eqn="sum @0 1 0"/>
  <v:f eqn="sum 0 0 @1"/>
  <v:f eqn="prod @2 1 2"/>
  <v:f eqn="prod @3 21600 pixelWidth"/>
  <v:f eqn="prod @3 21600 pixelHeight"/>
  <v:f eqn="sum @0 0 1"/>
  <v:f eqn="prod @6 1 2"/>
  <v:f eqn="prod @7 21600 pixelWidth"/>
  <v:f eqn="sum @8 21600 0"/>
  <v:f eqn="prod @7 21600 pixelHeight"/>
  <v:f eqn="sum @10 21600 0"/>
 </v:formulas>
 <v:path o:extrusionok="f" gradientshapeok="t" o:connecttype="rect"/>
 <o:lock v:ext="edit" aspectratio="t"/>
</v:shapetype><v:shape id="_x0000_i1025" type="#_x0000_t75" style='width:344.25pt;
 height:391.5pt'>
 <v:imagedata src="combined_files/image001.jpg" o:href="https://lh4.googleusercontent.com/BkkgIXDgDZu23rTfnVhCsLGoVHMubQltD3yiLePeROW6zbrk9I_-RS9OrG_QJ8on_vShEtzMCJ0iA5PlisAoHhwuOgEbwNqKdW3BaVOypBVZUsZi-gDD_KHmrsnlcMmZ3jRgzw_v"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=459 height=522
src="combined_files/image002.jpg" v:shapes="_x0000_i1025"><![endif]></span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-family:"Arial",sans-serif'><o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>Possibly the highest level of
components as mentioned above would be between how the Front-End communicates
with the <span class=GramE>back-end</span>. As one could see, most of the work
is done through our Routing subsystem and the fruits of its labor is
distributed to the User Interface in the form of a GUI and also given to the <span
class=GramE>Back-End</span> through data.txt to power the map navigation on the
HTML side.&nbsp;</span></span><span style='mso-bookmark:_Toc517668560'><span
style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>The User Interface subsystem is
broken up between the Main class, the entry point of the System as a whole and
a facade class called Display, which acts as a means of printing certain
objects throughout the system.&nbsp;&nbsp;</span></span><span style='mso-bookmark:
_Toc517668560'><span style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>The Routing System is made up of a
Coordinate class, Waypoint (singular) class, Waypoints (plural) class, and a
Route class. Route, Waypoint, and Waypoints make up a composite pattern.
Connecting the two systems in an interface Path which takes similar functions
throughout the system and hides their complexities by creating a single Display
object and calling whichever print we need. For specifics of each pattern used,
please refer to section 5.</span></span><span style='mso-bookmark:_Toc517668560'><span
style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:fuchsia'><!--[if gte vml 1]><v:shape id="_x0000_i1026"
 type="#_x0000_t75" style='width:412.5pt;height:430.5pt'>
 <v:imagedata src="combined_files/image003.jpg" o:href="https://lh5.googleusercontent.com/mDBt2nUB5ZexH0pn0wYKnaLz2OPBENIA5g0P1Xxk6jE0Q5n8Jqgn5NvGbyTtt2aPUfwKpNDzXQxGvjjE_CUBK013f88-i6iSEcRa35mDBspSyv4fKPaBC0ef_iXVn6pMhatu4enn"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=550 height=574
src="combined_files/image004.jpg" v:shapes="_x0000_i1026"><![endif]><o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:fuchsia'><o:p>&nbsp;</o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:fuchsia'><o:p>&nbsp;</o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='mso-bookmark:_Toc517668560'><span style='font-family:"Arial",sans-serif'><o:p>&nbsp;</o:p></span></span></p>

<p class=Comment><span style='mso-bookmark:_Toc517668560'><span
style='font-family:"Arial",sans-serif;color:windowtext;font-style:normal;
mso-bidi-font-style:italic'><o:p>&nbsp;</o:p></span></span></p>

<h2 style='margin-left:0in;text-indent:0in;mso-list:l3 level2 lfo1'><span
style='mso-bookmark:_Toc517668560'><a name="_Toc528776609"><![if !supportLists]><span
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>4.2 </span></span><![endif]><span style='mso-bidi-font-family:
Arial;mso-fareast-language:ZH-CN'>Sequence Diagrams </span></a><span
class=GramE><span style='mso-bookmark:_Toc528776609'><span style='mso-bidi-font-family:
Arial;mso-fareast-language:ZH-CN'>And</span></span></span></span><span
style='mso-bookmark:_Toc517668560'><span style='mso-bookmark:_Toc528776609'><span
style='mso-bidi-font-family:Arial;mso-fareast-language:ZH-CN'> Descriptions</span></span></span><span
style='mso-bookmark:_Toc528776609'></span><span style='mso-bookmark:_Toc517668560'><span
style='mso-bidi-font-family:Arial'><o:p></o:p></span></span></h2>

<p class=Comment><span style='mso-bookmark:_Toc517668560'><span
style='font-family:"Arial",sans-serif;color:black;mso-fareast-language:ZH-CN'><o:p>&nbsp;</o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'><!--[if gte vml 1]><v:shape id="_x0000_i1027"
 type="#_x0000_t75" style='width:454.5pt;height:236.25pt'>
 <v:imagedata src="combined_files/image005.jpg" o:href="https://lh6.googleusercontent.com/Acpj4vj-HRMrIID3s3IlEA_en9eGWp8Xcdx9KkyInuJDAQoLaT4rAvGsWIJvpFdpvBg3ZAZWk23RJwCXBad0LQ-LQ-CYnuHQcSCiqRhWz0IMSqGl2288qW50vQ-E6HlUO2CRtsHP"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=606 height=315
src="combined_files/image006.jpg" v:shapes="_x0000_i1027"><![endif]><span
style='mso-spacerun:yes'> </span><!--[if gte vml 1]><v:shape id="_x0000_i1028"
 type="#_x0000_t75" style='width:509.25pt;height:333.75pt'>
 <v:imagedata src="combined_files/image007.jpg" o:href="https://lh3.googleusercontent.com/Zw-0Y9lYHu-jbpJoF7EszQqABy1xo3rMy5xcWRDPwM93Y9oagqV6AEj6xS11IoWatCjIngSsN-AT8BVwWKrqMgOZNqsdNIhsxkfVh_pPpNQPXadCLwj81QE0CIuDEMpu0OpNXpEo"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=679 height=445
src="combined_files/image008.jpg" v:shapes="_x0000_i1028"><![endif]><!--[if gte vml 1]><v:shape
 id="_x0000_i1029" type="#_x0000_t75" style='width:473.25pt;height:223.5pt'>
 <v:imagedata src="combined_files/image009.jpg" o:href="https://lh6.googleusercontent.com/Ta4EgFzaTrEU2N0Dgi0pzP8k8S8pYRAusU8UUIoo_YYRnw9ufoUh0DlEC-VDIin1hf52Dbfigp0UQgu1QpHAu_0T4UEWG1Xd3cMaUSzZ6lqYXuXBiynIpOWwpqdazi9P4tCa0XOs"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=631 height=298
src="combined_files/image010.jpg" v:shapes="_x0000_i1029"><![endif]></span></span><span
style='mso-bookmark:_Toc517668560'><span style='font-family:"Arial",sans-serif;
color:black'><o:p></o:p></span></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='mso-bookmark:_Toc517668560'><span style='font-size:11.0pt;
font-family:"Arial",sans-serif;color:black'>Although there are no in either
HTML or JavaScript, the events that take place can be mapped sequentially and
are <span class=GramE>thus&nbsp; helpful</span> when navigating through Routing
and User Interface subsystems.</span></span><span style='mso-bookmark:_Toc517668560'><span
style='font-family:"Arial",sans-serif;color:black'><o:p></o:p></span></span></p>

<p class=Comment><span style='mso-bookmark:_Toc517668560'><span
style='font-family:"Arial",sans-serif;mso-fareast-language:ZH-CN'><o:p>&nbsp;</o:p></span></span></p>

<div style='mso-element:para-border-div;border:solid windowtext 1.0pt;
mso-border-alt:solid windowtext .75pt;padding:1.0pt 1.0pt 1.0pt 1.0pt;
background:#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'>

<h1 style='margin-left:0in;text-indent:0in;mso-list:l3 level1 lfo1;background:
#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'><span
style='mso-bookmark:_Toc517668560'><a name="_Toc528776610"><![if !supportLists]><span
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>5 </span></span><![endif]><span style='mso-bidi-font-family:
Arial'>Object Level Design</span></a></span><span style='mso-bidi-font-family:
Arial'><o:p></o:p></span></h1>

</div>

<p class=Comment><span style='font-family:"Arial",sans-serif;mso-fareast-language:
ZH-CN'><o:p>&nbsp;</o:p></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
0in'><span style='font-size:11.0pt;font-family:"Arial",sans-serif;color:black'><!--[if gte vml 1]><v:shape
 id="_x0000_i1030" type="#_x0000_t75" style='width:443.25pt;height:348pt'>
 <v:imagedata src="combined_files/image011.jpg" o:href="https://lh3.googleusercontent.com/pWH2V0mVwQczvYg5KJgu2-F8NfB7466I6FJr-b145LPQHY52l1_ERWv9zqv0gEYUQJzRUvNuANBnIf0RO6AvrjeK9I0NDskdUxpKoJAieV5R0riLVbEalU-dJkMoETZH0iKIdGCV"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=591 height=464
src="combined_files/image012.jpg" v:shapes="_x0000_i1030"><![endif]></span><span
style='font-family:"Arial",sans-serif'><o:p></o:p></span></p>

<p class=Comment><span style='font-family:"Arial",sans-serif;mso-fareast-language:
ZH-CN'><o:p>&nbsp;</o:p></span></p>

<div style='mso-element:para-border-div;border:solid windowtext 1.0pt;
mso-border-alt:solid windowtext .75pt;padding:1.0pt 1.0pt 1.0pt 1.0pt;
background:#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'>

<h1 style='margin-left:0in;text-indent:0in;mso-list:l3 level1 lfo1;background:
#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'><a name="_Toc528776614"><![if !supportLists]><span
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial'><span
style='mso-list:Ignore'>6 </span></span><![endif]><span style='mso-bidi-font-family:
Arial'>User Interface Design</span></a><span style='mso-bidi-font-family:Arial'><o:p></o:p></span></h1>

</div>

<h2 style='margin-left:0in;text-indent:0in;mso-list:l3 level2 lfo1'><a
name="_Toc528776615"><![if !supportLists]><span style='mso-fareast-font-family:
Arial;mso-bidi-font-family:Arial;mso-fareast-language:ZH-CN'><span
style='mso-list:Ignore'>6.1 </span></span><![endif]><span style='mso-bidi-font-family:
Arial;mso-fareast-language:ZH-CN'>User Interface Design Overview</span></a><span
style='mso-bidi-font-family:Arial;mso-fareast-language:ZH-CN'><o:p></o:p></span></h2>

<p class=Comment><span style='font-family:"Arial",sans-serif;mso-fareast-language:
ZH-CN'><o:p>&nbsp;</o:p></span></p>

<p class=Comment><span style='mso-bidi-font-size:11.0pt;font-family:"Arial",sans-serif;
color:black'>The user interface will be composed of primarily two screens. One
screen will simply have a checkbox to determine if the user is a wheelchair
user, alongside a text box for administrator login, and a login button. The
second screen (which the user can get to by pressing the login button on the
first screen) will include a window to display the text boxes for building
lookup, the directions, and the map. The text boxes will allow text entry, with
an autocomplete feature that allows the user to search for a building more
quickly. The autocomplete feature will activate when the user has stopped
typing for more than 0.25 seconds. The text boxes for starting/ending points
will be on the left side of the screen. When a user is finished entering their
starting position and destination, they will have to click the submit button to
send the data to the server for processing. The map will allow the user to view
the campus and the route to their destination. The map will be in the middle of
the screen. The user will be allowed to manipulate the map using their mouse.
On the bottom of the screen will be the directions display, for displaying the
directions to their destination.</span><span style='font-family:"Arial",sans-serif;
color:black;mso-fareast-language:ZH-CN'><o:p></o:p></span></p>

<h2 style='margin-left:0in;text-indent:0in;mso-list:l3 level2 lfo1'><a
name="_Toc528776616"><![if !supportLists]><span style='mso-fareast-font-family:
Arial;mso-bidi-font-family:Arial;mso-fareast-language:ZH-CN'><span
style='mso-list:Ignore'>6.2 </span></span><![endif]><span style='mso-bidi-font-family:
Arial;mso-fareast-language:ZH-CN'>User Interface Navigation Hierarchy</span></a><span
style='mso-bidi-font-family:Arial;mso-fareast-language:ZH-CN'><o:p></o:p></span></h2>

<p class=MsoNormal align=left style='margin-bottom:0in;text-align:left'><span
style='font-size:12.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
"Times New Roman"'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal align=left style='margin-top:12.0pt;margin-right:0in;
margin-bottom:12.0pt;margin-left:0in;text-align:left'><span style='mso-bidi-font-size:
11.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:"Times New Roman";
color:red'><!--[if gte vml 1]><v:shape id="_x0000_i1031" type="#_x0000_t75"
 style='width:370.5pt;height:249.75pt'>
 <v:imagedata src="combined_files/image013.png" o:href="https://lh5.googleusercontent.com/lANJO5jeBRjFwduNqcOvGJofmbfcucYriQcNLtA1PpiRyIopCanTK87MsSlHDImXmcNYE9P1iOAqowkPHEo6Tc8zhNcHI2rS5bdJlHXOKp0vUJHuaBzbexDhWuAe5qRIw5SsrZua"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=494 height=333
src="combined_files/image014.png" v:shapes="_x0000_i1031"><![endif]></span><span
style='font-size:12.0pt;font-family:"Arial",sans-serif;mso-fareast-font-family:
"Times New Roman"'><o:p></o:p></span></p>

<div style='mso-element:para-border-div;border:solid windowtext 1.0pt;
mso-border-alt:solid windowtext .75pt;padding:1.0pt 1.0pt 1.0pt 1.0pt;
background:#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'>

<h1 style='margin-left:0in;text-indent:0in;mso-list:l3 level1 lfo1;background:
#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'><a name="_Toc528776618"><![if !supportLists]><span
style='mso-fareast-font-family:Arial;mso-bidi-font-family:Arial;mso-fareast-language:
ZH-CN'><span style='mso-list:Ignore'>7 </span></span><![endif]><span
style='mso-bidi-font-family:Arial;mso-fareast-language:ZH-CN'>Appendices</span></a><span
style='mso-bidi-font-family:Arial;mso-fareast-language:ZH-CN'><o:p></o:p></span></h1>

</div>

<p class=Comment><span style='font-family:"Arial",sans-serif;color:windowtext;
font-style:normal;mso-bidi-font-style:italic'><o:p>&nbsp;</o:p></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:12.0pt;margin-left:
.5in;text-indent:-.25in;mso-list:l0 level1 lfo4;tab-stops:list .5in;vertical-align:
baseline'><![if !supportLists]><span style='font-size:10.0pt;mso-bidi-font-size:
11.0pt;font-family:Symbol;mso-fareast-font-family:Symbol;mso-bidi-font-family:
Symbol;color:black'><span style='mso-list:Ignore'>·<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:11.0pt;font-family:"Arial",sans-serif;
color:black'>Implement Directions API to solve routing issues.&nbsp;<o:p></o:p></span></p>

<p style='margin-top:12.0pt;margin-right:0in;margin-bottom:0in;margin-left:
.5in;text-indent:-.25in;mso-list:l2 level1 lfo5;tab-stops:list .5in;vertical-align:
baseline'><![if !supportLists]><span style='font-size:10.0pt;mso-bidi-font-size:
11.0pt;font-family:Symbol;mso-fareast-font-family:Symbol;mso-bidi-font-family:
Symbol;color:black'><span style='mso-list:Ignore'>·<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:11.0pt;font-family:"Arial",sans-serif;
color:black'>In section 1.1, should <span class=SpellE>javascript</span> and
HTML be called back-end design or front end, since I believe they are also for
the client-side?<o:p></o:p></span></p>

<p class=Comment><span style='font-family:"Arial",sans-serif;color:windowtext;
font-style:normal;mso-bidi-font-style:italic'><o:p>&nbsp;</o:p></span></p>

<span style='font-size:11.0pt;mso-bidi-font-size:10.0pt;line-height:107%;
font-family:"Times New Roman",serif;mso-fareast-font-family:SimSun;mso-ansi-language:
EN-US;mso-fareast-language:EN-US;mso-bidi-language:AR-SA'><br clear=all
style='mso-special-character:line-break;page-break-before:always'>
</span>

<p class=MsoNormal align=left style='margin-bottom:8.0pt;text-align:left;
line-height:107%'><o:p>&nbsp;</o:p></p>

<p class=MsoNormal><o:p>&nbsp;</o:p></p>

<p class=MsoNormal><o:p>&nbsp;</o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b><span style='font-size:20.0pt;font-family:"Arial",sans-serif'>Software
Requirements Specification<o:p></o:p></span></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><a name="_Hlk107864370"><span style='font-family:"Arial",sans-serif'>Wheelchair
Navigation Version 1.0 approved<o:p></o:p></span></a></p>

<span style='mso-bookmark:_Hlk107864370'></span>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><a name="_Hlk107864377"><span style='font-family:"Arial",sans-serif'>Prepared
by <o:p></o:p></span></a></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-bookmark:_Hlk107864377'><span
style='font-family:"Arial",sans-serif'>Reuben Randell<o:p></o:p></span></span></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-bookmark:_Hlk107864377'><span
style='font-family:"Arial",sans-serif'>Blake Brooks<o:p></o:p></span></span></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-bookmark:_Hlk107864377'><span
style='font-family:"Arial",sans-serif'>Chad Marshall<o:p></o:p></span></span></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-bookmark:_Hlk107864377'><span
style='font-family:"Arial",sans-serif'>University of Central Oklahoma<o:p></o:p></span></span></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-bookmark:_Hlk107864377'><span
style='font-family:"Arial",sans-serif'>Software Engineering 1<o:p></o:p></span></span></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-bookmark:_Hlk107864377'><span
style='font-family:"Arial",sans-serif'>Dr. Fu<o:p></o:p></span></span></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-bookmark:_Hlk107864377'><span
style='font-family:"Arial",sans-serif'>March 20th, 2021</span></span><span
style='mso-bookmark:_Hlk107864377'><b style='mso-bidi-font-weight:normal'><span
style='font-size:16.0pt;font-family:"Arial",sans-serif'><o:p></o:p></span></b></span></p>

<span style='mso-bookmark:_Hlk107864377'></span>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><br style='mso-special-character:line-break'>
<![if !supportLineBreakNewLine]><br style='mso-special-character:line-break'>
<![endif]><o:p></o:p></p>

<br clear=all style='mso-special-character:line-break;page-break-before:always'>

<p class=MsoNormal><o:p>&nbsp;</o:p></p>

<div style='mso-element:para-border-div;border:solid windowtext 1.0pt;
mso-border-top-alt:.5pt;mso-border-left-alt:.75pt;mso-border-bottom-alt:.5pt;
mso-border-right-alt:.75pt;mso-border-color-alt:windowtext;mso-border-style-alt:
solid;padding:1.0pt 1.0pt 1.0pt 1.0pt;background:#4C4C4C;mso-shading:white;
mso-pattern:gray-70 auto'>

<p class=Contents align=left style='text-align:left;tab-stops:107.25pt center 207.0pt;
background:#4C4C4C;mso-shading:white;mso-pattern:gray-70 auto'><span
style='color:black;mso-color-alt:windowtext'><span style='mso-tab-count:1'>                             </span><span
style='mso-tab-count:1'>                  </span></span><span style='color:
white;mso-themecolor:background1'>Contents<o:p></o:p></span></p>

</div>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Revision
History...........................................................................................................
ii<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b>1.<span style='mso-spacerun:yes'>   </span>Introduction............................................................................................................
1<o:p></o:p></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>1.1<span style='font-size:12.0pt'><span
style='mso-spacerun:yes'>   </span><span style='mso-tab-count:1'>     </span></span>Purpose
and
Scope............................................................................................
1<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>1.2<span style='font-size:12.0pt'><span
style='mso-spacerun:yes'>   </span><span style='mso-tab-count:1'>     </span></span>Definitions,
Acronyms and
Abbreviations.......................................................... 1<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>1.3<span style='font-size:12.0pt'><span
style='mso-spacerun:yes'>   </span><span style='mso-tab-count:1'>     </span></span>References.......................................................................................................
1<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>1.4<span style='font-size:12.0pt'><span
style='mso-spacerun:yes'>   </span><span style='mso-tab-count:1'>     </span></span>Overview.........................................................................................................
1<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b>2.<span style='mso-spacerun:yes'>   </span>Overall
Description................................................................................................
1<o:p></o:p></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>2.1<span style='font-size:12.0pt'><span
style='mso-spacerun:yes'>   </span><span style='mso-tab-count:1'>     </span></span>Product
Functions.............................................................................................
1<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>2.2<span style='font-size:12.0pt'><span
style='mso-spacerun:yes'>   </span><span style='mso-tab-count:1'>     </span></span>User
Classes and
Characteristics........................................................................
1<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>2.3<span style='font-size:12.0pt'><span
style='mso-spacerun:yes'>   </span><span style='mso-tab-count:1'>     </span></span>Constraints.......................................................................................................
2<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>2.4<span style='font-size:12.0pt'><span
style='mso-spacerun:yes'>   </span><span style='mso-tab-count:1'>     </span></span>Assumptions
and
Dependencies.........................................................................
2<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b>3.<span style='mso-spacerun:yes'>   </span>Specific requirements............................................................................................
2<o:p></o:p></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>3.1<span style='font-size:12.0pt'><span
style='mso-spacerun:yes'>   </span><span style='mso-tab-count:1'>     </span></span>External
Interface
Requirements........................................................................
2<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>3.1.1<span style='font-size:12.0pt'> <span
style='mso-tab-count:1'>   </span></span>User Interfaces.............................................................................................
2<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>3.1.2<span style='font-size:12.0pt'> <span
style='mso-tab-count:1'>   </span></span>Hardware
Interfaces......................................................................................
2<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>3.1.3<span style='font-size:12.0pt'> <span
style='mso-tab-count:1'>   </span></span>Software Interfaces.......................................................................................
2<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>3.1.4<span style='font-size:12.0pt'> <span
style='mso-tab-count:1'>   </span></span>Communications
Interfaces...........................................................................
3<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>3.2<span style='font-size:12.0pt'><span
style='mso-spacerun:yes'>   </span><span style='mso-tab-count:1'>     </span></span>Functional
requirements....................................................................................
3<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>3.2.1<span style='font-size:12.0pt'> <span
style='mso-tab-count:1'>   </span></span>Functional requirement
1...............................................................................
3<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>3.2.2<span style='font-size:12.0pt'> <span
style='mso-tab-count:1'>   </span></span>Functional requirement
2...............................................................................
3<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>3.3<span style='font-size:12.0pt'><span
style='mso-spacerun:yes'>   </span><span style='mso-tab-count:1'>     </span></span>Performance
Requirements................................................................................
3<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b>3.4</b><b><span style='font-size:12.0pt'><span
style='mso-spacerun:yes'>   </span><span style='mso-tab-count:1'>     </span></span>Software
System
Attributes...............................................................................
4<o:p></o:p></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>3.4.1<span style='font-size:12.0pt'> <span
style='mso-tab-count:1'>   </span></span>Availability..................................................................................................
4<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>3.4.2<span style='font-size:12.0pt'> <span
style='mso-tab-count:1'>   </span></span>Security........................................................................................................
4<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>3.5<span style='font-size:12.0pt'><span
style='mso-spacerun:yes'>   </span><span style='mso-tab-count:1'>     </span></span>Design
constraints.............................................................................................
4<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>3.5.1<span style='font-size:12.0pt'> <span
style='mso-tab-count:1'>   </span></span>Standards
Compliance...................................................................................
4<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>3.5.2<span style='font-size:12.0pt'> <span
style='mso-tab-count:1'>   </span></span>Hardware Limitations....................................................................................
4<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Appendix A: Issues
List...............................................................................................
4<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b style='mso-bidi-font-weight:normal'><span
style='mso-fareast-font-family:"Times New Roman"'><span
style='mso-spacerun:yes'> </span><o:p></o:p></span></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b style='mso-bidi-font-weight:normal'><span
style='mso-fareast-font-family:"Times New Roman"'><span
style='mso-spacerun:yes'> </span><o:p></o:p></span></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<b style='mso-bidi-font-weight:normal'><span style='font-size:19.0pt;
font-family:"Times New Roman",serif;mso-fareast-font-family:SimSun;mso-ansi-language:
EN-US;mso-fareast-language:EN-US;mso-bidi-language:AR-SA'><br clear=all
style='mso-special-character:line-break;page-break-before:always'>
</span></b>

<p class=MsoNormal><b style='mso-bidi-font-weight:normal'><span
style='font-size:19.0pt'><o:p>&nbsp;</o:p></span></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b style='mso-bidi-font-weight:normal'><span
style='font-size:19.0pt'>Revision History<o:p></o:p></span></b></p>

<table class=MsoNormalTable border=1 cellspacing=0 cellpadding=0 width=606
 style='width:454.5pt;border-collapse:collapse;border:none;mso-border-alt:solid black .75pt;
 mso-yfti-tbllook:1536;mso-padding-alt:0in 5.4pt 0in 5.4pt;mso-border-insideh:
 .75pt solid black;mso-border-insidev:.75pt solid black'>
 <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:31.0pt'>
  <td width=135 valign=top style='width:101.25pt;border-top:1.5pt;border-left:
  1.5pt;border-bottom:4.5pt;border-right:1.0pt;border-color:black;border-style:
  solid;padding:5.0pt 5.0pt 5.0pt 5.0pt;height:31.0pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'><b style='mso-bidi-font-weight:normal'>Name<o:p></o:p></b></p>
  </td>
  <td width=88 valign=top style='width:66.0pt;border-top:solid black 1.5pt;
  border-left:none;border-bottom:solid black 4.5pt;border-right:solid black 1.0pt;
  mso-border-left-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:31.0pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'><b style='mso-bidi-font-weight:normal'>Date<o:p></o:p></b></p>
  </td>
  <td width=275 valign=top style='width:206.25pt;border-top:solid black 1.5pt;
  border-left:none;border-bottom:solid black 4.5pt;border-right:solid black 1.0pt;
  mso-border-left-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:31.0pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'><b style='mso-bidi-font-weight:normal'>Reason For
  Changes<o:p></o:p></b></p>
  </td>
  <td width=108 valign=top style='width:81.0pt;border-top:solid black 1.5pt;
  border-left:none;border-bottom:solid black 4.5pt;border-right:solid black 1.5pt;
  mso-border-left-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:31.0pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'><b style='mso-bidi-font-weight:normal'>Version<o:p></o:p></b></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:1;height:30.25pt'>
  <td width=135 valign=top style='width:101.25pt;border-top:none;border-left:
  solid black 1.5pt;border-bottom:solid black 1.0pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:30.25pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'><span style='mso-spacerun:yes'> </span>Reuben Randell<o:p></o:p></p>
  </td>
  <td width=88 valign=top style='width:66.0pt;border-top:none;border-left:none;
  border-bottom:solid black 1.0pt;border-right:solid black 1.0pt;mso-border-top-alt:
  solid black .75pt;mso-border-left-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:30.25pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'><span style='mso-spacerun:yes'> </span>3/20/2021<o:p></o:p></p>
  </td>
  <td width=275 valign=top style='width:206.25pt;border-top:none;border-left:
  none;border-bottom:solid black 1.0pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:30.25pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Filled out sections 3.1.1, <span class=GramE>3.1.2,and</span><span
  style='mso-spacerun:yes'>  </span>3.1.3 with initial information. Also added
  terms GUI and Java AWT to section 1.2, and added some unresolved issues
  to Appendix A.<o:p></o:p></p>
  </td>
  <td width=108 valign=top style='width:81.0pt;border-top:none;border-left:
  none;border-bottom:solid black 1.0pt;border-right:solid black 1.5pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:30.25pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'><span style='mso-spacerun:yes'> </span>1.0<o:p></o:p></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:2;height:28.75pt'>
  <td width=135 valign=top style='width:101.25pt;border-top:none;border-left:
  solid black 1.5pt;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'><span style='mso-spacerun:yes'> </span>Chad Marshall<o:p></o:p></p>
  </td>
  <td width=88 valign=top style='width:66.0pt;border-top:none;border-left:none;
  border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;mso-border-top-alt:
  solid black .75pt;mso-border-left-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'><span style='mso-spacerun:yes'> </span>3/21/2021<o:p></o:p></p>
  </td>
  <td width=275 valign=top style='width:206.25pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'><span style='mso-spacerun:yes'> </span>Added sections <span
  class=GramE>for<span style='mso-spacerun:yes'>  </span>3.1.4</span> and 3.2.
  Within 3.2, there are subsections that show what functions that app will
  require. Two functions have been added<o:p></o:p></p>
  </td>
  <td width=108 valign=top style='width:81.0pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.5pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'><span style='mso-spacerun:yes'> </span>1.0<o:p></o:p></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:3;height:28.75pt'>
  <td width=135 valign=top style='width:101.25pt;border-top:none;border-left:
  solid black 1.5pt;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Reuben Randell<o:p></o:p></p>
  </td>
  <td width=88 valign=top style='width:66.0pt;border-top:none;border-left:none;
  border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;mso-border-top-alt:
  solid black .75pt;mso-border-left-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>3/23/2021<o:p></o:p></p>
  </td>
  <td width=275 valign=top style='width:206.25pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Added section 1.1. Created basic outline (without
  details) for section 1.4. Updated 3.3 to include that I do not recognize
  anything needed under it. Updated 3.5.2 to indicate that networking hardware
  is required.<o:p></o:p></p>
  </td>
  <td width=108 valign=top style='width:81.0pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.5pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>1.0<o:p></o:p></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:4;height:28.75pt'>
  <td width=135 valign=top style='width:101.25pt;border-top:none;border-left:
  solid black 1.5pt;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Chad Marshall<o:p></o:p></p>
  </td>
  <td width=88 valign=top style='width:66.0pt;border-top:none;border-left:none;
  border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;mso-border-top-alt:
  solid black .75pt;mso-border-left-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>3/23/2021<o:p></o:p></p>
  </td>
  <td width=275 valign=top style='width:206.25pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Added two functions that allow the user to add/delete
  buildings of their selection. Added a function that will navigate the user to
  the nearest Emergency Station based on their relative location. <o:p></o:p></p>
  </td>
  <td width=108 valign=top style='width:81.0pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.5pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>1.0<o:p></o:p></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:5;height:28.75pt'>
  <td width=135 valign=top style='width:101.25pt;border-top:none;border-left:
  solid black 1.5pt;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Blake Brooks<o:p></o:p></p>
  </td>
  <td width=88 valign=top style='width:66.0pt;border-top:none;border-left:none;
  border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;mso-border-top-alt:
  solid black .75pt;mso-border-left-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>3/23/2021<o:p></o:p></p>
  </td>
  <td width=275 valign=top style='width:206.25pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Update use case diagram to include Actors user and
  reporting officer. The Reporting Officer has a generalization relationship
  with the <span class=GramE>on campus</span> emergency buttons. User has
  generalization with the mapping. There is a dependency between user and
  disability mapping, as it is unknown if the student is disabled or not.
  Included dependency relationship to parking lot class object because user might
  or might not be driving to campus from a short distance to a parking
  lot.<span style='mso-spacerun:yes'>  </span><o:p></o:p></p>
  </td>
  <td width=108 valign=top style='width:81.0pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.5pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>1.0<o:p></o:p></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:6;height:28.75pt'>
  <td width=135 valign=top style='width:101.25pt;border-top:none;border-left:
  solid black 1.5pt;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Chad Marshall<o:p></o:p></p>
  </td>
  <td width=88 valign=top style='width:66.0pt;border-top:none;border-left:none;
  border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;mso-border-top-alt:
  solid black .75pt;mso-border-left-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>3/24/2021<o:p></o:p></p>
  </td>
  <td width=275 valign=top style='width:206.25pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Added topics talked about from meeting with Dr. Fu in
  Appendix Issue List. Added dummy names for functions until Use Case diagram
  is finalized. Added sections on Performance Requirements, Availability,
  Safety, and hardware Limitations.<o:p></o:p></p>
  </td>
  <td width=108 valign=top style='width:81.0pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.5pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>1.0<o:p></o:p></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:7;height:28.75pt'>
  <td width=135 valign=top style='width:101.25pt;border-top:none;border-left:
  solid black 1.5pt;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Chad Marshal<o:p></o:p></p>
  </td>
  <td width=88 valign=top style='width:66.0pt;border-top:none;border-left:none;
  border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;mso-border-top-alt:
  solid black .75pt;mso-border-left-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>3/25/2021<o:p></o:p></p>
  </td>
  <td width=275 valign=top style='width:206.25pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Added Validate Password and Pop Route functions to
  Functional requirements<o:p></o:p></p>
  </td>
  <td width=108 valign=top style='width:81.0pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.5pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>1.0<o:p></o:p></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:8;height:28.75pt'>
  <td width=135 valign=top style='width:101.25pt;border-top:none;border-left:
  solid black 1.5pt;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Blake Brooks<o:p></o:p></p>
  </td>
  <td width=88 valign=top style='width:66.0pt;border-top:none;border-left:none;
  border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;mso-border-top-alt:
  solid black .75pt;mso-border-left-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>3/25/2021<o:p></o:p></p>
  </td>
  <td width=275 valign=top style='width:206.25pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Met with Professor for over the <span class=SpellE>uml</span>
  I had. Added back verify password function for admin and gave extend
  relationship for add and delete buildings. Changed building search to search
  building for verb phrase in the function name. Also added generalization
  between admin &amp; handicapped to user, as well deleted reporting officer
  actor. <o:p></o:p></p>
  </td>
  <td width=108 valign=top style='width:81.0pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.5pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>1.0<o:p></o:p></p>
  </td>
 </tr>
 <tr style='mso-yfti-irow:9;mso-yfti-lastrow:yes;height:28.75pt'>
  <td width=135 valign=top style='width:101.25pt;border-top:none;border-left:
  solid black 1.5pt;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Reuben Randell<o:p></o:p></p>
  </td>
  <td width=88 valign=top style='width:66.0pt;border-top:none;border-left:none;
  border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;mso-border-top-alt:
  solid black .75pt;mso-border-left-alt:solid black .75pt;padding:5.0pt 5.0pt 5.0pt 5.0pt;
  height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>3/26/2021<o:p></o:p></p>
  </td>
  <td width=275 valign=top style='width:206.25pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.0pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>Added images for the User Interface in section 3.1<o:p></o:p></p>
  </td>
  <td width=108 valign=top style='width:81.0pt;border-top:none;border-left:
  none;border-bottom:solid black 1.5pt;border-right:solid black 1.5pt;
  mso-border-top-alt:solid black .75pt;mso-border-left-alt:solid black .75pt;
  padding:5.0pt 5.0pt 5.0pt 5.0pt;height:28.75pt'>
  <p class=MsoNormal style='margin-top:2.0pt;margin-right:0in;margin-bottom:
  2.0pt;margin-left:0in'>1.0<o:p></o:p></p>
  </td>
 </tr>
</table>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b style='mso-bidi-font-weight:normal'><span
style='mso-spacerun:yes'> </span><o:p></o:p></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-spacerun:yes'> </span><o:p></o:p></p>

<p class=MsoNormal><span style='font-size:12.0pt'><o:p>&nbsp;</o:p></span></p>

<b style='mso-bidi-font-weight:normal'><span style='font-size:23.0pt;
font-family:"Times New Roman",serif;mso-fareast-font-family:SimSun;mso-ansi-language:
EN-US;mso-fareast-language:EN-US;mso-bidi-language:AR-SA'><br clear=all
style='mso-special-character:line-break;page-break-before:always'>
</span></b>

<p class=MsoNormal><a name="_tnyjx0escbu3"></a><b style='mso-bidi-font-weight:
normal'><span style='font-size:23.0pt'><o:p>&nbsp;</o:p></span></b></p>

<div style='mso-element:para-border-div;border:solid windowtext 1.0pt;
mso-border-alt:solid windowtext .75pt;padding:1.0pt 1.0pt 1.0pt 1.0pt;
background:#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'>

<h1 style='margin-top:24.0pt;text-align:justify;mso-list:none;background:#4C4C4C;
mso-shading:windowtext;mso-pattern:gray-70 auto'><span style='font-size:23.0pt;
color:black;mso-color-alt:windowtext'>1.<span style='mso-tab-count:1'>  </span></span><span
style='font-size:23.0pt;color:white;mso-themecolor:background1'>Introduction</span><span
style='font-size:23.0pt;color:windowtext;mso-color-alt:windowtext;font-weight:
normal'><o:p></o:p></span></h1>

</div>

<h2 style='margin-bottom:4.0pt;page-break-after:auto;mso-list:none'><a
name="_61cx8kx4ig3z"></a><span style='font-size:17.0pt'>1.1<span
style='mso-tab-count:1'>   </span>Purpose and Scope</span><span
style='font-size:17.0pt;font-weight:normal'><o:p></o:p></span></h2>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>&lt;Identify the product whose software requirements
are specified in this document, including the revision or release number.
Describe the scope of the product that is covered by this SRS (what does it do
and what does it not do), particularly if this SRS describes only part of the
system or a single subsystem.&gt;<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The software requirements in this document are for the
Campus App. This SRS document covers the entire software, which is an
application that gives users directions to buildings on <span class=GramE>campus,
and</span> provides wheelchair-accessible routes.<o:p></o:p></p>

<h2 style='margin-bottom:4.0pt;page-break-after:auto;mso-list:none'><a
name="_dwm2d9nsecbi"></a><span style='font-size:17.0pt'>1.2<span
style='mso-tab-count:1'>   </span>Definitions, Acronyms and Abbreviations</span><span
style='font-size:17.0pt;font-weight:normal'><o:p></o:p></span></h2>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>&lt;Describe definitions of all the terms, acronyms and
abbreviations used in the document. Special attention should be paid to the
clarification of terms and concepts from the domain of application.&gt;<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='font-family:"Arial Unicode MS";mso-fareast-font-family:
"Arial Unicode MS";mso-bidi-font-family:"Arial Unicode MS"'>Campus App &#8594;
The software application described in this document.</span><o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='font-family:"Arial Unicode MS";mso-fareast-font-family:
"Arial Unicode MS";mso-bidi-font-family:"Arial Unicode MS"'>Google Maps &#8594;
API that enables the Campus App to access Google Maps services to upload user
queries, download location data, and possibly other related procedures.</span><o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='font-family:"Arial Unicode MS";mso-fareast-font-family:
"Arial Unicode MS";mso-bidi-font-family:"Arial Unicode MS"'>GUI &#8594;
Graphical User Interface</span><o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='font-family:"Arial Unicode MS";mso-fareast-font-family:
"Arial Unicode MS";mso-bidi-font-family:"Arial Unicode MS"'>Java AWT &#8594;
Java Abstract Window Toolkit</span><o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='font-family:"Arial Unicode MS";mso-fareast-font-family:
"Arial Unicode MS";mso-bidi-font-family:"Arial Unicode MS"'>API &#8594;
Application Programming Interface</span><o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='font-family:"Arial Unicode MS";mso-fareast-font-family:
"Arial Unicode MS";mso-bidi-font-family:"Arial Unicode MS"'>JRE &#8594; Java
Runtime Environment</span><o:p></o:p></p>

<h2 style='margin-bottom:4.0pt;page-break-after:auto;mso-list:none'><a
name="_6sbfad1d5o7u"></a><span style='font-size:17.0pt'>1.3<span
style='mso-tab-count:1'>   </span>References</span><span style='font-size:17.0pt;
font-weight:normal'><o:p></o:p></span></h2>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>&lt;List any other documents or Web addresses to which
this SRS refers. These may include user interface style guides, contracts,
standards, system requirements specifications, use case documents, or a vision
and scope document. Provide enough information so that the reader could access
a copy of each reference, including title, author, version number, date, and
source or location.&gt;<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-spacerun:yes'> </span><o:p></o:p></p>

<h2 style='margin-bottom:4.0pt;page-break-after:auto;mso-list:none'><a
name="_dc3mjygxu8qx"></a><span style='font-size:17.0pt'>1.4<span
style='mso-tab-count:1'>   </span>Overview</span><span style='font-size:17.0pt;
font-weight:normal'><o:p></o:p></span></h2>

<div style='mso-element:para-border-div;border:solid windowtext 1.0pt;
mso-border-alt:solid windowtext .75pt;padding:1.0pt 1.0pt 1.0pt 1.0pt;
background:#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'>

<h1 style='margin-top:24.0pt;text-align:justify;mso-list:none;background:#4C4C4C;
mso-shading:windowtext;mso-pattern:gray-70 auto'><span style='font-size:23.0pt;
color:white;mso-themecolor:background1'>2.<span style='mso-tab-count:1'>  </span>Overall
Description</span><span style='font-size:23.0pt;color:white;mso-themecolor:
background1;font-weight:normal'><o:p></o:p></span></h1>

</div>

<h2 style='margin-bottom:4.0pt;page-break-after:auto;mso-list:none'><a
name="_8exrh7xgjia9"></a><span style='font-size:17.0pt'>2.1<span
style='mso-tab-count:1'>   </span>Product Functions</span><span
style='font-size:17.0pt;font-weight:normal'><o:p></o:p></span></h2>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>There will be a mapping function that the user can use
to locate a building on campus. There will also be a search bar that the user
can type in to look for a specific building on campus to get directions to.
There will also be a checkbox for the user to choose if they have a disability
or not. If they have checked disability the system will take them to a
disability access door for the <span class=GramE>building</span> they searched
for. <o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-no-proof:yes'><!--[if gte vml 1]><v:shape
 id="image2.png" o:spid="_x0000_i1046" type="#_x0000_t75" alt="Diagram&#10;&#10;Description automatically generated"
 style='width:369.75pt;height:426.75pt;visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="combined_files/image015.png" o:title="Diagram&#10;&#10;Description automatically generated"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=493 height=569
src="combined_files/image016.png"
alt="Diagram&#10;&#10;Description automatically generated" v:shapes="image2.png"><![endif]></span><o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<h2 style='margin-bottom:4.0pt;page-break-after:auto;mso-list:none'><a
name="_j0hbnl9vghot"></a><span style='font-size:17.0pt'>2.2<span
style='mso-tab-count:1'>   </span>User Classes and Characteristics</span><span
style='font-size:17.0pt;font-weight:normal'><o:p></o:p></span></h2>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The user classes that will interact with the system
will be students and students with a disability. The mapping software will take
a user to either a normal entrance or a disability access door with no stairs
depending on if the user has a physical disability or not. <o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-spacerun:yes'> </span><o:p></o:p></p>

<h2 style='margin-bottom:4.0pt;page-break-after:auto;mso-list:none'><a
name="_3syvpe1bp4la"></a><span style='font-size:17.0pt'>2.3<span
style='mso-tab-count:1'>   </span>Assumptions and Dependencies</span><span
style='font-size:17.0pt;font-weight:normal'><o:p></o:p></span></h2>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>An assumption is that the user just wants to use the
mapping system when they have reached the campus. If a user wanted to include
driving as part of the mapping <span class=GramE>process</span> then it could
cause issues like knowing how far a program can work with in terms of distance
and does it include the fastest drive path to the campus, and can such a
feature update its route if a car accident were to take place and cause heavy
traffic. <span class=SpellE>SInce</span> we are not entirely sure if a student
would want to launch the map system for a means to get to campus, we have a
dependency between the mapping and to the class object parking lot in both the
normal student and the student with the disability. There is an extended
relationship between the add building and the delete building functions the
system has.<span style='mso-spacerun:yes'>  </span><o:p></o:p></p>

<b style='mso-bidi-font-weight:normal'><span style='font-size:23.0pt;
font-family:"Times New Roman",serif;mso-fareast-font-family:SimSun;mso-ansi-language:
EN-US;mso-fareast-language:EN-US;mso-bidi-language:AR-SA'><br clear=all
style='mso-special-character:line-break;page-break-before:always'>
</span></b>

<p class=MsoNormal><a name="_jz1zksy78z0l"></a><b style='mso-bidi-font-weight:
normal'><span style='font-size:23.0pt'><o:p>&nbsp;</o:p></span></b></p>

<div style='mso-element:para-border-div;border:solid windowtext 1.0pt;
mso-border-alt:solid windowtext .75pt;padding:1.0pt 1.0pt 1.0pt 1.0pt;
background:#4C4C4C;mso-shading:windowtext;mso-pattern:gray-70 auto'>

<h1 style='margin-top:24.0pt;mso-list:none;background:#4C4C4C;mso-shading:windowtext;
mso-pattern:gray-70 auto'><span style='font-size:23.0pt;color:black;mso-color-alt:
windowtext'>3.<span style='mso-tab-count:1'>  </span>Specific requirements</span><span
style='font-size:23.0pt;color:windowtext;mso-color-alt:windowtext;font-weight:
normal'><o:p></o:p></span></h1>

</div>

<h2 style='margin-bottom:4.0pt;page-break-after:auto;mso-list:none'><a
name="_4jvag34g0bi5"></a><span style='font-size:17.0pt'>3.1<span
style='mso-spacerun:yes'>    </span>External Interface Requirements</span><span
style='font-size:17.0pt;font-weight:normal'><o:p></o:p></span></h2>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><a
name="_rpgbas6wl7q9"></a><span lang=EN style='font-size:13.0pt'>3.1.1<span
style='mso-tab-count:1'>  </span>User Interfaces</span><span lang=EN
style='font-size:13.0pt;font-weight:normal'><o:p></o:p></span></h3>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The GUI will include a map for the user to be able to
see the route to the campus, as well as buttons, checkboxes, and text fields
that enable the user to provide input into the system in an intuitive way. The
Java Swing and Java AWT libraries will primarily be used for the applications
GUI. The following will be included in the user interface:<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-no-proof:yes'><!--[if gte vml 1]><v:shape
 id="image1.png" o:spid="_x0000_i1045" type="#_x0000_t75" alt="Graphical user interface, application&#10;&#10;Description automatically generated"
 style='width:468pt;height:262.5pt;visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="combined_files/image017.png" o:title="Graphical user interface, application&#10;&#10;Description automatically generated"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=624 height=350
src="combined_files/image018.png"
alt="Graphical user interface, application&#10;&#10;Description automatically generated"
v:shapes="image1.png"><![endif]></span><o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-no-proof:yes'><!--[if gte vml 1]><v:shape
 id="image3.png" o:spid="_x0000_i1044" type="#_x0000_t75" alt="Chart&#10;&#10;Description automatically generated with medium confidence"
 style='width:468pt;height:262.5pt;visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="combined_files/image019.png" o:title="Chart&#10;&#10;Description automatically generated with medium confidence"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=624 height=350
src="combined_files/image020.jpg"
alt="Chart&#10;&#10;Description automatically generated with medium confidence"
v:shapes="image3.png"><![endif]></span><o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><a
name="_k0zod820efj7"></a><span lang=EN style='font-size:13.0pt'>3.1.2<span
style='mso-tab-count:1'>  </span>Hardware Interfaces</span><span lang=EN
style='font-size:13.0pt;font-weight:normal'><o:p></o:p></span></h3>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Device will use network features to communicate with
the Google Maps API. This will require the user to have a network card and
necessary networking hardware such as Wi-Fi or ethernet, as well as a router.
Data transferred over the network may include uploading a search query (such as
to look up a building), downloading location data for <span class=GramE>particular
locations</span>, or downloading suggestions for a particular search query, if
needed.<o:p></o:p></p>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><a
name="_5dyq1n86j0sj"></a><span lang=EN style='font-size:13.0pt'>3.1.3<span
style='mso-tab-count:1'>  </span>Software Interfaces</span><span lang=EN
style='font-size:13.0pt;font-weight:normal'><o:p></o:p></span></h3>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The software will interface with the Windows operating
system, making function calls to the system through Javas Swing and AWT
libraries. The Google Maps API will also be utilized in the system to look up
location data for a particular address, and to plot routes. JUnit v. 4.10 will
be used for unit testing. Java JDK v. 14.0.2 will also be used as the
development kit.<o:p></o:p></p>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><a
name="_cdl89f2t0d5p"></a><span lang=EN style='font-size:13.0pt'>3.1.4<span
style='mso-tab-count:1'>  </span>Communications Interfaces</span><span lang=EN
style='font-size:13.0pt;font-weight:normal'><o:p></o:p></span></h3>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span class=GramE>In order to</span> use JavaScript
with our standalone Java application, we would use Rhino which takes JavaScript
scripts and converts them into classes. This way, we can use Google Maps with
Routes through JavaScript without creating a <span class=GramE>web based</span>
application. Other than calls made from the API to Google, no other means of
communication has been defined for the application as of now.<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-spacerun:yes'> </span><o:p></o:p></p>

<h2 style='margin-bottom:4.0pt;page-break-after:auto;mso-list:none'><a
name="_da9v52ylpwdf"></a><span style='font-size:17.0pt'>3.2<span
style='mso-tab-count:1'>   </span>Functional requirements</span><span
style='font-size:17.0pt;font-weight:normal'><o:p></o:p></span></h2>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Need to change header to actual function name from use
case<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The application will have an entry point from the main
method into the class that manages what is shown on the screen like the map
itself and the <span class=SpellE>appbar</span>. Then the user will be able to
search for the building that they are looking for. Then<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><a
name="_36n2z4tfmwnl"></a><span lang=EN style='font-size:13.0pt;font-weight:
normal'><o:p>&nbsp;</o:p></span></h3>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><span
lang=EN style='font-size:13.0pt;font-weight:normal'><o:p>&nbsp;</o:p></span></h3>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><span
lang=EN style='font-size:13.0pt;font-weight:normal'><o:p>&nbsp;</o:p></span></h3>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><span
lang=EN style='font-size:13.0pt'>3.2.1<span style='mso-tab-count:1'>  </span>Handicap
Toggle</span><span lang=EN style='font-size:13.0pt;font-weight:normal'><o:p></o:p></span></h3>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_nlx3dymzqasd"></a><span style='mso-bidi-font-size:11.0pt'>3.2.1.1<span
style='mso-tab-count:1'> </span>Introduction</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>On app startup, the user must select on a toggle button
that dictates whether the user is handicap or non-handicap. This selection can
be changed at any time through either a sliding drawer or button on the <span
class=SpellE>appbar</span>. This toggle will act as the check for which routes
need to be purged from navigation. <o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_x4tcus98in5o"></a><span style='mso-bidi-font-size:11.0pt'>3.2.1.2<span
style='mso-tab-count:1'> </span>Inputs</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Inputs for this function will be from a <span
class=SpellE>onPressed</span> listener that will record the selection in a
simple <span class=SpellE>boolean</span> variable. That said, the range of
acceptable value will be either true or false. <o:p></o:p></p>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_kea2prefc7r2"></a><span style='mso-bidi-font-size:11.0pt'>3.2.1.3<span
style='mso-tab-count:1'> </span>Processing</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>To prevent abnormal situations, the value initialized
upon declaration will be false so that the user will be able to navigate
anywhere regardless of disabilities. However, this implementation will later be
redundant as the app will require the user to clarify a selection on app
startup. </p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_fk3g1zf9lrny"></a><span style='mso-bidi-font-size:11.0pt'>3.2.1.4<span
style='mso-tab-count:1'> </span>Outputs</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:14.0pt'>Outputs for this function will be
coordinates that may or may not be handicap accessible based on the selection
of the user. <o:p></o:p></p>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><a
name="_7likapbypuic"></a><span lang=EN style='font-size:13.0pt'>3.2.2<span
style='mso-tab-count:1'>  </span>Building Search</span><span lang=EN
style='font-size:13.0pt;font-weight:normal'><o:p></o:p></span></h3>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_t2ji6pu25nee"></a><span style='mso-bidi-font-size:11.0pt'>3.2.2.1<span
style='mso-tab-count:1'> </span>Introduction</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Located on the <span class=SpellE>appbar</span>, there
will be a search bar that allows the user to search for buildings on the
campus.<span style='mso-spacerun:yes'>  </span>Suggestions of buildings will
appear on a dropdown menu so that the user can quickly navigate to a location.
The query paired with the toggle selection will be passed to the Google Maps
API through a request and direct the user to the most efficient and safest
route to their destination.<span style='mso-spacerun:yes'>  </span><o:p></o:p></p>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_8j7cec9w0ebn"></a><span style='mso-bidi-font-size:11.0pt'>3.2.2.2<span
style='mso-tab-count:1'> </span>Inputs</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The inputs for this function are queries generated by
the user from a <span class=SpellE>textform</span> which represents a search
bar. <o:p></o:p></p>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_doa0tyfzdwpp"></a><span style='mso-bidi-font-size:11.0pt'>3.2.2.3<span
style='mso-tab-count:1'> </span>Processing</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The function will cross reference a predetermined set
of buildings on campus. This list ideally will be an adjacency list that can be
converted to a large amount of data structures based on the use. The main
structure that should be implemented first is an array of arrays.<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b style='mso-bidi-font-weight:normal'>3.2.2.4<span
style='mso-tab-count:1'> </span>Outputs<o:p></o:p></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The function will pass arguments to the API based on the
coordinates not omitted from the toggle selection. Potential errors arise if
the user spells the name of a building incorrectly. There will be a dropdown
menu utilized to assist in mitigating this problem. Also, what if the user
searches for a building that is not there, or in the applications case not in
the list? Then an error message will be displayed which will notify the user
and display suggested buildings that the user will navigate to.<o:p></o:p></p>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><a
name="_oaqruq1vx2p4"></a><span lang=EN style='font-size:13.0pt'>3.2.2<span
style='mso-tab-count:1'>  </span>Delete Building</span><span lang=EN
style='font-size:13.0pt;font-weight:normal'><o:p></o:p></span></h3>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_3iw70fdtddl3"></a><span style='mso-bidi-font-size:11.0pt'>3.2.2.1<span
style='mso-tab-count:1'> </span>Introduction</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>By selecting a pin on the map, an administrator can
view information about the building and has the option to remove the pin from
the map.</p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_38k6nde5we3n"></a><span style='mso-bidi-font-size:11.0pt'>3.2.2.2<span
style='mso-tab-count:1'> </span>Inputs</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The <span class=GramE>inputs</span> for this function
is the selection of a building. This selection pulls up options that allow the
administrator to remove buildings from the list of buildings pinned to the map.<o:p></o:p></p>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_g39o7aw9lk2"></a><span style='mso-bidi-font-size:11.0pt'>3.2.2.3<span
style='mso-tab-count:1'> </span>Processing</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The function will remove the selected building from the
structure that contains the buildings.<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b style='mso-bidi-font-weight:normal'>3.2.2.4<span
style='mso-tab-count:1'> </span>Outputs<o:p></o:p></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The output for this function is a <span class=SpellE>rerendered</span>
map where the building selected will no longer be present for the user to view<o:p></o:p></p>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><a
name="_lrdy5p4j4j4a"></a><span lang=EN style='font-size:13.0pt'>3.2.2<span
style='mso-tab-count:1'>  </span>Add Building</span><span lang=EN
style='font-size:13.0pt;font-weight:normal'><o:p></o:p></span></h3>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_3hqvkxx5d8kn"></a><span style='mso-bidi-font-size:11.0pt'>3.2.2.1<span
style='mso-tab-count:1'> </span>Introduction</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Located on the <span class=SpellE>appbar</span>, there
will be a button that allows an administrator to add buildings to the structure
that holds the buildings and their related information.<o:p></o:p></p>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_cak6lnt3we1j"></a><span style='mso-bidi-font-size:11.0pt'>3.2.2.2<span
style='mso-tab-count:1'> </span>Inputs</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The inputs for this function are the coordinates of a
building on the campus.<o:p></o:p></p>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_v4xtilwq5twq"></a><span style='mso-bidi-font-size:11.0pt'>3.2.2.3<span
style='mso-tab-count:1'> </span>Processing</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Once the building is selected, the function will
utilize Google Maps/Routes to acquire route information so that an
administrator can navigate to the new building. <o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b style='mso-bidi-font-weight:normal'>3.2.2.4<span
style='mso-tab-count:1'> </span>Outputs<o:p></o:p></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The function will generate a pin which will be added to
the map that will allow an administrator to select the recently added building
and remove it, see Function requirement 3. A <span class=SpellE>rerender</span>
of the map will be required.<span style='mso-spacerun:yes'>   </span><o:p></o:p></p>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><a
name="_jsb7f1oo40h7"></a><span lang=EN style='font-size:13.0pt'>3.2.2<span
style='mso-tab-count:1'>  </span>Emergency Route Nav</span><span lang=EN
style='font-size:13.0pt;font-weight:normal'><o:p></o:p></span></h3>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_99kb09j13g27"></a><span style='mso-bidi-font-size:11.0pt'>3.2.2.1<span
style='mso-tab-count:1'> </span>Introduction</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Located on the <span class=SpellE>appbar</span>, there
will be a button that allows the user to navigate to the nearest Emergency
Station located on the campus.<o:p></o:p></p>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_xal5nkc734n8"></a><span style='mso-bidi-font-size:11.0pt'>3.2.2.2<span
style='mso-tab-count:1'> </span>Inputs</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The inputs for this function will be the users
location relative to the nearest station.<o:p></o:p></p>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_y0yidl19safy"></a><span style='mso-bidi-font-size:11.0pt'>3.2.2.3<span
style='mso-tab-count:1'> </span>Processing</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Once the button is pressed, Google Maps/Routes will
navigate the user to the nearest station. This will rely heavily on Googles
navigation within the functions provided by the API. <o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b style='mso-bidi-font-weight:normal'>3.2.2.4<span
style='mso-tab-count:1'> </span>Outputs<o:p></o:p></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The output will be a route that will be checked based
on the handicap toggle and will allow the user to see a route on the map from
their location to the nearest Emergency Station. <o:p></o:p></p>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><a
name="_w042cb2zbp8y"></a><span lang=EN style='font-size:13.0pt'>3.2.2<span
style='mso-tab-count:1'>  </span>Pop Route</span><span lang=EN
style='font-size:13.0pt;font-weight:normal'><o:p></o:p></span></h3>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_mhr4p4bfzqgu"></a><span style='mso-bidi-font-size:11.0pt'>3.2.2.1<span
style='mso-tab-count:1'> </span>Introduction</span><span style='mso-bidi-font-size:
11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>This function removes the routes from the navigation
and ensures that the routes are correctly back in place once that instance of
navigation is over<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b style='mso-bidi-font-weight:normal'>3.2.2.2<span
style='mso-tab-count:1'> </span>Inputs<o:p></o:p></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The inputs for this function will be the value returned
from the Handicap Toggle function<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><a
name="_w07rmaxlbno6"></a><span style='mso-bidi-font-size:11.0pt;font-weight:
normal'><o:p>&nbsp;</o:p></span></h4>

<h4 style='margin-top:12.0pt;margin-right:0in;margin-bottom:2.0pt;margin-left:
0in;text-indent:0in;page-break-after:auto;mso-list:l3 level4 lfo1'><span
style='mso-bidi-font-size:11.0pt'>3.2.2.3<span style='mso-tab-count:1'> </span>Processing</span><span
style='mso-bidi-font-size:11.0pt;font-weight:normal'><o:p></o:p></span></h4>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Once called, the function will check for routes deemed
unsafe and omit them from the navigation<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><b style='mso-bidi-font-weight:normal'>3.2.2.4<span
style='mso-tab-count:1'> </span>Outputs<o:p></o:p></b></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The output will be a route that will be checked based
on the handicap toggle and will allow the user to see a route on the map from
their location to the building they would like to go<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<h2 style='margin-bottom:4.0pt;page-break-after:auto;mso-list:none'><a
name="_3wwgn41on8qj"></a><span style='font-size:17.0pt'>3.3<span
style='mso-tab-count:1'>   </span>Performance Requirements</span><span
style='font-size:17.0pt;font-weight:normal'><o:p></o:p></span></h2>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The response time for all interactions once the user
has initiated them must be under 15 seconds.<o:p></o:p></p>

<h2 style='margin-bottom:4.0pt;page-break-after:auto;mso-list:none'><a
name="_s16gfnmaldm7"></a><span style='font-size:17.0pt'>3.4<span
style='mso-tab-count:1'>   </span>Software System Attributes</span><span
style='font-size:17.0pt;font-weight:normal'><o:p></o:p></span></h2>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><a
name="_jtey6sszz07s"></a><span lang=EN style='font-size:13.0pt'>3.4.1<span
style='mso-tab-count:1'>  </span>Availability</span><span lang=EN
style='font-size:13.0pt;font-weight:normal'><o:p></o:p></span></h3>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>There are 24 hours * 60 minutes * 7 days = 10,080
minutes a week.<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-spacerun:yes'> </span>The system will
be down no longer than 60 minutes per week. <span class=GramE>So</span> the
system will be up 99.4% of the time<o:p></o:p></p>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><a
name="_gw3sj0ifgbr4"></a><span lang=EN style='font-size:13.0pt'>3.4.2<span
style='mso-tab-count:1'>  </span>Security</span><span lang=EN style='font-size:
13.0pt;font-weight:normal'><o:p></o:p></span></h3>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>The application will have relaxed security so that any
user can access all features of the app with an exception being able to add and
delete buildings which will be given to users with administrator privileges. <o:p></o:p></p>

<h2 style='margin-bottom:4.0pt;page-break-after:auto;mso-list:none'><a
name="_914hbzcyi9q7"></a><span style='font-size:17.0pt'>3.5<span
style='mso-tab-count:1'>   </span>Constraints</span><span style='font-size:
17.0pt;font-weight:normal'><o:p></o:p></span></h2>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><a
name="_yfd8vjz0thsb"></a><span lang=EN style='font-size:13.0pt'>3.5.1<span
style='mso-tab-count:1'>  </span>Standards Compliance</span><span lang=EN
style='font-size:13.0pt;font-weight:normal'><o:p></o:p></span></h3>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><o:p>&nbsp;</o:p></p>

<h3 style='margin-top:14.0pt;page-break-after:auto;mso-list:none'><a
name="_fjy5j82o51hk"></a><span lang=EN style='font-size:13.0pt'>3.5.2<span
style='mso-tab-count:1'>  </span>Hardware Limitations</span><span lang=EN
style='font-size:13.0pt;font-weight:normal'><o:p></o:p></span></h3>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Device hardware must include access to the internet <span
class=GramE>in order to</span> communicate with Google Maps. Must also have
minor graphical capabilities.<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Other limitations include the ability for a system to
store and execute .jar files. This means that for Mac users, they would need to
make sure that Java Runtime Environment is installed and updated since Macs no
longer ship with JRE installed on the device. <span class=GramE>Also</span>
mobile devices are unsupported. <o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'><span style='mso-spacerun:yes'> </span><o:p></o:p></p>

<br clear=all style='mso-special-character:line-break;page-break-before:always'>

<p class=MsoNormal><o:p>&nbsp;</o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Appendix A: Issues List<o:p></o:p></p>

<p class=MsoNormal style='margin-top:12.0pt;margin-right:0in;margin-bottom:
12.0pt;margin-left:0in'>Legend: <span style='font-family:"Arial Unicode MS";
mso-fareast-font-family:"Arial Unicode MS";mso-bidi-font-family:"Arial Unicode MS"'>Completed
Task &#8594;</span><span style='color:blue'> //Commented out with blue writing<o:p></o:p></span></p>

<p class=MsoNormal align=left style='margin-top:0in;margin-right:0in;
margin-bottom:0in;margin-left:.5in;text-align:left;text-indent:-.25in;
line-height:115%;mso-list:l4 level1 lfo6'><![if !supportLists]><span
style='mso-fareast-font-family:"Times New Roman";color:red'><span
style='mso-list:Ignore'>-<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='color:red'>(Section 3.1.3) Data
transfer constraints for the Google Maps API (such as how an address is
expected to be transmitted to the Google Maps server, or how it sends back
location data) is unknown.<o:p></o:p></span></p>

<p class=MsoNormal align=left style='margin-top:0in;margin-right:0in;
margin-bottom:0in;margin-left:.5in;text-align:left;text-indent:-.25in;
line-height:115%;mso-list:l4 level1 lfo6'><![if !supportLists]><span
style='mso-fareast-font-family:"Times New Roman";color:red'><span
style='mso-list:Ignore'>-<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='color:red'>(Section 3.1.3)
Interfacing constraints for the JUnit API is unknown.<o:p></o:p></span></p>

<p class=MsoNormal align=left style='margin-top:0in;margin-right:0in;
margin-bottom:0in;margin-left:.5in;text-align:left;text-indent:-.25in;
line-height:115%;mso-list:l4 level1 lfo6'><![if !supportLists]><span
style='mso-fareast-font-family:"Times New Roman";color:red'><span
style='mso-list:Ignore'>-<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='color:red'>(Section 3.1.4)
Communications functions unknown. More information needed<o:p></o:p></span></p>

<p class=MsoNormal align=left style='margin-top:0in;margin-right:0in;
margin-bottom:0in;margin-left:.5in;text-align:left;text-indent:-.25in;
line-height:115%;mso-list:l4 level1 lfo6'><![if !supportLists]><span
style='mso-fareast-font-family:"Times New Roman";color:blue'><span
style='mso-list:Ignore'>-<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='color:blue'>/*(Section 1.4) Dont
know what should be included in the outline, especially wondering about
Appendix A.<o:p></o:p></span></p>

<p class=MsoNormal align=left style='margin-top:0in;margin-right:0in;
margin-bottom:0in;margin-left:.5in;text-align:left;text-indent:-.25in;
line-height:115%;mso-list:l4 level1 lfo6'><![if !supportLists]><span
style='mso-fareast-font-family:"Times New Roman";color:blue'><span
style='mso-list:Ignore'>-<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='color:blue'>(Section 3.3) Not sure
if there are any performance requirements or <span class=GramE>not.*</span>/<o:p></o:p></span></p>

<p class=MsoNormal align=left style='margin-top:0in;margin-right:0in;
margin-bottom:0in;margin-left:.5in;text-align:left;text-indent:-.25in;
line-height:115%;mso-list:l4 level1 lfo6'><![if !supportLists]><span
style='mso-fareast-font-family:"Times New Roman";color:blue'><span
style='mso-list:Ignore'>-<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:12.0pt;line-height:115%;
color:blue'>/*Use case: change names in use case to more meaningful names. </span><span
style='color:blue'><o:p></o:p></span></p>

<p class=MsoNormal align=left style='margin-top:0in;margin-right:0in;
margin-bottom:0in;margin-left:.5in;text-align:left;text-indent:-.25in;
line-height:115%;mso-list:l4 level1 lfo6'><![if !supportLists]><span
style='mso-fareast-font-family:"Times New Roman";color:blue'><span
style='mso-list:Ignore'>-<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:12.0pt;line-height:115%;
color:blue'>Use case: remove classes in diagram. add additional actor Admin who
is the only one allowed to add/delete buildings. </span><span style='color:
blue'><o:p></o:p></span></p>

<p class=MsoNormal align=left style='margin-top:0in;margin-right:0in;
margin-bottom:0in;margin-left:.5in;text-align:left;text-indent:-.25in;
line-height:115%;mso-list:l4 level1 lfo6'><![if !supportLists]><span
style='mso-fareast-font-family:"Times New Roman";color:blue'><span
style='mso-list:Ignore'>-<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:12.0pt;line-height:115%;
color:blue'>Use case: reconfigure relationships with add and delete and a few
others. User classes: can be more than just students, like faculty and
visitors. </span><span style='color:blue'><o:p></o:p></span></p>

<p class=MsoNormal align=left style='margin-top:0in;margin-right:0in;
margin-bottom:0in;margin-left:.5in;text-align:left;text-indent:-.25in;
line-height:115%;mso-list:l4 level1 lfo6'><![if !supportLists]><span
style='mso-fareast-font-family:"Times New Roman";color:blue'><span
style='mso-list:Ignore'>-<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:12.0pt;line-height:115%;
color:blue'>User Interface: We need an illustration of what the UI will look
like. This can be done by hand or with a drawing software since there isn't an
implementation yet*/ </span><span style='color:blue'><o:p></o:p></span></p>

<p class=MsoNormal align=left style='margin-top:0in;margin-right:0in;
margin-bottom:0in;margin-left:.5in;text-align:left;text-indent:-.25in;
line-height:115%;mso-list:l4 level1 lfo6'><![if !supportLists]><span
style='mso-fareast-font-family:"Times New Roman";color:blue'><span
style='mso-list:Ignore'>-<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:12.0pt;line-height:115%;
color:blue'>/*Functional requirements: we need the names of the functions to
match with the names from the use case. That is, &quot;Functional requirement
1&quot; need to be replaced with the name from the use <span class=GramE>case.*</span>/
</span><span style='color:blue'><o:p></o:p></span></p>

<p class=MsoNormal align=left style='margin-top:0in;margin-right:0in;
margin-bottom:0in;margin-left:.5in;text-align:left;text-indent:-.25in;
line-height:115%;mso-list:l4 level1 lfo6'><![if !supportLists]><span
style='mso-fareast-font-family:"Times New Roman";color:blue'><span
style='mso-list:Ignore'>-<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:12.0pt;line-height:115%;
color:blue'>/*Performance requirements: we need to set a general requirement
that states that everything should happen within 15 seconds. */</span><span
style='color:blue'><o:p></o:p></span></p>

<p class=MsoNormal align=left style='margin-top:0in;margin-right:0in;
margin-bottom:0in;margin-left:.5in;text-align:left;text-indent:-.25in;
line-height:115%;mso-list:l4 level1 lfo6'><![if !supportLists]><span
style='mso-fareast-font-family:"Times New Roman";color:blue'><span
style='mso-list:Ignore'>-<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:12.0pt;line-height:115%;
color:blue'>/*Availability: availability is a ratio. I suppose that we need to
have one without implementation. I can double check how he wants it in a few.
*/</span><span style='color:blue'><o:p></o:p></span></p>

<p class=MsoNormal align=left style='margin-top:0in;margin-right:0in;
margin-bottom:0in;margin-left:.5in;text-align:left;text-indent:-.25in;
line-height:115%;mso-list:l4 level1 lfo6'><![if !supportLists]><span
style='mso-fareast-font-family:"Times New Roman";color:blue'><span
style='mso-list:Ignore'>-<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:12.0pt;line-height:115%;
color:blue'>/*Security: we can choose to have security measures or not. More on
that if we have a chance to talk. */</span><span style='color:blue'><o:p></o:p></span></p>

<p class=MsoNormal align=left style='margin-top:0in;margin-right:0in;
margin-bottom:0in;margin-left:.5in;text-align:left;text-indent:-.25in;
line-height:115%;mso-list:l4 level1 lfo6'><![if !supportLists]><span
style='font-size:12.0pt;line-height:115%;mso-fareast-font-family:"Times New Roman";
color:blue'><span style='mso-list:Ignore'>-<span style='font:7.0pt "Times New Roman"'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</span></span></span><![endif]><span style='font-size:12.0pt;line-height:115%;
color:blue'>/*Hardware limitations: since <span class=SpellE>rn</span> we are
doing a standalone app in java on windows, the platform itself is a hardware
limitation*/<o:p></o:p></span></p>

<span style='font-size:12.0pt;line-height:107%;font-family:"Times New Roman",serif;
mso-fareast-font-family:SimSun;color:blue;mso-ansi-language:EN-US;mso-fareast-language:
EN-US;mso-bidi-language:AR-SA'><br clear=all style='mso-special-character:line-break;
page-break-before:always'>
</span>

<p class=MsoNormal align=left style='margin-bottom:8.0pt;text-align:left;
line-height:107%'><span style='font-size:12.0pt;line-height:107%;color:blue'><o:p>&nbsp;</o:p></span></p>

<p class=MsoNormal align=left style='margin-bottom:0in;text-align:left;
line-height:115%'><b><span style='font-size:20.0pt;line-height:115%;font-family:
"Arial",sans-serif'>Unit Testing<o:p></o:p></span></b></p>

<p class=MsoNormal>We tested our application using two methods: Debug
statements from our Façade Pattern and with test cases from JUnit.<o:p></o:p></p>

<p class=MsoNormal>Transfer Test Cases<o:p></o:p></p>

<p class=MsoNormal><span style='mso-no-proof:yes'><!--[if gte vml 1]><v:shape
 id="Picture_x0020_6" o:spid="_x0000_i1043" type="#_x0000_t75" alt="Graphical user interface, application, Word&#10;&#10;Description automatically generated"
 style='width:467.25pt;height:474.75pt;visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="combined_files/image021.png" o:title="Graphical user interface, application, Word&#10;&#10;Description automatically generated"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=623 height=633
src="combined_files/image022.png"
alt="Graphical user interface, application, Word&#10;&#10;Description automatically generated"
v:shapes="Picture_x0020_6"><![endif]></span><span
style='mso-spacerun:yes'> </span><o:p></o:p></p>

<p class=MsoNormal><o:p>&nbsp;</o:p></p>

<br clear=all style='mso-special-character:line-break;page-break-before:always'>

<p class=MsoNormal><o:p>&nbsp;</o:p></p>

<p class=MsoNormal>Transfer Test class code<o:p></o:p></p>

<p class=MsoNormal><span style='mso-no-proof:yes'><!--[if gte vml 1]><v:shape
 id="Picture_x0020_7" o:spid="_x0000_i1042" type="#_x0000_t75" style='width:529.5pt;
 height:450pt;visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="combined_files/image023.png" o:title=""/>
</v:shape><![endif]--><![if !vml]><img border=0 width=706 height=600
src="combined_files/image024.png" v:shapes="Picture_x0020_7"><![endif]></span><o:p></o:p></p>

<br clear=all style='mso-special-character:line-break;page-break-before:always'>

<p class=MsoNormal><o:p>&nbsp;</o:p></p>

<p class=MsoNormal>Coordinate Test Cases<o:p></o:p></p>

<p class=MsoNormal><span style='mso-no-proof:yes'><!--[if gte vml 1]><v:shape
 id="Picture_x0020_8" o:spid="_x0000_i1041" type="#_x0000_t75" style='width:468pt;
 height:536.25pt;visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="combined_files/image025.png" o:title=""/>
</v:shape><![endif]--><![if !vml]><img border=0 width=624 height=715
src="combined_files/image026.png" v:shapes="Picture_x0020_8"><![endif]></span><o:p></o:p></p>

<br clear=all style='mso-special-character:line-break;page-break-before:always'>

<p class=MsoNormal><o:p>&nbsp;</o:p></p>

<p class=MsoNormal>Coordinate Test class code<o:p></o:p></p>

<p class=MsoNormal><span style='mso-no-proof:yes'><!--[if gte vml 1]><v:shape
 id="Picture_x0020_4" o:spid="_x0000_i1040" type="#_x0000_t75" style='width:461.25pt;
 height:495pt;visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="combined_files/image027.png" o:title=""/>
</v:shape><![endif]--><![if !vml]><img border=0 width=615 height=660
src="combined_files/image027.png" v:shapes="Picture_x0020_4"><![endif]></span><o:p></o:p></p>

<br clear=all style='mso-special-character:line-break;page-break-before:always'>

<p class=MsoNormal><o:p>&nbsp;</o:p></p>

<p class=MsoNormal>Waypoints Test cases<o:p></o:p></p>

<p class=MsoNormal><span style='mso-no-proof:yes'><!--[if gte vml 1]><v:shape
 id="Picture_x0020_17" o:spid="_x0000_i1039" type="#_x0000_t75" alt="Graphical user interface, text, application&#10;&#10;Description automatically generated"
 style='width:468pt;height:384pt;visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="combined_files/image028.png" o:title="Graphical user interface, text, application&#10;&#10;Description automatically generated"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=624 height=512
src="combined_files/image029.jpg"
alt="Graphical user interface, text, application&#10;&#10;Description automatically generated"
v:shapes="Picture_x0020_17"><![endif]></span><o:p></o:p></p>

<br clear=all style='mso-special-character:line-break;page-break-before:always'>

<p class=MsoNormal><o:p>&nbsp;</o:p></p>

<p class=MsoNormal>Waypoints Test class code<o:p></o:p></p>

<p class=MsoNormal><span style='mso-no-proof:yes'><!--[if gte vml 1]><v:shape
 id="Picture_x0020_11" o:spid="_x0000_i1038" type="#_x0000_t75" style='width:467.25pt;
 height:5in;visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="combined_files/image030.png" o:title=""/>
</v:shape><![endif]--><![if !vml]><img border=0 width=623 height=480
src="combined_files/image031.png" v:shapes="Picture_x0020_11"><![endif]><!--[if gte vml 1]><v:shape
 id="Picture_x0020_12" o:spid="_x0000_i1037" type="#_x0000_t75" style='width:468pt;
 height:141.75pt;visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="combined_files/image032.png" o:title=""/>
</v:shape><![endif]--><![if !vml]><img border=0 width=624 height=189
src="combined_files/image033.jpg" v:shapes="Picture_x0020_12"><![endif]></span><o:p></o:p></p>

<p class=MsoNormal><span style='mso-no-proof:yes'><!--[if gte vml 1]><v:shape
 id="Picture_x0020_14" o:spid="_x0000_i1036" type="#_x0000_t75" style='width:403.5pt;
 height:310.5pt;visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="combined_files/image034.png" o:title=""/>
</v:shape><![endif]--><![if !vml]><img border=0 width=538 height=414
src="combined_files/image035.jpg" v:shapes="Picture_x0020_14"><![endif]></span><o:p></o:p></p>

<p class=MsoNormal><span style='mso-no-proof:yes'><!--[if gte vml 1]><v:shape
 id="Picture_x0020_15" o:spid="_x0000_i1035" type="#_x0000_t75" style='width:411.75pt;
 height:316.5pt;visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="combined_files/image036.png" o:title=""/>
</v:shape><![endif]--><![if !vml]><img border=0 width=549 height=422
src="combined_files/image037.jpg" v:shapes="Picture_x0020_15"><![endif]></span><o:p></o:p></p>

<p class=MsoNormal><span style='mso-no-proof:yes'><!--[if gte vml 1]><v:shape
 id="Picture_x0020_16" o:spid="_x0000_i1034" type="#_x0000_t75" alt="Text&#10;&#10;Description automatically generated"
 style='width:467.25pt;height:227.25pt;visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="combined_files/image038.png" o:title="Text&#10;&#10;Description automatically generated"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=623 height=303
src="combined_files/image039.jpg"
alt="Text&#10;&#10;Description automatically generated" v:shapes="Picture_x0020_16"><![endif]></span><br
clear=all style='mso-special-character:line-break;page-break-before:always'>
<o:p></o:p></p>

<p class=MsoNormal>Façade output<span style='mso-no-proof:yes'><!--[if gte vml 1]><v:shape
 id="Picture_x0020_9" o:spid="_x0000_i1033" type="#_x0000_t75" alt="Graphical user interface, text, application&#10;&#10;Description automatically generated"
 style='width:468pt;height:316.5pt;visibility:visible;mso-wrap-style:square'>
 <v:imagedata src="combined_files/image040.png" o:title="Graphical user interface, text, application&#10;&#10;Description automatically generated"/>
</v:shape><![endif]--><![if !vml]><img border=0 width=624 height=422
src="combined_files/image041.png"
alt="Graphical user interface, text, application&#10;&#10;Description automatically generated"
v:shapes="Picture_x0020_9"><![endif]></span><o:p></o:p></p>

<p class=MsoNormal><o:p>&nbsp;</o:p></p>

<p class=MsoNormal align=left style='margin-bottom:0in;text-align:left;
line-height:115%'><b><span style='mso-bidi-font-size:11.0pt;line-height:115%;
font-family:"Arial",sans-serif'><o:p>&nbsp;</o:p></span></b></p>

<p class=MsoNormal><o:p>&nbsp;</o:p></p>

<p class=MsoNormal><o:p>&nbsp;</o:p></p>

<p class=MsoNormal style='tab-stops:179.25pt'><span style='mso-tab-count:1'>                                                            </span></p>

</div>

</body>

</html>
