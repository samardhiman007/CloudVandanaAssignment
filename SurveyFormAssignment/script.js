function submitForm(event) {
    event.preventDefault();

    // Get form values
    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const dob = document.getElementById('dob').value;
    const country = document.getElementById('country').value;
    const genderMale = document.getElementById('genderMale').checked;
    const genderFemale = document.getElementById('genderFemale').checked;
    const profession = document.getElementById('profession').value;
    const email = document.getElementById('email').value;
    const mobileNumber = document.getElementById('mobileNumber').value;

    // Validate required fields
    if (!firstName || !lastName || !dob || !country || (!genderMale && !genderFemale) || !profession || !email || !mobileNumber) {
        alert('Please fill out all the required fields.');
        return;
    }

    // Check for gender
    const gender = genderMale && genderFemale ? 'Male, Female' : (genderMale ? 'Male' : 'Female');

    // Display popup with form values
    const popupContent = `
        <strong>First Name:</strong> ${firstName}<br>
        <strong>Last Name:</strong> ${lastName}<br>
        <strong>Date of Birth:</strong> ${dob}<br>
        <strong>Country:</strong> ${country}<br>
        <strong>Gender:</strong> ${gender}<br>
        <strong>Profession:</strong> ${profession}<br>
        <strong>Email:</strong> ${email}<br>
        <strong>Mobile Number:</strong> ${mobileNumber}<br>
    `;

    document.getElementById('popupContent').innerHTML = popupContent;
    document.getElementById('popup').style.display = 'block';

    // Reset the form
    document.getElementById('surveyForm').reset();
}

function resetForm() {
    document.getElementById('surveyForm').reset();
}

function closePopup() {
    document.getElementById('popup').style.display = 'none';
}
