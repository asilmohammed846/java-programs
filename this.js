console.log("For Loop:");
for (let i = 1; i <= 5; i++) {
console.log(`Iteration ${i}`);
}
// Step 2: While Loop
console.log("\nWhile Loop:");
let counter = 1;
while (counter <= 5) {
console.log(`Iteration ${counter}`);
counter++;
}

console.log("\nDo-While Loop:");
let number = 1;
do {
console.log(`Iteration ${number}`);
number++;
} while (number <= 5);
// Step 4: For-In Loop
console.log("\nFor-In Loop:");
const person = { name: "Alice", age: 25, city: "New York" };

for (let key in person) {
    console.log(`${key}: ${person[key]}`);
    }
    // Step 5: For-Of Loop
    console.log("\nFor-Of Loop:");
    const numbers = [10, 20, 30, 40, 50];
    for (let num of numbers) {
    console.log(num);
    }