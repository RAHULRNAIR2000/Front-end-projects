function transitionToSecondPage() {
    const firstPage = document.getElementsByClassName("firstPage");
    const secondPage = document.getElementsByClassName("page2");

    // Scale up the first page and hide it
    firstPage.style.transform = "scale(0)";
    firstPage.style.display = "none";

    // Scale up the second page
    page2.classList.add("active");
  }