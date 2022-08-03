
// // comments
// // Commments Single Line Comment
// /*
//  * Multi Line Comment
//  */
// // Basics
// /**
//  * Basics
//    * Variable Dec.
//    * Constants
//    * Dynamic Typing
//    * Primitive Types string char int undefined null symbol bool
//    * Reference Types
//      * Arrays 
//      * Objects
//      * Functions 
// */
// //1st way 
///var a = 'a';
 ///a = 1;
// a = false;
// a = undefined;
// a = null;
//console.log(a)
// var b = true;
// var c = 1;
// var d = undefined;
// d = 1;
// // 2nd way
// // var ---> let(//Es 6) 
// let f = 'a';
// let g = false;
// // 3rd way 
// const h = "hii";
// // == != !==
// /**
//  * Assignment Operator =
//  * Comparison >,<,>=,<=,==,!=
//  * Equality == && ===, !==
//  * Ternary (kabhi use na hota)
//  * Logical && || !
//  */
// let i = '1';
// let j = 1
// console.log( i !== j)
// /**
//  * Cond and loops 
//  * If...else
//  * If...elseif...else
//  * switch...case
//  * for
//  * while
//  * do...while
//  * break
//  * continue
//  */
// /**
//  * reference types
//    * Arrays 
//    * Functions
//    * Objects
//  */
// let arr = ['a',1,true,2,undefined]
// //1st way
// function dsc(a) {// Func dec.
//   console.log(a)
// }
// // func callling 
// dsc(1)
// // 2nd (Arrow Function)
// iiitl = (a) => {
//   console.log(a)
// }
// iiitl(2)
// // function 
// // Objects in js
// const person = {
//   key : 1,
//   firstName: "iiitl"
// } 
// console.log(person.firstName)
// // Roadmap 
// /***
//  * this 
//  * Rest 
//  * concat, every, each , sort , pop push shift unshift 
//  */
// console.log(document)
const input = prompt("Enter your choice a. add b. mul c. sub d. div ");
var choice=input;
var a,b,c,d;
var x=20,y=25;
switch(choice)
{
  case 'a' :
  a=x+y;
  console.log(a);
 break;
 case 'b' :
  b=x*y;
  console.log(b);
 break;
 case 'c' :
  c=x-y;
  console.log(c);
 break;
 case 'd' :
  d=x/y;
  console.log(d);
 break;
 default:
  console.log("worng input ");

}