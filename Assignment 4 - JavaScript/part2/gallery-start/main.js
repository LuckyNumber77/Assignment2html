/*
 * Name : Darren Billy
 * Code Name: Main.js
 * Date: 2024-03-25
 * Description: This is the code for the pictures to be able to flip through the image
 * wheel and display darken overtop of them.
*/

const displayedImage = document.querySelector('.displayed-img');
const thumbBar = document.querySelector('.thumb-bar');
const btn = document.querySelector('button');
const overlay = document.querySelector('.overlay');

/* Declaring the array of image filenames */
const filepaths = [
    "images/pic1.jpg",
    "images/pic2.jpg",
    "images/pic3.jpg",
    "images/pic4.jpg",
    "images/pic5.jpg"
];

/* Declaring the alternative text for each image file */
const altTexts = [
    "Image 1",
    "Image 2",
    "Image 3",
    "Image 4",
    "Image 5"
];

/* Looping through images */
filepaths.forEach((filepath, index) => {
    const newImage = document.createElement('img');
    newImage.setAttribute('src', filepath);
    newImage.setAttribute('alt', altTexts[index]); // Set alt text from altTexts array
    thumbBar.appendChild(newImage);

    // Add click event listener to each newImage
    newImage.addEventListener('click', function() {
        displayedImage.setAttribute('src', this.getAttribute('src'));
        displayedImage.setAttribute('alt', this.getAttribute('alt'));
    });
});

/* Wiring up the Darken/Lighten button */
let isDark = false;

btn.addEventListener('click', function() {
    if (isDark) {
        // Change to lighten state
        btn.setAttribute("class", "light");
        btn.textContent = "Lighten";
        overlay.style.backgroundColor = "rgb(0 0 0 / 0%)";
    } else {
        // Change to darken state
        btn.setAttribute("class", "dark");
        btn.textContent = "Darken";
        overlay.style.backgroundColor = "rgb(0 0 0 / 50%)";
    }
    
    // Toggle the state
    isDark = !isDark;
});