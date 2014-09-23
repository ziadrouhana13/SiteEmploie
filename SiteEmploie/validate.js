var d=new Date()
var year=d.getFullYear();
// function to enter only number from key board
function ageonly()
{
document.regfrm.age.value=year-document.regfrm.year.value
document.regfrm.age.select();
}
function num_only()
{
var keyASCII = window.event.keyCode;
var keyValue = String.fromCharCode(keyASCII);
if (!(keyValue >= '0' && keyValue <= '9'))
{
window.event.keyCode=0;
alert ("please enter numeric value");
}
}	
function alpha_only()
{
var keyASCII = window.event.keyCode;
var keyValue = String.fromCharCode(keyASCII);
if (!(keyValue >= 'A' && keyValue <= 'z'))
{
window.event.keyCode=0;
alert ("please enter alpabetic value");
}
}	
function no_space()
{
var keyASCII = window.event.keyCode;
var keyValue = String.fromCharCode(keyASCII);
if(keyValue == ' '){
window.event.keyCode=0;
alert ("please enter correct value");
}
}	
//function for validation
function valid(){
var fistnm=document.regfrm.fn;
var vstate=document.regfrm.states;
var vage=document.regfrm.age;
var vaddress=document.regfrm.address;
var vemail=document.regfrm.email;
var vpwd=document.regfrm.password;
var vyy=document.regfrm.year;
var vcpwd=document.regfrm.confirmpwd;
var vdd=document.regfrm.dd;
var vpin=document.regfrm.pin;
var vphone=document.regfrm.phone;
var vmm=document.regfrm.mm;
var vpan=document.regfrm.pan;
var vlstnm=document.regfrm.ln;
age=year-vyy.value;
//document.write(age);
/*var atpos=x.indexOf("@");
var dotpos=x.lastIndexOf(".");
if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length)
{
alert("Not a valid e-mail address");
return false;
}*/	
if(fistnm.value==""){
alert ("please enter firstname correct value ");
fistnm.focus();
return false;
}
else if(vlstnm.value==""){
alert ("please enter correct value ");
vlstnm.focus();
return false;
}
else if ( ( document.regfrm.gender[0].checked == false ) &&
( document.regfrm.gender[1].checked == false ) ) {
alert ( "Please choose your Gender: Male or Female" );
return false;
}
else if (vdd.value>31){
alert ("please enter correct value ");
vdd.value="";
vdd.focus();
return false;
}
else if (vdd.value==""){
alert ("please enter correct value ");
vdd.focus();
return false;
}	
else if (vmm.value>12){
alert ("please enter correct value ");
vmm.value="";
vmm.focus();
return false;
}
else if (vyy.value<1922){
alert ("please enter correct value ");
vyy.value="";
vyy.focus();
return false;
}
else if (vyy.value>=year-15){
alert ("please enter correct value ");
vyy.value="";
vyy.focus();
return false;
}
else if (vage.value<age-1){
alert ("please enter correct value ");
vage.value="";
vage.focus();
return false;
}
else if (vage.value>age+1){
alert ("please enter correct value ");
vage.value="";
vage.focus();
return false;
}
else if(vage.value=="age"){
vage.focus();
return false;
}
else if(vmm.value==""){
alert ("please enter correct value ");
vmm.focus();
return false;
}
else if(vyy.value==""){
alert ("please enter correct value ");
vyy.focus();
return false;
}
else if(vage.value==""){
alert ("please enter correct value ");
vage.focus();
return false;
}	
else if(vstate.value==""){
alert ("please select your state");
return false;
}
else if(vphone.value==""){
alert ("please enter correct value ");
vphone.focus();
return false;
}
else if(vemail.value==""){
alert ("please enter correct value ");
vemail.focus();
return false;
}
else if(vaddress.value=="") {
alert ("please enter correct value ");
vaddress.focus();
return false;
}
else if(vpin.value==""){
alert ("please enter correct value ");
vpin.focus();
return false;
}
else if(vpan.value==""){
alert ("please enter correct value ");
vpan.focus();
return false;
}	
else if ( ( document.regfrm.acctype[0].checked == false ) &&
( document.regfrm.acctype[1].checked == false ) &&
( document.regfrm.acctype[2].checked == false ) )
{
alert ( "Please choose your Account type" );
return false;
}
else if(vpwd.value==""){
alert ("please enter correct value ");
vpwd.focus();
return false;
}
else if(vpwd.value != vcpwd.value){
alert ("please enter correct value ");
vpwd.focus();
vcpwd.select();
return false;
}
else if(vacctyp.value==""){
alert ("please enter correct value ");
vacctyp.focus();
return false;
}
}
