let timerInterval;


// Fetch team names from "s.txt"
fetch("s.txt")
    .then((response) => response.text())
    .then((data) => {
        teamNames = data.split("\n");
        if (teamNames.length >= 2) {
            name1.textContent = `${teamNames[0]} `;
            name2.textContent = `${teamNames[1]} `;
        }
    })
    .catch((error) => console.error("Error fetching team names: ", error))


function increaseScore(teamId) {
    const scoreElement = document.getElementById(teamId).querySelector(".score");
    const currentScore = parseInt(scoreElement.innerText);
    scoreElement.innerText = currentScore + 1;
}

function startTimer() {
    let timer = 10;
    const timerElement = document.getElementById("timer");
    const startButton = document.getElementById("startButton");
    startButton.disabled = true; // Disable the button

    timerInterval = setInterval(function () {
        timerElement.innerText = timer;
        timer--;
        if (timer < 0) {
            clearInterval(timerInterval);
            declareWinner();
        }
    }, 1000);
}

function declareWinner() {
    const scoreA = parseInt(document.getElementById("teamA").querySelector(".score").innerText);
    const scoreB = parseInt(document.getElementById("teamB").querySelector(".score").innerText);
    const winnerElement = document.getElementById("winner");
    const increaseButtons = document.querySelectorAll(".team button");

    if (scoreA > scoreB) {
        winnerElement.innerText = teamNames[0]  + ' wins';
    } else if (scoreB > scoreA) {
        winnerElement.innerText = teamNames[1]  + ' wins';;
    } else {
        winnerElement.innerText = "It's a tie!";
    }

    winnerElement.style.display = "block";

    // Hide the "Increase Score" buttons
    increaseButtons.forEach(button => {
        button.style.display = "none";
    });
}

function resetGame() {
    clearInterval(timerInterval);
    document.getElementById("timer").innerText = "10";
    document.getElementById("teamA").querySelector(".score").innerText = "0";
    document.getElementById("teamB").querySelector(".score").innerText = "0";
    document.getElementById("winner").style.display = "none";

    // Show the "Increase Score" buttons
    const increaseButtons = document.querySelectorAll(".team button");
    increaseButtons.forEach(button => {
        button.style.display = "block";
    });

    // Enable the "Start Timer" button
    document.getElementById("startButton").disabled = false;
}