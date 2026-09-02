let box= document.querySelectorAll(".btn");

let rest= document.querySelector(".reset");
let msg= document.querySelector("#wnmsg");

var turn =true;

let winningPatterns = [
    [0, 1, 2],  // top row
    [3, 4, 5],  // middle row
    [6, 7, 8],  // bottom row

    [0, 3, 6],  // left columns
    [1, 4, 7],  // middle column
    [2, 5, 8],  // right column

    [0, 4, 8],  // diagonal
    [2, 4, 6]   // diagonal
];
const showwnr = (winner)=>{
    msg.innerText=`congooooo , winner is : ${winner}`;
    
    }
    
let checkwinner = ()=>{

    for(let ptrn of winningPatterns){
        let p1=box[ptrn[0]].innerText;
        let p2=box[ptrn[1]].innerText;
        let p3=box[ptrn[2]].innerText;

        if(p1!="" && p2 !="" && p3 !=""){
            if(p1===p2 && p2===p3){
                showwnr(p1);

                box.forEach((btn)=>{
                    btn.disabled=true;

                });
            }
        }
    }
    

}


box.forEach((btn)=>{
    btn.addEventListener("click",()=>{


        if(turn){
     
            btn.innerText='X';

            turn=false;
        }else{

            btn.innerText='O';
            turn =true;

        }


        btn.disabled=true;
        checkwinner();


        
    })

  

})



