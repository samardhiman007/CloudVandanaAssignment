let display = document.getElementById('display');
let currentInput = '';

function appendInput(value) {
    currentInput += value;
    display.value = currentInput;
}

function calculateResult() {
    try {
        currentInput = eval(currentInput);
        display.value = currentInput;
    } catch (error) {
        display.value = 'Error';
    }
}

function clearDisplay() {
    currentInput = '';
    display.value = '';
}
