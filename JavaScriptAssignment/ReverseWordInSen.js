function reverseWords(sentence) {
  // Split the sentence into an array of words
  const words = sentence.split(' ');

  // Reverse each word
  const reversedWords = words.map(word => {
    return word.split('').reverse().join('');
  });

  // Join the reversed words to form the final reversed sentence
  const reversedSentence = reversedWords.join(' ');

  return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);

console.log(reversedSentence); // Output: "sihT si a ynnus yad"
