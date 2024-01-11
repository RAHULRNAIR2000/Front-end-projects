// const fourth = document.getElementById("fourthPage");
// fourth.add("hidden");
function transitionToSecondPage() {
    const firstPage = document.getElementById("firstPage");
    const secondPage = document.getElementById("secondPage");

    // Scale up the first page and hide it
    firstPage.style.transform = "scale(0)";
    firstPage.style.display = "none";

    // Scale up the second page
    secondPage.classList.add("active");
  }



  
  function submitName() {
    const secondPage = document.getElementById("secondPage");
    const thirdPage = document.getElementById("thirdPage");
    const nameInput = document.getElementById("nameInput");
    const greetingMessage = document.getElementById("greetingMessage");

    const name = nameInput.value;

    secondPage.style.transform = "scale(0)";
    secondPage.style.display = "none";
    thirdPage.classList.add("active");

    greetingMessage.innerHTML = "Hello, " + name + "!";
  }
function showFullScreenImage1(){

  const thirdPage = document.getElementById("thirdPage");
  const fourth = document.getElementById("fourthPage1");
 

  // document.getElementById("thirdPage").classList.add("hidden");
  thirdPage.style.transform = "scale(0)";
  thirdPage.style.display = "none";
  thirdPage.remove("active");
  fourth.classList.add("active");
  // fourth.style.backgroundColor="blue";

    // fourth.style.backgroundColor="blue";
    // fourth.remove("hidden");



}
function showFullScreenImage2(){

  const thirdPage = document.getElementById("thirdPage");
  const fourth = document.getElementById("fourthPage2");
 

  // document.getElementById("thirdPage").classList.add("hidden");
  thirdPage.style.transform = "scale(0)";
  thirdPage.style.display = "none";
  thirdPage.remove("active");
  fourth.classList.add("active");
  // fourth.style.backgroundColor="blue";

    // fourth.style.backgroundColor="blue";
    // fourth.remove("hidden");



}
function showFullScreenImage3(){

  const thirdPage = document.getElementById("thirdPage");
  const fourth = document.getElementById("fourthPage3");
 

  // document.getElementById("thirdPage").classList.add("hidden");
  thirdPage.style.transform = "scale(0)";
  thirdPage.style.display = "none";
  thirdPage.remove("active");
  fourth.classList.add("active");
  // fourth.style.backgroundColor="blue";

    // fourth.style.backgroundColor="blue";
    // fourth.remove("hidden");



}
 
  