

/* alert("Love u")
confirm("do u ??")

var ans=prompt("Enter ur ans :")

let nm =prompt("ur name : ")

function greet(s){
    console.log("mrng ",s);
}
function res(a){
    console.log("her ans is: ",a)
}
greet(nm)

res(ans)

var user={
    unm:"sanju",
    age:22,
    grt:function(){
        console.log("good mrng")

    } 
}

user.grt() */



var box=document.querySelector(".box")
let l=0

box.addEventListener("click",function(){

    if(l==0){

    box.innerHTML="Goruuuu",
    box.style.color="lightgreen"
    box.style.backgroundColor="red"
    l=1
    }
    else{

        box.innerHTML="Anyways I love u "
        box.style.color="black"

        box.style.backgroundColor="lightpink"
        l=0
    }




})

let btn=document.querySelector("#btn")
var blb=document.querySelector("#light")

var f=0

btn.addEventListener("click",function(){
    if(f==0){
    blb.style.backgroundColor="yellow"
    f=1
    }
    else{
         blb.style.backgroundColor="white"
        
        f=0

    }

})

