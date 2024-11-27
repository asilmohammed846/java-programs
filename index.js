// Step 1: Declare and initialize variables
let a = 10;
let b = 5;
let c = "10";
// Step 2: Arithmetic Operators
console.log("Arithmetic Operators:");
console.log(`a + b = ${a + b}`);
console.log(`a - b = ${a - b}`);
console.log(`a * b = ${a * b}`);
console.log(`a / b = ${a / b}`);
console.log(`a % b = ${a % b}`);
console.log(`a ** b = ${a ** b}`);
// Step 3: Assignment Operators
console.log("\nAssignment Operators:");
a += b; // Equivalent to a = a + b
console.log(`a += b -> a = ${a}`);
a -= b; // Equivalent to a = a - b
console.log(`a -= b -> a = ${a}`);
a *= b; // Equivalent to a = a * b
console.log(`a *= b -> a = ${a}`);
a /= b; // Equivalent to a = a / b
console.log(`a /= b -> a = ${a}`);

// Step 4: Comparison Operators
console.log("\nComparison Operators:");
console.log(`a == c -> ${a == c}`); // Value equality
console.log(`a === c -> ${a === c}`); // Value and type equality
console.log(`a != b -> ${a != b}`);
console.log(`a !== c -> ${a !== c}`);
console.log(`a > b -> ${a > b}`);
console.log(`a < b -> ${a < b}`);
// Step 5: Logical Operators
console.log("\nLogical Operators:");
console.log(`a > 5 && b < 10 -> ${a > 5 && b < 10}`);
console.log(`a > 10 || b < 10 -> ${a > 10 || b < 10}`);
console.log(`!(a > b) -> ${!(a > b)}`);
// Step 6: Bitwise Operators
console.log("\nBitwise Operators:");
console.log(`a & b -> ${a & b}`); // AND
console.log(`a | b -> ${a | b}`); // OR
console.log(`a ^ b -> ${a ^ b}`); // XOR
console.log(`~a -> ${~a}`); // NOT
console.log(`a << 1 -> ${a << 1}`); // Left shift
console.log(`a >> 1 -> ${a >> 1}`); // Right shif