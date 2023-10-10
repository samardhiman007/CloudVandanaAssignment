function sortDescending(arr) {
  return arr.sort(function(a, b) {
    return b - a;
  });
}

const numbers = [1,5,79,0,9];
const sortedDescending = sortDescending(numbers);

console.log("Original array:", numbers);
console.log("Sorted in descending order:", sortedDescending);
